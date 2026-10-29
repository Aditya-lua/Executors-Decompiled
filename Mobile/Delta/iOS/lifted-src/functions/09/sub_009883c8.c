/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9883c8..0x98863c (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9883c8_2 {
    long long field_0;
    long long field_8;
    unsigned long long field_10;
    char field_18;
} st_9883c8_2;

typedef struct st_9883c8_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_9883c8_1;

typedef struct st_9883c8_3 {
    char padding_0[8];
    struct st_9883c8_0 *field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_9883c8_3;

typedef struct st_9883c8_0 {
    struct st_9883c8_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_9883c8_0;

typedef struct st_9883c8_4 {
    struct st_9883c8_4 *field_0;
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
    unsigned long long field_18;
} st_9883c8_4;

extern char g_10002b0;

int sub_9883c8(st_9883c8_2 *a0, unsigned long long a1, unsigned long a2, uint128_t *a3)
{
    char v5;  // x21
    st_9883c8_1 *v6;  // x8
    st_9883c8_4 *v15;  // x0
    long long v16;  // x2
    char v17;  // x0
    st_9883c8_4 *v18;  // x9
    st_9883c8_4 *v19;  // x9
    st_9883c8_4 *v20;  // x9
    char v21;  // x1
    unsigned long v22;  // x0
    st_9883c8_1 *v7;  // x8
    unsigned long long v8;  // 4102
    char idx;  // x0
    st_9883c8_4 *v10;  // x20
    st_9883c8_3 *v11;  // x8
    st_9883c8_3 *v12;  // x8
    st_9883c8_0 *v13;  // x8
    char *v14;  // x9
    unsigned long v0;  // [bp-0x88], Other Possible Types: char
    unsigned long long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (!(a0->field_18 & 1))
    {
        v1 = a1;
        v5 = sub_a66b6c(a0->field_8, &v0);
        if (v5)
        {
            v6 = (st_9883c8_1 *)v5;
            do
            {
                v7 = v6;
                if (v7->field_18 == a2)
                {
                    if (*(long long *)&g_10002b0 == v2)
                        return 0;
                    ___stack_chk_fail();
                }
            } while ((v8 = arm64g_calculate_condition(52, v7->field_18, a2, 0), !(v8 & 1) && (v6 = *(long long *)&v7->padding_0[8], *(long long *)&v7->padding_0[8])));
        }
        idx = sub_a6bffc(64, "ssl/quic/quic_srtm.c", 299);
        if (idx)
        {
            v10 = (st_9883c8_4 *)idx;
            *(unsigned long long *)(idx + 16) = a1;
            *(unsigned long *)(idx + 24) = a2;
            *(uint128_t *)(idx + 32) = *a3;
            v0 = 0;
            if (!sub_c672c8(a0->field_0, &v10[1].field_10, &v0, v10 + 1, 16) || v0 != 16)
            {
                v15 = v10;
                v16 = 306;
            }
            else if (v5)
            {
                v0 = v5;
                if ((unsigned long long)*(long long *)(v5 + 24) > v10->field_18)
                {
                    v11 = (st_9883c8_3 *)v5;
                    do
                    {
                        v12 = v11;
                        v13 = v12->field_8;
                    } while (v13 && (v11 = v13, v10->field_18 < v11->field_18));
                    v14 = &v12->field_8;
                }
                else
                {
                    v14 = &v0;
                    v13 = (st_9883c8_0 *)v5;
                }
                *(st_9883c8_0 **)&v10->field_8 = v13;
                *(st_9883c8_4 **)v14 = v10;
                if (v0 == v5 || !(sub_a66794(a0->field_8), sub_a66e38(a0->field_8)))
                    goto LABEL_98859c;
                a0->field_18 = a0->field_18 | 1;
                v15 = v10;
                v16 = 323;
            }
            else
            {
                sub_a66794(a0->field_8, v10);
                if (sub_a66e38(a0->field_8))
                {
                    a0->field_18 = a0->field_18 | 1;
                    v15 = v10;
                    v16 = 315;
                }
                else
                {
LABEL_98859c:
                    v17 = sub_a66b6c(a0->field_10, v10);
                    if (v17)
                    {
                        v0 = v17;
                        if ((unsigned long long)*(long long *)(v17 + 16) > v10->field_10)
                        {
                            v18 = (st_9883c8_4 *)v17;
                            do
                            {
                                v19 = v18;
                                v20 = v19->field_0;
                            } while (v20 && (v18 = v20, v10->field_10 < v18->field_10));
                        }
                        else
                        {
                            v19 = &v0;
                            v20 = (st_9883c8_4 *)v17;
                        }
                        v10->field_0 = v20;
                        v19->field_0 = v10;
                        v21 = v0;
                        if (v21 != v17)
                        {
                            v22 = a0->field_10;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v2)
                                return 1;
                            ___stack_chk_fail();
                        }
                    }
                    else
                    {
                        v22 = a0->field_10;
                        v21 = (char)v10;
                    }
                    sub_a66794(v22, v21);
                    if (sub_a66e38(a0->field_10))
                    {
                        a0->field_18 = a0->field_18 | 1;
                        if (*(long long *)&g_10002b0 == v2)
                            return 0;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v2)
                            return 1;
                        ___stack_chk_fail();
                    }
                }
            }
            sub_a6c2e4(v15, "ssl/quic/quic_srtm.c", v16);
            if (*(long long *)&g_10002b0 == v2)
                return 0;
            ___stack_chk_fail();
        }
        else
        {
            if (*(long long *)&g_10002b0 == v2)
                return *(unsigned int *)&idx;
            ___stack_chk_fail();
        }
    }
    else
    {
        if (*(long long *)&g_10002b0 == v2)
            return 0;
        ___stack_chk_fail();
    }
}
