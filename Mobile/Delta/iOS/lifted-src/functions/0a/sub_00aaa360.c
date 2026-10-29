/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaa360..0xaaa3dc (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_aaa360(double *a0, unsigned int *a1, long long a2, unsigned int a3)
{
    unsigned long long v4;  // x0
    __m128i v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v0 = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), *(unsigned long long *)&*a0), 32);
    if (a3)
        v4 = sub_aaa148(&v0, a2);
    else
        v4 = sub_aaa244(&v0, a2);
    *a1 = _mm_cvtsi128_si64(v0);
    a1[1] = _mm_extract_epi64(v0, 1);
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
