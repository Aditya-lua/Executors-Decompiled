/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a730..0xb5a81c (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_b5a730(long long *a0)
{
    long long v8;  // x20
    long long v9;  // x0
    unsigned long long v10;  // x0
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = *a0;
    sub_afe028(a0 + 5);
    sub_a6c2e4(a0[3], "providers/implementations/kdfs/pvkkdf.c", 59);
    sub_a6c4e8(a0[1], a0[2], "providers/implementations/kdfs/pvkkdf.c", 60);
    sub_a66ec0(a0, 64);
    *a0 = v8;
    v3 = 0;
    v4 = 0;
    v1 = 0;
    v2 = 0;
    v0 = 0;
    v9 = sub_9f2aec(v8);
    sub_a71618("digest", "SHA1", 0);
    v10 = sub_afe114(a0 + 5, &v0, v9);
    if (!(unsigned int)v10)
        v10 = sub_afe028(a0 + 5);
    if (*(long long *)&g_10002b0 == v5)
        return v10;
    ___stack_chk_fail();
}
