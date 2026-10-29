/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa23b4..0xaa2668 (692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa23b4_0 {
    char padding_0[1];
    char field_1;
} st_aa23b4_0;


unsigned long long sub_aa23b4(void* a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long len;  // x22
    unsigned long long v5;  // 4185
    char *v14;  // x27
    char *v15;  // x27
    unsigned long long v16;  // x0
    char *v17;  // x8
    unsigned int v18;  // w9
    unsigned long long v19;  // x24
    unsigned long long k;  // x10
    unsigned long long v21;  // x8
    unsigned long long v22;  // x9
    uint128_t *iter;  // x10
    unsigned long long v6;  // x23
    unsigned long node;  // x11
    unsigned long long i;  // x12
    unsigned long long v26;  // x12
    __m128i v27;  // q3
    __m128i v28;  // q1
    uint128_t *v29;  // x13
    unsigned long long j;  // x11
    unsigned long long *iter1;  // x12
    __m128i v33;  // q1
    unsigned long long v7;  // x24
    void* v34;  // x8
    st_aa23b4_0 *v35;  // x9
    void* v36;  // x8
    unsigned long long v8;  // x0
    unsigned long long v9;  // x8
    unsigned long v10;  // x8
    unsigned long v11;  // x23
    unsigned long long v12;  // x0
    unsigned long long v13;  // x24
    unsigned long long v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    len = a1;
    v0 = 0;
    v5 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
    if (!(v5 & 1))
    {
        if ((int)len < 1)
            goto LABEL_aa24fc;
LABEL_aa23f8:
        v6 = 0;
        v7 = 0;
        do
        {
            v8 = sub_9c5604(a0 + (v7 & 0xffffffff), len - v7, &v0);
            if (v8 >> 31 & 1)
            {
                v19 = (len * 2 | len >> 63) & 0x1fffffffe & 0x1ffffffff;
                v11 = (unsigned int)v19 + 2;
                v12 = sub_a6bf4c(v11, "crypto/pkcs12/p12_utl.c", 29);
                if (!v12)
                    return v12;
                if (8 > (unsigned int)len)
                {
                    k = 0;
                    goto LABEL_aa2634;
                }
                v21 = (v19 - 1 >> 1) + 1;
                if (32 > (unsigned int)len)
                {
                    v22 = 0;
                }
                else
                {
                    v22 = v21 & 0xffffffffffffffe0;
                    iter = a0 + 16;
                    node = v12 + 32;
                    i = v22;
                    do
                    {
                        v26 = i;
                        v27 = *(int128_t *)((char *)iter - 16);
                        v28 = *iter;
                        v29 = node - 32;
                        v29[1] = _mm_unpackhi_epi8(_mm_setzero_si128(), v27);
                        *v29 = _mm_unpacklo_epi8(_mm_setzero_si128(), v27);
                        *(__m128i *)(node + 16) = _mm_unpackhi_epi8(_mm_setzero_si128(), v28);
                        *(__m128i *)node = _mm_unpacklo_epi8(_mm_setzero_si128(), v28);
                        iter += 2;
                        node += 64;
                        i = v26 - 32;
                    } while (i);
                    if (v21 == v22)
                        goto LABEL_aa2654;
                    if (!(v21 & 24))
                    {
                        k = v22 * 2;
LABEL_aa2634:
                        v34 = a0 + (k >> 1);
                        do
                        {
                            v35 = v12 + k;
                            *(char *)v35->padding_0 = 0;
                            v36 = v34 + 1;
                            v35->field_1 = *(char *)v34;
                            k += 2;
                            v34 = v36;
                        } while (k < v19);
LABEL_aa2654:
                        *(char *)(v12 + v19) = 0;
                        *(char *)(v12 + (v19 & 0xffffffff) + 1) = 0;
                        if (!a3)
                            goto LABEL_aa2528;
                        goto LABEL_aa2524;
                    }
                }
                j = v21 & 0xfffffffffffffff8;
                k = j * 2;
                iter1 = v12 + v22 * 2;
                do
                {
                    v33 = *(long long *)((char *)a0 + (v22 & 0x7ffffffffffffff8));
                    iter1[1] = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), _mm_setzero_si128()), _mm_unpacklo_epi8(v33, v33)), _mm_unpackhi_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), _mm_setzero_si128()), _mm_unpacklo_epi8(v33, v33))));
                    *iter1 = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), _mm_setzero_si128()), _mm_unpacklo_epi8(v33, v33)), _mm_unpacklo_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), _mm_setzero_si128()), _mm_unpacklo_epi8(v33, v33))));
                    iter1 += 2;
                    v22 += 8;
                } while (j != v22);
                if (v21 == j)
                    goto LABEL_aa2654;
                goto LABEL_aa2634;
            }
            v9 = v0 >> 16;
            if (16 < v9)
                return 0;
            if (v9)
                v10 = 4;
            else
                v10 = 2;
            v6 += v10;
            v7 += v8;
        } while ((int)v7 < (int)len);
        v11 = (unsigned int)v6 + 2;
        v12 = sub_a6bf4c(v11, "crypto/pkcs12/p12_utl.c", 120);
        if (!v12)
            return v12;
        if ((int)len >= 1)
        {
            v13 = 0;
            v14 = v12;
            do
            {
                v15 = v14;
                v16 = sub_9c5604(a0 + (int)v13, len - v13, &v0);
                if (v0 < 0x10000)
                {
                    v17 = v15;
                    *v17 = v0 >> 8;
                    v14 = v17 + 2;
                    v18 = v0;
                }
                else
                {
                    v1 = v0 - 0x10000;
                    v18 = v1 >> 10;
                    *v15 = v18 + 0xd800 >> 8;
                    v15[2] = 220 | (220 | (char)(__ROL__((unsigned int)v0, 24)) & 3) & 3;
                    v14 = v15 + 4;
                    v15[3] = v0;
                    v0 = v1;
                }
            } while ((v15[1] = v18, v13 += v16, (int)len > (int)v13));
            *(unsigned short *)v14 = 0;
            if (!a3)
                goto LABEL_aa2528;
            goto LABEL_aa2524;
        }
    }
    else
    {
        len = _strlen(a0);
        if (1 <= (int)len)
            goto LABEL_aa23f8;
LABEL_aa24fc:
        v11 = 2;
        v12 = sub_a6bf4c(2, "crypto/pkcs12/p12_utl.c", 120);
        if (!v12)
            return v12;
    }
    *(unsigned short *)v12 = 0;
    if (a3)
    {
LABEL_aa2524:
        *(unsigned int *)a3 = v11;
    }
LABEL_aa2528:
    if (a2)
        *(unsigned long long *)a2 = v12;
    return v12;
}
