/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2d5d0..0xc2d834 (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_c2d5d0(void* a0, unsigned int a1)
{
    unsigned long v2;  // x11
    unsigned long long v3;  // x12
    unsigned long v12;  // x9
    unsigned long long v13;  // x10
    unsigned long long v14;  // x8
    unsigned long v15;  // x11
    unsigned long v16;  // x9
    unsigned long long v17;  // x8
    unsigned long long v18;  // x10
    unsigned long v19;  // x11
    unsigned long v20;  // x9
    unsigned long long v21;  // x10
    unsigned long v4;  // x9
    unsigned long long v22;  // x8
    unsigned long v23;  // x11
    unsigned long long v24;  // x8
    unsigned long long v25;  // x11
    unsigned long long v26;  // x20
    unsigned long long v27;  // x13
    unsigned long long v28;  // x12
    void* v29;  // x8
    unsigned long long v30;  // x10
    char v31;  // x9
    unsigned long long v5;  // x10
    __m128i v32;  // q0
    unsigned long long v33;  // x14
    __m128i v34;  // q2
    unsigned long v36;  // x15
    unsigned long long v37;  // x15
    unsigned long long v39;  // 4128
    unsigned long long v40;  // 4130
    unsigned long long v41;  // x11
    unsigned long long v6;  // x8
    unsigned long long v42;  // x11
    uint128_t v43;  // q2
    unsigned long v46;  // x15
    unsigned long long v47;  // x15
    unsigned long long v48;  // 4128
    unsigned long long v49;  // 4130
    unsigned long long v50;  // x16
    unsigned long long v51;  // x16
    unsigned long v7;  // x11
    unsigned long long v52;  // x16
    unsigned long v53;  // x12
    unsigned long v55;  // x11
    unsigned long long v56;  // 4137
    unsigned long long v57;  // 4139
    unsigned long long v58;  // x11
    unsigned long long v59;  // x11
    __m128i v60;  // q1
    unsigned long v8;  // x9
    unsigned long long v9;  // x8
    unsigned long long v10;  // x10
    unsigned long v11;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long)a0[40] ^ 7237128888997146477;
    v3 = a1 | 0x400000000000000;
    v4 = (long long)a0[40] ^ v3 ^ 8387220255154660723;
    v5 = v2 + ((long long)a0[32] ^ 8317987319222330741);
    v6 = v4 + ((long long)a0[32] ^ 7816392313619706465);
    v7 = v5 ^ __ROL__(v2, 13);
    v8 = v6 ^ __ROL__(v4, 16);
    v9 = v6 + v7;
    v10 = v8 + __ROL__(v5, 32);
    v11 = v9 ^ __ROL__(v7, 0x11);
    v12 = v10 ^ __ROL__(v8, 21);
    v13 = (v10 ^ v3) + v11;
    v14 = v12 + (__ROL__(v9, 32) ^ 0xff);
    v15 = v13 ^ __ROL__(v11, 13);
    v16 = v14 ^ __ROL__(v12, 16);
    v17 = v15 + v14;
    v18 = v16 + __ROL__(v13, 32);
    v19 = v17 ^ __ROL__(v15, 0x11);
    v20 = v18 ^ __ROL__(v16, 21);
    v21 = v19 + v18;
    v22 = v20 + __ROL__(v17, 32);
    v23 = v21 ^ __ROL__(v19, 13);
    v24 = v23 + v22;
    v25 = v24 ^ __ROL__(v23, 0x11);
    v26 = __ROL__(((v22 ^ __ROL__(v20, 16)) + __ROL__(v21, 32) ^ __ROL__(v22 ^ __ROL__(v20, 16), 21)) + __ROL__(v24, 32) ^ __ROL__((v22 ^ __ROL__(v20, 16)) + __ROL__(v21, 32) ^ __ROL__(v22 ^ __ROL__(v20, 16), 21), 16), 21) ^ __ROL__(v25 + (v22 ^ __ROL__(v20, 16)) + __ROL__(v21, 32) ^ __ROL__(v25, 13), 0x11) ^ __ROL__((v25 + (v22 ^ __ROL__(v20, 16)) + __ROL__(v21, 32) ^ __ROL__(v25, 13)) + ((v22 ^ __ROL__(v20, 16)) + __ROL__(v21, 32) ^ __ROL__(v22 ^ __ROL__(v20, 16), 21)) + __ROL__(v24, 32), 32) ^ (v25 + (v22 ^ __ROL__(v20, 16)) + __ROL__(v21, 32) ^ __ROL__(v25, 13)) + ((v22 ^ __ROL__(v20, 16)) + __ROL__(v21, 32) ^ __ROL__(v22 ^ __ROL__(v20, 16), 21)) + __ROL__(v24, 32);
    if (!(long long)a0[16])
        sub_c6df10();
    v27 = 0;
    v28 = 0;
    v29 = *(long long *)a0;
    v30 = (long long)a0[8];
    v31 = v26 >> 57;
    v32 = v31 | v31 * 0x100 | (v31 | v31 * 0x100) * 0x10000 | (v31 | v31 * 0x100 | (v31 | v31 * 0x100) * 0x10000) * 0x100000000;
    v33 = v26 & v30;
    v34 = *(long long *)((char *)v29 + v33);
    v36 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v34, v32));
    v37 = v36 & 0x8080808080808080;
    if (!(v36 & 0x8080808080808080))
        goto LABEL_c2d748;
    while (1)
    {
        do
        {
            v47 = v37;
            v48 = ((((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v49 = (((((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v50 = ((((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v50)
                v51 = 64;
            else
                v51 = Clz(v50);
            if (a1 == *(int *)((char *)v29 + -4 * (v33 + (v51 >> 3) & v30) - 4))
                return _mm_cvtsi128_si64(v32);
            v52 = v47 - 1;
            v37 = v52 & v47;
        } while (v52 & v47);
        do
        {
LABEL_c2d748:
            if (v27 != 1)
            {
                v25 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v34));
                if (v25)
                {
                    v39 = ((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v40 = (((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v41 = ((((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v40 | v39) & 0xffff0000ffff0000) >> 16 | (v40 | v39) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v41)
                        v42 = 64;
                    else
                        v42 = Clz(v41);
                    v25 = v33 + (v42 >> 3) & v30;
                }
                else
                {
                    v27 = 0;
                    continue;
                }
            }
            v43 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v34, _mm_set1_epi8(-1)));
            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v43, v43), _mm_unpacklo_epi64(v43, v43)))))))))) & 1))
            {
                v27 = 1;
            }
            else
            {
                v53 = *((char *)v29 + v25);
                if (!(v53 >> 31 & 1))
                {
                    v55 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v29));
                    v56 = ((((((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v57 = (((((((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v55 & 0xaaaaaaaaaaaaaaaa) >> 1 | v55 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v58 = ((((v57 | v56) & 0xffff0000ffff0000) >> 16 | (v57 | v56) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v57 | v56) & 0xffff0000ffff0000) >> 16 | (v57 | v56) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v58)
                        v59 = 64;
                    else
                        v59 = Clz(v58);
                    v25 = v59 >> 3;
                    v53 = *((char *)v29 + v25);
                }
                *((char *)v29 + v25) = v31;
                *((char *)v29 + (v30 & v25 - 8) + 8) = v31;
                v60 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v53 & 1));
                v32 = _mm_sub_epi64((int128_t)a0[16], v60);
                *(__m128i *)&a0[16] = v32;
                *(unsigned int *)((char *)v29 + -4 * v25 - 4) = a1;
                return _mm_cvtsi128_si64(v32);
            }
            v28 += 8;
            v33 = v28 + v33 & v30;
            v34 = *(long long *)((char *)v29 + v33);
            v46 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v34, v32));
            v37 = v46 & 0x8080808080808080;
        } while (!(v46 & 0x8080808080808080));
    }
}
