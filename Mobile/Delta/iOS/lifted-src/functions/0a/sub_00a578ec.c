/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa578ec..0xa57c20 (820 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a578ec_7 {
    char padding_0[120];
    struct st_a578ec_6 *field_78;
} st_a578ec_7;

typedef struct st_a578ec_6 {
    char padding_0[136];
    struct st_a578ec_4 *field_88;
} st_a578ec_6;

typedef struct st_a578ec_0 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a578ec_1 *field_28;
    char padding_30[72];
    struct st_a578ec_3 *field_78;
    char padding_80[32];
    char field_a0;
} st_a578ec_0;

typedef struct st_a578ec_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[176];
    struct st_a578ec_2 *field_c0;
} st_a578ec_1;

typedef struct st_a578ec_3 {
    char padding_0[136];
    struct st_a578ec_2 *field_88;
    char padding_90[104];
    struct st_a578ec_4 *field_f8;
} st_a578ec_3;

typedef struct st_a578ec_8 {
    char padding_0[40];
    struct st_a578ec_7 *field_28;
} st_a578ec_8;

typedef struct st_a578ec_5 {
    char padding_0[24];
    unsigned long long field_18;
    char field_19;
    char padding_1a[14];
    struct st_a578ec_0 *field_28;
} st_a578ec_5;

typedef struct st_a578ec_4 {
    unsigned long long field_0;
} st_a578ec_4;

typedef struct st_a578ec_2 {
    char field_0;
} st_a578ec_2;

extern unsigned long long g_c7c2eb;
extern char g_10002b0;

char sub_a578ec(st_a578ec_5 *a0, long long a1, long long a2)
{
    st_a578ec_0 *v7;  // x19
    st_a578ec_1 *v8;  // x23
    char v17;  // x0
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long v21;  // cc_ndep
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned long long v9;  // x24
    st_a578ec_3 *v10;  // x8
    unsigned long v11;  // x9
    char *v12;  // x24
    long long v13;  // x20
    long long v14;  // x21
    char v15;  // x0
    st_a578ec_8 *v16;  // x22
    unsigned long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    char v2;  // [bp-0x9c]
    char v3;  // [bp-0x98]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v2 = 0;
    if (a0->field_18 >> 11 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 675, "EVP_DigestVerifyFinal");
        goto LABEL_a57a78;
    }
    v7 = *(long long *)&a0->padding_1a[7];
    if (v7)
    {
        if (v7->field_0 == 0x100 && *(long long *)&v7->padding_30[0] && (v8 = v7->field_28, v8))
        {
            if (!*(long long *)&v8->padding_10[0])
                v9 = &g_c7c2eb;
            else
                v9 = *(long long *)&v8->padding_10[0];
            if (v8->field_c0)
            {
                sub_a36c8c();
                v8->field_c0();
            }
            sub_a368c8();
            sub_a369bc("crypto/evp/m_sigver.c", 688, "EVP_DigestVerifyFinal");
            v0 = v8->field_8;
            v1 = v9;
            goto LABEL_a57a7c;
            goto LABEL_a57a7c;
        }
        v10 = v7->field_78;
        if (!v10)
            goto LABEL_a57a54;
        v11 = v7->field_a0;
        if (v11 & 1)
            v10->field_f8();
        v7->field_a0 = (char)v11 & 254;
        v12 = v10->field_88;
        if (!((char)(*((char *)&a0->field_18 + 1)) >> 1 & 1))
        {
            v13 = a1;
            v14 = a2;
            v15 = sub_a3f728();
            if (v15)
            {
                v16 = (st_a578ec_8 *)v15;
                if (sub_a40520())
                {
                    if (v12)
                        v16->field_28->field_78->field_88();
                    v17 = sub_a3ff7c(v16, &v3, &v2);
                    sub_a3f73c(v16);
LABEL_a57bf4:
                    if (!v12)
                    {
                        v22 = arm64g_calculate_condition(v18, v19, v20, v21);
                        v23 = arm64g_calculate_condition(3, (v22 & 1 ? v17 & 0xffffffff : 0x40000000), 0, 0);
                        if (!(v23 & 1))
                            goto LABEL_a57c00;
                    }
                    else
                    {
                        v24 = arm64g_calculate_condition(v18, v19, v20, v21);
                        v25 = arm64g_calculate_condition(0, (v24 & 1 ? v17 & 0xffffffff : 0x40000000), 0, 0);
                        if (!(v25 & 1))
                        {
LABEL_a57c00:
                            v17 = sub_a5ffe0(v7, v13, v14, &v3, v2);
                        }
                    }
                }
                else
                {
                    sub_a3f73c(v16);
                    v17 = 0xffffffff;
                }
            }
            else
            {
                v17 = 0xffffffff;
            }
        }
        else
        {
            if (v12)
                v12();
            v13 = a1;
            v14 = a2;
            v17 = sub_a3ff7c();
            goto LABEL_a57bf4;
            goto LABEL_a57bf4;
        }
    }
    else
    {
LABEL_a57a54:
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 714, "EVP_DigestVerifyFinal");
LABEL_a57a78:
LABEL_a57a7c:
        sub_a36abc();
        v17 = 0;
    }
    if (*(long long *)&g_10002b0 == v4)
        return v17;
    ___stack_chk_fail();
}
