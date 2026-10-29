/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e227c..0x9e253c (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e227c_1 {
    long long field_0;
    unsigned int field_8;
} st_9e227c_1;

typedef struct st_9e227c_0 {
    unsigned long long *field_0;
    unsigned int field_8;
} st_9e227c_0;

extern char g_10002b0;

unsigned long long sub_9e227c(long long a0, st_9e227c_0 *a1, st_9e227c_0 *a2, long long a3, long long a4)
{
    long long v14;  // x21
    unsigned long long v15;  // x0
    unsigned long long v24;  // x24
    unsigned long long v25;  // x28
    unsigned long v26;  // x25
    unsigned long long *v27;  // x20
    unsigned long long *iter;  // x22
    unsigned long long v29;  // x26
    unsigned long long *v30;  // x20
    unsigned long long v31;  // x10
    unsigned long v32;  // x13
    unsigned long v33;  // x11
    st_9e227c_1 *v16;  // x23
    unsigned long long v34;  // x0
    unsigned int v17;  // w19
    unsigned int v18;  // w20
    unsigned int v19;  // w25
    unsigned long long v20;  // x9
    unsigned long long v21;  // x10
    unsigned long long i;  // x19
    unsigned long long idx;  // x8
    st_9e227c_1 *v0;  // [bp-0xc8]
    unsigned long long v1;  // [bp-0xb8]
    unsigned long long *v2;  // [bp-0xb0]
    unsigned long long index;  // [bp-0xa8]
    unsigned long long v4;  // [bp-0xa0]
    char v5;  // [bp-0x98], Other Possible Types: unsigned long
    char v6;  // [bp-0x90], Other Possible Types: unsigned long
    unsigned long v7;  // [bp-0x88]
    unsigned long long v8;  // [bp-0x80]
    unsigned long long v9;  // [bp-0x78]
    unsigned long v10;  // [bp-0x70]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a4;
    v11 = *(long long *)&g_10002b0;
    if (a1 != a2)
    {
        sub_9de064(v14);
        v15 = sub_9de208(v14);
        if (v15 && !(v16 = v15, v17 = a1->field_8, v18 = a2->field_8, v19 = v17 + v18 + 4, !sub_9e4cdc()))
        {
            v16->field_8 = v19;
            if ((int)v19 >= 1)
                _bzero(v16->field_0, (((v17 + v18 + 3) * 8 | v17 + v18 + 3 >> 61) & 0x7fffffff8 & 0x7ffffffff) + 8);
            v0 = v16;
            v20 = a2->field_8;
            if ((int)v20 >= 1)
            {
                v21 = 0;
                v1 = v20;
                v2 = a2->field_0;
                i = a1->field_8;
                v4 = 16;
                do
                {
                    idx = v21 | 1;
                    index = v21;
                    if (idx == v20)
                    {
                        v24 = 0;
                        if (1 > (int)i)
                            continue;
                    }
                    else
                    {
                        v24 = v2[idx];
                        if ((int)i < 1)
                            continue;
                    }
                    v25 = 0;
                    v26 = v2[index];
                    v27 = a1->field_0 + 1;
                    iter = v0->field_0 + v4;
                    do
                    {
                        if ((i & 0xffffffff) - 1 != v25)
                            v29 = *v27;
                        else
                            v29 = 0;
                        v30 = v27 + 2;
                        sub_9e3e34(&v10, &v9, v29, v24);
                        sub_9e3e34(&v8, &v7, *(long long *)((char *)v27 - 8), v26);
                        sub_9e3e34(&v6, &v5, v29 ^ *(long long *)((char *)v27 - 8), v24 ^ v26);
                        v31 = v8 ^ v9;
                        v32 = *(long long *)((char *)iter - 8);
                        v8 = v7 ^ v5 ^ v31;
                        v9 = v6 ^ v10 ^ v31;
                        *(unsigned long *)((char *)iter - 16) = *(long long *)((char *)iter - 16) ^ v7;
                        *(unsigned long long *)((char *)iter - 8) = v32 ^ v8;
                        v33 = iter[1];
                        *iter = *iter ^ v9;
                        iter[1] = v33 ^ v10;
                        iter += 2;
                        v25 += 2;
                        v27 = v30;
                    } while ((long long)i > (long long)v25);
                } while ((v21 = index + 2, v4 += 16, v20 = v1, v20 > v21));
            }
            sub_9e5708(v0);
            v34 = sub_9e1d7c(a0, v0, a3);
        }
        else
        {
            v34 = 0;
        }
        sub_9de17c(v14);
        if (*(long long *)&g_10002b0 == v11)
            return v34;
    }
    ___stack_chk_fail();
}
