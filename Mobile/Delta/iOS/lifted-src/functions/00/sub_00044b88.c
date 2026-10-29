/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x44b88..0x44e7c (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_44b88_1 {
    unsigned int field_0;
    char field_4;
    char padding_5[1];
    char field_6;
    char padding_7[33];
    char field_28;
} st_44b88_1;

typedef struct st_44b88_2 {
    unsigned long long field_0;
} st_44b88_2;

typedef struct st_44b88_3 {
    struct st_44b88_2 *field_0;
} st_44b88_3;

typedef struct st_44b88_0 {
    char field_0;
} st_44b88_0;

extern unsigned long long g_e65240;

void sub_44b88(long long a0, long long a1, st_44b88_1 **a2, st_44b88_3 **a3)
{
    long long v14;  // x27
    long long v15;  // x28
    unsigned long long v24;  // x19
    unsigned long long v25;  // x20
    unsigned long long v26;  // 4110
    unsigned long long v27;  // 4102
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4102
    unsigned long v30;  // x8
    unsigned long v31;  // x8
    unsigned long v32;  // x8
    unsigned long v33;  // x8
    st_44b88_1 *v16;  // x23
    unsigned long v34;  // x8
    st_44b88_1 *v17;  // x24
    unsigned long long v18;  // x26
    unsigned long long v19;  // x27
    unsigned long v20;  // x8
    unsigned long long v21;  // x25
    st_44b88_1 *v22;  // x24
    st_44b88_1 *iter;  // x23
    long long v0;  // [bp-0xe0]
    long long v1;  // [bp-0xd8]
    st_44b88_0 **v2;  // [bp-0xd0], Other Possible Types: char
    st_44b88_0 *v3;  // [bp-0xc8]
    unsigned long long *v4;  // [bp-0xc0]
    unsigned long v5;  // [bp-0xb8]
    unsigned long long v6;  // [bp-0xb0]
    long long v7;  // [bp-0xa8]
    unsigned long long v8;  // [bp-0xa0]
    unsigned long long v9;  // [bp-0x90]
    unsigned long long v10;  // [bp-0x80]
    unsigned long long v11;  // [bp-0x70]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a1;
    v15 = a0;
    v3 = &v2;
    v2 = &v3;
    v6 = &g_e65240;
    v7 = a0;
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v16 = *a2;
    v17 = a2[1];
    if (v17 != v16)
    {
        v0 = v15;
        v1 = v14;
        v18 = 0;
        v19 = 0;
        do
        {
            if (!*(int *)((char *)v16 + v18))
            {
                if (a3[1] <= v19)
                {
                    v20 = (&v16->field_4)[v18];
                    v4 = (char *)&v10 + (v20 >> 3 & 24);
                    v5 = 1 << ((char)v20 & 63);
                    sub_3b720(&v4, 1);
                    v16 = *a2;
                    v17 = a2[1];
                }
                else
                {
                    (*(long long *)*(long long *)*(long long *)&(*a3)[v19])();
                }
            }
        } while ((v19 += 1, v21 = 12297829382473034411 * ((long long)(v17 - v16) >> 4), v18 += 48, v21 > v19));
        v15 = v0;
        v14 = v1;
        v22 = v17;
        iter = v16;
        if (v22 != iter)
            goto LABEL_44cb0;
    }
    else
    {
        v21 = 12297829382473034411 * ((long long)(v17 - v16) >> 4);
        v22 = v17;
        iter = v16;
        if (v22 != iter)
        {
LABEL_44cb0:
            iter = v16;
            v22 = v17;
            v24 = 0;
            v25 = 0;
            do
            {
                if (*(int *)((char *)iter + v24))
                {
                    v26 = arm64g_calculate_condition(20, v17, v16, 0);
                    v27 = arm64g_calculate_condition(36, (v26 & 1 ? v25 : 0x20000000), (v26 & 1 ? a3[1] : 0), 0);
                    if (!(v27 & 1))
                        (*(long long *)*(long long *)*(long long *)&(*a3)[v25])();
                }
                else
                {
                    v28 = arm64g_calculate_condition(20, v17, v16, 0);
                    v29 = arm64g_calculate_condition(32, (v28 & 1 ? v25 : 0x20000000), (v28 & 1 ? a3[1] : 0), 0);
                    if (!(v29 & 1))
                        (*(long long *)*(long long *)*(long long *)&(*a3)[v25])();
                }
            } while ((v17 = v25 + 1, v16 = 12297829382473034411 * ((long long)(v22 - iter) >> 4), v24 += 48, v25 = v17, v21 = v16, v21 > v25));
        }
    }
    if (a3[1] > v21)
        (*(long long *)*(long long *)*(long long *)&(*a3)[v21])();
    if (iter != v22)
    {
        do
        {
            if (2 >= iter->field_0 - 3)
            {
                v30 = iter->field_4;
                if ((unsigned long long)(*(long long *)((char *)&v10 + (v30 >> 3 & 24))) >> ((char)v30 & 63) & 1)
                {
                    v31 = iter->field_4;
                    v4 = (char *)&v8 + (v31 >> 3 & 24);
                    v5 = 1 << ((char)v31 & 63);
                    sub_3b720(&v4, 1);
                }
                if (iter->field_0 == 5)
                {
                    v32 = iter->field_6;
                    if ((unsigned long long)(*(long long *)((char *)&v10 + (v32 >> 3 & 24))) >> ((char)v32 & 63) & 1)
                    {
                        v33 = iter->field_6;
                        v4 = (char *)&v8 + (v33 >> 3 & 24);
                        v5 = 1 << ((char)v33 & 63);
                        sub_3b720(&v4, 1);
                    }
                }
            }
        } while ((iter = iter[1].padding_7, iter != v22));
        iter = *a2;
        v22 = a2[1];
    }
    for (; iter != v22; iter = iter[1].padding_7)
    {
        if (!iter->field_0)
        {
            v34 = iter->field_4;
            if ((unsigned long long)(*(long long *)((char *)&v8 + (v34 >> 3 & 24))) >> ((char)v34 & 63) & 1)
                iter->field_28 = sub_3b87c(v15, v14, 1);
        }
    }
    return;
}
