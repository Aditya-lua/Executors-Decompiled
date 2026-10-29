/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9858dc..0x985ac0 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_9858dc(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    unsigned long v24;  // x0
    unsigned long v25;  // x19
    unsigned long v26;  // x0
    unsigned long v28;  // x0
    uint128_t v0;  // [bp-0x1e0]
    uint128_t v1;  // [bp-0x1d0]
    unsigned long long v2;  // [bp-0x1c0]
    unsigned int v3;  // [bp-0x1b8]
    unsigned int v4;  // [bp-0x1b4]
    char v5;  // [bp-0x1b0]
    uint128_t v6;  // [bp-0x188]
    uint128_t v7;  // [bp-0x178]
    unsigned long long v8;  // [bp-0x168]
    uint128_t v9;  // [bp-0x160]
    uint128_t v10;  // [bp-0x150]
    unsigned long long v11;  // [bp-0x140]
    uint128_t v12;  // [bp-0x138]
    uint128_t v13;  // [bp-0x128]
    unsigned long long v14;  // [bp-0x118]
    uint128_t v15;  // [bp-0x110]
    uint128_t v16;  // [bp-0x100]
    unsigned long long v17;  // [bp-0xf0]
    uint128_t v18;  // [bp-0xe8]
    uint128_t v19;  // [bp-0xd8]
    unsigned long long v20;  // [bp-0xc8]
    unsigned long v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0], Other Possible Types: long long

    v22 = &v23;
    v21 = *(long long *)&g_10002b0;
    v3 = 1;
    v4 = 0;
    v24 = sub_a50a58(a2);
    if (v24)
    {
        v25 = sub_a537e4(a0, "HKDF", a1);
        if (!v25 || (v26 = sub_a53488(v25), !v26))
            goto LABEL_985a70;
        sub_a6ffac("key-check", &v4);
        sub_a6ffac("mode", &v3);
        v6 = v0;
        v7 = v1;
        v8 = v2;
        sub_a71618("digest", v24, 0);
        v9 = v0;
        v10 = v1;
        v11 = v2;
        sub_a71670("salt", a3, a4);
        v12 = v0;
        v13 = v1;
        v14 = v2;
        v15 = v0;
        v16 = v1;
        v17 = v2;
        sub_a71bbc(sub_a71670("key", a5, a6), a5, a6);
        v18 = v0;
        v19 = v1;
        v20 = v2;
        v28 = sub_a53798(v26, a7, v23, &v5);
    }
    else
    {
        v25 = 0;
LABEL_985a70:
        v28 = 0;
    }
    sub_a53588();
    sub_a53b90(v25);
    if (*(long long *)&g_10002b0 == v21)
        return v28;
    ___stack_chk_fail();
}
