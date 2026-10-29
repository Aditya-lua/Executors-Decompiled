/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20f8a8..0x20faf8 (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_20f8a8(void* a0, unsigned long long i, void* a2)
{
    unsigned long long v0;  // x8
    unsigned int v1;  // w9
    uint128_t v10;  // q0
    uint128_t v11;  // q0
    uint128_t v12;  // q0
    uint128_t v13;  // q0
    uint128_t v14;  // q0
    uint128_t v15;  // q0
    uint128_t v16;  // q0
    uint128_t v17;  // q0
    uint128_t v18;  // q0
    __m128i v19;  // q0
    char v2;  // x10
    unsigned long long v20;  // x8
    unsigned long long v21;  // x9
    unsigned long long v22;  // x8
    unsigned long long v23;  // x10
    unsigned long long v24;  // x11
    unsigned long long v25;  // x10
    unsigned long long v26;  // x12
    unsigned long long v27;  // x10
    __m128i v28;  // q0
    void* v29;  // x13
    char v3;  // x12
    __m128i v30;  // q3
    uint128_t *iter;  // x13
    unsigned long long j;  // x14
    unsigned long long v33;  // x14
    __m128i v34;  // q5
    __m128i v35;  // q16
    unsigned long long v37;  // x13
    __m128i v38;  // q1
    unsigned long long *node;  // x9
    char v4;  // x14
    unsigned long long v40;  // x11
    uint128_t v41;  // q4
    unsigned long v42;  // d4
    unsigned long long v44;  // 4132
    uint128_t v6;  // q0
    uint128_t v7;  // q0
    uint128_t v8;  // q0
    uint128_t v9;  // q0

    if (i >= 16)
    {
        v0 = 0;
        v1 = *(char *)a2;
        v2 = (char)a2[1];
        v3 = (char)a2[2];
        v4 = (char)a2[3];
        v6 = _INSERT(_INSERT(__float_as_int(__int_as_float(v1)), 1, v2 + 41), 2, v3 + 82);
        v7 = _INSERT(v6, 3, v4 + 123);
        v8 = _INSERT(v7, 4, v1 - 92);
        v9 = _INSERT(v8, 5, v2 - 0x33);
        v10 = _INSERT(v9, 6, v3 - 10);
        v11 = _INSERT(v10, 7, v4 + 31);
        v12 = _INSERT(v11, 8, (char)v1 + 72);
        v13 = _INSERT(v12, 9, v2 + 113);
        v14 = _INSERT(v13, 10, v3 - 0x66);
        v15 = _INSERT(v14, 11, v4 - 61);
        v16 = _INSERT(v15, 12, v1 - 20);
        v17 = _INSERT(v16, 13, v2 + 21);
        v18 = _INSERT(v17, 14, v3 + 62);
        v19 = (__m128i)_INSERT(v18, 15, v4 + 103);
        do
        {
            v20 = v0;
            *(__m128i *)((char *)a0 + v20) = _mm_xor_si128(v19, *(int128_t *)((char *)a0 + v20));
            v19 = _mm_add_epi8(v19, _mm_set1_epi8(-112));
            v21 = v20 + 16;
            v0 = v21;
        } while (v20 + 32 <= i);
        v22 = i - v21;
        if (v21 >= i)
            return a0;
    }
    else
    {
        v21 = 0;
        v22 = i - 0;
        if (i <= 0)
            return a0;
    }
    if (8 > v22 || (v23 = ~v21 + i, (~(unsigned int)v21 & 3) < ((unsigned int)v23 & 3) || 3 < v23 || (v24 = v21 & 3, a2 + v24 + i - v21 > a0 + v21 && a2 + v24 < a0 + i)))
    {
        v25 = v21;
    }
    else if (32 > v22)
    {
        v26 = 0;
        v27 = v21;
LABEL_20fa9c:
        v37 = v22 & 0xfffffffffffffff8;
        v25 = v21 + v37;
        v38 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi8(v27 & 0xff | (v27 & 0xff) * 0x100 | (v27 & 0xff | (v27 & 0xff) * 0x100) * 0x10000 | (v27 & 0xff | (v27 & 0xff) * 0x100 | (v27 & 0xff | (v27 & 0xff) * 0x100) * 0x10000) * 0x100000000, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, 7, 6, 5, 4, 3, 2, 1, 0)));
        node = a0 + v26 + v21;
        v40 = v26 - v37;
        do
        {
            v41 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi8(*(long long *)((char *)a2 + v24), MulV(v38, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, 41, 41, 41, 41, 41, 41, 41, 41))));
            v42 = __dirty_unsupported_Iop_ZeroHI64ofV128(v41 ^ *(unsigned long long *)&*(double *)node);
            *node = v42;
            node += 1;
            v38 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi8(v38, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, 8, 8, 8, 8, 8, 8, 8, 8)));
            v44 = arm64g_calculate_condition(18, v40, 8, 0);
            v40 += 8;
        } while (v44 & 1);
        if (v22 == v37)
            return a0;
    }
    else
    {
        v26 = v22 & 0xffffffffffffffe0;
        v28 = _mm_add_epi8(CONCAT(v21 & 0xff | (v21 & 0xff) * 0x100 | (v21 & 0xff | (v21 & 0xff) * 0x100) * 0x10000 | (v21 & 0xff | (v21 & 0xff) * 0x100 | (v21 & 0xff | (v21 & 0xff) * 0x100) * 0x10000) * 0x100000000, v21 & 0xff | (v21 & 0xff) * 0x100 | (v21 & 0xff | (v21 & 0xff) * 0x100) * 0x10000 | (v21 & 0xff | (v21 & 0xff) * 0x100 | (v21 & 0xff | (v21 & 0xff) * 0x100) * 0x10000) * 0x100000000), _mm_set_epi8(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        v25 = v21 + v26;
        v29 = a2 + v24;
        v30 = (int128_t)v29[16];
        iter = v21 + a0 + 16;
        j = v26;
        do
        {
            v33 = j;
            v34 = MulV(v28, _mm_set1_epi8(41));
            v35 = *iter;
            *(uint128_t *)((char *)iter - 16) = _mm_xor_si128(_mm_add_epi8(*(int128_t *)v29, v34), *(int128_t *)((char *)iter - 16));
            *iter = _mm_xor_si128(_mm_add_epi8(v34, _mm_add_epi8(v30, _mm_set1_epi8(-112))), v35);
            v28 = _mm_add_epi8(v28, _mm_set1_epi8(32));
            iter += 2;
            j = v33 - 32;
        } while (j);
        if (v22 == v26)
            return a0;
        v27 = v25;
        if (v22 & 24)
            goto LABEL_20fa9c;
    }
    do
    {
        *((char *)a0 + v25) = *((char *)a0 + v25) ^ *((char *)a2 + (v25 & 3)) + 41 * (char)v25;
        v25 += 1;
    } while (i != v25);
    return a0;
}
