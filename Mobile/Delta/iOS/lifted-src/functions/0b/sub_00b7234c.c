/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7234c..0xb72668 (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7234c_0 {
    struct st_b7234c_1 *field_0;
    unsigned long long field_8;
    char padding_10[16];
    unsigned long long field_20;
    unsigned long long field_28;
} st_b7234c_0;

typedef struct st_b7234c_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_b7234c_1 *field_10;
    char padding_18[8];
    unsigned long long field_20;
    struct st_b7234c_0 *field_28;
} st_b7234c_2;

typedef struct st_b7234c_1 {
    unsigned long long field_0;
} st_b7234c_1;

extern long long g_ef7f38;

int sub_b7234c(unsigned long long *a0, st_b7234c_2 *a1)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // x10
    unsigned long long v17;  // x11
    unsigned long long v18;  // x11
    unsigned long v19;  // x10
    unsigned long v20;  // x14
    unsigned long long v21;  // x15
    unsigned long v22;  // x12
    unsigned long long v23;  // x13
    unsigned long long v24;  // x11
    unsigned long v25;  // x14
    unsigned long v26;  // x12
    unsigned long long i;  // x11
    unsigned long long v27;  // x11
    unsigned long long v28;  // x13
    unsigned long v29;  // x14
    unsigned long v30;  // x12
    unsigned long long v31;  // x13
    unsigned long long v32;  // x11
    unsigned long v33;  // x14
    unsigned long v34;  // x12
    unsigned long long v35;  // x11
    unsigned long long v36;  // x13
    unsigned long long *v10;  // x9
    unsigned long v37;  // x14
    unsigned long v38;  // x12
    unsigned long long v39;  // x13
    unsigned long long v40;  // x11
    unsigned long v41;  // x14
    unsigned long v42;  // x12
    unsigned long long v43;  // x11
    unsigned long long v44;  // x13
    unsigned long v45;  // x13
    unsigned long long v46;  // x13
    unsigned long long *v11;  // x9
    unsigned long long *v47;  // x12
    unsigned long long v48;  // x11
    __m128i v49;  // q0
    unsigned long long v50;  // x13
    __m128i v51;  // q2
    unsigned long v53;  // x14
    unsigned long long v54;  // x14
    __m128i v55;  // q2
    unsigned long v58;  // x14
    unsigned long long v59;  // x14
    unsigned long long v60;  // 4128
    unsigned long long v61;  // 4130
    unsigned long long v62;  // x15
    unsigned long long v63;  // x15
    unsigned long long v64;  // x15
    unsigned long long *v65;  // x0
    unsigned long long ptr;  // x0
    st_b7234c_0 *v13;  // x8
    unsigned long long v67;  // x21
    unsigned long long idx;  // x20
    st_b7234c_2 *v69;  // x1
    unsigned long long v70;  // x8
    long long v71;  // x0
    unsigned long long v14;  // x9
    unsigned long long v15;  // 4128
    unsigned long long v16;  // 4130
    uint128_t v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x58]
    long long ptr1;  // [bp-0x50], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x48]
    uint128_t v4;  // [bp-0x40]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a1->field_20;
    if (v7)
    {
        v8 = a1->field_0;
        i = a1->field_8;
        if (!i)
        {
            v10 = a1->field_10;
            do
            {
                v11 = v10 + 1;
                v8 -= 128;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v10)) & 0x8080808080808080;
                v10 = v11;
            } while (!i);
            a1->field_10 = v11;
            a1->field_0 = v8;
        }
        a1->field_8 = i - 1 & i;
        a1->field_20 = v7 - 1;
        v13 = a1->field_28;
        if (*(long long *)&v13->padding_10[8])
        {
            v14 = 0;
            v15 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v16 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v17 = ((((v16 | v15) & 0xffff0000ffff0000) >> 16 | (v16 | v15) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v16 | v15) & 0xffff0000ffff0000) >> 16 | (v16 | v15) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v17)
                v18 = 64;
            else
                v18 = Clz(v17);
            v19 = *(int *)(v8 - (v18 * 2 & 240) - 16);
            v20 = v13->field_28 ^ 7237128888997146477;
            v21 = v19 | 0x400000000000000;
            v22 = v13->field_28 ^ 8387220255154660723 ^ v21;
            v23 = v20 + (v13->field_20 ^ 8317987319222330741);
            v24 = v22 + (v13->field_20 ^ 7816392313619706465);
            v25 = v23 ^ __ROL__(v20, 13);
            v26 = v24 ^ __ROL__(v22, 16);
            v27 = v24 + v25;
            v28 = v26 + __ROL__(v23, 32);
            v29 = v27 ^ __ROL__(v25, 0x11);
            v30 = v28 ^ __ROL__(v26, 21);
            v31 = (v28 ^ v21) + v29;
            v32 = v30 + (__ROL__(v27, 32) ^ 0xff);
            v33 = v31 ^ __ROL__(v29, 13);
            v34 = v32 ^ __ROL__(v30, 16);
            v35 = v33 + v32;
            v36 = v34 + __ROL__(v31, 32);
            v37 = v35 ^ __ROL__(v33, 0x11);
            v38 = v36 ^ __ROL__(v34, 21);
            v39 = v37 + v36;
            v40 = v38 + __ROL__(v35, 32);
            v41 = v39 ^ __ROL__(v37, 13);
            v42 = v40 ^ __ROL__(v38, 16);
            v43 = v41 + v40;
            v44 = v42 + __ROL__(v39, 32);
            v45 = (v43 ^ __ROL__(v41, 0x11)) + v44 ^ __ROL__(v43 ^ __ROL__(v41, 0x11), 13);
            v46 = __ROL__((v44 ^ __ROL__(v42, 21)) + __ROL__(v43, 32) ^ __ROL__(v44 ^ __ROL__(v42, 21), 16), 21) ^ __ROL__(v45, 0x11) ^ __ROL__(v45 + (v44 ^ __ROL__(v42, 21)) + __ROL__(v43, 32), 32) ^ v45 + (v44 ^ __ROL__(v42, 21)) + __ROL__(v43, 32);
            v47 = v13->field_0;
            v48 = v13->field_8;
            v49 = v46 >> 57 & 0xff | (v46 >> 57 & 0xff) * 0x100 | (v46 >> 57 & 0xff | (v46 >> 57 & 0xff) * 0x100) * 0x10000 | (v46 >> 57 & 0xff | (v46 >> 57 & 0xff) * 0x100 | (v46 >> 57 & 0xff | (v46 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
            v50 = v46 & v48;
            v51 = *(long long *)((char *)v47 + v50);
            v53 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v51, v49));
            v54 = v53 & 0x8080808080808080;
            if (!(v53 & 0x8080808080808080))
                goto LABEL_b72528;
            while (1)
            {
                do
                {
                    v59 = v54;
                    v60 = ((((((v59 & 0xaaaaaaaaaaaaaaaa) >> 1 | v59 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v59 & 0xaaaaaaaaaaaaaaaa) >> 1 | v59 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v59 & 0xaaaaaaaaaaaaaaaa) >> 1 | v59 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v59 & 0xaaaaaaaaaaaaaaaa) >> 1 | v59 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v61 = (((((((v59 & 0xaaaaaaaaaaaaaaaa) >> 1 | v59 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v59 & 0xaaaaaaaaaaaaaaaa) >> 1 | v59 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v59 & 0xaaaaaaaaaaaaaaaa) >> 1 | v59 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v59 & 0xaaaaaaaaaaaaaaaa) >> 1 | v59 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v62 = ((((v61 | v60) & 0xffff0000ffff0000) >> 16 | (v61 | v60) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v61 | v60) & 0xffff0000ffff0000) >> 16 | (v61 | v60) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v62)
                        v63 = 64;
                    else
                        v63 = Clz(v62);
                    if ((unsigned int)v19 == *(int *)((char *)&v47[-1 * (v50 + (v63 >> 3) & v48)] - 8))
                    {
                        *(unsigned int *)&v0 = 1;
                        *(unsigned int *)((char *)&v0 + 4) = v19;
                        *(st_b7234c_0 **)((char *)&v0 + 8) = v13;
                        v65 = sub_b8a1ec(&v0);
                        if ((unsigned int)v65 == 1)
                        {
                            ptr = _malloc(16);
                            if (ptr)
                            {
                                v67 = ptr;
                                *(unsigned int *)ptr = (unsigned int)a1;
                                v1 = 4;
                                ptr1 = ptr;
                                idx = 1;
                                v3 = 1;
                                v4 = v0;
                                while (1)
                                {
                                    v69 = a1;
                                    v65 = sub_b8a1ec(&v4);
                                    if ((unsigned int)v65 != 1)
                                        break;
                                    a1 = v69;
                                    if (idx == v1)
                                    {
                                        a1 = idx;
                                        sub_c6c0cc(&v1, a1, 1, 4, 4);
                                        v67 = ptr1;
                                    }
                                    *(unsigned int *)(v67 + idx * 4) = (unsigned int)v69;
                                    idx += 1;
                                    v3 = idx;
                                }
                                v70 = v1;
                                goto LABEL_b72624;
                            }
                            else
                            {
                                v71 = sub_c6b970(4, 16);
                                if (v1)
                                    _free(ptr1);
                                __Unwind_Resume(v71);
                            }
                        }
                        goto LABEL_b72610;
                    }
                } while ((v64 = v59 - 1, v54 = v64 & v59, v64 & v59));
                do
                {
LABEL_b72528:
                    v55 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v51, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v55, v55), _mm_unpacklo_epi64(v55, v55)))))))))) & 1)
                        goto LABEL_b72604;
                    v14 += 8;
                    v50 = v50 + v14 & v48;
                    v51 = *(long long *)((char *)v47 + v50);
                    v58 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v51, v49));
                    v54 = v58 & 0x8080808080808080;
                } while (!(v58 & 0x8080808080808080));
            }
        }
        else
        {
LABEL_b72604:
            v65 = sub_c73c64(&g_ef7f38);
LABEL_b72610:
            idx = 0;
            v70 = 0;
            v67 = 4;
        }
LABEL_b72624:
        *a0 = v70;
        a0[1] = v67;
        a0[2] = idx;
        a0 = v65;
    }
    else
    {
        *a0 = 0x8000000000000000;
    }
    return (unsigned int)a0;
}
