/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc71798..0xc71c54 (1212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c71798_0 {
    unsigned long long *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c71798_0;

typedef struct st_c71798_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_c71798_1;

extern long long g_efbad0;

unsigned long long sub_c71798(st_c71798_0 *a0, unsigned long a1)
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
    st_c71798_0 *v9;  // x19
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
    st_c71798_1 *v48;  // x17
    st_c71798_1 *v49;  // x1
    uint128_t v50;  // q0
    uint128_t v51;  // q1
    uint128_t v52;  // q2
    unsigned long long *v53;  // x9
    unsigned long long v54;  // x10
    unsigned long long v55;  // x8
    unsigned long long v11;  // x10
    unsigned long long v56;  // 4119
    unsigned long long *iter;  // x12
    unsigned long long v58;  // x11
    uint128_t v59;  // q1
    unsigned long long v62;  // x8
    unsigned long long v63;  // x10
    unsigned long long v64;  // x10
    void* v65;  // x14
    unsigned long long j;  // x11
    unsigned long long v66;  // x17
    unsigned long long v67;  // x16
    unsigned long long v68;  // x0
    unsigned long v69;  // d0
    unsigned long long l;  // x3
    unsigned long long v71;  // x1
    unsigned long long v72;  // x2
    unsigned long long v74;  // 4128
    unsigned long long v75;  // 4130
    unsigned long long v13;  // x12
    unsigned long long v76;  // x2
    unsigned long long v77;  // x2
    unsigned long long v78;  // x1
    unsigned long v80;  // x1
    unsigned long long v81;  // 4137
    unsigned long long v82;  // 4139
    unsigned long long v83;  // x1
    unsigned long long v84;  // x1
    void* v85;  // x0
    unsigned long long v14;  // x8
    unsigned int v86;  // w2
    char v87;  // x17
    unsigned long v88;  // x9
    unsigned long v89;  // x9
    unsigned long v90;  // x9
    unsigned long v91;  // x9
    unsigned long v92;  // x9
    unsigned long v93;  // x9
    unsigned long v94;  // x9
    unsigned long v95;  // x9
    unsigned long long v15;  // x0
    unsigned long v96;  // x9
    char v97;  // x14
    unsigned long long v98;  // x15
    uint128_t v99;  // q1
    uint128_t v100;  // q0
    uint128_t v101;  // q2
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
                    v30 = 5871781006564002453 * (*(long long *)((char *)v17 + -(72 * v29) - 72) + 8);
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
                    v48 = &v17[9 * ~v29];
                    v49 = v14 + 72 * ~v40;
                    v49->field_0 = v48->field_0;
                    v50 = v48->field_10;
                    v51 = v48->field_20;
                    v52 = v48->field_30;
                    v49->field_40 = v48->field_40;
                    v49->field_20 = v51;
                    v49->field_30 = v52;
                    v49->field_10 = v50;
                    i -= 1;
                } while (i);
            }
            v53 = v9->field_0;
            v54 = v9->field_8;
            v9->field_0 = v14;
            v9->field_8 = v15;
            v9->field_10 = v3 - v6;
            v9->field_18 = v6;
            if (v54)
            {
                v55 = 79 + 72 * v54 & 0xfffffffffffffff8;
                v56 = arm64g_calculate_condition(2, v54 + v55, 9, 0);
                if (!(v56 & 1))
                    _free((char *)v53 - v55);
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
                    v58 = j;
                    v59 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                    *iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v59 | 0x8080808080808080);
                    iter += 1;
                    j = v58 - 1;
                } while (j);
                if (v11 < 8)
                    goto LABEL_c71c30;
                *(long long *)(v7 + v11) = *(long long *)v7;
