/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50ec8..0xa5100c (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a50ec8(long long a0, long long a1, long long a2)
{
    char *v12;  // x8
    char *v13;  // x8
    unsigned long v14;  // x19
    unsigned long v0;  // [bp-0xa8]
    char *v1;  // [bp-0xa0]
    unsigned long v2;  // [bp-0x98]
    uint128_t v3;  // [bp-0x90]
    uint128_t v4;  // [bp-0x80]
    uint128_t v5;  // [bp-0x70]
    uint128_t v6;  // [bp-0x60]
    uint128_t v7;  // [bp-0x50]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v3 = 0;
    v1 = &v10;
    if (!sub_a6e200(a2, "RSA"))
    {
        v13 = v1;
        v1 = v13 + 8;
        v0 = *(long long *)&v10;
        sub_a70ed8("bits", &v0);
    }
    else if (!sub_a6e200(a2, "EC"))
    {
        v12 = v1;
        v1 = v12 + 8;
        sub_a71618("group", *(long long *)&v10, 0);
    }
    v2 = 0;
    v14 = sub_a5d168(a0, a2, a1);
    if (v14 && (int)sub_a5ca90(v14) >= 1 && sub_a5db1c(v14, &v3))
        sub_a5ca98(v14, &v2);
    sub_a5d6b0(v14);
    if (*(long long *)&g_10002b0 == v8)
        return v2;
    ___stack_chk_fail(v2);
}
