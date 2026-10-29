/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa30088..0xa302c4 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a30088_0 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
    char padding_14[4];
    long long field_18;
    char padding_20[8];
    char field_28;
} st_a30088_0;

extern long long g_c7c2eb;
extern uint128_t g_e90ea0;
extern uint128_t g_e90eb0;
extern uint128_t g_e90ec0;
extern unsigned long long g_e90ed0;

unsigned long long sub_a30088(st_a30088_0 *a0, unsigned int a1, long long a2)
{
    long long v12;  // x20
    unsigned int v13;  // x21
    long long v22;  // x24
    unsigned int v23;  // x23
    unsigned int v25;  // w27
    unsigned long v27;  // cc_op
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned long v30;  // cc_ndep
    unsigned long v31;  // 4110
    unsigned int v14;  // x25
    unsigned long v32;  // cc_op
    unsigned long v33;  // cc_dep1
    unsigned long long v34;  // x0
    unsigned long long v35;  // 4115
    unsigned long v36;  // 4110
    unsigned long long v37;  // 4115
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4102
    unsigned long long v40;  // 4110
    unsigned long long v41;  // 4102
    long long v15;  // x0
    unsigned long long v42;  // x0
    long long v43;  // x8
    long long v44;  // x9
    unsigned long v16;  // cc_dep1
    long long v17;  // x26
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v0;  // [bp-0xd0]
    long long v1;  // [bp-0xc8]
    unsigned long long v2;  // [bp-0xc0]
    long long v3;  // [bp-0xb8]
    unsigned int v4;  // [bp-0xa8]
    uint128_t v5;  // [bp-0xa0]
    uint128_t v6;  // [bp-0x90]
    uint128_t v7;  // [bp-0x80]
    unsigned long v8;  // [bp-0x70]
    unsigned int v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a2;
    v13 = a1;
    v14 = sub_a6820c(a0->field_0, 10);
    v15 = sub_a68f38(a0->field_0);
    v16 = v12;
    if (!v12)
        v17 = &g_c7c2eb;
    else
        v17 = v12;
    v9 = 0;
    if (v14)
    {
        v18 = arm64g_calculate_condition(20, v16, 0, 0);
        v19 = arm64g_calculate_condition(20, (v18 & 1 ? v15 : 0x40000000), 0, 0);
        if (v19 & 1)
            goto LABEL_a30128;
    }
    else
    {
        v20 = arm64g_calculate_condition(20, v16, 0, 0);
        v21 = arm64g_calculate_condition(16, (v20 & 1 ? v15 : 0x40000000), 0, 0);
        if (v21 & 1)
        {
LABEL_a30128:
            v22 = v15;
            if (v13)
            {
                v23 = sub_a68e7c(v22, v13);
                if (!v23)
                    goto LABEL_a3016c;
                if (sub_aa5af0(v14, 0, v23, v17, &v9))
                    goto LABEL_a3021c;
                v25 = 0;
            }
            else
            {
                v23 = 0;
LABEL_a3016c:
                v25 = 1;
            }
            v5 = g_e90ea0;
            v6 = g_e90eb0;
            v7 = g_e90ec0;
            v8 = g_e90ed0;
            v4 = 0;
            a0->field_8 = v23;
            *(unsigned long long *)&a0->field_10 = v13;
            a0->field_18 = v17;
            a0->field_28 = a0->field_28 & 254;
            v9 = sub_a689c0(a0->field_0, 20, &v4, 0, &v5, a0);
            if (v9)
            {
                if (v25)
                    v23 = sub_a68e7c(v22, v13);
                sub_aa5ba8(v14, v4, v23, v17);
            }
            v27 = 9;
            v28 = a0->field_28 & 1;
            v29 = 0;
            v30 = 0;
LABEL_a3021c:
            if (!v23)
            {
                v31 = arm64g_calculate_condition(v27, v28, v29, v30);
                v32 = 4;
                v33 = (v31 & 1 ? v13 : 0);
                v34 = v9;
                v35 = arm64g_calculate_condition(20, v33, 0, 0);
                if (!(v35 & 1))
                    goto LABEL_a3022a;
LABEL_a30229:
                v38 = arm64g_calculate_condition(v32 | 16, v33, 0, 0);
                v39 = arm64g_calculate_condition(20, (v38 & 1 ? v34 : 0), 0, 0);
                if (v39 & 1)
                    return v34;
            }
            else
            {
                v36 = arm64g_calculate_condition(v27, v28, v29, v30);
                v32 = 0;
                v33 = (v36 & 1 ? v13 : 0);
                v34 = v9;
                v37 = arm64g_calculate_condition(16, v33, 0, 0);
                if (v37 & 1)
                    goto LABEL_a30229;
LABEL_a3022a:
                v40 = arm64g_calculate_condition(v32 | 16, v33, 0, 0);
                v41 = arm64g_calculate_condition(16, (v40 & 1 ? v34 : 0), 0, 0);
                if (v41 & 1)
                    return v34;
            }
            if (!v13)
                v13 = sub_a69148(v22, v23, 0);
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/encoder_meth.c", 419, "inner_ossl_encoder_fetch");
            v42 = sub_a683d0(a0->field_0);
            v43 = "<null>";
            if (!v13)
                v44 = "<null>";
            else
                v44 = v13;
            if (v12)
                v43 = v12;
            v2 = v23;
            v3 = v43;
            v0 = v42;
            v1 = v44;
            sub_a36abc();
            return v9;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/encode_decode/encoder_meth.c", 362, "inner_ossl_encoder_fetch");
    sub_a36abc(59, 0x80106, 0);
    return 0;
}
