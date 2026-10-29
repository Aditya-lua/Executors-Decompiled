/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa08e88..0xa08f10 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a08e88(long long a0, long long a1)
{
    uint128_t v7;  // q0
    unsigned long v9;  // d0
    unsigned long v10;  // x8
    uint128_t v0;  // [bp-0x60]
    uint128_t v1;  // [bp-0x50]
    uint128_t v2;  // [bp-0x40]
    uint128_t v3;  // [bp-0x30]
    unsigned long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    sub_a08d40(&v0, a0, a1);
    sub_a085fc(&v0);
    if (*(long long *)&g_10002b0 == v4)
    {
        v7 = v0 | v2 | v1 | v3;
        v9 = __dirty_unsupported_Iop_ZeroHI64ofV128(v7 | __dirty_unsupported_Iop_SliceV128(v7, v7, 8));
        v10 = __double_as_longlong(v9);
        return (long long)(v10 - 1 & ~v10) >> 63;
    }
    ___stack_chk_fail();
}
