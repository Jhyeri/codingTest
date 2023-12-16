-- 코드를 입력하세요
-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛

-- 7월 총 주문량 조회
-- 상반기 총 주문량 조회
-- 둘의 합계가 큰 순서대로 맛 3개 정렬
SELECT FLAVOR
FROM (
SELECT ROW_NUMBER() OVER(ORDER BY TOTAL DESC) AS RNUM, T.*
FROM (
    SELECT DISTINCT F.FLAVOR, SUM(F.TOTAL_ORDER) AS TOTAL
    FROM FIRST_HALF F
    INNER JOIN JULY J ON J.FLAVOR = F.FLAVOR
    GROUP BY F.FLAVOR
    ) T
) TT
WHERE RNUM <=3