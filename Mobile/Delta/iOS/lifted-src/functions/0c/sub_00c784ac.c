/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc784ac..0xc790c8 (3100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c784ac_0 {
    char padding_0[1330];
    unsigned short field_532;
} st_c784ac_0;

typedef struct st_c784ac_7 {
    uint128_t field_0;
} st_c784ac_7;

typedef struct st_c784ac_5 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[176];
    unsigned long long field_d0;
    char padding_d8[8];
    unsigned long long field_e0;
    char padding_e8[40];
    char field_110;
} st_c784ac_5;

typedef struct st_c784ac_9 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_c784ac_0 *field_18;
    unsigned long long field_20;
} st_c784ac_9;

typedef struct st_c784ac_3 {
    char padding_0[40];
    struct st_c784ac_4 *field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[8];
    unsigned int field_48;
    char padding_4c[292];
    struct st_c784ac_2 *field_170;
    char padding_178[32];
    unsigned long long field_198;
    char padding_1a0[8];
    unsigned long long field_1a8;
} st_c784ac_3;

typedef struct st_c784ac_2 {
    char padding_0[16];
    char field_10;
    char padding_11[7];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_c784ac_0 *field_28;
    unsigned long long field_30;
} st_c784ac_2;

typedef struct st_c784ac_8 {
    unsigned int field_0;
    unsigned short field_4;
    char field_6;
    char field_7;
} st_c784ac_8;

typedef struct st_c784ac_10 {
    char padding_0[82];
    unsigned short field_52;
} st_c784ac_10;

typedef struct st_c784ac_6 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_c784ac_7 *field_10;
    char padding_18[80];
    unsigned short field_68;
} st_c784ac_6;

typedef struct st_c784ac_4 {
    char field_0;
} st_c784ac_4;

extern long long g_efbab8;
extern long long g_efce78;

