# 날씨 일기 프로젝트

---

## 주제
> 원하는 날짜의 날씨를 API 를 이용하여 가져오고 해당 날짜에 일기를 자유롭게 작성할 수 있는 프로젝트 입니다.

#### 링크 : https://openweathermap.org/

---

## 배운점
> api 를 이용하여 json 데이터를 다루는 법을 배우게 되었고 기존에 학습하였던 CRUD 에 대해 복습할 수 있는 시간이였습니다.
> 또한 @Scheduler , 트랜잭션,  기본적인 테스트코드에 대해 더 자세히 할 수 있었고 Exception Handler 에 대해 더 자세히 학습할 수 있는 시간이였습니다.

---

## 기술스택
* java
* springBoot
* jpa
* mysql
* swagger


---

## API

|domain|Method|설명|
|:---:|:---:|:---:|
|create/diary|POST|날씨일기 데이터 저장|
|read/diary|GET|선택한 날짜 모든 일기데이터 조회|
|read/diaries|GET|선택한 기간 중 모든 일기데이터 조회|
|update/diary|PUT|일기데이터 수정|
|delete/diary|DELETE|일기데이터 삭제|
