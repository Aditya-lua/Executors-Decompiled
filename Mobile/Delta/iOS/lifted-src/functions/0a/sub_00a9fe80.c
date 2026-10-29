/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9fe80..0xaa002c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a9fe80(long long a0, long long a1, unsigned int a2, long long a3, unsigned int a4, long long a5, long long a6)
{
    long long v19;  // x0
    long long v20;  // x20
    uint128_t v0;  // [bp-0x158]
    uint128_t v1;  // [bp-0x148]
    unsigned long long v2;  // [bp-0x138]
    char v3;  // [bp-0x130]
    uint128_t v4;  // [bp-0x108]
    uint128_t v5;  // [bp-0xf8]
    unsigned long long v6;  // [bp-0xe8]
    uint128_t v7;  // [bp-0xe0]
    uint128_t v8;  // [bp-0xd0]
    unsigned long long v9;  // [bp-0xc0]
    uint128_t v10;  // [bp-0xb8]
    uint128_t v11;  // [bp-0xa8]
    unsigned long long v12;  // [bp-0x98]
    uint128_t v13;  // [bp-0x90]
    uint128_t v14;  // [bp-0x80]
    unsigned long long v15;  // [bp-0x70]
    unsigned long v16;  // [bp-0x68]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    v19 = sub_a537e4(a5, "PVKKDF", a6);
    if (v19)
    {
        v20 = sub_a53488();
        sub_a53b90(v19);
        if (v20)
        {
            sub_a71670("salt", a1, a2);
            sub_a71670("pass", a3, a4);
            v4 = v0;
            v5 = v1;
            v6 = v2;
            sub_a71618("digest", "SHA1", 0);
            v7 = v0;
            v8 = v1;
            v9 = v2;
            v10 = v0;
            v11 = v1;
            v12 = v2;
            sub_a71bbc(sub_a71618("properties", a6, 0), a6, 0);
            v13 = v0;
            v14 = v1;
            v15 = v2;
            v19 = sub_a53798(v20, a0, 20, &v3);
            sub_a53588(v20);
        }
        else
        {
            v19 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v16)
        return v19;
    ___stack_chk_fail();
}
