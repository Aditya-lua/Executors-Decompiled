/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbec090..0xbec5f0 (1376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bec090_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned short field_10;
} st_bec090_1;

typedef struct st_bec090_0 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned short field_18;
} st_bec090_0;

extern unsigned long long g_989680;
extern void g_e088a0;
extern long long g_efa908;
extern long long g_efa950;
extern long long g_efa968;
extern long long g_efa980;
extern long long g_efa998;
extern long long g_efa9b0;
extern long long g_efa9c8;
extern long long g_efa9e0;
extern long long g_efa9f8;

void sub_bec090(st_bec090_1 *a0, st_bec090_0 *a1, char *a2)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // x10
    unsigned int v15;  // w14
    unsigned long long v105;  // x15
    unsigned long long v106;  // x3
    unsigned long long v107;  // x3
    unsigned long long v108;  // x17
    unsigned long long v109;  // x15
    unsigned long long v110;  // x16
    unsigned int v111;  // w1
    unsigned long long v112;  // x5
    unsigned long v113;  // cc_dep1
    unsigned long v114;  // cc_dep2
    long long v16;  // x8
    unsigned long long v115;  // x14
    unsigned long long v116;  // x13
    unsigned long long v117;  // x14
    unsigned long long v118;  // x4
    unsigned long long v119;  // x3
    unsigned long v120;  // 4110
    unsigned long v121;  // cc_op
    unsigned long v122;  // cc_dep1
    unsigned long v123;  // cc_dep2
    unsigned long long v124;  // 4102
    int v17;  // w13
    unsigned long v125;  // 4110
    unsigned long long v126;  // 4102
    unsigned long long v127;  // x6
    unsigned long long v128;  // x7
    unsigned long long v129;  // x6
    unsigned long long v130;  // x4
    unsigned long long v131;  // 4110
    unsigned long long v132;  // 4102
    unsigned long long v133;  // 4110
    unsigned long long v134;  // 4102
    unsigned long long v18;  // x9
    unsigned long long v135;  // x14
    unsigned long long v136;  // x10
    void* v19;  // x8
    unsigned long v20;  // x11
    unsigned long v21;  // x15
    unsigned long long v22;  // x3
    unsigned long v23;  // x16
    long long v24;  // x1
    unsigned long long v7;  // x9
    unsigned long v25;  // x5
    unsigned long long v26;  // x6
    unsigned long long v27;  // x13
    char v28;  // x9
    char v29;  // x14
    unsigned long long v30;  // x7
    unsigned long long v31;  // x10
    unsigned long long v32;  // x4
    unsigned long long v33;  // x9
    unsigned long long v34;  // w12
    unsigned long long v8;  // x9
    unsigned long v35;  // cc_dep1
    unsigned long long v36;  // w17
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4110
    unsigned long long v39;  // w19
    unsigned long v40;  // cc_dep1
    unsigned long v41;  // x22
    unsigned long long v42;  // 4108
    unsigned long long v43;  // 4108
    unsigned int v44;  // w12
    unsigned long long v9;  // 4107
    unsigned long v45;  // cc_dep1
    unsigned int v46;  // w12
    unsigned long long v47;  // 4110
    unsigned long long v48;  // 4110
    unsigned long v49;  // cc_dep1
    unsigned long long v50;  // w20
    unsigned long long v51;  // 4110
    unsigned long long v52;  // 4110
    unsigned long long v53;  // w21
    unsigned long v54;  // cc_dep1
    unsigned long long v10;  // x12
    unsigned long long v55;  // w22
    unsigned long long v56;  // 4110
    unsigned long long v57;  // 4110
    unsigned long long v58;  // w23
    unsigned long v59;  // cc_dep1
    unsigned long long v60;  // w19
    unsigned long long v61;  // 4108
    unsigned long long v62;  // 4108
    unsigned long v63;  // cc_dep1
    unsigned long long v64;  // 4108
    unsigned int v11;  // w13
    unsigned long long v65;  // 4108
    unsigned long long v66;  // x12
    unsigned long long v67;  // x19
    unsigned long long v68;  // x17
    unsigned long long v69;  // x11
    unsigned long v70;  // x22
    unsigned int v71;  // w20
    unsigned int v72;  // w21
    unsigned long v73;  // x25
    unsigned long long v74;  // x20
    unsigned int v12;  // w11
    unsigned long long v75;  // x26
    unsigned long v76;  // cc_op
    unsigned long v77;  // cc_ndep
    unsigned long long v78;  // x20
    unsigned long long v79;  // cc_dep1
    unsigned long long v80;  // x10
    unsigned long long v81;  // x13
    unsigned long long v82;  // x11
    unsigned long long v83;  // x13
    unsigned long long v84;  // x4
    unsigned long long v13;  // x10
    unsigned long v85;  // 4110
    unsigned long v86;  // cc_op
    unsigned long v87;  // cc_dep1
    unsigned long v88;  // cc_dep2
    unsigned long long v89;  // 4102
    unsigned long v90;  // 4110
    unsigned long long v91;  // 4102
    unsigned long long v92;  // x4
    unsigned long long v93;  // x14
    unsigned long long v94;  // x7
    unsigned long long v14;  // x12
    unsigned long long v95;  // x9
    unsigned long long v96;  // x15
    unsigned long long v97;  // x1
    unsigned long long v98;  // x15
    unsigned long long v99;  // 4110
    unsigned long long v100;  // 4102
    unsigned long long v101;  // 4110
    unsigned long long v102;  // 4102
    unsigned long long v103;  // x9
    unsigned long long v104;  // x10
    unsigned long long v0;  // [bp-0x68]
    unsigned short v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1->field_0;
    if (v5)
    {
        v6 = *(long long *)&a1->padding_8[0];
        if (!v6)
            goto LABEL_bec550;
        v7 = *(long long *)&a1->padding_8[8];
        if (!v7)
            goto LABEL_bec568;
        v8 = v7 + v5;
        v9 = arm64g_calculate_condition(0x22, v7, v5, 0);
        if (v9 & 1)
            goto LABEL_bec580;
        v10 = v5 - v6;
        if (v5 < v6)
            goto LABEL_bec598;
        if (v8 > 0x1fffffffffffffff)
            goto LABEL_bec5b0;
        v11 = a1->field_18;
        if (!v8)
            v12 = 64;
        else
            v12 = Clz(v8);
        v0 = v10;
        v1 = v11;
        v13 = v10 << ((char)v12 & 63);
        v2 = v13 >> ((char)v12 & 63);
        if (v2 == v10 && !(v0 = v5, v1 = v11, v14 = v5 << ((char)v12 & 63), v2 = v14 >> ((char)v12 & 63), v2 != v5))
        {
            v15 = v11 - v12;
            v16 = (86960 + 80 * (short)(0xffffffa0 - v15)) * 2068695443;
            v17 = (int)(v16 >> 42) + (int)((unsigned long long)(v16) >> 63);
            v5 = v17;
            if (80 < (unsigned int)v17)
                sub_c73c94(v5, 81, &g_efa908);
            v18 = v8 << ((char)v12 & 63);
            v19 = &(&g_e088a0)[16 * v5];
            v20 = *(long long *)v19;
            v21 = v20 * v18 >> 64;
            v22 = v18 * v20 >> 63;
            v23 = v20 * v13 >> 64;
            v24 = (long long)(v13 * v20) >> 63;
            v25 = v20 * v14 >> 64;
            v26 = v14 * v20 >> 63;
            v27 = v21 + v22 + 1;
            v28 = -v15 - (short)v19[8];
            v29 = v28 & 63;
            v30 = v27 >> (v28 & 63);
            v31 = 1 << (v28 & 63);
            v32 = v31 - 1;
            v33 = v27 & v32;
            if (625 > (unsigned int)v30 >> 4)
            {
                if (9 < (unsigned int)v30)
                    v34 = 10;
                else
                    v34 = 1;
                v35 = v30 & 0xffffffff;
                if ((unsigned int)v30 < 1000)
                {
                    v36 = 100;
                    v37 = arm64g_calculate_condition(0x33, v35, 1000, 0);
                    if (!(v37 & 1))
                        goto LABEL_bec1f6;
LABEL_bec1f5:
                    v39 = 2;
                }
                else
                {
                    v36 = 1000;
                    v38 = arm64g_calculate_condition(0x33, v35, 1000, 0);
                    if (v38 & 1)
                        goto LABEL_bec1f5;
LABEL_bec1f6:
                    v39 = 3;
                }
                v40 = v30 & 0xffffffff;
                if ((unsigned int)v30 < 100)
                {
                    v41 = v34;
                    v42 = arm64g_calculate_condition(0x33, v40, 100, 0);
                    if (!(v42 & 1))
                        goto LABEL_bec202;
LABEL_bec201:
                    v39 = (unsigned int)v30 > 9;
                }
                else
                {
                    v41 = v36;
                    v43 = arm64g_calculate_condition(0x33, v40, 100, 0);
                    if (v43 & 1)
                        goto LABEL_bec201;
LABEL_bec202:
                }
            }
            else
            {
                v44 = (unsigned int)v30 >> 5;
                v45 = v44;
                if (v44 < 3125)
                {
                    v46 = 10000;
                    v47 = arm64g_calculate_condition(0x33, v45, 3125, 0);
                    if (!(v47 & 1))
                        goto LABEL_bec22e;
LABEL_bec22d:
                    v39 = 4;
                }
                else
                {
                    v46 = 100000;
                    v48 = arm64g_calculate_condition(0x33, v45, 3125, 0);
                    if (v48 & 1)
                        goto LABEL_bec22d;
LABEL_bec22e:
                    v39 = 5;
                }
                v49 = v30 & 0xffffffff;
                if ((unsigned int)v30 < &g_989680)
                {
                    v50 = 1000000;
                    v51 = arm64g_calculate_condition(0x33, v49, &g_989680, 0);
                    if (!(v51 & 1))
                        goto LABEL_bec24e;
LABEL_bec24d:
                    v53 = 6;
                }
                else
                {
                    v50 = &g_989680;
                    v52 = arm64g_calculate_condition(0x33, v49, &g_989680, 0);
                    if (v52 & 1)
                        goto LABEL_bec24d;
LABEL_bec24e:
                    v53 = 7;
                }
                v54 = v30 & 0xffffffff;
                if ((unsigned int)v30 < 1000000000)
                {
                    v55 = 100000000;
                    v56 = arm64g_calculate_condition(0x33, v54, 1000000000, 0);
                    if (!(v56 & 1))
                        goto LABEL_bec266;
LABEL_bec265:
                    v58 = 8;
                }
                else
                {
                    v55 = 1000000000;
                    v57 = arm64g_calculate_condition(0x33, v54, 1000000000, 0);
                    if (v57 & 1)
                        goto LABEL_bec265;
LABEL_bec266:
                    v58 = 9;
                }
                v59 = v30 & 0xffffffff;
                if ((unsigned int)v30 < 100000000)
                {
                    v60 = v50;
                    v61 = arm64g_calculate_condition(0x33, v59, 100000000, 0);
                    if (!(v61 & 1))
                        goto LABEL_bec272;
LABEL_bec271:
                }
                else
                {
                    v60 = v55;
                    v62 = arm64g_calculate_condition(0x33, v59, 100000000, 0);
                    if (v62 & 1)
                        goto LABEL_bec271;
LABEL_bec272:
                    v53 = v58;
                }
                v63 = v30 & 0xffffffff;
                if ((unsigned int)v30 < 1000000)
                {
                    v41 = v46;
                    v64 = arm64g_calculate_condition(0x33, v63, 1000000, 0);
                    if (!(v64 & 1))
                        goto LABEL_bec27e;
LABEL_bec27d:
                }
                else
                {
                    v41 = v60;
                    v65 = arm64g_calculate_condition(0x33, v63, 1000000, 0);
                    if (v65 & 1)
                        goto LABEL_bec27d;
LABEL_bec27e:
                    v39 = v53;
                }
            }
            v66 = 0;
            v67 = v26 + v25;
            v5 = (unsigned int)(v39 - (short)v19[10]) + 1;
            v68 = v24 - v23 + v27 + 1;
            v69 = v68 & v32;
            while (1)
            {
                v70 = v41;
                v71 = v30 / v70;
                v30 = (unsigned int)v30 - (unsigned int)v70 * v71;
                v72 = v71 + 48;
                a2[v66] = v72;
                v73 = v30 << (v29 & 63);
                v74 = v73 + v33;
                v75 = v68 - v74;
                v76 = 4;
                v77 = 0;
                v78 = v74;
                v79 = v68;
                if (v78 < v79)
                {
LABEL_bec2f8:
                    v80 = (v70 & 0xffffffff) << (v29 & 63);
                    v81 = v27 - v67;
                    v82 = v81 + 1;
                    v83 = v81 - 1;
                    v84 = v80 > v75;
                    if (v78 < v83)
                    {
                        v85 = arm64g_calculate_condition(v76 | 48, v79, v74, v77);
                        v86 = 4;
                        v87 = (v85 & 1 ? v75 : 0);
                        v88 = (v85 & 1 ? v80 : 0);
                        v89 = arm64g_calculate_condition(52, v87, v88, 0);
                        if (v89 & 1)
                            goto LABEL_bec39c;
                    }
                    else
                    {
                        v90 = arm64g_calculate_condition(v76 | 48, v79, v74, v77);
                        v86 = 0;
                        v87 = (v90 & 1 ? v75 : 0);
                        v88 = (v90 & 1 ? v80 : 0);
                        v91 = arm64g_calculate_condition(48, v87, v88, 0);
                        if (v91 & 1)
                        {
LABEL_bec39c:
                            v103 = v82 - v78;
                            if (v82 <= v78)
                                goto LABEL_bec4b4;
                            goto LABEL_bec3a4;
                        }
                    }
                    v92 = v22 + v21;
                    v93 = v92 - v67 - v78;
                    v94 = v33 + v80;
                    v95 = v94 + v26 + v25 - v22 - v21 + v73;
                    v96 = v92 + v24 - v23 - v94 - v73 + 2;
                    v97 = v78;
                    while (1)
                    {
                        v98 = v96;
                        v78 = v97 + v80;
                        if (v83 <= v78)
                        {
                            v99 = arm64g_calculate_condition(v86 | 32, v87, v88, 0);
                            v100 = arm64g_calculate_condition(52, (v99 & 1 ? v93 : 0x20000000), (v99 & 1 ? v95 : 0), 0);
                            if (v100 & 1)
                                goto LABEL_bec4a4;
                        }
                        else
                        {
                            v101 = arm64g_calculate_condition(v86 | 32, v87, v88, 0);
                            v102 = arm64g_calculate_condition(48, (v101 & 1 ? v93 : 0x20000000), (v101 & 1 ? v95 : 0), 0);
                            if (v102 & 1)
                            {
LABEL_bec4a4:
                                v84 = 0;
                                v78 = v97;
                                v103 = v82 - v97;
                                if (v97 >= v82)
                                    goto LABEL_bec4b4;
LABEL_bec3a4:
                                if (!(v84 & 1) && !(v104 = v78 + v80, v78 + v80 >= v82 && v103 < v78 + v80 - v82))
                                    goto LABEL_bec500;
LABEL_bec4b4:
                                if (v78 < 2)
                                {
                                    *(unsigned long long *)a0->padding_0 = 0;
                                    return;
                                }
                                else if (v68 - 4 >= v78)
                                {
                                    *(char **)a0->padding_0 = a2;
                                    a0->field_8 = v66 + 1;
                                    a0->field_10 = v5;
                                    return;
                                }
LABEL_bec500:
                                *(unsigned long long *)a0->padding_0 = 0;
                                return;
                            }
                        }
                        v72 -= 1;
                        a2[v66] = v72;
                        v84 = v80 > v98;
                        if (v83 <= v78)
                            goto LABEL_bec39c;
                        v93 -= v80;
                        v95 += v80;
                        v97 = v78;
                        v86 = 4;
                        v87 = v98;
                        v88 = v80;
                        v96 = v98 - v80;
                        if (v80 > v98)
                            goto LABEL_bec39c;
                    }
                }
                if (v39 == v66)
                    break;
                v66 += 1;
                v78 = (unsigned int)v70 / 10;
                v41 = v78;
                if (10 > (unsigned int)v70)
                {
                    a0 = sub_c73e3c(&g_efa9b0);
                    v70 = v41;
                    goto LABEL_bec2f8;
                }
            }
            v105 = v66 + 1;
            v106 = 1;
            while (1)
            {
                v107 = v106;
                if (v105 == 0x11)
                    break;
                v108 = v105;
                v109 = v33 * 10;
                v33 = v109 & v32;
                v110 = v107 * 5;
                v106 = v110 * 2;
                v69 *= 10;
                v111 = (unsigned int)(v109 >> (v29 & 63)) + 48;
                a2[v108] = v111;
                v105 = v108 + 1;
                v112 = v69 - v33;
                v113 = v69;
                v114 = v33;
                if (v69 > v33)
                {
                    v115 = (v27 - v67) * v106;
                    v116 = v115 + v106;
                    v117 = v115 - v106;
                    v118 = v31 > v112;
                    v119 = v117 - v33;
                    if (v33 < v117)
                    {
                        v120 = arm64g_calculate_condition(132, v113, v114, 0);
                        v121 = 4;
                        v122 = (v120 & 1 ? v112 : 0);
                        v123 = (v120 & 1 ? v31 : 0);
                        v124 = arm64g_calculate_condition(52, v122, v123, 0);
                        if (v124 & 1)
                            goto LABEL_bec480;
                    }
                    else
                    {
                        v125 = arm64g_calculate_condition(132, v113, v114, 0);
                        v121 = 0;
                        v122 = (v125 & 1 ? v112 : 0);
                        v123 = (v125 & 1 ? v31 : 0);
                        v126 = arm64g_calculate_condition(48, v122, v123, 0);
                        if (v126 & 1)
                        {
LABEL_bec480:
                            v135 = v116 - v33;
                            if (v116 <= v33)
                                goto LABEL_bec4e4;
                            goto LABEL_bec488;
                        }
                    }
                    v127 = v69 - v31 - v33;
                    v128 = v33;
                    while (1)
                    {
                        v129 = v127;
                        v33 = v128 + v31;
                        v130 = v31 - v117 + v128;
                        if (v117 <= v33)
                        {
                            v131 = arm64g_calculate_condition(v121 | 32, v122, v123, 0);
                            v132 = arm64g_calculate_condition(52, (v131 & 1 ? v119 : 0x20000000), (v131 & 1 ? v130 : 0), 0);
                            if (v132 & 1)
                                goto LABEL_bec4d4;
                        }
                        else
                        {
                            v133 = arm64g_calculate_condition(v121 | 32, v122, v123, 0);
                            v134 = arm64g_calculate_condition(48, (v133 & 1 ? v119 : 0x20000000), (v133 & 1 ? v130 : 0), 0);
                            if (v134 & 1)
                            {
LABEL_bec4d4:
                                v118 = 0;
                                v33 = v128;
                                v135 = v116 - v128;
                                if (v128 >= v116)
                                    goto LABEL_bec4e4;
LABEL_bec488:
                                if (!(v118 & 1) && (v136 = v33 + v31, v136 < v116 || v135 >= v136 - v116))
                                    goto LABEL_bec500;
LABEL_bec4e4:
                                if (v33 < v110 * 4)
                                {
                                    *(unsigned long long *)a0->padding_0 = 0;
                                    return;
                                }
                                else if (v33 > v69 + v107 * 0xffffffffffffffd8)
                                {
                                    *(unsigned long long *)a0->padding_0 = 0;
                                    return;
                                }
                                else
                                {
                                    *(char **)a0->padding_0 = a2;
                                    a0->field_8 = v105;
                                    a0->field_10 = v5;
                                    return;
                                }
                            }
                        }
                        v111 -= 1;
                        a2[v108] = v111;
                        v118 = v31 > v129;
                        if (v117 <= v33)
                            goto LABEL_bec480;
                        v119 -= v31;
                        v128 = v33;
                        v121 = 4;
                        v122 = v129;
                        v123 = v31;
                        v127 = v129 - v31;
                        if (v31 > v129)
                            goto LABEL_bec480;
                    }
                }
            }
            goto LABEL_bec5c8;
        }
        else
        {
            sub_c73b8c(&v2, &v0);
        }
    }
    sub_c73c80("assertion failed: d.mant > 0", 28, &g_efa950);
LABEL_bec550:
    sub_c73c80("assertion failed: d.minus > 0", 29, &g_efa968);
LABEL_bec568:
    sub_c73c80("assertion failed: d.plus > 0", 28, &g_efa980);
LABEL_bec580:
    sub_c73c80("assertion failed: d.mant.checked_add(d.plus).is_some()", 54, &g_efa9f8);
LABEL_bec598:
    sub_c73c80("assertion failed: d.mant.checked_sub(d.minus).is_some()", 55, &g_efa9e0);
LABEL_bec5b0:
    sub_c73c80("assertion failed: d.mant + d.plus < (1 << 61)", 45, &g_efa998);
LABEL_bec5c8:
    sub_c73c94(0x11, 0x11, &g_efa9c8);
    sub_c73c94(v5, 81, &g_efa908);
}
