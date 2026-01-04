# Write your MySQL query statement below
select today.id from weather as yesterday cross join weather today
where datediff(today.recordDate,yesterday.recordDate) = 1
    and today.temperature>yesterday.temperature