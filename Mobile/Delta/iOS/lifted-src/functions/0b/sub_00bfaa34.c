/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfaa34..0xbfae2c (1016 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfaa34_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_bfaa34_0 *field_10;
} st_bfaa34_1;

typedef struct st_bfaa34_0 {
    char field_0;
    char field_1;
    char padding_2[2];
    char *field_4;
    char *field_8;
    char field_c;
} st_bfaa34_0;

typedef struct st_bfaa34_2 {
    char padding_0[128];
    struct st_bfaa34_0 *field_80;
    char padding_88[40];
    struct st_bfaa34_1 *field_b0;
    struct st_bfaa34_1 *field_b8;
    char padding_c0[96];
    void* field_120;
    unsigned long long field_128;
    uint128_t field_130;
} st_bfaa34_2;

extern long long g_efb268;
extern long long g_efb280;
extern long long g_efb298;
extern long long g_efb2b0;

double sub_bfaa34(void* a0, st_bfaa34_2 *a1, unsigned long a2)
{
    unsigned long long v4;  // d8
    st_bfaa34_0 *v5;  // x0
    unsigned long long ptr;  // x0
    unsigned long long v15;  // x10
    unsigned long long v16;  // x23
    char v17;  // x22
    void* v18;  // x8
    unsigned long long v19;  // x9
    unsigned long long v20;  // x11
    __m128i v21;  // q2
    unsigned long v23;  // x12
    st_bfaa34_0 *v6;  // x8
    unsigned long long v24;  // x12
    uint128_t v25;  // q2
    unsigned long v28;  // x12
    unsigned long long v29;  // x12
    unsigned long long v30;  // 4128
    unsigned long long v31;  // 4130
    unsigned long long v32;  // x13
    unsigned long long v33;  // x13
    unsigned long long *v7;  // x8
    void* v34;  // x24
    unsigned long long v35;  // x13
    unsigned long long v36;  // x10
    unsigned long long i;  // x12
    st_bfaa34_2 *v39;  // x24
    unsigned long v40;  // d0
    unsigned long v41;  // d0
    unsigned long long v42;  // x11
    unsigned long long v8;  // x21
    unsigned long long v44;  // 4128
    unsigned long long v45;  // 4130
    unsigned long long v46;  // x11
    unsigned long long v47;  // x11
    unsigned long long v48;  // x11
    unsigned long v49;  // x10
    unsigned long v51;  // x10
    unsigned long long v52;  // 4141
    unsigned long long v53;  // 4143
    unsigned long long v9;  // w9
    unsigned long long v54;  // x10
    unsigned long long v55;  // x10
    __m128i v56;  // q1
    void* v57;  // x8
    void* v58;  // x8
    unsigned long long v59;  // x9
    unsigned long long v60;  // 4122
    long long v61;  // x0
    char *v10;  // d8
    unsigned long long v11;  // q0
    st_bfaa34_0 *v12;  // x0
    __m128i v13;  // q0
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v1 = v4;
    v2 = &v3;
    v5 = a1->field_80;
    v6 = a1->field_b0->field_10;
    if (a1->field_b0->field_10 <= v5)
    {
LABEL_bfade4:
        v12 = sub_c73c94(v5, v6, &g_efb268);
LABEL_bfadf4:
        sub_c73c94(v12, v6, &g_efb298);
LABEL_bfae04:
        v61 = sub_c6b970(1, v8);
        if ((long long)v8 >= 1)
            _free(__double_as_longlong(v10));
        __Unwind_Resume(v61);
    }
    v7 = a1->field_b0->field_8 + 144 * v5;
    if (v7[5] <= a2)
    {
        sub_c73c64(&g_efb280);
LABEL_bfad54:
        v39 = a1;
        sub_c74ba4(&a1->field_120, a1 + 1);
        a1 = v39;
        v18 = v39->field_120;
        v19 = v39->field_128;
        v36 = v19 & v16;
        v40 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v18 + v36)));
        i = __double_as_longlong(v40);
        if (i)
        {
LABEL_bfabd8:
            v41 = v0;
        }
        else
        {
LABEL_bfad80:
            v42 = 8;
            do
            {
                v36 = v36 + v42 & v19;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v18 + v36)));
                v41 = v0;
                v42 += 8;
            } while (!i);
        }
        v44 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v45 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v46 = ((((v45 | v44) & 0xffff0000ffff0000) >> 16 | (v45 | v44) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v45 | v44) & 0xffff0000ffff0000) >> 16 | (v45 | v44) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v46)
            v47 = 64;
        else
            v47 = Clz(v46);
        v48 = v36 + (v47 >> 3) & v19;
        v49 = *((char *)v18 + v48);
        if (!(v49 >> 31 & 1))
        {
            v51 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v18));
            v41 = v0;
            v52 = ((((((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v53 = (((((((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v54 = ((((v53 | v52) & 0xffff0000ffff0000) >> 16 | (v53 | v52) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v53 | v52) & 0xffff0000ffff0000) >> 16 | (v53 | v52) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v54)
                v55 = 64;
            else
                v55 = Clz(v54);
            v48 = v55 >> 3;
            v49 = *((char *)v18 + v48);
        }
        *((char *)v18 + v48) = v17;
        *((char *)v18 + (v48 - 8 & v19) + 8) = v17;
        v34 = v18 - v48 * 32;
        *(unsigned long *)((char *)v34 - 32) = a2;
        *(unsigned long long *)((char *)v34 - 24) = v8;
        *(char **)((char *)v34 - 16) = v10;
        *(unsigned long *)((char *)v34 - 8) = v41;
        v56 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v49 & 1));
        v13 = _mm_sub_epi64(a1->field_130, v56);
        *(__m128i *)&a1->field_130 = v13;
LABEL_bfac2c:
        v57 = v34;
        v58 = v57 - 24;
        v59 = 4;
        v60 = arm64g_calculate_condition(0x44, *(long long *)((char *)v57 - 24), 0, 0);
        if (v60 & 1)
            v59 = *(long long *)((char *)v57 - 24) ^ 0x8000000000000000;
        if (2 >= (long long)v59)
        {
            if (v59)
            {
                v13 = *(int128_t *)v58;
                *(long long *)&a0[16] = (long long)v58[16];
                *(__m128i *)a0 = v13;
                return _mm_cvtsi128_si64(v13);
            }
            *(unsigned long *)a0 = 0x8000000000000000;
            return _mm_cvtsi128_si64(v13);
        }
        else
        {
            if (v59 == 3)
            {
                v13 = *(int128_t *)v58;
                *(long long *)&a0[16] = (long long)v58[16];
                *(__m128i *)a0 = v13;
                return _mm_cvtsi128_si64(v13);
            }
            else if (v59 != 4)
            {
                v13 = *(int128_t *)v58;
                *(long long *)&a0[16] = (long long)v58[16];
                *(__m128i *)a0 = v13;
                return _mm_cvtsi128_si64(v13);
            }
        }
    }
    v8 = 9223372036854775810;
    v6 = v7[4] + a2 * 32;
    v9 = v6->field_0;
    if (2 < v9)
    {
        switch (v9)
        {
        case 3:
            v12 = v6->field_4 - 1;
            v6 = a1->field_b8->field_10;
            if (a1->field_b8->field_10 <= v12)
                goto LABEL_bfadf4;
            v13 = *(unsigned long long *)&*(double *)(a1->field_b8->field_8 + 24 * v12 + 16);
            v8 = _mm_cvtsi128_si64(v13);
            if ((long long)v8 < 0)
            {
                sub_c6b970(0, v8);
                *(unsigned long *)a0 = 0x8000000000000000;
                return _mm_cvtsi128_si64(v13);
            }
            if (v8)
            {
                v0 = (unsigned long long)v13;
                ptr = _malloc(v8);
                if (!ptr)
                    goto LABEL_bfae04;
                v10 = (char *)__longlong_as_double(ptr);
                _memcpy();
                break;
            }
            else
            {
                v0 = 0;
                v10 = 1;
                break;
            }
        case 7:
            v10 = (char *)*(double *)(v6->padding_2)[1];
            v0 = *(int *)((char *)&v6->field_4 + 4);
            v8 = 9223372036854775813;
            break;
        case 9:
            v10 = (char *)*(double *)&v6->field_4;
            v8 = 9223372036854775811;
LABEL_bfab04:
            v0 = v11;
            break;
        default:
LABEL_bfadcc:
            v5 = sub_c73c80("not implementedFromUtf8Errorbytescount overflowed usize", 15, &g_efb2b0);
            goto LABEL_bfade4;
        }
        v15 = 0;
        v16 = 5871781006564002453 * a2;
        v17 = v16 >> 57;
        v18 = a1->field_120;
        v19 = a1->field_128;
        v13 = v17 | v17 * 0x100 | (v17 | v17 * 0x100) * 0x10000 | (v17 | v17 * 0x100 | (v17 | v17 * 0x100) * 0x10000) * 0x100000000;
        v20 = v16 & v19;
        v21 = *(long long *)((char *)v18 + v20);
        v23 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, v13));
        v24 = v23 & 0x8080808080808080;
        if (!(v23 & 0x8080808080808080))
            goto LABEL_bfab74;
        while (1)
        {
            do
            {
                v29 = v24;
                v30 = ((((((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v31 = (((((((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v32 = ((((v31 | v30) & 0xffff0000ffff0000) >> 16 | (v31 | v30) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v31 | v30) & 0xffff0000ffff0000) >> 16 | (v31 | v30) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v32)
                    v33 = 64;
                else
                    v33 = Clz(v32);
                v34 = v18 - (v20 + (v33 >> 3) & v19) * 32;
                if (*(long long *)((char *)v34 - 32) == a2 && (long long)v8 >= 1)
                {
                    _free(__double_as_longlong(v10));
                    goto LABEL_bfac2c;
                }
            } while ((v35 = v29 - 1, v24 = v35 & v29, v35 & v29));
            do
            {
LABEL_bfab74:
                v25 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))))))) & 1)
                {
                    if ((long long)a1->field_130)
                    {
                        v36 = v19 & v16;
                        i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v18 + v36)));
                        if (!i)
                            goto LABEL_bfad80;
                        goto LABEL_bfabd8;
                    }
                    goto LABEL_bfad54;
                }
                v15 += 8;
                v20 = v20 + v15 & v19;
                v21 = *(long long *)((char *)v18 + v20);
                v28 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, v13));
                v24 = v28 & 0x8080808080808080;
            } while (!(v28 & 0x8080808080808080));
        }
    }
    else if (!v9)
    {
        v8 = 0x8000000000000000;
        goto LABEL_bfab04;
    }
    else if (v9 != 1)
    {
        if (v9 != 2)
            goto LABEL_bfadcc;
        v10 = (char *)*(double *)&v6->field_4;
        goto LABEL_bfab04;
    }
    else
    {
        v10 = v6->field_1;
        v8 = 9223372036854775809;
        goto LABEL_bfab04;
    }
}
