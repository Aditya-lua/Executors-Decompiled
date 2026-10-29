/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f400..0x7f484 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7f400_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned int field_20;
} st_7f400_0;


unsigned long long sub_7f400(st_7f400_0 *a0, char a1, unsigned int a2, unsigned long a3)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x11
    uint128_t v10;  // q1
    unsigned long v11;  // d0
    unsigned long long v2;  // x12
    unsigned long long v3;  // x9
    unsigned int v4;  // w13
    unsigned long v5;  // x13
    unsigned long v6;  // x8
    unsigned long long v7;  // x8
    __m128i v8;  // q1

    v0 = 1 << (a1 & 31);
    v1 = a0->field_10;
    v2 = a3 - a0->field_8;
    v3 = v0 - 1 & (unsigned int)v2;
    if (2 < v0)
        v4 = v0;
    else
        v4 = 2;
    if ((unsigned int)v3 < 2)
        v5 = v4;
    else
        v5 = 0;
    if (a2 < v0)
        v6 = v0;
    else
        v6 = a2;
    v7 = v2 - (v6 + v3) - v5;
    a0->field_8 = a0->field_8 + v7;
    a0->field_10 = v1 + v7;
    v8 = *(unsigned long long *)&*(double *)&a0->field_18;
    v10 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v8, v7 & 0xffffffff | (v7 & 0xffffffff) * 0x100000000));
    v11 = __dirty_unsupported_Iop_ZeroHI64ofV128(v10 ^ (v10 ^ 8589934594) & __dirty_unsupported_Iop_ZeroHI64ofV128(CmpGTV((unsigned int)v7 + 2 | ((unsigned int)v7 + 2) * 0x100000000, v8)));
    a0->field_18 = v11;
    a0->field_20 = a0->field_20 + 1;
    return v7;
}
