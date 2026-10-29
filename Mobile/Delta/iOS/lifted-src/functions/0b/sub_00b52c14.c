/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52c14..0xb52d08 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52c14_0 {
    char padding_0[24];
    unsigned int field_18;
    char padding_1c[156];
    struct st_b52c14_0 *field_b8;
    struct st_b52c14_0 *field_c0;
} st_b52c14_0;

extern char g_10002b0;

st_b52c14_0 * sub_b52c14(st_b52c14_0 *a0)
{
    st_b52c14_0 *v11;  // x0
    st_b52c14_0 **v12;  // x21
    st_b52c14_0 *v13;  // x0
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x90]
    st_b52c14_0 *v3;  // [bp-0x88]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    sub_a71bbc(sub_a71670("signature"));
    v4 = v0;
    v5 = v1;
    v6 = v2;
    if (a0)
    {
        if (v3 && a0->field_18 == 0x8000)
        {
            v11 = sub_a6fbc4(&v3, "signature");
            if (v11)
            {
                v12 = &a0->field_b8;
                sub_a6c2e4(a0->field_b8, "providers/implementations/signature/rsa_sig.c", 2019);
                *v12 = 0;
                a0->field_c0 = 0;
                v13 = sub_a71440(v11, v12, 0, &a0->field_c0);
                if (!(unsigned int)v13)
                {
                    if (*(long long *)&g_10002b0 == v7)
                        return v13;
                    ___stack_chk_fail();
                }
            }
        }
        if (*(long long *)&g_10002b0 == v7)
            return 1;
        ___stack_chk_fail();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v7)
            return 0;
        ___stack_chk_fail();
    }
}
