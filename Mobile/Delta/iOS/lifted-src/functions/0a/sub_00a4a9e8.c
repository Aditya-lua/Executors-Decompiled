/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4a9e8..0xa4ab0c (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4a9e8_0 {
    char padding_0[1];
    char field_1;
    char padding_2[118];
    struct st_a4a9e8_1 *field_78;
} st_a4a9e8_0;

typedef struct st_a4a9e8_1 {
    unsigned int field_0;
} st_a4a9e8_1;

extern char g_10002b0;

unsigned long long sub_a4a9e8(st_a4a9e8_0 *a0, unsigned int a1)
{
    unsigned long long v11;  // 4118
    unsigned long long v13;  // x0
    unsigned long long v14;  // 4112
    long long v15;  // x2
    long long v16;  // x1
    uint128_t v0;  // [bp-0xa8]
    uint128_t v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x7c]
    char v4;  // [bp-0x78]
    uint128_t v5;  // [bp-0x50]
    uint128_t v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x30]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v3 = a1;
    if (!a0 || !(a0->field_1 >> 3 & 1))
    {
        sub_a368c8();
        v15 = "evp_pkey_ctx_getset_ecdh_param_checks";
        v16 = 26;
        goto LABEL_a4aa30;
    }
    else if (*(long long *)&a0->padding_2[30] || !a0->field_78 || *(int *)a0->field_78 == 408)
    {
        v11 = arm64g_calculate_condition(49, a1 - 2, 3, 0);
        if (v11 & 1)
            goto LABEL_a4aa44;
        sub_a71bbc(sub_a6ffac("ecdh-cofactor-mode", &v3), &v3);
        v5 = v0;
        v6 = v1;
        v7 = v2;
        v13 = sub_a5df54(a0, &v4);
        v14 = arm64g_calculate_condition(0x11, v13 & 0xffffffff, 2, 0);
        if (!(v14 & 1))
        {
            sub_a368c8();
            v15 = "EVP_PKEY_CTX_set_ecdh_cofactor_mode";
            v16 = 65;
LABEL_a4aa30:
            sub_a369bc("crypto/evp/ec_ctrl.c", v16, v15);
            sub_a36abc(6, 147, 0);
LABEL_a4aa44:
            v13 = 0xfffffffe;
        }
    }
    else
    {
        v13 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v8)
        return v13;
    ___stack_chk_fail();
}
