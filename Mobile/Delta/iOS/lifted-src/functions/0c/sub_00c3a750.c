/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3a750..0xc3b0e8 (2456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3a750_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    void* field_20;
    unsigned long long field_28;
    struct st_c3a750_1 *field_30;
    unsigned long long field_38;
} st_c3a750_0;

typedef struct st_c3a750_1 {
    char field_0;
} st_c3a750_1;

extern unsigned long long g_efcaf8;
extern long long g_efcbf0;
extern long long g_efcef0;

unsigned long long sub_c3a750(st_c3a750_0 *a0, void* a1, unsigned long long a2)
{
    unsigned long long v14;  // x19
    void* v15;  // x21
    unsigned long long i;  // x9
    unsigned long long v114;  // 4121
    unsigned int v115;  // w8
    void* v116;  // x22
    unsigned int v117;  // w8
    unsigned long long v118;  // 4121
    void* v119;  // x22
    unsigned int v120;  // w8
    unsigned long long v121;  // 4121
    unsigned long long v122;  // x8
    unsigned long long v123;  // x2
    unsigned long long v25;  // x19
    unsigned long long v124;  // x1
    unsigned long long v125;  // 4119
    unsigned long long v126;  // 4102
    unsigned long v127;  // cc_op
    unsigned long v128;  // cc_dep1
    unsigned long v129;  // cc_dep2
    unsigned long v130;  // cc_ndep
    unsigned long long v131;  // 4102
    unsigned long long v26;  // x16
    unsigned int v132;  // w11
    unsigned long v133;  // cc_op
    unsigned long v134;  // cc_dep1
    unsigned long v135;  // cc_dep2
    char *v136;  // x11
    unsigned long v137;  // x16
    char *iter;  // x15
    unsigned int v139;  // w1
    unsigned long v140;  // 4112
    unsigned long v141;  // cc_op
    unsigned long long v27;  // x15
    unsigned long v142;  // cc_dep1
    unsigned long v143;  // cc_dep2
    unsigned long long v144;  // 4112
    unsigned long v145;  // 4112
    unsigned long long v146;  // 4112
    unsigned long long v147;  // 4112
    unsigned long long v148;  // 4102
    unsigned long long v149;  // 4112
    unsigned long long v150;  // 4102
    unsigned long long v28;  // x9
    unsigned int v152;  // w0
    unsigned int v153;  // w17
    unsigned int v154;  // w16
    unsigned long long v29;  // x17
    unsigned long long v30;  // x4
    unsigned long long v31;  // x2
    unsigned long long k;  // x9
    unsigned long long n;  // x16
    unsigned long long iter1;  // x0
    unsigned long long v34;  // x2
    unsigned long long v35;  // x8
    unsigned long long v36;  // x2
    unsigned long long v37;  // 4106
    unsigned long long v38;  // 4119
    unsigned long long v39;  // 4102
    void* v40;  // x0
    void* v41;  // x9
    void* v42;  // x8
    unsigned long v43;  // cc_op
    unsigned long long v17;  // x13
    void* v44;  // x11
    unsigned long v45;  // x12
    unsigned int v46;  // w10
    void* v47;  // x9
    unsigned long v48;  // cc_dep1
    unsigned long v49;  // cc_dep2
    unsigned int v50;  // w12
    unsigned int v51;  // w11
    unsigned int v52;  // w12
    unsigned int v53;  // w10
    unsigned long long v18;  // x10
    unsigned int v54;  // w11
    unsigned long long v55;  // 4134
    unsigned long long v56;  // 4112
    unsigned long long v57;  // 4102
    unsigned long long v58;  // 4112
    unsigned long long v59;  // 4102
    unsigned long long v60;  // 4119
    unsigned long long v61;  // 4102
    unsigned long v62;  // cc_dep1
    unsigned long long v63;  // 4112
    unsigned long long v19;  // x1
    unsigned long long v64;  // 4102
    unsigned long long v65;  // 4112
    unsigned long long v66;  // 4102
    unsigned long long v67;  // 4117
    unsigned long long v68;  // x8
    unsigned long long v69;  // x9
    unsigned long long v70;  // 4117
    unsigned long long v71;  // 4117
    unsigned long long v72;  // x22
    unsigned long long v73;  // x8
    unsigned long long v20;  // x8
    char *v74;  // x10
    unsigned long long v75;  // x11
    unsigned long long v76;  // x9
    unsigned long long v77;  // x11
    char *v78;  // x9
    unsigned long v79;  // x11
    char *iter2;  // x9
    unsigned int l;  // w12
    unsigned int v82;  // w13
    unsigned int v83;  // w11
    unsigned long v21;  // x12
    unsigned int v84;  // w13
    unsigned int v85;  // w12
    unsigned long long m;  // x23
    unsigned int i0;  // w14
    unsigned long long i1;  // x13
    unsigned long long v89;  // x12
    unsigned long long v90;  // 4116
    char *v91;  // x14
    unsigned long v92;  // x15
    unsigned int v93;  // w15
    unsigned long long v22;  // 4129
    unsigned int v94;  // w14
    unsigned int v95;  // w15
    unsigned int v97;  // w12
    unsigned long long v98;  // x13
    char *v99;  // x14
    unsigned long v100;  // x15
    char *v101;  // x14
    unsigned int v102;  // w15
    unsigned int v103;  // w14
    unsigned long long node;  // x3
    unsigned int v104;  // w15
    unsigned int v105;  // w12
    unsigned long long v106;  // x10
    unsigned long v107;  // cc_dep1
    unsigned long long v108;  // 4112
    unsigned long long v109;  // 4102
    unsigned long long v110;  // 4112
    unsigned long long v111;  // 4102
    void* v112;  // x22
    unsigned int v113;  // w8
    char v0;  // [bp-0xc8], Other Possible Types: unsigned long, unsigned long long
    unsigned long v1;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0xa8]
    unsigned long long v3;  // [bp-0xa0]
    unsigned long long v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x80]
    unsigned long long v6;  // [bp-0x78]
    char *v7;  // [bp-0x70]
    unsigned long long v8;  // [bp-0x68]
    unsigned long long j;  // [bp-0x60]
    unsigned long long v10;  // [bp-0x58]
    char v11;  // [bp-0x41]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a2;
    v15 = a1;
    iter1 = sub_bea21c(&v0);
    if (v0 & 1)
    {
        v17 = v4;
        v18 = v5;
        v19 = v6;
        v20 = v8;
        v21 = v20 - 1;
        v22 = arm64g_calculate_condition(2, v17, 1, 0);
        if (!(v22 & 1))
        {
            node = v3;
            i = v3 + v21;
            v25 = v14;
            if (v19 > i)
            {
                v26 = v1;
                v27 = v124;
                do
                {
                    if (v2 >> (*(char *)(v18 + i) & 63) & 1)
                    {
                        if (v27 < v17)
                            v28 = v17;
                        else
                            v28 = v27;
                        if (v20 < v28)
                            v29 = v28;
                        else
                            v29 = v20;
                        iter1 = v18 + node;
                        v30 = v28;
                    }
                    else
                    {
                        v17 = 0;
                        node += v20;
                        goto LABEL_c3a86c;
                    }
                    while (1)
                    {
                        if (v29 != v30)
                        {
                            v31 = v30;
                            v25 = v14;
                            if (v19 <= node + v30)
                                goto LABEL_c3b014;
                            v30 = v31 + 1;
                            if (v7[v31] != *(char *)(iter1 + v31))
                            {
                                v17 = 0;
                                node = node - v27 + v31 + 1;
                                goto LABEL_c3a86c;
                            }
                        }
                        else
                        {
                            iter1 = v27;
                            break;
                        }
                    }
                    while (1)
                    {
                        if (iter1 <= v17)
                            goto LABEL_c3a89c;
                        iter1 -= 1;
                        if (v20 <= iter1)
                            goto LABEL_c3b01c;
                        v28 = iter1 + node;
                        if (v19 <= v28)
                            goto LABEL_c3b02c;
                        v28 = *(char *)(v18 + v28);
                        if (v7[iter1] != (unsigned int)v28)
                            break;
                    }
                    node += v26;
                    v17 = v20 - v26;
LABEL_c3a86c:
                    i = node + v21;
                    v25 = v14;
                } while (i < v19);
            }
        }
        else
        {
            node = v3;
            k = v3 + v21;
            v25 = v14;
            if (v19 > k)
            {
                v17 = v124;
                if (v20 < v17)
                    n = v17;
                else
                    n = v20;
                do
                {
                    if (v2 >> (*(char *)(v18 + k) & 63) & 1)
                    {
                        v28 = v18 + node;
                        v34 = v17;
                    }
                    else
                    {
                        node += v20;
                        goto LABEL_c3a97c;
                    }
                    while (n != v34)
                    {
                        iter1 = v34;
                        if (v19 <= node + v34)
                            goto LABEL_c3b03c;
                        v34 = iter1 + 1;
                        if (v7[iter1] != *(char *)(v28 + iter1))
                        {
                            node = node - v17 + iter1 + 1;
                            goto LABEL_c3a97c;
                        }
                    }
                    iter1 = v17;
                    while (1)
                    {
                        if (!iter1)
                            goto LABEL_c3a89c;
                        iter1 -= 1;
                        if (v20 > v17 - 1)
                        {
                            v28 = iter1 + node;
                            if (v19 <= v28)
                                goto LABEL_c3b02c;
                            v28 = *(char *)(v18 + v28);
                            if (v7[iter1] != (unsigned int)v28)
                                break;
                        }
                        else
                        {
LABEL_c3b01c:
                            v19 = v20;
                            sub_c73c94(iter1, v19, &g_efcef0);
LABEL_c3b02c:
                            sub_c73c94(v28);
LABEL_c3b03c:
                            v35 = node + v17;
                            v25 = v14;
                            goto LABEL_c3b040;
                        }
                    }
                    node += v1;
LABEL_c3a97c:
                    k = node + v21;
                    v25 = v14;
                } while (k < v19);
            }
        }
        goto LABEL_c3aa54;
    }
    do
    {
        iter1 = sub_c3a3bc(&j, &v0);
    } while (j == 1);
    v25 = v14;
    if (!j)
    {
        node = v10;
LABEL_c3a89c:
        v36 = node + 6;
        v37 = arm64g_calculate_condition(2, node, 6, 0);
        if (v37 & 1)
        {
LABEL_c3a990:
            v41 = v15 + v36;
            v42 = v15 + v14;
            while (1)
            {
                v43 = 4;
                if (v41 != v42)
                {
                    v44 = v41;
                    v45 = *(char *)v44;
                    v46 = (unsigned int)v45 & 0xff;
                    if (!(v45 >> 31 & 1))
                    {
                        v47 = v44 + 1;
                        v48 = v41;
                        v49 = v42;
                    }
                    else
                    {
                        v50 = (char)v41[1] & 63;
                        v43 = 3;
                        v48 = v46;
                        v49 = 224;
                        if (v46 >= 224)
                        {
                            v51 = v46 & 31;
                            v52 = (char)v41[2] & 63 | v50 * 64;
                            v43 = 3;
                            v48 = v46;
                            v49 = 240;
                            if (v46 >= 240)
                            {
                                v53 = (char)v41[3] & 63 | v52 * 64;
                                v46 = v53 & 0xffe00000 | (v53 & 0xffe3ffff | (v51 * 0x40000 | v51 >> 14) & 0x1c0000) & 0x1fffff;
                                v43 = 3;
                                v48 = v46;
                                v49 = 0x110000;
                                if (v46 == 0x110000)
                                    goto LABEL_c3aa30;
                                v47 = v41 + 4;
                            }
                            else
                            {
                                v47 = v41 + 3;
                                v46 = v52 | v51 * 0x1000;
                            }
                        }
                        else
                        {
                            v47 = v41 + 2;
                            v46 = (v50 & 63 | __ROL__(v46, 6) & 1984) & 0x7ff;
                        }
                    }
                    v54 = v46 - 58;
                    v55 = arm64g_calculate_condition(145, v46 - 71, 8, 0);
                    if (v55 & 1)
                    {
                        v56 = arm64g_calculate_condition(v43 | 144, v48, v49, 0);
                        v57 = arm64g_calculate_condition(33, (v56 & 1 ? v54 : 0x20000000), (v56 & 1 ? 10 : 0), 0);
                        v25 = v14;
                        if (!(v57 & 1))
                            break;
                    }
                    else
                    {
                        v58 = arm64g_calculate_condition(v43 | 144, v48, v49, 0);
                        v59 = arm64g_calculate_condition(32, (v58 & 1 ? v54 : 0x20000000), (v58 & 1 ? 10 : 0), 0);
                        v25 = v14;
                        if (!(v59 & 1))
                            break;
                    }
                }
                else
                {
LABEL_c3aa30:
                    if (!node)
                    {
                        a0->field_0 = 2;
                        return iter1;
                    }
                    if (v14 > node)
                    {
                        v60 = arm64g_calculate_condition(209, *((char *)v15 + node), 65, 0);
                        if (!(v60 & 1))
                        {
                            v25 = node;
                            break;
                        }
                    }
                    else
                    {
                        v61 = arm64g_calculate_condition(20, node, v14, 0);
                        v25 = v14;
                        if (!(v61 & 1))
                            break;
                    }
                    sub_c73cc8(v15, v14, 0);
                    v25 = v14;
                    goto LABEL_c3b084;
                }
            }
            goto LABEL_c3aa54;
        }
        else if (v14 > v36)
        {
            v38 = arm64g_calculate_condition(193, *((char *)v15 + v36), 65, 0);
            if (!(v38 & 1))
                goto LABEL_c3a8b8;
            goto LABEL_c3a990;
        }
        else
        {
            v39 = arm64g_calculate_condition(20, v36, v14, 0);
            if (!(v39 & 1))
                goto LABEL_c3a990;
LABEL_c3a8b8:
            v25 = v14;
            v40 = v15;
        }
    }
    else
    {
LABEL_c3aa54:
        v62 = v25;
        if (3 > v25)
        {
            if (v25 != 2)
            {
                a0->field_0 = 2;
                return iter1;
            }
            if (*(short *)v15 == 20058)
            {
                v25 = 2;
                goto LABEL_c3ab14;
            }
            else
            {
LABEL_c3ad84:
                v25 = 2;
                if (*(char *)v15 != 82)
                {
                    a0->field_0 = 2;
                    return iter1;
                }
LABEL_c3ad94:
                v119 = v15;
                v120 = (char)v119[1];
                v72 = v119 + 1;
                v121 = arm64g_calculate_condition(209, v120, 65, 0);
                if (v121 & 1)
                    goto LABEL_c3b054;
                v115 = v120 & 0xff;
                v28 = 0xffffffffffffffff;
LABEL_c3adc8:
                if (25 < v115 - 65)
                {
                    a0->field_0 = 2;
                    return iter1;
                }
                v122 = 0;
                m = v28 + v25;
                while (m != v122)
                {
                    v122 += 1;
                    if (0 & 1)
                    {
                        a0->field_0 = 2;
                        return iter1;
                    }
                }
                v0 = v72;
                v124 = m;
                v123 = 0;
                *(unsigned int *)&v1 = 0;
                v2 = 0;
                v3 = 0;
                if (!sub_c3b0e8(&v0, 0))
                {
                    iter1 = v0;
                    if (!iter1)
                    {
                        a0->field_0 = 2;
                        return iter1;
                    }
                    v28 = *(unsigned int *)((void*)&v124 + 1) | (*(unsigned short *)((void*)&v124 + 5) | *(char *)((void*)&v124 + 7) * 0x10000) * 0x100000000;
                    v124 = (char)v124 | v28 * 0x100;
                    if (v124 > v123 && 26 > *(char *)(iter1 + v123) - 65)
                    {
                        v0 = iter1;
                        v2 = 0;
                        v3 = 0;
                        if (sub_c3b0e8(&v0, 0))
                            goto LABEL_c3aff0;
                        iter1 = v0;
                        if (!iter1)
                        {
                            a0->field_0 = 2;
                            return iter1;
                        }
                    }
                    if (v123)
                    {
                        if (v124 > v123)
                        {
                            v125 = arm64g_calculate_condition(193, *(char *)(iter1 + v123), 65, 0);
                            if (!(v125 & 1))
                                goto LABEL_c3aea4;
                        }
                        else
                        {
                            v126 = arm64g_calculate_condition(20, v124, v123, 0);
                            if (v126 & 1)
                            {
                                do
                                {
LABEL_c3aea4:
                                    iter1 = sub_c73cc8();
                                } while ((v131 = arm64g_calculate_condition(v127 | 16, v128, v129, v130), v131 & 1));
                            }
                        }
                    }
                    v73 = 0;
                    iter2 = iter1 + v123;
                    v106 = v124 - v123;
                    if (!v106)
                    {
                        a0->field_8 = 0;
                        a0->field_10 = v72;
                        a0->field_18 = m;
                        a0->field_20 = v15;
                        a0->field_28 = v25;
                        a0->field_30 = iter2;
                        a0->field_38 = v106;
                        a0->field_0 = 1;
                        return iter1;
                    }
LABEL_c3aec8:
                    v132 = *iter2;
                    v133 = 3;
                    v134 = v132 & 0xff;
                    v135 = 46;
                    if (v132 != 46)
                    {
                        a0->field_0 = 2;
                        return iter1;
                    }
                    v136 = &iter2[v106];
                    v137 = 46;
                    iter = iter2;
                    if (1)
                        goto LABEL_c3af5c;
                    while (1)
                    {
                        v152 = iter[1] & 63;
                        v133 = 3;
                        v134 = v137 & 0xffffffff;
                        v135 = 224;
                        if ((unsigned int)v137 >= 224)
                        {
                            v153 = (unsigned int)v137 & 31;
                            iter1 = iter[2] & 63 | v152 * 64;
                            v133 = 3;
                            v134 = v137 & 0xffffffff;
                            v135 = 240;
                            if ((unsigned int)v137 >= 240)
                            {
                                v154 = iter[3] & 63 | (unsigned int)iter1 * 64;
                                v137 = v154 & 0xffe00000 | (v154 & 0xffe3ffff | (v153 * 0x40000 | v153 >> 14) & 0x1c0000) & 0x1fffff;
                                v133 = 3;
                                v134 = v137 & 0xffffffff;
                                v135 = 0x110000;
                                if ((unsigned int)v137 == 0x110000)
                                    break;
                                iter += 4;
                            }
                            else
                            {
                                iter += 3;
                                v137 = (unsigned int)iter1 | v153 * 0x1000;
                            }
                        }
                        else
                        {
                            iter += 2;
                            v137 = (v152 & 63 | __ROL__((unsigned int)v137, 6) & 1984) & 0x7ff;
                        }
                        while (1)
                        {
                            iter1 = (unsigned int)v137 - 48;
                            v139 = (unsigned int)v137 - 33;
                            if (26 <= ((unsigned int)v137 & 0x1fffdf) - 65)
                            {
                                v140 = arm64g_calculate_condition(v133 | 32, v134, v135, 0);
                                v141 = 3;
                                v142 = (v140 & 1 ? iter1 & 0xffffffff : 0);
                                v143 = (v140 & 1 ? 10 : 0);
                                v144 = arm64g_calculate_condition(35, v142, v143, 0);
                                if (!(v144 & 1))
                                    goto LABEL_c3af7a;
                                goto LABEL_c3af79;
                            }
                            else
                            {
                                v145 = arm64g_calculate_condition(v133 | 32, v134, v135, 0);
                                v141 = 0;
                                v142 = (v145 & 1 ? iter1 & 0xffffffff : 0);
                                v143 = (v145 & 1 ? 10 : 0);
                                v146 = arm64g_calculate_condition(32, v142, v143, 0);
                                if (v146 & 1)
                                {
LABEL_c3af79:
                                    v147 = arm64g_calculate_condition(v141 | 32, v142, v143, 0);
                                    v148 = arm64g_calculate_condition(0x33, (v147 & 1 ? v139 : 0), (v147 & 1 ? 15 : 0), 0);
                                    if (!(v148 & 1))
                                        goto LABEL_c3af80;
                                    goto LABEL_c3af98;
                                }
                                else
                                {
LABEL_c3af7a:
                                    v149 = arm64g_calculate_condition(v141 | 32, v142, v143, 0);
                                    v150 = arm64g_calculate_condition(48, (v149 & 1 ? v139 : 0), (v149 & 1 ? 15 : 0), 0);
                                    if (!(v150 & 1))
                                    {
LABEL_c3af80:
                                        if ((38 < (unsigned int)v137 - 58 || !(1 << ((char)((unsigned int)v137 - 58) & 63) & 541165879423)) && (unsigned int)v137 - 123 > 3)
                                        {
                                            a0->field_0 = 2;
                                            return iter1;
                                        }
                                    }
LABEL_c3af98:
                                    v133 = 4;
                                    if (iter == v136)
                                    {
                                        a0->field_8 = v73;
                                        a0->field_10 = v72;
                                        a0->field_18 = m;
                                        a0->field_20 = v15;
                                        a0->field_28 = v25;
                                        a0->field_30 = iter2;
                                        a0->field_38 = v106;
                                        a0->field_0 = 1;
                                        return iter1;
                                    }
                                    v137 = *iter;
                                    v134 = iter;
                                    v135 = v136;
                                    if (v137 >> 7 & 1)
                                        break;
LABEL_c3af5c:
                                    iter += 1;
                                }
                            }
                        }
                    }
                    a0->field_8 = v73;
                    a0->field_10 = v72;
                    a0->field_18 = m;
                    a0->field_20 = v15;
                    a0->field_28 = v25;
                    a0->field_30 = iter2;
                    a0->field_38 = v106;
                    a0->field_0 = 1;
                    return iter1;
                }
LABEL_c3aff0:
                node = &g_efcaf8;
                v19 = 61;
                sub_c73d64("`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 61, &v11, &g_efcaf8, &g_efcbf0);
LABEL_c3b014:
                v35 = v28 + node;
LABEL_c3b040:
                sub_c73c94();
LABEL_c3b054:
                v14 = v25;
                v40 = v15;
            }
        }
        else
        {
            if (*(short *)v15 == 23135)
            {
                v63 = arm64g_calculate_condition(4, v62, 3, 0);
                v64 = arm64g_calculate_condition(3, (v63 & 1 ? (char)v15[2] : 0), (v63 & 1 ? 78 : 0), 0);
                if (v64 & 1)
                    goto LABEL_c3aae4;
                goto LABEL_c3aa9c;
            }
            v65 = arm64g_calculate_condition(4, v62, 3, 0);
            v66 = arm64g_calculate_condition(0, (v65 & 1 ? (char)v15[2] : 0), (v65 & 1 ? 78 : 0), 0);
            if (v66 & 1)
            {
LABEL_c3aae4:
                if (v25 != 3)
                {
                    v71 = arm64g_calculate_condition(209, (char)v15[3], 65, 0);
                    if (v71 & 1)
                        goto LABEL_c3b0b0;
                }
                v68 = 0xfffffffffffffffd;
                v69 = 3;
                goto LABEL_c3ab18;
            }
LABEL_c3aa9c:
            if (*(short *)v15 != 20058)
            {
                if (v25 == 3 || *(int *)v15 != 1314545503)
                    goto LABEL_c3ad28;
                if (v25 >= 5)
                {
                    v67 = arm64g_calculate_condition(209, (char)v15[4], 65, 0);
                    if (!(v67 & 1))
                    {
                        goto LABEL_c3abac;
                    }
                    else
                    {
                        v14 = v25;
                        v40 = v15;
                    }
                }
                else
                {
                    v25 = 4;
                    v68 = 0xfffffffffffffffc;
LABEL_c3abac:
                    v69 = 4;
LABEL_c3ab18:
                    v72 = v68 + v25;
                    v73 = v15 + v69;
                    v74 = v73 + v72;
                    v75 = v73;
                    v76 = v72;
                    while (1)
                    {
                        v77 = v75;
                        if (!v76)
                            break;
                        v75 = v77 + 1;
                        v76 -= 1;
                        if (*(char *)v77 < 0)
                            goto LABEL_c3ad20;
                    }
                    if (v72)
                    {
                        v78 = v73;
                        v79 = *v78;
                        iter2 = v78 + 1;
                        l = (unsigned int)v79 & 0xff;
                        if (v79 >> 31 & 1)
                        {
                            v82 = *(char *)(v73 + 1) & 63;
                            if (l >= 224)
                            {
                                v83 = l & 31;
                                v84 = *(char *)(v73 + 2) & 63 | v82 * 64;
                                if (l >= 240)
                                {
                                    iter2 = v73 + 4;
                                    v85 = *(char *)(v73 + 3) & 63 | v84 * 64;
                                    l = v85 & 0xffe00000 | (v85 & 0xffe3ffff | __ROL__(v83, 18) & 0x1c0000) & 0x1fffff;
                                }
                                else
                                {
                                    iter2 = v73 + 3;
                                    l = v84 | v83 * 0x1000;
                                }
                            }
                            else
                            {
                                iter2 = v73 + 2;
                                l = (v82 & 63 | __ROL__(l, 6) & 1984) & 0x7ff;
                            }
                        }
                        if (l == 69)
                        {
                            m = 0;
                        }
                        else
                        {
                            m = 0;
                            do
                            {
                                i0 = l - 48;
                                if (9 < i0)
                                    goto LABEL_c3ad20;
                                i1 = 0;
                                do
                                {
                                    if (i1 * 10 > 0xffffffffffffffff || !(v89 = i1 * 10, i1 = v89 + i0, v90 = arm64g_calculate_condition(0x22, v89, i0, 0), !(v90 & 1) && iter2 != v74))
                                        goto LABEL_c3ad20;
                                    v91 = iter2;
                                    v92 = *v91;
                                    l = (unsigned int)v92 & 0xff;
                                    if (!(v92 >> 31 & 1))
                                    {
                                        iter2 = v91 + 1;
                                    }
                                    else
                                    {
                                        v93 = iter2[1] & 63;
                                        if (l >= 224)
                                        {
                                            v94 = l & 31;
                                            v95 = iter2[2] & 63 | v93 * 64;
                                            if (l >= 240)
                                            {
                                                v97 = iter2[3] & 63 | v95 * 64;
                                                l = v97 & 0xffe00000 | (v97 & 0xffe3ffff | __ROL__(v94, 18) & 0x1c0000) & 0x1fffff;
                                                iter2 += 4;
                                            }
                                            else
                                            {
                                                iter2 += 3;
                                                l = v95 | v94 * 0x1000;
                                            }
                                        }
                                        else
                                        {
                                            iter2 += 2;
                                            l = (v93 & 63 | __ROL__(l, 6) & 1984) & 0x7ff;
                                        }
                                    }
                                    i0 = l - 48;
                                } while (i0 < 10);
                                if (i1)
                                {
                                    do
                                    {
                                        v98 = i1;
                                        if (iter2 == v74)
                                            goto LABEL_c3ad20;
                                        v99 = iter2;
                                        v100 = *v99;
                                        v101 = v99 + 1;
                                        l = (unsigned int)v100 & 0xff;
                                        if (v100 >> 31 & 1)
                                        {
                                            v102 = iter2[1] & 63;
                                            if (l >= 224)
                                            {
                                                v103 = l & 31;
                                                v104 = iter2[2] & 63 | v102 * 64;
                                                if (l >= 240)
                                                {
                                                    v101 = iter2 + 4;
                                                    v105 = iter2[3] & 63 | v104 * 64;
                                                    l = v105 & 0xffe00000 | (v105 & 0xffe3ffff | __ROL__(v103, 18) & 0x1c0000) & 0x1fffff;
                                                }
                                                else
                                                {
                                                    v101 = iter2 + 3;
                                                    l = v104 | v103 * 0x1000;
                                                }
                                            }
                                            else
                                            {
                                                v101 = iter2 + 2;
                                                l = (v102 & 63 | __ROL__(l, 6) & 1984) & 0x7ff;
                                            }
                                        }
                                        iter2 = v101;
                                        i1 = v98 - 1;
                                    } while (i1);
                                }
                                m += 1;
                            } while (l != 69);
                        }
                        v106 = v74 - iter2;
                        if (!v106)
                        {
                            a0->field_8 = v73;
                            a0->field_10 = v72;
                            a0->field_18 = m;
                            a0->field_20 = v15;
                            a0->field_28 = v25;
                            a0->field_30 = iter2;
                            a0->field_38 = v106;
                            a0->field_0 = 1;
                            return iter1;
                        }
                        goto LABEL_c3aec8;
                    }
LABEL_c3ad20:
                    if (v25 < 3)
                        goto LABEL_c3ad84;
LABEL_c3ad28:
                    if (*(short *)v15 != 21087)
                    {
                        if (*(char *)v15 == 82)
                            goto LABEL_c3ad94;
                        v107 = v25;
                        if (v25 == 3)
                        {
                            a0->field_0 = 2;
                            return iter1;
                        }
                        if (*(short *)v15 == 0x5f5f)
                        {
                            v108 = arm64g_calculate_condition(4, v107, 3, 0);
                            v109 = arm64g_calculate_condition(19, (v108 & 1 ? (char)v15[2] : 0), (v108 & 1 ? 82 : 0), 0);
                            if (v109 & 1)
                            {
                                a0->field_0 = 2;
                                return iter1;
                            }
                        }
                        else
                        {
                            v110 = arm64g_calculate_condition(4, v107, 3, 0);
                            v111 = arm64g_calculate_condition(16, (v110 & 1 ? (char)v15[2] : 0), (v110 & 1 ? 82 : 0), 0);
                            if (v111 & 1)
                            {
                                a0->field_0 = 2;
                                return iter1;
                            }
                        }
                        v112 = v15;
                        v113 = (char)v112[3];
                        v72 = v112 + 3;
                        v114 = arm64g_calculate_condition(209, v113, 65, 0);
                        if (v114 & 1)
                            goto LABEL_c3b0c4;
                        v115 = v113 & 0xff;
                        v28 = 0xfffffffffffffffd;
                        goto LABEL_c3adc8;
                    }
                    else
                    {
                        v116 = v15;
                        v117 = (char)v116[2];
                        v72 = v116 + 2;
                        v118 = arm64g_calculate_condition(209, v117, 65, 0);
                        if (!(v118 & 1))
                        {
                            v115 = v117 & 0xff;
                            v28 = 0xfffffffffffffffe;
                            goto LABEL_c3adc8;
                        }
                        else
                        {
LABEL_c3b084:
                            goto LABEL_c3b098;
                        }
                    }
                }
            }
            else
            {
                v70 = arm64g_calculate_condition(209, (char)v15[2], 65, 0);
                if (!(v70 & 1))
                {
                    v68 = 0xfffffffffffffffe;
LABEL_c3ab14:
                    v69 = 2;
                    goto LABEL_c3ab18;
                }
                else
                {
LABEL_c3b098:
                    v14 = v25;
                    v40 = v15;
                }
            }
        }
    }
    while (1)
    {
        sub_c73cc8(v40, v14);
LABEL_c3b0c4:
LABEL_c3b0b0:
        v14 = v25;
        v40 = v15;
    }
}
