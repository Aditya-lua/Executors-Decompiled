/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6f054..0xc6f450 (1020 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6f054_0 {
    char padding_0[1];
    double field_1;
} st_c6f054_0;

typedef struct st_c6f054_2 {
    char padding_0[1];
    unsigned long long field_1;
} st_c6f054_2;

typedef struct st_c6f054_1 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_c6f054_0 *field_18;
} st_c6f054_1;

extern long long g_efbad0;

unsigned long long sub_c6f054(st_c6f054_1 *a0)
{
    st_c6f054_2 *v6;  // x20
    unsigned long long v7;  // x9
    unsigned long long v16;  // x10
    void* v17;  // x12
    unsigned long v18;  // d0
    unsigned long long v19;  // x15
    void* v20;  // x13
    st_c6f054_2 *i;  // x14
    void* v22;  // x13
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
    st_c6f054_1 *v9;  // x19
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
    void* v48;  // x9
    unsigned long long v49;  // x10
    unsigned long long v50;  // x8
    unsigned long long v51;  // 4118
    unsigned long long iter;  // x12
    unsigned long long v53;  // x11
    uint128_t v54;  // q1
    unsigned long long v11;  // x10
    unsigned long long v57;  // x8
    unsigned long long v58;  // x10
    unsigned long long v59;  // x10
    void* v60;  // x13
    unsigned long long v61;  // x16
    unsigned long long v62;  // x15
    unsigned long long v63;  // x17
    unsigned long v64;  // d0
    unsigned long long l;  // x2
    unsigned long long j;  // x11
    unsigned long long v66;  // x0
    unsigned long long v67;  // x1
    unsigned long long v69;  // 4128
    unsigned long long v70;  // 4130
    unsigned long long v71;  // x1
    unsigned long long v72;  // x1
    unsigned long long v73;  // x0
    unsigned long v75;  // x0
    unsigned long long v13;  // x12
    unsigned long long v76;  // 4137
    unsigned long long v77;  // 4139
    unsigned long long v78;  // x0
    unsigned long long v79;  // x0
    void* v80;  // x17
    unsigned int v81;  // w1
    char v82;  // x16
    unsigned long v83;  // x9
    unsigned long v84;  // x9
    char v85;  // x13
    unsigned long long v14;  // x8
    unsigned long long v86;  // x14
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
                            v22 = v20 + 8;
                            v24 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)__double_as_longlong((double)v20[8])));
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
                    v30 = 5871781006564002453 * *(int *)((char *)v17 + -16 * v29 - 16);
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
                    *(int128_t *)(v14 + ~v40 * 16) = *(int128_t *)((char *)v17 + 16 * ~v29);
                    i = (char *)i - 1;
                } while (i);
            }
            v48 = v9->field_0;
            v49 = v9->field_8;
            v9->field_0 = v14;
            v9->field_8 = v15;
            v9->field_10 = v3 - (char *)v6;
            v9->field_18 = v6;
            if (v49)
            {
                v50 = v49 * 16 + 23 & 0xfffffffffffffff0;
                v51 = arm64g_calculate_condition(2, v49 + v50, 9, 0);
                if (!(v51 & 1))
                    _free(v48 - v50);
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
                    v53 = j;
                    v54 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                    *(unsigned long long *)iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v54 | 0x8080808080808080);
                    iter += 8;
                    j = v53 - 1;
                } while (j);
                if (v11 < 8)
                    goto LABEL_c6f42c;
                *(long long *)(v7 + v11) = *(long long *)v7;
LABEL_c6f20c:
                v58 = 0;
                do
                {
                    v59 = v58;
                    if (*(char *)(v7 + v59) == 128)
                    {
                        v60 = v7 + ~v59 * 16;
                        while (1)
                        {
                            v61 = 5871781006564002453 * *(int *)(v7 + -v59 * 16 - 16);
                            v62 = v9->field_8;
                            v63 = v62 & v61;
                            v64 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v7 + v63)));
                            l = __double_as_longlong(v64);
                            if (l)
                            {
                                v66 = v62 & v61;
                            }
                            else
                            {
                                v67 = 8;
                                v66 = v62 & v61;
                                do
                                {
                                    v66 = v66 + v67 & v62;
                                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v7 + v66)));
                                    v67 += 8;
                                } while (!l);
                            }
                            v69 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v70 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v71 = ((((v70 | v69) & 0xffff0000ffff0000) >> 16 | (v70 | v69) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v70 | v69) & 0xffff0000ffff0000) >> 16 | (v70 | v69) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v71)
                                v72 = 64;
                            else
                                v72 = Clz(v71);
                            v73 = v66 + (v72 >> 3) & v62;
                            if (*(char *)(v7 + v73) >= 0)
                            {
                                v75 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7));
                                v76 = ((((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v77 = (((((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v78 = ((((v77 | v76) & 0xffff0000ffff0000) >> 16 | (v77 | v76) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v77 | v76) & 0xffff0000ffff0000) >> 16 | (v77 | v76) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v78)
                                    v79 = 64;
                                else
                                    v79 = Clz(v78);
                                v73 = v79 >> 3;
                                if (8 > ((v73 - v63 ^ v59 - v63) & v62))
                                {
LABEL_c6f330:
                                    v85 = v61 >> 57;
                                    *(char *)(v7 + v59) = v85;
                                    v7 = v9->field_0;
                                    *(char *)(v7 + (v62 & v59 - 8) + 8) = v85;
                                    break;
                                }
                            }
                            else if (((v73 - v63 ^ v59 - v63) & v62) < 8)
                            {
                                goto LABEL_c6f330;
                            }
                            v80 = v7 + ~v73 * 16;
                            v81 = *(char *)(v7 + v73);
                            v82 = v61 >> 57;
                            *(char *)(v7 + v73) = v82;
                            v7 = v9->field_0;
                            *(char *)(v7 + (v73 - 8 & v62) + 8) = v82;
                            if (v81 != 0xff)
                            {
                                v83 = *(long long *)v60;
                                *(long long *)v60 = *(long long *)v80;
                                *(unsigned long *)v80 = v83;
                                v84 = (long long)v60[8];
                                *(long long *)&v60[8] = (long long)v80[8];
                                *(unsigned long *)&v80[8] = v84;
                                v7 = v9->field_0;
                            }
                            else
                            {
                                v86 = v9->field_8 & v59 - 8;
                                *(char *)(v7 + v59) = 0xff;
                                *(char *)(v7 + v86 + 8) = 0xff;
                                *(int128_t *)v80 = *(int128_t *)v60;
                                break;
                            }
                        }
                    }
                } while ((v58 = v59 + 1, v59 != v10));
                v57 = v9->field_8;
                if (v57 >= 8)
                    v57 = (v57 + 1 >> 3) * 7;
            }
            else
            {
                v57 = 0;
            }
            v9->field_10 = v57 - (char *)v9->field_18;
        }
        return 9223372036854775809;
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c6f42c:
    v0 = v7;
    _memmove(v7 + 8, v7, v10 + 1);
    v7 = v0;
    goto LABEL_c6f20c;
}
