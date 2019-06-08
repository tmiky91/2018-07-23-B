select s.id as id, count(*) as peso
from sighting as sig, state as s
where sig.state=s.id
and year(sig.datetime)=2000
group by id