/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbad9a8..0xbadb6c (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bad9a8_0 {
    char padding_0[384];
    struct st_bad9a8_1 *field_180;
    unsigned long long field_188;
    char padding_190[8];
    unsigned long long field_198;
} st_bad9a8_0;

typedef struct st_bad9a8_1 {
    unsigned long long field_0;
} st_bad9a8_1;

extern long long g_ef87e8;
extern long long g_ef8800;

long long sub_bad9a8(st_bad9a8_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v12;  // x14
    __m128i v13;  // q2
    unsigned long v16;  // x14
    unsigned long long v17;  // x14
    unsigned long long v18;  // 4128
    unsigned long long v19;  // 4130
    unsigned long long v20;  // x15
    unsigned long long v21;  // x15
    unsigned long long v4;  // x13
    void* v22;  // x15
    unsigned long long v23;  // x15
    unsigned long long v24;  // x14
    unsigned long long v26;  // x15
    __m128i v27;  // q0
    unsigned long long v28;  // x15
    __m128i v29;  // q2
    unsigned long v31;  // x16
    unsigned long long *v5;  // x9
    unsigned long long v32;  // x16
    __m128i v33;  // q2
    unsigned long v36;  // x16
    unsigned long long v37;  // x16
    unsigned long long v38;  // 4128
    unsigned long long v39;  // 4130
    unsigned long long v40;  // x17
    unsigned long long v41;  // x17
    __m128i v6;  // q0
    void* v42;  // x17
    unsigned long long v43;  // x17
    unsigned long long v44;  // 4105
    unsigned long long v7;  // x11
    unsigned long long v8;  // x13
    __m128i v9;  // q2
    unsigned long v11;  // x14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_198;
    if (a0->field_198)
    {
        v3 = 0;
        v4 = 5871781006564002453 * (a1 + 8);
        v5 = a0->field_180;
        v2 = a0->field_188;
        v6 = v4 >> 57 & 0xff | (v4 >> 57 & 0xff) * 0x100 | (v4 >> 57 & 0xff | (v4 >> 57 & 0xff) * 0x100) * 0x10000 | (v4 >> 57 & 0xff | (v4 >> 57 & 0xff) * 0x100 | (v4 >> 57 & 0xff | (v4 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
        v7 = 40;
        v8 = v4 & v2;
        v9 = *(long long *)((char *)v5 + v8);
        v11 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, v6));
        v12 = v11 & 0x8080808080808080;
        if (!(v11 & 0x8080808080808080))
            goto LABEL_bada30;
        while (1)
        {
            do
            {
                v17 = v12;
                v18 = ((((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v19 = (((((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v17 & 0xaaaaaaaaaaaaaaaa) >> 1 | v17 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v20 = ((((v19 | v18) & 0xffff0000ffff0000) >> 16 | (v19 | v18) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v19 | v18) & 0xffff0000ffff0000) >> 16 | (v19 | v18) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v20)
                    v21 = 64;
                else
                    v21 = Clz(v20);
                v22 = (char *)v5 + -(40 * (v8 + (v21 >> 3) & v2));
                if (a1 == *(long long *)((char *)v22 - 40))
                {
                    v24 = 0;
                    v3 = *(long long *)((char *)v22 - 16);
                    v7 = *(long long *)((char *)v22 - 8);
                    v26 = 5871781006564002453 * (a2 + 8);
                    v27 = v26 >> 57 & 0xff | (v26 >> 57 & 0xff) * 0x100 | (v26 >> 57 & 0xff | (v26 >> 57 & 0xff) * 0x100) * 0x10000 | (v26 >> 57 & 0xff | (v26 >> 57 & 0xff) * 0x100 | (v26 >> 57 & 0xff | (v26 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                    v28 = v26 & v2;
                    v29 = *(long long *)((char *)v5 + v28);
                    v31 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v29, v27));
                    v32 = v31 & 0x8080808080808080;
                    if (!(v31 & 0x8080808080808080))
                        goto LABEL_badad0;
                    while (1)
                    {
                        do
                        {
                            v37 = v32;
                            v38 = ((((((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v39 = (((((((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v37 & 0xaaaaaaaaaaaaaaaa) >> 1 | v37 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v40 = ((((v39 | v38) & 0xffff0000ffff0000) >> 16 | (v39 | v38) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v39 | v38) & 0xffff0000ffff0000) >> 16 | (v39 | v38) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v40)
                                v41 = 64;
                            else
                                v41 = Clz(v40);
                            v42 = (char *)v5 + -(40 * (v28 + (v41 >> 3) & v2));
                            if (a2 == *(long long *)((char *)v42 - 40))
                            {
                                if (*(long long *)((char *)v22 - 32) == *(long long *)((char *)v42 - 32))
                                {
                                    v2 = *(long long *)((char *)v42 - 16);
                                    v5 = *(long long *)((char *)v42 - 8);
                                    if (v3 & 1)
                                    {
                                        if (v2 & 1)
                                        {
                                            v44 = arm64g_calculate_condition(36, v7, *(long long *)((char *)v42 - 8), 0);
                                            return !(v44 & 1);
                                        }
                                        v2 = v2;
                                        v3 = v3;
                                        return ((v3 - v2) * 0x200000000000000 | v3 - v2 >> 7) & 18302628885633695745 & 1;
                                    }
                                    goto LABEL_badb58;
                                }
                                else
                                {
                                    v44 = arm64g_calculate_condition(36, *(long long *)((char *)v22 - 32), *(long long *)((char *)v42 - 32), 0);
                                    return !(v44 & 1);
                                }
                            }
                        } while ((v43 = v37 - 1, v32 = v43 & v37, v43 & v37));
                        do
                        {
LABEL_badad0:
                            v33 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v29, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v33, v33), _mm_unpacklo_epi64(v33, v33)))))))))) & 1)
                                goto LABEL_badb40;
                            v24 += 8;
                            v28 = v28 + v24 & v2;
                            v29 = *(long long *)((char *)v5 + v28);
                            v36 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v29, v27));
                            v32 = v36 & 0x8080808080808080;
                        } while (!(v36 & 0x8080808080808080));
                    }
                }
                v23 = v17 - 1;
                v12 = v23 & v17;
            } while (v23 & v17);
            do
            {
LABEL_bada30:
                v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v13, v13), _mm_unpacklo_epi64(v13, v13)))))))))) & 1)
                    goto LABEL_badb28;
                v3 += 8;
                v8 = v8 + v3 & v2;
                v9 = *(long long *)((char *)v5 + v8);
                v16 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v9, v6));
                v12 = v16 & 0x8080808080808080;
            } while (!(v16 & 0x8080808080808080));
        }
    }
    else
    {
LABEL_badb28:
        sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_ef87e8);
LABEL_badb40:
        sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_ef8800);
    }
LABEL_badb58:
    if ((unsigned int)v2)
    {
        v2 = v2;
        v3 = v3;
        return ((v3 - v2) * 0x200000000000000 | v3 - v2 >> 7) & 18302628885633695745 & 1;
    }
    v44 = arm64g_calculate_condition(36, v7, v5, 0);
    return !(v44 & 1);
}
