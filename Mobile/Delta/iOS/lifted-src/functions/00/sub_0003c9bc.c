/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c9bc..0x3cc04 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c9bc_2 {
    char padding_0[16];
    long long field_10;
} st_3c9bc_2;

typedef struct st_3c9bc_1 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[8];
    long long field_30;
    char padding_38[8];
    long long field_40;
} st_3c9bc_1;

typedef struct st_3c9bc_0 {
    char field_0;
} st_3c9bc_0;


unsigned long long sub_3c9bc(unsigned long long *a0, st_3c9bc_1 *a1, unsigned int a2, int a3)
{
    int v17;  // w21
    unsigned long v18;  // x8
    unsigned long v23;  // cc_dep2
    unsigned long long v24;  // 4112
    unsigned long v25;  // cc_op
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    unsigned long v28;  // cc_ndep
    unsigned long v29;  // 4112
    unsigned long long v30;  // 4112
    unsigned int v19;  // w10
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4102
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4102
    unsigned int v35;  // w10
    unsigned long v36;  // 4112
    unsigned long v37;  // cc_op
    unsigned long v38;  // cc_dep1
    unsigned long v39;  // cc_dep2
    unsigned long long v40;  // 4112
    unsigned long v41;  // 4112
    unsigned long long v42;  // 4112
    unsigned long long v43;  // 4112
    unsigned long long v44;  // 4102
    unsigned long long v45;  // 4112
    unsigned long long v46;  // 4102
    unsigned long long v47;  // x0
    unsigned long long v48;  // x23
    st_3c9bc_2 *v51;  // x0
    unsigned long v52;  // x3
    unsigned long v53;  // x4
    long long v54;  // x0
    unsigned long v20;  // 4112
    unsigned long long v55;  // x25
    unsigned int v56;  // w0
    int v57;  // w8
    double v58;  // d0
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long long v0;  // [bp-0x100]
    unsigned long long v1;  // [bp-0xf8]
    double v2;  // [bp-0xf0]
    st_3c9bc_0 **v3;  // [bp-0xe8], Other Possible Types: char
    st_3c9bc_0 *v4;  // [bp-0xe0]
    long long v5;  // [bp-0xd1]
    unsigned long v6;  // [bp-0xd0]
    unsigned int v7;  // [bp-0xc8]
    double v8;  // [bp-0xc8]
    unsigned long long v9;  // [bp-0xc0]
    unsigned long long v10;  // [bp-0xb8]
    unsigned long long v11;  // [bp-0xb0]
    unsigned long long v12;  // [bp-0xa8]
    unsigned int v13;  // [bp-0xa0]
    unsigned int v14;  // [bp-0x78]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = a3;
    v4 = &v3;
    v3 = &v4;
    sub_46ce0();
    sub_46ce0(a0, a1->field_30);
    if (a1->padding_38)
    {
        sub_46ce0(a0);
        v18 = v7 == 3;
        v19 = v13;
        if (v14 == 3)
        {
            v20 = arm64g_calculate_condition(v25, v26, v27, v28);
            v21 = 3;
            v22 = (v20 & 1 ? v19 : 0);
            v23 = (v20 & 1 ? 3 : 0);
            v24 = arm64g_calculate_condition(3, v22, v23, 0);
            if (!(v24 & 1))
                goto LABEL_3ca46;
            goto LABEL_3ca45;
        }
        v29 = arm64g_calculate_condition(v25, v26, v27, v28);
        v21 = 0;
        v22 = (v29 & 1 ? v19 : 0);
        v23 = (v29 & 1 ? 3 : 0);
        v30 = arm64g_calculate_condition(0, v22, v23, 0);
        if (v30 & 1)
        {
LABEL_3ca45:
            v31 = arm64g_calculate_condition(v21, v22, v23, 0);
            v32 = arm64g_calculate_condition(19, (v31 & 1 ? v18 & 1 : 0x40000000), 0, 0);
            if (v32 & 1)
                goto LABEL_3ca84;
        }
        else
        {
LABEL_3ca46:
            v33 = arm64g_calculate_condition(v21, v22, v23, 0);
            v34 = arm64g_calculate_condition(16, (v33 & 1 ? v18 & 1 : 0x40000000), 0, 0);
            if (v34 & 1)
                goto LABEL_3ca84;
        }
    }
    else
    {
        v8 = 1.5e-323;
        v9 = 0x3ff0000000000000;
        v10 = 0;
        v11 = 0;
        v12 = 0;
        v35 = v13;
        if (v14 == 3)
        {
            v36 = arm64g_calculate_condition(v25, v26, v27, v28);
            v37 = 3;
            v38 = (v36 & 1 ? v35 : 0);
            v39 = (v36 & 1 ? 3 : 0);
            v40 = arm64g_calculate_condition(3, v38, v39, 0);
            if (!(v40 & 1))
                goto LABEL_3ca7e;
            goto LABEL_3ca7d;
        }
        v41 = arm64g_calculate_condition(v25, v26, v27, v28);
        v37 = 0;
        v38 = (v41 & 1 ? v35 : 0);
        v39 = (v41 & 1 ? 3 : 0);
        v42 = arm64g_calculate_condition(0, v38, v39, 0);
        if (v42 & 1)
        {
LABEL_3ca7d:
            v43 = arm64g_calculate_condition(v37, v38, v39, 0);
            v44 = arm64g_calculate_condition(3, (v43 & 1 ? 1 : 0x40000000), 0, 0);
            if (!(v44 & 1))
                goto LABEL_3ca84;
        }
        else
        {
LABEL_3ca7e:
            v45 = arm64g_calculate_condition(v37, v38, v39, 0);
            v46 = arm64g_calculate_condition(0, (v45 & 1 ? 1 : 0x40000000), 0, 0);
            if (!(v46 & 1))
            {
LABEL_3ca84:
                v47 = sub_4fe30();
                if (!(v47 >> 31 & 1))
                {
                    v48 = v47;
                    if ((int)v47 > (int)a2)
                    {
                        v0 = v48;
                        sub_300cc(*a0, "loop unroll failed: too many iterations (%d)");
                        return 0;
                    }
                    v51 = sub_34930(a0 + 28, &a1->field_20);
                    if (v51 && (char)v51->field_10 == 1)
                    {
                        sub_300cc(*a0, "loop unroll failed: mutable loop variable");
                        return 0;
                    }
                    v6 = a1->field_20;
                    v52 = a0 + 53;
                    v53 = a0 + 33;
                    v54 = sub_4eb3c(a1->field_40, &v6, 1, v52, v53);
                    v5 = 1;
                    v55 = v48 * sub_4edc4(v54, &v5, 1, v52, v53);
                    v56 = sub_4edc4(v54, 0, 0);
                    if ((unsigned int)v55)
                    {
                        v57 = 100 * ((unsigned int)v48 + v56 * (unsigned int)v48) / v55;
                        if (v57 < v17)
                            v17 = v57;
                    }
                    v58 = (double)v17 / 100.0;
                    if ((int)(((int)((a2 * v17) * 1374389535) >> 37) + ((a2 * v17) * 1374389535 >> 63)) >= (int)v55)
                    {
                        v2 = v58;
                        v0 = v48;
                        v1 = v55;
                        sub_300cc(*a0, "loop unroll succeeded (iterations %d, cost %d, profit %.2fx)");
                        sub_458e4(a0, a1, v48);
                    }
                    else
                    {
                        v2 = v58;
                        v0 = v48;
                        v1 = v55;
                        sub_300cc(*a0, "loop unroll failed: too expensive (iterations %d, cost %d, profit %.2fx)");
                    }
                    return (int)(((int)((a2 * v17) * 1374389535) >> 37) + ((a2 * v17) * 1374389535 >> 63)) >= (int)v55;
                }
            }
        }
    }
    sub_300cc(*a0, "loop unroll failed: invalid iteration count");
    return 0;
}
