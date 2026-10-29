/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc76d30..0xc783fc (5836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c76d30_1 {
    unsigned long long field_0;
    char padding_8[96];
    unsigned long long field_68;
    char padding_70[8];
    struct st_c76d30_2 *field_78;
    char padding_80[48];
    unsigned long long field_b0;
    void* field_b8;
    char padding_c0[8];
    void* field_c8;
    unsigned long long field_d0;
    unsigned long long field_d8;
    unsigned long long field_e0;
    unsigned long long field_e8;
    unsigned long long field_f0;
    unsigned long long field_f8;
    unsigned int field_100;
    char field_104;
    unsigned int field_105;
    char field_109;
} st_c76d30_1;

typedef struct st_c76d30_5 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_14;
} st_c76d30_5;

typedef struct st_c76d30_3 {
    unsigned long long field_0;
    void* field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char field_19;
    char padding_1a[22];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
} st_c76d30_3;

typedef struct st_c76d30_2 {
    unsigned long long field_0;
} st_c76d30_2;

typedef struct st_c76d30_4 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
} st_c76d30_4;

extern char g_e06dc4;
extern unsigned long long g_e0e000;
extern long long g_efce78;
extern unsigned long long g_efce90;
extern unsigned long long g_efcea8;
extern unsigned long long g_fffffffffffffff8;

