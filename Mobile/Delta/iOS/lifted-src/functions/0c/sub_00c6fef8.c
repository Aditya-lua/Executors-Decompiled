/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6fef8..0xc7031c (1060 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6fef8_0 {
    char padding_0[1];
    double field_1;
} st_c6fef8_0;

typedef struct st_c6fef8_2 {
    char padding_0[1];
    unsigned long long field_1;
} st_c6fef8_2;

typedef struct st_c6fef8_1 {
    unsigned long long *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_c6fef8_0 *field_18;
} st_c6fef8_1;

extern long long g_efbad0;

unsigned long long sub_c6fef8(st_c6fef8_1 *a0)
{
    st_c6fef8_2 *v6;  // x20
    unsigned long long v7;  // x9
    unsigned long long v16;  // x10
    unsigned long long *v17;  // x12
    unsigned long v18;  // d0
    unsigned long long v19;  // x15
    unsigned long long *v20;  // x13
    st_c6fef8_2 *i;  // x14
    unsigned long long *v22;  // x13
    unsigned long v24;  // x15
    unsigned long long v25;  // 4128
    unsigned long long v8;  // 4132
    unsigned long long v26;  // 4130
    unsigned long long v27;  // x16
    unsigned long long v28;  // x16
    unsigned long long v29;  // x16
    unsigned long long v30;  // x17
    unsigned long long v31;  // x1
    unsigned long v32;  // d0
    unsigned long long k;  // x3
    unsigned long long v34;  // x2
    st_c6fef8_1 *v9;  // x19
    unsigned long long v36;  // 4128
    unsigned long long v37;  // 4130
    unsigned long long v38;  // x2
    unsigned long long v39;  // x2
    unsigned long long v40;  // x1
    unsigned long v42;  // x1
    unsigned long long v43;  // 4137
    unsigned long long v44;  // 4139
    unsigned long long v45;  // x1
    unsigned long long v10;  // x8
    unsigned long long v46;  // x1
    char v47;  // x17
    uint128_t *v48;  // x16
    uint128_t v49;  // q1
    uint128_t *v50;  // x16
    unsigned long long *v51;  // x9
    unsigned long long v52;  // x10
    unsigned long long v53;  // x8
    unsigned long long v54;  // 4118
    unsigned long long iter;  // x12
    unsigned long long v11;  // x10
    unsigned long long v56;  // x11
    uint128_t v57;  // q1
    unsigned long long v60;  // x8
    unsigned long long v61;  // x10
    unsigned long long v62;  // x10
    void* v63;  // x13
    unsigned long long v64;  // x16
    unsigned long long v65;  // x15
    unsigned long long j;  // x11
    unsigned long long v66;  // x17
    unsigned long v67;  // d0
    unsigned long long l;  // x2
    unsigned long long v69;  // x0
    unsigned long long v70;  // x1
    unsigned long long v72;  // 4128
    unsigned long long v73;  // 4130
    unsigned long long v74;  // x1
    unsigned long long v75;  // x1
    unsigned long long v13;  // x12
    unsigned long long v76;  // x0
    unsigned long v78;  // x0
    unsigned long long v79;  // 4137
    unsigned long long v80;  // 4139
    unsigned long long v81;  // x0
    unsigned long long v82;  // x0
    void* v83;  // x17
    unsigned int v84;  // w1
    char v85;  // x16
    unsigned long long v14;  // x8
    unsigned long v86;  // x9
    unsigned long v87;  // x9
    unsigned long v88;  // x9
    unsigned long v89;  // x9
    char v90;  // x13
    unsigned long long v91;  // x14
    uint128_t v92;  // q1
    unsigned long long v15;  // x0
    unsigned long long v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0->field_18;
    v7 = (v6->padding_0)[1];
    v8 = arm64g_calculate_condition(0x22, v6, 1, 0);
    if (!(v8 & 1))
    {
        v9 = a0;
        v10 = a0->field_8;
        v11 = v10 + 1;
        j = v11 >> 3;
        v13 = j * 7;
        if (v10 < 8)
            v13 = v10;
        if (v7 > v13 >> 1)
        {
            sub_b98708();
            v14 = v1;
            v15 = v2;
            if (!v14)
                return v15;
            if (v6)
            {
                v16 = 0;
                v17 = v9->field_0;
                v18 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v17));
                v19 = __double_as_longlong(v18) & 0x8080808080808080;
                v20 = v17;
                i = v6;
                do
                {
                    v22 = v20;
                    if (!v19)
                    {
                        do
                        {
                            v22 = v20 + 1;
                            v24 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)&v20[1]));
                            v16 += 8;
                            v19 = v24 & 0x8080808080808080;
                            v20 = v22;
                        } while (!(v24 & 0x8080808080808080));
                    }
                    v20 = v22;
                    v25 = ((((((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v26 = (((((((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v19 & 0xaaaaaaaaaaaaaaaa) >> 1 | v19 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v27 = ((((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v27)
                        v28 = 64;
                    else
                        v28 = Clz(v27);
                    v29 = v16 + (v28 >> 3);
                    v30 = 5871781006564002453 * *(int *)((char *)&v17[-4 * v29] - 32);
                    v31 = v15 & v30;
                    v32 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v14 + v31)));
                    k = __double_as_longlong(v32);
                    if (!k)
                    {
                        v34 = 8;
                        do
                        {
                            v31 = v31 + v34 & v15;
                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v14 + v31)));
                            v34 += 8;
                        } while (!k);
                    }
                    v36 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v37 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v38 = ((((v37 | v36) & 0xffff0000ffff0000) >> 16 | (v37 | v36) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v37 | v36) & 0xffff0000ffff0000) >> 16 | (v37 | v36) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v38)
                        v39 = 64;
                    else
                        v39 = Clz(v38);
                    v40 = v31 + (v39 >> 3) & v15;
                    if (*(char *)(v14 + v40) >= 0)
                    {
                        v42 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v14));
                        v43 = ((((((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v44 = (((((((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v42 & 0xaaaaaaaaaaaaaaaa) >> 1 | v42 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v45 = ((((v44 | v43) & 0xffff0000ffff0000) >> 16 | (v44 | v43) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v44 | v43) & 0xffff0000ffff0000) >> 16 | (v44 | v43) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v45)
                            v46 = 64;
                        else
                            v46 = Clz(v45);
                        v40 = v46 >> 3;
                    }
                    v19 &= v19 - 1;
                    v47 = v30 >> 57;
                    *(char *)(v14 + v40) = v47;
                    *(char *)(v14 + (v40 - 8 & v15) + 8) = v47;
                    v48 = &v17[4 * ~v29];
                    v49 = v48[1];
                    v50 = v14 + ~v40 * 32;
                    *v50 = *v48;
                    v50[1] = v49;
                    i = (char *)i - 1;
                } while (i);
            }
            v51 = v9->field_0;
            v52 = v9->field_8;
            v9->field_0 = v14;
            v9->field_8 = v15;
            v9->field_10 = v3 - (char *)v6;
            v9->field_18 = v6;
            if (v52)
            {
                v53 = v52 * 32 + 39 & 0xffffffffffffffe0;
                v54 = arm64g_calculate_condition(2, v52 + v53, 9, 0);
                if (!(v54 & 1))
                    _free((char *)v51 - v53);
            }
        }
        else
        {
            if (v11)
            {
                v7 = v9->field_0;
                if (v11 & 7)
                    j += 1;
                iter = v7;
                do
                {
                    v56 = j;
                    v57 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                    *(unsigned long long *)iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v57 | 0x8080808080808080);
                    iter += 8;
                    j = v56 - 1;
                } while (j);
                if (v11 < 8)
                    goto LABEL_c702f8;
                *(long long *)(v7 + v11) = *(long long *)v7;
LABEL_c700b8:
                v61 = 0;
                do
                {
                    v62 = v61;
                    if (*(char *)(v7 + v62) == 128)
                    {
                        v63 = v7 + ~v62 * 32;
                        while (1)
                        {
                            v64 = 5871781006564002453 * *(int *)(v7 + -v62 * 32 - 32);
                            v65 = v9->field_8;
                            v66 = v65 & v64;
                            v67 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v7 + v66)));
                            l = __double_as_longlong(v67);
                            if (l)
                            {
                                v69 = v65 & v64;
                            }
                            else
                            {
                                v70 = 8;
                                v69 = v65 & v64;
                                do
                                {
                                    v69 = v69 + v70 & v65;
                                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v7 + v69)));
                                    v70 += 8;
                                } while (!l);
                            }
                            v72 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v73 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v74 = ((((v73 | v72) & 0xffff0000ffff0000) >> 16 | (v73 | v72) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v73 | v72) & 0xffff0000ffff0000) >> 16 | (v73 | v72) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v74)
                                v75 = 64;
                            else
                                v75 = Clz(v74);
                            v76 = v69 + (v75 >> 3) & v65;
                            if (*(char *)(v7 + v76) >= 0)
                            {
                                v78 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7));
                                v79 = ((((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v80 = (((((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v81 = ((((v80 | v79) & 0xffff0000ffff0000) >> 16 | (v80 | v79) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v80 | v79) & 0xffff0000ffff0000) >> 16 | (v80 | v79) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v81)
                                    v82 = 64;
                                else
                                    v82 = Clz(v81);
                                v76 = v82 >> 3;
                                if (8 > ((v76 - v66 ^ v62 - v66) & v65))
                                {
LABEL_c701fc:
                                    v90 = v64 >> 57;
                                    *(char *)(v7 + v62) = v90;
                                    v7 = v9->field_0;
                                    *(char *)(v7 + (v65 & v62 - 8) + 8) = v90;
                                    break;
                                }
                            }
                            else if (((v76 - v66 ^ v62 - v66) & v65) < 8)
                            {
                                goto LABEL_c701fc;
                            }
                            v83 = v7 + ~v76 * 32;
                            v84 = *(char *)(v7 + v76);
                            v85 = v64 >> 57;
                            *(char *)(v7 + v76) = v85;
                            v7 = v9->field_0;
                            *(char *)(v7 + (v76 - 8 & v65) + 8) = v85;
                            if (v84 != 0xff)
                            {
                                v86 = *(long long *)v63;
                                *(long long *)v63 = *(long long *)v83;
                                *(unsigned long *)v83 = v86;
                                v87 = (long long)v63[8];
                                *(long long *)&v63[8] = (long long)v83[8];
                                *(unsigned long *)&v83[8] = v87;
                                v88 = (long long)v63[16];
                                *(long long *)&v63[16] = (long long)v83[16];
                                *(unsigned long *)&v83[16] = v88;
                                v89 = (long long)v63[24];
                                *(long long *)&v63[24] = (long long)v83[24];
                                *(unsigned long *)&v83[24] = v89;
                                v7 = v9->field_0;
                            }
                            else
                            {
                                v91 = v9->field_8 & v62 - 8;
                                *(char *)(v7 + v62) = 0xff;
                                *(char *)(v7 + v91 + 8) = 0xff;
                                v92 = (int128_t)v63[16];
                                *(int128_t *)v83 = *(int128_t *)v63;
                                *(uint128_t *)&v83[16] = v92;
                                break;
                            }
                        }
                    }
                } while ((v61 = v62 + 1, v62 != v10));
                v60 = v9->field_8;
                if (v60 >= 8)
                    v60 = (v60 + 1 >> 3) * 7;
            }
            else
            {
                v60 = 0;
            }
            v9->field_10 = v60 - (char *)v9->field_18;
        }
        return 9223372036854775809;
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c702f8:
    v0 = v7;
    _memmove(v7 + 8, v7, v10 + 1);
    v7 = v0;
    goto LABEL_c700b8;
}
