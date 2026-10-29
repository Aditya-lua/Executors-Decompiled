/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa81754..0xa82420 (3276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a81754_1 {
    char padding_0[8];
    struct st_a81754_0 *field_8;
    char padding_10[8];
    long long field_18;
    char padding_20[32];
    char field_40;
    char padding_41[63];
    char field_80;
    char padding_81[79];
    long long field_d0;
    unsigned long long field_d8;
    long long field_e0;
    unsigned long long field_e8;
    long long field_f0;
    unsigned long long field_f8;
} st_a81754_1;

typedef struct st_a81754_0 {
    char padding_0[12];
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[4];
    unsigned int field_34;
    unsigned int field_38;
    char padding_3c[20];
    unsigned long long field_50;
} st_a81754_0;

extern char g_7fe001;
extern char g_10002b0;

int sub_a81754(st_a81754_1 *a0, int a1, int a2, long long a3, long long a4, unsigned long long n, long long a6, long long a7, unsigned int a8, int a9, int a10, unsigned long a11)
{
    long long n1;  // x19
    st_a81754_1 *v55;  // x24
    unsigned long v64;  // cc_op
    unsigned int v154;  // w14
    int v155;  // w15
    unsigned int v156;  // w11
    int v157;  // x19
    unsigned long long i10;  // x20
    int v159;  // x20
    int v160;  // x19
    int i11;  // x20
    int v162;  // x9
    int v163;  // x17
    unsigned long v65;  // cc_dep1
    int v164;  // x21
    int i12;  // x22
    uint128_t *v166;  // x24
    long long v167;  // x20
    int i21;  // x27
    int i13;  // x10
    int v170;  // w8
    unsigned long v171;  // x11
    int i22;  // x12
    unsigned int v173;  // w13
    unsigned long v66;  // cc_dep2
    int v174;  // w14
    unsigned int v175;  // w13
    int v176;  // w14
    int v177;  // w11
    st_a81754_0 *v178;  // x1
    int i14;  // x9
    uint128_t *v180;  // x10
    int v181;  // q0
    __m128i v182;  // q1
    unsigned long long i23;  // x11
    unsigned long v67;  // 4110
    uint128_t *iter;  // x12
    unsigned long long v185;  // x11
    unsigned int v188;  // w9
    int v189;  // w8
    unsigned long long v68;  // 4108
    int v69;  // x8
    unsigned long v70;  // x26
    unsigned long long v71;  // x20
    unsigned long v72;  // x28
    unsigned long v73;  // x21
    int v56;  // x0
    unsigned long v74;  // x24
    unsigned long v75;  // x27
    unsigned long v76;  // x19
    unsigned long long v77;  // x9
    int v78;  // x0
    long long v79;  // x19
    unsigned long long v80;  // x11
    unsigned long long v81;  // x12
    long long v82;  // x27
    unsigned long long v83;  // x26
    st_a81754_0 *v57;  // x11
    long long v84;  // x9
    uint128_t *v85;  // x8
    long long v86;  // x27
    char *v87;  // x21
    char *v88;  // x22
    long long v89;  // x20
    int v90;  // x22
    int v91;  // x23
    long long v92;  // x21
    long long v93;  // x20
    unsigned long v58;  // cc_op
    unsigned long long i;  // x19
    int v95;  // x19
    long long iter1;  // x20
    int k;  // x21
    long long node;  // x22
    unsigned long long j;  // x19
    int v100;  // x19
    int v101;  // x19
    int v102;  // x0
    unsigned long v103;  // x27
    unsigned long v59;  // cc_dep1
    unsigned long long l;  // x21
    long long v105;  // x20
    unsigned long long iter2;  // x19
    int v107;  // x21
    int v108;  // x19
    int m;  // x20
    int v110;  // x19
    int n;  // x20
    int v112;  // x20
    int i0;  // x21
    unsigned long v60;  // cc_dep2
    int i15;  // x19
    int v115;  // x19
    int v116;  // x19
    int i2;  // x20
    long long v118;  // x22
    long long v119;  // x20
    unsigned long long i3;  // x19
    int v121;  // x19
    long long v122;  // x20
    unsigned long long i4;  // x19
    unsigned long v61;  // cc_ndep
    int v124;  // x19
    int i5;  // x8
    unsigned long v126;  // x9
    unsigned long v127;  // x10
    long long v128;  // x11
    int i16;  // x12
    unsigned int v130;  // w13
    int i6;  // x9
    unsigned long v132;  // x10
    unsigned long v133;  // x11
    long long v62;  // x20
    long long v134;  // x12
    int i17;  // x13
    unsigned int v136;  // w14
    int v137;  // x8
    int v138;  // x20
    int i7;  // x21
    int i18;  // x19
    int i8;  // x11
    int v142;  // w9
    unsigned long v143;  // x12
    unsigned long v63;  // 4110
    int i19;  // x13
    unsigned int v145;  // w14
    int v146;  // w15
    unsigned int v147;  // w14
    int v148;  // w15
    int i9;  // x11
    int v150;  // w10
    unsigned long v151;  // x12
    int i20;  // x13
    unsigned int v153;  // w14
    char *v0;  // [bp-0x6c0]
    long long v1;  // [bp-0x6b8]
    int n2;  // [bp-0x6b0]
    long long v3;  // [bp-0x6a8]
    int v4;  // [bp-0x6a0]
    long long v5;  // [bp-0x698]
    int v6;  // [bp-0x690], Other Possible Types: unsigned long
    long long v7;  // [bp-0x688]
    unsigned long long v8;  // [bp-0x680]
    long long v9;  // [bp-0x678]
    unsigned long v10;  // [bp-0x670]
    int v11;  // [bp-0x668]
    int v12;  // [bp-0x660]
    long long v13;  // [bp-0x658]
    unsigned int v14;  // [bp-0x64c]
    unsigned long long v15;  // [bp-0x648]
    st_a81754_0 *v16;  // [bp-0x640]
    int v17;  // [bp-0x638]
    unsigned long v18;  // [bp-0x630]
    long long v19;  // [bp-0x628]
    long long v20;  // [bp-0x620]
    char *v21;  // [bp-0x618]
    st_a81754_1 *v22;  // [bp-0x610]
    long long v23;  // [bp-0x608]
    char *v24;  // [bp-0x600], Other Possible Types: unsigned long long
    unsigned long v25;  // [bp-0x5f8]
    int v26;  // [bp-0x5f0]
    uint128_t *v27;  // [bp-0x5e8]
    unsigned long long v28;  // [bp-0x5e0]
    char *v29;  // [bp-0x5d8]
    unsigned long long v30;  // [bp-0x5d0]
    unsigned long v31;  // [bp-0x5c8]
    unsigned long long v32;  // [bp-0x5c0]
    unsigned long long v33;  // [bp-0x5b8]
    unsigned long v34;  // [bp-0x5b0]
    int v35;  // [bp-0x5a8]
    unsigned long v36;  // [bp-0x5a0]
    int v37;  // [bp-0x598]
    unsigned long v38;  // [bp-0x590]
    int v39;  // [bp-0x588]
    char v40;  // [bp-0x580]
    char v41;  // [bp-0x180]
    uint128_t v42;  // [bp-0x140]
    uint128_t v43;  // [bp-0x130]
    uint128_t v44;  // [bp-0x120]
    uint128_t v45;  // [bp-0x110]
    char v46;  // [bp-0x100]
    uint128_t v47;  // [bp-0xc0]
    uint128_t v48;  // [bp-0xb0]
    uint128_t v49;  // [bp-0xa0]
    uint128_t v50;  // [bp-0x90]
    unsigned short v51;  // [bp-0x80]
    unsigned long v52;  // [bp-0x78]
    char *v53;  // [bp-0x10]

    v53 = &a8;
    n1 = a3;
    v55 = a0;
    v52 = *(long long *)&g_10002b0;
    v56 = sub_a8002c();
    if (v56)
    {
        if (!a9)
        {
            v56 = 1;
            goto LABEL_a81c14;
        }
        v57 = v55->field_8;
        v58 = 4;
        v59 = v57->field_50;
        v60 = a11;
        v61 = 0;
        if (v57->field_50 > a11)
        {
LABEL_a817c8:
            v56 = 0;
        }
        else
        {
            if (a1)
            {
                v15 = a9;
                v22 = v55;
                v23 = n1;
                v17 = 0;
                v21 = (char *)a2;
                v24 = (char *)a2;
                goto LABEL_a818a4;
            }
            if (a8)
            {
                if (0xff < n)
                    goto LABEL_a817c8;
                v15 = a9;
                v24 = n + 2;
                v62 = v24 + n1;
                if (1025 > (unsigned long long)v62)
                {
                    v56 = (int)&v40;
LABEL_a81850:
                    *(char *)v56 = 0;
                    *(char *)(v56 + 1) = n;
                    _memcpy(v56 + 2, a4, n);
                    _memcpy(v56 + v24, a2, n1);
                    v57 = v55->field_8;
                    n1 = v62;
LABEL_a81884:
                    v22 = v55;
                    v23 = n1;
                    v21 = (char *)a2;
                    if (v56 != &v40)
                    {
                        v63 = arm64g_calculate_condition(v58 | 16, v59, v60, v61);
                        v64 = 4;
                        v65 = (v63 & 1 ? v56 : 0x40000000);
                        v66 = (v63 & 1 ? a2 : 0);
                    }
                    else
                    {
                        v67 = arm64g_calculate_condition(v58 | 16, v59, v60, v61);
                        v64 = 0;
                        v65 = (v67 & 1 ? v56 : 0x40000000);
                        v66 = (v67 & 1 ? a2 : 0);
                    }
                    v24 = (char *)v56;
                    v68 = arm64g_calculate_condition(v64 | 16, v65, v66, 0);
                    if (v68 & 1)
                        v69 = v56;
                    else
                        v69 = 0;
                    v17 = v69;
LABEL_a818a4:
                    v70 = v57->field_20;
                    v71 = v57->field_28;
                    v72 = v57->field_18;
                    v73 = (unsigned int)v70 * 5;
                    v74 = (unsigned int)v71 * 3;
                    v75 = v70 * v71;
                    v14 = v57->field_14;
                    v16 = v57;
                    v76 = v57->field_10;
                    if ((unsigned int)v72 == 0x17400)
                        v77 = 192;
                    else
                        v77 = 128;
                    v18 = v70 * v77;
                    v19 = v18 + (v73 + ((v70 * 2 | v70 >> 63) & 0xfffffffe & 0xffffffff) + v74 + v75) * 0x400;
                    v56 = sub_a6bf4c();
                    v20 = v56;
                    if (v56)
                    {
                        v78 = sub_a3f728();
                        if (v78)
                        {
                            v79 = v20;
                            v10 = v79 + v18;
                            v80 = v70 & 0xffffffff;
                            v81 = v71 & 0xffffffff;
                            v32 = v80;
                            v33 = v81;
                            v31 = v10 + 0x400;
                            v82 = v31 + v75 * 0x400;
                            v83 = v80 * 0x400;
                            v7 = v82 + v83;
                            v38 = v7 + v83;
                            v39 = v80;
                            v6 = v38 + v83;
                            v36 = v6;
                            v37 = v80;
                            v84 = v82 + v73 * 0x400;
                            v34 = v84 + ((v71 * 0x800 | v71 >> 53) & 0x3fffffff800 & 0x3ffffffffff);
                            v35 = v81;
                            v8 = (long long)(v76 * 0x100000000) >> 63 & 0xffffffffc0000000 | __ROL__(v76, 62) & 0xc00000003fffffff & 0x3fffffff;
                            v9 = v84;
                            v85 = v84 + v74 * 0x400;
                            v25 = (char *)v85 + v83;
                            v26 = v81;
                            v11 = v80;
                            v12 = v81;
                            v27 = v85;
                            v28 = v80;
                            v29 = &v41;
                            v30 = v8;
                            v55 = v22;
                            v13 = v78;
                            if (sub_a80ff8())
                            {
                                v5 = v82;
                                v86 = v23;
                                v87 = v24;
                                if (a1)
                                {
                                    v88 = v87;
                                    if (v86 == 64)
                                        goto LABEL_a81a60;
LABEL_a819c8:
                                    v90 = 0;
                                    v91 = v13;
                                }
                                else
                                {
                                    v89 = v13;
                                    if (!sub_a3f7f0(v89, v55->field_18, 0) || !sub_a3fe10(v89, &v55->field_40, 64) || !sub_a3fe10(v89, v87, v86))
                                        goto LABEL_a81b84;
                                    v88 = &v46;
                                    if (!sub_a403bc(v89, &v46, 64))
                                        goto LABEL_a819c8;
LABEL_a81a60:
                                    v89 = v13;
                                    if (sub_a3f7f0(v89, v55->field_18, 0) && sub_a3fe10(v89, &v55->field_80, 32) && sub_a3fe10(v89, a6, a7))
                                    {
                                        v91 = v89;
                                        if (sub_a3fe10(v89, v88, 64) && sub_a403bc(v91, &v42, 64))
                                        {
                                            v0 = v88;
                                            v92 = v9;
                                            _memcpy(v92, v55->field_f0, v55->field_f8 * 0x400);
                                            if (v12)
                                            {
                                                v93 = v92;
                                                i = v12;
                                                do
                                                {
                                                    v95 = i;
                                                    sub_a80d70(v93);
                                                    v93 += 0x400;
                                                    i = v95 - 1;
                                                } while (i);
                                            }
                                            iter1 = v5;
                                            v1 = v6 + v83;
                                            v3 = v92 + v12 * 0x400;
                                            _memcpy(iter1, v55->field_e0, v55->field_e8 * 0x400);
                                            k = v11;
                                            node = v7;
                                            v23 = v86;
                                            if (k)
                                            {
                                                j = k;
                                                do
                                                {
                                                    v100 = j;
                                                    sub_a80d70(iter1);
                                                    iter1 += 0x400;
                                                    j = v100 - 1;
                                                } while (j);
                                                _memcpy(node, v55->field_d0, v55->field_d8 * 0x400);
                                                do
                                                {
                                                    v101 = k;
                                                    sub_a80d70(node);
                                                    node += 0x400;
                                                    k = v101 - 1;
                                                } while (k);
                                            }
                                            else
                                            {
                                                _memcpy(node, v55->field_d0, v55->field_d8 * 0x400);
                                            }
                                            v4 = 0;
                                            v102 = v12;
                                            n2 = v102 * 0x400;
                                            v103 = v14;
                                            v22 = v55;
                                            while (1)
                                            {
                                                v47 = v42;
                                                v48 = v43;
                                                v49 = v44;
                                                v50 = v45;
                                                if (v102)
                                                {
                                                    l = v12;
                                                    v105 = v3;
                                                    iter2 = v4;
                                                    do
                                                    {
                                                        v107 = l;
                                                        v51 = iter2;
                                                        sub_a814c4(v105, &v47, 66, v103, v91, v55->field_18);
                                                        v105 += 0x400;
                                                        iter2 += 1;
                                                        l = v107 - 1;
                                                    } while (l);
                                                }
                                                sub_a66ec0(&v47, 66);
                                                _memcpy(v34, v3, n2);
                                                if (v35)
                                                {
                                                    v108 = 0;
                                                    m = 0;
                                                    do
                                                    {
                                                        sub_a80d70(v34 + v108);
                                                        m += 1;
                                                        v108 += 0x400;
                                                    } while (m < v35);
                                                }
                                                sub_a80bf4(&v31, &v34, &v38);
                                                v86 = v23;
                                                if (v39)
                                                {
                                                    v110 = 0;
                                                    n = 0;
                                                    do
                                                    {
                                                        sub_a80e88(v38 + v110);
                                                        n += 1;
                                                        v110 += 0x400;
                                                    } while (n < v39);
                                                }
                                                if (v37)
                                                {
                                                    v112 = 0;
                                                    i0 = 0;
                                                    do
                                                    {
                                                        i15 = 0;
                                                        do
                                                        {
                                                            *(unsigned int *)(v36 + v112 + i15) = sub_a809e8(*(int *)(v38 + v112 + i15), v72);
                                                            i15 += 4;
                                                        } while (i15 != 0x400);
                                                        i0 += 1;
                                                        v112 += 0x400;
                                                    } while (i0 < v37);
                                                }
                                                v79 = v20;
                                                sub_a7f6b0(&v36, v72, v79, v18);
                                                v91 = v13;
                                                if (sub_a3f7f0(v91, v55->field_18, 0))
                                                {
                                                    v87 = v24;
                                                    if (!sub_a3fe10(v91, v0, 64) || !sub_a3fe10(v91, v79, v18) || !sub_a403bc(v91, &v41, v8) || !sub_a815c8(v10, &v41, v8, v91, v55->field_18, v16->field_c))
                                                        goto LABEL_a823ec;
                                                    sub_a80d70(v10);
                                                    if (v12)
                                                    {
                                                        v115 = 0;
                                                        do
                                                        {
                                                            sub_a80d10(v9 + v115, v10, v34 + v115);
                                                            v115 += 0x400;
                                                        } while (n2 != v115);
                                                    }
                                                    if (v35)
                                                    {
                                                        v116 = 0;
                                                        i2 = 0;
                                                        do
                                                        {
                                                            sub_a80e88(v34 + v116);
                                                            i2 += 1;
                                                            v116 += 0x400;
                                                        } while (i2 < v35);
                                                    }
                                                    if (v11)
                                                    {
                                                        v118 = v1;
                                                        v119 = v5;
                                                        i3 = v11;
                                                        do
                                                        {
                                                            v121 = i3;
                                                            sub_a80d10(v119, v10, v118);
                                                            v118 += 0x400;
                                                            v119 += 0x400;
                                                            i3 = v121 - 1;
                                                        } while (i3);
                                                        v122 = v1;
                                                        i4 = v11;
                                                        do
                                                        {
                                                            v124 = i4;
                                                            sub_a80e88(v122);
                                                            v122 += 0x400;
                                                            i4 = v124 - 1;
                                                        } while (i4);
                                                    }
                                                    v102 = v12;
                                                    if (v102)
                                                    {
                                                        i5 = 0;
                                                        v126 = v34;
                                                        v127 = v25;
                                                        v128 = v3;
                                                        do
                                                        {
                                                            i16 = 0;
                                                            do
                                                            {
                                                                v130 = *(int *)(v126 + i16) + *(int *)(v128 + i16);
                                                                *(unsigned int *)(v127 + i16) = ~((int)(v130 + 0xff801fff & ~v130) >> 31) & v130 + 0xff801fff | (int)(v130 + 0xff801fff & ~v130) >> 31 & v130;
                                                                i16 += 4;
                                                            } while (i16 != 0x400);
                                                            i5 += 1;
                                                            v127 += 0x400;
                                                            v126 += 0x400;
                                                            v128 += 0x400;
                                                        } while (i5 != v102);
                                                    }
                                                    if (v39)
                                                    {
                                                        i6 = 0;
                                                        v132 = v38;
                                                        v133 = v36;
                                                        v134 = v1;
                                                        do
                                                        {
                                                            i17 = 0;
                                                            do
                                                            {
                                                                v136 = (unsigned int)&(&g_7fe001)[*(int *)(v132 + i17) + -1 * *(int *)(v134 + i17)];
                                                                *(unsigned int *)(v133 + i17) = ~((int)(v136 + 0xff801fff & ~v136) >> 31) & v136 + 0xff801fff | (int)(v136 + 0xff801fff & ~v136) >> 31 & v136;
                                                                i17 += 4;
                                                            } while (i17 != 0x400);
                                                            i6 += 1;
                                                            v133 += 0x400;
                                                            v134 += 0x400;
                                                            v132 += 0x400;
                                                        } while (i6 != v39);
                                                    }
                                                    v137 = v37;
                                                    if (v137)
                                                    {
                                                        v138 = 0;
                                                        i7 = 0;
                                                        do
                                                        {
                                                            i18 = 0;
                                                            do
                                                            {
                                                                *(unsigned int *)(v36 + v138 + i18) = sub_a80a2c(*(int *)(v36 + v138 + i18), v72);
                                                                i18 += 4;
                                                            } while (i18 != 0x400);
                                                            i7 += 1;
                                                            v137 = v37;
                                                            v138 += 0x400;
                                                        } while (i7 < v137);
                                                        v87 = v24;
                                                        v102 = v12;
                                                    }
                                                    if (v26)
                                                    {
                                                        i8 = 0;
                                                        v142 = 0;
                                                        v143 = v25;
                                                        do
                                                        {
                                                            i19 = 0;
                                                            do
                                                            {
                                                                v145 = *(int *)(v143 + i19);
                                                                v146 = (int)((unsigned int)(0x3ff000 - v145) | v145) >> 31;
                                                                v147 = ~v146 & v145 | v146 & (unsigned int)&(&g_7fe001)[-1 * v145];
                                                                v148 = (int)((v142 - v147 ^ v147 | v147 ^ v142) ^ v142) >> 31;
                                                                v142 = ~v148 & v142 | v147 & v148;
                                                                i19 += 4;
                                                            } while (i19 != 0x400);
                                                            i8 += 1;
                                                            v143 += 0x400;
                                                        } while (i8 != v26);
                                                    }
                                                    else
                                                    {
                                                        v142 = 0;
                                                    }
                                                    if (v137)
                                                    {
                                                        i9 = 0;
                                                        v150 = 0;
                                                        v151 = v36;
                                                        do
                                                        {
                                                            i20 = 0;
                                                            do
                                                            {
                                                                v153 = *(int *)(v151 + i20);
                                                                v154 = ~((int)(~v153) >> 31) & -v153 | (int)(~v153) >> 31 & v153;
                                                                v155 = (int)((v150 - v154 ^ v154 | v154 ^ v150) ^ v150) >> 31;
                                                                v150 = ~v155 & v150 | v154 & v155;
                                                                i20 += 4;
                                                            } while (i20 != 0x400);
                                                            i9 += 1;
                                                            v151 += 0x400;
                                                        } while (i9 != v137);
                                                    }
                                                    else
                                                    {
                                                        v150 = 0;
                                                    }
                                                    v156 = v16->field_34;
                                                    v103 = v14;
                                                    if (!((int)(~((((unsigned int)(v142 - (v103 - v156)) ^ (unsigned int)(v103 - v156) | (unsigned int)(v103 - v156) ^ v142) ^ v142) & (((unsigned int)(v150 - (v72 - v156)) ^ (unsigned int)(v72 - v156) | (unsigned int)(v72 - v156) ^ v150) ^ v150))) >> 31))
                                                    {
                                                        if (v11)
                                                        {
                                                            v157 = 0;
                                                            i10 = v11;
                                                            do
                                                            {
                                                                v159 = i10;
                                                                sub_a80d10(v7 + v157, v10, v36 + v157);
                                                                v157 += 0x400;
                                                                i10 = v159 - 1;
                                                            } while (i10);
                                                            v137 = v37;
                                                            v102 = v12;
                                                        }
                                                        if (v137)
                                                        {
                                                            v160 = 0;
                                                            i11 = 0;
                                                            do
                                                            {
                                                                sub_a80e88(v36 + v160);
                                                                i11 += 1;
                                                                v162 = v37;
                                                                v160 += 0x400;
                                                            } while (i11 < v162);
                                                            v102 = v12;
                                                        }
                                                        else
                                                        {
                                                            v162 = 0;
                                                        }
                                                        v163 = v28;
                                                        if (v163)
                                                        {
                                                            v164 = 0;
                                                            i12 = 0;
                                                            v166 = v27;
                                                            v167 = v1;
                                                            v6 = v163;
                                                            do
                                                            {
                                                                i21 = 0;
                                                                do
                                                                {
                                                                    *(unsigned int *)((char *)v166 + i21) = sub_a80a88(*(int *)(v36 + v164 + i21), *(int *)(v167 + i21), v72, *(int *)(v38 + v164 + i21));
                                                                    i21 += 4;
                                                                } while (i21 != 0x400);
                                                                i12 += 1;
                                                                v166 += 64;
                                                                v164 += 0x400;
                                                                v167 += 0x400;
                                                                v163 = v6;
                                                            } while (i12 != v163);
                                                            v162 = v37;
                                                            v55 = v22;
                                                            v87 = v24;
                                                            v102 = v12;
                                                            v91 = v13;
                                                        }
                                                        if (v162)
                                                        {
                                                            i13 = 0;
                                                            v170 = 0;
                                                            v171 = v36;
                                                            do
                                                            {
                                                                i22 = 0;
                                                                do
                                                                {
                                                                    v173 = *(int *)(v171 + i22);
                                                                    v174 = (int)((unsigned int)(0x3ff000 - v173) | v173) >> 31;
                                                                    v175 = ~v174 & v173 | v174 & (unsigned int)&(&g_7fe001)[-1 * v173];
                                                                    v176 = (int)((v170 - v175 ^ v175 | v175 ^ v170) ^ v170) >> 31;
                                                                    v170 = ~v176 & v170 | v175 & v176;
                                                                    i22 += 4;
                                                                } while (i22 != 0x400);
                                                                i13 += 1;
                                                                v171 += 0x400;
                                                            } while (i13 != v162);
                                                        }
                                                        else
                                                        {
                                                            v170 = 0;
                                                        }
                                                        v177 = 0;
                                                        if (!v163)
                                                        {
                                                            v178 = v16;
                                                            v103 = v14;
                                                        }
                                                        else
                                                        {
                                                            i14 = 0;
                                                            v180 = v27 + 1;
                                                            v178 = v16;
                                                            v103 = v14;
                                                            do
                                                            {
                                                                v181 = 0;
                                                                v182 = __float_as_int(__int_as_float(v177));
                                                                i23 = 0x100;
                                                                iter = v180;
                                                                do
                                                                {
                                                                    v185 = i23;
                                                                    v182 = _mm_add_epi32(*(int128_t *)((char *)iter - 16), v182);
                                                                    v181 = (int)_mm_add_epi32(*iter, v181);
                                                                    iter += 2;
                                                                    i23 = v185 - 8;
                                                                } while (i23);
                                                                v177 = (unsigned int)__dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v181, v182), _mm_add_epi32(v181, v182)), _mm_unpackhi_epi64(_mm_add_epi32(v181, v182), _mm_add_epi32(v181, v182))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v181, v182), _mm_add_epi32(v181, v182)), _mm_unpackhi_epi64(_mm_add_epi32(v181, v182), _mm_add_epi32(v181, v182)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v181, v182), _mm_add_epi32(v181, v182)), _mm_unpacklo_epi64(_mm_add_epi32(v181, v182), _mm_add_epi32(v181, v182))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v181, v182), _mm_add_epi32(v181, v182)), _mm_unpacklo_epi64(_mm_add_epi32(v181, v182), _mm_add_epi32(v181, v182))))));
                                                                i14 += 1;
                                                                v180 += 64;
                                                            } while (i14 != v163);
                                                        }
                                                        v188 = v178->field_38;
                                                        if ((int)(((unsigned int)(v170 - v72) ^ (unsigned int)v72 | v170 ^ (unsigned int)v72) ^ v170) < 0)
                                                            v189 = (int)((v188 - v177 ^ v177 | v188 ^ v177) ^ v188) >> 31;
                                                        else
                                                            v189 = -0x1;
                                                        if (!v189)
                                                        {
                                                            v90 = sub_a7ef38(&v25);
                                                            v79 = v20;
                                                            v86 = v23;
                                                            break;
                                                        }
                                                    }
                                                    v4 += v102;
                                                }
                                                else
                                                {
                                                    v90 = 0;
                                                    v87 = v24;
                                                    break;
                                                }
                                            }
                                        }
                                        else
                                        {
LABEL_a823ec:
                                            v90 = 0;
                                        }
                                    }
                                    else
                                    {
LABEL_a81b84:
                                        v90 = 0;
                                        v91 = v89;
                                    }
                                }
                            }
                            else
                            {
                                v90 = 0;
                                v86 = v23;
                                v87 = v24;
                                v91 = v13;
                            }
                        }
                        else
                        {
                            v90 = 0;
                            v55 = v22;
                            v86 = v23;
                            v87 = v24;
                            v79 = v20;
                            v91 = 0;
                        }
                        sub_a3f73c(v91);
                        sub_a6c4e8(v79, v19 + 0x400, "crypto/ml_dsa/ml_dsa_sign.c", 198);
                        sub_a66ec0(&v42, 64);
                        sub_a66ec0(&v41, 64);
                        v56 = v90;
                    }
                    else
                    {
                        v55 = v22;
                        v86 = v23;
                        v87 = v24;
                    }
                    if (v87 != v21)
                    {
                        if (v87 != &v40)
                            sub_a6c4e8(v17, v86, "crypto/ml_dsa/ml_dsa_sign.c", 394);
                        else
                            sub_a66ec0(&v40, 0x400);
                    }
LABEL_a81c14:
                    if (a10)
                        *(unsigned long long *)a10 = v55->field_8->field_50;
                }
                else
                {
                    v56 = sub_a6bf4c(v62, "crypto/ml_dsa/ml_dsa_sign.c", 348);
                    if (v56)
                        goto LABEL_a81850;
                }
            }
            else
            {
                v15 = a9;
                v56 = a2;
                if (a2)
                    goto LABEL_a81884;
                goto LABEL_a817c8;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v52)
        return v56;
    ___stack_chk_fail();
}
