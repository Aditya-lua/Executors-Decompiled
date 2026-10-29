/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d41c..0xa2d664 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d41c_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    long long field_18;
    char padding_20[8];
    char field_28;
} st_a2d41c_0;

extern long long g_a2dd20;
extern long long g_a2dd3c;
extern unsigned long long g_c7c2eb;
extern uint128_t g_e90e68;
extern uint128_t g_e90e78;
extern uint128_t g_e90e88;
extern unsigned long long g_e90e98;

unsigned long long sub_a2d41c(st_a2d41c_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v12;  // x20
    unsigned long long v13;  // x21
    long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v25;  // w27
    unsigned long long v26;  // x8
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long v31;  // cc_ndep
    unsigned long long v14;  // x25
    unsigned long v32;  // 4110
    unsigned long v33;  // cc_op
    unsigned long v34;  // cc_dep1
    unsigned long long v35;  // x0
    unsigned long long v36;  // 4115
    unsigned long v37;  // 4110
    unsigned long long v38;  // 4115
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    unsigned long long v41;  // 4110
    long long v15;  // x0
    unsigned long long v42;  // 4102
    unsigned long long v43;  // x0
    unsigned long long v44;  // x8
    unsigned long long v45;  // x9
    unsigned long v16;  // cc_dep1
    unsigned long long v17;  // x26
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v0;  // [bp-0xd0]
    unsigned long long v1;  // [bp-0xc8]
    unsigned long long v2;  // [bp-0xc0]
    unsigned long long v3;  // [bp-0xb8]
    unsigned long long v4;  // [bp-0xa8]
    uint128_t v5;  // [bp-0xa0]
    uint128_t v6;  // [bp-0x90]
    uint128_t v7;  // [bp-0x80]
    unsigned long v8;  // [bp-0x70]
    unsigned long long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a2;
    v13 = a1;
    v14 = sub_a6820c(a0->field_0, 11);
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
            goto LABEL_a2d4bc;
    }
    else
    {
        v20 = arm64g_calculate_condition(20, v16, 0, 0);
        v21 = arm64g_calculate_condition(16, (v20 & 1 ? v15 : 0x40000000), 0, 0);
        if (v21 & 1)
        {
LABEL_a2d4bc:
            v22 = v15;
            if (v13)
            {
                v23 = sub_a68e7c(v22, v13);
                if (!(unsigned int)v23)
                    goto LABEL_a2d500;
                if (sub_aa5af0(v14, 0, v23, v17, &v9))
                    goto LABEL_a2d5bc;
                v25 = 0;
            }
            else
            {
                v23 = 0;
LABEL_a2d500:
                v25 = 1;
            }
            v5 = g_e90e68;
            v6 = g_e90e78;
            v7 = g_e90e88;
            v8 = g_e90e98;
            v4 = 0;
            *(unsigned int *)&a0->field_8 = v23;
            a0->field_10 = v13;
            a0->field_18 = v17;
            a0->field_28 = a0->field_28 & 254;
            v9 = sub_a689c0(a0->field_0, 21, &v4, 0, &v5, a0);
            if (v9)
            {
                if (v13)
                    v26 = v25 ^ 1;
                else
                    v26 = 1;
                if (!(v26 & 1))
                    v23 = sub_a68e7c(v22, v13);
                if ((unsigned int)v23)
                    sub_aa5ba8(v14, v4, v23, v17, v9, &g_a2dd20, &g_a2dd3c);
            }
            v28 = 9;
            v29 = a0->field_28 & 1;
            v30 = 0;
            v31 = 0;
LABEL_a2d5bc:
            if (!(unsigned int)v23)
            {
                v32 = arm64g_calculate_condition(v28, v29, v30, v31);
                v33 = 4;
                v34 = (v32 & 1 ? v13 : 0);
                v35 = v9;
                v36 = arm64g_calculate_condition(20, v34, 0, 0);
                if (!(v36 & 1))
                    goto LABEL_a2d5ca;
LABEL_a2d5c9:
                v39 = arm64g_calculate_condition(v33 | 16, v34, 0, 0);
                v40 = arm64g_calculate_condition(20, (v39 & 1 ? v35 : 0), 0, 0);
                if (v40 & 1)
                    return v35;
            }
            else
            {
                v37 = arm64g_calculate_condition(v28, v29, v30, v31);
                v33 = 0;
                v34 = (v37 & 1 ? v13 : 0);
                v35 = v9;
                v38 = arm64g_calculate_condition(16, v34, 0, 0);
                if (v38 & 1)
                    goto LABEL_a2d5c9;
LABEL_a2d5ca:
                v41 = arm64g_calculate_condition(v33 | 16, v34, 0, 0);
                v42 = arm64g_calculate_condition(16, (v41 & 1 ? v35 : 0), 0, 0);
                if (v42 & 1)
                    return v35;
            }
            if (!v13)
                v13 = sub_a69148(v22, v23, 0);
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/decoder_meth.c", 414, "inner_ossl_decoder_fetch");
            v43 = sub_a683d0(a0->field_0);
            v44 = "<null>";
            if (!v13)
                v45 = "<null>";
            else
                v45 = v13;
            if (v12)
                v44 = v12;
            v2 = v23;
            v3 = v44;
            v0 = v43;
            v1 = v45;
            sub_a36abc();
            return v9;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/encode_decode/decoder_meth.c", 356, "inner_ossl_decoder_fetch");
    sub_a36abc(60, 0x80106, 0);
    return 0;
}
