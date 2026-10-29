/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6f450..0xc6fa44 (1524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6f450_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    unsigned long long field_c0;
} st_c6f450_1;

typedef struct st_c6f450_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c6f450_0;

extern long long g_efbad0;

unsigned long long sub_c6f450(st_c6f450_0 *a0)
{
    unsigned long v6;  // x20
    unsigned long long v7;  // x10
    unsigned long long v16;  // x10
    unsigned long v106;  // x14
    unsigned long v107;  // x14
    unsigned long v108;  // x14
    unsigned long v109;  // x14
    unsigned long v110;  // x14
    unsigned long v111;  // x14
    unsigned long v112;  // x14
    unsigned long v113;  // x14
    unsigned long v114;  // x14
    unsigned long v115;  // x14
    void* v17;  // x12
    unsigned long v116;  // x14
    unsigned long v117;  // x14
    unsigned long v118;  // x14
    unsigned long v119;  // x14
    char v120;  // x13
    unsigned long long v121;  // x15
    uint128_t v122;  // q1
    uint128_t v123;  // q3
    uint128_t v124;  // q2
    uint128_t v125;  // q1
    unsigned long v18;  // d0
    uint128_t v126;  // q3
    uint128_t v127;  // q2
    uint128_t v128;  // q1
    uint128_t v129;  // q0
    uint128_t v130;  // q2
    unsigned long long v19;  // x16
    void* v20;  // x14
    unsigned long i;  // x15
    void* v22;  // x14
    unsigned long v24;  // x16
    unsigned long long v25;  // 4128
    unsigned long long v8;  // 4132
    unsigned long long v26;  // 4130
    unsigned long long v27;  // x17
    unsigned long long v28;  // x17
    unsigned long long v29;  // x17
    unsigned long long v30;  // x1
    unsigned long long v31;  // x2
    unsigned long v32;  // d0
    unsigned long long k;  // x4
    unsigned long long v34;  // x3
    st_c6f450_0 *v9;  // x19
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
    st_c6f450_1 *v48;  // x17
    st_c6f450_1 *v49;  // x1
    uint128_t v50;  // q0
    uint128_t v51;  // q1
    uint128_t v52;  // q3
    uint128_t v53;  // q0
    uint128_t v54;  // q1
    uint128_t v55;  // q3
    unsigned long long v11;  // x9
    uint128_t v56;  // q0
    uint128_t v57;  // q1
    uint128_t v58;  // q2
    void* v59;  // x9
    unsigned long long v60;  // x10
    unsigned long long v61;  // x8
    unsigned long long v62;  // 4119
    void* v63;  // x14
    void* iter;  // x11
    unsigned long long v65;  // x10
    unsigned long long j;  // x11
    uint128_t v66;  // q1
    unsigned long long v69;  // x8
    unsigned long long v70;  // x9
    unsigned long long v71;  // x9
    void* v72;  // x13
    unsigned long long v73;  // x0
    unsigned long long v74;  // x17
    unsigned long long v75;  // x16
    unsigned long long v13;  // x12
    unsigned long v76;  // d0
    unsigned long long l;  // x3
    unsigned long long v78;  // x1
    unsigned long long v79;  // x2
    unsigned long long v81;  // 4128
    unsigned long long v82;  // 4130
    unsigned long long v83;  // x2
    unsigned long long v84;  // x2
    unsigned long long v85;  // x1
    unsigned long long v14;  // x8
    unsigned long v87;  // x1
    unsigned long long v88;  // 4137
    unsigned long long v89;  // 4139
    unsigned long long v90;  // x1
    unsigned long long v91;  // x1
    void* v92;  // x16
    unsigned int v93;  // w2
    char v94;  // x0
    unsigned long v95;  // x14
    unsigned long long v15;  // x0
    unsigned long v96;  // x14
    unsigned long v97;  // x14
    unsigned long v98;  // x14
    unsigned long v99;  // x14
    unsigned long v100;  // x14
    unsigned long v101;  // x14
    unsigned long v102;  // x14
    unsigned long v103;  // x14
    unsigned long v104;  // x14
    unsigned long v105;  // x14
    void* v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0->field_18;
    v7 = v6 + 1;
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
                    v30 = 5871781006564002453 * *(int *)((char *)v17 + -(200 * v29) - 200);
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
                    v48 = v17 + 200 * ~v29;
                    v49 = v14 + 200 * ~v40;
                    v49->field_0 = v48->field_0;
                    v50 = v48->field_10;
                    v51 = v48->field_20;
                    v52 = v48->field_40;
                    v49->field_30 = v48->field_30;
                    v49->field_40 = v52;
                    v49->field_10 = v50;
                    v49->field_20 = v51;
                    v53 = v48->field_50;
                    v54 = v48->field_60;
                    v55 = v48->field_80;
                    v49->field_70 = v48->field_70;
                    v49->field_80 = v55;
                    v49->field_50 = v53;
                    v49->field_60 = v54;
                    v56 = v48->field_90;
                    v57 = v48->field_a0;
                    v58 = v48->field_b0;
                    v49->field_c0 = v48->field_c0;
                    v49->field_a0 = v57;
                    v49->field_b0 = v58;
                    v49->field_90 = v56;
                    i -= 1;
                } while (i);
            }
            v59 = v9->field_0;
            v60 = v9->field_8;
            v9->field_0 = v14;
            v9->field_8 = v15;
            v9->field_10 = v3 - v6;
            v9->field_18 = v6;
            if (v60)
            {
                v61 = 207 + 200 * v60 & 0xfffffffffffffff8;
                v62 = arm64g_calculate_condition(2, v60 + v61, 9, 0);
                if (!(v62 & 1))
                    _free(v59 - v61);
            }
        }
        else
        {
            if (v11)
            {
                v63 = v9->field_0;
                if (v11 & 7)
                    j += 1;
                iter = v63;
                do
                {
                    v65 = j;
                    v66 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                    *(unsigned long long *)iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v66 | 0x8080808080808080);
                    iter += 8;
                    j = v65 - 1;
                } while (j);
                if (v11 < 8)
                    goto LABEL_c6fa20;
                *(long long *)((char *)v63 + v11) = *(long long *)v63;
LABEL_c6f650:
                v70 = 0;
                do
                {
                    v71 = v70;
                    if (*((char *)v63 + v71) == 128)
                    {
                        v72 = v63 + 200 * ~v71;
                        while (1)
                        {
                            v73 = 5871781006564002453 * *(int *)((char *)v63 + 200 * -v71 - 200);
                            v74 = v9->field_8;
                            v75 = v74 & v73;
                            v76 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v63 + v75)));
                            l = __double_as_longlong(v76);
                            if (l)
                            {
                                v78 = v74 & v73;
                            }
                            else
                            {
                                v79 = 8;
                                v78 = v74 & v73;
                                do
                                {
                                    v78 = v78 + v79 & v74;
                                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v63 + v78)));
                                    v79 += 8;
                                } while (!l);
                            }
                            v81 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v82 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v83 = ((((v82 | v81) & 0xffff0000ffff0000) >> 16 | (v82 | v81) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v82 | v81) & 0xffff0000ffff0000) >> 16 | (v82 | v81) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v83)
                                v84 = 64;
                            else
                                v84 = Clz(v83);
                            v85 = v78 + (v84 >> 3) & v74;
                            if (*((char *)v63 + v85) >= 0)
                            {
                                v87 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v63));
                                v88 = ((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v89 = (((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v90 = ((((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v90)
                                    v91 = 64;
                                else
                                    v91 = Clz(v90);
                                v85 = v91 >> 3;
                                if (8 > ((v85 - v75 ^ v71 - v75) & v74))
                                {
LABEL_c6f8e8:
                                    v120 = v73 >> 57;
                                    *((char *)v63 + v71) = v120;
                                    v63 = v9->field_0;
                                    *((char *)v63 + (v74 & v71 - 8) + 8) = v120;
                                    break;
                                }
                            }
                            else if (((v85 - v75 ^ v71 - v75) & v74) < 8)
                            {
                                goto LABEL_c6f8e8;
                            }
                            v92 = v63 + 200 * ~v85;
                            v93 = *((char *)v63 + v85);
                            v94 = v73 >> 57;
                            *((char *)v63 + v85) = v94;
                            v63 = v9->field_0;
                            *((char *)v63 + (v85 - 8 & v74) + 8) = v94;
                            if (v93 != 0xff)
                            {
                                v95 = *(long long *)v72;
                                *(long long *)v72 = *(long long *)v92;
                                *(unsigned long *)v92 = v95;
                                v96 = (long long)v72[8];
                                *(long long *)&v72[8] = (long long)v92[8];
                                *(unsigned long *)&v92[8] = v96;
                                v97 = (long long)v72[16];
                                *(long long *)&v72[16] = (long long)v92[16];
                                *(unsigned long *)&v92[16] = v97;
                                v98 = (long long)v72[24];
                                *(long long *)&v72[24] = (long long)v92[24];
                                *(unsigned long *)&v92[24] = v98;
                                v99 = (long long)v72[32];
                                *(long long *)&v72[32] = (long long)v92[32];
                                *(unsigned long *)&v92[32] = v99;
                                v100 = (long long)v72[40];
                                *(long long *)&v72[40] = (long long)v92[40];
                                *(unsigned long *)&v92[40] = v100;
                                v101 = (long long)v72[48];
                                *(long long *)&v72[48] = (long long)v92[48];
                                *(unsigned long *)&v92[48] = v101;
                                v102 = (long long)v72[56];
                                *(long long *)&v72[56] = (long long)v92[56];
                                *(unsigned long *)&v92[56] = v102;
                                v103 = (long long)v72[64];
                                *(long long *)&v72[64] = (long long)v92[64];
                                *(unsigned long *)&v92[64] = v103;
                                v104 = (long long)v72[72];
                                *(long long *)&v72[72] = (long long)v92[72];
                                *(unsigned long *)&v92[72] = v104;
                                v105 = (long long)v72[80];
                                *(long long *)&v72[80] = (long long)v92[80];
                                *(unsigned long *)&v92[80] = v105;
                                v106 = (long long)v72[88];
                                *(long long *)&v72[88] = (long long)v92[88];
                                *(unsigned long *)&v92[88] = v106;
                                v107 = (long long)v72[96];
                                *(long long *)&v72[96] = (long long)v92[96];
                                *(unsigned long *)&v92[96] = v107;
                                v108 = (long long)v72[104];
                                *(long long *)&v72[104] = (long long)v92[104];
                                *(unsigned long *)&v92[104] = v108;
                                v109 = (long long)v72[112];
                                *(long long *)&v72[112] = (long long)v92[112];
                                *(unsigned long *)&v92[112] = v109;
                                v110 = (long long)v72[120];
                                *(long long *)&v72[120] = (long long)v92[120];
                                *(unsigned long *)&v92[120] = v110;
                                v111 = (long long)v72[128];
                                *(long long *)&v72[128] = (long long)v92[128];
                                *(unsigned long *)&v92[128] = v111;
                                v112 = (long long)v72[0x88];
                                *(long long *)&v72[0x88] = (long long)v92[0x88];
                                *(unsigned long *)&v92[0x88] = v112;
                                v113 = (long long)v72[144];
                                *(long long *)&v72[144] = (long long)v92[144];
                                *(unsigned long *)&v92[144] = v113;
                                v114 = (long long)v72[152];
                                *(long long *)&v72[152] = (long long)v92[152];
                                *(unsigned long *)&v92[152] = v114;
                                v115 = (long long)v72[160];
                                *(long long *)&v72[160] = (long long)v92[160];
                                *(unsigned long *)&v92[160] = v115;
                                v116 = (long long)v72[168];
                                *(long long *)&v72[168] = (long long)v92[168];
                                *(unsigned long *)&v92[168] = v116;
                                v117 = (long long)v72[176];
                                *(long long *)&v72[176] = (long long)v92[176];
                                *(unsigned long *)&v92[176] = v117;
                                v118 = (long long)v72[184];
                                *(long long *)&v72[184] = (long long)v92[184];
                                *(unsigned long *)&v92[184] = v118;
                                v119 = (long long)v72[192];
                                *(long long *)&v72[192] = (long long)v92[192];
                                *(unsigned long *)&v92[192] = v119;
                                v63 = v9->field_0;
                            }
                            else
                            {
                                v121 = v9->field_8 & v71 - 8;
                                *((char *)v63 + v71) = 0xff;
                                *((char *)v63 + v121 + 8) = 0xff;
                                v122 = (int128_t)v72[64];
                                v123 = (int128_t)v72[16];
                                v124 = (int128_t)v72[32];
                                *(int128_t *)&v92[48] = (int128_t)v72[48];
                                *(uint128_t *)&v92[64] = v122;
                                *(uint128_t *)&v92[16] = v123;
                                *(uint128_t *)&v92[32] = v124;
                                v125 = (int128_t)v72[128];
                                v126 = (int128_t)v72[80];
                                v127 = (int128_t)v72[96];
                                *(int128_t *)&v92[112] = (int128_t)v72[112];
                                *(uint128_t *)&v92[128] = v125;
                                *(uint128_t *)&v92[80] = v126;
                                *(uint128_t *)&v92[96] = v127;
                                v128 = (int128_t)v72[160];
                                v129 = (int128_t)v72[176];
                                v130 = (int128_t)v72[144];
                                *(long long *)&v92[192] = (long long)v72[192];
                                *(uint128_t *)&v92[160] = v128;
                                *(uint128_t *)&v92[176] = v129;
                                *(uint128_t *)&v92[144] = v130;
                                *(int128_t *)v92 = *(int128_t *)v72;
                                break;
                            }
                        }
                    }
                } while ((v70 = v71 + 1, v71 != v10));
                v69 = v9->field_8;
                if (v69 >= 8)
                    v69 = (v69 + 1 >> 3) * 7;
            }
            else
            {
                v69 = 0;
            }
            v9->field_10 = v69 - v9->field_18;
        }
        return 9223372036854775809;
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c6fa20:
    v0 = v63;
    _memmove(v63 + 8, v63, v10 + 1);
    v63 = v0;
    goto LABEL_c6f650;
}
