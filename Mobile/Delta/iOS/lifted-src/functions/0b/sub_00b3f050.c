/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3f050..0xb3f264 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char sub_b3f050(char *a0, unsigned long a1)
{
    char idx;  // x19
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long v19;  // 4110
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long long v23;  // 4110
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    char v11;  // x20
    unsigned long v26;  // 4110
    unsigned long long v27;  // 4110
    unsigned long v28;  // 4110
    unsigned long v29;  // cc_op
    unsigned long v30;  // cc_dep1
    unsigned long v31;  // cc_dep2
    unsigned long long v32;  // 4110
    unsigned long v33;  // 4110
    unsigned long long v34;  // 4110
    unsigned long long *v13;  // x8
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v14;  // x10
    unsigned long long v15;  // x13
    unsigned long long v16;  // x14
    unsigned long v0;  // [bp-0x80]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    idx = 0;
    if (a1 != 8 || !sub_a2f9e0())
    {
LABEL_b3f218:
        sub_a66ec0(&v1, 64);
        sub_a82d30(idx);
        if (*(long long *)&g_10002b0 == v6)
            return 0;
        ___stack_chk_fail();
    }
    idx = *(long long *)a0;
    v11 = *(long long *)(idx + 176);
    *(unsigned long long *)(idx + 176) = 0;
    *(unsigned long long *)a0 = 0;
    if (v11)
    {
        if (sub_a83238(&v1, 64, idx))
        {
            v13 = v11 + *(long long *)(*(long long *)idx + 8);
            v14 = v3;
            v15 = v4;
            v16 = v5;
            if (v2 == *(long long *)((char *)v13 - 32))
            {
                v19 = arm64g_calculate_condition(v24, v25, v17, v18);
                v20 = 4;
                v21 = (v19 & 1 ? v14 : 0);
                v22 = (v19 & 1 ? *(long long *)((char *)v13 - 24) : 0);
                v23 = arm64g_calculate_condition(4, v21, v22, 0);
                if (!(v23 & 1))
                    goto LABEL_b3f0de;
            }
            else
            {
                v26 = arm64g_calculate_condition(v24, v25, v17, v18);
                v20 = 0;
                v21 = (v26 & 1 ? v14 : 0);
                v22 = (v26 & 1 ? *(long long *)((char *)v13 - 24) : 0);
                v27 = arm64g_calculate_condition(0, v21, v22, 0);
                if (!(v27 & 1))
                {
LABEL_b3f0de:
                    v33 = arm64g_calculate_condition(v20, v21, v22, 0);
                    v29 = 0;
                    v30 = (v33 & 1 ? v15 : 0);
                    v31 = (v33 & 1 ? *(long long *)((char *)v13 - 16) : 0);
                    v34 = arm64g_calculate_condition(0, v30, v31, 0);
                    if (v34 & 1)
                    {
LABEL_b3f0e1:
                        v35 = arm64g_calculate_condition(v29, v30, v31, 0);
                        v36 = arm64g_calculate_condition(4, (v35 & 1 ? v16 : 0), (v35 & 1 ? *(long long *)((char *)v13 - 8) : 0), 0);
                        if (!(v36 & 1))
                            goto LABEL_b3f0e8;
                        goto LABEL_b3f110;
                    }
                    else
                    {
LABEL_b3f0e2:
                        v37 = arm64g_calculate_condition(v29, v30, v31, 0);
                        v38 = arm64g_calculate_condition(0, (v37 & 1 ? v16 : 0), (v37 & 1 ? *(long long *)((char *)v13 - 8) : 0), 0);
                        if (!(v38 & 1))
                        {
LABEL_b3f0e8:
                            sub_a368c8();
                            sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 357, "check_seed");
                            goto LABEL_b3f1e0;
                        }
                    }
                }
            }
            v28 = arm64g_calculate_condition(v20, v21, v22, 0);
            v29 = 4;
            v30 = (v28 & 1 ? v15 : 0);
            v31 = (v28 & 1 ? *(long long *)((char *)v13 - 16) : 0);
            v32 = arm64g_calculate_condition(4, v30, v31, 0);
            if (!(v32 & 1))
                goto LABEL_b3f0e2;
            goto LABEL_b3f0e1;
        }
LABEL_b3f110:
        if (!*(long long *)(idx + 96) || !((char)(*(char *)(idx + 104)) >> 2 & 1))
        {
            if (sub_a8351c(v11, *(long long *)(*(long long *)idx + 8), idx))
            {
                if (sub_b3f988(idx, *(int *)(idx + 104)))
                    goto LABEL_b3f190;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 539, "ml_kem_load");
LABEL_b3f1e0:
                v0 = *(long long *)*(long long *)idx;
                sub_a36abc(57, 158);
            }
        }
        else
        {
            if (sub_a83784(0, 0, idx) && sub_b3fcb8(v11, idx))
                goto LABEL_b3f190;
        }
    }
    else if (!*(long long *)(idx + 96) || sub_a83784(0, 0, idx))
    {
LABEL_b3f190:
        sub_a6c4e8(v11, *(long long *)(*(long long *)idx + 8), "providers/implementations/keymgmt/ml_kem_kmgmt.c", 547);
        sub_a66ec0(&v1, 64);
        if (*(long long *)&g_10002b0 == v6)
            return idx;
        ___stack_chk_fail();
    }
    if (*(long long *)idx)
        sub_a6c4e8(v11, *(long long *)(*(long long *)idx + 8), "providers/implementations/keymgmt/ml_kem_kmgmt.c", 554);
    goto LABEL_b3f218;
}
