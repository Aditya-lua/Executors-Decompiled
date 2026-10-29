/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b6f0..0xa5b7c4 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5b6f0_0 {
    char padding_0[96];
    struct st_a5b6f0_0 *field_60;
    long long field_68;
    unsigned long long field_70;
} st_a5b6f0_0;

extern char g_10002b0;

st_a5b6f0_0 * sub_a5b6f0(st_a5b6f0_0 *a0, st_a5b6f0_0 *a1, long long a2, long long a3)
{
    st_a5b6f0_0 *v11;  // x0
    long long v12;  // x1
    st_a5b6f0_0 *v13;  // w0
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x80]
    char v3;  // [bp-0x78]
    uint128_t v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x30]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (a1)
    {
        sub_a71bbc(sub_a71670(a1, a2, a3), a2, a3);
        v4 = v0;
        v5 = v1;
        v6 = v2;
        if (a0)
        {
            v11 = a0->field_60;
            if (v11)
            {
                v12 = a0->field_68;
                a0->field_70 = a0->field_70 + 1;
                v13 = (st_a5b6f0_0 *)(unsigned int)sub_a55b90(v11, v12, &v3);
                if (*(long long *)&g_10002b0 == v7)
                    return v13;
                ___stack_chk_fail();
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 2445, "EVP_PKEY_set_params");
        sub_a36abc(6, 163, 0);
    }
    if (*(long long *)&g_10002b0 == v7)
        return 0;
    ___stack_chk_fail();
}
