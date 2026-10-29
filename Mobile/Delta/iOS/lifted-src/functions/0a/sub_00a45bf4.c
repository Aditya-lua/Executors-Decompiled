/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa45bf4..0xa45f58 (868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a45bf4_1 {
    char padding_0[296];
    int field_128;
    int field_12c;
    int field_130;
    char padding_134[4];
    char field_138;
    char padding_139[55];
    struct st_a45bf4_2 *field_170;
} st_a45bf4_1;

typedef struct st_a45bf4_3 {
    char padding_0[280];
    struct st_a45bf4_2 *field_118;
    struct st_a45bf4_2 *field_11c;
    struct st_a45bf4_2 *field_120;
    struct st_a45bf4_2 *field_124;
    int field_128;
    int field_12c;
    struct st_a45bf4_2 *field_130;
    char field_138;
    char padding_139[55];
    struct st_a45bf4_2 *field_170;
} st_a45bf4_3;

typedef struct st_a45bf4_0 {
    char padding_0[44];
    unsigned long long field_2c;
} st_a45bf4_0;

typedef struct st_a45bf4_4 {
    char padding_0[56];
    struct st_a45bf4_2 *field_38;
} st_a45bf4_4;

typedef struct st_a45bf4_2 {
    unsigned long long field_0;
} st_a45bf4_2;

extern char g_10002b0;

unsigned long long * sub_a45bf4(st_a45bf4_0 *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3)
{
    unsigned long long *v4;  // x19
    st_a45bf4_3 *v5;  // x0
    unsigned long long *v14;  // x3
    st_a45bf4_4 *v15;  // x0
    unsigned long v16;  // x1
    unsigned long v17;  // x2
    unsigned long long *v18;  // x3
    st_a45bf4_3 *v19;  // x23
    st_a45bf4_3 *v20;  // x8
    st_a45bf4_3 *v21;  // x8
    st_a45bf4_3 *v22;  // x0
    unsigned long long *v23;  // x1
    st_a45bf4_1 *v6;  // x0
    unsigned long long *v24;  // x2
    unsigned long long *v25;  // x3
    st_a45bf4_3 *v26;  // x0
    unsigned long long *v27;  // x1
    unsigned long long *v28;  // x2
    unsigned long long *v29;  // x3
    long long v30;  // x0
    unsigned long long v31;  // 4112
    st_a45bf4_1 *v7;  // x23
    long long v8;  // x0
    unsigned long v9;  // x22
    unsigned long v10;  // x20
    st_a45bf4_4 *v11;  // x0
    unsigned long v12;  // x1
    unsigned long v13;  // x2
    char v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    v1 = *(long long *)&g_10002b0;
    v5 = sub_9ffdd8();
    if ((int)v5->field_118)
    {
        if ((int)v5->field_124 >= 0)
        {
            v6 = sub_9ffdd8(a0);
            if (a1 == a2 && (v7 = v6, v4 >= v6->field_12c + 8))
            {
                if (sub_a50720(a0))
                    *a1 = *(long long *)sub_a507c8(a0);
                *(unsigned long long *)&(a0->padding_0)[1] = *a2;
                v4 = (char *)v4 - v7->field_12c - 8;
                if (!sub_a93248(&v7->field_138, &a0->padding_0[40], 15 - v7->field_128, v4))
                {
                    v8 = sub_a507c8(a0);
                    sub_a932c4(&v7->field_138, v8, v7->field_130);
                    v9 = a2 + 1;
                    v10 = a1 + 1;
                    if (!sub_a50720(a0))
                    {
                        v15 = &v7->field_138;
                        v16 = v9;
                        v17 = v10;
                        v18 = v4;
                        if (v7->field_170)
                        {
                            if (!sub_a93ddc(v15, v16, v17, v18))
                                goto LABEL_a45f08;
                        }
                        else
                        {
                            if (!sub_a937c8(v15, v16, v17, v18))
                            {
LABEL_a45f08:
                                if (sub_a94058(&v7->field_138, &v0, v7->field_12c) && !sub_a66f20(&v0, v9 + (char *)v4, v7->field_12c))
                                {
                                    if (*(long long *)&g_10002b0 == v1)
                                        return v4;
                                    ___stack_chk_fail();
                                }
                            }
                        }
                        sub_a66ec0(v10, v4);
                        if (*(long long *)&g_10002b0 == v1)
                            return 0xffffffff;
                        ___stack_chk_fail();
                    }
                    v11 = &v7->field_138;
                    v12 = v9;
                    v13 = v10;
                    v14 = v4;
                    if (v7->field_170)
                    {
                        if (!sub_a93a14(v11, v12, v13, v14))
                            goto LABEL_a45e50;
                    }
                    else
                    {
                        if (!sub_a9352c(v11, v12, v13, v14))
                        {
LABEL_a45e50:
                            if (sub_a94058(&v7->field_138, v10 + (char *)v4, v7->field_12c))
                            {
                                if (*(long long *)&g_10002b0 == v1)
                                    return (unsigned int)v4 + v7->field_12c + 8;
                                ___stack_chk_fail();
                            }
                        }
                    }
                }
            }
        }
        else
        {
            if (a1 && !a2)
            {
                if (*(long long *)&g_10002b0 == v1)
                    return 0;
                ___stack_chk_fail();
            }
            if (*(int *)((char *)&v5->field_118 + 4))
            {
                v19 = v5;
                if (a1)
                {
                    v20 = v19;
                    if (sub_a50720(a0) || (int)v20->field_11c)
                    {
                        if (*(int *)((char *)&v20->field_11c + 4))
                        {
LABEL_a45d44:
                            v21 = v19;
                            if (sub_a50720(a0))
                            {
                                v22 = &v21->field_128;
                                v23 = a2;
                                v24 = a1;
                                v25 = v4;
                                if (*(long long *)&v19->padding_139[39])
                                {
                                    if (!sub_a93a14(v22, v23, v24, v25))
                                    {
                                        *(unsigned int *)&v19->field_11c = 1;
                                        if (*(long long *)&g_10002b0 == v1)
                                            return v4;
                                        ___stack_chk_fail();
                                    }
                                }
                                else
                                {
                                    if (!sub_a9352c(v22, v23, v24, v25))
                                    {
                                        *(unsigned int *)&v19->field_11c = 1;
                                        if (*(long long *)&g_10002b0 == v1)
                                            return v4;
                                        ___stack_chk_fail();
                                    }
                                }
                            }
                            else
                            {
                                v26 = &v21->field_128;
                                v27 = a2;
                                v28 = a1;
                                v29 = v4;
                                if (*(long long *)&v19->padding_139[39])
                                {
                                    if (!sub_a93ddc(v26, v27, v28, v29))
                                        goto LABEL_a45eb4;
                                }
                                else
                                {
                                    if (!sub_a937c8(v26, v27, v28, v29))
                                    {
LABEL_a45eb4:
                                        if (sub_a94058(&v19->field_128, &v0, *(int *)((char *)&v19->field_120 + 4)) && !(v30 = sub_a507c8(a0), sub_a66f20(&v0, sub_a507c8(a0), *(int *)((char *)&v19->field_120 + 4)) || (v31 = arm64g_calculate_condition(0x11, v4 & 0xffffffff, 1, 0), !(v31 & 1))))
                                            goto LABEL_a45ef4;
                                    }
                                }
                                sub_a66ec0(a1, v4);
                                v4 = 0xffffffff;
LABEL_a45ef4:
                                *(unsigned int *)((char *)&v19->field_118 + 4) = 0;
                                v19->field_11c = 0;
                                if (*(long long *)&g_10002b0 == v1)
                                    return v4;
                                ___stack_chk_fail();
                            }
                        }
                        else
                        {
                            if (!sub_a93248(&v20->field_128, &a0->padding_0[40], 15 - (int)v20->field_120, v4))
                            {
                                *(unsigned int *)((char *)&v19->field_11c + 4) = 1;
                                goto LABEL_a45d44;
                            }
                        }
                    }
                }
                else if (a2)
                {
                    if (!v4 || *(int *)((char *)&v5->field_11c + 4))
                    {
                        sub_a932c4(&v5->field_128, a2, v4);
                        if (*(long long *)&g_10002b0 == v1)
                            return v4;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    if (!sub_a93248(&v5->field_128, &a0->padding_0[40], 15 - (int)v5->field_120, v4))
                    {
                        *(unsigned int *)((char *)&v19->field_11c + 4) = 1;
                        if (*(long long *)&g_10002b0 == v1)
                            return v4;
                        ___stack_chk_fail();
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return 0xffffffff;
    ___stack_chk_fail();
}
