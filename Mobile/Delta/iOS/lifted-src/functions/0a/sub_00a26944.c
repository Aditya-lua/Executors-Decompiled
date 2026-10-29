/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa26944..0xa26cc0 (892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a26944_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned int field_40;
    char padding_44[4];
    unsigned int field_48;
    char padding_4c[4];
    unsigned int field_50;
    char padding_54[4];
    unsigned int field_58;
} st_a26944_0;

extern char g_10002b0;

st_a26944_0 * sub_a26944(st_a26944_0 *a0, void* a1, void* a2)
{
    unsigned long v9;  // x20
    unsigned long v10;  // x21
    __m128i v11;  // q0
    unsigned int v12;  // s0
    uint128_t v13;  // q0
    unsigned int v14;  // s0
    unsigned int v15;  // x8
    unsigned int v0;  // [bp-0xc0]
    unsigned int v1;  // [bp-0xb0]
    unsigned int v2;  // [bp-0xa0]
    unsigned int v3;  // [bp-0x90]
    unsigned int v4;  // [bp-0x80]
    unsigned int v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    v9 = a1 + 64;
    if (!(long long)a1[72] && !(long long)a1[64] && !*(long long *)(v9 + 16) && !*(long long *)(v9 + 24))
    {
        a0->field_0 = *(long long *)a2;
        a0->field_20 = (long long)a2[32];
        *(long long *)&a0->field_40 = (long long)a2[64];
        a0->field_8 = (long long)a2[8];
        a0->field_28 = (long long)a2[40];
        *(long long *)&a0->field_48 = (long long)a2[72];
        a0->field_10 = (long long)a2[16];
        a0->field_30 = (long long)a2[48];
        *(long long *)&a0->field_50 = (long long)a2[80];
        a0->field_18 = (long long)a2[24];
        a0->field_38 = (long long)a2[56];
        v15 = (long long)a2[88];
        goto LABEL_a26c34;
    }
    v10 = a2 + 64;
    if ((long long)a2[72] || (long long)a2[64] || *(long long *)(v10 + 16) || *(long long *)(v10 + 24))
    {
        v11 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(~CatEvenLanesV(_mm_cmpeq_epi64((int128_t)a2[16], (int128_t)a1[16]), _mm_cmpeq_epi64(*(int128_t *)a2, *(int128_t *)a1))));
        v12 = __dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v11, v11), _mm_unpacklo_epi64(v11, v11))))))));
        if (__float_as_int(v12) & 1 || (v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(~CatEvenLanesV(_mm_cmpeq_epi64((int128_t)a2[48], (int128_t)a1[48]), _mm_cmpeq_epi64((int128_t)a2[32], (int128_t)a1[32])))), v14 = __dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))))), (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))))) & 1 || (long long)a2[64] != (long long)a1[64] || (long long)a2[72] != (long long)a1[72] || *(long long *)(v10 + 16) != *(long long *)(v9 + 16) || *(long long *)(v10 + 24) != *(long long *)(v9 + 24)))
        {
            sub_a25aa0(&v4, v9);
            sub_a257a0(&v2, &v4, v9);
            sub_a257a0(&v4, &v4, a2);
            sub_a257a0(&v2, &v2, a2 + 32);
            sub_a257a0(&a0->field_20, a1 + 32, v10);
            sub_a257a0(&a0->field_40, v10, v9);
            sub_a25aa0(&v0, v10);
            sub_a257a0(&a0->field_20, &v0, &a0->field_20);
            sub_a257a0(a0, &v0, a1);
            sub_a256a0(&v4, &v4, a0);
            sub_a257a0(&a0->field_40, &v4, &a0->field_40);
            sub_a256a0(&v2, &v2, &a0->field_20);
            sub_a25aa0(&v0, &v4);
            sub_a257a0(&v4, &v4, &v0);
            sub_a257a0(&v0, &v0, a0);
            sub_a25aa0(a0, &v2);
            sub_a256a0(a0, a0, &v0);
            sub_a256a0(a0, a0, &v0);
            sub_a256a0(a0, a0, &v4);
            sub_a256a0(&v0, &v0, a0);
            sub_a257a0(&v0, &v2, &v0);
            sub_a257a0(&v4, &v4, &a0->field_20);
            a0 = sub_a256a0(&a0->field_20, &v0, &v4);
LABEL_a26c38:
            if (*(long long *)&g_10002b0 == v6)
                return a0;
        }
        ___stack_chk_fail();
    }
    else
    {
        a0->field_0 = *(long long *)a1;
        a0->field_20 = (long long)a1[32];
        *(long long *)&a0->field_40 = (long long)a1[64];
        a0->field_8 = (long long)a1[8];
        a0->field_28 = (long long)a1[40];
        *(long long *)&a0->field_48 = (long long)a1[72];
        a0->field_10 = (long long)a1[16];
        a0->field_30 = (long long)a1[48];
        *(long long *)&a0->field_50 = (long long)a1[80];
        a0->field_18 = (long long)a1[24];
        a0->field_38 = (long long)a1[56];
        v15 = (long long)a1[88];
LABEL_a26c34:
        *(unsigned long long *)&a0->field_58 = v15;
        goto LABEL_a26c38;
    }
}
