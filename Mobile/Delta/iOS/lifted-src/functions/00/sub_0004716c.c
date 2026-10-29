/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4716c..0x47230 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4716c_1 {
    long long field_0;
    char padding_8[1524];
    unsigned int field_5fc;
} st_4716c_1;

typedef struct st_4716c_0 {
    char padding_0[8];
    unsigned int field_8;
} st_4716c_0;

extern unsigned int g_f00b40;
extern unsigned int g_f00b50;
extern unsigned int g_f00b60;
extern unsigned int g_f00b70;
extern unsigned int g_f00ba0;

st_4716c_1 * sub_4716c(st_4716c_1 *a0, st_4716c_0 *a1)
{
    unsigned int v4;  // w8
    unsigned long v5;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long v14;  // 4112
    unsigned long long v15;  // 4112
    unsigned long v16;  // 4112
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long long v20;  // 4112
    unsigned long v21;  // 4112
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4102
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    st_4716c_1 *v27;  // x0
    st_4716c_1 *v28;  // x0
    unsigned long v6;  // 4112
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long long v10;  // 4112
    st_4716c_1 *v0;  // [bp-0x30]
    unsigned int v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_8;
    if (v4 != g_f00b40)
    {
        v6 = arm64g_calculate_condition(v5 | 16, v11, v12, v13);
        v7 = 3;
        v8 = (v6 & 1 ? v4 : 0x40000000);
        v9 = (v6 & 1 ? g_f00b50 : 0);
        v10 = arm64g_calculate_condition(19, v8, v9, 0);
        if (!(v10 & 1))
            goto LABEL_471aa;
LABEL_471a9:
        v16 = arm64g_calculate_condition(v7 | 16, v8, v9, 0);
        v17 = 3;
        v18 = (v16 & 1 ? v4 : 0x40000000);
        v19 = (v16 & 1 ? g_f00b60 : 0);
        v20 = arm64g_calculate_condition(19, v18, v19, 0);
        if (!(v20 & 1))
            goto LABEL_471ae;
LABEL_471ad:
        v23 = arm64g_calculate_condition(v17 | 16, v18, v19, 0);
        v24 = arm64g_calculate_condition(3, (v23 & 1 ? v4 : 0x40000000), (v23 & 1 ? g_f00ba0 : 0), 0);
        if (v24 & 1)
            return a0;
    }
    else
    {
        v14 = arm64g_calculate_condition(v5 | 16, v11, v12, v13);
        v7 = 0;
        v8 = (v14 & 1 ? v4 : 0x40000000);
        v9 = (v14 & 1 ? g_f00b50 : 0);
        v15 = arm64g_calculate_condition(16, v8, v9, 0);
        if (v15 & 1)
            goto LABEL_471a9;
LABEL_471aa:
        v21 = arm64g_calculate_condition(v7 | 16, v8, v9, 0);
        v17 = 0;
        v18 = (v21 & 1 ? v4 : 0x40000000);
        v19 = (v21 & 1 ? g_f00b60 : 0);
        v22 = arm64g_calculate_condition(16, v18, v19, 0);
        if (v22 & 1)
            goto LABEL_471ad;
LABEL_471ae:
        v25 = arm64g_calculate_condition(v17 | 16, v18, v19, 0);
        v26 = arm64g_calculate_condition(0, (v25 & 1 ? v4 : 0x40000000), (v25 & 1 ? g_f00ba0 : 0), 0);
        if (v26 & 1)
            return a0;
    }
    v27 = sub_4663c();
    if (v27 & 0x1)
        return v27;
    if (a1->field_8 != g_f00b70)
        sub_300cc(a0->field_0, "expression only compiled for side effects");
    v0 = a0;
    v1 = a0->field_5fc;
    v28 = sub_385b8(a0, a1, &v0);
    v0->field_5fc = v1;
    return v28;
}
