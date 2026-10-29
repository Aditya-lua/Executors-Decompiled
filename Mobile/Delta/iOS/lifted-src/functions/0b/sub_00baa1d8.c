/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbaa1d8..0xbab5f4 (5148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_baa1d8_1 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    struct st_baa1d8_2 *field_18;
    unsigned long long field_20;
    char padding_28[16];
    long long field_38;
    long long field_40;
    char padding_48[144];
    struct st_baa1d8_3 *field_d8;
} st_baa1d8_1;

typedef struct st_baa1d8_8 {
    uint128_t field_0;
    unsigned long long field_10;
} st_baa1d8_8;

typedef struct st_baa1d8_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_baa1d8_1 *field_10;
} st_baa1d8_4;

typedef struct st_baa1d8_9 {
    char padding_0[8];
    uint128_t field_8;
} st_baa1d8_9;

typedef struct st_baa1d8_5 {
    unsigned long long field_0;
    struct st_baa1d8_0 *field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_baa1d8_5;

typedef struct st_baa1d8_0 {
    unsigned long long field_0;
    char field_1;
    char padding_2[1];
    char field_3;
    char padding_4[4];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_baa1d8_0;

typedef struct st_baa1d8_3 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
} st_baa1d8_3;

typedef struct st_baa1d8_12 {
    char padding_0[8];
    struct st_baa1d8_5 *field_8;
    unsigned long long field_10;
    char padding_18[8];
    struct st_baa1d8_2 *field_20;
    unsigned long long field_28;
} st_baa1d8_12;

typedef struct st_baa1d8_10 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    unsigned long long field_38;
} st_baa1d8_10;

typedef struct st_baa1d8_7 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    unsigned long long field_28;
    unsigned int field_30;
    char padding_34[12];
    unsigned long long field_40;
    unsigned int field_48;
} st_baa1d8_7;

typedef struct st_baa1d8_6 {
    char padding_0[24];
    unsigned long long field_18;
    char field_20;
    char padding_21[7];
    struct st_baa1d8_5 *field_28;
    unsigned long long field_30;
    char padding_38[8];
    struct st_baa1d8_2 *field_40;
    unsigned long long field_48;
} st_baa1d8_6;

typedef struct st_baa1d8_2 {
    unsigned long long field_0;
} st_baa1d8_2;

extern long long g_ef88f0;
extern long long g_ef8908;
extern long long g_ef8920;
extern long long g_ef8950;
extern long long g_ef8980;
extern long long g_ef89b0;
extern long long g_ef89c8;
extern long long g_ef89e0;
extern long long g_ef8b00;

