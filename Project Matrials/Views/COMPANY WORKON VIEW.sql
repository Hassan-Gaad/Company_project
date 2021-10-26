CREATE VIEW WORKON_DATA
AS
SELECT workon.EMPNO AS 'EPLOYEE_NO',
EMPNAME AS 'EMPLOYEE_NAME',
workon.PROJECTNO AS 'PROJECT_NO',
PROJECTNAME AS 'PROJECT_NAME'
FROM workon,employee,project
WHERE 
workon.EMPNO=employee.EMPNO AND 
workon.PROJECTNO=project.PROJECTNO;