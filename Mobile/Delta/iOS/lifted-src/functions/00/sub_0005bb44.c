/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5bb44..0x5c638 (2804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5bb44_1 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[2048];
    unsigned long long field_820;
    char padding_828[24];
    long long field_840;
} st_5bb44_1;

typedef struct st_5bb44_0 {
    char field_0;
} st_5bb44_0;

extern unsigned long long g_e69800;
extern unsigned long long g_e69888;

unsigned long long sub_5bb44(st_5bb44_1 *a0)
{
    unsigned int i;  // w22
    unsigned int v5;  // w8
    unsigned int v14;  // w2
    unsigned int v104;  // w8
    unsigned int v105;  // w9
    unsigned int v106;  // w10
    unsigned int v107;  // w9
    unsigned int v108;  // w9
    char v109;  // x9
    unsigned int v110;  // w10
    unsigned int v111;  // w8
    unsigned int v112;  // w10
    char v113;  // x11
    unsigned int v15;  // w16
    char v114;  // x12
    unsigned int v115;  // w8
    unsigned int v116;  // w8
    unsigned int v117;  // w9
    unsigned int v118;  // w8
    unsigned int v119;  // w9
    unsigned int v120;  // w12
    unsigned int v121;  // w10
    unsigned int v122;  // w9
    unsigned int v123;  // w9
    unsigned int v16;  // w9
    unsigned int v124;  // w10
    unsigned int v125;  // w12
    unsigned int v126;  // w14
    unsigned int v127;  // w8
    unsigned int v128;  // w12
    unsigned int v129;  // w8
    unsigned int v130;  // w12
    unsigned int v131;  // w12
    unsigned int v132;  // w11
    unsigned int v133;  // w11
    unsigned int v17;  // w8
    unsigned int v134;  // w11
    unsigned int v135;  // w8
    unsigned int v136;  // w8
    unsigned int v137;  // w8
    unsigned int v138;  // w11
    unsigned int v139;  // w11
    unsigned int v140;  // w10
    unsigned int v141;  // w8
    unsigned long long *v143;  // x8
    unsigned int v18;  // w13
    unsigned int v19;  // w10
    unsigned int v20;  // w17
    unsigned int v21;  // w9
    unsigned int v22;  // w14
    unsigned int v23;  // w12
    unsigned int v6;  // w8
    unsigned int v24;  // w12
    unsigned int v25;  // w0
    unsigned int v26;  // w14
    unsigned int v27;  // w15
    unsigned int v28;  // w12
    unsigned int v29;  // w13
    unsigned int v30;  // w13
    unsigned int v31;  // w17
    unsigned int v32;  // w13
    unsigned int v33;  // w1
    unsigned int v7;  // w8
    unsigned int v34;  // w17
    unsigned int v35;  // w17
    unsigned int v36;  // w4
    unsigned int v37;  // w0
    unsigned int v38;  // w1
    unsigned int v39;  // w13
    unsigned int v40;  // w17
    unsigned long long v41;  // x0
    unsigned int v42;  // w13
    unsigned long long v43;  // 4341
    unsigned long long v8;  // x0
    unsigned long long v44;  // 4112
    unsigned long long v45;  // 4102
    unsigned long long v46;  // 4112
    unsigned long long v47;  // 4102
    unsigned int v48;  // w17
    unsigned int v49;  // w1
    unsigned int v50;  // w3
    unsigned int v51;  // w0
    unsigned int v52;  // w16
    unsigned int v53;  // w5
    unsigned long v9;  // cc_dep1
    unsigned int v54;  // w16
    unsigned int v55;  // w3
    unsigned int v56;  // w4
    unsigned int v57;  // w6
    unsigned int v58;  // w7
    unsigned int v59;  // w2
    unsigned int v60;  // w6
    unsigned int v61;  // w2
    unsigned int v62;  // w7
    unsigned int v63;  // w6
    unsigned long v10;  // cc_dep2
    unsigned int v64;  // w6
    unsigned int v65;  // w5
    unsigned int v66;  // w5
    unsigned int v67;  // w7
    unsigned int v68;  // w6
    unsigned int v69;  // w2
    unsigned int v70;  // w2
    unsigned int v71;  // w5
    unsigned int v72;  // w21
    unsigned int v73;  // w6
    unsigned int v11;  // w27
    unsigned int v74;  // w6
    unsigned int v75;  // w6
    unsigned int v76;  // w2
    unsigned int v77;  // w5
    unsigned int v78;  // w7
    unsigned int v79;  // w2
    unsigned int v80;  // w5
    unsigned int v81;  // w21
    unsigned int v82;  // w21
    unsigned int v83;  // w2
    char *v12;  // x20
    unsigned int v84;  // w2
    unsigned long long v85;  // 4812
    unsigned int v86;  // w17
    unsigned int v87;  // w11
    unsigned int v88;  // w14
    unsigned int v89;  // w14
    unsigned int v90;  // w13
    unsigned int v91;  // w13
    unsigned int v92;  // w17
    unsigned int v93;  // w14
    unsigned int v13;  // w11
    unsigned int v94;  // w14
    unsigned int v95;  // w14
    unsigned int v96;  // w17
    unsigned int v97;  // w17
    unsigned int v98;  // w13
    unsigned int v99;  // w13
    unsigned int v100;  // w13
    unsigned int v101;  // w14
    unsigned int v102;  // w8
    unsigned int v103;  // w8
    st_5bb44_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_5bb44_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (*(int *)&a0->padding_20[0x7f8] >= 1)
    {
        i = 0;
        do
        {
            sub_5a1b8(a0, (&a0->field_18)[i]);
            v5 = (i | 1) + i + (i + ~i * 2 + 1 | 1);
            v6 = (v5 | 1) + (v5 & 1) + (v5 | 0xfffffffe) + ((unsigned int)(0xfffffffd - v5 - (v5 | 0xfffffffe)) ^ v5 + 2) + ((unsigned int)(0xfffffffd - v5 - (v5 | 0xfffffffe)) & v5 + 2) * 2;
            v7 = (v6 + 1 ^ 0xfffffffe) - (((v6 + 1) * 2 | v6 + 1 >> 31) & 2 & 3);
            i = ((v6 * 2 + 4 | ~v7) ^ v7 + 1) + (v7 | v6 * 2 + 4) + ((v6 * 2 + 4 | ~v7) & v7 + 1) * 2;
        } while ((int)i < *(int *)&a0->padding_20[0x7f8]);
    }
    v8 = sub_5a1b8(a0, a0->field_840);
    v9 = *(int *)&a0->padding_828[0];
    v10 = 1;
    if (*(int *)&a0->padding_828[0] < 1)
        return v8;
    v11 = 0;
    while (1)
    {
        v12 = a0->field_820 + v11 * 16;
        v13 = *v12;
        v14 = v13 * 2;
        v15 = ~v14 + v13;
        v16 = (v15 + ~(v15 + v13)) * 2;
        v17 = v13 + 1;
        v18 = v14 + 2;
        v19 = v13 ^ 1;
        v20 = v14 & 2;
        v21 = v20 + v19;
        v22 = ((~v21 + v21 * 2) * 2 & 4) + (~v21 + v21 * 2 ^ 2);
        v23 = (unsigned int)(v18 + v16 + (v16 | (unsigned int)(0x7ffffffe - v13)) - (v16 & v17)) * 2;
        v24 = v23 + v22 + 2 + ((unsigned int)(0xfffffffd - v23) & -v22) + (v23 + v22 + 2 + ((unsigned int)(0xfffffffd - v23) | -v22) | ~(v23 + v22 + 2 + ((unsigned int)(0xfffffffd - v23) & -v22))) + (v23 + v22 + 2 + ((unsigned int)(0xfffffffd - v23) & -v22) | v23 + v22 + 2 + ((unsigned int)(0xfffffffd - v23) | -v22)) + 1;
        v25 = (unsigned int)(v24 * 4 + ~v24 * 2 - (v24 * 2 + (v24 & 0xfffffffe))) + (v24 * 2 | 3);
        v26 = ~v13;
        v27 = v13 - 1;
        v28 = v26 * 4;
        v29 = ((~(v18 + v28 + v27 + v20 + (v20 ^ 2)) + (v18 + v28 + v27 + v20 + (v20 ^ 2)) * 2 | 1) - (1 & ~(v18 + v28 + v27 + v20 + (v20 ^ 2))) + (v18 + v28 + v27 + v20 + (v20 ^ 2) - (~(v18 + v28 + v27 + v20 + (v20 ^ 2)) + (v18 + v28 + v27 + v20 + (v20 ^ 2)) * 2 | 1)) * 2) * 2;
        v30 = v17 | v29;
        v31 = (v29 + v17 ^ -v30) + (v29 + v17 & -v30) * 2;
        v32 = (v31 ^ v30 + 1) + (v31 & v30 + 1) * 2;
        v33 = 1 - v32;
        v34 = (v33 & v32 - 1) * 4 + (v33 ^ v32 - 1) * 2;
        v35 = (v34 + ~v34 * 2 ^ 0xfffffffe) - v32 + 1;
        v36 = v25 + 1;
        v37 = v32 - 2 & v25;
        v38 = v33 + v36 + v37 + (v33 | ~v25);
        v39 = v38 - (v32 + ~v37) + (v38 & v32 + ~v37) * 2 + (v32 + ~v37 & ~v38) * 2 + 1;
        v40 = (0xffffffff ^ v39 * 2) + v39 * 4 + (v35 | ~v25) + v36 + (v35 ^ v25) + ((v35 | ~v25) ^ v36) + ((v35 | ~v25) & v36) * 2 + (-(((v35 | ~v25) ^ v36) + ((v35 | ~v25) & v36) * 2) & ~((v35 | ~v25) + v36 + (v35 ^ v25))) * 2 + (unsigned int)((v35 | ~v25) + v36 + (v35 ^ v25) - (((v35 | ~v25) ^ v36) + ((v35 | ~v25) & v36) * 2) - ((v35 | ~v25) + v36 + (v35 ^ v25) | -(((v35 | ~v25) ^ v36) + ((v35 | ~v25) & v36) * 2))) * 2;
        v41 = v40 + ~v40 * 2 + 1;
        v42 = v13 & 252;
        v43 = arm64g_calculate_condition(0x11, v41 & 0xffffffff, v40 * 2, 0);
        if (v43 & 1)
        {
            v44 = arm64g_calculate_condition(19, v9, v10, 0);
            v45 = arm64g_calculate_condition(3, (v44 & 1 ? v42 : 0), (v44 & 1 ? 4 : 0), 0);
            if (v45 & 1)
                goto LABEL_5be94;
        }
        else
        {
            v46 = arm64g_calculate_condition(19, v9, v10, 0);
            v47 = arm64g_calculate_condition(0, (v46 & 1 ? v42 : 0), (v46 & 1 ? 4 : 0), 0);
            if (v47 & 1)
                goto LABEL_5be94;
        }
        v48 = v13 & 1;
        v49 = v13 | 1;
        v50 = (v49 + v48 - 2 | 1) + (v49 + v48 - 2 ^ 0xfffffffe) + v49 + v48 - 2 + (1 & ~(v49 + v48 - 2)) + 1 + ((unsigned int)(0xfffffffe - ((v49 + v48 - 2 ^ 0xfffffffe) + v49 + v48 - 2 + (1 & ~(v49 + v48 - 2)))) | ~(v49 + v48 - 2 | 1)) + ((v49 + v48 - 2 ^ 0xfffffffe) + v49 + v48 - 2 + (1 & ~(v49 + v48 - 2)) + 1 & (v49 + v48 - 2 | 1)) + 1;
        v51 = 0xfffffffe - v13;
        v52 = v13 + v15 * 2 + (v51 | ~(v15 * 2)) + (v15 * 2 & v17);
        v53 = v52 + 3 + v50 + (v52 + 3 + ~(v52 + 2) * 2 | ~v50) + (v50 + v52 + 2 ^ -(v50 | v52 + 2)) + (v50 + v52 + 2 & -(v50 | v52 + 2)) * 2;
        v54 = v26 * 2;
        v55 = v17 + v54;
        v56 = v27 * 2;
        v57 = (v56 & 4) + (v27 ^ 2) - v13 + (-((v56 & 4) + (v27 ^ 2)) | v13) + ((v56 & 4) + (v27 ^ 2) - 1 & v26);
        v58 = v57 - 1;
        v59 = v55 + v14 - v57 * 2 + (v58 ^ 1) + 1;
        v60 = v59 + (__ROL__(v58, 1) & 2 & 3);
        v61 = v53 + (1 & ~v59) + (~v60 | 1) + (unsigned int)((v53 | (1 & ~v59) + (~v60 | 1)) - (v53 + (1 & ~v59) + (~v60 | 1))) * 2;
        v62 = -v60;
        v63 = (v60 & v62) * 4 + (v60 ^ v62) * 2 | 1;
        v64 = (v63 ^ v62) + (v63 & v62) * 2;
        v65 = v53 + (~v64 + v64 * 2 | ~v53) + (~v64 + v64 * 2 ^ v53);
        v66 = (v65 + ~((v64 ^ v53) + (v64 & v53) * 2) + ((v64 ^ v53) + (v64 & v53) * 2) * 2) * 2 + ((-((v64 ^ v53) + (v64 & v53) * 2) | ~v65) + (v64 ^ v53) + (v64 & v53) * 2 + (-((v64 ^ v53) + (v64 & v53) * 2) & ~v65)) * 4 + 2;
        v67 = v61 + 1;
        v68 = v66 + v61 + (v67 + ~v61 * 2 & ~v66);
        v69 = (v66 | ~v61) + v67 + (v66 ^ v61);
        v70 = v68 + ((unsigned int)(0xfffffffe - v68) | v69) + (v68 + 1 | v69);
        v71 = v70 + 2;
        v71 *= 2;
        v72 = v71 + ~v71;
        v73 = v70 + v71 + ((unsigned int)(0xfffffffe - v70) | 1) + (v71 | 0xfffffffe) + v72 + 3;
        v74 = ((v73 & v71) + v72 + (v73 & v72) - (((v73 & v71) + v72 + (v73 & v72)) * 2 + 2) | 0xfffffffd) + ~((v73 & v71) + v72 + (v73 & v72)) + (((v73 & v71) + v72 + (v73 & v72)) * 2 + 2 + ~((v73 & v71) + v72 + (v73 & v72))) * 2;
        v75 = v74 - (v74 + 1 | 0xfffffffd) + (v74 + 1 & 2) * 2 + (v74 - (v74 + 1 | 0xfffffffd) | ~(v74 + 1 & 2)) + ((unsigned int)(3 - (v74 - (v74 + 1 | 0xfffffffd))) | ~(v74 + 1 & 2)) + 2;
        v76 = v70 + 1;
        v77 = (0xffffffff ^ v71 * 4) + v71 + 2;
        v78 = v77 ^ v76;
        v79 = v78 + (v77 & v76) * 2;
        v80 = ~v79 + v79 * 2;
        v81 = (v80 - v79 ^ v80 - 1) - (v80 - v79 & -v80) * 2;
        v82 = v81 + (0xffffffff ^ v81 * 2);
        v83 = (v78 & 1) + (v80 | 1) + (v79 - (v80 | 1)) * 2 + v82 * 4;
        v84 = (v75 | v82 * 2 - v83) + (v83 + ~(v82 * 2)) * 2 + (v75 & v82 * 2 - v83);
        v85 = arm64g_calculate_condition(1, ((v84 | 1) + (v84 & 1) + 2) * 3 + ~((v84 | 1) + (v84 & 1) + 2) * 2, 1, 0);
        if (v85 & 1)
        {
            if (!v48)
                v86 = 0;
            else
                v86 = v49 * 2;
            v87 = v26 | 1;
            v88 = (v87 & -v55) * 4 + (v87 ^ -v55) * 2;
            v89 = (v49 ^ -v48) + v86 + ~v88 + v88 * 2;
            v90 = ~((v56 & 2) + (v27 ^ 1)) * 4 + ((v56 & 2) + (v27 ^ 1)) * 2 + 2;
            v91 = (v90 | (unsigned int)(0xfffffffe - v89)) + v89 + 2 + (v90 ^ ~(v89 + 2) + (v89 + 2) * 2) + (v90 + ~(v89 + 2) + (v89 + 2) * 2 ^ -(v90 | ~(v89 + 2) + (v89 + 2) * 2)) + (v90 + ~(v89 + 2) + (v89 + 2) * 2 & -(v90 | ~(v89 + 2) + (v89 + 2) * 2)) * 2;
            v92 = v91 * 2;
            v93 = (v91 ^ 1) + ~v91 * 2 + (v92 & 2);
            v94 = v93 + (~v93 | 0xfffffffd);
            v95 = v94 + 3;
            v96 = v91 + ~v92;
            v41 = -v96;
            v97 = v95 + v96;
            v98 = v97 + (((unsigned int)(0x7ffffffd - (v94 + 1)) & (unsigned int)v41) + (v95 & v91 + 1)) * 2;
            v99 = v98 + (0xfffffffc & ~(v98 * 2)) + ((~v97 | 0x7ffffffe) + v98) * 2 + 4;
            v100 = v99 + ~v99 * 2 + v99 * 2;
            v101 = v100 + 1;
            v102 = -((v19 + (v17 + v87) * 2 ^ ~v54 + v28 + 2) + (v19 + (v17 + v87) * 2 & ~v54 + v28 + 2) * 2);
            v103 = v21 + (-v21 | 1) + (v21 - 1 | 1) + (v102 - v102 * 2) * 2;
            v104 = (v103 - 1) * 3 - v103 * 2;
            v105 = (v104 ^ ~(v104 + 1)) * 2 - v104 + (v104 + 1 & ~v104) * 4;
            v106 = v105 - 2;
            v107 = v106 + (v101 & -v105) + 1;
            v108 = (v107 & ~v100) * 4 + (v100 ^ ~v107) * 2;
            v109 = (char)(~v108 - (v101 ^ v106)) + ((char)v101 & (char)~v106) * 2 + (char)v108 * 2 + 2;
            v110 = ~v101;
            v111 = v101 + v110 * 2 + 1 | ~v104;
            v112 = v101 * 3 + v110 * 4;
            v113 = 0xfffffffd - v112;
            v114 = (char)v111 + (v113 & (char)~v111) * 2;
            v115 = (v111 + ((unsigned int)(0x7ffffffd - v112) | ~v111)) * 2 + 2;
            *v12 = (char)((unsigned int)(v115 - (v113 - v114 & 0xff)) * 4 - v109) + (v113 - v114 + (char)~v115 + v109) * 2;
        }
        else
        {
            v120 = -v55;
            v121 = ((2 & ~v13) + (v13 ^ 0xfffffffd) & v120) * 4 + ((2 & ~v13) + (v13 ^ 0xfffffffd) ^ v120) * 2 | 1;
            v122 = (v121 ^ v13 ^ 2) + (v121 & (v13 ^ 2)) * 2;
            v123 = v122 - v122 * 2 + v122 * 4 + ~v122 * 2;
            v124 = v123 + 1;
            v125 = ((v48 ^ 1) + (v13 ^ 0xfffffffe) ^ v120) + ((v48 ^ 1) + (v13 ^ 0xfffffffe) & v120) * 2;
            v126 = v26 | 0xfffffffe;
            v127 = v17 + v126 + v125 + ((unsigned int)(0xfffffffe - (v17 + v126)) | ~v125) + (v125 & v17 + v126 + 1);
            v128 = v127 + 2;
            v129 = ((1 & ~v128) + (v128 ^ 0xfffffffe) ^ v127 + 3) + ((1 & ~v128) + (v128 ^ 0xfffffffe) & v127 + 3) * 2;
            v130 = (v128 | 1) + 1;
            v131 = v13 + ((__ROL__(v51, 1) & 2 & 3) + (v51 ^ 1)) * 2;
            v132 = v126 - (v13 | 0xfffffffe) - v131;
            v133 = (v131 + 1 & 0xfffffffe) + v132 * 2 + ((unsigned int)(1 - v132) | v131 + 1 & 0xfffffffe) + ((unsigned int)(1 - v132) | ~(v131 + 1 & 0xfffffffe)) - 2;
            v134 = (unsigned int)(v133 * 2 + (v133 ^ 0xfffffffe) - (v133 * 2 & 2)) + (v129 ^ v130) + 2;
            v135 = (v134 + (v129 & v130) * 2 | 1) + (v134 & 1) - 2;
            v136 = (v135 ^ 1) + ~v135 * 2 + (__ROL__(v135, 1) & 2 & 3);
            v137 = (v136 * 2 & 4) + (v136 ^ 2);
            v138 = ~v137 + v137 * 2;
            v139 = ((v138 | v124 - v124 * 2) ^ -(v124 - v124 * 2)) + ((v138 | v124 - v124 * 2) & -(v124 - v124 * 2)) * 2;
            break;
        }
LABEL_5be94:
        v116 = (unsigned int)(v11 + (~v11 | 0xfffffffd) - (v11 & 2)) + (v11 & 2) * 2 + 5;
        v117 = ~v116;
        v118 = v117 + v116 * 2;
        v119 = ((v117 * 2 | v117 >> 31) & 2 & 3) + (v118 ^ 1) - 2;
        v11 = ~(((v119 + (0xffffffff ^ v119 * 2) ^ -(v118 * 2)) - (v119 + (0xffffffff ^ v119 * 2) & v118 * 2 - 1) * 2 | 1) + (v119 + (0xffffffff ^ v119 * 2) & 1));
        v9 = *(int *)&a0->padding_828[0];
        v10 = v11;
        if (*(int *)&a0->padding_828[0] <= (int)v11)
            return v41;
    }
    v140 = v137 + (-v137 | ~v123) + v124;
    v141 = (v140 + v123 + v137) * 2 - v140 * 4;
    v143 = &g_e69800;
    if (((v138 | v123) + v139 + ~v139 * 2 - v141 + ((v138 | v123) + v139 + ~v139 * 2 + 2 & (v141 | 1)) * 2 + ((unsigned int)(0x7ffffffd - ((v138 | v123) + v139 + ~v139 * 2)) & (v141 | 1)) * 2 + 2) * 2 - 2 != (v138 | v123) + v139 + ~v139 * 2 - v141 + ((v138 | v123) + v139 + ~v139 * 2 + 2 & (v141 | 1)) * 2 + ((unsigned int)(0x7ffffffd - ((v138 | v123) + v139 + ~v139 * 2)) & (v141 | 1)) * 2 + 2)
    {
        v143 = &g_e69888;
        if (v42 != 40)
            v143 = &g_e69800;
    }
    goto *((void *)(*v143));
}
