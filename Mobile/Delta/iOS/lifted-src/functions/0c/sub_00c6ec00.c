/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6ec00..0xc6f054 (1108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6ec00_0 {
    unsigned long long *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c6ec00_0;

typedef struct st_c6ec00_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_c6ec00_1;

extern long long g_efbad0;

unsigned long long sub_c6ec00(st_c6ec00_0 *a0, unsigned long a1)
{
    unsigned long v6;  // x20
    unsigned long long v7;  // x9
    unsigned long long v16;  // x10
    unsigned long long *v17;  // x12
    unsigned long v18;  // d0
    unsigned long long v19;  // x16
    unsigned long long *v20;  // x14
    unsigned long i;  // x15
    unsigned long long *v22;  // x14
    unsigned long v24;  // x16
    unsigned long long v25;  // 4128
    unsigned long long v8;  // 4133
    unsigned long long v26;  // 4130
    unsigned long long v27;  // x17
    unsigned long long v28;  // x17
    unsigned long long v29;  // x17
    unsigned long long v30;  // x1
    unsigned long long v31;  // x2
    unsigned long v32;  // d0
    unsigned long long k;  // x4
    unsigned long long v34;  // x3
    st_c6ec00_0 *v9;  // x19
    unsigned long long v36;  // 4128
    unsigned long long v37;  // 4130
    unsigned long long v38;  // x3
    unsigned long long v39;  // x3
    unsigned long long v40;  // x2
    unsigned long v42;  // x2
    unsigned long long v43;  // 4137
    unsigned long long v44;  // 4139
    unsigned long long v45;  // x2
    unsigned long long v10;  // x8
    unsigned long long v46;  // x2
    char v47;  // x1
    st_c6ec00_1 *v48;  // x17
    uint128_t v49;  // q0
    uint128_t v50;  // q1
    st_c6ec00_1 *v51;  // x1
    unsigned long long *v52;  // x9
    unsigned long long v53;  // x10
    unsigned long long v54;  // x8
    unsigned long long v55;  // 4119
    unsigned long long v11;  // x10
    unsigned long long *iter;  // x12
    unsigned long long v57;  // x11
    uint128_t v58;  // q1
    unsigned long long v61;  // x8
    unsigned long long v62;  // x10
    unsigned long long v63;  // x10
    void* v64;  // x14
    unsigned long long v65;  // x17
    unsigned long long j;  // x11
    unsigned long long v66;  // x16
    unsigned long long v67;  // x0
    unsigned long v68;  // d0
    unsigned long long l;  // x3
    unsigned long long v70;  // x1
    unsigned long long v71;  // x2
    unsigned long long v73;  // 4128
    unsigned long long v74;  // 4130
    unsigned long long v75;  // x2
    unsigned long long v13;  // x12
    unsigned long long v76;  // x2
    unsigned long long v77;  // x1
    unsigned long v79;  // x1
    unsigned long long v80;  // 4137
    unsigned long long v81;  // 4139
    unsigned long long v82;  // x1
    unsigned long long v83;  // x1
    void* v84;  // x0
    unsigned int v85;  // w2
    unsigned long long v14;  // x8
    char v86;  // x17
    unsigned long v87;  // x9
    unsigned long v88;  // x9
    unsigned long v89;  // x9
    unsigned long v90;  // x9
    unsigned long v91;  // x9
    char v92;  // x14
    unsigned long long v93;  // x15
    uint128_t v94;  // q0
    uint128_t v95;  // q1
    unsigned long long v15;  // x0
    unsigned long long v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0->field_18;
    v7 = v6 + a1;
    v8 = arm64g_calculate_condition(0x22, v6, a1, 0);
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
                    v30 = 5871781006564002453 * *(int *)((char *)v17 + -(40 * v29) - 40);
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
                    v48 = &v17[5 * ~v29];
                    v49 = v48->field_0;
                    v50 = v48->field_10;
                    v51 = v14 + 40 * ~v40;
                    v51->field_20 = v48->field_20;
                    v51->field_0 = v49;
                    v51->field_10 = v50;
                    i -= 1;
                } while (i);
            }
            v52 = v9->field_0;
            v53 = v9->field_8;
            v9->field_0 = v14;
            v9->field_8 = v15;
            v9->field_10 = v3 - v6;
            v9->field_18 = v6;
            if (v53)
            {
                v54 = 47 + 40 * v53 & 0xfffffffffffffff8;
                v55 = arm64g_calculate_condition(2, v53 + v54, 9, 0);
                if (!(v55 & 1))
                    _free((char *)v52 - v54);
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
                    v57 = j;
                    v58 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                    *iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v58 | 0x8080808080808080);
                    iter += 1;
                    j = v57 - 1;
                } while (j);
                if (v11 < 8)
                    goto LABEL_c6f030;
                *(long long *)(v7 + v11) = *(long long *)v7;
