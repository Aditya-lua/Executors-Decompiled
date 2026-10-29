/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa494..0xaf44 (2736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a494_1 {
    struct st_a494_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_a494_1;

typedef struct st_a494_0 {
    char field_0;
} st_a494_0;

extern unsigned long long g_e61820;
extern unsigned long long g_e61850;
extern unsigned long long g_e61888;
extern unsigned long long g_e61898;
extern unsigned long long g_e618d0;
extern unsigned long long g_e618f0;
extern unsigned long long g_e61910;
extern unsigned long long g_e61918;
extern unsigned long long g_e61940;
extern unsigned long long g_e61948;
extern unsigned long long g_e61958;
extern unsigned long long g_e61960;
extern unsigned long long g_e61988;
extern unsigned long long g_e61a00;
extern unsigned long long g_e61a28;
extern unsigned long long g_e61a68;
extern unsigned long long g_e61a88;
extern unsigned long long g_e61a90;
extern unsigned long long g_e61a98;
extern unsigned long long g_e61ab0;
extern unsigned long long g_e61ab8;

long long sub_a494(st_a494_1 *a0)
{
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long v22;  // cc_dep1
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4105
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4105
    unsigned int v27;  // w14
    char v28;  // x16
    uint128_t v30;  // q0
    __m128i v31;  // q0
    unsigned long long v14;  // x20
    __m128i v32;  // q0
    uint128_t v33;  // q0
    uint128_t v34;  // q0
    __m128i v35;  // 4237
    uint128_t v36;  // 4238
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long v17;  // x2
    unsigned int v18;  // w12
    unsigned int v19;  // w13
    unsigned long long *v20;  // x13
    unsigned int v21;  // w13
    st_a494_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_a494_0 *v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    st_a494_0 **v3;  // [bp-0x40], Other Possible Types: char
    st_a494_0 *v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = &v11;
    v10 = v16;
    v1 = &v0;
    v0 = &v1;
    v17 = a0->field_10;
    v4 = &v3;
    v2 = a0->field_14 | (v17 - a0->field_18) * 0x100000000;
    v3 = &v4;
    if (a0->field_8 <= v17)
    {
        v18 = 0;
        goto LABEL_a520;
    }
    v18 = *(char *)&a0->field_0[v17];
    v19 = v18 & 0xff;
    if ((int)v19 > 90)
    {
        switch (v19)
        {
        case 91:
            v20 = &g_e61a68;
            break;
        case 123:
            v20 = &g_e61918;
            break;
        case 125:
            v20 = &g_e61940;
            break;
        default:
            v21 = v18 & 0xff;
            v20 = &g_e61910;
            if (v21 == 61)
            {
LABEL_a6b1:
                v20 = &g_e61ab0;
                goto LABEL_a6b4;
            }
LABEL_a6b2:
LABEL_a6b4:
            if (v21 == 60)
                v20 = &g_e61948;
            if (v21 == 62)
                v20 = &g_e61a90;
            v22 = v21;
            if (v21 == 126)
                v20 = &g_e618f0;
            if (v21 != 0x22)
            {
                v23 = arm64g_calculate_condition(19, v22, 126, 0);
                v24 = arm64g_calculate_condition(3, (v23 & 1 ? v21 : 0x40000000), (v23 & 1 ? 39 : 0), 0);
                if (!(v24 & 1))
                    goto LABEL_a6e6;
LABEL_a6e5:
                v20 = &g_e61898;
            }
            else
            {
                v25 = arm64g_calculate_condition(19, v22, 126, 0);
                v26 = arm64g_calculate_condition(0, (v25 & 1 ? v21 : 0x40000000), (v25 & 1 ? 39 : 0), 0);
                if (v26 & 1)
                    goto LABEL_a6e5;
LABEL_a6e6:
            }
            if (v21 == 96)
                v20 = &g_e61960;
            break;
        }
    }
    else
    {
        switch (v19)
        {
        case 0:
LABEL_a520:
            v20 = &g_e61a88;
            break;
        case 45:
            v20 = &g_e61820;
            break;
        default:
            v21 = v18 & 0xff;
            v20 = &g_e61910;
            if (v21 == 61)
                goto LABEL_a6b1;
            goto LABEL_a6b2;
        }
    }
    v27 = v18 & 0xff;
    if (v27 == 46)
        v20 = &g_e61a98;
    if (v27 == 43)
        v20 = &g_e61958;
    if (v27 == 47)
        v20 = &g_e61a28;
    if (v27 == 42)
        v20 = &g_e61988;
    if (v27 == 37)
        v20 = &g_e61a00;
    if (v27 == 94)
        v20 = &g_e618d0;
    if (v27 == 58)
        v20 = &g_e61850;
    v28 = (char)v18 & 254;
    v30 = _INSERT(_INSERT(__float_as_int(__int_as_float(v18)), 1, v28), 8, v18);
    v31 = (__m128i)_INSERT(v30, 9, v28);
    v32 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(PermV(v31, _mm_and_si128(_mm_set_epi64x(0, 0x100), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0))));
    v33 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v32, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, 35, 59, 44, 124, 63, 38, 40, 93)));
    v34 = __dirty_unsupported_Iop_ZeroHI64ofV128(v33 & 9241421688590303745);
    v35 = __dirty_unsupported_Iop_ZeroHI64ofV128(v34);
    v36 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_add_epi8(_mm_add_epi8(_mm_add_epi8(_mm_add_epi8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))))), _mm_add_epi8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatOddLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)))))), _mm_add_epi8(_mm_add_epi8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))))), _mm_add_epi8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35)), CatEvenLanesV(_mm_unpackhi_epi64(v35, v35), _mm_unpackhi_epi64(v35, v35))))))), _mm_add_epi8(_mm_add_epi8(_mm_add_epi8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), _mm_add_epi8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatOddLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))))), _mm_add_epi8(_mm_add_epi8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))))), _mm_add_epi8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)), CatEvenLanesV(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v35, v35)))))))));
    if ((char)(unsigned int)v36)
        v20 = &g_e61ab8;
    if (v27 == 64)
        v20 = &g_e61888;
    goto *((void *)(*v20));
}
