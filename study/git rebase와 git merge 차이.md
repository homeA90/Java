# git rebase와 git merge 차이점
- git rebase와 git merge는 모두 브랜치를 통합하는 방법


## git merge
- git merge는 두 브랜치를 병합하여 하나의 커밋을 생성하는 방법
- 기본적으로 두 브랜치의 작업을 하나로 합치는 작업을 수행하며, 병합 커밋이 생성 됨
 
## git merge 사용
1. master 브랜치와 feature 브랜치가 있다고 가정한다.
2. master 브랜치에서 작업 중이고, feature 브랜치에서 새로운 기능을 개발한 후 feature 브랜치를 master에 병합하려고 한다.
   
   ```bash
	# main 브랜치에서 작업
	git checkout main

	feature 브랜치를 main 브랜치에 병합
	git merge featu
   ```
- 동작 방식
1. git merge 명령을 실행하면, master와 feature 브랜치의 변경 사항을 자동으로 병합한다.
2. 병합 커밋이 새로 생성되어, 두 브랜치의 변경 사항을 하나로 합친 커밋이 생성된다.
3. 만약 두 브랜치에서 동일한 파일을 수정했다면, 병합 충돌이 발생할 수 있습니다. 충돌을 해결하고 커밋을 완료해야 한다.

- 병합 커밋 예시:
```bash
A---B---C---D (master)
         \
          E---F (feature)

위와 같은 상태에서 git merge feature를 실행하면, 병합 커밋 G가 생성됩니다.
```

```
A---B---C---D---G (master)
         \     /
          E---F (feature)
```

## git rebase





#
