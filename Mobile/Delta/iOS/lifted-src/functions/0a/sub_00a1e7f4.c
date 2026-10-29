/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1e7f4..0xa1e984 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a1e7f4(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    long long v16;  // x0
    long long v17;  // x2
    long long v18;  // x0
    long long v19;  // x0
    long long v20;  // x22
    long long v22;  // x20
    uint128_t v0;  // [bp-0x138]
    uint128_t v1;  // [bp-0x128]
    unsigned long long v2;  // [bp-0x118]
    char v3;  // [bp-0x110]
    uint128_t v4;  // [bp-0xe8]
    uint128_t v5;  // [bp-0xd8]
    unsigned long long v6;  // [bp-0xc8]
    uint128_t v7;  // [bp-0xc0]
    uint128_t v8;  // [bp-0xb0]
    unsigned long long v9;  // [bp-0xa0]
    uint128_t v10;  // [bp-0x98]
    uint128_t v11;  // [bp-0x88]
    unsigned long long v12;  // [bp-0x78]
    unsigned long v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0], Other Possible Types: long long

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    v16 = sub_a50a58(a6);
    v17 = v15;
    v18 = sub_a537e4(a7, "X963KDF", v17);
    v19 = sub_a53488(v18, "X963KDF", v17);
    if (v19)
    {
        v20 = v19;
        sub_a71618("digest", v16, 0);
        sub_a71670("key", a2, a3);
        v4 = v0;
        v5 = v1;
        v6 = v2;
        v7 = v0;
        v8 = v1;
        v9 = v2;
        sub_a71bbc(sub_a71670("info", a4, a5), a4, a5);
        v10 = v0;
        v11 = v1;
        v12 = v2;
        v22 = (int)sub_a53798(v20, a0, a1, &v3) > 0;
        sub_a53588(v20);
    }
    else
    {
        v22 = 0;
    }
    sub_a53b90(v18);
    if (*(long long *)&g_10002b0 == v13)
        return v22;
    ___stack_chk_fail();
}
