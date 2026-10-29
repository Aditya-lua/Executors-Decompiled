/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e253c..0x9e2c40 (1796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e253c_0 {
    uint128_t *field_0;
    unsigned int field_8;
} st_9e253c_0;

extern char _NSHomeDirectory;

st_9e253c_0 * sub_9e253c(long long a0, st_9e253c_0 *a1, long long a2, long long a3)
{
    st_9e253c_0 *v2;  // x0
    st_9e253c_0 *v3;  // x22
    __m128i v12;  // q0
    __m128i v13;  // q1
    __m128i v14;  // q2
    __m128i v15;  // q3
    unsigned long v16;  // x15
    unsigned long long i;  // x15
    unsigned long long v18;  // x15
    unsigned long v19;  // x13
    __m128i v20;  // q4
    __m128i v21;  // q5
    unsigned long v4;  // x8
    __m128i v22;  // q4
    unsigned long j;  // x11
    unsigned long long *node;  // x10
    unsigned long long *iter;  // x9
    unsigned long v26;  // x12
    uint128_t *v5;  // x9
    unsigned long v35;  // x14
    unsigned long long v36;  // x13
    unsigned long long v37;  // x15
    unsigned long long v40;  // x16
    unsigned long long v41;  // x14
    uint128_t *v6;  // x10
    unsigned long long v42;  // x14
    st_9e253c_0 *v43;  // x0
    unsigned long v7;  // x12
    uint128_t *v8;  // x14
    uint128_t *v9;  // x13
    unsigned long v10;  // x13
    unsigned long iter1;  // x14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9de064(a3);
    v2 = sub_9de208(a3);
    if (v2 && !(v3 = v2, !sub_9e4cdc()))
    {
        v4 = a1->field_8;
        if ((int)v4 >= 1)
        {
            v5 = a1->field_0;
            v6 = v3->field_0;
            v7 = v4;
            if ((unsigned int)v4 != 1 && !(v8 = &v6[v4], v9 = (char *)v5 + 8 * v4, v9 > v6 && !(v7 = v4, v5 >= v8)))
            {
                v7 = v4 & 1;
                v10 = (char *)v9 - 16;
                iter1 = (char *)v8 - 32;
                v12 = _mm_set1_epi64x(64);
                v13 = _mm_set1_epi64x(16);
                v14 = _mm_set1_epi64x(1);
                v15 = _mm_set1_epi64x(4);
                v16 = v4 & 0x7ffffffe;
                i = v16;
                do
                {
                    v18 = i;
                    v19 = v10 - 16;
                    v20 = __dirty_unsupported_Iop_SliceV128(*(int128_t *)v10, *(int128_t *)v10, 8);
                    v21 = _mm_or_si128(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 30), v13), _mm_and_si128(_mm_srli_epi64(v20, 32), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 29), v12), _mm_and_si128(_mm_srli_epi64(v20, 31), v15))), _mm_or_si128(_mm_or_si128(_mm_or_si128(_mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 58), v13), _mm_and_si128(_mm_srli_epi64(v20, 60), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 57), v12), _mm_and_si128(_mm_srli_epi64(v20, 59), v15))), 56), _mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 54), v13), _mm_and_si128(_mm_srli_epi64(v20, 56), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 53), v12), _mm_and_si128(_mm_srli_epi64(v20, 55), v15))), 48)), _mm_or_si128(_mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 50), v13), _mm_and_si128(_mm_srli_epi64(v20, 52), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 49), v12), _mm_and_si128(_mm_srli_epi64(v20, 0x33), v15))), 40), _mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 46), v13), _mm_and_si128(_mm_srli_epi64(v20, 48), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 45), v12), _mm_and_si128(_mm_srli_epi64(v20, 47), v15))), 32))), _mm_or_si128(_mm_or_si128(_mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 42), v13), _mm_and_si128(_mm_srli_epi64(v20, 44), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 41), v12), _mm_and_si128(_mm_srli_epi64(v20, 43), v15))), 24), _mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 38), v13), _mm_and_si128(_mm_srli_epi64(v20, 40), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 37), v12), _mm_and_si128(_mm_srli_epi64(v20, 39), v15))), 16)), _mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 0x22), v13), _mm_and_si128(_mm_srli_epi64(v20, 36), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 33), v12), _mm_and_si128(_mm_srli_epi64(v20, 35), v15))), 8))));
                    v22 = _mm_or_si128(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_slli_epi64(v20, 2), v13), _mm_and_si128(v20, v14)), _mm_or_si128(_mm_and_si128(_mm_slli_epi64(v20, 3), v12), _mm_and_si128(_mm_add_epi64(v20, v20), v15))), _mm_or_si128(_mm_or_si128(_mm_or_si128(_mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 26), v13), _mm_and_si128(_mm_srli_epi64(v20, 28), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 25), v12), _mm_and_si128(_mm_srli_epi64(v20, 27), v15))), 56), _mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 22), v13), _mm_and_si128(_mm_srli_epi64(v20, 24), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 21), v12), _mm_and_si128(_mm_srli_epi64(v20, 23), v15))), 48)), _mm_or_si128(_mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 18), v13), _mm_and_si128(_mm_srli_epi64(v20, 20), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 0x11), v12), _mm_and_si128(_mm_srli_epi64(v20, 19), v15))), 40), _mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 14), v13), _mm_and_si128(_mm_srli_epi64(v20, 16), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 13), v12), _mm_and_si128(_mm_srli_epi64(v20, 15), v15))), 32))), _mm_or_si128(_mm_or_si128(_mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 10), v13), _mm_and_si128(_mm_srli_epi64(v20, 12), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 9), v12), _mm_and_si128(_mm_srli_epi64(v20, 11), v15))), 24), _mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 6), v13), _mm_and_si128(_mm_srli_epi64(v20, 8), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 5), v12), _mm_and_si128(_mm_srli_epi64(v20, 7), v15))), 16)), _mm_slli_epi64(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 2), v13), _mm_and_si128(_mm_srli_epi64(v20, 4), v14)), _mm_or_si128(_mm_and_si128(_mm_srli_epi64(v20, 1), v12), _mm_and_si128(_mm_srli_epi64(v20, 3), v15))), 8))));
                    *(__m128i *)iter1 = _mm_unpackhi_epi64(v22, v21);
                    *(__m128i *)(iter1 + 16) = _mm_unpacklo_epi64(v22, v21);
                    iter1 -= 32;
                    i = v18 - 2;
                    v10 = v19;
                } while (i);
                if (v16 == v4)
                    goto LABEL_9e2bf4;
            }
            j = v7 + 1;
            node = (char *)&v6[v7] - 8;
            iter = (char *)v5 + 8 * v7 - 8;
            do
            {
                v26 = *iter;
                *node = v26 >> 30 & 16 & 0xfffffffffffffffe | (v26 * 0x100000000 | v26 >> 32) & 0xffffffff00000001 & 1 | v26 >> 29 & 64 | v26 >> 31 & 4 | ((unsigned int)(v26 >> 58) & 16 | ((unsigned int)v26 * 16 | (unsigned int)(v26 >> 60)) & 0xfffffff1 & 1 | (unsigned int)(v26 >> 57) & 64 | (unsigned int)(v26 >> 59) & 4) * 0x100000000000000 | ((unsigned int)(v26 >> 54) & 16 | ((unsigned int)v26 * 0x100 | (unsigned int)(v26 >> 56)) & 0xffffff01 & 1 | (unsigned int)(v26 >> 53) & 64 | (unsigned int)(v26 >> 55) & 4) * 0x1000000000000 | ((unsigned int)(v26 >> 50) & 16 | ((unsigned int)v26 * 0x1000 | (unsigned int)(v26 >> 52)) & 0xfffff001 & 1 | (unsigned int)(v26 >> 49) & 64 | (unsigned int)(v26 >> 0x33) & 4) * 0x10000000000 | ((unsigned int)(v26 >> 46) & 16 | ((unsigned int)v26 * 0x10000 | (unsigned int)(v26 >> 48)) & 0xffff0001 & 1 | (unsigned int)(v26 >> 45) & 64 | (unsigned int)(v26 >> 47) & 4) * 0x100000000 | (v26 >> 42 & 16 & 0xfffffffffffffffe | (v26 * 0x100000 | v26 >> 44) & 0xfffffffffff00001 & 1 | v26 >> 41 & 64 | v26 >> 43 & 4) * &_NSHomeDirectory | (v26 >> 38 & 16 & 0xfffffffffffffffe | (v26 * &_NSHomeDirectory | v26 >> 40) & 0xffffffffff000001 & 1 | v26 >> 37 & 64 | v26 >> 39 & 4) * 0x10000 | (v26 >> 0x22 & 16 & 0xfffffffffffffffe | (v26 * 0x10000000 | v26 >> 36) & 0xfffffffff0000001 & 1 | v26 >> 33 & 64 | v26 >> 35 & 4) * 0x100;
                v35 = *iter;
                iter = (char *)iter - 8;
                v36 = v35 >> 3;
                v37 = v35 >> 2;
                v40 = (((unsigned int)v35 * 0 | (unsigned int)(v35 >> 26)) & 63 & 16 & 0xfffffffe | __ROL__((unsigned int)v35, 4) & 0xfffffff1 & 1 | ((unsigned int)v35 >> 31) * 64 | ((unsigned int)v35 * 0 | (unsigned int)(v35 >> 27)) & 31 & 4) * 0x100000000000000 | (((unsigned int)v35 * 0 | (unsigned int)(v35 >> 22)) & 0x3ff & 16 & 0xfffffffe | ((unsigned int)v35 * 0x100 | (unsigned int)v35 >> 24) & 0xffffff01 & 1 | ((unsigned int)v35 * 0 | (unsigned int)(v35 >> 21)) & 0x7ff & 64 | ((unsigned int)v35 * 0 | (unsigned int)(v35 >> 23)) & 0x1ff & 4) * 0x1000000000000 | (((unsigned int)v35 * 0 | (unsigned int)(v35 >> 18)) & 0x3fff & 16 & 0xfffffffe | ((unsigned int)v35 * 0x1000 | (unsigned int)v35 >> 20) & 0xfffff001 & 1 | ((unsigned int)v35 * 0 | (unsigned int)(v35 >> 0x11)) & 0x7fff & 64 | ((unsigned int)v35 * 0 | (unsigned int)(v35 >> 19)) & 0x1fff & 4) * 0x10000000000 | (((unsigned int)v35 * 0 | (unsigned int)(v35 >> 14)) & 0x3ffff & 16 & 0xfffffffe | ((unsigned int)v35 * 0x10000 | (unsigned int)v35 >> 16) & 0xffff0001 & 1 | ((unsigned int)v35 * 0 | (unsigned int)(v35 >> 13)) & 0x7ffff & 64 | ((unsigned int)v35 * 0 | (unsigned int)(v35 >> 15)) & 0x1ffff & 4) * 0x100000000 | (v35 >> 10 & 16 & 0xfffffffffffffffe | (v35 * 0x10000000000000 | v35 >> 12) & 0xfff0000000000001 & 1 | v35 >> 9 & 64 | v35 >> 11 & 4) * &_NSHomeDirectory;
                v41 = v35 & 1 & 0xffffffffffffffe0 | (v35 & 1 & 0xffffffffffffffef | (v37 * 16 | v37 >> 60) & 16) & 31;
                v42 = v41 & 0xffffffffffffff80 | (v41 & 0xffffffffffffffbf | (v36 * 64 | v36 >> 58) & 64) & 127;
                *(unsigned long long *)((char *)node - 8) = v42 & 0xfffffffffffffff8 | (v42 & 0xfffffffffffffffb | ((v35 >> 1) * 4 | v35 >> 63) & 4) & 7 | v40 | (v35 >> 6 & 16 & 0xfffffffffffffffe | (v35 * 0x100000000000000 | v35 >> 8) & 0xff00000000000001 & 1 | v35 >> 5 & 64 | v35 >> 7 & 4) * 0x10000 | (v37 & 16 & 0xfffffffffffffffe | (v35 * 0x1000000000000000 | v35 >> 4) & 17293822569102704641 & 1 | v35 >> 1 & 64 | v36 & 4) * 0x100;
                j -= 1;
                node = (char *)node - 16;
            } while (1 < j);
        }
LABEL_9e2bf4:
        v3->field_8 = (unsigned int)v4 * 2;
        sub_9e5708(v3);
        v43 = sub_9e1d7c(a0, v3, a2);
    }
    else
    {
        v43 = 0;
    }
    sub_9de17c(a3);
    return v43;
}
