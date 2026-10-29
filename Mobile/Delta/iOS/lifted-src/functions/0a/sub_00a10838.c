/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa10838..0xa109e0 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_d3c904;

double sub_a10838(void* a0, int a1, int a2)
{
    char v11;  // x22
    long long v12;  // x21
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    unsigned long v2;  // [bp-0x90]
    uint128_t v3;  // [bp-0x88]
    uint128_t v4;  // [bp-0x78]
    unsigned long v5;  // [bp-0x68]
    __m128i v6;  // [bp-0x60]
    __m128i v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x40]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a2 - (a2 & a2 >> 31) * 2;
    *(unsigned long long *)&a0[32] = 0;
    *(uint128_t *)a0 = 0;
    *(uint128_t *)&a0[16] = 0;
    *(unsigned int *)a0 = 1;
    *(uint128_t *)&a0[40] = 0;
    *(uint128_t *)&a0[56] = 0;
    *(unsigned long long *)&a0[72] = 0;
    *(unsigned int *)&a0[40] = 1;
    memset(a0 + 80, 0, 40);
    v12 = &(&g_d3c904)[a1 * 960];
    sub_a1110c();
    sub_a1110c(a0, v12 + 120, ((v11 ^ 2) & 0xff) - 1 >> 31);
    sub_a1110c(a0, v12 + 240, ((v11 ^ 3) & 0xff) - 1 >> 31);
    sub_a1110c(a0, v12 + 360, ((v11 ^ 4) & 0xff) - 1 >> 31);
    sub_a1110c(a0, v12 + 480, ((v11 ^ 5) & 0xff) - 1 >> 31);
    sub_a1110c(a0, v12 + 600, ((v11 ^ 6) & 0xff) - 1 >> 31);
    sub_a1110c(a0, v12 + 720, ((v11 ^ 7) & 0xff) - 1 >> 31);
    sub_a1110c(a0, v12 + 840, ((v11 ^ 8) & 0xff) - 1 >> 31);
    v0 = (int128_t)a0[40];
    v1 = (int128_t)a0[56];
    v2 = (long long)a0[72];
    v3 = *(int128_t *)a0;
    v4 = (int128_t)a0[16];
    v5 = (long long)a0[32];
    v6 = _mm_sub_epi32(_mm_setzero_si128(), (int128_t)a0[80]);
    v7 = _mm_sub_epi32(_mm_setzero_si128(), (int128_t)a0[96]);
    v8 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(_mm_setzero_si128(), __double_as_longlong((double)a0[112])));
    sub_a1110c(a0, &v0, __ROL__(a2, 25) & 4261412865 & 1);
    return v8;
}