unsigned long long * sub_c784ac(unsigned long long *a0, st_c784ac_5 *a1, st_c784ac_3 *a2)
{
    unsigned long v57;  // x9
    unsigned long long v58;  // x25
    unsigned long long v67;  // 4161
    unsigned int v68;  // w8
    unsigned long long v69;  // w21
    unsigned long long v70;  // w8
    unsigned long long v71;  // x8
    unsigned long long v72;  // x8
    unsigned long long v73;  // 4120
    unsigned long long ptr;  // x21
    unsigned long long v75;  // w10
    char *v76;  // x11
    unsigned long long v59;  // x22
    unsigned long long v77;  // x13
    unsigned long v78;  // x12
    char *v79;  // x13
    unsigned long v80;  // x14
    unsigned long long v81;  // 4118
    st_c784ac_9 *v82;  // x10
    unsigned long v83;  // x9
    st_c784ac_6 *v84;  // x9
    st_c784ac_0 *v85;  // x9
    unsigned long v86;  // x10
    unsigned long v60;  // x26
    st_c784ac_10 *v87;  // x12
    unsigned long v88;  // x13
    unsigned long long v89;  // x14
    unsigned long long v90;  // x11
    char v92;  // x15
    unsigned int i;  // w15
    uint128_t *iter;  // x21
    unsigned long long v95;  // x4
    unsigned long long v96;  // x24
    unsigned long long v61;  // x28
    unsigned long long v97;  // x25
    unsigned long long v98;  // w8
    unsigned long long v99;  // x10
    unsigned long long v100;  // x8
    unsigned long long v101;  // x9
    void* v102;  // x8
    unsigned long long v103;  // w27
    unsigned long long v104;  // w11
    unsigned long v105;  // x8
    unsigned long long v106;  // x8
    unsigned long long v62;  // x27
    unsigned long long v107;  // x10
    unsigned long long v108;  // x8
    unsigned long long v109;  // x9
    unsigned long long v110;  // w11
    unsigned long long v111;  // x8
    unsigned long long v112;  // x9
    st_c784ac_8 *v113;  // x8
    unsigned long long v114;  // x8
    unsigned long long v116;  // x24
    unsigned long long v63;  // x8
    unsigned long long v117;  // x27
    unsigned long long v118;  // x9
    unsigned long long *v119;  // x8
    unsigned int v120;  // w9
    unsigned long long v121;  // x21
    unsigned long long *v122;  // x8
    unsigned long long idx;  // x8
    unsigned long v124;  // x8
    unsigned long long v125;  // x0
    unsigned long long v126;  // x8
    unsigned long long v64;  // x20
    unsigned long v127;  // x11
    unsigned long long index;  // x12
    unsigned long v129;  // x10
    unsigned long v130;  // x11
    unsigned long long v131;  // x12
    void* v132;  // x13
    unsigned long long v133;  // x12
    unsigned long long v134;  // x8
    unsigned long long v135;  // x9
    unsigned long long ptr1;  // x20
    unsigned long long v65;  // x23
    unsigned long long v137;  // x21
    unsigned long long v138;  // x23
    unsigned long long v139;  // x24
    unsigned long long v140;  // x8
    unsigned long v141;  // x24
    unsigned long long v142;  // x22
    unsigned long long v66;  // 4159
    unsigned long long v0;  // [bp-0x208]
    unsigned long long v1;  // [bp-0x208]
    unsigned long long v2;  // [bp-0x200]
    unsigned long long v3;  // [bp-0x1f8]
    unsigned long long v4;  // [bp-0x1f8]
    unsigned long long v5;  // [bp-0x1ec]
    unsigned long long v6;  // [bp-0x1e8]
    unsigned long long v7;  // [bp-0x1e0]
    unsigned long long v8;  // [bp-0x1d8]
    unsigned long long v9;  // [bp-0x1d8]
    unsigned long long v10;  // [bp-0x1d0]
    unsigned long long v11;  // [bp-0x1c8]
    unsigned long long v12;  // [bp-0x1c0]
    unsigned long long v13;  // [bp-0x1c0]
    unsigned long long v14;  // [bp-0x1b8]
    unsigned long v15;  // [bp-0x1b0]
    unsigned int v16;  // [bp-0x1a4]
    unsigned long long v17;  // [bp-0x1a0]
    unsigned long long v18;  // [bp-0x198]
    unsigned long long *v19;  // [bp-0x190]
    unsigned long long v20;  // [bp-0x188]
    unsigned long long v21;  // [bp-0x180]
    unsigned long long v22;  // [bp-0x178]
    unsigned long long v23;  // [bp-0x170]
    unsigned long long v24;  // [bp-0x168]
    unsigned long long v25;  // [bp-0x160]
    unsigned long long v26;  // [bp-0x158]
    unsigned long long v27;  // [bp-0x14c]
    unsigned long long v28;  // [bp-0x148]
    unsigned long long v29;  // [bp-0x140]
    unsigned long long v30;  // [bp-0x138]
    unsigned long long v31;  // [bp-0x130]
    unsigned long long v32;  // [bp-0x128]
    unsigned long long v33;  // [bp-0x120]
    unsigned long long v34;  // [bp-0x118]
    unsigned long long v35;  // [bp-0x110]
    char *v36;  // [bp-0x108]
    unsigned long v37;  // [bp-0x100]
    st_c784ac_9 *v38;  // [bp-0xf0]
    unsigned long long node;  // [bp-0xe8]
    uint128_t v40;  // [bp-0xe0], Other Possible Types: unsigned long long *, char, unsigned long
    unsigned long long v41;  // [bp-0xe0]
    uint128_t v42;  // [bp-0xe0]
    uint128_t v43;  // [bp-0xe0]
    unsigned long v44;  // [bp-0xd8], Other Possible Types: unsigned long long
    uint128_t v45;  // [bp-0xd0], Other Possible Types: unsigned long long
    uint128_t v46;  // [bp-0xd0]
    unsigned long long v47;  // [bp-0xc8]
    uint128_t v48;  // [bp-0xc0], Other Possible Types: unsigned long long
    uint128_t v49;  // [bp-0xc0]
    uint128_t v50;  // [bp-0xb0]
    uint128_t v51;  // [bp-0xb0]
    unsigned long long v52;  // [bp-0xa0]
    uint128_t v53;  // [bp-0x90]
    unsigned long long v54;  // [bp-0x80]
    char *v55;  // [bp-0x10]
    char v56;  // [bp+0x0]

    v55 = &v56;
    v30 = 0;
    v31 = 8;
    v32 = 0;
    v33 = 0;
    v34 = 8;
    v35 = 0;
    v57 = a2->field_30;
    v36 = a2->field_28;
    v37 = v57;
    v38 = &a2->field_170->field_10;
    node = 0;
    if (v57)
    {
        v58 = 0;
        v59 = 0;
        v60 = a2->field_48;
        v61 = *(long long *)&a2[1].padding_0[8];
        v62 = a1->field_e0;
        v26 = *(long long *)&a1->padding_e8[0];
        v23 = *(long long *)&a1->padding_e8[0] - v61;
        v24 = v62 + v61;
        if (a1->field_110 & 0x50000 > (unsigned int)v60)
            v63 = v61;
        else
            v63 = 0;
        v25 = v63;
        v64 = a2->field_1a8;
        v21 = a1->field_10;
        v22 = (v60 * 0x100000000000000 | v60 >> 8) & 0xff000000000000ff & 0xff;
        v28 = a1->field_10 + v64;
        v29 = a1->field_18;
        v65 = v60 & 0xff;
        v66 = ((v60 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc;
        v67 = (((v60 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v60 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2;
        v68 = ((((((((v67 | v66) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v67 | v66) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v67 | v66) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v67 | v66) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((((v67 | v66) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v67 | v66) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v67 | v66) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v67 | v66) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        if (!(v68 * 0x100000000))
            v69 = 32;
        else
            v69 = (unsigned int)Clz(v68 * 0x100000000);
        v70 = (unsigned int)v60 >> 16;
        v16 = v70 > 4;
        v71 = 16;
        if (4 >= v70)
            v71 = 0;
        v18 = v71;
        v19 = &a1->field_d0;
        v72 = 24;
        v20 = 8;
        v73 = arm64g_calculate_condition(131, v70, 4, 0);
        if (!(v73 & 1))
            v72 = 8;
        v17 = v72;
        v15 = a2->field_198;
        v27 = v69;
        while (1)
        {
            ptr = 0;
            v75 = 0;
            v76 = v36;
            if (*((char *)&a2->field_48 + 1) == 8)
                v77 = 12;
            else
                v77 = 4;
            v78 = v57 - 1;
            v79 = v76 + 1;
            while (1)
            {
                v80 = *(v79 - 1);
                if (v75 == 63 && 1 < (unsigned int)v80)
                {
                    v65 = 0;
                    v103 = 6;
                    goto LABEL_c78d04;
                }
                ptr |= (v80 & 127) << ((char)v75 & 63);
                if (!(v80 >> 7 & 1))
                    break;
                v79 += 1;
                v75 += 7;
                v78 -= 1;
                v81 = arm64g_calculate_condition(18, v78, 1, 0);
                if (!(v81 & 1))
                {
                    ptr = &v76[v57];
                    goto LABEL_c78d00;
                }
            }
            v36 = v79;
            v37 = v78;
            if (!ptr)
            {
                node -= 1;
                goto LABEL_c78adc;
            }
            v82 = v38;
            v83 = ptr - 1;
            if (v82->field_10 > v83)
            {
                v84 = v82->field_8 + 112 * v83;
                if (v84[1].padding_0[0] != 1)
                    goto LABEL_c78664;
            }
            else
            {
                v85 = v82->field_18;
                if (v82->field_18)
                {
                    v86 = v82->field_20;
                }
                else
                {
LABEL_c78dd0:
                    v65 = 0;
                    v103 = 18;
                    goto LABEL_c78d04;
                }
                while (1)
                {
                    v87 = &v85->padding_0[1240];
                    v88 = v85->field_532;
                    v89 = v88 * 8;
                    v90 = 0xffffffffffffffff;
                    do
                    {
                        if (!v89)
                        {
                            v90 = v88;
                            goto LABEL_c78704;
                        }
                        if ((unsigned long long)*(long long *)&v87->padding_0[0] <= ptr)
                            v92 = ptr > (unsigned long long)*(long long *)&v87->padding_0[0];
                        else
                            v92 = 0xff;
                        v90 += 1;
                        v89 -= 8;
                        i = v92;
                        v87 = &v87->padding_0[8];
                    } while (i == 1);
                    if (!i)
                        break;
LABEL_c78704:
                    if (!v86)
                        goto LABEL_c78dd0;
                    v85 = *(long long *)&v85[1].padding_0[4 + 8 * v90];
                    v86 -= 1;
                }
                v84 = &v85->padding_0[112 * v90];
                if (v84[1].padding_0[0] != 1)
                    goto LABEL_c78664;
            }
            node += 1;
LABEL_c78664:
            if (v84->field_68 != 46)
            {
                if (v84->padding_0 != 1 && 5 < v84->field_8)
                {
                    sub_c73bb0(0, v84->field_8, 5, &g_efbab8);
                    __debugbreak();
                }
                sub_c50e7c(&v40, &v36, a2->field_48);
                if (*&v40 != 82)
                {
                    v124 = v40;
                    ptr = v44;
LABEL_c78dc4:
                    v103 = (unsigned int)v124 & 0xff;
                    v65 = v124 >> 8;
                    goto LABEL_c78d04;
                }
                goto LABEL_c78adc;
            }
            v6 = &v76[a2->field_38 + v77] - &a2->field_28[a2->field_30];
            v11 = v58;
            if (v84->padding_0 == 1)
            {
                iter = v84->field_10;
                v95 = *(long long *)&v84->padding_18[0];
                v96 = v8;
                if (!v95)
                    goto LABEL_c78aa8;
            }
            else
            {
                v95 = v84->field_8;
                v96 = v8;
                if (6 <= v95)
                {
                    sub_c73bb0(0, v95, 5, &g_efbab8);
                    __debugbreak();
                }
                iter = &v84->field_10;
                if (!v95)
                {
LABEL_c78aa8:
                    v58 = v11;
                    goto LABEL_c78adc;
                }
            }
            v10 = 0;
            v5 = 0;
            v14 = 0;
            v97 = v95 * 16;
            v13 = v12;
            v1 = v0;
            v4 = v3;
            while (1)
            {
                v58 = v97;
                v53 = *iter;
                sub_c4cbcc(&v40, &v36, a2->field_48, &v53);
                if (v40 == 46)
                {
                    v124 = v44;
                    ptr = *(unsigned long long *)&v45;
                    goto LABEL_c78dc4;
                }
                switch (v98)
                {
                case 85:
                    sub_c4eda0(&v53, &v40);
                    if (*(unsigned long long *)&v53 == 22)
                    {
                        v14 = 1;
                        v13 = *(unsigned long long *)((void*)&v53 + 8) + v25;
                        goto LABEL_c78754;
                    }
                    if (*(unsigned long long *)&v53 != 24)
                    {
                        v14 = 0;
                        goto LABEL_c78754;
                    }
                    if (v26 < v61)
                    {
                        ptr = v62;
                        goto LABEL_c78d00;
                    }
                    v111 = v22 * *(unsigned long long *)((void*)&v53 + 8);
                    v112 = v23 - v111;
                    if (v23 < v111)
                    {
                        ptr = v24;
                        goto LABEL_c78d00;
                    }
                    v113 = v24 + v111;
                    if ((char)((unsigned int)v60 >> 8) == 8)
                    {
                        if (v112 <= 7)
                            goto LABEL_c78f2c;
                        v114 = v113->field_7 * 0x100000000000000 | (v113->field_0 * 0x100 | (v113->field_4 | v113->field_6 * 0x10000) * 0x10000000000) >> 8;
                    }
                    else if (v112 > 3)
                    {
                        v114 = v113->field_0;
                    }
                    else
                    {
LABEL_c78f2c:
                        ptr = v113;
                        v65 = 0;
LABEL_c78d00:
                        v103 = 19;
                        goto LABEL_c78d04;
                    }
                    v14 = 1;
                    v13 = v114 + v61;
                    goto LABEL_c78754;
                case 18:
                    sub_c4eda0(&v53, &v40);
                    switch (v106)
                    {
                    case 0:
                        *(unsigned int *)&v10 = 1;
                        v96 = *(unsigned long long *)((void*)&v53 + 8);
                        goto LABEL_c78754;
                    case 7:
                        v5 = 1;
                        v2 = *(unsigned long long *)((void*)&v53 + 8);
                        goto LABEL_c78754;
                    case 12:
                        if (v29 < v64)
                            goto LABEL_c78ed0;
                        v107 = v65 * *(unsigned long long *)((void*)&v53 + 8);
                        v108 = v29 - v64;
                        v109 = v108 - v107;
                        if (v108 < v107)
                        {
LABEL_c78ee8:
                            v65 = 0;
                            v103 = 19;
                            ptr = v28;
                            goto LABEL_c78d04;
                        }
                        if ((((unsigned int)v60 ^ (unsigned int)v60 - 1 & 0xff) & 0xff) <= ((unsigned int)v60 - 1 & 0xff))
                        {
                            v103 = 25;
                            ptr = v1;
                            goto LABEL_c78d04;
                        }
                        v102 = v28 + v107;
                        v103 = 25;
                        v110 = v27;
                        if (1 >= v110)
                        {
                            if (!v110)
                            {
                                if (v29 - v64 != v107)
                                {
                                    *(unsigned int *)&v10 = 1;
                                    v1 = *(char *)v102;
                                    goto LABEL_c78754;
                                }
                                goto LABEL_c78ef8;
                            }
                            else if (v110 == 1)
                            {
                                if (v109 > 1)
                                {
                                    *(unsigned int *)&v10 = 1;
                                    v1 = *(short *)v102;
                                    goto LABEL_c78754;
                                }
                                goto LABEL_c78ef8;
                            }
                        }
                        else
                        {
                            if (v110 == 2)
                            {
                                if (v109 > 3)
                                {
                                    *(unsigned int *)&v10 = 1;
                                    v1 = *(int *)v102;
                                    goto LABEL_c78754;
                                }
LABEL_c78ef8:
                                v65 = 0;
                                v103 = 19;
                                ptr = v102;
                                goto LABEL_c78d04;
                            }
                            else if (v110 == 3)
                            {
                                if (v109 > 7)
                                {
                                    *(unsigned int *)&v10 = 1;
                                    v1 = (char)v102[7] * 0x100000000000000 | (*(int *)v102 * 0x100 | ((short)v102[4] | (char)v102[6] * 0x10000) * 0x10000000000) >> 8;
                                    goto LABEL_c78754;
                                }
                                goto LABEL_c78ef8;
                            }
                        }
                        ptr = v1;
                        goto LABEL_c78d04;
                    default:
LABEL_c78754:
                        iter += 1;
                        v97 = v58 - 16;
                        if (v58 == 16)
                            goto LABEL_c78af0;
                        break;
                    }
                    break;
                case 17:
                    sub_c4eda0(&v53, &v40);
                    if (!*(unsigned long long *)&v53)
                    {
                        *(unsigned int *)((char *)&v10 + 4) = 1;
                        v7 = *(unsigned long long *)((void*)&v53 + 8);
                        goto LABEL_c78754;
                    }
                    if (*(unsigned long long *)&v53 != 12)
                        goto LABEL_c78754;
                    if (v29 < v64)
                        goto LABEL_c78ed0;
                    v99 = v65 * *(unsigned long long *)((void*)&v53 + 8);
                    v100 = v29 - v64;
                    v101 = v100 - v99;
                    if (v100 < v99)
                        goto LABEL_c78ee8;
                    if ((((unsigned int)v60 ^ (unsigned int)v60 - 1 & 0xff) & 0xff) <= ((unsigned int)v60 - 1 & 0xff))
                    {
                        v103 = 25;
                        ptr = v4;
                        goto LABEL_c78d04;
                    }
                    v102 = v28 + v99;
                    v103 = 25;
                    v104 = v27;
                    if (1 >= v104)
                    {
                        if (!v104)
                        {
                            if (v29 - v64 != v99)
                            {
                                v105 = *(char *)v102;
                                *(unsigned int *)((char *)&v10 + 4) = 1;
                                v4 = v105;
                                v7 = v105;
                                goto LABEL_c78754;
                            }
                            goto LABEL_c78ef8;
                        }
                        else if (v104 == 1)
                        {
                            if (v101 > 1)
                            {
                                v105 = *(short *)v102;
                                *(unsigned int *)((char *)&v10 + 4) = 1;
                                v4 = v105;
                                v7 = v105;
                                goto LABEL_c78754;
                            }
                            goto LABEL_c78ef8;
                        }
                    }
                    else
                    {
                        if (v104 == 2)
                        {
                            if (v101 > 3)
                            {
                                v105 = *(int *)v102;
                                *(unsigned int *)((char *)&v10 + 4) = 1;
                                v4 = v105;
                                v7 = v105;
                                goto LABEL_c78754;
                            }
                            goto LABEL_c78ef8;
                        }
                        else if (v104 == 3)
                        {
                            if (v101 > 7)
                            {
                                v105 = (char)v102[7] * 0x100000000000000 | (*(int *)v102 * 0x100 | ((short)v102[4] | (char)v102[6] * 0x10000) * 0x10000000000) >> 8;
                                *(unsigned int *)((char *)&v10 + 4) = 1;
                                v4 = v105;
                                v7 = v105;
                                goto LABEL_c78754;
                            }
                            goto LABEL_c78ef8;
                        }
                    }
                    ptr = v4;
                    goto LABEL_c78d04;
                default:
LABEL_c78754:
                    iter += 1;
                    v97 = v58 - 16;
                    if (v58 != 16)
                        continue;
LABEL_c78af0:
                    v9 = v96;
                    v58 = v11;
                    if (!(v14 & 1))
                    {
                        v120 = *(unsigned int *)((void*)&v10 + 4);
                        v116 = v6;
                        if (v120 & 1 & (unsigned int)v10 & 1)
                        {
                            v121 = v9;
                            if (v121 <= v7)
                                goto LABEL_c78adc;
                            if (v58 == v33)
                            {
                                sub_c6c3c4(&v33);
                                v20 = v34;
                                v121 = v9;
                            }
                        }
                        else
                        {
                            if (!(v120 & 1 & v5 & 1) || !(v121 = v7 + v2, v121 > v7))
                                goto LABEL_c78adc;
                            if (v58 == v33)
                            {
                                sub_c6c3c4(&v33);
                                v20 = v34;
                            }
                        }
                        v122 = v20 + 24 * v58;
                        *v122 = v7;
                        v122[1] = v121;
                        v122[2] = v59;
                        v58 += 1;
                        v35 = v58;
                        v42 = v40;
                        v46 = v45;
                        v48 = v49;
                        v51 = v50;
                        goto LABEL_c78c8c;
                    }
                    ptr = *(long long *)((char *)v19 + v18);
                    v116 = v6;
                    if ((unsigned long long)*(long long *)((char *)v19 + v17) >= v13)
                    {
                        v14 = v62;
                        v117 = 0;
                        v41 = v21;
                        v42 = _INSERT(CONCAT(v41, 0), 8, v29);
                        v46 = CONCAT(v64, v15);
                        v48 = CONCAT(*(long long *)((char *)v19 + v17) - v13, ptr + v13);
                        v51 = _INSERT(v50, 0, v60);
                        *((char *)&v51 + 4) = v16;
                        goto LABEL_c78b50;
                    }
                    else
                    {
                        v134 = 0;
                        v135 = 0;
                        v103 = 19;
                        goto LABEL_c79008;
                    }
                }
            }
            while (1)
            {
LABEL_c78b50:
                sub_c51370(&v53, &v42);
                if (!*(unsigned long long *)&v53)
                    break;
                v58 = *(unsigned long long *)((void*)&v53 + 8);
                ptr = v54;
                if (*(unsigned long long *)&v53 == 2)
                {
                    v103 = (unsigned int)v58 & 0xff;
                    if (v103 == 82)
                    {
                        if (v58 >> 8 & 1)
                            goto LABEL_c78c84;
                        goto LABEL_c78c74;
                    }
                    else
                    {
                        v135 = (char)(v58 >> 8);
                        v134 = v58 >> 16;
LABEL_c79008:
                        v65 = v135 | v134 * 0x100;
                    }
                    while (1)
                    {
LABEL_c78d04:
                        if (v33)
                            _free(v34);
                        if (v59)
                        {
                            v141 = v31 + 16;
                            do
                            {
                                v142 = v59;
                                if (*(long long *)(v141 - 16) && *(long long *)(v141 - 8))
                                {
                                    if (*(long long *)v141)
                                        _free();
                                    if (*(long long *)(v141 + 16))
                                        _free(*(long long *)(v141 + 8));
                                }
                            } while ((v141 += 72, v59 = v142 - 1, v142 != 1));
                        }
                        if (v30)
                            _free(v31);
                        ptr1 = 0;
                        v140 = v103 | v65 * 0x100;
                        if (*a0 != 1)
                            break;
LABEL_c78ea0:
                        v40 = a0 + 1;
                        v44 = ptr1;
                        v45 = v140;
                        v47 = ptr;
                        v48 = v58;
                        sub_c52368(&v40);
                        sub_c73b38("reentrant initInvalid archive member sizeInvalid archive extended name offsetInvalid archive extended name lengthInvalid archive terminatorInvalid archive member headera formatting trait implementation returned an error when the underlying stream did notinternal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 29, &g_efce78);
LABEL_c78ed0:
                        v65 = 0;
                        v103 = 19;
                        ptr = v21;
                    }
                }
                else if (ptr > v58)
                {
                    if (v11 == v33)
                    {
                        sub_c6c3c4(&v33);
                        v20 = v34;
                    }
                    v118 = v11;
                    v119 = v20 + 24 * v118;
                    *v119 = v58;
                    v119[1] = ptr;
                    v119[2] = v59;
                    v11 = v118 + 1;
                    v35 = v11;
                    v117 = 1;
                }
            }
            if (!(v117 & 1))
            {
LABEL_c78c74:
                v58 = v11;
                v62 = v14;
            }
            else
            {
LABEL_c78c84:
                v58 = v11;
                v62 = v14;
LABEL_c78c8c:
                v52 = v116;
                v43 = _INSERT(CONCAT((unsigned long long)v42, 0), 0, 0);
                if (v59 == v30)
                    sub_c73a20(&v30);
                idx = v31 + 72 * v59;
                *(uint128_t *)(idx + 16) = v46;
                *(uint128_t *)(idx + 32) = v48;
                *(uint128_t *)(idx + 48) = v51;
                *(unsigned long long *)(idx + 64) = v52;
                *(uint128_t *)idx = v43;
                v59 += 1;
                v32 = v59;
            }
LABEL_c78adc:
            v57 = v37;
            if (!v57 && 2 <= v58)
            {
                v125 = v34;
                if (21 > v58)
                {
                    v126 = 0;
                    v127 = v125 + 24;
                    index = v125;
                    do
                    {
                        v129 = v127;
                        v130 = *(long long *)(index + 24);
                        if ((unsigned long long)*(long long *)index > v130)
                        {
                            v40 = *(int128_t *)(index + 32);
                            v131 = v126;
                            do
                            {
                                v132 = v125 + v131;
                                *(int128_t *)&v132[24] = *(int128_t *)v132;
                                *(long long *)&v132[40] = (long long)v132[16];
                                if (!v131)
                                {
                                    v133 = v125;
                                    goto LABEL_c78f8c;
                                }
                            } while ((v131 -= 24, v130 < (unsigned long long)*(long long *)((char *)v132 - 24)));
                            v133 = v125 + v131 + 24;
LABEL_c78f8c:
                            *(unsigned long *)v133 = v130;
                            *(uint128_t *)(v133 + 8) = v40;
                        }
                    } while ((v127 = v129 + 24, v126 += 24, index = v129, v127 != v125 + v58 * 24));
                }
                else
                {
                    sub_c52154(v125, v58);
                    break;
                }
            }
        }
    }
    ptr1 = v31;
    v59 = v32;
    if (v30 > v59)
    {
        if (v59)
        {
            v137 = v59 * 72;
            ptr1 = _realloc(ptr1, v137);
            if (!ptr1)
            {
                sub_c6b970(8, v137);
                __debugbreak();
            }
        }
        else
        {
            _free(ptr1);
            ptr1 = 8;
            v138 = v34;
            v58 = v35;
            if (v58 < v33)
                goto LABEL_c78e24;
LABEL_c78e70:
            ptr = v138;
LABEL_c78e84:
            v140 = (unsigned int)v59 & 0xff | (v59 >> 8) * 0x100;
            if (*a0 == 1)
                goto LABEL_c78ea0;
            *a0 = 1;
            a0[1] = ptr1;
            a0[2] = v140;
            a0[3] = ptr;
            a0[4] = v58;
            return a0 + 1;
        }
    }
    v138 = v34;
    v58 = v35;
    if (v33 <= v58)
        goto LABEL_c78e70;
LABEL_c78e24:
    if (v58)
    {
        v139 = v58 * 24;
        ptr = _realloc(v138, v139);
        if (!ptr)
        {
            sub_c6b970(8, v139);
            __debugbreak();
        }
    }
    else
    {
        _free(v138);
        ptr = 8;
        goto LABEL_c78e84;
    }
    goto LABEL_c78e84;
}
