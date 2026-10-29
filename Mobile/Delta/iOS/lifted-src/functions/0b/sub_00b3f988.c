/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3f988..0xb3fb50 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3f988_0 {
    unsigned long long field_0;
    char padding_8[32];
    long long field_28;
} st_b3f988_0;

typedef struct st_b3f988_1 {
    struct st_b3f988_0 *field_0;
    char padding_8[56];
    unsigned long long field_40;
} st_b3f988_1;

extern char g_10002b0;

unsigned int sub_b3f988(st_b3f988_1 *a0, unsigned long long a1)
{
    unsigned int v12;  // x0
    st_b3f988_0 *v13;  // x21
    unsigned long v22;  // 4110
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned long long v26;  // 4110
    unsigned long v27;  // 4110
    unsigned long long v28;  // 4110
    unsigned long v29;  // 4110
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned int v14;  // x19
    unsigned long v32;  // cc_dep2
    unsigned long long v33;  // 4110
    unsigned long v34;  // 4110
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4102
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4102
    unsigned int v15;  // w0
    unsigned long v16;  // cc_dep1
    unsigned long long v17;  // x11
    unsigned long v18;  // x12
    unsigned long v19;  // x13
    unsigned long long v20;  // x14
    unsigned long long v21;  // x15
    unsigned long v0;  // [bp-0xb0]
    unsigned int v1;  // [bp-0xa0]
    unsigned int v2;  // [bp-0x90]
    char v3;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long long v4;  // [bp-0x78]
    unsigned long long v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x68]
    uint128_t v7;  // [bp-0x60]
    uint128_t v8;  // [bp-0x50]
    unsigned long v9;  // [bp-0x38]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    if (*(long long *)&a0[1].padding_8[0])
    {
        v12 = 1;
        if (a1 & 3 && a0->field_40)
        {
            v13 = a0->field_0;
            v14 = sub_a6bf4c(v13->field_28, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 106);
            if (v14)
            {
                v1 = 0;
                v2 = 0;
                if (!(a1 & 1))
                {
                    v7 = CONCAT(0x5555555555555555, 0x5555555555555555);
                    v8 = v7;
                    if (sub_a8425c(v14, v13->field_28, &v3, 32, &v7, 32, a0) == 1)
                        goto LABEL_b3fa58;
                    goto LABEL_b3fa9c;
                }
                if (sub_a84550(v14, v13->field_28, &v3, 32, a0) != 1)
                    goto LABEL_b3fa9c;
LABEL_b3fa58:
                v15 = sub_a8461c(&v1, 32, v14, v13->field_28, a0);
                v16 = v15;
                if (v15 != 1)
                    goto LABEL_b3fa9c;
                v17 = v4;
                v18 = v2;
                v19 = *(unsigned long long *)((void*)&v2 + 8);
                v20 = v5;
                v21 = v6;
                if (v1 == v3)
                {
                    v22 = arm64g_calculate_condition(3, v16, 1, 0);
                    v23 = 4;
                    v24 = (v22 & 1 ? *(unsigned long long *)((void*)&v1 + 8) : 0);
                    v25 = (v22 & 1 ? v17 : 0);
                    v26 = arm64g_calculate_condition(4, v24, v25, 0);
                    if (!(v26 & 1))
                        goto LABEL_b3fa92;
LABEL_b3fa91:
                    v29 = arm64g_calculate_condition(v23, v24, v25, 0);
                    v30 = 4;
                    v31 = (v29 & 1 ? v18 : 0);
                    v32 = (v29 & 1 ? v20 : 0);
                    v33 = arm64g_calculate_condition(4, v31, v32, 0);
                    if (!(v33 & 1))
                        goto LABEL_b3fa96;
                    goto LABEL_b3fa95;
                }
                v27 = arm64g_calculate_condition(3, v16, 1, 0);
                v23 = 0;
                v24 = (v27 & 1 ? *(unsigned long long *)((void*)&v1 + 8) : 0);
                v25 = (v27 & 1 ? v17 : 0);
                v28 = arm64g_calculate_condition(0, v24, v25, 0);
                if (v28 & 1)
                    goto LABEL_b3fa91;
LABEL_b3fa92:
                v34 = arm64g_calculate_condition(v23, v24, v25, 0);
                v30 = 0;
                v31 = (v34 & 1 ? v18 : 0);
                v32 = (v34 & 1 ? v20 : 0);
                v35 = arm64g_calculate_condition(0, v31, v32, 0);
                if (v35 & 1)
                {
LABEL_b3fa95:
                    v36 = arm64g_calculate_condition(v30, v31, v32, 0);
                    v37 = arm64g_calculate_condition(4, (v36 & 1 ? v19 : 0), (v36 & 1 ? v21 : 0), 0);
                    if (v37 & 1)
                        goto LABEL_b3fb44;
                    goto LABEL_b3fa9c;
                }
                else
                {
LABEL_b3fa96:
                    v38 = arm64g_calculate_condition(v30, v31, v32, 0);
                    v39 = arm64g_calculate_condition(0, (v38 & 1 ? v19 : 0), (v38 & 1 ? v21 : 0), 0);
                    if (!(v39 & 1))
                        goto LABEL_b3fa9c;
LABEL_b3fb44:
                    v12 = 1;
                }
            }
            else
            {
LABEL_b3fa9c:
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 141, "ml_kem_pairwise_test");
                v0 = v13->field_0;
                sub_a36abc(57, 158, "public part of %s private key fails to match private");
                v12 = 0;
            }
            sub_a66ec0(&v7, 32);
            sub_a66ec0(&v3, 32);
            sub_a66ec0(&v1, 32);
            sub_a6c4e8(v14, v13->field_28, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 149);
        }
    }
    else
    {
        v12 = 1;
    }
    if (*(long long *)&g_10002b0 == v9)
        return v12;
    ___stack_chk_fail();
}
