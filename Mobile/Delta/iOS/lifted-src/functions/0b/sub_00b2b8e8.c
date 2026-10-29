/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2b8e8..0xb2bc00 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2b8e8_1 {
    char padding_0[84];
    struct st_b2b8e8_0 *field_54;
    struct st_b2b8e8_0 *field_58;
    char padding_60[16];
    struct st_b2b8e8_0 *field_70;
    char padding_78[8];
    long long field_80;
} st_b2b8e8_1;

typedef struct st_b2b8e8_0 {
    struct st_b2b8e8_0 *field_0;
    char field_1;
    char padding_2[2];
    struct st_b2b8e8_0 *field_4;
    char field_8;
    unsigned short field_9;
    char field_b;
    struct st_b2b8e8_0 *field_c;
    struct st_b2b8e8_1 *field_10;
} st_b2b8e8_0;

extern long long g_b2cbbc;

st_b2b8e8_0 * sub_b2b8e8(st_b2b8e8_1 *a0)
{
    st_b2b8e8_0 *v4;  // x20
    st_b2b8e8_0 *j;  // w8
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long v18;  // cc_op
    unsigned long long v19;  // 4110
    st_b2b8e8_0 *v6;  // x21
    unsigned long long v20;  // 4102
    st_b2b8e8_0 *i;  // w24
    st_b2b8e8_0 *v22;  // x8
    st_b2b8e8_0 *v23;  // w25
    st_b2b8e8_0 *v24;  // x9
    st_b2b8e8_0 *v25;  // x26
    st_b2b8e8_0 *v7;  // x21
    st_b2b8e8_0 *iter;  // x23
    st_b2b8e8_0 *v27;  // x8
    st_b2b8e8_0 *v28;  // x0
    st_b2b8e8_0 *v29;  // x23
    st_b2b8e8_0 *v30;  // x19
    st_b2b8e8_0 *v8;  // x21
    st_b2b8e8_0 *v9;  // x21
    st_b2b8e8_0 *v10;  // x20
    st_b2b8e8_0 *v11;  // x0
    st_b2b8e8_0 *v12;  // x21
    unsigned short v0;  // [bp-0x53]
    char v1;  // [bp-0x51]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((int)a0->field_54 != 1)
    {
        v10 = sub_a6bffc(*(int *)&(a0->padding_0)[1] * 8, "providers/implementations/kdfs/argon2.c", 562);
        v11 = sub_a6bffc(*(int *)&(a0->padding_0)[1] * 24, "providers/implementations/kdfs/argon2.c", 563);
        v12 = v11;
        if (v10)
        {
            v16 = arm64g_calculate_condition(v18 | 16, v13, v14, v15);
            v17 = arm64g_calculate_condition(20, (v16 & 1 ? v11 : 0x40000000), 0, 0);
            if (v17 & 1)
                goto LABEL_b2ba6c;
LABEL_b2ba34:
            if (v12)
                sub_a6c2e4(v12, "providers/implementations/kdfs/argon2.c", 617);
            if (!v10)
                return 0;
            sub_a6c2e4(v10, "providers/implementations/kdfs/argon2.c", 619);
            return 0;
        }
        v19 = arm64g_calculate_condition(v18 | 16, v13, v14, v15);
        v20 = arm64g_calculate_condition(16, (v19 & 1 ? v11 : 0x40000000), 0, 0);
        if (!(v20 & 1))
            goto LABEL_b2ba34;
LABEL_b2ba6c:
        if (*(int *)&a0->padding_60[8])
        {
            i = (st_b2b8e8_0 *)0;
            v22 = *(int *)&(a0->padding_0)[1];
            do
            {
                v23 = (st_b2b8e8_0 *)0;
                v24 = v22;
                do
                {
                    if (!(unsigned int)v24)
                        continue;
                    v25 = 0;
                    iter = v12;
                    do
                    {
                        v27 = (int)a0->field_54;
                        if (v25 >= v27)
                        {
                            if (!sub_ad98a0((&v10->field_0)[v25 - v27 & 0xffffffff], 0) || !sub_ad9918((&v10->field_0)[(char *)v25 - (int)a0->field_54 & 0xffffffff]))
                                goto LABEL_b2ba34;
                            *(unsigned long long *)((char *)v10 + 0x8 * v25) = 0;
                        }
                        iter->field_4 = a0;
                        *(unsigned int *)&iter->field_0 = (unsigned int)i;
                        *(unsigned int *)((char *)&iter->field_0 + 4) = (unsigned int)v25;
                        iter->field_1 = (char)v23;
                        *(unsigned short *)iter->padding_2 = v0;
                        (iter->padding_2)[1] = v1;
                        *(unsigned int *)&(iter->padding_2)[1 + 1] = 0;
                        v28 = sub_ad97ec(a0->padding_78, &g_b2cbbc, iter);
                        *(st_b2b8e8_0 **)((char *)v10 + 0x8 * v25) = v28;
                        if (!v28 && v25)
                        {
                            v30 = 0;
                            do
                            {
                            } while (sub_ad98a0(*(long long *)((char *)v10 + 0x8 * v30), 0) && sub_ad9918(*(long long *)((char *)v10 + 0x8 * v30)) && (*(unsigned long long *)((char *)v10 + 0x8 * v30) = 0, v30 = (char *)&v30->field_0 + 1, v25 != v30));
                        }
                    } while ((v25 = (char *)&v25->field_0 + 1, v22 = *(int *)&(a0->padding_0)[1], iter = &iter->field_8, v25 < v22));
                    v24 = v22;
                    if ((unsigned int)v22 > (unsigned int)(struct st_b2b8e8_0 *)((char *)v22 - (int)a0->field_54))
                    {
                        while (sub_ad98a0(*(long long *)((char *)v10 + 0x8 * v29), 0) && sub_ad9918(*(long long *)((char *)v10 + 0x8 * v29)))
                        {
                            *(unsigned long long *)((char *)v10 + 0x8 * v29) = 0;
                            v29 = (char *)&v29->field_0 + 1;
                            v24 = *(int *)&(a0->padding_0)[1];
                            if (v29 >= v24)
                            {
                                v22 = v24;
                                goto LABEL_b2bb64;
                            }
                        }
                    }
LABEL_b2bb64:
                } while ((v23 = (char *)&v23->field_0 + 1, v23 != 4));
                i = (char *)&i->field_0 + 1;
            } while (i < (unsigned int)*(int *)&a0->padding_60[8]);
        }
        sub_a6c2e4(v12, "providers/implementations/kdfs/argon2.c", 610);
        sub_a6c2e4(v10, "providers/implementations/kdfs/argon2.c", 611);
    }
    else if (*(int *)&a0->padding_60[8])
    {
        v4 = 0;
        j = (st_b2b8e8_0 *)*(int *)&(a0->padding_0)[1];
        do
        {
            if (j)
            {
                v6 = 0;
                do
                {
                    sub_b2c0a8(a0, v4, v6, 0);
                    v6 = (unsigned int)v6 + 1;
                    j = (st_b2b8e8_0 *)*(int *)&(a0->padding_0)[1];
                } while ((unsigned int)v6 < j);
                if (j)
                {
                    v7 = 0;
                    do
                    {
                        sub_b2c0a8(a0, v4, v7, 1);
                        v7 = (unsigned int)v7 + 1;
                        j = (st_b2b8e8_0 *)*(int *)&(a0->padding_0)[1];
                    } while ((unsigned int)v7 < j);
                    if (j)
                    {
                        v8 = 0;
                        do
                        {
                            sub_b2c0a8(a0, v4, v8, 2);
                            v8 = (unsigned int)v8 + 1;
                            j = (st_b2b8e8_0 *)*(int *)&(a0->padding_0)[1];
                        } while ((unsigned int)v8 < j);
                        if (j)
                        {
                            v9 = 0;
                            do
                            {
                                sub_b2c0a8(a0, v4, v9, 3);
                                v9 = (unsigned int)v9 + 1;
                                j = (st_b2b8e8_0 *)*(int *)&(a0->padding_0)[1];
                            } while ((unsigned int)v9 < (unsigned int)*(int *)&(a0->padding_0)[1]);
                        }
                    }
                }
            }
        } while ((v4 = (unsigned int)v4 + 1, (unsigned int)*(int *)&a0->padding_60[8] > (unsigned int)v4));
    }
    return 1;
}
