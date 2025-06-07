# Board BackEnd

* Springboot 3.0 이상
1. Java 17 이상 사용 가능
2. javax.* -> jakarta.*
3. application.properties / application.yaml (use-lagacy-processing)
4. AntPathMatcher -> PathPatternParser
5. 외부 라이브러리 사용 시 Jakarta, Spring Framework 6.0 버전 지원 여부

## Error code
1. 200
- 성공 : "SU" / "Success."
2. 400
- 유효성 검증 실패 : "VF" / "Validation failed."
- 중복된 이메일 : "DE" / "Duplicate email."
- 중복된 전화번호 : "DT" / "Duplicate tel number."
- 중복된 닉네임 : "DN" / "Duplicate nickname."
- 존재하지 않는 유저 : "NU" / "This user does not exist."
- 존재하지 않는 게시물 : "NB" / "This board does not exist."
3. 401
- 로그인 실패 : "SF" / "Login information mismatch."
- 인증 실패 : "AF" / "Authorization Failed."
4. 403
- 권한 없음 : "NP" / "Do not have permission."
5. 500
- 데이터베이스 에러 : "DBE" / "Database error."

### 명세서
- [API명세서](https://www.notion.so/Board-Rest-API-1aa867062acc80478b0dc8a9d4c10810?pvs=4)

- [디자인](https://www.figma.com/design/MrSRMXiws59G33s8Wpo8Ni/Hoons-board?node-id=0-1&p=f)