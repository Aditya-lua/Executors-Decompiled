/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfd9c4..0xbfdb7c (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfd9c4_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bfd9c4_0;


double sub_bfd9c4(st_bfd9c4_0 *a0, void* a1)
{
    unsigned long long iter;  // x23
    unsigned long long *v5;  // x20
    unsigned long long v14;  // x8
    unsigned long long v15;  // x22
    unsigned long long ptr;  // x0
    unsigned long v17;  // x8
    unsigned long v18;  // x9
    unsigned int i;  // w25
    unsigned long long v20;  // x22
    long long v21;  // x21
    unsigned long long v22;  // 4106
    unsigned long long v23;  // x22
    unsigned int v6;  // w8
    long long v24;  // x0
    long long v25;  // x0
    unsigned int v7;  // w9
    unsigned long long v8;  // x24
    unsigned long v9;  // x8
    unsigned long v10;  // x9
    unsigned long long v11;  // x23
    unsigned long v12;  // x8
    unsigned long v13;  // x9
    uint128_t v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((char)a1[8] == 1)
    {
        iter = 0;
        v5 = 8;
        v0 = CONCAT(8, 0);
        v1 = 0;
        v6 = (char)a1[10];
        v7 = (short)a1[8];
        v8 = (v7 & 0xffff | __ROL__(v6, 16) & 0xff0000) & 0xffffff;
        if (!(v8 & 1))
            goto LABEL_bfdaa0;
    }
    else
    {
        v9 = (char)a1[9];
        v10 = (char)a1[10];
        if ((unsigned int)v9 > (unsigned int)v10)
        {
            v11 = 0;
            v5 = 8;
            v0 = CONCAT(8, 0);
            v1 = 0;
            v12 = (char)a1[9];
            v13 = (char)a1[10];
            v14 = v13 - v12;
            if ((unsigned int)v12 <= (unsigned int)v13)
                goto LABEL_bfda80;
LABEL_bfda88:
            iter = 0;
            v6 = (char)a1[10];
            v7 = (short)a1[8];
            v8 = (v7 & 0xffff | __ROL__(v6, 16) & 0xff0000) & 0xffffff;
            if (!(v8 & 1))
                goto LABEL_bfdaa0;
        }
        else
        {
            v11 = v10 - v9 + 1;
            v15 = v11 * 8;
            ptr = _malloc(v15);
            if (!ptr)
            {
                v24 = sub_c6b970(8, v15);
                sub_b661ac(&v0);
                v25 = __Unwind_Resume(v24);
                sub_c73e0c(v25);
            }
            v5 = ptr;
            v0 = CONCAT(ptr, v11);
            v1 = 0;
            v17 = (char)a1[9];
            v18 = (char)a1[10];
            v14 = v18 - v17;
            if ((unsigned int)v18 < (unsigned int)v17)
                goto LABEL_bfda88;
LABEL_bfda80:
            if (v11 > v14)
                goto LABEL_bfda88;
            sub_c6c0cc(&v0, 0, v14 + 1, 8, 8);
            v5 = *(unsigned long long *)((void*)&v0 + 8);
            iter = v1;
            v6 = (char)a1[10];
            v7 = (short)a1[8];
            v8 = (v7 & 0xffff | __ROL__(v6, 16) & 0xff0000) & 0xffffff;
            if (!(v8 & 1))
            {
LABEL_bfdaa0:
                i = v7 >> 8;
                v20 = v6 & 0xffff;
                if ((unsigned int)v20 >= i)
                {
                    v21 = *(long long *)a1;
                    v22 = arm64g_calculate_condition(35, i, v20 & 0xffffffff, 0);
                    if (!(v22 & 1))
                    {
                        do
                        {
                            v23 = v20 - 1;
                            v5[iter] = sub_bfa154(v21, v20);
                            iter += 1;
                            v20 = v23;
                        } while (i < ((unsigned int)v20 & 0xff));
                    }
                    v5[iter] = sub_bfa154(v21, __ROL__((unsigned int)v8, 24) & 0xff0000ff & 0xff);
                    iter += 1;
                }
            }
        }
    }
    a0->field_0 = v0;
    a0->field_10 = iter;
    return *(unsigned long long *)&v0;
}
