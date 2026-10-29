/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb022c0..0xb025f0 (816 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b022c0_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    char padding_18[16];
    unsigned long long field_28;
    char padding_30[72];
    char field_78;
    char padding_79[15];
    char field_88;
    char padding_89[15];
    char field_98[15];
    char field_9f;
    char padding_a0[7];
    char field_a7;
    unsigned long long field_a8;
    unsigned int field_b0;
    char padding_b4[4];
    char field_b8;
    char padding_b9[255];
    char field_1b8;
} st_b022c0_0;

extern char g_10002b0;

unsigned long long sub_b022c0(st_b022c0_0 *a0, void* a1, void* a2, unsigned long long a3)
{
    st_b022c0_0 *v13;  // x19
    unsigned long long v14;  // x0
    unsigned long long v23;  // x21
    unsigned long long j;  // x25
    unsigned long long v25;  // w0
    unsigned long long v26;  // x9
    unsigned int *v27;  // x10
    unsigned int *v28;  // x11
    unsigned int *v29;  // x12
    unsigned long long v30;  // x13
    unsigned int *v31;  // x11
    unsigned int *v32;  // x12
    unsigned int v15;  // w8
    __m128i v33;  // q0
    unsigned int *v35;  // x10
    unsigned long long v37;  // 4136
    unsigned long long v38;  // w20
    unsigned long long v39;  // x22
    __m128i v41;  // q0
    unsigned long long v16;  // x21
    unsigned long long v43;  // w8
    unsigned long long v17;  // x24
    unsigned long long v18;  // w23
    void* v19;  // x28
    void* v20;  // x20
    unsigned long long v21;  // x22
    unsigned long long i;  // x19
    unsigned long long v0;  // [bp-0xb8]
    st_b022c0_0 *v1;  // [bp-0xb0]
    unsigned long long v2;  // [bp-0xa4]
    unsigned long long v3;  // [bp-0xa0]
    unsigned long long v4;  // [bp-0x98]
    uint120_t v5;  // [bp-0x90], Other Possible Types: unsigned long, unsigned long long
    unsigned long v6;  // [bp-0x88], Other Possible Types: unsigned long long
    char v7;  // [bp-0x81]
    uint128_t v8;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long long v9;  // [bp-0x78]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = a0;
    v14 = 0;
    v10 = *(long long *)&g_10002b0;
    v15 = v13->padding_b9[247];
    v13->padding_b9[247] = (char)v15 & 251;
    if (0x1000000000 >= (long long)a3 && (v15 & 48) != 16)
    {
        v16 = a3;
        *(long long *)&v5 = *(long long *)&v13->field_98[0];
        *(long long *)((char *)&v5 + 7) = *(long long *)&v13->field_98[7];
        v7 = v13->field_9f | 128;
        if (a3)
        {
            v17 = 0;
            v18 = 0;
            v19 = a1;
            v20 = a2;
            v0 = v20 - v19;
            v1 = v13;
            v21 = v16;
            do
            {
                i = v16;
                if (v21 < 16)
                    v23 = v21;
                else
                    v23 = 16;
                if (1 < v23)
                    j = v23;
                else
                    j = 1;
                v3 = 16;
                v25 = (unsigned int)sub_c672c8();
                v26 = 0;
                *(unsigned int *)&v5 = *(unsigned int *)&v5 + 1;
                if (v21 >= 4 && v0 >= 16)
                {
                    if (16 > v21)
                    {
                        v26 = 0;
                    }
                    else
                    {
                        v26 = j & 16;
                        *(uint128_t *)((char *)a2 + v17) = *(int128_t *)((char *)a1 + v17) ^ v8;
                        if (j == v26)
                            continue;
                        if (!(j & 12))
                            goto LABEL_b02464;
                    }
                    v27 = v20 + v26;
                    v28 = v19 + v26;
                    v29 = (char *)&v8 + v26;
                    v30 = v26 - (j & 28);
                    v26 = j & 28;
                    do
                    {
                        v31 = v28 + 1;
                        v32 = v29 + 1;
                        v33 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v28), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v29), 8)));
                        v35 = v27 + 1;
                        *v27 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)));
                        v37 = arm64g_calculate_condition(18, v30, 4, 0);
                        v27 = v35;
                        v30 += 4;
                        v28 = v31;
                        v29 = v32;
                    } while (v37 & 1);
                    if (v23 == v26)
                        continue;
                }
                do
                {
LABEL_b02464:
                    *((char *)v20 + v26) = *((char *)&v8 + v26) ^ *((char *)v19 + v26);
                    v26 += 1;
                } while (j != v26);
                v18 |= !v25;
                v17 += 16;
                v20 += 16;
                v19 += 16;
                v21 -= 16;
                v16 = i;
            } while (i > v17);
            v38 = v18 != 0;
            v13 = v1;
        }
        else
        {
            v38 = 0;
        }
        v8 = v13->field_28 * 8;
        v9 = v16 * 8;
        v5 = 0;
        v6 = 0;
        sub_b025f0(&v13->field_b0, &v13->field_78);
        if (v13->field_10)
            sub_b02688(&v13->field_b0, &v5);
        v39 = v16 & 0xfffffffffffffff0;
        if (v16 & 0xfffffffffffffff0)
            sub_b02688(&v13->field_b0, &v5, a2, v39);
        if (v16 & 15)
        {
            v3 = 0;
            v4 = 0;
            ___memcpy_chk(&v3, a2 + v39);
            sub_b02688(&v13->field_b0, &v5, &v3, 16);
        }
        sub_b02688(&v13->field_b0, &v5, &v8, 16);
        v5 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v13->padding_a0 ^ v5);
        v41 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), (unsigned int)v13->field_a8), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), (unsigned int)v6), 8)));
        *(unsigned int *)&v6 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v41, v41), _mm_unpacklo_epi64(v41, v41)));
        v7 = *(char *)((void*)&v6 + 7) & 127;
        v2 = 16;
        if (sub_c672c8(v13->field_0, &v13->field_88, &v2, &v5, 16))
            v43 = v38;
        else
            v43 = 1;
        v14 = v43 ^ 1;
        v13->padding_b9[247] = v13->padding_b9[247] & 251 | (char)v14 * 4 | 16;
    }
    if (*(long long *)&g_10002b0 == v10)
        return v14;
    ___stack_chk_fail();
}
