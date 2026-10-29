/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc13cd8..0xc1453c (2148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c13cd8_1 {
} st_c13cd8_1;

typedef struct st_c13cd8_4 {
    char padding_0[1232];
    struct st_c13cd8_5 *field_4d0;
    char padding_4d8[88];
    unsigned short field_530;
} st_c13cd8_4;

typedef struct st_c13cd8_5 {
    char padding_0[1240];
    char field_4d8;
    char padding_4d9[89];
    unsigned short field_532;
    char padding_534[4];
    struct st_c13cd8_4 *field_538;
} st_c13cd8_5;

typedef struct st_c13cd8_6 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c13cd8_6;

typedef struct st_c13cd8_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    void* field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_c13cd8_2;

typedef struct st_c13cd8_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    unsigned long long field_68;
} st_c13cd8_3;

typedef struct st_c13cd8_0 {
    char padding_0[1232];
    struct st_c13cd8_1 *field_4d0;
} st_c13cd8_0;

extern long long g_efba10;
extern long long g_efba40;
extern long long g_efba58;
extern long long g_efba88;
extern long long g_efbaa0;

double sub_c13cd8(st_c13cd8_2 *a0, void* a1)
{
    unsigned long v49;  // x24
    unsigned long v50;  // x20
    char v59;  // x14
    unsigned long long i;  // w14
    uint128_t *v61;  // x8
    uint128_t v62;  // q1
    uint128_t v63;  // q1
    uint128_t v64;  // q0
    void* v65;  // x27
    st_c13cd8_6 *v66;  // x8
    unsigned long v67;  // x10
    unsigned long long *v68;  // x11
    unsigned long long v51;  // 4106
    unsigned long long v69;  // x12
    unsigned long long v70;  // x13
    unsigned long long v71;  // x9
    char v73;  // x14
    unsigned long long j;  // w14
    unsigned long long v75;  // x10
    unsigned long v76;  // cc_dep1
    unsigned long long v77;  // 4104
    unsigned long long v78;  // 4104
    void* v52;  // x8
    unsigned long long v79;  // x11
    unsigned long long v80;  // 4105
    unsigned long long v81;  // 4105
    unsigned long v82;  // cc_dep1
    unsigned long long v83;  // w12
    unsigned long long v84;  // 4105
    unsigned long long v85;  // 4105
    unsigned long long v86;  // x11
    unsigned long long v87;  // 4105
    unsigned long long v88;  // 4105
    unsigned long v53;  // x9
    unsigned long long idx;  // x10
    unsigned long long v90;  // 4106
    unsigned long long v91;  // 4106
    unsigned long long v92;  // w22
    unsigned long long v93;  // 4105
    unsigned long long v94;  // 4105
    unsigned long long v95;  // x21
    unsigned long long v96;  // 4105
    unsigned long long v97;  // 4105
    st_c13cd8_0 *v98;  // x0
    unsigned long long *v54;  // x11
    unsigned long long v99;  // x25
    unsigned long long *v100;  // x8
    st_c13cd8_3 *v101;  // x9
    unsigned long v102;  // x21
    st_c13cd8_0 *ptr;  // x26
    unsigned long v104;  // x22
    st_c13cd8_0 *v105;  // x8
    unsigned long v106;  // x26
    unsigned long v107;  // x24
    unsigned long long k;  // x25
    unsigned long long v55;  // x12
    unsigned long v109;  // x8
    unsigned long v110;  // x9
    unsigned long v111;  // x10
    unsigned long v112;  // x2
    unsigned long long v113;  // x22
    unsigned long v114;  // x24
    unsigned long long idx1;  // x28
    unsigned long long v116;  // 4103
    st_c13cd8_5 *ptr1;  // x27
    unsigned long long v118;  // x23
    unsigned long long v56;  // x13
    unsigned long long *v119;  // x8
    st_c13cd8_3 *v120;  // x9
    unsigned long long v121;  // x21
    unsigned long long v122;  // x23
    unsigned long v123;  // x1
    unsigned long long index;  // x8
    unsigned long idx2;  // x9
    unsigned long v126;  // cc_dep1
    unsigned long v127;  // cc_dep2
    unsigned long long v128;  // x9
    unsigned long long v57;  // x10
    unsigned long long v129;  // 4102
    unsigned long long v130;  // 4102
    unsigned long v131;  // x28
    void* v132;  // x20
    unsigned long v133;  // x22
    void* v134;  // x23
    unsigned long long v135;  // 4121
    void* v136;  // x0
    uint128_t v137;  // q1
    uint128_t v138;  // q1
    unsigned long v0;  // [bp-0x290]
    unsigned long v1;  // [bp-0x288]
    unsigned long v2;  // [bp-0x280]
    st_c13cd8_5 **v3;  // [bp-0x278]
    unsigned long v4;  // [bp-0x270]
    unsigned long v5;  // [bp-0x268]
    unsigned long long v6;  // [bp-0x260]
    st_c13cd8_0 *v7;  // [bp-0x258]
    unsigned long long v8;  // [bp-0x258]
    unsigned long v9;  // [bp-0x250]
    unsigned long v10;  // [bp-0x248]
    unsigned long v11;  // [bp-0x240]
    st_c13cd8_6 *v12;  // [bp-0x238]
    unsigned long v13;  // [bp-0x230]
    void* v14;  // [bp-0x228], Other Possible Types: unsigned long long
    unsigned long long v15;  // [bp-0x220]
    unsigned long long v16;  // [bp-0x218]
    unsigned long v17;  // [bp-0x210]
    unsigned long v18;  // [bp-0x208]
    unsigned long v19;  // [bp-0x200]
    uint128_t v20;  // [bp-0x1f8]
    uint128_t v21;  // [bp-0x1e8]
    uint128_t v22;  // [bp-0x1d8]
    uint128_t v23;  // [bp-0x1c8]
    uint128_t v24;  // [bp-0x1b8]
    unsigned long v25;  // [bp-0x1a8]
    st_c13cd8_0 *v26;  // [bp-0x1a0], Other Possible Types: uint128_t
    unsigned long long v27;  // [bp-0x198]
    uint128_t v28;  // [bp-0x190], Other Possible Types: unsigned long long
    uint128_t v29;  // [bp-0x180]
    uint128_t v30;  // [bp-0x170]
    uint128_t v31;  // [bp-0x160]
    unsigned long v32;  // [bp-0x150]
    st_c13cd8_5 *v33;  // [bp-0x140]
    st_c13cd8_5 *v34;  // [bp-0x138]
    uint128_t v35;  // [bp-0x130]
    uint128_t v36;  // [bp-0x120]
    uint128_t v37;  // [bp-0x110]
    uint128_t v38;  // [bp-0x100]
    uint128_t v39;  // [bp-0xf0]
    unsigned long v40;  // [bp-0xe0]
    uint128_t v41;  // [bp-0xd0], Other Possible Types: char
    uint128_t v42;  // [bp-0xc0]
    uint128_t v43;  // [bp-0xb0]
    uint128_t v44;  // [bp-0xa0]
    uint128_t v45;  // [bp-0x90]
    unsigned long v46;  // [bp-0x80]
    char *v47;  // [bp-0x10]
    char v48;  // [bp+0x0]

    v47 = &v48;
    v49 = (long long)a1[96];
    v50 = v49 - 1;
    if (a0->field_10 <= v50)
    {
        v51 = arm64g_calculate_condition(20, v50, a0->field_10, 0);
        if (v51 & 1)
        {
            v65 = a0->field_18;
            v66 = &a0->field_18;
            if (!a0->field_18)
            {
                v12 = v66;
                v13 = v49;
                v14 = 0;
                v136 = sub_c138bc();
                *(unsigned long long *)&v136[1232] = 0;
                a0->field_18 = v136;
                a0->field_20 = 0;
                *(unsigned short *)&v136[1330] = 1;
                *(unsigned long *)&v136[1240] = v49;
                v137 = (int128_t)a1[80];
                *(int128_t *)&v136[64] = (int128_t)a1[64];
                *(uint128_t *)&v136[80] = v137;
                *(int128_t *)&v136[96] = (int128_t)a1[96];
                v138 = (int128_t)a1[16];
                *(int128_t *)v136 = *(int128_t *)a1;
                *(uint128_t *)&v136[16] = v138;
                v64 = (int128_t)a1[48];
                *(int128_t *)&v136[32] = (int128_t)a1[32];
                *(uint128_t *)&v136[48] = v64;
                a0->field_28 = a0->field_28 + 1;
                return *(unsigned long long *)&v64;
            }
            v67 = a0->field_20;
            while (1)
            {
                v68 = v65 + 1240;
                v69 = (short)v65[1330];
                v70 = v69 * 8;
                v71 = 0xffffffffffffffff;
                do
                {
                    if (!v70)
                        goto LABEL_c13e18;
                    if (*v68 <= v49)
                        v73 = v49 > *v68;
                    else
                        v73 = 0xff;
                    v71 += 1;
                    v70 -= 8;
                    j = v73;
                    v68 += 1;
                } while (j == 1);
                v69 = v71;
                if (!j)
                    break;
LABEL_c13e18:
                if (v67)
                {
                    v65 = *(long long *)((char *)v65 + 8 * v69 + 1336);
                    v67 -= 1;
                }
                else
                {
                    v12 = v66;
                    v13 = v49;
                    v14 = v65;
                    v15 = 0;
                    v16 = v69;
                    if (11 > (short)v65[1330])
                    {
                        sub_c1390c(&v41, &v14, v49, a1);
                        a0->field_28 = a0->field_28 + 1;
                        return *(unsigned long long *)&v64;
                    }
                    v75 = 5;
                    v76 = v69;
                    if (v69 != 6)
                    {
                        v77 = arm64g_calculate_condition(4, v76, 6, 0);
                        if (!(v77 & 1))
                            goto LABEL_c13f1e;
LABEL_c13f1d:
                        v79 = 0;
                        v80 = arm64g_calculate_condition(4, v76, 6, 0);
                        if (!(v80 & 1))
                            goto LABEL_c13f22;
LABEL_c13f21:
                    }
                    else
                    {
                        v78 = arm64g_calculate_condition(4, v76, 6, 0);
                        if (v78 & 1)
                            goto LABEL_c13f1d;
LABEL_c13f1e:
                        v79 = v69 - 7;
                        v81 = arm64g_calculate_condition(4, v76, 6, 0);
                        if (v81 & 1)
                            goto LABEL_c13f21;
LABEL_c13f22:
                        v75 = 6;
                    }
                    v82 = v69;
                    if (v69 == 5)
                    {
                        v83 = 0;
                        v84 = arm64g_calculate_condition(4, v82, 5, 0);
                        if (!(v84 & 1))
                            goto LABEL_c13f2e;
                    }
                    else
                    {
                        v83 = 1;
                        v85 = arm64g_calculate_condition(4, v82, 5, 0);
                        if (!(v85 & 1))
                        {
LABEL_c13f2e:
                            v86 = v79;
                            v88 = arm64g_calculate_condition(4, v82, 5, 0);
                            if (!(v88 & 1))
                            {
LABEL_c13f32:
                                idx = v75;
                                v91 = arm64g_calculate_condition(52, v82, 5, 0);
                                if (!(v91 & 1))
                                {
LABEL_c13f36:
                                    v92 = v83;
                                    v94 = arm64g_calculate_condition(52, v82, 5, 0);
                                    if (!(v94 & 1))
                                    {
LABEL_c13f3a:
                                        v95 = v86;
                                        v97 = arm64g_calculate_condition(52, v82, 5, 0);
                                        if (!(v97 & 1))
                                        {
LABEL_c13f3e:
LABEL_c13f40:
                                            v98 = sub_c138bc();
                                            v8 = v92;
                                            v6 = v95;
                                            v98->field_4d0 = 0;
                                            *(unsigned short *)&v98[1].padding_0[90] = 0;
                                            v99 = ~idx + (short)v65[1330];
                                            *(unsigned short *)&v98[1].padding_0[90] = v99;
                                            v100 = v65 + 1240;
                                            v101 = v65 + 112 * idx;
                                            v10 = v100[idx];
                                            v11 = v101->field_0;
                                            v102 = v101->field_10;
                                            v9 = v101->field_8;
                                            ptr = v98;
                                            v43 = *(int128_t *)((char *)&v101->field_28 + 8);
                                            v44 = *(int128_t *)((char *)&v101->field_38 + 8);
                                            v45 = *(int128_t *)((char *)&v101->field_48 + 8);
                                            v46 = *(long long *)((char *)&v101->field_58 + 8);
                                            v41 = *(int128_t *)&(&v101->field_10)[1];
                                            v42 = *(int128_t *)((char *)&v101->field_18 + 8);
                                            if (12 <= v99)
                                            {
                                                sub_c73bb0(0, v99, 11, &g_efba88);
                                                __debugbreak();
                                            }
                                            v104 = idx + 1;
                                            _memcpy(ptr + 1, &v100[v104], v99 * 8);
                                            _memcpy(ptr, v65 + 112 * v104, v99 * 112);
                                            *(unsigned short *)&v65[1330] = idx;
                                            v37 = v43;
                                            v38 = v44;
                                            v39 = v45;
                                            v40 = v46;
                                            v35 = v41;
                                            v36 = v42;
                                            v7 = ptr;
                                            if (v8)
                                                v105 = ptr;
                                            else
                                                v105 = v65;
                                            v26 = v105;
                                            v27 = 0;
                                            v28 = v6;
                                            sub_c1390c();
                                            v106 = v11;
                                            if (v106 == 2)
                                            {
                                                a0->field_28 = a0->field_28 + 1;
                                                return *(unsigned long long *)&v41;
                                            }
                                            v22 = v37;
                                            v23 = v38;
                                            v24 = v39;
                                            v64 = v35;
                                            v20 = v64;
                                            v107 = v9;
                                            v17 = v106;
                                            v18 = v107;
                                            v19 = v102;
                                            v25 = v40;
                                            v21 = v36;
                                            k = (long long)v65[1232];
                                            if (k)
                                            {
                                                v6 = 0;
                                                v109 = v102;
                                                v110 = v107;
                                                v111 = v106;
                                                v112 = v10;
                                                do
                                                {
                                                    v113 = (short)v65[1328];
                                                    v114 = *(short *)(k + 1330);
                                                    if (v114 < 11)
                                                    {
                                                        sub_c13a74(k, v113);
                                                        a0->field_28 = a0->field_28 + 1;
                                                        return *(unsigned long long *)&v64;
                                                    }
                                                    if (5 > (unsigned int)v113)
                                                    {
                                                        v3 = &v34;
                                                        idx1 = 4;
                                                    }
                                                    else
                                                    {
                                                        v116 = arm64g_calculate_condition(3, v113 & 0xffff, 5, 0);
                                                        if (!(v116 & 1))
                                                        {
                                                            if ((unsigned int)v113 == 6)
                                                            {
                                                                v113 = 0;
                                                                v3 = &v33;
                                                                idx1 = 5;
                                                            }
                                                            else
                                                            {
                                                                v113 -= 7;
                                                                v3 = &v33;
                                                                idx1 = 6;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            v3 = &v34;
                                                            idx1 = v113;
                                                        }
                                                    }
                                                    v4 = v112;
                                                    v1 = v109;
                                                    v2 = v111;
                                                    v0 = v110;
                                                    ptr1 = sub_c138e4();
                                                    *(unsigned long long *)&ptr1->padding_0[1232] = 0;
                                                    ptr1->field_532 = 0;
                                                    v118 = ~idx1 + *(short *)(k + 1330);
                                                    ptr1->field_532 = v118;
                                                    v119 = k + 1240;
                                                    v120 = k + (unsigned int)idx1 * 112;
                                                    v10 = v119[idx1];
                                                    v11 = v120->field_0;
                                                    v9 = v120->field_8;
                                                    v5 = v120->field_10;
                                                    v43 = *(int128_t *)((char *)&v120->field_28 + 8);
                                                    v44 = *(int128_t *)((char *)&v120->field_38 + 8);
                                                    v45 = *(int128_t *)((char *)&v120->field_48 + 8);
                                                    v46 = *(long long *)((char *)&v120->field_58 + 8);
                                                    v41 = *(int128_t *)&(&v120->field_10)[1];
                                                    v42 = *(int128_t *)((char *)&v120->field_18 + 8);
                                                    if (12 <= v118)
                                                    {
                                                        sub_c73bb0(0, v118, 11, &g_efba88);
                                                        __debugbreak();
                                                    }
                                                    v121 = idx1 + 1;
                                                    _memcpy(&ptr1->field_4d8, &v119[v121], v118 * 8);
                                                    _memcpy(ptr1, k + (unsigned int)v121 * 112, v118 * 112);
                                                    *(unsigned short *)(k + 1330) = idx1;
                                                    v37 = v43;
                                                    v38 = v44;
                                                    v39 = v45;
                                                    v40 = v46;
                                                    v122 = ptr1->field_532;
                                                    v123 = v122 + 1;
                                                    v35 = v41;
                                                    v36 = v42;
                                                    if (12 <= v122)
                                                    {
                                                        sub_c73bb0(0);
                                                        __debugbreak();
                                                    }
                                                    if (v114 - idx1 != v123)
                                                    {
                                                        sub_c73c80("assertion failed: src.len() == dst.len()assertion failed: idx < CAPACITY", 40, &g_efba40);
                                                        __debugbreak();
                                                    }
                                                    v6 += 1;
                                                    _memcpy(&ptr1->field_538, k + idx1 * 8 + 1344, v123 * 8);
                                                    index = 0;
                                                    v102 = v5;
                                                    do
                                                    {
                                                        idx2 = (&ptr1->field_538)[index];
                                                        *(st_c13cd8_5 **)(idx2 + 1232) = ptr1;
                                                        *(unsigned short *)(idx2 + 1328) = index;
                                                        v126 = index;
                                                        v127 = v122;
                                                        if (v122 <= index)
                                                        {
                                                            v128 = index;
                                                            v129 = arm64g_calculate_condition(36, v126, v127, 0);
                                                            if (v129 & 1)
                                                                break;
                                                        }
                                                        else
                                                        {
                                                            v128 = index + 1;
                                                            v130 = arm64g_calculate_condition(36, v126, v127, 0);
                                                            if (v130 & 1)
                                                                break;
                                                        }
                                                    } while ((index = v128, v128 <= v122));
                                                    v43 = v37;
                                                    v44 = v38;
                                                    v45 = v39;
                                                    v46 = v40;
                                                    v41 = v35;
                                                    v42 = v36;
                                                    v33 = ptr1;
                                                    v34 = k;
                                                    sub_c13a74(*v3, v113, v4, &v17, v7);
                                                    v29 = v43;
                                                    v30 = v44;
                                                    v31 = v45;
                                                    v32 = v46;
                                                    v26 = v41;
                                                    v28 = v42;
                                                    v131 = v10;
                                                    v106 = v11;
                                                    if (v106 == 2)
                                                    {
                                                        a0->field_28 = a0->field_28 + 1;
                                                        return *(unsigned long long *)&v41;
                                                    }
                                                    v22 = v29;
                                                    v23 = v30;
                                                    v24 = v31;
                                                    v64 = v26;
                                                    v20 = v64;
                                                    v65 = v34;
                                                    v7 = v33;
                                                    v107 = v9;
                                                    v17 = v106;
                                                    v18 = v107;
                                                    v19 = v102;
                                                    v25 = v32;
                                                    v109 = v102;
                                                    v21 = v28;
                                                    v110 = v107;
                                                    v111 = v106;
                                                    v112 = v131;
                                                    k = (long long)v65[1232];
                                                } while (k);
                                            }
                                            else
                                            {
                                                v6 = 0;
                                                v131 = v10;
                                            }
                                            v132 = a0->field_18;
                                            if (!v132)
                                            {
                                                sub_c73c64(&g_efba58);
                                                __debugbreak();
                                            }
                                            v133 = a0->field_20;
                                            v134 = sub_c138e4();
                                            *(unsigned long long *)&v134[1232] = 0;
                                            *(unsigned short *)&v134[1330] = 0;
                                            *(void* *)&v134[1336] = v132;
                                            v135 = arm64g_calculate_condition(0x22, v133, 1, 0);
                                            if (v135 & 1)
                                            {
                                                sub_c73c64(&g_efba10);
                                                __debugbreak();
                                            }
                                            *(void* *)&v132[1232] = v134;
                                            *(unsigned short *)&v132[1328] = 0;
                                            a0->field_18 = v134;
                                            a0->field_20 = v133 + 1;
                                            if (v6 == v133)
                                            {
                                                *(unsigned short *)&v134[1330] = 1;
                                                *(unsigned long *)&v134[1240] = v131;
                                                *(unsigned long *)v134 = v106;
                                                *(unsigned long *)&v134[8] = v107;
                                                *(unsigned long *)&v134[16] = v102;
                                                *(uint128_t *)&v134[56] = v22;
                                                *(uint128_t *)&v134[72] = v23;
                                                *(uint128_t *)&v134[88] = v24;
                                                *(unsigned long *)&v134[104] = v25;
                                                *(uint128_t *)&v134[24] = v20;
                                                *(uint128_t *)&v134[40] = v21;
                                                *(st_c13cd8_0 **)&v134[1344] = v7;
                                                v7->field_4d0 = v134;
                                                *(unsigned short *)&v7[1].padding_0[88] = 1;
                                                a0->field_28 = a0->field_28 + 1;
                                                return *(unsigned long long *)&v21;
                                            }
                                            sub_c73c80("assertion failed: edge.height == self.height - 1Hash table capacity overflow", 48, &g_efbaa0);
                                            __debugbreak();
                                        }
LABEL_c13f3d:
                                        idx = 4;
                                        goto LABEL_c13f40;
                                    }
LABEL_c13f39:
                                    v95 = v69;
                                    v96 = arm64g_calculate_condition(52, v82, 5, 0);
                                    if (!(v96 & 1))
                                        goto LABEL_c13f3e;
                                    goto LABEL_c13f3d;
                                }
LABEL_c13f35:
                                v92 = 0;
                                v93 = arm64g_calculate_condition(52, v82, 5, 0);
                                if (!(v93 & 1))
                                    goto LABEL_c13f3a;
                                goto LABEL_c13f39;
                            }
LABEL_c13f31:
                            idx = v69;
                            v90 = arm64g_calculate_condition(52, v82, 5, 0);
                            if (!(v90 & 1))
                                goto LABEL_c13f36;
                            goto LABEL_c13f35;
                        }
                    }
                    v86 = v69;
                    v87 = arm64g_calculate_condition(4, v82, 5, 0);
                    if (!(v87 & 1))
                        goto LABEL_c13f32;
                    goto LABEL_c13f31;
                }
            }
        }
        else if (a0->field_28 && (v52 = a0->field_18, a0->field_18))
        {
            v53 = a0->field_20;
            while (1)
            {
                v54 = v52 + 1240;
                v55 = (short)v52[1330];
                v56 = v55 * 8;
                v57 = 0xffffffffffffffff;
                do
                {
                    if (!v56)
                        goto LABEL_c13dac;
                    if (*v54 <= v49)
                        v59 = v49 > *v54;
                    else
                        v59 = 0xff;
                    v57 += 1;
                    v56 -= 8;
                    i = v59;
                    v54 += 1;
                } while (i == 1);
                v55 = v57;
                if (!i)
                    break;
LABEL_c13dac:
                if (!v53)
                    goto LABEL_c13e2c;
                v52 = *(long long *)((char *)v52 + 8 * v55 + 1336);
                v53 -= 1;
            }
        }
        else
        {
LABEL_c13e2c:
            if (v50 == a0->field_0)
                sub_c13be0(a0);
            v61 = a0->field_8 + 112 * v50;
            v62 = (int128_t)a1[80];
            v61[4] = (int128_t)a1[64];
            v61[5] = v62;
            v61[6] = (int128_t)a1[96];
            v63 = (int128_t)a1[16];
            *v61 = *(int128_t *)a1;
            v61[1] = v63;
            v64 = (int128_t)a1[48];
            v61[2] = (int128_t)a1[32];
            v61[3] = v64;
            a0->field_10 = v49;
            return *(unsigned long long *)&v64;
        }
    }
    if (*(long long *)a1)
        sub_c13a2c((long long)a1[8], (long long)a1[16], 8, 16);
    return *(unsigned long long *)&v64;
}
