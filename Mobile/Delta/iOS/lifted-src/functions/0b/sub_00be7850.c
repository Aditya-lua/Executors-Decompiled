/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe7850..0xbe7b5c (780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be7850_2 {
    char padding_0[8];
    struct st_be7850_0 *field_8;
    unsigned int field_10;
    unsigned short field_14;
    unsigned short field_16;
} st_be7850_2;

typedef struct st_be7850_0 {
    char padding_0[24];
    struct st_be7850_1 *field_18;
    struct st_be7850_1 *field_20;
} st_be7850_0;

typedef struct st_be7850_1 {
    unsigned long long field_0;
} st_be7850_1;


void sub_be7850(st_be7850_2 *a0, void* a1, unsigned int a2)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned long v21;  // x22
    unsigned int v22;  // x9
    unsigned int v23;  // x8
    __m128i v25;  // q2
    __m128i v26;  // q1
    __m128i v27;  // q3
    __m128i v28;  // q0
    __m128i v29;  // q1
    __m128i v30;  // q5
    unsigned long long v13;  // x24
    __m128i v31;  // q2
    __m128i v32;  // q3
    __m128i v34;  // q4
    __m128i v35;  // q5
    __m128i v36;  // q7
    __m128i v37;  // q4
    __m128i v39;  // q4
    __m128i v40;  // q5
    unsigned long long v14;  // x23
    __m128i v41;  // q7
    __m128i v42;  // q4
    unsigned long long v44;  // x10
    void* v45;  // x9
    unsigned int v46;  // x10
    void* v47;  // x9
    unsigned long long v48;  // 4121
    unsigned int v49;  // x8
    void* v50;  // x12
    unsigned long long v15;  // x22
    unsigned int i;  // x9
    unsigned int v52;  // x9
    void* v53;  // x13
    unsigned long v54;  // x14
    void* v55;  // x13
    unsigned int v56;  // w13
    unsigned long long v57;  // x15
    unsigned int v58;  // x9
    unsigned int v59;  // w24
    unsigned int v60;  // w8
    unsigned long long v16;  // x21
    unsigned int v61;  // x9
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    void* v20;  // x19
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = a1;
    v21 = a0->field_10;
    if ((unsigned int)v21 & 0x18000000)
    {
        if (v21 >> 28 & 1)
        {
            v49 = a0->field_16;
            if (v49)
            {
                v50 = v20;
                i = v49;
                do
                {
                    v52 = i;
                    if (v50 == v20 + a2)
                        break;
                    v53 = v50;
                    v54 = *(char *)v53;
                    v55 = v53 + 1;
                    if (v54 >> 31 & 1)
                    {
                        v56 = (unsigned int)v54 & 0xff;
                        if (v56 <= 239)
                            v57 = 3;
                        else
                            v57 = 4;
                        if (v56 < 224)
                            v55 = v50 + 2;
                        else
                            v55 = v50 + v57;
                    }
                    i = v52 - 1;
                    v50 = v55;
                } while (i);
                v23 = v49 - i;
            }
            else
            {
                v23 = 0;
            }
        }
        else if (32 <= a2)
        {
            v23 = sub_be7b5c(v20, a2);
        }
        else if (a2)
        {
            if (8 > a2)
            {
                v22 = 0;
                v23 = 0;
            }
            else
            {
                v22 = a2 & 24;
                v25 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(*(unsigned long long *)&*(double *)v20, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, -65, -65, -65, -65, -65, -65, -65, -65)))), 8);
                v26 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v25), 16);
                v27 = _mm_set1_epi64x(1);
                v28 = _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v26), 32), v27);
                v29 = _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v26), 32), v27);
                v30 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v25), 16);
                v31 = _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v30), 32), v27);
                v32 = _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v30), 32), v27);
                if (v22 != 8)
                {
                    v34 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(__double_as_longlong((double)v20[8]), _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, -65, -65, -65, -65, -65, -65, -65, -65)))), 8);
                    v35 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v34), 16);
                    v36 = _mm_set1_epi64x(1);
                    v37 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v34), 16);
                    v28 = _mm_add_epi64(v28, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v37), 32), v36));
                    v29 = _mm_add_epi64(v29, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v37), 32), v36));
                    v31 = _mm_add_epi64(v31, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v35), 32), v36));
                    v32 = _mm_add_epi64(v32, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v35), 32), v36));
                    if (v22 != 16)
                    {
                        v39 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(__double_as_longlong((double)v20[16]), _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, -65, -65, -65, -65, -65, -65, -65, -65)))), 8);
                        v40 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v39), 16);
                        v41 = _mm_set1_epi64x(1);
                        v42 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v39), 16);
                        v28 = _mm_add_epi64(v28, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v42), 32), v41));
                        v29 = _mm_add_epi64(v29, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v42), 32), v41));
                        v31 = _mm_add_epi64(v31, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v40), 32), v41));
                        v32 = _mm_add_epi64(v32, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v40), 32), v41));
                    }
                }
                v23 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v32, v29), _mm_add_epi64(v31, v28)), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(v32, v29), _mm_add_epi64(v31, v28)), _mm_add_epi64(_mm_add_epi64(v32, v29), _mm_add_epi64(v31, v28)))));
                if (a2 == v22)
                    goto LABEL_be7a68;
            }
            v44 = a2 - v22;
            v45 = v20 + v22;
            do
            {
                v46 = v44;
                v47 = v45 + 1;
                v48 = arm64g_calculate_condition(209, *(char *)v45, 65, 0);
                if (!(v48 & 1))
                    v23 += 1;
            } while ((v44 = v46 - 1, v45 = v47, v46 != 1));
        }
        else
        {
            v23 = 0;
        }
LABEL_be7a68:
        v58 = a0->field_14;
        if (v58 > v23)
        {
            v59 = v58 - v23;
            v60 = ((unsigned int)v21 * 8 | (unsigned int)v21 >> 29) & 0xfffffffb & 3;
            if (v60 == 2)
                v61 = ((unsigned short)v59 * 0 | (unsigned short)(v59 >> 1)) & 0x7fff;
            else
                v61 = 0;
            if (!v60)
                v59 = 0;
            if (1 >= (int)v60)
                v61 = (unsigned short)v59;
            if (v61 <= 0)
                a0->field_8->field_18();
            a0->field_8->field_20();
        }
    }
    goto *((void *)(a0->field_8->field_18));
}
