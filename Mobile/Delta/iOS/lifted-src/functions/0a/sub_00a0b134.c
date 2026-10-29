/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0b134..0xa0b498 (868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

unsigned long long sub_a0b134(void* a0, uint128_t *a1)
{
    unsigned int i;  // x9
    unsigned int v23;  // w8
    void* v32;  // x20
    void* v33;  // x20
    unsigned long long v34;  // x26
    void* v35;  // x21
    void* v36;  // x21
    void* v37;  // x22
    void* v38;  // x22
    unsigned long long j;  // x26
    unsigned int v40;  // x23
    unsigned int v41;  // x25
    uint128_t v24;  // q2
    unsigned long long k;  // x25
    unsigned long long v43;  // x0
    __m128i v25;  // q3
    __m128i v26;  // q4
    __m128i v27;  // q5
    __m128i v28;  // q6
    unsigned int v29;  // w11
    unsigned int v30;  // w12
    unsigned int v31;  // x23
    char v0;  // [bp-0x238]
    char v1;  // [bp-0x1c0]
    char v2;  // [bp-0x198]
    char v3;  // [bp-0x170]
    char v4;  // [bp-0x148]
    uint128_t v5;  // [bp-0x120]
    uint128_t v6;  // [bp-0x110]
    unsigned long v7;  // [bp-0x100]
    uint128_t v8;  // [bp-0xf8]
    uint128_t v9;  // [bp-0xe8]
    unsigned long v10;  // [bp-0xd8]
    uint128_t v11;  // [bp-0xd0]
    uint128_t v12;  // [bp-0xc0]
    unsigned long v13;  // [bp-0xb0]
    char v14;  // [bp-0xa8]
    __m128i v15;  // [bp-0x98]
    __m128i v16;  // [bp-0x88]
    __m128i v17;  // [bp-0x78]
    char v18;  // [bp-0x69]
    unsigned long v19;  // [bp-0x68]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    i = 0;
    v23 = 0;
    v19 = *(long long *)&g_10002b0;
    v24 = CONCAT(0xf0f0f0f0f0f0f0f, 0xf0f0f0f0f0f0f0f);
    v25 = _mm_and_si128(*a1, v24);
    v26 = ShrNV(*a1, 4);
    v27 = _mm_and_si128(a1[1], v24);
    v15 = _mm_unpackhi_epi8(v25, v26);
    v14 = (char)_mm_unpacklo_epi8(v25, v26);
    v28 = ShrNV(a1[1], 4);
    v17 = _mm_unpackhi_epi8(v27, v28);
    v16 = _mm_unpacklo_epi8(v27, v28);
    do
    {
        v29 = (&v14)[i] + v23;
        v30 = v29 + 8;
        v23 = (long long)(v30 * &_NSHomeDirectory) >> 31 & 0xfffffff0 | __ROL__(v30, 28) & 4026531855 & 15;
        (&v14)[i] = v29 - (v30 & 240);
        i += 1;
    } while (i != 63);
    v31 = 0;
    v18 = (char)_mm_extract_epi8(v17, 15) + (char)v23;
    *(uint128_t *)a0 = 0;
    *(uint128_t *)&a0[16] = 0;
    v32 = a0;
    *(uint128_t *)&v32[40] = 0;
    v33 = v32 + 40;
    *(unsigned long long *)&a0[32] = 0;
    *(uint128_t *)&a0[56] = 0;
    *(unsigned long long *)&a0[72] = 0;
    v34 = 1;
    *(unsigned int *)v33 = 1;
    v35 = a0;
    *(uint128_t *)&v35[80] = 0;
    v36 = v35 + 80;
    *(uint128_t *)&a0[96] = 0;
    *(unsigned long long *)&a0[112] = 0;
    *(unsigned int *)v36 = 1;
    v37 = a0;
    *(uint128_t *)&v37[120] = 0;
    v38 = v37 + 120;
    *(uint128_t *)&a0[0x88] = 0;
    *(unsigned long long *)&a0[152] = 0;
    do
    {
        j = v34;
        sub_a10838(&v0, v31, (&v14)[j]);
        sub_a109e0(&v1, a0, &v0);
        sub_a10314(a0, &v1, &v4);
        sub_a10314(v33, &v2, &v3);
        sub_a10314(v36, &v3, &v4);
        sub_a10314(v38, &v1, &v2);
        v31 += 1;
        v34 = j + 2;
    } while (j < 62);
    v5 = *(int128_t *)a0;
    v6 = (int128_t)a0[16];
    v8 = *(int128_t *)v33;
    v9 = (int128_t)v33[16];
    v7 = (long long)a0[32];
    v10 = (long long)v33[32];
    v11 = *(int128_t *)v36;
    v12 = (int128_t)v36[16];
    v13 = (long long)v36[32];
    sub_a10c84(&v1, &v5);
    sub_a10314(&v5, &v1, &v4);
    sub_a10314(&v8, &v2, &v3);
    sub_a10314(&v11, &v3, &v4);
    sub_a10c84(&v1, &v5);
    sub_a10314(&v5, &v1, &v4);
    sub_a10314(&v8, &v2, &v3);
    sub_a10314(&v11, &v3, &v4);
    sub_a10c84(&v1, &v5);
    sub_a10314(&v5, &v1, &v4);
    sub_a10314(&v8, &v2, &v3);
    sub_a10314(&v11, &v3, &v4);
    sub_a10c84(&v1, &v5);
    sub_a10314(a0, &v1, &v4);
    sub_a10314(v33, &v2, &v3);
    sub_a10314(v36, &v3, &v4);
    sub_a10314(v38, &v1, &v2);
    v40 = 0;
    v41 = 0;
    do
    {
        k = v41;
        sub_a10838(&v0, v40, (&v14)[k]);
        sub_a109e0(&v1, a0, &v0);
        sub_a10314(a0, &v1, &v4);
        sub_a10314(v33, &v2, &v3);
        sub_a10314(v36, &v3, &v4);
        sub_a10314(v38, &v1, &v2);
        v40 += 1;
        v41 = k + 2;
    } while (k < 62);
    v43 = sub_a66ec0(&v14, 64);
    if (*(long long *)&g_10002b0 == v19)
        return v43;
    ___stack_chk_fail();
}