LABEL_c7197c:
                v63 = 0;
                do
                {
                    v64 = v63;
                    if (*(char *)(v7 + v64) == 128)
                    {
                        v65 = v7 + 72 * ~v64;
                        while (1)
                        {
                            v66 = 5871781006564002453 * (*(long long *)(v7 + 72 * -v64 - 72) + 8);
                            v67 = v9->field_8;
                            v68 = v67 & v66;
                            v69 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)(v7 + v68)));
                            l = __double_as_longlong(v69);
                            if (l)
                            {
                                v71 = v67 & v66;
                            }
                            else
                            {
                                v72 = 8;
                                v71 = v67 & v66;
                                do
                                {
                                    v71 = v71 + v72 & v67;
                                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)(v7 + v71)));
                                    v72 += 8;
                                } while (!l);
                            }
                            v74 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v75 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v76 = ((((v75 | v74) & 0xffff0000ffff0000) >> 16 | (v75 | v74) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v75 | v74) & 0xffff0000ffff0000) >> 16 | (v75 | v74) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v76)
                                v77 = 64;
                            else
                                v77 = Clz(v76);
                            v78 = v71 + (v77 >> 3) & v67;
                            if (*(char *)(v7 + v78) >= 0)
                            {
                                v80 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7));
                                v81 = ((((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v82 = (((((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v83 = ((((v82 | v81) & 0xffff0000ffff0000) >> 16 | (v82 | v81) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v82 | v81) & 0xffff0000ffff0000) >> 16 | (v82 | v81) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v83)
                                    v84 = 64;
                                else
                                    v84 = Clz(v83);
                                v78 = v84 >> 3;
                                if (8 > ((v78 - v68 ^ v64 - v68) & v67))
                                {
LABEL_c71b18:
                                    v97 = v66 >> 57;
                                    *(char *)(v7 + v64) = v97;
                                    v7 = v9->field_0;
                                    *(char *)(v7 + (v67 & v64 - 8) + 8) = v97;
                                    break;
                                }
                            }
                            else if (((v78 - v68 ^ v64 - v68) & v67) < 8)
                            {
                                goto LABEL_c71b18;
                            }
                            v85 = v7 + 72 * ~v78;
                            v86 = *(char *)(v7 + v78);
                            v87 = v66 >> 57;
                            *(char *)(v7 + v78) = v87;
                            v7 = v9->field_0;
                            *(char *)(v7 + (v78 - 8 & v67) + 8) = v87;
                            if (v86 != 0xff)
                            {
                                v88 = *(long long *)v65;
                                *(long long *)v65 = *(long long *)v85;
                                *(unsigned long *)v85 = v88;
                                v89 = (long long)v65[8];
                                *(long long *)&v65[8] = (long long)v85[8];
                                *(unsigned long *)&v85[8] = v89;
                                v90 = (long long)v65[16];
                                *(long long *)&v65[16] = (long long)v85[16];
                                *(unsigned long *)&v85[16] = v90;
                                v91 = (long long)v65[24];
                                *(long long *)&v65[24] = (long long)v85[24];
                                *(unsigned long *)&v85[24] = v91;
                                v92 = (long long)v65[32];
                                *(long long *)&v65[32] = (long long)v85[32];
                                *(unsigned long *)&v85[32] = v92;
                                v93 = (long long)v65[40];
                                *(long long *)&v65[40] = (long long)v85[40];
                                *(unsigned long *)&v85[40] = v93;
                                v94 = (long long)v65[48];
                                *(long long *)&v65[48] = (long long)v85[48];
                                *(unsigned long *)&v85[48] = v94;
                                v95 = (long long)v65[56];
                                *(long long *)&v65[56] = (long long)v85[56];
                                *(unsigned long *)&v85[56] = v95;
                                v96 = (long long)v65[64];
                                *(long long *)&v65[64] = (long long)v85[64];
                                *(unsigned long *)&v85[64] = v96;
                                v7 = v9->field_0;
                            }
                            else
                            {
                                v98 = v9->field_8 & v64 - 8;
                                *(char *)(v7 + v64) = 0xff;
                                *(char *)(v7 + v98 + 8) = 0xff;
                                v99 = (int128_t)v65[32];
                                v100 = (int128_t)v65[48];
                                v101 = (int128_t)v65[16];
                                *(long long *)&v85[64] = (long long)v65[64];
                                *(uint128_t *)&v85[32] = v99;
                                *(uint128_t *)&v85[48] = v100;
                                *(uint128_t *)&v85[16] = v101;
                                *(int128_t *)v85 = *(int128_t *)v65;
                                break;
                            }
                        }
                    }
                } while ((v63 = v64 + 1, v64 != v10));
                v62 = v9->field_8;
                if (v62 >= 8)
                    v62 = (v62 + 1 >> 3) * 7;
            }
            else
            {
                v62 = 0;
            }
            v9->field_10 = v62 - v9->field_18;
        }
        return 9223372036854775809;
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c71c30:
    v0 = v7;
    _memmove(v7 + 8, v7, v10 + 1);
    v7 = v0;
    goto LABEL_c7197c;
}