LABEL_c6edd0:
                v62 = 0;
                do
                {
                    v63 = v62;
                    if (*(char *)(v7 + v63) == 128)
                    {
                        v64 = v7 + 40 * ~v63;
                        while (1)
                        {
                            v65 = 5871781006564002453 * *(int *)(v7 + 40 * -v63 - 40);
                            v66 = v9->field_8;
                            v67 = v66 & v65;
                            v68 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v7 + v67)));
                            l = __double_as_longlong(v68);
                            if (l)
                            {
                                v70 = v66 & v65;
                            }
                            else
                            {
                                v71 = 8;
                                v70 = v66 & v65;
                                do
                                {
                                    v70 = v70 + v71 & v66;
                                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v7 + v70)));
                                    v71 += 8;
                                } while (!l);
                            }
                            v73 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v74 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v75 = ((((v74 | v73) & 0xffff0000ffff0000) >> 16 | (v74 | v73) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v74 | v73) & 0xffff0000ffff0000) >> 16 | (v74 | v73) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v75)
                                v76 = 64;
                            else
                                v76 = Clz(v75);
                            v77 = v70 + (v76 >> 3) & v66;
                            if (*(char *)(v7 + v77) >= 0)
                            {
                                v79 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7));
                                v80 = ((((((v79 & 0xaaaaaaaaaaaaaaaa) >> 1 | v79 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v79 & 0xaaaaaaaaaaaaaaaa) >> 1 | v79 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v79 & 0xaaaaaaaaaaaaaaaa) >> 1 | v79 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v79 & 0xaaaaaaaaaaaaaaaa) >> 1 | v79 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v81 = (((((((v79 & 0xaaaaaaaaaaaaaaaa) >> 1 | v79 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v79 & 0xaaaaaaaaaaaaaaaa) >> 1 | v79 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v79 & 0xaaaaaaaaaaaaaaaa) >> 1 | v79 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v79 & 0xaaaaaaaaaaaaaaaa) >> 1 | v79 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v82 = ((((v81 | v80) & 0xffff0000ffff0000) >> 16 | (v81 | v80) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v81 | v80) & 0xffff0000ffff0000) >> 16 | (v81 | v80) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v82)
                                    v83 = 64;
                                else
                                    v83 = Clz(v82);
                                v77 = v83 >> 3;
                                if (8 > ((v77 - v67 ^ v63 - v67) & v66))
                                {
LABEL_c6ef28:
                                    v92 = v65 >> 57;
                                    *(char *)(v7 + v63) = v92;
                                    v7 = v9->field_0;
                                    *(char *)(v7 + (v66 & v63 - 8) + 8) = v92;
                                    break;
                                }
                            }
                            else if (((v77 - v67 ^ v63 - v67) & v66) < 8)
                            {
                                goto LABEL_c6ef28;
                            }
                            v84 = v7 + 40 * ~v77;
                            v85 = *(char *)(v7 + v77);
                            v86 = v65 >> 57;
                            *(char *)(v7 + v77) = v86;
                            v7 = v9->field_0;
                            *(char *)(v7 + (v77 - 8 & v66) + 8) = v86;
                            if (v85 != 0xff)
                            {
                                v87 = *(long long *)v64;
                                *(long long *)v64 = *(long long *)v84;
                                *(unsigned long *)v84 = v87;
                                v88 = (long long)v64[8];
                                *(long long *)&v64[8] = (long long)v84[8];
                                *(unsigned long *)&v84[8] = v88;
                                v89 = (long long)v64[16];
                                *(long long *)&v64[16] = (long long)v84[16];
                                *(unsigned long *)&v84[16] = v89;
                                v90 = (long long)v64[24];
                                *(long long *)&v64[24] = (long long)v84[24];
                                *(unsigned long *)&v84[24] = v90;
                                v91 = (long long)v64[32];
                                *(long long *)&v64[32] = (long long)v84[32];
                                *(unsigned long *)&v84[32] = v91;
                                v7 = v9->field_0;
                            }
                            else
                            {
                                v93 = v9->field_8 & v63 - 8;
                                *(char *)(v7 + v63) = 0xff;
                                *(char *)(v7 + v93 + 8) = 0xff;
                                v94 = *(int128_t *)v64;
                                v95 = (int128_t)v64[16];
                                *(long long *)&v84[32] = (long long)v64[32];
                                *(uint128_t *)v84 = v94;
                                *(uint128_t *)&v84[16] = v95;
                                break;
                            }
                        }
                    }
                } while ((v62 = v63 + 1, v63 != v10));
                v61 = v9->field_8;
                if (v61 >= 8)
                    v61 = (v61 + 1 >> 3) * 7;
            }
            else
            {
                v61 = 0;
            }
            v9->field_10 = v61 - v9->field_18;
        }
        return 9223372036854775809;
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c6f030:
    v0 = v7;
    _memmove(v7 + 8, v7, v10 + 1);
    v7 = v0;
    goto LABEL_c6edd0;
}