st_baa1d8_1 * sub_baa1d8(st_baa1d8_1 *a0, unsigned int a1)
{
    unsigned long long *v44;  // x8
    unsigned long v45;  // x9
    st_baa1d8_6 *v54;  // x20
    unsigned int v152;  // x27
    unsigned int v153;  // x8
    unsigned int iter;  // x22
    unsigned int v154;  // x8
    unsigned int v155;  // x19
    unsigned long long v161;  // 4102
    unsigned long long v162;  // 4102
    st_baa1d8_4 *v163;  // x8
    st_baa1d8_5 *v56;  // x9
    st_baa1d8_7 *v164;  // x22
    unsigned int ptr;  // x21
    unsigned int iter1;  // x26
    unsigned int v167;  // x24
    unsigned int iter2;  // x25
    st_baa1d8_9 *ptr1;  // x0
    unsigned int v170;  // x27
    unsigned int v171;  // x23
    unsigned int v172;  // x8
    unsigned long long v173;  // 4127
    unsigned int v57;  // x8
    unsigned long v174;  // x0
    unsigned long long v175;  // 4102
    st_baa1d8_10 *ptr2;  // x0
    unsigned long long v177;  // x19
    unsigned long long *v178;  // x8
    long long v179;  // x21
    unsigned int *v180;  // x8
    long long v181;  // x0
    st_baa1d8_1 *dst;  // x0
    unsigned long v183;  // x19
    unsigned int node;  // x23
    unsigned int v184;  // x25
    unsigned int v185;  // x25
    st_baa1d8_5 *v59;  // x25
    unsigned int v60;  // x25
    st_baa1d8_0 *v61;  // x21
    unsigned int v62;  // x20
    unsigned int v63;  // x0
    unsigned long v46;  // x26
    unsigned int v64;  // x25
    unsigned int *v65;  // x8
    unsigned int v66;  // x22
    unsigned long v67;  // x8
    unsigned long long v68;  // 4102
    unsigned int v69;  // x0
    unsigned int v70;  // x24
    unsigned long v71;  // x8
    unsigned long long v72;  // 4102
    unsigned int v73;  // x23
    unsigned long long *v47;  // x10
    unsigned int v74;  // x8
    unsigned int v75;  // x24
    unsigned int v76;  // x0
    st_baa1d8_8 *v77;  // x9
    unsigned long long v78;  // x25
    unsigned long long v79;  // x0
    unsigned int v80;  // x8
    unsigned long long v81;  // x0
    unsigned long long v82;  // x13
    unsigned long v83;  // x14
    unsigned int v48;  // x10
    unsigned long long v84;  // x15
    unsigned long long v85;  // x15
    unsigned long long v86;  // x15
    unsigned long long v87;  // 4128
    unsigned long long v88;  // 4130
    unsigned int v89;  // x16
    unsigned long long v90;  // x16
    long long v91;  // x0
    unsigned long long v92;  // x16
    unsigned int v93;  // x8
    st_baa1d8_1 *v49;  // x28
    unsigned long long v94;  // 4118
    unsigned int v95;  // x27
    unsigned int v96;  // x8
    unsigned long long v97;  // 4118
    unsigned long long *v98;  // x10
    unsigned long v99;  // x8
    unsigned long v100;  // cc_op
    unsigned long v101;  // cc_dep1
    unsigned long v102;  // cc_dep2
    unsigned long v103;  // cc_ndep
    unsigned int v50;  // x19
    unsigned long v104;  // x11
    unsigned long v105;  // d0
    unsigned long v106;  // x8
    unsigned long v107;  // x26
    unsigned int k;  // x8
    unsigned long v109;  // x26
    unsigned long long v111;  // 4131
    unsigned long long v112;  // 4133
    unsigned int v113;  // x10
    st_baa1d8_1 *dst1;  // x0
    unsigned long long v114;  // x10
    unsigned int i;  // x27
    unsigned int v116;  // x0
    unsigned int v117;  // x8
    unsigned long long v118;  // 4109
    unsigned int v119;  // x19
    unsigned long long v120;  // x28
    unsigned int v121;  // x0
    unsigned long long *v122;  // x8
    unsigned long v123;  // x26
    unsigned int v52;  // x24
    unsigned long long v125;  // 4131
    unsigned long long v126;  // 4133
    unsigned int v127;  // x10
    unsigned long long v128;  // x10
    unsigned long v129;  // cc_dep1
    unsigned long long v130;  // 4109
    unsigned int v131;  // x26
    unsigned long long *v53;  // x8
    long long v0;  // [bp-0x278]
    unsigned int v1;  // [bp-0x270]
    unsigned int v2;  // [bp-0x268], Other Possible Types: unsigned long long
    unsigned long v3;  // [bp-0x260]
    unsigned long long *v4;  // [bp-0x258]
    unsigned int v5;  // [bp-0x250]
    unsigned int v6;  // [bp-0x248]
    unsigned long v7;  // [bp-0x240]
    unsigned int v8;  // [bp-0x238]
    unsigned long v9;  // [bp-0x230]
    unsigned int v10;  // [bp-0x228]
    unsigned int v11;  // [bp-0x220]
    unsigned int v12;  // [bp-0x210]
    unsigned int v13;  // [bp-0x208]
    unsigned int idx2;  // [bp-0x200]
    uint128_t v15;  // [bp-0x1f8], Other Possible Types: uint128_t
    unsigned int v16;  // [bp-0x1f0]
    uint128_t v17;  // [bp-0x1e8]
    st_baa1d8_12 *v18;  // [bp-0x1d8]
    unsigned int v19;  // [bp-0x1d0]
    char v20;  // [bp-0x1d0]
    uint128_t v21;  // [bp-0x1d0], Other Possible Types: unsigned int
    uint128_t v22;  // [bp-0x1d0]
    unsigned int v23;  // [bp-0x1d0]
    unsigned long long v24;  // [bp-0x1d0]
    unsigned long long *v25;  // [bp-0x1c8], Other Possible Types: uint128_t, unsigned int
    st_baa1d8_0 *v26;  // [bp-0x1c0], Other Possible Types: uint128_t, unsigned long, unsigned int
    uint128_t v27;  // [bp-0x1b8], Other Possible Types: unsigned long long, unsigned int
    st_baa1d8_12 *v28;  // [bp-0x1b0]
    uint128_t v29;  // [bp-0x1a8]
    unsigned long v30;  // [bp-0x198]
    unsigned int v31;  // [bp-0xc8]
    unsigned int v32;  // [bp-0xc0]
    unsigned int v33;  // [bp-0xb8]
    st_baa1d8_0 *v34;  // [bp-0xb0], Other Possible Types: uint128_t, uint128_t
    st_baa1d8_0 *v35;  // [bp-0xa8], Other Possible Types: unsigned int
    uint128_t v36;  // [bp-0xa0], Other Possible Types: unsigned int, unsigned long
    unsigned int v37;  // [bp-0x98]
    uint128_t v38;  // [bp-0x90]
    unsigned long v39;  // [bp-0x80]
    long long v40;  // [bp-0x78]
    unsigned int v41;  // [bp-0x70]
    char *v42;  // [bp-0x10]
    char v43;  // [bp+0x0]

    v42 = &v43;
    v44 = a0->field_d8;
    v45 = v44[5];
    v46 = a1;
    if (v45 <= v46 || (v47 = v44[4] + v46 * 32, *v47 == 0x8000000000000000))
    {
        dst1 = sub_c73c64(&g_ef88f0);
LABEL_bab1b8:
        sub_c73c94(dst1);
        goto LABEL_bab224;
    }
    v48 = v47[2];
    if (v48)
    {
        v49 = a0;
        v50 = 0;
        v0 = &g_ef89b0;
        v1 = 384307168202282325;
        v6 = v48;
        v7 = v46;
        dst1 = a0;
    }
    else
    {
LABEL_baafdc:
        if (v45 <= v46 || (v62 = v44[4] + v46 * 32, *(long long *)v62 == 0x8000000000000000))
        {
LABEL_bab1d4:
            sub_c73c64(&g_ef8908);
LABEL_bab1e0:
            sub_c6b970(8, 64);
LABEL_bab224:
            __debugbreak();
        }
        iter = *(long long *)(v62 + 16);
        if (!iter)
            return a0;
        v61 = 0;
        node = *(long long *)(v62 + 8);
        v50 = node;
        while (1)
        {
            v52 = (unsigned int)(struct st_baa1d8_0 *)((char *)&v61->field_0 + 1);
            if (*(long long *)(v50 + 24) == 12)
                break;
            v50 += 264;
            v61 = (st_baa1d8_0 *)v52;
            if (iter == v52)
                return a0;
        }
LABEL_bab06c:
        dst = sub_b9a8fc(v50);
        if (iter > v52)
        {
            v183 = v50 + 264;
            v184 = (unsigned int)(struct st_baa1d8_0 *)((char *)&v61->field_0 + 2);
            do
            {
                v185 = v184;
                if (*(long long *)(v183 + 24) != 12)
                {
                    dst = _memcpy(node + 264 * v61, v183, 264);
                    v61 = (char *)&v61->field_0 + 1;
                }
                else
                {
                    dst = sub_b9a8fc(v183);
                }
            } while ((v183 += 264, v184 = v185 + 1, iter > v185));
        }
        *(st_baa1d8_0 **)(v62 + 16) = v61;
        return dst;
    }
    while (1)
    {
        v52 = 0x8000000000000000;
        if (v49->field_d8->field_28 <= v46 || (v53 = v49->field_d8->field_20 + v46 * 32, *v53 == 0x8000000000000000))
        {
            v91 = sub_c73c64(&g_ef8920);
            sub_c73c94(v91);
            goto LABEL_bab224;
        }
        if (v53[2] > v50)
        {
            v54 = v53[1] + 264 * v50;
            if (v54->field_18 == 15)
            {
                v8 = v50;
                iter = 0;
                v12 = 0;
                v13 = 8;
                idx2 = 0;
                v56 = v54->field_28;
                v57 = v54->field_30 * 24;
                node = (unsigned int)(struct st_baa1d8_5 *)((char *)v54->field_28 + v57);
                if (v57)
                {
                    do
                    {
                        v59 = v56;
                        v60 = (unsigned int)(struct st_baa1d8_5 *)&v59->field_18;
                        if (v59->field_0 == 0x8000000000000000)
                        {
                            v61 = v56->field_8;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v62 = (unsigned int)v54;
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bab068;
                            v63 = _malloc(64);
                            if (v63)
                            {
                                *(unsigned long long *)v63 = iter;
                                *(st_baa1d8_0 **)(v63 + 8) = v61;
                                v61 = 1;
                                v19 = 4;
                                v25 = v63;
                                while (1)
                                {
                                    v52 = 0x8000000000000000;
                                    v26 = v61;
                                    do
                                    {
                                        v64 = v60;
                                        if (v64 == node)
                                        {
                                            v66 = v25;
                                            *(unsigned int *)&v15 = v66;
                                            v16 = v66;
                                            v62 = v66 + v61 * 16;
                                            v17 = CONCAT(v62, v19);
                                            v18 = &v54->field_20;
                                            if (!v61)
                                                goto LABEL_baa3ec;
                                            goto LABEL_baa66c;
                                        }
                                    } while ((v60 = v64 + 24, iter += 1, *(long long *)v64 != 0x8000000000000000));
                                    v52 = *(long long *)(v60 - 16);
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    v62 = (unsigned int)v54;
                                    if ((long long)/* unsupported instruction */ < 0)
                                        goto LABEL_bab068;
                                    if (v61 == v19)
                                    {
                                        sub_c736c8(&v19, v61, 1, 8, 16);
                                        v63 = v25;
                                    }
                                    v65 = v63 + v61 * 16;
                                    *(unsigned long long *)v65 = iter;
                                    *(unsigned long long *)&v65[2] = v52;
                                    v61 = (char *)&v61->field_0 + 1;
                                }
                            }
                            goto LABEL_bab1e0;
                        }
                    } while ((iter += 1, v57 -= 24, v56 = (st_baa1d8_5 *)v60, v57));
                }
                v61 = 0;
                v66 = 8;
                *(unsigned long long *)&v15 = 8;
                v16 = 8;
                v62 = 8;
                v17 = CONCAT(8, v57);
                v18 = &v54->field_20;
                v19 = v20;
                if (0)
                {
                    while (1)
                    {
LABEL_baa66c:
                        v67 = *(long long *)v66;
                        iter = v66 + 16;
                        *(unsigned int *)((char *)&v15 + 8) = iter;
                        if (v18->field_28 <= v67 || *(long long *)&v18->field_20[8 * v67])
                        {
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v68 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v68 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b86a90();
                            }
                            v66 = iter;
                            if (v66 == v62)
                                break;
                        }
                        else
                        {
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bab068;
                            v21 = _INSERT(CONCAT(v19, 0), 8, v67);
                            v26 = *(long long *)&v18->field_20[1 + 8 * v67];
                            *(long long *)&v21 = *(long long *)(v66 + 8);
                            v69 = _malloc(96);
                            if (v69)
                            {
                                v61 = (st_baa1d8_0 *)v69;
                                *(uint128_t *)v69 = v21;
                                *(unsigned long *)(v69 + 16) = v26;
                                v31 = 4;
                                v32 = v69;
                                v33 = 1;
                                v28 = v18;
                                v62 = 1;
                                iter = 4;
                                v22 = v15;
                                v26 = v17;
                                while (1)
                                {
                                    node = *(unsigned long long *)((void*)&v26 + 8);
                                    v70 = *(unsigned long long *)((void*)&v22 + 8);
                                    while (1)
                                    {
                                        if (v70 == node)
                                        {
                                            sub_be75e0(&v22);
                                            goto LABEL_baa400;
                                        }
                                        v71 = *(long long *)v70;
                                        v52 = v70 + 16;
                                        *(unsigned int *)((char *)&v22 + 8) = v52;
                                        if (v28->field_28 > v71 && !*(long long *)&v28->field_20[8 * v71])
                                            break;
                                        do
                                        {
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                            /* unsupported instruction */;
                                        } while (/* unsupported instruction */ ^ 1);
                                        v72 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                        v70 = v52;
                                        if (!(v72 & 1))
                                        {
                                            /* unsupported instruction */;
                                            sub_b86a90();
                                            v70 = v52;
                                        }
                                    }
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    if ((long long)/* unsupported instruction */ < 0)
                                        goto LABEL_bab068;
                                    *(unsigned long *)((char *)&v34 + 8) = v71;
                                    v36 = *(long long *)&v28->field_20[1 + 8 * v71];
                                    *(long long *)&v34 = *(long long *)(v70 + 8);
                                    v73 = v62 + 1;
                                    if (v62 == iter)
                                    {
                                        v74 = v62 * 2;
                                        if (v73 > v74)
                                            v74 = v62 + 1;
                                        if (4 < v74)
                                            iter = v74;
                                        else
                                            iter = 4;
                                        if (v1 >= v74)
                                        {
                                            v75 = iter * 24;
                                            v76 = _realloc(v61, v75);
                                            if (v76)
                                            {
                                                v61 = (st_baa1d8_0 *)v76;
                                                v31 = iter;
                                                v32 = v76;
                                                goto LABEL_baafa4;
                                            }
                                            else
                                            {
                                                v41 = 8;
                                                v180 = &v40;
                                            }
                                        }
                                        else
                                        {
                                            v75 = 0;
                                            v180 = &v41;
                                        }
                                        *(unsigned long long *)v180 = v75;
                                        sub_c6b970(v41, v40);
                                        goto LABEL_bab224;
                                    }
                                    else
                                    {
LABEL_baafa4:
                                        v77 = &(&v61->field_0)[3 * v62];
                                        v77->field_10 = v36;
                                        v77->field_0 = v34;
                                        v33 = v73;
                                        v62 = v33;
                                    }
                                }
                            }
                            else
                            {
                                sub_c6b970(8, 96);
                                goto LABEL_bab224;
                            }
                        }
                    }
                }
LABEL_baa3ec:
                sub_be75e0(&v15);
                iter = 0;
                v62 = 0;
                v61 = 8;
LABEL_baa400:
                v34 = v61;
                v35 = v61;
                v36 = iter;
                v37 = (unsigned int)(struct st_baa1d8_0 *)&(&v61->field_0)[3 * v62];
                v11 = v37;
                if (v62)
                {
                    while (1)
                    {
                        iter = (unsigned int)(struct st_baa1d8_0 *)&v61->field_10;
                        v35 = iter;
                        v52 = v61->field_0;
                        if (!v52)
                            goto LABEL_baa418;
                        v50 = *(long long *)&v61->field_1;
                        v78 = *(long long *)&v61->field_8;
                        if (*(long long *)&v49->padding_28[8])
                        {
                            v79 = sub_bda14c(v49->field_38, v49->field_40, v52);
                            v80 = 0;
                            v81 = v79;
                            while (1)
                            {
                                v82 = v81 & v49->field_20;
                                v83 = *(long long *)((char *)v49->field_18 + v82);
                                v84 = (v83 ^ 0x101010101010101 * (v79 >> 57)) + 0xfefefefefefefeff & ~(v83 ^ 0x101010101010101 * (v79 >> 57));
                                v85 = v84 & 0x8080808080808080;
                                if (v84 & 0x8080808080808080)
                                {
                                    while (1)
                                    {
                                        v86 = v85;
                                        v87 = ((((((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v88 = (((((((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v86 & 0xaaaaaaaaaaaaaaaa) >> 1 | v86 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v89 = ((((v88 | v87) & 0xffff0000ffff0000) >> 16 | (v88 | v87) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v88 | v87) & 0xffff0000ffff0000) >> 16 | (v88 | v87) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (!v89)
                                            v90 = 64;
                                        else
                                            v90 = Clz(v89);
                                        v91 = *(long long *)((char *)&v49->field_18[-1 * (v82 + (v90 >> 3) & v49->field_20)].field_0 - 8);
                                        if ((unsigned long long)v49->field_10 <= (unsigned long long)v91)
                                            break;
                                        if (v52 == *(long long *)(v49->field_8 + 24 * v91))
                                            goto LABEL_baaaa0;
                                        v92 = v86 - 1;
                                        v85 = v92 & v86;
                                        if (!(v92 & v86))
                                            goto LABEL_baa768;
                                    }
                                }
                                else
                                {
LABEL_baa768:
                                    if (v83 & v83 * 2 & 0x8080808080808080)
                                        break;
                                    v80 += 8;
                                    v81 = v82 + v80;
                                }
                            }
                        }
                        v9 = v50;
                        if (sub_bda060(v49, v78) != 1)
                        {
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bab068;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bab068;
                            if (sub_babca4(v49, v78, v52) & 1)
                                goto LABEL_0xbaa7d4;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bab068;
                            node = *(long long *)sub_ba9cf8(v49, v78);
                            v93 = *(long long *)node;
                            *(long long *)node = v93 + 1;
                            v50 = 0x7fffffffffffffff;
                            v94 = arm64g_calculate_condition(0x22, v93, 1, 0);
                            if (v94 & 1)
                                goto LABEL_bab224;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bab068;
                            v95 = *(long long *)sub_ba9cf8(v49, v52);
                            v96 = *(long long *)v95;
                            *(long long *)v95 = v96 + 1;
                            v97 = arm64g_calculate_condition(0x22, v96, 1, 0);
                            if (v97 & 1)
                                goto LABEL_bab224;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bab068;
                            v98 = *(long long *)sub_ba9a14(v49, v78);
                            v99 = v98[2];
                            v100 = 4;
                            v101 = v99;
                            v102 = 0x7fffffffffffffff;
                            v103 = 0;
                            if (0x7fffffffffffffff > v99)
                            {
                                v98[2] = v99 + 1;
                                v104 = v98[6];
                                v10 = v95;
                                if (v104)
                                {
                                    v62 = v98[3];
                                    v105 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v62));
                                    v106 = __double_as_longlong(v105);
                                    v107 = v62 + 8;
                                    k = v106 & 0x8080808080808080;
                                    v4 = v98;
                                    v5 = node;
                                    v109 = v107;
                                    if (!(v106 & 0x8080808080808080))
                                    {
                                        do
                                        {
                                            v109 = v107 + 8;
                                            v62 -= 64;
                                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v107)) & 0x8080808080808080;
                                            v107 = v109;
                                        } while (!k);
                                    }
                                    v111 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v112 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v113 = ((((v112 | v111) & 0xffff0000ffff0000) >> 16 | (v112 | v111) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v112 | v111) & 0xffff0000ffff0000) >> 16 | (v112 | v111) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v113)
                                        v114 = 64;
                                    else
                                        v114 = Clz(v113);
                                    i = k - 1 & k;
                                    v3 = v104;
                                    node = v104 - 1;
                                    v61 = *(long long *)(v62 - (v114 & 120) - 8);
                                    do
                                    {
                                        /* unsupported instruction */;
                                        /* unsupported instruction */;
                                    } while (/* unsupported instruction */ ^ 1);
                                    if ((long long)/* unsupported instruction */ < 0)
                                        goto LABEL_bab068;
                                    v116 = 0;
                                    v117 = node + 1;
                                    v118 = arm64g_calculate_condition(50, node, 1, 0);
                                    if (!(v118 & 1))
                                        v117 = 0xffffffffffffffff;
                                    if (4 < v117)
                                        v119 = v117;
                                    else
                                        v119 = 4;
                                    if (v117 <= 0x1fffffffffffffff && !(v120 = v119 * 8, 0x7ffffffffffffff8 < v120))
                                    {
                                        v121 = _malloc(v120);
                                        if (v121)
                                        {
                                            *(st_baa1d8_0 **)v121 = v61;
                                            v122 = (unsigned long long *)v121;
                                            v61 = 1;
                                            v21 = v119;
                                            v25 = (unsigned long long *)v121;
                                            v2 = v121;
                                            v50 = 0x7fffffffffffffff;
                                            break;
                                        }
                                        else
                                        {
                                            v116 = 8;
                                            v2 = v120;
                                        }
                                    }
                                    sub_c6b970(v116, v2);
                                    goto LABEL_bab224;
                                }
                                else
                                {
                                    v62 = 8;
                                    v98[2] = v99;
                                    v131 = 8;
                                    v23 = 8;
                                    v25 = 8;
                                    v26 = 0;
                                    v27 = 8;
                                    if (0)
                                        goto LABEL_0xbaaaec;
                                    else
                                        goto LABEL_baaa54;
                                }
                            }
                            else
                            {
                                sub_c73d04(&g_ef8b00);
                                goto LABEL_bab224;
                            }
                        }
                        else
                        {
                            do
                            {
LABEL_baaaa0:
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v161 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v161 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b86a90(v78);
                            }
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v162 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v162 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b86a90(v52);
                            }
                            v61 = (st_baa1d8_0 *)iter;
                            if (iter == v11)
                                goto LABEL_baa418;
                        }
                    }
                }
LABEL_baa418:
                sub_be7514(&v34);
                if (v49->field_d8->field_28 <= v46 || (v163 = v49->field_d8->field_20 + v46 * 32, dst1 = (st_baa1d8_1 *)v8, v163->field_0 == 0x8000000000000000))
                    goto LABEL_bab1a0;
                if (v163->field_10 <= dst1)
                    goto LABEL_bab1b8;
                v164 = v163->field_8 + 264 * dst1;
                if (v164->field_18 == 15)
                {
                    ptr = v13;
                    if (idx2)
                    {
                        iter1 = ptr + idx2 * 8;
                        do
                        {
                            v167 = *(long long *)(iter1 - 8);
                            iter1 -= 8;
                            iter2 = *(long long *)&v164->field_30;
                            if (iter2 <= v167)
                            {
LABEL_bab160:
                                sub_c6bb3c(v167, iter2, v0);
                                goto LABEL_bab224;
                            }
                            ptr1 = v164->field_28 + 24 * v167;
                            v170 = (unsigned int)ptr1->padding_0;
                            v34 = *(int128_t *)(ptr1->padding_0)[1];
                            v171 = ~v167;
                            _memmove(ptr1, (char *)&ptr1->field_8 + 8, (iter2 + v171) * 24);
                            iter2 -= 1;
                            *(unsigned long long *)&v164->field_30 = iter2;
                            if (v170 == 9223372036854775811)
                                goto LABEL_bab160;
                            v21 = v170;
                            v25 = v34;
                            v172 = v170 ^ 0x8000000000000000;
                            v173 = arm64g_calculate_condition(0x44, v170, 0, 0);
                            if (!(v173 & 1))
                                v172 = 1;
                            if (v172)
                            {
                                if (v172 == 1)
                                {
                                    if (!v170)
                                        goto LABEL_baa558;
                                    v174 = *(unsigned long long *)&v25;
                                }
                                else
                                {
                                    sub_ba9254(*(unsigned long long *)&v25);
                                    _free(*(unsigned long long *)&v25);
                                    sub_ba9254(*(unsigned long long *)((void*)&v25 + 8));
                                    v174 = *(unsigned long long *)((void*)&v25 + 8);
                                }
                                _free(v174);
                            }
                            else
                            {
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                v175 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                if (!(v175 & 1))
                                {
                                    /* unsupported instruction */;
                                    sub_b86a90(*(unsigned long long *)&v25);
                                }
                            }
LABEL_baa558:
                            iter2 = *(long long *)&v164->field_48;
                            if (iter2 > v167)
                            {
                                ptr2 = v164->field_40 + v167 * 64;
                                v177 = ptr2->field_0;
                                v34 = *(int128_t *)&(&ptr2->field_0)[1];
                                v36 = *(int128_t *)((char *)&ptr2->field_8 + 8);
                                v38 = *(int128_t *)((char *)&ptr2->field_18 + 8);
                                v39 = *(long long *)((char *)&ptr2->field_28 + 8);
                                _memmove(ptr2, &ptr2->field_38, (iter2 + v171) * 64);
                                iter2 -= 1;
                                *(unsigned long long *)&v164->field_48 = iter2;
                                if (v177 == 12)
                                    goto LABEL_bab154;
                            }
                            else
                            {
LABEL_bab154:
                                v0 = &g_ef89c8;
                                goto LABEL_bab160;
                            }
                            v24 = v177;
                            v25 = v34;
                            v27 = v36;
                            v29 = v38;
                            v30 = v39;
                            dst1 = sub_ba9254(&v24);
                        } while (ptr != iter1);
                    }
                    if (v12)
                        dst1 = _free(ptr);
                    v46 = v7;
                    if (*(long long *)&v164->field_30)
                    {
                        v50 = v8;
                        v48 = v6;
                    }
                    else
                    {
                        v50 = v8;
                        if (v49->field_d8->field_28 > v46 && !(v178 = v49->field_d8->field_20 + v46 * 32, *v178 == 0x8000000000000000))
                        {
                            v27 = 12;
                            if (v178[2] > v50)
                            {
                                v179 = v178[1] + 264 * v50;
                                sub_ba8a90(v179);
                                dst1 = _memcpy(v179, &v22, 264);
                                v48 = v6;
                            }
                            else
                            {
                                sub_c73c94(v50);
                                goto LABEL_bab224;
                            }
                        }
                        else
                        {
                            sub_c73c64(&g_ef8980);
                            goto LABEL_bab1d4;
                        }
                    }
                }
                else
                {
                    v181 = &g_ef89e0;
                    goto LABEL_bab11c;
                }
            }
            v50 += 1;
            if (v50 == v48)
            {
                v44 = v49->field_d8;
                v45 = v49->field_d8->field_28;
                a0 = dst1;
                goto LABEL_baafdc;
            }
        }
        else
        {
            sub_c73c94(v50);
LABEL_bab1a0:
            v181 = &g_ef8950;
LABEL_bab11c:
            sub_c73c64(v181);
            goto LABEL_bab224;
        }
    }
LABEL_baa984:
    v26 = v61;
    if (node)
    {
        v123 = v109;
        if (!i)
        {
            do
            {
                v123 = v109 + 8;
                v62 -= 64;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v109)) & 0x8080808080808080;
                v109 = v123;
            } while (!i);
        }
        v109 = v123;
        v125 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v126 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v127 = ((((v126 | v125) & 0xffff0000ffff0000) >> 16 | (v126 | v125) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v126 | v125) & 0xffff0000ffff0000) >> 16 | (v126 | v125) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v127)
            v128 = 64;
        else
            v128 = Clz(v127);
        i &= i - 1;
        node -= 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ >= 0)
        {
            v100 = 4;
            v129 = v61;
            v102 = v21;
            if (v129 == v102)
            {
                v100 = 2;
                v129 = node;
                v102 = 1;
                v130 = arm64g_calculate_condition(50, node, 1, 0);
                sub_c736c8();
                v122 = v25;
            }
            v101 = v129;
            v103 = 0;
            *(long long *)((char *)v122 + 0x8 * v61) = *(long long *)(v62 - (v128 & 120) - 8);
            v61 = (char *)&v61->field_0 + 1;
            goto LABEL_baa984;
        }
        else
        {
LABEL_bab068:
            sub_c769bc();
            goto LABEL_bab06c;
        }
    }
    else
    {
        v62 = (unsigned int)v25;
        node = v5;
        v4[2] = v4[2] - 1;
        v23 = v62;
        v25 = v62;
        v26 = v21;
        v27 = v62 + v3 * 8;
LABEL_baaa54:
        v152 = v10;
        sub_b8bec4(&v23);
        v46 = v7;
        v153 = *(long long *)v152;
        *(long long *)v152 = v153 - 1;
        v49 = a0;
        if (v153 == 1)
            sub_bdc23c(v152);
        v154 = *(long long *)node;
        *(long long *)node = v154 - 1;
        if (v154 != 1)
            goto LABEL_baaaa0;
        v155 = 0;
        sub_bdc23c(node);
        if (!(v155 & 1))
            goto LABEL_baaaa0;
    }
}
