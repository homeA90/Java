# git fetch와 git pull 차이점
- git fetch와 git pull은 모두 원격 저장소에서 변경된 내용을 로컬 저장소로 가져오는 명령어


## git fetch
git fetch는 원격 저장소의 변경 사항을 로컬로 가져오는 명령어 
하지만 이 명령어는 로컬 브랜치에 바로 적용되지 않고, 원격 브랜치의 변경 사항만 로컬 저장소에 업데이트 함 
즉, 원격 저장소의 데이터를 가져오지만, 그 데이터를 로컬에서 직접 작업 중인 브랜치에는 자동으로 병합하지 않음
   ```bash
   git fetch origin main
   ```



## git pull
git pull은 git fetch + git merge  
즉, 원격 저장소의 변경 사항을 가져오고, 가져온 내용을 로컬 브랜치에 자동으로 병합 함
   ```bash
   git pull
   ```




#
