/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e0578..0x9e073c (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e0578_0 {
    struct st_9e0578_1 *field_0;
    unsigned long long field_8;
} st_9e0578_0;

typedef struct st_9e0578_1 {
    unsigned long long field_0;
} st_9e0578_1;


int sub_9e0578(st_9e0578_0 *a0, unsigned long long a1, unsigned long long *a2, unsigned int a3, unsigned int a4)
{
    unsigned long long *iter;  // x20
    unsigned long long v3;  // x0
    unsigned long v12;  // x10
    unsigned long v13;  // x13
    unsigned long v14;  // x14
    unsigned long long v15;  // x11
    unsigned long long *node;  // x16
    unsigned long long *iter1;  // x1
    unsigned long long *iter2;  // x2
    unsigned long long idx;  // x4
    unsigned long long v20;  // x3
    unsigned long long k;  // x11
    unsigned long long idx1;  // x8
    unsigned long long idx2;  // x14
    unsigned long long v7;  // x13
    unsigned long long index;  // x8
    char v9;  // x16
    unsigned long long l;  // x9
    unsigned int v11;  // w15
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = a2;
    v3 = sub_9e4cdc();
    if (v3)
    {
        k = 1 << ((char)a4 & 31);
        if (3 >= (int)a4)
        {
            if (a1 >= 1)
            {
                idx1 = 0;
                do
                {
                    idx2 = 0;
                    v7 = 0;
                    do
                    {
                        v7 |= ((long long)((((unsigned int)idx2 ^ a3) - 1 & ~a3) * 0x100000000) >> 63 & 0xfffffffffffffffe | __ROL__(((unsigned int)idx2 ^ a3) - 1 & ~a3, 33) & 0xfffffffe00000001 & 1) & iter[idx2];
                        idx2 += 1;
                    } while (k != idx2);
                    *(unsigned long long *)&a0->field_0[idx1] = v7;
                    idx1 += 1;
                    iter = (char *)iter + ((k * 8 | k >> 61) & 0x7fffffff8 & 0x7ffffffff);
                } while (idx1 != a1);
            }
        }
        else
        {
            if (a1 >= 1)
            {
                index = 0;
                v9 = a4 - 2;
                l = 1 << (v9 & 31);
                v11 = (int)(a3) >> (v9 & 31);
                v12 = (v11 ^ 3) - 1 & ~v11;
                v13 = (v11 ^ 2) - 1 & ~v11;
                v14 = (v11 ^ 1) - 1 & ~v11;
                v15 = (k * 8 | k >> 61) & 0x7fffffff8 & 0x7ffffffff;
                node = &iter[3 << (v9 & 31)];
                iter1 = &iter[2 << (v9 & 31)];
                iter2 = &iter[l & 0xffffffff];
                do
                {
                    idx = 0;
                    v20 = 0;
                    do
                    {
                        v20 |= (((long long)(v14 * 0x100000000) >> 63 & 0xfffffffffffffffe | __ROL__(v14, 33) & 0xfffffffe00000001 & 1) & iter2[idx] | ((long long)((v11 - 1 & ~v11) * 0x100000000) >> 63 & 0xfffffffffffffffe | __ROL__(v11 - 1 & ~v11, 33) & 0xfffffffe00000001 & 1) & iter[idx] | ((long long)(v13 * 0x100000000) >> 63 & 0xfffffffffffffffe | __ROL__(v13, 33) & 0xfffffffe00000001 & 1) & iter1[idx] | ((long long)(v12 * 0x100000000) >> 63 & 0xfffffffffffffffe | __ROL__(v12, 33) & 0xfffffffe00000001 & 1) & node[idx]) & ((long long)((((unsigned int)l - 1 & a3 ^ (unsigned int)idx) - 1 & ~((unsigned int)l - 1 & a3)) * 0x100000000) >> 63 & 0xfffffffffffffffe | __ROL__(((unsigned int)l - 1 & a3 ^ (unsigned int)idx) - 1 & ~((unsigned int)l - 1 & a3), 33) & 0xfffffffe00000001 & 1);
                        idx += 1;
                    } while (l != idx);
                    *(unsigned long long *)&a0->field_0[index] = v20;
                    index += 1;
                    node = (char *)node + v15;
                    iter1 = (char *)iter1 + v15;
                    iter2 = (char *)iter2 + v15;
                    iter = (char *)iter + v15;
                } while (index != a1);
            }
        }
        *(unsigned int *)&a0->field_8 = a1;
        v3 = 1;
    }
    return v3;
}
