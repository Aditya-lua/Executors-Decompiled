/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4d5dc..0xa4dbd4 (1528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4d5dc_0 {
    struct st_a4d5dc_0 *field_0;
    char padding_8[72];
    struct st_a4d5dc_0 *field_50;
    char padding_58[32];
    struct st_a4d5dc_0 *field_78;
} st_a4d5dc_0;

typedef struct st_a4d5dc_1 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_a4d5dc_1;

extern st_a4d5dc_1 g_def280;
extern char g_10002b0;

st_a4d5dc_0 * sub_a4d5dc(st_a4d5dc_0 *a0, unsigned int a1, int a2)
{
    st_a4d5dc_0 *v14;  // x9
    long long v15;  // x1
    unsigned long v0;  // [bp-0xf8]
    st_a4d5dc_0 *v1;  // [bp-0xf0]
    st_a4d5dc_0 *v2;  // [bp-0xe0]
    st_a4d5dc_0 *v3;  // [bp-0xd0]
    st_a4d5dc_0 *v4;  // [bp-0xc0]
    st_a4d5dc_0 *v5;  // [bp-0xb0]
    st_a4d5dc_0 *v6;  // [bp-0xa0]
    st_a4d5dc_0 *v7;  // [bp-0x90]
    st_a4d5dc_0 *v8;  // [bp-0x80]
    st_a4d5dc_0 *v9;  // [bp-0x70]
    st_a4d5dc_0 *v10;  // [bp-0x60]
    unsigned long v11;  // [bp-0x48]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v0 = a2;
    v9 = (st_a4d5dc_0 *)0;
    v10 = (st_a4d5dc_0 *)0;
    v7 = (st_a4d5dc_0 *)0;
    v8 = (st_a4d5dc_0 *)0;
    v5 = (st_a4d5dc_0 *)0;
    v6 = (st_a4d5dc_0 *)0;
    v3 = (st_a4d5dc_0 *)0;
    v4 = (st_a4d5dc_0 *)0;
    v1 = (st_a4d5dc_0 *)0;
    v2 = (st_a4d5dc_0 *)0;
    if (!a0 || (v14 = a0->field_0, !v14))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_enc.c", 1444, "EVP_CIPHER_CTX_ctrl");
        v15 = 131;
    }
    else if (v14->field_78)
    {
        if (39 >= a1)
        {
            goto *((void *)(sub_a4d664 + (&g_def280.field_0)[a1] * 4));
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_enc.c", 1638, "EVP_CIPHER_CTX_ctrl");
            v15 = 133;
        }
    }
    else
    {
        if (v14->field_50)
            v14->field_50();
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_enc.c", 1630, "EVP_CIPHER_CTX_ctrl");
        v15 = 132;
    }
    sub_a36abc(6, v15, 0);
    if (*(long long *)&g_10002b0 == v11)
        return 0;
    ___stack_chk_fail();
}
