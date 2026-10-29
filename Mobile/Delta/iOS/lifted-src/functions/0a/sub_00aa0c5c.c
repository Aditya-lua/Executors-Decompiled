/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa0c5c..0xaa0e40 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_aa0c5c(long long a0, int a1, long long a2, int a3, unsigned int a4, unsigned int a5, unsigned int a6, long long a7, unsigned long a8, long long a9, long long a10)
{
    long long v23;  // x0
    long long v24;  // x21
    uint128_t v0;  // [bp-0x188]
    uint128_t v1;  // [bp-0x178]
    unsigned long long v2;  // [bp-0x168]
    unsigned int v3;  // [bp-0x160]
    unsigned int v4;  // [bp-0x15c]
    char v5;  // [bp-0x158]
    uint128_t v6;  // [bp-0x130]
    uint128_t v7;  // [bp-0x120]
    unsigned long long v8;  // [bp-0x110]
    uint128_t v9;  // [bp-0x108]
    uint128_t v10;  // [bp-0xf8]
    unsigned long long v11;  // [bp-0xe8]
    uint128_t v12;  // [bp-0xe0]
    uint128_t v13;  // [bp-0xd0]
    unsigned long long v14;  // [bp-0xc0]
    uint128_t v15;  // [bp-0xb8]
    uint128_t v16;  // [bp-0xa8]
    unsigned long long v17;  // [bp-0x98]
    uint128_t v18;  // [bp-0x90]
    uint128_t v19;  // [bp-0x80]
    unsigned long long v20;  // [bp-0x70]
    unsigned long v21;  // [bp-0x68]
    char *v22;  // [bp-0x10]

    v22 = &a8;
    v21 = *(long long *)&g_10002b0;
    v3 = a5;
    v4 = a4;
    if ((int)a6 >= 1)
    {
        v23 = sub_a537e4(a9, "PKCS12KDF", a10);
        if (v23)
        {
            v24 = sub_a53488();
            sub_a53b90(v23);
            if (!v24)
                goto LABEL_aa0e00;
            sub_a71618("digest", sub_a50a58(a8), 0);
            sub_a71670("pass", a0, a1);
            v6 = v0;
            v7 = v1;
            v8 = v2;
            sub_a71670("salt", a2, a3);
            v9 = v0;
            v10 = v1;
            v11 = v2;
            sub_a6ffac("id", &v4);
            v12 = v0;
            v13 = v1;
            v14 = v2;
            v15 = v0;
            v16 = v1;
            v17 = v2;
            sub_a71bbc(sub_a6ffac("iter", &v3), &v3);
            v18 = v0;
            v19 = v1;
            v20 = v2;
            v23 = sub_a53798(v24, a7, a6, &v5) != 0;
            sub_a53588(v24);
        }
    }
    else
    {
LABEL_aa0e00:
        v23 = 0;
    }
    if (*(long long *)&g_10002b0 == v21)
        return v23;
    ___stack_chk_fail();
}
