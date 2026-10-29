/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x996ed0..0x997000 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_996ed0(long long a0, long long a1, long long a2, long long a3)
{
    unsigned long long v14;  // w0
    unsigned long long v16;  // w0
    uint128_t v0;  // [bp-0xe0]
    uint128_t v1;  // [bp-0xd0]
    unsigned long long v2;  // [bp-0xc0]
    unsigned long long v3;  // [bp-0xb8]
    char v4;  // [bp-0xb0]
    uint128_t v5;  // [bp-0x88]
    uint128_t v6;  // [bp-0x78]
    unsigned long long v7;  // [bp-0x68]
    uint128_t v8;  // [bp-0x60]
    uint128_t v9;  // [bp-0x50]
    unsigned long long v10;  // [bp-0x40]
    unsigned long v11;  // [bp-0x38]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v3 = 0;
    if (!(sub_a2cf88(a2) >> 21 & 1) && !*(int *)(a0 + 4272))
    {
        v14 = (unsigned int)sub_a50ac8(a3);
        if (v14 >= 1)
            v3 = v14;
    }
    sub_a6ffac("tls-version", a0 + 20);
    v5 = v0;
    v6 = v1;
    v7 = v2;
    sub_a71bbc(sub_a70ed8("tls-mac-size", &v3), &v3);
    v8 = v0;
    v9 = v1;
    v10 = v2;
    if (sub_a4dcac(a1, &v4))
    {
        v16 = 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 86, "ossl_set_tls_provider_parameters");
        sub_a36abc(20, 0xc0103, 0);
        v16 = 0;
    }
    if (*(long long *)&g_10002b0 == v11)
        return v16;
    ___stack_chk_fail();
}
