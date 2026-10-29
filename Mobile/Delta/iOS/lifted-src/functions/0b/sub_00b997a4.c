/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb997a4..0xb9986c (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b997a4_0 {
    void* field_0;
    unsigned long long field_8;
    uint128_t field_10;
} st_b997a4_0;


uint128_t * sub_b997a4(st_b997a4_0 *a0, unsigned long long a1, uint128_t *a2)
{
    void* v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v10;  // x11
    unsigned long long v11;  // x11
    unsigned long v12;  // x10
    unsigned long v14;  // x10
    unsigned long long v15;  // 4137
    unsigned long long v16;  // 4139
    unsigned long long v17;  // x10
    unsigned long long v18;  // x10
    char v19;  // x12
    unsigned long long v2;  // x10
    uint128_t *v20;  // x8
    uint128_t v21;  // q1
    __m128i v22;  // q1
    unsigned long v3;  // d0
    unsigned long long i;  // x12
    unsigned long long v5;  // x11
    unsigned long long v7;  // 4128
    unsigned long long v8;  // 4130
    unsigned long long v9;  // x11

    v0 = a0->field_0;
    v1 = a0->field_8;
    v2 = v1 & a1;
    v3 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v0 + v2)));
    i = __double_as_longlong(v3);
    if (!i)
    {
        v5 = 8;
        do
        {
            v2 = v2 + v5 & v1;
            i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v0 + v2)));
            v5 += 8;
        } while (!i);
    }
    v7 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v8 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v9 = ((((v8 | v7) & 0xffff0000ffff0000) >> 16 | (v8 | v7) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v8 | v7) & 0xffff0000ffff0000) >> 16 | (v8 | v7) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v9)
        v10 = 64;
    else
        v10 = Clz(v9);
    v11 = v2 + (v10 >> 3) & v1;
    v12 = *((char *)v0 + v11);
    if (!(v12 >> 31 & 1))
    {
        v14 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v0));
        v15 = ((((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v16 = (((((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v14 & 0xaaaaaaaaaaaaaaaa) >> 1 | v14 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v17 = ((((v16 | v15) & 0xffff0000ffff0000) >> 16 | (v16 | v15) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v16 | v15) & 0xffff0000ffff0000) >> 16 | (v16 | v15) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v17)
            v18 = 64;
        else
            v18 = Clz(v17);
        v11 = v18 >> 3;
        v12 = *((char *)v0 + v11);
    }
    v19 = a1 >> 57;
    *((char *)v0 + v11) = v19;
    *((char *)v0 + (v11 - 8 & v1) + 8) = v19;
    v20 = v0 + -(48 * v11);
    v21 = a2[1];
    *(uint128_t *)((char *)v20 - 48) = *a2;
    *(uint128_t *)((char *)v20 - 32) = v21;
    *(uint128_t *)((char *)v20 - 16) = a2[2];
    v22 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v12 & 1));
    *(__m128i *)&a0->field_10 = _mm_sub_epi64(a0->field_10, v22);
    return v20;
}
