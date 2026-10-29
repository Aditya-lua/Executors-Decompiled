/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4e750..0xa4ea80 (816 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4e750_0 {
    long long field_0;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    char padding_14[4];
    long long field_18;
    char padding_20[8];
    char field_28;
    char padding_29[7];
    unsigned long long field_30;
    long long field_38;
    struct st_a4e750_1 *field_40;
} st_a4e750_0;

typedef struct st_a4e750_1 {
    unsigned long long field_0;
} st_a4e750_1;

extern unsigned int g_7fffff;
extern unsigned int g_800000;
extern long long g_c7c2eb;
extern uint128_t g_e9de18;
extern uint128_t g_e9de28;
extern uint128_t g_e9de38;
extern unsigned long long g_e9de48;

unsigned int sub_a4e750(st_a4e750_0 *a0, unsigned long a1, unsigned long long a2, unsigned int a3, long long a4, unsigned long a5, long long a6, unsigned long long *a7)
{
    long long v14;  // x19
    unsigned int v15;  // x20
    long long v25;  // x22
    unsigned int v26;  // x23
    unsigned long v29;  // cc_op
    unsigned long v30;  // cc_dep1
    unsigned long v31;  // cc_dep2
    unsigned long v32;  // cc_ndep
    unsigned long long v33;  // 4110
    unsigned int v16;  // x27
    unsigned long long v34;  // 4107
    unsigned int v35;  // x0
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4107
    unsigned long long v38;  // x0
    long long v39;  // x8
    long long v40;  // x9
    long long v17;  // x0
    unsigned long v18;  // cc_dep1
    long long v19;  // x9
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long long v0;  // [bp-0xf0]
    long long v1;  // [bp-0xe8]
    unsigned long long v2;  // [bp-0xe0]
    long long v3;  // [bp-0xd8]
    unsigned int v4;  // [bp-0xc4]
    long long v5;  // [bp-0xc0]
    uint128_t v6;  // [bp-0xb0]
    uint128_t v7;  // [bp-0xa0]
    uint128_t v8;  // [bp-0x90]
    unsigned long v9;  // [bp-0x80]
    unsigned int v10;  // [bp-0x70]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a4;
    v15 = a3;
    v11 = a1;
    v16 = sub_a6820c(a0->field_0, 0);
    v17 = sub_a68f38(a0->field_0);
    v18 = v14;
    if (!v14)
        v19 = &g_c7c2eb;
    else
        v19 = v14;
    v10 = 0;
    if (v16)
    {
        v20 = arm64g_calculate_condition(20, v18, 0, 0);
        v21 = arm64g_calculate_condition(20, (v20 & 1 ? v17 : 0x40000000), 0, 0);
        if (v21 & 1)
            goto LABEL_a4e808;
    }
    else
    {
        v22 = arm64g_calculate_condition(20, v18, 0, 0);
        v23 = arm64g_calculate_condition(16, (v22 & 1 ? v17 : 0x40000000), 0, 0);
        if (v23 & 1)
        {
LABEL_a4e808:
            if ((int)a2 <= 0)
            {
                sub_c6759c();
                return 0;
            }
            v25 = v17;
            v5 = v19;
            if (v15)
            {
                v26 = sub_a68e7c(v25, v15);
                if (v26)
                {
                    if (0xff < (unsigned int)a2 || &g_800000 <= v26)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/evp/evp_fetch.c", 303, "inner_evp_generic_fetch");
                        sub_a36abc(6, 0xc0103, 0);
                        return 0;
                    }
                    v19 = v5;
                    if (sub_aa5af0(v16, a1, (unsigned int)a2 | v26 * 0x100, v19, &v10))
                        goto LABEL_a4e9cc;
                    else
                        v4 = 0;
                }
                else
                {
                    v4 = 1;
                    v19 = v5;
                }
            }
            else
            {
                v26 = 0;
                v4 = 1;
            }
            v6 = g_e9de18;
            v7 = g_e9de28;
            v8 = g_e9de38;
            v9 = g_e9de48;
            a0->field_8 = a2;
            a0->field_c = v26;
            *(unsigned long long *)&a0->field_10 = v15;
            a0->field_18 = v19;
            a0->field_30 = a5;
            a0->field_38 = a6;
            a0->field_40 = a7;
            a0->field_28 = a0->field_28 & 254;
            v10 = sub_a689c0(a0->field_0, a2, &v11, 0, &v6, a0);
            if (v10)
            {
                if (v4)
                    v26 = sub_a68e7c(v25, v15);
                if (!v26)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_fetch.c", 352, "inner_evp_generic_fetch");
                    v0 = v15;
                    sub_a36abc(6, 0x8010d, "Algorithm %s cannot be found");
                    a7();
                }
                else if (0xff >= (unsigned int)a2 && v26 <= &g_7fffff)
                {
                    sub_aa5ba8(v16, v11, (unsigned int)a2 | v26 * 0x100, v5, v10, a6, a7);
                }
            }
            v29 = 9;
            v30 = a0->field_28 & 1;
            v31 = 0;
            v32 = 0;
LABEL_a4e9cc:
            if (!v26)
            {
                v33 = arm64g_calculate_condition(v29, v30, v31, v32);
                v34 = arm64g_calculate_condition(4, (v33 & 1 ? v15 : 0), 0, 0);
                v35 = v10;
                if (v34 & 1)
                    return v10;
            }
            else
            {
                v36 = arm64g_calculate_condition(v29, v30, v31, v32);
                v37 = arm64g_calculate_condition(0, (v36 & 1 ? v15 : 0), 0, 0);
                v35 = v10;
                if (v37 & 1)
                    return v10;
            }
            if (v35)
                return v35;
            if (!v15)
                v15 = sub_a69148(v25, v26, 0);
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_fetch.c", 376, "inner_evp_generic_fetch");
            v38 = sub_a683d0(a0->field_0);
            v39 = "<null>";
            if (!v15)
                v40 = "<null>";
            else
                v40 = v15;
            if (v14)
                v39 = v14;
            v2 = v26;
            v3 = v39;
            v0 = v38;
            v1 = v40;
            sub_a36abc();
            return v10;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/evp_fetch.c", 278, "inner_evp_generic_fetch");
    sub_a36abc(6, 0x80106, 0);
    return 0;
}
