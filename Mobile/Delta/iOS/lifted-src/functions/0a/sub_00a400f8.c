/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa400f8..0xa40364 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a400f8_0 {
    char padding_0[80];
    struct st_a400f8_1 *field_50;
    char padding_58[64];
    struct st_a400f8_2 *field_98;
    char padding_a0[48];
    struct st_a400f8_2 *field_d0;
} st_a400f8_0;

typedef struct st_a400f8_3 {
    char padding_0[272];
    struct st_a400f8_2 *field_110;
} st_a400f8_3;

typedef struct st_a400f8_4 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a400f8_3 *field_28;
} st_a400f8_4;

typedef struct st_a400f8_5 {
    char padding_0[8];
    struct st_a400f8_0 *field_8;
    char padding_10[9];
    char field_19;
    char padding_1a[14];
    struct st_a400f8_4 *field_28;
} st_a400f8_5;

typedef struct st_a400f8_1 {
    unsigned long long field_0;
} st_a400f8_1;

typedef struct st_a400f8_2 {
    char field_0;
} st_a400f8_2;

extern char g_10002b0;

char sub_a400f8(st_a400f8_5 *a0, unsigned long a1, unsigned long a2)
{
    st_a400f8_0 *v10;  // x0
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long v22;  // cc_op
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    st_a400f8_4 *v12;  // x8
    st_a400f8_0 *v13;  // x8
    long long v14;  // x1
    long long v15;  // x1
    unsigned long long v17;  // x8
    uint128_t v0;  // [bp-0xb8]
    uint128_t v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x90]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v3 = a2;
    v10 = a0->field_8;
    if (!v10)
    {
        sub_a368c8(NULL);
        sub_a369bc("crypto/evp/digest.c", 505, "EVP_DigestFinalXOF");
        v15 = 218;
    }
    else if (*(long long *)&v10->padding_58[24])
    {
        if (!v10->field_98)
        {
            sub_a368c8();
            v14 = 513;
        }
        else if (!(a0->field_19 >> 3 & 1))
        {
            sub_a71bbc(sub_a70ed8("xoflen", &v3), &v3);
            v4 = v0;
            v5 = v1;
            v6 = v2;
            v12 = a0->field_28;
            if (v12 && (v12->field_0 == 0x100 || v12->field_0 == 128) && *(long long *)&v12[1].field_0 && v12->field_28->field_110)
                v12->field_28->field_110();
            v13 = a0->field_8;
            if (!v13->field_d0)
                v13->field_98();
            v13->field_d0();
        }
        else
        {
            sub_a368c8();
            v14 = 518;
        }
        sub_a369bc("crypto/evp/digest.c", v14, "EVP_DigestFinalXOF");
        v15 = 188;
    }
    else
    {
        v17 = a2 >> 31;
        if (sub_a50b14())
        {
            v20 = arm64g_calculate_condition(v22 | 16, v23, v18, v19);
            v21 = arm64g_calculate_condition(20, (v20 & 1 ? v17 : 0), 0, 0);
            if (!(v21 & 1))
                a0->field_8->field_50();
        }
        else
        {
            v24 = arm64g_calculate_condition(v22 | 16, v23, v18, v19);
            v25 = arm64g_calculate_condition(16, (v24 & 1 ? v17 : 0), 0, 0);
            if (!(v25 & 1))
                a0->field_8->field_50();
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 548, "EVP_DigestFinalXOF");
        v15 = 178;
    }
    sub_a36abc(6, v15, 0);
    if (*(long long *)&g_10002b0 == v7)
        return 0;
    ___stack_chk_fail();
}
