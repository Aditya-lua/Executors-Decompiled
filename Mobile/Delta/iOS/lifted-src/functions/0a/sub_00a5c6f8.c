/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5c6f8..0xa5c7c8 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5c6f8_2 {
    char padding_0[120];
    struct st_a5c6f8_1 *field_78;
    char padding_80[8];
    struct st_a5c6f8_0 *field_88;
} st_a5c6f8_2;

typedef struct st_a5c6f8_1 {
    char padding_0[232];
    struct st_a5c6f8_0 *field_e8;
} st_a5c6f8_1;

typedef struct st_a5c6f8_0 {
    struct st_a5c6f8_0 *field_0;
    struct st_a5c6f8_0 *field_8;
    char padding_10[216];
    struct st_a5c6f8_0 *field_e8;
} st_a5c6f8_0;


st_a5c6f8_0 * sub_a5c6f8(st_a5c6f8_2 *a0, unsigned long a1)
{
    st_a5c6f8_0 *v2;  // x19
    st_a5c6f8_0 *v3;  // w0
    unsigned long long v4;  // 4112
    st_a5c6f8_0 *v5;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_88;
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_check.c", 53, "evp_pkey_public_check_combined");
        sub_a36abc(6, 154, 0);
        return 0;
    }
    v3 = (st_a5c6f8_0 *)(unsigned int)sub_a5c8a0();
    v4 = arm64g_calculate_condition(0x11, (unsigned long long)v3, 1, 0);
    if (v4 & 1)
        return v3;
    if ((int)v2->field_0)
    {
        v5 = a0->field_78->field_e8;
        if (a0->field_78->field_e8 || v2->field_8 && (v5 = v2->field_8->field_e8, v2->field_8->field_e8))
            goto *((void *)(v5));
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/pmeth_check.c", 78, "evp_pkey_public_check_combined");
    sub_a36abc(6, 150, 0);
    return 0xfffffffe;
}
