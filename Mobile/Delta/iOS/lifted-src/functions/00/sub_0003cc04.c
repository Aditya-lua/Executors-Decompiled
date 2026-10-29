/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cc04..0x3d0e4 (1248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cc04_1 {
    unsigned long long field_0;
    char padding_8[96];
    char field_68;
    char padding_69[1427];
    unsigned int field_5fc;
    char padding_600[144];
    struct st_3cc04_2 *field_690;
    struct st_3cc04_2 *field_698;
} st_3cc04_1;

typedef struct st_3cc04_3 {
    char padding_0[32];
    long long field_20;
    char padding_28[16];
    struct st_3cc04_4 *field_38;
} st_3cc04_3;

typedef struct st_3cc04_4 {
    long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
} st_3cc04_4;

typedef struct st_3cc04_2 {
    unsigned long long field_0;
} st_3cc04_2;

typedef struct st_3cc04_0 {
    char field_0;
} st_3cc04_0;

typedef struct st_3cc04_5 {
    char padding_0[8];
    unsigned int field_8;
} st_3cc04_5;

extern char g_f0cdd8;
extern char g_10002b0;

int sub_3cc04(st_3cc04_1 *a0, st_3cc04_3 *a1, unsigned long a2, long long a3, long long a4, unsigned long long a5, long long a6, int a7)
{
    int v18;  // w23
    unsigned long long v19;  // x0
    unsigned long long v28;  // x8
    st_3cc04_5 *v29;  // x26
    unsigned long long v30;  // x25
    unsigned int v31;  // w0
    int v32;  // w8
    unsigned long long v33;  // w24
    unsigned long long v34;  // x0
    unsigned long v35;  // cc_op
    unsigned long v36;  // cc_dep1
    unsigned long v37;  // cc_dep2
    unsigned long long v20;  // x26
    unsigned long v38;  // cc_ndep
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    unsigned long long v41;  // 4110
    unsigned long long v42;  // 4102
    unsigned long long *v21;  // x8
    unsigned long long *v22;  // x9
    unsigned long v23;  // x0
    long long v24;  // x1
    unsigned long v25;  // x2
    unsigned long long v26;  // w25
    unsigned long long v27;  // x9
    unsigned long long v0;  // [bp-0x90]
    double v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x80]
    st_3cc04_0 **v3;  // [bp-0x78], Other Possible Types: char
    st_3cc04_0 *v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x68]
    unsigned long long v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x5f]
    unsigned long long v9;  // [bp-0x5e]
    unsigned long long v10;  // [bp-0x5d]
    unsigned long long v11;  // [bp-0x5c]
    unsigned long long v12;  // [bp-0x5b]
    unsigned long long v13;  // [bp-0x5a]
    unsigned long long v14;  // [bp-0x59]
    unsigned long v15;  // [bp-0x58]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0], Other Possible Types: unsigned int

    v16 = &v17;
    v18 = a7;
    v15 = *(long long *)&g_10002b0;
    v4 = &v3;
    v5 = a2;
    v3 = &v4;
    v19 = sub_3b040(&a0->field_68, &v5);
    if (!v19)
        v20 = 0;
    else
        v20 = v19 + 8;
    if (128 < a0->field_5fc || (unsigned int)*(int *)(v20 + 40) >= 33)
    {
        v23 = a0->field_0;
        v24 = "inlining failed: high register pressure";
    }
    else
    {
        v21 = a0->field_698;
        v22 = a0->field_690;
        if ((int)v17 > (int)((unsigned int)(v21 - v22 >> 4) * 2863311531))
        {
            if (v22 != v21)
            {
                do
                {
                    if (*v22 == v5)
                    {
                        sub_300cc(a0->field_0, "inlining failed: can't inline recursive calls");
                        if (*(long long *)&g_10002b0 == v15)
                            return 0;
                        ___stack_chk_fail(0);
                    }
                } while ((v22 += 6, v22 != v21));
            }
            if (a5)
            {
                v23 = a0->field_0;
                v24 = "inlining failed: can't convert fixed returns to multret";
            }
            else
            {
                v6 = 0;
                v25 = v5;
                if (*(long long *)(v25 + 96) && *(long long *)&a1[1].padding_0[0])
                {
                    v26 = (unsigned int)sub_4663c(a0, a1->field_38->field_0);
                    if (v26)
                        v7 = 1;
                    v25 = v5;
                    if ((unsigned long long)*(long long *)(v25 + 96) >= 2 && (unsigned long long)*(long long *)&a1[1].padding_0[0] >= 2)
                    {
                        if (sub_4663c(a0, a1->field_38->field_8))
                        {
                            v26 = 1;
                            v8 = 1;
                        }
                        v25 = v5;
                        if ((unsigned long long)*(long long *)(v25 + 96) >= 3 && (unsigned long long)*(long long *)&a1[1].padding_0[0] >= 3)
                        {
                            if (sub_4663c(a0, a1->field_38->field_10))
                            {
                                v26 = 1;
                                v9 = 1;
                            }
                            v25 = v5;
                            if ((unsigned long long)*(long long *)(v25 + 96) >= 4 && (unsigned long long)*(long long *)&a1[1].padding_0[0] >= 4)
                            {
                                if (sub_4663c(a0, a1->field_38->field_18))
                                {
                                    v26 = 1;
                                    v10 = 1;
                                }
                                v25 = v5;
                                if ((unsigned long long)*(long long *)(v25 + 96) >= 5 && (unsigned long long)*(long long *)&a1[1].padding_0[0] >= 5)
                                {
                                    if (sub_4663c(a0, a1->field_38->field_20))
                                    {
                                        v26 = 1;
                                        v11 = 1;
                                    }
                                    v25 = v5;
                                    if ((unsigned long long)*(long long *)(v25 + 96) >= 6 && (unsigned long long)*(long long *)&a1[1].padding_0[0] >= 6)
                                    {
                                        if (sub_4663c(a0, a1->field_38->field_28))
                                        {
                                            v26 = 1;
                                            v12 = 1;
                                        }
                                        v25 = v5;
                                        if ((unsigned long long)*(long long *)(v25 + 96) >= 7 && (unsigned long long)*(long long *)&a1[1].padding_0[0] >= 7)
                                        {
                                            if (sub_4663c(a0, a1->field_38->field_30))
                                            {
                                                v26 = 1;
                                                v13 = 1;
                                            }
                                            v25 = v5;
                                            if ((unsigned long long)*(long long *)(v25 + 96) >= 8 && (unsigned long long)*(long long *)&a1[1].padding_0[0] >= 8)
                                            {
                                                if (sub_4663c(a0, a1->field_38->field_38))
                                                {
                                                    v26 = 1;
                                                    v14 = 1;
                                                }
                                                v25 = v5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else
                {
                    v26 = 0;
                }
                if (*(long long *)&a1[1].padding_0[0] && (v25 = v5, !(sub_4489c(a0, *(long long *)((char *)&(&a1->field_38->field_0)[*(long long *)&a1[1].padding_0[0]] - 8)) & 1)))
                {
                    v27 = *(long long *)&a1[1].padding_0[0];
                    v28 = *(long long *)(v25 + 96);
                    if ((unsigned long long)*(long long *)(v25 + 96) >= 8)
                        v28 = 8;
                    if (v28 <= v27)
                        goto LABEL_3cf90;
                    _memset((char *)&v7 + v27, 1, v28 - v27);
                    v29 = v20 + 32;
                }
                else
                {
LABEL_3cf90:
                    v29 = v20 + 32;
                    if (!v26)
                        goto LABEL_3cfa8;
                }
                sub_3f684(a0, a1);
                v25 = v5;
LABEL_3cfa8:
                v30 = sub_4edc4();
                v31 = sub_4edc4(v29->padding_0, 0, 0);
                if ((unsigned int)v30)
                {
                    v32 = (300 + 100 * v31) / v30;
                    if (v32 < v18)
                        v18 = v32;
                }
                v33 = (int)((a6 * v18) * 1374389535 >> 37) + (int)((unsigned long long)((a6 * v18) * 1374389535) >> 63);
                if (g_f0cdd8 == 1)
                {
                    v34 = sub_3f4c0(a1->field_20);
                    if (v33 < (int)v30)
                    {
                        v39 = arm64g_calculate_condition(v35 | 192, v36, v37, v38);
                        v40 = arm64g_calculate_condition(20, (v39 & 1 ? v34 : 0), 0, 0);
                        if (v40 & 1)
                            goto LABEL_3d064;
                    }
                    else
                    {
                        v41 = arm64g_calculate_condition(v35 | 192, v36, v37, v38);
                        v42 = arm64g_calculate_condition(16, (v41 & 1 ? v34 : 0), 0, 0);
                        if (v42 & 1)
                            goto LABEL_3d064;
                    }
                }
                else if (v33 >= (int)v30)
                {
LABEL_3d064:
                    v1 = (double)v18 / 100.0;
                    v0 = v30;
                    v2 = 12297829382473034411 * ((long long)(a0->field_698 - a0->field_690) >> 4);
                    sub_300cc(a0->field_0, "inlining succeeded (cost %d, profit %.2fx, depth %d)");
                    sub_43ba0(a0, a1, v5, a3, a4);
                    if (*(long long *)&g_10002b0 == v15)
                        return 1;
                    ___stack_chk_fail(1);
                }
                v23 = a0->field_0;
                v1 = (double)v18 / 100.0;
                v0 = v30;
                v24 = "inlining failed: too expensive (cost %d, profit %.2fx)";
            }
        }
        else
        {
            v23 = a0->field_0;
            v24 = "inlining failed: too many inlined frames";
        }
    }
    sub_300cc(v23, v24);
    if (*(long long *)&g_10002b0 == v15)
        return 0;
    ___stack_chk_fail(0);
}
