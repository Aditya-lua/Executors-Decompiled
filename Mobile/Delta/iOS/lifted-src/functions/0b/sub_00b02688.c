/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb02688..0xb0275c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

double sub_b02688(long long a0, uint128_t *a1, uint128_t *a2, unsigned long long a3)
{
    uint128_t v5;  // q0
    unsigned long long i;  // x24
    uint128_t v8;  // q0
    uint128_t v10;  // q0
    uint128_t v11;  // q0
    uint128_t v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*a1);
    v1 = __dirty_unsupported_Iop_SliceV128(v5, v5, 8);
    if (a3)
    {
        i = 0;
        do
        {
            v8 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*(int128_t *)((char *)a2 + i));
            v0 = __dirty_unsupported_Iop_SliceV128(v8, v8, 8);
            sub_a94aac(&v1, a0, &v0, 16);
            i += 16;
        } while (i < a3);
    }
    v10 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v1);
    v11 = __dirty_unsupported_Iop_SliceV128(v10, v10, 8);
    *a1 = v11;
    if (*(long long *)&g_10002b0 == v2)
        return *(unsigned long long *)&v11;
    ___stack_chk_fail();
}
