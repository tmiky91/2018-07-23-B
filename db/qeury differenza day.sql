select ss1.id as id1, ss2.id as id2, datediff(s1.datetime, s2.datetime) as diff
from sighting as s1, sighting as s2, state as ss1, state as ss2
where s1.id!=s2.id
and ss1.id=s1.state
and ss2.id=s2.state
and ss1.id!=ss2.id
and year(s1.datetime)=year(s2.datetime)
and year(s1.datetime)=2000
and datediff(s1.datetime, s2.datetime)<=100
and ss1.id > ss2.id
group by id1, id2