unsigned long long * sub_c76d30(unsigned long long *a0, long long a1, long long a2, st_c76d30_1 *a3)
{
    unsigned long long v69;  // x21
    unsigned long long v70;  // x25
    unsigned long long v79;  // x27
    unsigned long long v169;  // x21
    unsigned long long v170;  // w14
    void* v171;  // x10
    unsigned long v172;  // x15
    unsigned long long v173;  // 4122
    unsigned long long v174;  // x23
    unsigned long long v175;  // w13
    void* v176;  // x11
    unsigned long v177;  // x14
    unsigned long long v178;  // 4119
    unsigned long long ptr;  // x0
    unsigned long long v179;  // w10
    unsigned long long iter;  // x8
    unsigned long v181;  // x13
    unsigned long v182;  // x13
    st_c76d30_3 *v183;  // x11
    unsigned long long *v184;  // x8
    unsigned long long *v185;  // x23
    unsigned long v186;  // x20
    unsigned long long v187;  // x24
    unsigned long long v188;  // x3
    unsigned long long v81;  // x26
    unsigned long long v189;  // x19
    unsigned long long v190;  // x23
    unsigned long long idx;  // x8
    unsigned long long v192;  // x21
    unsigned long long v193;  // w20
    unsigned long long v194;  // w19
    unsigned long long v195;  // x10
    unsigned long long v196;  // x8
    unsigned long long v197;  // x9
    st_c76d30_5 *v198;  // x8
    unsigned long long v82;  // x19
    unsigned long long v199;  // x23
    unsigned long long v200;  // x24
    unsigned long long v201;  // x20
    unsigned long long v202;  // x19
    unsigned long long index;  // x21
    unsigned long long v204;  // x23
    unsigned long long *v205;  // x8
    unsigned long v206;  // x19
    unsigned long long v207;  // x23
    unsigned long long v208;  // x20
    unsigned long i;  // x23
    unsigned long long v209;  // x21
    unsigned long long v210;  // x19
    unsigned long long v211;  // x21
    unsigned long v212;  // x21
    unsigned long long v213;  // x19
    unsigned long long v214;  // x0
    st_c76d30_4 *v84;  // x8
    void* v85;  // x27
    unsigned long v86;  // x23
    unsigned long long v87;  // x10
    unsigned long long v88;  // x8
    unsigned long long v71;  // x23
    unsigned long long v89;  // x24
    char *v90;  // x20
    unsigned long long v91;  // x9
    unsigned long long v92;  // x19
    unsigned long v93;  // x11
    unsigned long long v94;  // x10
    unsigned long long v95;  // x27
    void* v96;  // x13
    unsigned long long v97;  // x14
    void* v98;  // x12
    unsigned long long ptr1;  // x0
    unsigned long long v99;  // w16
    void* iter1;  // x12
    unsigned long long v101;  // w15
    char v102;  // x17
    unsigned long v103;  // x16
    void* iter2;  // x15
    unsigned long long v105;  // x10
    unsigned long long v106;  // 4106
    unsigned long long v107;  // x12
    unsigned long long v108;  // w9
    unsigned long long v73;  // x23
    unsigned long long v109;  // x8
    void* v110;  // x14
    unsigned long v111;  // x10
    unsigned long long v112;  // 4118
    unsigned long long v113;  // x13
    unsigned long long v114;  // x16
    void* v115;  // x11
    unsigned long long v116;  // x15
    unsigned long long v117;  // w1
    unsigned long long v118;  // x0
    unsigned long long ptr2;  // x0
    void* v119;  // x17
    unsigned long v120;  // x2
    unsigned long long v121;  // 4118
    unsigned long long v122;  // x12
    unsigned long long v123;  // x11
    char v124;  // x12
    unsigned long long v125;  // x13
    unsigned long long v126;  // x12
    unsigned long long v127;  // 4133
    unsigned long long v128;  // x14
    unsigned long long v75;  // x20
    unsigned long long v129;  // x12
    unsigned long long v130;  // x13
    unsigned long long v131;  // x14
    unsigned long long v132;  // x13
    unsigned long long v133;  // x11
    unsigned long v134;  // x12
    unsigned long long v135;  // x11
    unsigned long long v136;  // 4119
    unsigned long long v137;  // x10
    unsigned long long v138;  // x14
    unsigned long long v76;  // x26
    unsigned long long v139;  // w16
    unsigned long long v140;  // x10
    unsigned long v141;  // x17
    unsigned long long v142;  // 4119
    unsigned long long v143;  // x10
    void* v144;  // x19
    unsigned long long v145;  // w11
    unsigned long v146;  // x11
    unsigned long long v147;  // 4120
    unsigned long long v148;  // 4122
    unsigned long long v77;  // x0
    unsigned int v149;  // w8
    unsigned long long v150;  // w8
    unsigned long v151;  // x8
    unsigned long long v152;  // x8
    unsigned long long v153;  // w10
    unsigned long long v154;  // x13
    char v155;  // x10
    unsigned long long v156;  // x10
    unsigned long long v157;  // x11
    unsigned long long v158;  // w8
    unsigned long v78;  // x22
    unsigned long long j;  // x9
    void* v160;  // x12
    unsigned long v161;  // x13
    unsigned long long v162;  // x20
    unsigned long long v163;  // x9
    unsigned long long node;  // x8
    void* v165;  // x11
    void* v166;  // x11
    unsigned long long v167;  // x13
    unsigned long long v168;  // 4120
    unsigned long long v0;  // [bp-0x2e8]
    unsigned int v1;  // [bp-0x2dc]
    unsigned long v2;  // [bp-0x2d8], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x2d0]
    unsigned long long v4;  // [bp-0x2c8]
    void* v5;  // [bp-0x2c0]
    unsigned long long v6;  // [bp-0x2b8]
    unsigned long v7;  // [bp-0x2b0]
    unsigned long v8;  // [bp-0x2a8]
    unsigned long long v9;  // [bp-0x2a0]
    unsigned long long v10;  // [bp-0x298]
    uint128_t v11;  // [bp-0x290], Other Possible Types: unsigned long long
    char *v12;  // [bp-0x278]
    uint128_t v13;  // [bp-0x270]
    uint128_t v14;  // [bp-0x260]
    uint128_t v15;  // [bp-0x250]
    uint128_t v16;  // [bp-0x240]
    uint128_t v17;  // [bp-0x230]
    unsigned long long v18;  // [bp-0x218]
    unsigned long long v19;  // [bp-0x210]
    unsigned long long v20;  // [bp-0x208]
    uint128_t v21;  // [bp-0x200]
    unsigned long long v22;  // [bp-0x1f0]
    uint704_t v23;  // [bp-0x1e8], Other Possible Types: unsigned long long *, char, unsigned long long
    uint128_t v24;  // [bp-0x1e0], Other Possible Types: unsigned long long
    unsigned long long v25;  // [bp-0x1d8]
    uint128_t v26;  // [bp-0x1d0], Other Possible Types: unsigned long
    unsigned long long v27;  // [bp-0x1c8]
    uint128_t v28;  // [bp-0x1c0]
    uint128_t v29;  // [bp-0x1b0]
    uint128_t v30;  // [bp-0x1a0]
    unsigned long long v31;  // [bp-0x190]
    unsigned long long v32;  // [bp-0x188]
    unsigned long long v33;  // [bp-0x180]
    unsigned long long v34;  // [bp-0x178]
    unsigned long long v35;  // [bp-0x170]
    unsigned long long v36;  // [bp-0x168]
    unsigned long long v37;  // [bp-0x160]
    unsigned long long v38;  // [bp-0x158]
    unsigned long long v39;  // [bp-0x150]
    unsigned long v40;  // [bp-0x148]
    unsigned long long v41;  // [bp-0x140]
    unsigned long v42;  // [bp-0x138]
    void* v43;  // [bp-0x130]
    unsigned long long v44;  // [bp-0x128]
    void* v45;  // [bp-0x120]
    unsigned long v46;  // [bp-0x118]
    unsigned long long v47;  // [bp-0x110]
    unsigned long v48;  // [bp-0x108]
    unsigned long v49;  // [bp-0x100]
    unsigned long v50;  // [bp-0xf8]
    unsigned long v51;  // [bp-0xf0]
    unsigned int v52;  // [bp-0xe8]
    char v53;  // [bp-0xe4]
    uint584_t v54;  // [bp-0xe3], Other Possible Types: char, unsigned int
    uint584_t v55;  // [bp-0xe3]
    unsigned long long v56;  // [bp-0xd8]
    unsigned long long v57;  // [bp-0xd0]
    unsigned long long v58;  // [bp-0xa8]
    char v59;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long long v60;  // [bp-0x9e]
    unsigned long long v61;  // [bp-0x9c]
    void* v62;  // [bp-0x98], Other Possible Types: unsigned long long
    unsigned long v63;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v64;  // [bp-0x88]
    unsigned long long v65;  // [bp-0x80]
    unsigned long long v66;  // [bp-0x78]
    char *v67;  // [bp-0x10]
    char v68;  // [bp+0x0]

    v67 = &v68;
    v8 = a3->field_e0;
    v9 = a3->field_d8;
    v7 = a3->field_e8;
    v4 = (unsigned long long)a3->padding_c0;
    v5 = a3->field_b8;
    v69 = a3->field_68;
    if (v69)
    {
        v70 = *(long long *)&a3->padding_8[88];
        v71 = v69 * 4;
        ptr1 = _malloc(v71);
        if (ptr1)
        {
            _memcpy();
            v73 = *(long long *)&a3->padding_80[0];
            v10 = ptr1;
            v11 = v69;
            *(unsigned int *)&v3 = a3->field_100;
            if (!v73)
                goto LABEL_c76e94;
LABEL_c76db8:
            v70 = v73 * 24;
            ptr2 = _malloc(v70);
            if (!ptr2)
                goto LABEL_c78290;
            if (v70)
                goto *((void *)(sub_c76df4 + (&g_e06dc4)[*(long long *)a3->field_78] * 4));
LABEL_c76e98:
            v1 = *((char *)&a3->field_105 + 1);
            v75 = *(long long *)&a3->padding_80[24];
            v6 = v73;
            v2 = ptr2;
            if (!v75)
            {
                v0 = 2;
                v78 = a3->field_b0;
                if (v78)
                    goto LABEL_c76edc;
LABEL_c76f78:
                v81 = 8;
                goto LABEL_c76f7c;
            }
            v76 = v75 * 4;
            v77 = _malloc(v76);
            if (!v77)
            {
                sub_c6b970(2, v76);
                goto LABEL_c782f0;
            }
            v0 = v77;
            _memcpy();
            v78 = a3->field_b0;
            if (!v78)
                goto LABEL_c76f78;
LABEL_c76edc:
            v79 = 88 * v78;
            ptr = _malloc(v79);
            if (ptr)
            {
                v81 = ptr;
                v82 = 0;
                i = v78;
                do
                {
                    if (v78 * 88 == v82)
                        break;
                    i -= 1;
                    sub_c4a314(&v23);
                    v84 = v81 + v82;
                    v84->field_20 = *(uint128_t *)((void*)&v23 + 32);
                    v84->field_30 = *(uint128_t *)((void*)&v23 + 48);
                    v84->field_40 = *(uint128_t *)((void*)&v23 + 64);
                    v84->field_50 = *(unsigned long long *)((void*)&v23 + 80);
                    v82 += 88;
                    v84->field_0 = *(uint128_t *)&v23;
                    v84->field_10 = *(uint128_t *)((void*)&v23 + 16);
                } while (i);
LABEL_c76f7c:
                v12 = &v54;
                v85 = a3->field_c8;
                v86 = a3->field_d0;
                if (a3->field_0 == 46)
                {
                    v87 = 46;
                }
                else
                {
                    sub_c4a314(&v23, a3);
                    v87 = *(unsigned long long *)&v23;
                    v15 = *(uint128_t *)((void*)&v23 + 40);
                    v16 = *(uint128_t *)((void*)&v23 + 56);
                    v17 = *(uint128_t *)((void*)&v23 + 72);
                    v13 = *(uint128_t *)((void*)&v23 + 8);
                    v14 = *(uint128_t *)((void*)&v23 + 24);
                }
                v0 = 0;
                v88 = 0;
                v26 = v14;
                v28 = v15;
                v29 = v16;
                v30 = v17;
                v24 = v13;
                v89 = 8;
                v18 = 0;
                v19 = 8;
                v20 = 0;
                v21 = CONCAT(8, 0);
                v22 = 0;
                v23 = v87;
                v31 = v11;
                v32 = v10;
                v33 = v31;
                v34 = v6;
                v35 = v2;
                v36 = v34;
                v37 = v75;
                v38 = v0;
                v39 = v75;
                v40 = v78;
                v41 = v81;
                v42 = v78;
                v43 = v5;
                v44 = v4;
                v45 = v85;
                v46 = v86;
                v47 = v9;
                v48 = v8;
                v49 = v7;
                v50 = a3->field_f0;
                v51 = a3->field_f8;
                v52 = v3;
                v53 = a3->field_104;
                v90 = v12;
                v54 = *(int *)&(&a3->field_104)[1];
                v54 = _INSERT(CONCAT(v54, 0), 4, v1);
                *(unsigned long long *)((char *)&v54 + 11) = 0;
                *(unsigned long long *)((char *)&v54 + 19) = 0;
                *(unsigned long long *)((char *)&v54 + 27) = CONCAT(1, 1);
                *(unsigned long long *)((char *)&v54 + 59) = 0;
                *(unsigned long long *)((char *)&v54 + 43) = 0;
                *(unsigned long long *)((char *)&v54 + 0x33) = 0;
                *((char *)&v54 + 67) = 0;
                *((char *)&v54 + 0x44) = v53;
                v91 = &g_e0e000;
                *(unsigned int *)&v60 = 0;
                v92 = &g_efcea8;
                v62 = v85;
                v63 = v86;
                v11 = 0x80000000000000000;
                while (1)
                {
                    if (v88 & 1)
                    {
                        v88 = v53;
                        *(unsigned long long *)((char *)&v54 + 11) = 0;
                        *(unsigned long long *)((char *)&v54 + 19) = 0;
                        v91 = &v23;
                        *(unsigned long long *)((char *)&v54 + 27) = CONCAT(1, 1);
                        *((char *)&v54 + 67) = 0;
                        *(unsigned long long *)((char *)&v54 + 43) = 0;
                        *(unsigned long long *)((char *)&v54 + 0x33) = 0;
                        *((char *)&v54 + 0x44) = v88;
                        *((char *)&v54 + 70) = 0;
                    }
                    *(unsigned long long *)((char *)&v54 + 59) = 0;
                    *((char *)&v54 + 69) = 0;
                    *(unsigned short *)((char *)&v54 + 71) = 0;
                    v93 = v63;
                    if (v93)
                    {
                        v94 = 0;
                    }
                    else
                    {
                        v95 = &g_efce90;
LABEL_c77e1c:
                        if (2 <= v20)
                        {
                            if (21 > v20)
                                sub_c4a968(v19);
                            else
                                sub_c4a854(v19);
                        }
                        v64 = 0;
                        v65 = 8;
                        v66 = 0;
                        if (5 > *(unsigned short *)((void*)&v52 + 2))
                        {
                            if (v23 == 46)
                                goto LABEL_c77e8c;
                        }
                        else
                        {
                            if (!v42)
                            {
LABEL_c77e8c:
                                sub_c6c3c4(&v64);
                                v199 = 0;
                                v78 = 0;
                                v200 = 1;
LABEL_c77eac:
                                v202 = 0;
                                index = v65;
                                *(unsigned long long *)index = v199;
                                *(unsigned long long *)(index + 8) = v200;
                                *(unsigned long *)(index + 16) = v78;
                                v204 = 1;
                                v66 = 1;
                                while (1)
                                {
                                    if (5 > *(unsigned short *)((void*)&v52 + 2))
                                    {
                                        if (v204)
                                        {
                                            if (v42 <= v204 - 1)
                                                goto LABEL_c77fc8;
                                        }
                                        else
                                        {
                                            if (v23 == 46)
                                            {
                                                v208 = v65;
                                                if (!v64)
                                                {
                                                    v204 = 0;
LABEL_c78130:
                                                    v78 = v19;
                                                    v210 = v20;
                                                    if (v18 > v210)
                                                    {
                                                        if (v210)
                                                        {
                                                            v211 = v210 * 32;
                                                            v78 = sub_b718c0(v78, v18 * 32, 8, v211);
                                                            if (!v78)
                                                            {
                                                                sub_c6b970(8, v211);
                                                                goto LABEL_c782f0;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            _free(v78);
                                                            v78 = 8;
                                                        }
                                                    }
                                                    if (v31)
                                                        _free(v32);
                                                    if (v34)
                                                        _free(v35);
                                                    if (v37)
                                                        _free(v38);
                                                    if (v40)
                                                        _free(v41);
                                                    if ((unsigned long long)v21)
                                                        _free(*(unsigned long long *)((void*)&v21 + 8));
LABEL_c77dd8:
                                                    if (*a0 != 1)
                                                    {
                                                        *a0 = 1;
                                                        a0[1] = v208;
                                                        a0[2] = v204;
                                                        a0[3] = v78;
                                                        a0[4] = v210;
                                                        return a0 + 1;
                                                    }
                                                    v23 = a0 + 1;
                                                    v24 = v208;
                                                    v25 = v204;
                                                    v26 = v78;
                                                    v27 = v210;
                                                    sub_c4aef4(&v23);
                                                    sub_c73b38("reentrant initInvalid archive member sizeInvalid archive extended name offsetInvalid archive extended name lengthInvalid archive terminatorInvalid archive member headera formatting trait implementation returned an error when the underlying stream did notinternal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 29, &g_efce78);
LABEL_c7827c:
                                                    v214 = v95;
                                                    goto LABEL_c782c4;
                                                }
LABEL_c78110:
                                                _free(v208);
                                                v204 = 0;
                                                v208 = 8;
                                                goto LABEL_c78130;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        if (v42 <= v204)
                                        {
LABEL_c77fc8:
                                            v208 = v65;
                                            if (v64 <= v204)
                                                goto LABEL_c78130;
                                            if (v204)
                                            {
                                                v209 = v204 * 24;
                                                v208 = sub_b718c0(v208, v64 * 24, 8, v209);
                                                if (!v208)
                                                {
                                                    sub_c6b970(8, v209);
                                                    goto LABEL_c782f0;
                                                }
                                                goto LABEL_c78130;
                                            }
                                            goto LABEL_c78110;
                                        }
                                    }
                                    sub_c4aa7c(&v13, a1, a2);
                                    v95 = *(unsigned long long *)&v13;
                                    v200 = *(unsigned long long *)((void*)&v13 + 8);
                                    v78 = *(unsigned long long *)&v14;
                                    if (v95 != 0x8000000000000000)
                                    {
                                        if (v204 == v64)
                                        {
                                            sub_c6c3c4(&v64);
                                            index = v65;
                                        }
                                        v205 = index + v202;
                                        v205[3] = v95;
                                        v205[4] = v200;
                                        v205[5] = v78;
                                        v204 += 1;
                                        v66 = v204;
                                        v202 += 24;
                                    }
                                    else
                                    {
                                        v201 = v65;
                                        if (v204)
                                        {
                                            v206 = v201 + 8;
                                            do
                                            {
                                                v207 = v204;
                                                if (*(long long *)(v206 - 8))
                                                    _free(*(long long *)v206);
                                            } while ((v206 += 24, v204 = v207 - 1, v207 != 1));
                                        }
                                    }
                                }
LABEL_c77fb0:
                                if (v64)
                                    _free(v201);
                                v204 = v200;
                                goto LABEL_c77d44;
                            }
                        }
                        sub_c4aa7c(&v13, a1, a2);
                        v199 = *(unsigned long long *)&v13;
                        v200 = *(unsigned long long *)((void*)&v13 + 8);
                        v78 = *(unsigned long long *)&v14;
                        if (v199 == 0x8000000000000000)
                        {
                            v201 = 8;
                            goto LABEL_c77fb0;
                        }
                        else
                        {
                            sub_c6c3c4(&v64);
                        }
                        goto LABEL_c77eac;
                    }
                    while (1)
                    {
                        v95 = &g_efce90;
                        v96 = v62;
                        v97 = v93 - 1;
                        v98 = v96;
                        v99 = *(char *)v98;
                        iter1 = v98 + 1;
                        v62 = iter1;
                        v63 = v97;
                        if (v99)
                        {
                            v101 = *(char *)((void*)&v54 + 4);
                            v102 = v99 - v101;
                            if (v101 > v99)
                            {
                                v103 = v99 - 1;
                                if (11 >= (unsigned int)v103)
                                    goto *((void *)(sub_c7716c + *(short *)(2 * v103 + 14708210) * 4));
                                iter2 = v43;
                                v105 = v103 & 0xff;
                                if (v44 < v105)
                                    goto LABEL_c78018;
                                iter2 += v105;
                                v106 = arm64g_calculate_condition(4, v44, v105, 0);
                                if (v106 & 1)
                                    goto LABEL_c78010;
                                v94 = *(char *)iter2;
                                if (!(unsigned int)v94)
                                    goto LABEL_c77394;
                                if ((unsigned int)v94 == 1)
                                {
                                    if (!v97)
                                        goto LABEL_c77d1c;
                                    v107 = 0;
                                    v108 = 0;
                                    v109 = v93 - 2;
                                    v110 = v96 + 2;
                                    while (1)
                                    {
                                        v111 = *((char *)v110 - 1);
                                        if (v108 == 63 && 1 < (unsigned int)v111)
                                            break;
                                        v107 |= (v111 & 127) << ((char)v108 & 63);
                                        if (!(v111 >> 7 & 1))
                                        {
                                            v94 = 0;
                                            v62 = v110;
                                            v63 = v109;
                                            v91 = v107 >> 8;
                                            v88 = v107 >> 16;
                                            v3 = v107;
                                            goto LABEL_c77394;
                                        }
                                        v110 += 1;
                                        v108 += 7;
                                        v109 -= 1;
                                        v112 = arm64g_calculate_condition(18, v109, 1, 0);
                                        if (!(v112 & 1))
                                        {
                                            iter1 = v96 + v93;
                                            v62 = iter1;
                                            v63 = 0;
                                            goto LABEL_c77d1c;
                                        }
                                    }
                                    v91 = 0;
                                    v88 = 0;
                                    v153 = 6;
                                    v78 = v3;
                                    goto LABEL_c77d2c;
                                }
                                else
                                {
                                    v113 = 0;
                                    v114 = v97;
                                    v115 = iter1;
                                    while (1)
                                    {
                                        if (!v114)
                                            goto LABEL_c780e0;
                                        v116 = 0;
                                        v117 = 0;
                                        v118 = v114 - 1;
                                        v119 = v115 + 1;
                                        while (1)
                                        {
                                            v120 = *((char *)v119 - 1);
                                            if (v117 == 63 && 1 < (unsigned int)v120)
                                            {
                                                v91 = 0;
                                                v88 = 0;
                                                v153 = 6;
                                                v78 = v4;
                                                goto LABEL_c77d2c;
                                            }
                                            v116 |= (v120 & 127) << ((char)v117 & 63);
                                            if (!(v120 >> 7 & 1))
                                                break;
                                            v119 += 1;
                                            v117 += 7;
                                            v118 -= 1;
                                            v121 = arm64g_calculate_condition(18, v118, 1, 0);
                                            if (!(v121 & 1))
                                            {
                                                v115 += v114;
                                                v62 = v115;
                                                v63 = 0;
                                                goto LABEL_c780e0;
                                            }
                                        }
                                        v113 += 1;
                                        v62 = v119;
                                        v63 = v118;
                                        v115 = v119;
                                        v114 = v118;
                                        v4 = v116;
                                        if (v113 == v94)
                                        {
                                            if (v97 < v119 - iter1)
                                                goto LABEL_c77d24;
                                            v94 = 0;
                                            v91 = iter1 >> 8;
                                            v88 = iter1 >> 16;
                                            v4 = v116;
                                            goto LABEL_c77394;
                                        }
                                    }
                                }
                            }
                            v122 = *(char *)((void*)&v54 + 3);
                            if (!(unsigned int)v122)
                                goto LABEL_c7827c;
                            v123 = v102 / v122;
                            v124 = v102 - (unsigned int)v122 * (unsigned int)v123;
                            v125 = *(char *)((void*)&v54 + 2);
                            v126 = v125 + v124;
                            v127 = arm64g_calculate_condition(66, v125, v124, 0);
                            if (!(v127 & 1))
                            {
                                *(unsigned long long *)((char *)&v54 + 35) = *(unsigned long long *)((void*)&v54 + 35) + v126;
                                if (*(char *)((void*)&v54 + 67) & 1)
                                    goto LABEL_c77344;
                            }
                            else
                            {
                                v128 = *(unsigned long long *)((void*)&v54 + 35);
                                v129 = v128 + v126;
                                if (v128 < -v126)
                                    v129 = 0;
                                *(unsigned long long *)((char *)&v54 + 35) = v129;
                                if (*(char *)((void*)&v54 + 67) & 1)
                                    goto LABEL_c77344;
                            }
                            v130 = *(char *)((void*)&v54 + 1);
                            if ((unsigned int)v130 == 1)
                            {
                                v132 = 0;
LABEL_c77314:
                                *(unsigned long long *)((char *)&v54 + 19) = v132;
                                v133 = *(char *)&v54 * v123;
                                v134 = *(unsigned long long *)((void*)&v54 + 11);
                                v135 = v133 + v134;
                                v136 = arm64g_calculate_condition(0x22, v133, v134, 0);
                                if (!(v136 & 1) && (char *)&g_fffffffffffffff8 + 7 >> ((char)-((char)v52 * 8) & 56 & 63) >= v135)
                                {
                                    *(unsigned long long *)((char *)&v54 + 11) = v135;
                                }
                                else
                                {
                                    v204 = &v23 & 0xffffffffffff0000 | v94 & 0xff00 | 52;
                                    v78 = v135;
LABEL_c77d44:
                                    if (v31)
                                        _free(v32);
                                    if (v34)
                                        _free(v35);
                                    if (v37)
                                        _free(v38);
                                    if (v40)
                                        _free(v41);
                                    if ((unsigned long long)v21)
                                        _free(*(unsigned long long *)((void*)&v21 + 8));
                                    v210 = v20;
                                    if (v210)
                                    {
                                        v212 = v19 + 8;
                                        do
                                        {
                                            v213 = v210;
                                            if (*(long long *)v212)
                                                _free(*(long long *)(v212 - 8));
                                        } while ((v212 += 32, v210 = v213 - 1, v213 != 1));
                                    }
                                    if (v18)
                                        _free(v19);
                                    v208 = 0;
                                    goto LABEL_c77dd8;
                                }
LABEL_c77344:
                                v137 = *(char *)((void*)&v54 + 70);
                                if (!(*(char *)((void*)&v54 + 67) & 1))
                                    goto LABEL_c77bac;
                                goto LABEL_c77350;
                            }
                            else if ((unsigned int)v130)
                            {
                                v131 = *(unsigned long long *)((void*)&v54 + 19) + v123;
                                v123 = v131 / v130;
                                v132 = v131 - v130 * v123;
                                goto LABEL_c77314;
                            }
                            else
                            {
                                v214 = v92;
LABEL_c782c4:
                                sub_c73e58(v214);
                                goto LABEL_c782f0;
                            }
                            goto LABEL_c782f0;
                        }
                        if (!v97)
                            goto LABEL_c77d1c;
                        v138 = 0;
                        v139 = 0;
                        v140 = v93 - 2;
                        iter2 = iter1;
                        while (1)
                        {
                            v141 = *(char *)iter2;
                            iter2 += 1;
                            if (v139 == 63 && 1 < (unsigned int)v141)
                            {
LABEL_c77cf4:
                                v91 = 0;
                                v88 = 0;
                                v153 = 6;
                                goto LABEL_c77d2c;
                            }
                            v138 |= (v141 & 127) << ((char)v139 & 63);
                            if (!(v141 >> 7 & 1))
                                break;
                            v139 += 7;
                            v140 -= 1;
                            iter1 = iter2;
                            v142 = arm64g_calculate_condition(18, v140, 1, 0);
                            if (!(v142 & 1))
                            {
                                iter1 = v96 + v93;
                                v62 = iter1;
                                goto LABEL_c77d1c;
                            }
                        }
                        if (v140 < v138 || !(v62 = iter2 + v138, v63 = v140 - v138, v138))
                        {
LABEL_c78010:
                            v91 = 0;
                            v88 = 0;
LABEL_c78018:
                            v153 = 19;
                            v78 = iter2;
                            goto LABEL_c77d2c;
                        }
                        v143 = v138 - 1;
                        v144 = iter1 + 2;
                        v145 = (char)iter1[1];
                        if (2 >= v145)
                            break;
                        if (v145 != 3)
                        {
                            if (v145 == 4 && v143)
                            {
                                v157 = 0;
                                v158 = 0;
                                j = v143;
                                v160 = v144;
                                do
                                {
                                    v161 = *(char *)v160;
                                    v160 += 1;
                                    if (v158 == 63 && 1 < (unsigned int)v161)
                                    {
                                        v91 = 0;
                                        v88 = 0;
                                        v153 = 6;
                                        goto LABEL_c77d2c;
                                    }
                                    v157 |= (v161 & 127) << ((char)v158 & 63);
                                    if (!(v161 >> 7 & 1))
                                    {
                                        v91 = v157 >> 8;
                                        v88 = v157 >> 16;
                                        v58 = v157;
                                        v78 = v157;
                                        v94 = 0;
LABEL_c77858:
                                        goto LABEL_c77394;
                                    }
                                    v158 += 7;
                                    j -= 1;
                                } while (j);
                                v144 += v143;
                                goto LABEL_c7808c;
                            }
LABEL_c77614:
                            v91 = v144 >> 8;
                            v88 = v144 >> 16;
                            goto LABEL_c77858;
                        }
                        else
                        {
                            if (5 <= *(unsigned short *)((void*)&v52 + 2))
                            {
                                v91 = v144 >> 8;
                                v88 = v144 >> 16;
                                goto LABEL_c77858;
                            }
                            if (v143)
                            {
                                v162 = 0;
                                v163 = v138 - 3;
                                node = v138 - 4;
                                v165 = v144;
                            }
                            else
                            {
LABEL_c7808c:
                                v91 = 0;
                                v88 = 0;
                                v153 = 19;
                                v78 = v144;
                                goto LABEL_c77d2c;
                            }
                            while (1)
                            {
                                v166 = v165 + 1;
                                if (!*(char *)v165)
                                    break;
                                v162 += 1;
                                v163 -= 1;
                                node -= 1;
                                v165 = v166;
                                if (v143 == v162)
                                    goto LABEL_c7808c;
                            }
                            v167 = ~v162;
                            iter1 = v144 + v162 + 1;
                            v168 = arm64g_calculate_condition(2, v143, v167, 0);
                            if (v168 & 1)
                                goto LABEL_c77d1c;
                            v169 = 0;
                            v170 = 0;
                            v171 = iter1;
                            v115 = iter1;
                            while (1)
                            {
                                v172 = *(char *)v115;
                                v115 += 1;
                                if (v170 == 63 && 1 < (unsigned int)v172)
                                    goto LABEL_c77cf4;
                                v169 |= (v172 & 127) << ((char)v170 & 63);
                                if (!(v172 >> 7 & 1))
                                    break;
                                v170 += 7;
                                v163 -= 1;
                                node -= 1;
                                v171 = v115;
                                v173 = arm64g_calculate_condition(18, v163, 1, 0);
                                if (!(v173 & 1))
                                {
                                    iter1 += v143 + v167;
                                    goto LABEL_c77d1c;
                                }
                            }
                            if (!v163)
                                goto LABEL_c780e0;
                            v174 = 0;
                            v175 = 0;
                            v176 = v115;
                            while (1)
                            {
                                v177 = *(char *)v115;
                                v115 += 1;
                                if (v175 == 63 && 1 < (unsigned int)v177)
                                    goto LABEL_c77cf4;
                                v174 |= (v177 & 127) << ((char)v175 & 63);
                                if (!(v177 >> 7 & 1))
                                    break;
                                v175 += 7;
                                node -= 1;
                                v176 = v115;
                                v178 = arm64g_calculate_condition(18, node, 1, 0);
                                if (!(v178 & 1))
                                {
                                    v115 = v171 + v163 + 1;
LABEL_c780e0:
                                    v91 = 0;
                                    v88 = 0;
                                    v153 = 19;
                                    v78 = v115;
                                    goto LABEL_c77d2c;
                                }
                            }
                            iter1 = v115;
                            if (!node)
                                goto LABEL_c77d1c;
                            v95 = 0;
                            v179 = 0;
                            iter = node;
                            while (1)
                            {
                                v181 = *(char *)v115;
                                v115 += 1;
                                if (v179 == 63 && 1 < (unsigned int)v181)
                                    goto LABEL_c77cf4;
                                v95 |= (v181 & 127) << ((char)v179 & 63);
                                if (!(v181 >> 7 & 1))
                                    break;
                                v179 += 7;
                                iter -= 1;
                                if (!iter)
                                {
                                    iter1 = v176 + node + 1;
LABEL_c77d1c:
                                    v91 = 0;
                                    v88 = 0;
LABEL_c77d24:
                                    v153 = 19;
                                    v78 = iter1;
                                    goto LABEL_c77d2c;
                                }
                            }
                            v2 = v42;
                            if (v42 == v40)
                                sub_c783fc(&v40);
                            v94 = 0;
                            v91 = v144 >> 8;
                            v182 = v2;
                            v183 = v41 + 88 * v182;
                            v183->field_0 = 31;
                            v183->field_8 = v144;
                            v88 = v144 >> 16;
                            v183->field_10 = v162;
                            *(char *)&v183->field_18 = 46;
                            memset((char *)&v183->field_18 + 1, 0, 7);
                            *(unsigned long long *)&v183->padding_1a[15] = v169;
                            v183->field_30 = v174;
                            v183->field_40 = 0;
                            v183[1].field_0 = 0;
                            v183->field_38 = v95;
                            v42 = v182 + 1;
                            v90 = v12;
                        }
LABEL_c77394:
                        v93 = v63;
                        if (!v93)
                            goto LABEL_c77e1c;
                    }
                    if (v145 != 1)
                    {
                        if (v145 != 2)
                            goto LABEL_c77614;
                        v146 = (char)v52;
                        if ((((unsigned int)v146 ^ (unsigned int)v146 - 1) & 0xff) <= ((unsigned int)v146 - 1 & 0xff))
                        {
LABEL_c778dc:
                            v152 = v10 & 0xffffffffffff0000 | v146 * 0x100 | 25;
                            goto LABEL_c779d4;
                        }
                        v147 = ((v146 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc;
                        v148 = (((v146 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2;
                        v149 = ((((((((v148 | v147) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v148 | v147) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v148 | v147) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v148 | v147) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((((v148 | v147) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v148 | v147) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v148 | v147) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v148 | v147) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                        if (!(v149 * 0x100000000))
                            v150 = 32;
                        else
                            v150 = (unsigned int)Clz(v149 * 0x100000000);
                        if (1 >= v150)
                        {
                            if (v150)
                            {
                                if (v150 != 1)
                                    goto LABEL_c778dc;
                                if (v143 <= 1)
                                    goto LABEL_c781fc;
                                v151 = *(short *)v144;
                            }
                            else
                            {
                                if (!v143)
                                    goto LABEL_c781fc;
                                v151 = *(char *)v144;
                            }
                        }
                        else
                        {
                            if (v150 != 2)
                            {
                                if (v150 != 3)
                                    goto LABEL_c778dc;
                                if (v143 > 7)
                                {
                                    v151 = (char)iter1[9] * 0x100000000000000 | ((int)iter1[2] * 0x100 | ((short)iter1[6] | (char)iter1[8] * 0x10000) * 0x10000000000) >> 8;
                                }
                                else
                                {
                                    v153 = 19;
                                    v78 = v144;
                                    v10 = 19;
LABEL_c78228:
                                    v91 = v10 >> 8;
                                    v88 = v10 >> 16;
LABEL_c77d2c:
                                    v204 = v153 & 0xffffffffffff0000 | (v153 & 0xffffffffffff00ff | (v91 * 0x100 | v91 >> 56) & 0xff00) & 0xffff | v88 * 0x10000;
                                    v62 = 1;
                                    v63 = 0;
                                    goto LABEL_c77d44;
                                }
                            }
                            else if (v143 > 3)
                            {
                                v151 = *(int *)v144;
                            }
                            else
                            {
LABEL_c781fc:
                                v153 = 19;
                                v10 = 19;
                                v78 = v144;
                                goto LABEL_c78228;
                            }
                        }
                        v9 = v151;
                        v152 = v10 & 0xffffffffffffff00 | (v10 & 0xffffffffffffff00 | 82) & 0xff;
LABEL_c779d4:
                        v10 = v152;
                        v153 = (unsigned int)v152 & 0xff;
                        if (v153 == 82)
                        {
                            v154 = v9;
                            v91 = v154 >> 8;
                            v88 = v154 >> 16;
                            if (*(unsigned long long *)((void*)&v54 + 11) > v154)
                            {
                                v94 = 0;
                                v59 = 1;
                                goto LABEL_c77394;
                            }
                            else
                            {
                                v155 = (char)-((unsigned int)v146 * 8) & 56;
                                v156 = (char *)&g_fffffffffffffff8 + 6 << (v155 & 63) >> (v155 & 63);
                                v59 = v154 >= v156;
                                v94 = 0;
                                if (v156 > v154)
                                {
                                    v56 = v154;
                                    v57 = 0;
                                    goto LABEL_c77394;
                                }
                            }
                        }
                        else
                        {
                            v78 = v9;
                            goto LABEL_c78228;
                        }
                        goto LABEL_c78228;
                    }
                    else
                    {
                        *((char *)&v54 + 70) = 1;
                        v137 = 1;
                        if (*(char *)((void*)&v54 + 67) & 1)
                        {
LABEL_c77350:
                            if (v137 & 1)
                            {
                                v55 = _INSERT(v54, 11, 0);
                                *(unsigned long long *)((char *)&v55 + 19) = 0;
                                *(unsigned long long *)((char *)&v55 + 27) = CONCAT(1, 1);
                                *(unsigned long long *)((char *)&v55 + 0x33) = 0;
                                *(unsigned long long *)((char *)&v55 + 59) = 0;
                                *(unsigned long long *)((char *)&v55 + 43) = 0;
                                *((char *)&v55 + 67) = 0;
                                v54 = _INSERT(v55, 0x44, v53);
                                *(unsigned int *)&v90[69] = 0;
                                v94 = 0x100;
                                goto LABEL_c77394;
                            }
                            else
                            {
                                v58 = 0;
                                v60 = 0;
                                v94 = 0x100;
                                v61 = 0;
                                goto LABEL_c77394;
                            }
                        }
                        else
                        {
LABEL_c77bac:
                            if (!(v137 & 1))
                            {
                                v192 = *(unsigned long long *)((void*)&v54 + 27);
                                v193 = *(unsigned int *)((void*)&v54 + 35);
                                v194 = *(unsigned int *)((void*)&v54 + 43);
                                v195 = v0;
                                if (v195 && !(v196 = v89 + 24 * v195, v91 = *(long long *)(v196 - 24), v91 != *(unsigned long long *)((void*)&v54 + 11)))
                                {
                                    *(unsigned long long *)(v196 - 16) = v192;
                                    *(unsigned int *)(v196 - 8) = v193;
                                    *(unsigned int *)(v196 - 4) = v194;
                                }
                                else
                                {
                                    if (v195 == (unsigned long long)v21)
                                    {
                                        sub_c6c3c4(&v21);
                                        v89 = *(unsigned long long *)((void*)&v21 + 8);
                                    }
                                    v197 = v0;
                                    v198 = v89 + 24 * v197;
                                    v198->field_0 = *(unsigned long long *)((void*)&v54 + 11);
                                    v198->field_8 = v192;
                                    *(unsigned int *)&v198->field_10 = v193;
                                    *(unsigned int *)((char *)&v198->field_10 + 4) = v194;
                                    v91 = v197 + 1;
                                    v0 = v91;
                                    v22 = v91;
                                }
                                v90 = v12;
                                goto LABEL_c77ce4;
                            }
                            v91 = v0;
                            if (!v91)
                            {
                                v0 = 0;
                                v88 = *(char *)((void*)&v54 + 70);
                                continue;
                            }
                            v184 = (unsigned long long)v21;
                            v185 = *(unsigned long long *)((void*)&v21 + 8);
                            v186 = *v185;
                            v21 = v11;
                            v22 = 0;
                            v187 = v91;
                            if (v184 > v91)
                            {
                                v188 = v187 * 24;
                                v189 = sub_b718c0(v185, v184 * 24, 8, v188);
                                if (v189)
                                    goto LABEL_c77c9c;
                                sub_c6b970(8, v188);
                                break;
                            }
                            else
                            {
                                v189 = v185;
LABEL_c77c9c:
                                v190 = v20;
                                if (v190 == v18)
                                    sub_c737b0(&v18);
                                idx = v19 + v190 * 32;
                                *(unsigned long long *)idx = v189;
                                *(unsigned long long *)(idx + 8) = v187;
                                *(unsigned long *)(idx + 16) = v186;
                                *(unsigned long long *)(idx + 24) = *(unsigned long long *)((void*)&v54 + 11);
                                v20 = v190 + 1;
                                v89 = 8;
                                v0 = 0;
                                v90 = v12;
                                v92 = &g_efcea8;
LABEL_c77ce4:
                                v88 = *(char *)((void*)&v54 + 70);
                            }
                        }
                    }
                }
            }
            else
            {
                sub_c6b970(8, v79);
            }
        }
        else
        {
            sub_c6b970(2, v71);
LABEL_c78290:
            sub_c6b970(8, v70);
        }
LABEL_c782f0:
        __debugbreak();
    }
    else
    {
        v73 = *(long long *)&a3->padding_80[0];
        v10 = 2;
        v11 = 0;
        *(unsigned int *)&v3 = a3->field_100;
        if (v73)
            goto LABEL_c76db8;
LABEL_c76e94:
        ptr2 = 8;
        goto LABEL_c76e98;
    }
}
