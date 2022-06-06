# kotlin-racingcar

## 문자열 계산기 구현

### 기능 목록

- [x] 사칙연산이 가능해야 함
  - [x] 더하기
  - [x] 빼기
  - [x] 곱하기
  - [x] 나누기

- [x] 잘못된 입력에 대한 방어
  - [x] 입력 값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException 발생 
  - [x] 사칙연산 기호가 아닌 경우 IllegalArgumentException 발생

- [x] 빈 공백 문자열로 숫자와 연산자를 구분해야 함

- [x] 구분된 숫자와 연산자에 따라 계산을 진행해야함
  - [x] 숫자가 2번 연속으로 오는 경우 예외 발생
  - [x] 문자가 2번 연속으로 오는 경우 예외 발생
  - [x] 나눗셈 연산자 이후에 0이 오는 경우 예외 발생


## 자동차 경주 게임 구혀 

### 기능 목록

- [x] 경주를 진행할 자동차의 이름을 받아야 함
  - [x] 최소 2대 이상의 자동차가 있을 때만 경주 진행 가능
  - [ ] 각 자동차 이름은 5자를 초과할 수 없다.
  - [ ] 자동차 이름은 중복될 수 없다.
  - [ ] 자동차 이름은 쉼표(,)로 구분된다.
- [x] 경주를 진행할 횟수를 입력 받아야 함
  - [x] 숫자만 가능
  - [x] 음수인 경우 불가능
- [x] 자동차는 특정 규칙에 의해 전진할 수 있어야 함
  - [x] 0부터 9까지의 랜덤 숫자 중 4이상인 경우 전진함
- [ ] 자동차 경주의 결과를 알 수 있어야 함.
  - [ ] 누가 우승했는지를 알 수 있다.
  - [ ] 우승자는 1명 이상일 수 있다.