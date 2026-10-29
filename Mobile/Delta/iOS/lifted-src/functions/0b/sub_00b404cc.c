/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb404cc..0xb40640 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b404cc_1 {
    long long field_0;
    struct st_b404cc_1 *field_8;
    struct st_b404cc_2 *field_10;
    unsigned int field_14;
    struct st_b404cc_0 *field_18;
} st_b404cc_1;

typedef struct st_b404cc_0 {
    long long field_0;
    unsigned long long field_8;
    char padding_10[28];
    unsigned int field_2c;
} st_b404cc_0;

typedef struct st_b404cc_2 {
    unsigned long long field_0;
} st_b404cc_2;

extern char g_eea930;

st_b404cc_1 * sub_b404cc(st_b404cc_1 *a0)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long v23;  // cc_ndep
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned long long v12;  // x22
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    char v28;  // x0
    st_b404cc_0 *v29;  // x23
    unsigned long v30;  // x8
    st_b404cc_1 *v31;  // x22
    unsigned long long v13;  // x21
    long long *v32;  // x0
    char v33;  // x21
    long long v35;  // x20
    st_b404cc_1 *v36;  // x0
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long v17;  // x20
    st_b404cc_1 *v18;  // x19
    unsigned int v19;  // w0
    unsigned long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if (((int)a0->field_10 & 3) == 2)
    {
        return 0;
    }
    else
    {
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = v15;
        v7 = &v9;
        v8 = v16;
        v17 = a0->field_0;
        v18 = a0->field_8;
        a0->field_8 = 0;
        v19 = sub_a2f9e0();
        if ((unsigned int)*(int *)((char *)&a0->field_10 + 4) <= 3)
        {
            v24 = arm64g_calculate_condition(v20 | 144, v21, v22, v23);
            v25 = arm64g_calculate_condition(3, (v24 & 1 ? v19 : 0x40000000), 0, 0);
            if (!(v25 & 1))
                goto LABEL_b40520;
        }
        else
        {
            v26 = arm64g_calculate_condition(v20 | 144, v21, v22, v23);
            v27 = arm64g_calculate_condition(0, (v26 & 1 ? v19 : 0x40000000), 0, 0);
            if (!(v27 & 1))
            {
LABEL_b40520:
                v28 = sub_a6bf4c(56, "providers/implementations/keymgmt/mlx_kmgmt.c", 83);
                if (v28)
                {
                    v29 = &(&g_eea930)[*(int *)((char *)&a0->field_10 + 4) * 48];
                    v30 = v29->field_2c;
                    *(unsigned long *)v28 = v17;
                    v31 = (st_b404cc_1 *)v28;
                    v32 = sub_a82b74(v30);
                    v31->field_18 = 0;
                    v31[1].field_0 = 0;
                    v31->field_10 = v32;
                    *(st_b404cc_0 **)&v31->field_14 = v29;
                    *(unsigned int *)&v31[1].field_8 = 0;
                    v31->field_8 = v18;
                    if (!((char)a0->field_10 & 3))
                        return v31;
                    v33 = sub_a50ec8(v17, v18, *v32);
                    v31->field_18 = v33;
                    v0 = v29->field_8;
                    v35 = sub_a50ec8(v17, v18, v29->field_0);
                    v36 = v31;
                    v31[1].field_0 = v35;
                    if (v33)
                    {
                        v37 = arm64g_calculate_condition(v20 | 16, v21, v22, v23);
                        v38 = arm64g_calculate_condition(20, (v37 & 1 ? v35 : 0x40000000), 0, 0);
                        if (v38 & 1)
                        {
                            *(unsigned int *)&v36[1].field_8 = 2;
                            return v36;
                        }
                    }
                    else
                    {
                        v39 = arm64g_calculate_condition(v20 | 16, v21, v22, v23);
                        v40 = arm64g_calculate_condition(16, (v39 & 1 ? v35 : 0x40000000), 0, 0);
                        if (v40 & 1)
                        {
                            *(unsigned int *)&v36[1].field_8 = 2;
                            return v36;
                        }
                    }
                    sub_a6c2e4(v18, "providers/implementations/keymgmt/mlx_kmgmt.c", 0x44);
                    sub_a5a4c8(v33);
                    sub_a5a4c8(v35);
                    sub_a6c2e4(v36, "providers/implementations/keymgmt/mlx_kmgmt.c", 71);
                    return 0;
                }
            }
        }
        sub_a6c2e4(v18, "providers/implementations/keymgmt/mlx_kmgmt.c", 96);
        return 0;
    }
}
