/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3fc1c..0xb3fcb8 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3fc1c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b3fc1c_0;


int sub_b3fc1c(unsigned long long *a0, unsigned long a1, st_b3fc1c_0 **a2)
{
    unsigned long long *v6;  // x8
    unsigned long v7;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4110
    unsigned long v18;  // 4110
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long long v22;  // 4110
    unsigned long v23;  // 4110
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long long v29;  // x20
    unsigned long long v30;  // x19
    unsigned long long v31;  // x30
    unsigned long v8;  // 4110
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long long v12;  // 4110
    unsigned long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    v6 = a1 + *a2->field_8;
    if (a0[4] == *(long long *)((char *)v6 - 32))
    {
        v8 = arm64g_calculate_condition(v7, v13, v14, v15);
        v9 = 4;
        v10 = (v8 & 1 ? a0[5] : 0);
        v11 = (v8 & 1 ? *(long long *)((char *)v6 - 24) : 0);
        v12 = arm64g_calculate_condition(4, v10, v11, 0);
        if (!(v12 & 1))
            goto LABEL_b3fc42;
LABEL_b3fc41:
        v18 = arm64g_calculate_condition(v9, v10, v11, 0);
        v19 = 4;
        v20 = (v18 & 1 ? a0[6] : 0);
        v21 = (v18 & 1 ? *(long long *)((char *)v6 - 16) : 0);
        v22 = arm64g_calculate_condition(4, v20, v21, 0);
        if (!(v22 & 1))
            goto LABEL_b3fc46;
LABEL_b3fc45:
        v25 = arm64g_calculate_condition(v19, v20, v21, 0);
        v26 = arm64g_calculate_condition(4, (v25 & 1 ? a0[7] : 0), (v25 & 1 ? *(long long *)((char *)v6 - 8) : 0), 0);
        if (v26 & 1)
            return 1;
    }
    else
    {
        v16 = arm64g_calculate_condition(v7, v13, v14, v15);
        v9 = 0;
        v10 = (v16 & 1 ? a0[5] : 0);
        v11 = (v16 & 1 ? *(long long *)((char *)v6 - 24) : 0);
        v17 = arm64g_calculate_condition(0, v10, v11, 0);
        if (v17 & 1)
            goto LABEL_b3fc41;
LABEL_b3fc42:
        v23 = arm64g_calculate_condition(v9, v10, v11, 0);
        v19 = 0;
        v20 = (v23 & 1 ? a0[6] : 0);
        v21 = (v23 & 1 ? *(long long *)((char *)v6 - 16) : 0);
        v24 = arm64g_calculate_condition(0, v20, v21, 0);
        if (v24 & 1)
            goto LABEL_b3fc45;
LABEL_b3fc46:
        v27 = arm64g_calculate_condition(v19, v20, v21, 0);
        v28 = arm64g_calculate_condition(0, (v27 & 1 ? a0[7] : 0), (v27 & 1 ? *(long long *)((char *)v6 - 8) : 0), 0);
        if (v28 & 1)
            return 1;
    }
    v1 = v29;
    v2 = v30;
    v3 = &v5;
    v4 = v31;
    sub_a368c8();
    sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 357, "check_seed");
    v0 = *a2->field_0;
    sub_a36abc(57, 158, "private %s key implicit rejection secret does not match seed");
    return 0;
}
