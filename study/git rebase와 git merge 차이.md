# git rebase와 git merge 차이점
- git rebase와 git merge는 모두 브랜치를 통합하는 방법


## git merge
- git merge는 두 브랜치를 병합하여 하나의 커밋을 생성하는 방법
- 기본적으로 두 브랜치의 작업을 하나로 합치는 작업을 수행하며, 병합 커밋이 생성 됨
 
## git merge 사용
- main 브랜치와 feature 브랜치가 있다고 가정한다.
- main 브랜치에서 작업 중이고, feature 브랜치에서 새로운 기능을 개발한 후 feature 브랜치를 main 병합하려고 한다.
   
   ```bash
	# main 브랜치에서 작업
	git checkout main

	feature 브랜치를 main 브랜치에 병합
	git merge featu
   ```
- 동작 방식
1. git merge 명령을 실행하면, main와 feature 브랜치의 변경 사항을 자동으로 병합한다.
2. 병합 커밋이 새로 생성되어, 두 브랜치의 변경 사항을 하나로 합친 커밋이 생성된다.
3. 만약 두 브랜치에서 동일한 파일을 수정했다면, 병합 충돌이 발생할 수 있습니다. 충돌을 해결하고 커밋을 완료해야 한다.

- 병합 커밋 예시1:
```bash
A---B---C---D (main)
         \
          E---F (feature)

위와 같은 상태에서 git merge feature를 실행하면, 병합 커밋 G가 생성된다.
```

```
A---B---C---D---G (main)
         \     /
          E---F (feature)
```


- 병합 커밋 예시2:
```bash
A---B---C---D (main)
         \
          E (feature)
```
위와 같은 상태에서 main의 내용 feature에 병합
git merge main를 실행하면 병합 커밋 F가 생성 된다.
```bash
A---B---C---D (main)
         \     \
          E---F (feature)
```


- 병합 커밋 예시3:
```bash
A---B---C---D (main)
         \
          E---F (feature)
```
위와 같은 상태에서 main의 내용 feature에 병합
git merge main를 실행하면 병합 커밋 G가 생성 된다.
```bash
A---B---C---D (main)
         \     \
          E---F---G (feature)
```



## git rebase
- git rebase는 **한 브랜치의 커밋을 다른 브랜치 위로 "다시 적용"**하는 방법이다.
- 즉, git rebase는 커밋들의 히스토리를 "재작성"하는 방식이다. 
- 병합 커밋을 만들지 않고, 해당 브랜치의 커밋들이 다른 브랜치 위로 새로 쌓이는 방식이다.
- merge와는 다르게 내 코드를 내보내는 개념
- 예를들어 feature내용을 main에 merge를 한다면 main에서 feature 내용을 가지고 오지만, rebase는 feature에서 main쪽으로 내용을 보낸다.
 
### git rebase 사용
- main 브랜치에서 작업 중이고, feature 브랜치에서 새로운 기능을 개발한 후 feature 브랜치를 main 브랜치 위로 "다시 적용"하려고 한다.
   ```bash
	# feature 브랜치에서 작업
	git checkout feature
	
	# feature 브랜치를 main 브랜치 위로 rebase
	git rebase main
   ```
- 동작 방식
	1. git rebase 명령은 feature 브랜치의 커밋을 main 브랜치의 최신 커밋 위로 재적용한다.
	2. feature 브랜치의 커밋들이 main 브랜치 위로 차례대로 쌓인다. 이 과정에서 병합 커밋은 생성되지 않으며, 깔끔한 히스토리를 유지할 수 있습니다
	3. 만약 충돌이 발생하면, 충돌을 해결한 후 git rebase --continue로 이어서 진행할 수 있다.

- 리베이스 예시:
```bash
A---B---C---D (main)
         \
          E---F (feature)
```
git rebase main를 실행하면 feature 브랜치의 커밋 E, F가 main 브랜치의 최신 커밋 D 위로 이동한다.
```
A---B---C---D---E'---F' (feature)
```
E'와 F'는 새로운 커밋이다다. 즉, 기존의 E, F 커밋은 히스토리에서 삭제되고 새로운 커밋으로 대체된다.

추가사항
rebase는 히스토리를 직선형으로 만들기 위한 용도로 주로 사용하므로 feature에서 main으로 rebase는 사용하지 않는다.


#
