/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73e94..0xc742f4 (1120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efbad0;

unsigned long long sub_c73e94(void* a0, unsigned long a1)
{
    unsigned long v11;  // x20
    unsigned long long v12;  // x8
    unsigned long long v21;  // x12
    unsigned long long *v22;  // x14
    unsigned long v23;  // d0
    unsigned long long v24;  // x17
    unsigned long long *v25;  // x15
    unsigned long i;  // x16
    unsigned long long *v27;  // x15
    unsigned long v29;  // x17
    unsigned long long v30;  // 4128
    unsigned long long v13;  // 4157
    unsigned long long v31;  // 4130
    unsigned long long v32;  // x1
    unsigned long long v33;  // x1
    unsigned long long v34;  // x1
    unsigned long long v35;  // x2
    unsigned long long v36;  // x3
    unsigned long v37;  // d0
    unsigned long long k;  // x5
    unsigned long long v39;  // x4
    void* v14;  // x19
    unsigned long long v41;  // 4128
    unsigned long long v42;  // 4130
    unsigned long long v43;  // x4
    unsigned long long v44;  // x4
    unsigned long long v45;  // x3
    unsigned long v47;  // x3
    unsigned long long v48;  // 4137
    unsigned long long v49;  // 4139
    unsigned long long v50;  // x3
    unsigned long long v15;  // x21
    unsigned long long v51;  // x3
    char v52;  // x2
    uint128_t *v53;  // x1
    uint128_t v54;  // q1
    uint128_t *v55;  // x1
    unsigned long long *v56;  // q3
    uint128_t v57;  // q2
    unsigned long long v58;  // x8
    unsigned long long v59;  // x9
    unsigned long long v60;  // x10
    unsigned long long v16;  // x9
    unsigned long long v61;  // 4118
    unsigned long long *iter;  // x11
    unsigned long long v63;  // x10
    uint128_t v64;  // q1
    unsigned long long v67;  // x8
    unsigned long long v68;  // x22
    unsigned long long v69;  // x22
    uint128_t *v70;  // x20
    unsigned long long j;  // x10
    unsigned long long v71;  // x10
    unsigned long long v72;  // x9
    unsigned long long v73;  // x11
    unsigned long v74;  // d0
    unsigned long long l;  // x14
    unsigned long long v76;  // x12
    unsigned long long v77;  // x13
    unsigned long long v79;  // 4128
    unsigned long long v80;  // 4130
    unsigned long long v18;  // x11
    unsigned long long v81;  // x13
    unsigned long long v82;  // x13
    unsigned long long v83;  // x12
    unsigned long v85;  // x12
    unsigned long long v86;  // 4137
    unsigned long long v87;  // 4139
    unsigned long long v88;  // x12
    unsigned long long v89;  // x12
    uint128_t *v90;  // x1
    unsigned long long v19;  // x11
    unsigned int v91;  // w11
    char v92;  // x10
    char v93;  // x10
    unsigned long long v94;  // x9
    uint128_t v95;  // q1
    unsigned long long v20;  // x0
    char *v0;  // [bp-0xa8]
    uint128_t v1;  // [bp-0xa0]
    unsigned long long *v2;  // [bp-0x90]
    uint128_t v3;  // [bp-0x80]
    unsigned long long v4;  // [bp-0x78]
    unsigned long long *v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x68]
    unsigned long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = (long long)a0[24];
    v12 = v11 + a1;
    v13 = arm64g_calculate_condition(0x22, v11, a1, 0);
    if (!(v13 & 1))
    {
        v14 = a0;
        v15 = (long long)a0[8];
        v16 = v15 + 1;
        j = v16 >> 3;
        v18 = j * 7;
        if (v15 < 8)
            v18 = v15;
        if (v12 > v18 >> 1)
        {
            sub_b98708();
            v19 = v5;
            v20 = v6;
            if (!v19)
                return v20;
            v0 = v14 + 32;
            v1 = 0x80000000000000020;
            v2 = CONCAT(v20, v19);
            v4 = v8;
            if (v11)
            {
                v21 = 0;
                v22 = *(long long *)v14;
                v23 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v22));
                v24 = __double_as_longlong(v23) & 0x8080808080808080;
                v25 = v22;
                i = v11;
                do
                {
                    v27 = v25;
                    if (!v24)
                    {
                        do
                        {
                            v27 = v25 + 1;
                            v29 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)&v25[1]));
                            v21 += 8;
                            v24 = v29 & 0x8080808080808080;
                            v25 = v27;
                        } while (!(v29 & 0x8080808080808080));
                    }
                    v25 = v27;
                    v30 = ((((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v31 = (((((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v24 & 0xaaaaaaaaaaaaaaaa) >> 1 | v24 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v32 = ((((v31 | v30) & 0xffff0000ffff0000) >> 16 | (v31 | v30) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v31 | v30) & 0xffff0000ffff0000) >> 16 | (v31 | v30) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v32)
                        v33 = 64;
                    else
                        v33 = Clz(v32);
                    v34 = v21 + (v33 >> 3);
                    v35 = 5871781006564002453 * (*(long long *)((char *)&v22[-4 * v34] - 32) + 8);
                    v36 = v20 & v35;
                    v37 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v19 + v36)));
                    k = __double_as_longlong(v37);
                    if (!k)
                    {
                        v39 = 8;
                        do
                        {
                            v36 = v36 + v39 & v20;
                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v19 + v36)));
                            v39 += 8;
                        } while (!k);
                    }
                    v41 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v42 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v43 = ((((v42 | v41) & 0xffff0000ffff0000) >> 16 | (v42 | v41) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v42 | v41) & 0xffff0000ffff0000) >> 16 | (v42 | v41) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v43)
                        v44 = 64;
                    else
                        v44 = Clz(v43);
                    v45 = v36 + (v44 >> 3) & v20;
                    if (*(char *)(v19 + v45) >= 0)
                    {
                        v47 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v19));
                        v48 = ((((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v49 = (((((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v47 & 0xaaaaaaaaaaaaaaaa) >> 1 | v47 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v50 = ((((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v50)
                            v51 = 64;
                        else
                            v51 = Clz(v50);
                        v45 = v51 >> 3;
                    }
                    v24 &= v24 - 1;
                    v52 = v35 >> 57;
                    *(char *)(v19 + v45) = v52;
                    *(char *)(v19 + (v45 - 8 & v20) + 8) = v52;
                    v53 = &v22[4 * ~v34];
                    v54 = v53[1];
                    v55 = v19 + ~v45 * 32;
                    *v55 = *v53;
                    v55[1] = v54;
                    i -= 1;
                } while (i);
            }
            v3 = CONCAT(v11, v7 - v11);
            if (&v5 > v14 && v0 > &v2)
            {
                v56 = (unsigned long long *)*(int128_t *)v14;
                v57 = (int128_t)v14[16];
                *(uint128_t *)v14 = (uint128_t)v2;
                *(uint128_t *)&v14[16] = v3;
                v2 = v56;
                v3 = v57;
                v58 = v2;
                v59 = *(unsigned long long *)((void*)&v2 + 8);
                if (v59)
                    goto LABEL_c7429c;
            }
            else
            {
                v58 = *(long long *)v14;
                v59 = (long long)v14[8];
                *(uint128_t *)v14 = (uint128_t)v2;
                *(uint128_t *)&v14[16] = v3;
                if (v59)
                {
LABEL_c7429c:
                    v60 = v59 * 32 + 39 & 0xffffffffffffffe0;
                    v61 = arm64g_calculate_condition(2, v59 + v60, 9, 0);
                    if (!(v61 & 1))
                        _free(v58 - v60);
                }
            }
        }
        else
        {
            if (v16)
            {
                v12 = *(long long *)v14;
                if (v16 & 7)
                    j += 1;
                iter = v12;
                do
                {
                    v63 = j;
                    v64 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                    *iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v64 | 0x8080808080808080);
                    iter += 1;
                    j = v63 - 1;
                } while (j);
                if (v16 < 8)
                    goto LABEL_c742d8;
                *(long long *)(v12 + v16) = *(long long *)v12;
LABEL_c74084:
                v68 = 0;
                do
                {
                    v69 = v68;
                    if (*(char *)(v12 + v69) == 128)
                    {
                        v70 = v12 + ~v69 * 32;
                        while (1)
                        {
                            v71 = 5871781006564002453 * (*(long long *)(v12 + -v69 * 32 - 32) + 8);
                            v72 = (long long)v14[8];
                            v73 = v72 & v71;
                            v74 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v12 + v73)));
                            l = __double_as_longlong(v74);
                            if (l)
                            {
                                v76 = v72 & v71;
                            }
                            else
                            {
                                v77 = 8;
                                v76 = v72 & v71;
                                do
                                {
                                    v76 = v76 + v77 & v72;
                                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v12 + v76)));
                                    v77 += 8;
                                } while (!l);
                            }
                            v79 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v80 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v81 = ((((v80 | v79) & 0xffff0000ffff0000) >> 16 | (v80 | v79) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v80 | v79) & 0xffff0000ffff0000) >> 16 | (v80 | v79) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v81)
                                v82 = 64;
                            else
                                v82 = Clz(v81);
                            v83 = v76 + (v82 >> 3) & v72;
                            if (*(char *)(v12 + v83) >= 0)
                            {
                                v85 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v12));
                                v86 = ((((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v87 = (((((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v85 & 0xaaaaaaaaaaaaaaaa) >> 1 | v85 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v88 = ((((v87 | v86) & 0xffff0000ffff0000) >> 16 | (v87 | v86) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v87 | v86) & 0xffff0000ffff0000) >> 16 | (v87 | v86) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v88)
                                    v89 = 64;
                                else
                                    v89 = Clz(v88);
                                v83 = v89 >> 3;
                                if (8 > ((v83 - v73 ^ v69 - v73) & v72))
                                {
LABEL_c74198:
                                    v93 = v71 >> 57;
                                    *(char *)(v12 + v69) = v93;
                                    v12 = *(long long *)v14;
                                    *(char *)(v12 + (v72 & v69 - 8) + 8) = v93;
                                    break;
                                }
                            }
                            else if (((v83 - v73 ^ v69 - v73) & v72) < 8)
                            {
                                goto LABEL_c74198;
                            }
                            v90 = v12 + ~v83 * 32;
                            v91 = *(char *)(v12 + v83);
                            v92 = v71 >> 57;
                            *(char *)(v12 + v83) = v92;
                            v12 = *(long long *)v14;
                            *(char *)(v12 + (v83 - 8 & v72) + 8) = v92;
                            if (v91 != 0xff)
                            {
                                sub_bfbb08(v70);
                                v12 = *(long long *)v14;
                            }
                            else
                            {
                                v94 = (long long)v14[8] & v69 - 8;
                                *(char *)(v12 + v69) = 0xff;
                                *(char *)(v12 + v94 + 8) = 0xff;
                                v95 = v70[1];
                                *v90 = *v70;
                                v90[1] = v95;
                                break;
                            }
                        }
                    }
                } while ((v68 = v69 + 1, v69 != v15));
                v67 = (long long)v14[8];
                if (v67 >= 8)
                    v67 = (v67 + 1 >> 3) * 7;
            }
            else
            {
                v67 = 0;
            }
            *(unsigned long long *)&v14[16] = v67 - (long long)v14[24];
        }
        return 9223372036854775809;
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c742d8:
    _memmove(v12 + 8, v12, v15 + 1);
    goto LABEL_c74084;
}
