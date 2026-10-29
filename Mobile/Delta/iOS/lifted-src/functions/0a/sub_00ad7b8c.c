/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7b8c..0xad7dec (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad7b8c_0 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[8];
    char field_28;
} st_ad7b8c_0;

extern char g_c7c2eb;
extern uint128_t g_eb4570;
extern uint128_t g_eb4580;
extern uint128_t g_eb4590;
extern unsigned long long g_eb45a0;

long long sub_ad7b8c(st_ad7b8c_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v13;  // x19
    unsigned long v14;  // x20
    long long v23;  // x23
    unsigned long v24;  // x22
    unsigned int v26;  // w8
    unsigned int v27;  // w27
    unsigned long v29;  // cc_op
    unsigned long v30;  // cc_dep1
    unsigned long v31;  // cc_dep2
    unsigned long v32;  // cc_ndep
    unsigned long v15;  // x24
    unsigned long v33;  // 4110
    unsigned long v34;  // cc_op
    unsigned long v35;  // cc_dep1
    unsigned long v36;  // x0
    unsigned long long v37;  // 4115
    unsigned long v38;  // 4110
    unsigned long long v39;  // 4115
    unsigned long long v40;  // 4110
    unsigned long long v41;  // 4102
    unsigned long long v42;  // 4110
    long long v16;  // x0
    unsigned long long v43;  // 4102
    unsigned long v44;  // cc_dep1
    unsigned long long v45;  // 4108
    unsigned long long v46;  // 4108
    unsigned long v47;  // x25
    unsigned long long v48;  // x0
    unsigned long v49;  // x8
    unsigned long v50;  // x9
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // x25
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long v0;  // [bp-0xd0]
    unsigned long long v1;  // [bp-0xc8]
    unsigned long v2;  // [bp-0xc0]
    unsigned long v3;  // [bp-0xb8]
    unsigned long v4;  // [bp-0xb0]
    unsigned long v5;  // [bp-0xa8]
    uint128_t v6;  // [bp-0xa0]
    uint128_t v7;  // [bp-0x90]
    uint128_t v8;  // [bp-0x80]
    unsigned long v9;  // [bp-0x70]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = a2;
    v14 = a1;
    v15 = sub_a6820c(a0->field_0, 15);
    v16 = sub_a68f38(a0->field_0);
    v17 = v13;
    if (!v13)
        v18 = &g_c7c2eb;
    else
        v18 = v13;
    v10 = 0;
    if (v15)
    {
        v19 = arm64g_calculate_condition(20, v17, 0, 0);
        v20 = arm64g_calculate_condition(20, (v19 & 1 ? v16 : 0x40000000), 0, 0);
        if (v20 & 1)
            goto LABEL_ad7c28;
    }
    else
    {
        v21 = arm64g_calculate_condition(20, v17, 0, 0);
        v22 = arm64g_calculate_condition(16, (v21 & 1 ? v16 : 0x40000000), 0, 0);
        if (v22 & 1)
        {
LABEL_ad7c28:
            v23 = v16;
            if (v14)
            {
                v24 = sub_a68e7c(v23, v14);
                if (!(unsigned int)v24)
                    goto LABEL_ad7c6c;
                if (sub_aa5af0(v15, 0, v24, v18, &v10))
                {
                    v26 = 1;
                }
                else
                {
                    v27 = 0;
LABEL_ad7c70:
                    v6 = g_eb4570;
                    v7 = g_eb4580;
                    v8 = g_eb4590;
                    v9 = g_eb45a0;
                    v5 = 0;
                    a0->field_8 = v24;
                    a0->field_10 = v14;
                    a0->field_18 = v18;
                    a0->field_28 = a0->field_28 & 254;
                    v10 = sub_a689c0(a0->field_0, 22, &v5, 0, &v6, a0);
                    if (v10)
                    {
                        if (v27)
                            v24 = sub_a68e7c(v23, v14);
                        sub_aa5ba8(v15, v5, v24, v18);
                    }
                    v26 = a0->field_28 & 1;
                }
            }
            else
            {
                v24 = 0;
LABEL_ad7c6c:
                v27 = 1;
                goto LABEL_ad7c70;
            }
            if (!(unsigned int)v24)
            {
                v33 = arm64g_calculate_condition(v29, v30, v31, v32);
                v34 = 4;
                v35 = (v33 & 1 ? v14 : 0);
                v36 = v10;
                v37 = arm64g_calculate_condition(20, v35, 0, 0);
                if (!(v37 & 1))
                    goto LABEL_ad7d22;
LABEL_ad7d21:
                v40 = arm64g_calculate_condition(v34 | 16, v35, 0, 0);
                v41 = arm64g_calculate_condition(20, (v40 & 1 ? v36 : 0), 0, 0);
                if (v41 & 1)
                    return v36;
            }
            else
            {
                v38 = arm64g_calculate_condition(v29, v30, v31, v32);
                v34 = 0;
                v35 = (v38 & 1 ? v14 : 0);
                v36 = v10;
                v39 = arm64g_calculate_condition(16, v35, 0, 0);
                if (v39 & 1)
                    goto LABEL_ad7d21;
LABEL_ad7d22:
                v42 = arm64g_calculate_condition(v34 | 16, v35, 0, 0);
                v43 = arm64g_calculate_condition(16, (v42 & 1 ? v36 : 0), 0, 0);
                if (v43 & 1)
                    return v36;
            }
            v44 = v26;
            if (v26)
            {
                v45 = arm64g_calculate_condition(19, v44, 0, 0);
                if (!(v45 & 1))
                    goto LABEL_ad7d4a;
LABEL_ad7d49:
                v47 = &g_c7c2eb;
            }
            else
            {
                v46 = arm64g_calculate_condition(19, v44, 0, 0);
                if (v46 & 1)
                    goto LABEL_ad7d49;
LABEL_ad7d4a:
                v47 = "No store loader found. For standard store loaders you need at least one of the default or base providers available. Did you forget to load them? Info: ";
            }
            if (!v14)
                v14 = sub_a69148(v23, v24, 0);
            sub_a368c8();
            sub_a369bc("crypto/store/store_meth.c", 362, "inner_loader_fetch");
            v48 = sub_a683d0(a0->field_0);
            v49 = "<null>";
            if (!v14)
                v50 = "<null>";
            else
                v50 = v14;
            if (v13)
                v49 = v13;
            v3 = v24;
            v4 = v49;
            v1 = v48;
            v2 = v50;
            v0 = v47;
            sub_a36abc();
            return v10;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/store/store_meth.c", 300, "inner_loader_fetch");
    sub_a36abc(44, 0x80106, 0);
    return 0;
}
