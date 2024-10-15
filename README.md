# 문자열 덧셈 계산기
### 구현할 기능 목록
- 문자열 입력
    - "$숫자$구분자$숫자" 형식
      
- 계산 기능
    - 구분자를 기준으로 각 숫자의 합 반환
    
- 구분자 추가 기능
    - 기본 구분자는 쉼표(,) 와 콜론(:)
    - 문자열이 “//” 와 “\n” 를 포함한 경우 구분자 리스트에 커스텀 구분자 추가 (여러개 가능)
    
- 예외 처리
    - 0보다 작은 숫자가 입력된 경우
    - 구분자가 연속으로 포함된 경우
    - 숫자 외의 문자로 시작하거나 끝나는 경우
    - 구분자 리스트에 없는 구분자를 포함한 경우
    - “//” 와 “\n” 외의 문자를 포함한 경우
    - “//” 를 포함했지만 “\n”을 포함하지 않은 경우
