/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01f80..0xb022c0 (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b01f80_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    char padding_18[16];
    unsigned long long field_28;
    char padding_30[72];
    char field_78;
    char padding_79[15];
    char field_88[15];
    char field_8f;
    char padding_90[7];
    char field_97;
    char padding_98[16];
    unsigned long long field_a8;
    unsigned int field_b0;
    char padding_b4[4];
    char field_b8;
    char padding_b9[255];
    char field_1b8;
} st_b01f80_0;

extern char g_10002b0;

unsigned long long sub_b01f80(st_b01f80_0 *a0, void* a1, void* a2, unsigned long long a3)
{
    st_b01f80_0 *v18;  // x19
    unsigned long long v19;  // w0
    unsigned long long v28;  // w25
    void* v29;  // x21
    void* v30;  // x22
    unsigned long long v31;  // x24
    unsigned long long i;  // x19
    unsigned long long v33;  // x20
    unsigned long long j;  // x27
    unsigned long long v35;  // w0
    unsigned long long v36;  // x9
    unsigned int *v37;  // x10
    unsigned int v20;  // w8
    unsigned int *v38;  // x11
    unsigned int *v39;  // x12
    unsigned long long v40;  // x13
    unsigned int *v41;  // x11
    unsigned int *v42;  // x12
    __m128i v43;  // q0
    unsigned int *v45;  // x10
    unsigned long long v47;  // 4136
    unsigned long long v21;  // x20
    unsigned long long v48;  // w8
    unsigned long long v22;  // x23
    __m128i v24;  // q0
    unsigned int v26;  // w9
    unsigned long long v27;  // x26
    unsigned int v0;  // [bp-0xf4]
    unsigned long long v1;  // [bp-0xe0]
    st_b01f80_0 *v2;  // [bp-0xd8]
    unsigned long long v3;  // [bp-0xcc]
    uint120_t v4;  // [bp-0xc8]
    char v5;  // [bp-0xb9]
    unsigned long long v6;  // [bp-0xb4]
    unsigned long long v7;  // [bp-0xb0]
    unsigned long long v8;  // [bp-0xa8]
    unsigned long v9;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long v10;  // [bp-0x98], Other Possible Types: unsigned long long
    char v11;  // [bp-0x91]
    unsigned long v12;  // [bp-0x90]
    unsigned long long v13;  // [bp-0x88]
    uint128_t v14;  // [bp-0x80]
    unsigned long v15;  // [bp-0x70]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v18 = a0;
    v19 = 0;
    v15 = *(long long *)&g_10002b0;
    v20 = v18->padding_b9[247];
    v18->padding_b9[247] = (char)v20 & 251;
    if (0x1000000000 >= (long long)a3 && (v20 & 40) != 8)
    {
        v21 = a3;
        v12 = v18->field_28 * 8;
        v13 = a3 * 8;
        v9 = 0;
        v10 = 0;
        sub_b025f0(&v18->field_b0, &v18->field_78);
        if (v18->field_10)
            sub_b02688(&v18->field_b0, &v9);
        v22 = v21 & 0xfffffffffffffff0;
        if (v21 & 0xfffffffffffffff0)
            sub_b02688(&v18->field_b0, &v9, a1, v22);
        if (v21 & 15)
        {
            v7 = 0;
            v8 = 0;
            ___memcpy_chk(&v7, a1 + v22);
            sub_b02688(&v18->field_b0, &v9, &v7, 16);
        }
        sub_b02688(&v18->field_b0, &v9, &v12, 16);
        v9 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)&v18->padding_98[8] ^ v9);
        v24 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), (unsigned int)v18->field_a8), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), (unsigned int)v10), 8)));
        *(unsigned int *)&v10 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v24, v24), _mm_unpacklo_epi64(v24, v24)));
        v11 = *(char *)((void*)&v10 + 7) & 127;
        v3 = 16;
        v26 = !sub_c672c8(v18->field_0, v18->field_88, &v3, &v9, 16);
        *(long long *)&v4 = *(long long *)&v18->field_88[0];
        *(long long *)((char *)&v4 + 7) = *(long long *)&v18->field_88[7];
        v5 = v18->field_8f | 128;
        if (v21)
        {
            v0 = v26;
            v27 = 0;
            v28 = 0;
            v29 = a2;
            v30 = a1;
            v1 = v29 - v30;
            v2 = v18;
            v31 = v21;
            do
            {
                i = v21;
                if (v31 < 16)
                    v33 = v31;
                else
                    v33 = 16;
                if (1 < v33)
                    j = v33;
                else
                    j = 1;
                v6 = 16;
                v35 = (unsigned int)sub_c672c8();
                v36 = 0;
                *(unsigned int *)&v4 = *(unsigned int *)&v4 + 1;
                if (v31 >= 4 && v1 >= 16)
                {
                    if (16 > v31)
                    {
                        v36 = 0;
                    }
                    else
                    {
                        v36 = j & 16;
                        *(uint128_t *)((char *)a2 + v27) = *(int128_t *)((char *)a1 + v27) ^ v14;
                        if (j == v36)
                            continue;
                        if (!(j & 12))
                            goto LABEL_b02230;
                    }
                    v37 = v29 + v36;
                    v38 = v30 + v36;
                    v39 = (char *)&v14 + v36;
                    v40 = v36 - (j & 28);
                    v36 = j & 28;
                    do
                    {
                        v41 = v38 + 1;
                        v42 = v39 + 1;
                        v43 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v38), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v39), 8)));
                        v45 = v37 + 1;
                        *v37 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)));
                        v47 = arm64g_calculate_condition(18, v40, 4, 0);
                        v37 = v45;
                        v40 += 4;
                        v38 = v41;
                        v39 = v42;
                    } while (v47 & 1);
                    if (v33 == v36)
                        continue;
                }
                do
                {
LABEL_b02230:
                    *((char *)v29 + v36) = *((char *)&v14 + v36) ^ *((char *)v30 + v36);
                    v36 += 1;
                } while (j != v36);
                v28 |= !v35;
                v27 += 16;
                v29 += 16;
                v30 += 16;
                v31 -= 16;
                v21 = i;
            } while (i > v27);
            v48 = v28 != 0;
            v18 = v2;
            v26 = v0;
        }
        else
        {
            v48 = 0;
        }
        v19 = (v48 | v26) ^ 1;
        v18->padding_b9[247] = v18->padding_b9[247] & 243 | (char)v19 * 4 | 8;
    }
    if (*(long long *)&g_10002b0 == v15)
        return v19;
    ___stack_chk_fail();
}
