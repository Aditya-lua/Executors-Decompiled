/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb42f0..0xb4348 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b42f0_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned int field_20;
} st_b42f0_0;


long long sub_b42f0(st_b42f0_0 *a0, unsigned long a1, unsigned int a2, unsigned int a3)
{
    unsigned long long v0;  // x10
    unsigned int v1;  // w11
    unsigned long v2;  // x8
    __m128i v3;  // q1
    uint128_t v5;  // q1
    unsigned long v6;  // d0

    v0 = a0->field_10;
    if (1 >= a2)
        a2 = 1;
    v1 = a3 - a0->field_8 - a2;
    v2 = v1 - 2;
    a0->field_8 = a0->field_8 + v2;
    a0->field_10 = v0 + v2;
    v3 = *(unsigned long long *)&*(double *)&a0->field_18;
    v5 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v3, v2 & 0xffffffff | (v2 & 0xffffffff) * 0x100000000));
    v6 = __dirty_unsupported_Iop_ZeroHI64ofV128(v5 ^ (v5 ^ 8589934594) & __dirty_unsupported_Iop_ZeroHI64ofV128(CmpGTV(v1 | v1 * 0x100000000, v3)));
    a0->field_18 = v6;
    a0->field_20 = a0->field_20 + 1;
    return v2;
}
