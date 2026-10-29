/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb025f0..0xb02688 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_b025f0(unsigned long a0, void* a1)
{
    uint128_t v5;  // q0
    unsigned long v7;  // x8
    unsigned long v8;  // x9
    unsigned long long v9;  // x8
    unsigned long long v10;  // x9
    uint128_t v0;  // [bp-0x30], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x28]
    unsigned long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (a1 & 0x7)
    {
        v5 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*(int128_t *)a1);
        v0 = __dirty_unsupported_Iop_SliceV128(v5, v5, 8);
        v7 = v0;
        v8 = *(unsigned long long *)((void*)&v0 + 8);
    }
    else
    {
        v7 = __builtin_bswap64((long long)a1[8]);
        v8 = __builtin_bswap64(*(long long *)a1);
    }
    v9 = __builtin_bswap64(v7);
    v10 = __builtin_bswap64(v8);
    v0 = ((long long)(v10 * 0x8000000000000000) >> 63 & 0xfffffffffffffffe | v10 & 1) & 0xe100000000000000 ^ v9 >> 1;
    v1 = v9 * 0x8000000000000000 | v10 >> 1;
    sub_a94a84();
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
}
