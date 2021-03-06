/*  612. 平面上的最近距离
    表 point_2d 保存了所有点（多于 2 个点）的坐标 (x,y) ，这些点在平面上两两不重合。
    写一个查询语句找到两点之间的最近距离，保留 2 位小数。
    | x  | y  |
    |----|----|
    | -1 | -1 |
    | 0  | 0  |
    | -1 | -2 |

    最近距离在点 (-1,-1) 和(-1,2) 之间，距离为 1.00 。所以输出应该为：
    | shortest |
    |----------|
    | 1.00     |
    注意：任意点之间的最远距离小于 10000 。
*/

-- 2.1、解法一：
select round(sqrt(pow(p1.x-p2.x,2)+pow(p1.y-p2.y,2)),2) shortest
from point_2d P1,point_2d P2
where (p1.x!=p2.x || p1.y!=p2.y)
order by shortest limit 1
