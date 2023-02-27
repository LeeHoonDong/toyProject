# toyProject
About Spring

## 비즈니스 요구사항
### · 회원
#### 1. 회원을 가입하고 조회할 수 있다
#### 2. 회원의 등급은 Family, Business, Vip 총 3가지 등급이 있다.
#### 3. 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다.(미확정)
### · 주문과 할인 정책
#### 1. 회원은 상품을 주문할 수 있다.
#### 2. 회원 등급에 따라 할인 정책을 적용할 수 있다.
> #### [할인정책은 다음과 같다] (추후 변경 가능)
>   > #### 2-1. Family는 1000원을 할인해주는 고정 금액 할인을 적용한다.
>   > #### 2-2. Business는 2000원을 할인해주는 고정 금액 할인을 적용한다.
>   > #### 2-3. Vip는 3000원 할인해 는 고정금액 할인을 적용한다.
<br>

### ※등급과 할인 정책은 변경 가능성이 높다. 최악의 경우 할인을 적용하지 않고 쿠폰제도를 도입할 수 있다. -> Interface를 만들고 구현체를 언제든지 갈아끼울 수 있도록 설계!
----------------------------------------------------------------------------------
('23.02.22)
### [회원 도메인 설계]
![image](https://user-images.githubusercontent.com/51987233/220662559-47172227-c67c-4869-ae7c-ef402190ef4a.png)

### [회원 클래스 다이어그램 설계]
![image](https://user-images.githubusercontent.com/51987233/220662671-b3832cc6-b13b-463c-a710-e50b3a435d9a.png)
----------------------------------------------------------------------------------
('23.02.27)
### ※문제점
![image](https://user-images.githubusercontent.com/51987233/221590967-a39effc0-cf77-45c6-b5ed-e93f085f20da.png)
#### 현재 MemberServiceImpl이 Interface인 MemberRepository 와 구현체인 MemoryMemberRepository를 의존하고 있음 -> DIP(추상화에 의존해야지 구체화에 의존하면 안됨) 위반
