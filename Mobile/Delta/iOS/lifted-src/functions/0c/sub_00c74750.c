/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc74750..0xc74ba4 (1108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c74750_1 {
    char padding_0[1];
    unsigned long long field_1;
} st_c74750_1;

extern long long g_efbad0;

unsigned long long sub_c74750(void* a0)
{
    st_c74750_1 *v12;  // x20
    unsigned long long v13;  // x9
    unsigned long long v22;  // x12
    void* v23;  // x14
    unsigned long v24;  // d0
    unsigned long long v25;  // x17
    void* v26;  // x15
    st_c74750_1 *i;  // x16
    void* v28;  // x15
    unsigned long v30;  // x17
    unsigned long long v31;  // 4128
    unsigned long long v14;  // 4132
    unsigned long long v32;  // 4130
    unsigned long long v33;  // x1
    unsigned long long v34;  // x1
    unsigned long long v35;  // x1
    unsigned long long v36;  // x2
    unsigned long long v37;  // x3
    unsigned long v38;  // d0
    unsigned long long k;  // x5
    unsigned long long v40;  // x4
    void* v15;  // x19
    unsigned long long v42;  // 4128
    unsigned long long v43;  // 4130
    unsigned long long v44;  // x4
    unsigned long long v45;  // x4
    unsigned long long v46;  // x3
    unsigned long v48;  // x3
    unsigned long long v49;  // 4137
    unsigned long long v50;  // 4139
    unsigned long long v51;  // x3
    unsigned long long v16;  // x8
    unsigned long long v52;  // x3
    char v53;  // x2
    void* v54;  // q3
    uint128_t v55;  // q2
    unsigned long long v56;  // x8
    unsigned long long v57;  // x9
    unsigned long long v58;  // x10
    unsigned long long v59;  // 4118
    unsigned long long iter;  // x12
    unsigned long long v61;  // x11
    unsigned long long v17;  // x10
    uint128_t v62;  // q1
    unsigned long long v65;  // x8
    unsigned long long v66;  // x10
    unsigned long long v67;  // x10
    void* v68;  // x13
    unsigned long long v69;  // x16
    unsigned long long v70;  // x15
    unsigned long long v71;  // x17
    unsigned long long j;  // x11
    unsigned long v72;  // d0
    unsigned long long l;  // x2
    unsigned long long v74;  // x0
    unsigned long long v75;  // x1
    unsigned long long v77;  // 4128
    unsigned long long v78;  // 4130
    unsigned long long v79;  // x1
    unsigned long long v80;  // x1
    unsigned long long v81;  // x0
    unsigned long long v19;  // x12
    unsigned long v83;  // x0
    unsigned long long v84;  // 4137
    unsigned long long v85;  // 4139
    unsigned long long v86;  // x0
    unsigned long long v87;  // x0
    void* v88;  // x17
    unsigned int v89;  // w1
    char v90;  // x16
    unsigned long v91;  // x9
    unsigned long long v20;  // x11
    unsigned long v92;  // x9
    char v93;  // x13
    unsigned long long v94;  // x14
    unsigned long long v21;  // x0
    unsigned long long v0;  // [bp-0x80]
    char *v1;  // [bp-0x78]
    uint128_t v2;  // [bp-0x70]
    void* v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    void* v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = (long long)a0[24];
    v13 = (v12->padding_0)[1];
    v14 = arm64g_calculate_condition(0x22, v12, 1, 0);
    if (!(v14 & 1))
    {
        v15 = a0;
        v16 = (long long)a0[8];
        v17 = v16 + 1;
        j = v17 >> 3;
        v19 = j * 7;
        if (v16 < 8)
            v19 = v16;
        if (v13 > v19 >> 1)
        {
            sub_b98708();
            v20 = v6;
            v21 = v7;
            if (!v20)
                return v21;
            v1 = v15 + 32;
            v2 = 0x80000000000000010;
            v3 = CONCAT(v21, v20);
            v5 = v9;
            if (v12)
            {
                v22 = 0;
                v23 = *(long long *)v15;
                v24 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v23));
                v25 = __double_as_longlong(v24) & 0x8080808080808080;
                v26 = v23;
                i = v12;
                do
                {
                    v28 = v26;
                    if (!v25)
                    {
                        do
                        {
                            v28 = v26 + 8;
                            v30 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)__double_as_longlong((double)v26[8])));
                            v22 += 8;
                            v25 = v30 & 0x8080808080808080;
                            v26 = v28;
                        } while (!(v30 & 0x8080808080808080));
                    }
                    v26 = v28;
                    v31 = ((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v32 = (((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v33 = ((((v32 | v31) & 0xffff0000ffff0000) >> 16 | (v32 | v31) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v32 | v31) & 0xffff0000ffff0000) >> 16 | (v32 | v31) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v33)
                        v34 = 64;
                    else
                        v34 = Clz(v33);
                    v35 = v22 + (v34 >> 3);
                    v36 = 5871781006564002453 * *(long long *)((char *)v23 + -16 * v35 - 16);
                    v37 = v21 & v36;
                    v38 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v20 + v37)));
                    k = __double_as_longlong(v38);
                    if (!k)
                    {
                        v40 = 8;
                        do
                        {
                            v37 = v37 + v40 & v21;
                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v20 + v37)));
                            v40 += 8;
                        } while (!k);
                    }
                    v42 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v43 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v44 = ((((v43 | v42) & 0xffff0000ffff0000) >> 16 | (v43 | v42) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v43 | v42) & 0xffff0000ffff0000) >> 16 | (v43 | v42) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v44)
                        v45 = 64;
                    else
                        v45 = Clz(v44);
                    v46 = v37 + (v45 >> 3) & v21;
                    if (*(char *)(v20 + v46) >= 0)
                    {
                        v48 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v20));
                        v49 = ((((((v48 & 0xaaaaaaaaaaaaaaaa) >> 1 | v48 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v48 & 0xaaaaaaaaaaaaaaaa) >> 1 | v48 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v48 & 0xaaaaaaaaaaaaaaaa) >> 1 | v48 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v48 & 0xaaaaaaaaaaaaaaaa) >> 1 | v48 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v50 = (((((((v48 & 0xaaaaaaaaaaaaaaaa) >> 1 | v48 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v48 & 0xaaaaaaaaaaaaaaaa) >> 1 | v48 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v48 & 0xaaaaaaaaaaaaaaaa) >> 1 | v48 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v48 & 0xaaaaaaaaaaaaaaaa) >> 1 | v48 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v51 = ((((v50 | v49) & 0xffff0000ffff0000) >> 16 | (v50 | v49) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v50 | v49) & 0xffff0000ffff0000) >> 16 | (v50 | v49) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v51)
                            v52 = 64;
                        else
                            v52 = Clz(v51);
                        v46 = v52 >> 3;
                    }
                    v25 &= v25 - 1;
                    v53 = v36 >> 57;
                    *(char *)(v20 + v46) = v53;
                    *(char *)(v20 + (v46 - 8 & v21) + 8) = v53;
                    *(int128_t *)(v20 + ~v46 * 16) = *(int128_t *)((char *)v23 + 16 * ~v35);
                    i = (char *)i - 1;
                } while (i);
            }
            v4 = CONCAT(v12, v8 - (char *)v12);
            if (&v6 > v15 && v1 > &v3)
            {
                v54 = (void*)*(int128_t *)v15;
                v55 = (int128_t)v15[16];
                *(uint128_t *)v15 = (uint128_t)v3;
                *(uint128_t *)&v15[16] = v4;
                v3 = v54;
                v4 = v55;
                v56 = v3;
                v57 = *(unsigned long long *)((void*)&v3 + 8);
                if (v57)
                    goto LABEL_c74b44;
            }
            else
            {
                v56 = *(long long *)v15;
                v57 = (long long)v15[8];
                *(uint128_t *)v15 = (uint128_t)v3;
                *(uint128_t *)&v15[16] = v4;
                if (v57)
                {
LABEL_c74b44:
                    v58 = v57 * 16 + 23 & 0xfffffffffffffff0;
                    v59 = arm64g_calculate_condition(2, v57 + v58, 9, 0);
                    if (!(v59 & 1))
                        _free(v56 - v58);
                }
            }
        }
        else
        {
            if (v17)
            {
                v13 = *(long long *)v15;
                if (v17 & 7)
                    j += 1;
                iter = v13;
                do
                {
                    v61 = j;
                    v62 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                    *(unsigned long long *)iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v62 | 0x8080808080808080);
                    iter += 8;
                    j = v61 - 1;
                } while (j);
                if (v17 < 8)
                    goto LABEL_c74b80;
                *(long long *)(v13 + v17) = *(long long *)v13;
LABEL_c74928:
                v66 = 0;
                do
                {
                    v67 = v66;
                    if (*(char *)(v13 + v67) == 128)
                    {
                        v68 = v13 + ~v67 * 16;
                        while (1)
                        {
                            v69 = 5871781006564002453 * *(long long *)(v13 + -v67 * 16 - 16);
                            v70 = (long long)v15[8];
                            v71 = v70 & v69;
                            v72 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v13 + v71)));
                            l = __double_as_longlong(v72);
                            if (l)
                            {
                                v74 = v70 & v69;
                            }
                            else
                            {
                                v75 = 8;
                                v74 = v70 & v69;
                                do
                                {
                                    v74 = v74 + v75 & v70;
                                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v13 + v74)));
                                    v75 += 8;
                                } while (!l);
                            }
                            v77 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v78 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v79 = ((((v78 | v77) & 0xffff0000ffff0000) >> 16 | (v78 | v77) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v78 | v77) & 0xffff0000ffff0000) >> 16 | (v78 | v77) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v79)
                                v80 = 64;
                            else
                                v80 = Clz(v79);
                            v81 = v74 + (v80 >> 3) & v70;
                            if (*(char *)(v13 + v81) >= 0)
                            {
                                v83 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v13));
                                v84 = ((((((v83 & 0xaaaaaaaaaaaaaaaa) >> 1 | v83 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v83 & 0xaaaaaaaaaaaaaaaa) >> 1 | v83 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v83 & 0xaaaaaaaaaaaaaaaa) >> 1 | v83 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v83 & 0xaaaaaaaaaaaaaaaa) >> 1 | v83 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v85 = (((((((v83 & 0xaaaaaaaaaaaaaaaa) >> 1 | v83 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v83 & 0xaaaaaaaaaaaaaaaa) >> 1 | v83 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v83 & 0xaaaaaaaaaaaaaaaa) >> 1 | v83 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v83 & 0xaaaaaaaaaaaaaaaa) >> 1 | v83 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v86 = ((((v85 | v84) & 0xffff0000ffff0000) >> 16 | (v85 | v84) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v85 | v84) & 0xffff0000ffff0000) >> 16 | (v85 | v84) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v86)
                                    v87 = 64;
                                else
                                    v87 = Clz(v86);
                                v81 = v87 >> 3;
                                if (8 > ((v81 - v71 ^ v67 - v71) & v70))
                                {
LABEL_c74a4c:
                                    v93 = v69 >> 57;
                                    *(char *)(v13 + v67) = v93;
                                    v13 = *(long long *)v15;
                                    *(char *)(v13 + (v70 & v67 - 8) + 8) = v93;
                                    break;
                                }
                            }
                            else if (((v81 - v71 ^ v67 - v71) & v70) < 8)
                            {
                                goto LABEL_c74a4c;
                            }
                            v88 = v13 + ~v81 * 16;
                            v89 = *(char *)(v13 + v81);
                            v90 = v69 >> 57;
                            *(char *)(v13 + v81) = v90;
                            v13 = *(long long *)v15;
                            *(char *)(v13 + (v81 - 8 & v70) + 8) = v90;
                            if (v89 != 0xff)
                            {
                                v91 = *(long long *)v68;
                                *(long long *)v68 = *(long long *)v88;
                                *(unsigned long *)v88 = v91;
                                v92 = (long long)v68[8];
                                *(long long *)&v68[8] = (long long)v88[8];
                                *(unsigned long *)&v88[8] = v92;
                                v13 = *(long long *)v15;
                            }
                            else
                            {
                                v94 = (long long)v15[8] & v67 - 8;
                                *(char *)(v13 + v67) = 0xff;
                                *(char *)(v13 + v94 + 8) = 0xff;
                                *(int128_t *)v88 = *(int128_t *)v68;
                                break;
                            }
                        }
                    }
                } while ((v66 = v67 + 1, v67 != v16));
                v65 = (long long)v15[8];
                if (v65 >= 8)
                    v65 = (v65 + 1 >> 3) * 7;
            }
            else
            {
                v65 = 0;
            }
            *(unsigned long long *)&v15[16] = v65 - (long long)v15[24];
        }
        return 9223372036854775809;
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c74b80:
    v0 = v13;
    _memmove(v13 + 8, v13, v16 + 1);
    v13 = v0;
    goto LABEL_c74928;
}
