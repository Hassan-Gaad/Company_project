CREATE VIEW EMPLOYEE_PHONES_DATA
AS
SELECT employee_phones.EMPNO AS 'EMPLOYEE_NO',
EMPNAME AS 'EMPLOYEE_NAME',
PHONE FROM employee_phones,employee
WHERE employee_phones.EMPNO=employee.EMPNO;