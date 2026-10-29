/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbda430..0xbda5d4 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bda430_3 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_bda430_3;

typedef struct st_bda430_1 {
    unsigned int field_0;
} st_bda430_1;

typedef struct st_bda430_0 {
    unsigned long long field_0;
    struct st_bda430_1 *field_8;
    unsigned long long field_10;
    struct st_bda430_2 *field_18;
    unsigned long long field_20;
    char padding_28[16];
    long long field_38;
    long long field_40;
} st_bda430_0;

typedef struct st_bda430_2 {
    unsigned long long field_0;
} st_bda430_2;


unsigned int sub_bda430(st_bda430_0 *a0, unsigned long long *a1)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x19
    unsigned long long v12;  // 4127
    unsigned long long v13;  // x0
    unsigned int v14;  // x8
    unsigned long long v15;  // x0
    unsigned long long v16;  // x11
    __m128i v17;  // q1
    unsigned long v19;  // x12
    unsigned long long v20;  // x12
    unsigned long long v21;  // x12
    st_bda430_3 *v4;  // x8
    unsigned long long v22;  // 4128
    unsigned long long v23;  // 4130
    unsigned int v24;  // x13
    unsigned long long v25;  // x13
    unsigned long long v26;  // x13
    uint128_t v27;  // q1
    unsigned long idx;  // x27
    unsigned long long v5;  // x22
    unsigned long long v6;  // x23
    unsigned long long v7;  // x24
    unsigned long long v8;  // x25
    unsigned int *v9;  // x8
    unsigned long v10;  // x21
    unsigned int *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        if (!a0->field_10)
            return 0;
    } while ((v2 = a0->field_10 - 1, a0->field_10 = v2, v3 = *(int *)&a0->field_8[v2], !(sub_bd17cc(&a0->field_18, v3) & 1)));
    if (a1[2] <= v3 || (v4 = a1[1] + v3 * 32, v4->field_0 == 0x8000000000000000))
        v5 = 0xffffffff;
    else
        v5 = v4->field_18;
    v6 = a1[4];
    v7 = a1[5];
    v8 = 0xffffffff;
    while (1)
    {
LABEL_bda528:
        if (v7 > v5)
        {
            v9 = v6 + 48 * v5;
            v5 = v9[8];
            v10 = v9[11];
        }
        else
        {
            do
            {
                if (v7 <= v8)
                    return 1;
            } while ((v11 = v6 + 48 * v8, v8 = v11[9], v10 = v11[10], v12 = arm64g_calculate_condition(1, v10 & 0xffffffff, 1, 0), v12 & 1));
        }
        if (*(long long *)&a0->padding_28[8])
        {
            v13 = sub_bd9d64(a0->field_38, a0->field_40, v10);
            v14 = 0;
            v15 = v13;
            while (1)
            {
                v16 = v15 & a0->field_20;
                v17 = *(long long *)((char *)a0->field_18 + v16);
                v19 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v17, (uint128_t)(v13 >> 57 & 0xff | (v13 >> 57 & 0xff) * 0x100 | (v13 >> 57 & 0xff | (v13 >> 57 & 0xff) * 0x100) * 0x10000 | (v13 >> 57 & 0xff | (v13 >> 57 & 0xff) * 0x100 | (v13 >> 57 & 0xff | (v13 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                v20 = v19 & 0x8080808080808080;
                if (v19 & 0x8080808080808080)
                {
                    do
                    {
                        v21 = v20;
                        v22 = ((((((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v23 = (((((((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v21 & 0xaaaaaaaaaaaaaaaa) >> 1 | v21 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v24 = ((((v23 | v22) & 0xffff0000ffff0000) >> 16 | (v23 | v22) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v23 | v22) & 0xffff0000ffff0000) >> 16 | (v23 | v22) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v24)
                            v25 = 64;
                        else
                            v25 = Clz(v24);
                        if ((unsigned int)v10 == *(int *)((char *)a0->field_18 + -4 * (v16 + (v25 >> 3) & a0->field_20) - 4))
                            goto LABEL_bda528;
                    } while ((v26 = v21 - 1, v20 = v26 & v21, v26 & v21));
                }
                v27 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v17, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v27, v27), _mm_unpacklo_epi64(v27, v27)))))))))) & 1)
                    break;
                v14 += 8;
                v15 = v16 + v14;
            }
        }
        idx = a0->field_10;
        if (idx == a0->field_0)
            sub_c6c494(a0);
        *(unsigned int *)&a0->field_8[idx] = v10;
        a0->field_10 = idx + 1;
    }
}
