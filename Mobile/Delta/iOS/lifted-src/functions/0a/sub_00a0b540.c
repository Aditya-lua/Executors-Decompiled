/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0b540..0xa0c110 (3024 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0b540_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
    char field_8;
    char field_9;
    char field_a;
    char field_b;
    char field_c;
    char field_d;
    char field_e;
    char field_f;
    char field_10;
    char field_11;
    char field_12;
    char field_13;
    char field_14;
    char field_15;
    char field_16;
    char field_17;
    char field_18;
    char field_19;
    char field_1a;
    char field_1b;
    char field_1c;
    char field_1d;
    char field_1e;
    char field_1f;
} st_a0b540_0;


st_a0b540_0 * sub_a0b540(st_a0b540_0 *a0, void* a1, void* a2, void* a3)
{
    unsigned long v19;  // x8
    unsigned int v20;  // w14
    unsigned int v29;  // w17
    unsigned long long v119;  // x5
    long long v120;  // x4
    long long v121;  // x5
    long long v122;  // x0
    unsigned long long v123;  // x6
    long long v124;  // x8
    long long v125;  // x25
    long long v126;  // x9
    long long v127;  // x5
    long long v128;  // x7
    unsigned long v30;  // x24
    long long v129;  // x15
    unsigned long long v130;  // x21
    long long v131;  // x5
    unsigned long long v132;  // x15
    long long v133;  // x9
    unsigned long long v134;  // x4
    unsigned long long v135;  // x5
    long long v136;  // x9
    unsigned long long v137;  // x6
    unsigned long long v138;  // x7
    unsigned long long v31;  // x16
    long long v139;  // x9
    long long v140;  // x24
    long long v141;  // x11
    long long v142;  // x8
    long long v143;  // x25
    long long v144;  // x26
    long long v145;  // x9
    long long v146;  // x20
    long long v147;  // x27
    long long v148;  // x0
    unsigned long v32;  // x25
    long long v149;  // x1
    long long v150;  // x3
    long long v151;  // x12
    long long v152;  // x0
    long long v153;  // x11
    long long v154;  // x1
    long long v155;  // x28
    long long v156;  // x20
    long long v157;  // x23
    long long v158;  // x20
    unsigned long long v33;  // x20
    long long v159;  // x24
    long long v160;  // x17
    long long v161;  // x0
    long long v162;  // x27
    long long v163;  // x0
    long long v164;  // x4
    long long v165;  // x5
    long long v166;  // x15
    long long v167;  // x4
    long long v168;  // x4
    unsigned long v34;  // x21
    long long v169;  // x6
    long long v170;  // x7
    long long v171;  // x22
    long long v172;  // x0
    long long v173;  // x23
    long long v174;  // x17
    long long v175;  // x15
    long long v176;  // x9
    long long v177;  // x12
    long long v178;  // x11
    unsigned long v35;  // x9
    unsigned long long v179;  // x8
    long long v180;  // x1
    unsigned long long v181;  // x2
    unsigned long long v182;  // x13
    unsigned long long v183;  // x16
    unsigned long long v184;  // x13
    unsigned long long v185;  // x14
    unsigned long long v186;  // x10
    unsigned long long v187;  // x13
    unsigned long long v188;  // x10
    unsigned long v36;  // x27
    unsigned long long v189;  // x9
    unsigned long long v190;  // x10
    unsigned long long v191;  // x11
    long long v192;  // x10
    unsigned long long v193;  // x9
    unsigned long v37;  // x9
    unsigned long long v38;  // x7
    unsigned long v21;  // x8
    unsigned long v39;  // x15
    unsigned long v40;  // x9
    unsigned int v41;  // w12
    unsigned int v42;  // w5
    unsigned int v43;  // w11
    unsigned int v44;  // w28
    unsigned long v45;  // x16
    unsigned int v46;  // w0
    unsigned int v47;  // w4
    unsigned long v48;  // x24
    unsigned long long v22;  // x0
    unsigned int v49;  // w24
    unsigned int v50;  // w25
    unsigned long long v51;  // x7
    unsigned int v52;  // w6
    unsigned int v53;  // w19
    unsigned int v54;  // w21
    unsigned int v55;  // w20
    unsigned long v56;  // x9
    unsigned int v57;  // w22
    unsigned int v58;  // w8
    unsigned long v23;  // x4
    unsigned int v59;  // w23
    unsigned int v60;  // w10
    unsigned int v61;  // w13
    unsigned int v62;  // w16
    unsigned int v63;  // w27
    unsigned int v64;  // w9
    unsigned int v65;  // w26
    unsigned long long v66;  // x8
    unsigned long long v67;  // x10
    unsigned long long v68;  // x15
    unsigned long long v24;  // x6
    unsigned long v69;  // x10
    unsigned long long v70;  // x10
    unsigned int v71;  // w7
    unsigned int v72;  // w2
    unsigned int v73;  // w11
    unsigned int v74;  // w1
    unsigned long long v75;  // x8
    unsigned long long v76;  // x12
    unsigned long long v77;  // x17
    unsigned long long v78;  // x10
    unsigned long v25;  // x19
    unsigned long long v79;  // x3
    unsigned long long v80;  // x16
    unsigned long long v81;  // x3
    unsigned long long v82;  // x12
    unsigned long long v83;  // x3
    unsigned long long v84;  // x9
    unsigned long long v85;  // x8
    unsigned long long v86;  // x10
    unsigned long long v87;  // x8
    unsigned long long v88;  // x7
    unsigned long v26;  // x9
    unsigned long long v89;  // x24
    unsigned long long v90;  // x25
    unsigned long long v91;  // x9
    unsigned long long v92;  // x24
    unsigned long long v93;  // x9
    unsigned long long v94;  // x13
    unsigned long long v95;  // x7
    unsigned int v96;  // w21
    unsigned long long v97;  // x17
    unsigned long long v98;  // x11
    unsigned long v27;  // x26
    unsigned long long v99;  // x14
    unsigned long long v100;  // x15
    unsigned long long v101;  // x12
    unsigned long long v102;  // x6
    unsigned long long v103;  // x12
    unsigned long long v104;  // x0
    unsigned long long v105;  // x1
    unsigned long long v106;  // x5
    unsigned long long v107;  // x23
    long long v108;  // x17
    unsigned long v28;  // x9
    unsigned long long v109;  // x27
    unsigned long long v110;  // x20
    unsigned long long v111;  // x28
    long long v112;  // x26
    unsigned long long v113;  // x1
    long long v114;  // x20
    long long v115;  // x22
    long long v116;  // x12
    unsigned long long v117;  // x0
    long long v118;  // x11
    unsigned long long v0;  // [bp-0xf0]
    unsigned long long v1;  // [bp-0xe8]
    unsigned long long v2;  // [bp-0xe0]
    unsigned long long v3;  // [bp-0xd8]
    unsigned long long v4;  // [bp-0xd0]
    unsigned long long v5;  // [bp-0xc8]
    unsigned long long v6;  // [bp-0xc0]
    unsigned long v7;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long v8;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0xa8]
    unsigned long long v10;  // [bp-0xa0]
    unsigned long long v11;  // [bp-0x98]
    unsigned long long v12;  // [bp-0x90]
    unsigned long long v13;  // [bp-0x88]
    unsigned long long v14;  // [bp-0x80]
    unsigned long long v15;  // [bp-0x70]
    unsigned long long v16;  // [bp-0x68]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = (char)a1[2];
    v20 = (*(short *)a1 | ((unsigned int)v19 * 0x10000 | (unsigned int)(v19 >> 48)) & 0x1f0000) & 0x1fffff;
    v21 = (int)a1[2];
    v22 = (unsigned int)(v21 >> 24) | (char)a1[6] * 0x100 | (char)a1[7] * 0x10000;
    v23 = (int)a1[10];
    v24 = (unsigned int)(v23 >> 24) | (char)a1[14] * 0x100 | (char)a1[15] * 0x10000;
    v25 = (int)a1[15];
    v26 = (char)a1[23];
    v27 = (int)a1[23];
    v15 = (unsigned int)(v27 >> 24) | (char)a1[27] * 0x100 | (char)a1[28] * 0x10000;
    v28 = (char)a2[2];
    v29 = (*(short *)a2 | ((unsigned int)v28 * 0x10000 | (unsigned int)(v28 >> 48)) & 0x1f0000) & 0x1fffff;
    v30 = (int)a2[2];
    v31 = (unsigned int)(v30 >> 24) | (char)a2[6] * 0x100 | (char)a2[7] * 0x10000;
    v32 = (int)a2[10];
    v33 = (unsigned int)(v32 >> 24) | (char)a2[14] * 0x100 | (char)a2[15] * 0x10000;
    v34 = (int)a2[15];
    v35 = (char)a2[23];
    v36 = (int)a2[23];
    v37 = (char)a3[2];
    v14 = (*(short *)a3 | (v37 * 0x10000 | v37 >> 48) & 0x1f0000) & 0x1fffff;
    v8 = (int)a3[2];
    v9 = (unsigned int)(v36 >> 24) | (char)a2[27] * 0x100 | (char)a2[28] * 0x10000;
    v38 = (unsigned int)(v8 >> 24) | (char)a3[6] * 0x100 | (char)a3[7] * 0x10000;
    v39 = (int)a3[10];
    v10 = (unsigned int)(v39 >> 24) | (char)a3[14] * 0x100 | (char)a3[15] * 0x10000;
    v40 = (int)a3[15];
    v12 = v40 >> 24 | (char)a3[19] * 0x100 | (char)a3[20] * 0x10000;
    v7 = (int)a3[23];
    v6 = (unsigned int)(v7 >> 24) | (char)a3[27] * 0x100 | (char)a3[28] * 0x10000;
    v41 = ((unsigned int)v21 * 0 | (unsigned int)(v21 >> 5)) & 0x1fffff;
    v42 = ((unsigned int)v22 * 0 | (unsigned int)(v22 >> 2)) & 0x1fffff;
    v43 = ((unsigned int)v30 * 0 | (unsigned int)(v30 >> 5)) & 0x1fffff;
    v44 = ((unsigned int)v31 * 0 | (unsigned int)(v31 >> 2)) & 0x1fffff;
    v16 = v43 * v41 + v29 * v42 + v44 * v20 + ((v38 * 0x4000000000000000 | v38 >> 2) & 0xc0000000001fffff & 0x1fffff);
    v45 = (int)a1[7];
    v46 = ((unsigned int)v45 * 0 | (unsigned int)(v45 >> 7)) & 0x1fffff;
    v47 = ((unsigned int)v23 * 0 | (unsigned int)(v23 >> 4)) & 0x1fffff;
    v48 = (int)a2[7];
    v49 = ((unsigned int)v48 * 0 | (unsigned int)(v48 >> 7)) & 0x1fffff;
    v50 = ((unsigned int)v32 * 0 | (unsigned int)(v32 >> 4)) & 0x1fffff;
    v51 = v43 * v46 + v29 * v47 + v49 * v41 + v20 * v50 + v44 * v42 + ((v39 * 0x1000000000000000 | v39 >> 4) & 0xf0000000001fffff & 0x1fffff);
    v52 = ((unsigned int)v24 * 0 | (unsigned int)(v24 >> 1)) & 0x1fffff;
    v53 = ((unsigned int)v25 * 0 | (unsigned int)(v25 >> 6)) & 0x1fffff;
    v54 = ((unsigned int)v34 * 0 | (unsigned int)(v34 >> 6)) & 0x1fffff;
    v55 = ((unsigned int)v33 * 0 | (unsigned int)(v33 >> 1)) & 0x1fffff;
    v13 = v52 * v43 + v29 * v53 + v49 * v46 + v42 * v50 + v44 * v47 + v20 * v54 + v55 * v41 + ((v40 * 0x400000000000000 | v40 >> 6) & 0xfc000000001fffff & 0x1fffff);
    v56 = (char)a3[23];
    v57 = (v25 >> 24 | (char)a1[19] * 0x100 | (char)a1[20] * 0x10000) >> 3;
    v58 = ((short)a1[21] | ((unsigned int)v26 * 0x10000 | (unsigned int)(v26 >> 48)) & 0x1f0000) & 0x1fffff;
    v59 = (v34 >> 24 | (char)a2[19] * 0x100 | (char)a2[20] * 0x10000) >> 3;
    v60 = ((short)a2[21] | ((unsigned int)v35 * 0x10000 | (unsigned int)(v35 >> 48)) & 0x1f0000) & 0x1fffff;
    v11 = v57 * v43 + v29 * v58 + v52 * v49 + v50 * v47 + v44 * v53 + v42 * v54 + v55 * v46 + v59 * v41 + v60 * v20 + (short)a3[21] + ((v56 * 0x10000 | v56 >> 48) & 0x1f0000 & 0x1fffff);
    v61 = ((unsigned int)v27 * 0 | (unsigned int)(v27 >> 5)) & 0x1fffff;
    w30 = ((unsigned int)v15 * 0 | (unsigned int)(v15 >> 2)) & 0x1fffff;
    v62 = v58;
    v63 = ((unsigned int)v36 * 0 | (unsigned int)(v36 >> 5)) & 0x1fffff;
    v64 = v60;
    v65 = ((unsigned int)v9 * 0 | (unsigned int)(v9 >> 2)) & 0x1fffff;
    v9 = v43 * v61 + v29 * w30 + v57 * v49 + v50 * v53 + v44 * v58 + v54 * v47 + v55 * v52 + v59 * v46 + v63 * v41 + v60 * v42 + v65 * v20 + ((v6 * 0x4000000000000000 | v6 >> 2) & 0xc0000000001fffff & 0x1fffff);
    v66 = v14 + v29 * v20;
    v67 = v66 + 0x100000;
    v68 = v20 * v43 + v29 * v41 + ((v8 * 0x800000000000000 | v8 >> 5) & 0xf8000000001fffff & 0x1fffff) + (v67 >> 21);
    v14 = v66 - (v67 & 0xfffffe00000);
    v69 = (int)a3[7];
    v3 = v42 * v43 + v29 * v46 + v20 * v49 + v44 * v41 + ((v69 * 0x200000000000000 | v69 >> 7) & 0xfe000000001fffff & 0x1fffff);
    v70 = v51 + 0x100000;
    v15 = v43 * v47 + v29 * v52 + v42 * v49 + v50 * v41 + v44 * v46 + v55 * v20 + ((v10 * 0x8000000000000000 | v10 >> 1) & 0x80000000001fffff & 0x1fffff) + (v70 >> 21);
    v10 = v51 - (v70 & 0xffffffffffe00000);
    v6 = v43 * v53 + v29 * v57 + v49 * v47 + v50 * v46 + v44 * v52 + v54 * v41 + v55 * v42 + v59 * v20 + (v12 >> 3);
    v5 = v62 * v43 + v29 * v61 + v49 * v53 + v52 * v50 + v44 * v57 + v54 * v46 + v55 * v47 + v59 * v42 + v20 * v63 + v64 * v41 + ((v7 * 0x800000000000000 | v7 >> 5) & 0xf8000000001fffff & 0x1fffff);
    v71 = (unsigned int)((int)a1[28]) >> 7;
    v72 = (unsigned int)((int)a2[28]) >> 7;
    v73 = v62;
    v74 = v64;
    v4 = w30 * v43 + v29 * v71 + v62 * v49 + v57 * v50 + v44 * v61 + v52 * v54 + v55 * v53 + v59 * v47 + v42 * v63 + v64 * v46 + v20 * v72 + v65 * v41 + ((unsigned int)((int)a3[28]) >> 7);
    v1 = w30 * v49 + v50 * v61 + v44 * v71;
    v2 = v43 * v71 + v49 * v61 + v62 * v50 + v44 * w30 + v54 * v53 + v55 * v57 + v59 * v52 + v63 * v46 + v64 * v47 + v72 * v41;
    v75 = v59 * v71 + v63 * v61 + v74 * w30 + v57 * v72 + v65 * v73;
    v76 = v75 + 0x100000;
    v77 = w30 * v63 + v74 * v71 + v73 * v72 + v65 * v61 + (v76 >> 21);
    v78 = v63 * v71 + v72 * v61 + v65 * w30;
    v79 = v78 + 0x100000;
    v80 = w30 * v72 + v65 * v71 + (v79 >> 21);
    v0 = v78 - (v79 & 0x1ffffffe00000);
    v81 = v72 * v71;
    v82 = v81 + 0x100000;
    v7 = v68 + 0x100000;
    v8 = v68 - (v7 & 0xffffffffffe00000);
    v83 = v16 + 0x100000;
    v84 = v3 + (v83 >> 21);
    v85 = v84 + 0x100000;
    v12 = v10 + (v85 >> 21);
    v10 = v84 - (v85 & 0xffffffffffe00000);
    v86 = w30 * v54 + v55 * v71 + v59 * v61 + v57 * v63 + v74 * v73 + v52 * v72 + v65 * v53;
    v87 = v86 + 0x100000;
    v88 = v54 * v71 + v59 * w30 + v73 * v63 + v74 * v61 + v72 * v53 + v65 * v57 + (v87 >> 21);
    v89 = v88 + 0x100000;
    v90 = v75 - (v76 & 0xffffffffffe00000) + (v89 >> 21);
    v3 = v88 - (v89 & 0xffffffffffe00000);
    v91 = v77 + 0x100000;
    v92 = v0 + (v91 >> 21);
    v93 = v77 - (v91 & 0xffffffffffe00000);
    v94 = v80 + 0x100000;
    v95 = v81 - (v82 & 0x7ffffffe00000) + (v94 >> 21);
    v80 -= v94 & 0x1ffffffe00000;
    v96 = v82 >> 21;
    v97 = v2 + v65 * v42;
    v98 = v49 * v71 + w30 * v50 + v73 * v54 + v55 * v61 + v59 * v57 + v52 * v63 + v74 * v53 + v72 * v46 + v65 * v47;
    v99 = v98 + 0x100000;
    v100 = v50 * v71 + v54 * v61 + v55 * w30 + v59 * v73 + v63 * v53 + v74 * v57 + v72 * v47 + v65 * v52 + (v99 >> 21);
    v101 = v97 + 0x100000;
    v102 = v1 + v57 * v54 + v55 * v73 + v59 * v53 + v63 * v47 + v74 * v52 + v42 * v72 + v65 * v46 + (v101 >> 21);
    v103 = v13 + 0x100000;
    v104 = v6 + (v103 >> 21);
    v105 = v104 + 0x100000;
    v106 = v11 + 0x100000;
    v107 = v5 + (v106 >> 21);
    v108 = 666643 * v92 + 470296 * v93 + 654183 * v90 + (v105 >> 21) + v11 - (v106 & 0xffffffffffe00000);
    v109 = v107 + 0x100000;
    v110 = v9 + 0x100000;
    v111 = v4 + (v110 >> 21);
    v112 = 666643 * v95 + 470296 * v80 + 654183 * v92 + 0xfffffffffff0c653 * v93 + 136657 * v90 + (v109 >> 21) + v9 - (v110 & 0xffffffffffe00000);
    v113 = v15 + 0x100000;
    v114 = v13 + 666643 * v90 - (v103 & 0xffffffffffe00000) + (v113 >> 21);
    v115 = v114 + 0x100000;
    v116 = 666643 * v93 + 470296 * v90 + v104 + (v115 >> 21) - (v105 & 0xffffffffffe00000);
    v117 = v111 + 0x100000;
    v118 = 654183 * v95 + v96 * 470296 + 0xfffffffffff0c653 * v80 + v97 + 136657 * v92 + 0xfffffffffff59083 * v93 - (v101 & 0xffffffffffe00000) + (v117 >> 21);
    v119 = v102 + 0x100000;
    v120 = v98 + v96 * -0xf39ad + 136657 * v95 + 0xfffffffffff59083 * v80 - (v99 & 0xffffffffffe00000) + (v119 >> 21);
    v121 = v118 + 0x100000;
    v122 = 0xfffffffffff0c653 * v95 + v96 * 654183 + 136657 * v80 + 0xfffffffffff59083 * v92 + v102 - (v119 & 0xffffffffffe00000) + (v121 >> 21);
    v123 = v100 + 0x100000;
    v124 = v86 + v96 * -0xa6f7d - (v87 & 0xffffffffffe00000) + (v123 >> 21);
    v125 = v112 + 0x100000;
    v126 = 470296 * v95 + v96 * 666643 + 654183 * v80 + 0xfffffffffff0c653 * v92 + 136657 * v93 + 0xfffffffffff59083 * v90 + v111 - (v117 & 0xffffffffffe00000) + (v125 >> 21);
    v127 = v120 + 0x100000;
    v128 = 0xfffffffffff59083 * v95 + v96 * 136657 + v100 - (v123 & 0xffffffffffe00000) + (v127 >> 21);
    v129 = v124 + 0x100000;
    v130 = v3 + (v129 >> 21);
    v131 = v126 + 0x100000;
    v132 = v118 - (v121 & 0xffffffffffe00000) + (v131 >> 21);
    v133 = v122 + 0x100000;
    v134 = v120 - (v127 & 0xffffffffffe00000) + (v133 >> 21);
    v135 = v122 - (v133 & 0xffffffffffe00000);
    v136 = v128 + 0x100000;
    v137 = v124 - (v129 & 0xffffffffffe00000) + (v136 >> 21);
    v138 = v128 - (v136 & 0xffffffffffe00000);
    v139 = v108 + 0x100000;
    v140 = 666643 * v80 + 470296 * v92 + 654183 * v93 + 0xfffffffffff0c653 * v90 + v107 - (v109 & 0xffffffffffe00000) + (v139 >> 21);
    v141 = v140 + 0x100000;
    v142 = 0xfffffffffff59083 * v130 + (v141 >> 21) + v112 - (v125 & 0xffffffffffe00000);
    v143 = v116 + 0x100000;
    v144 = 0xfffffffffff0c653 * v130 + 136657 * v137 + 0xfffffffffff59083 * v138 + (v143 >> 21) + v108 - (v139 & 0xffffffffffe00000);
    v145 = v14 + 666643 * v132;
    v146 = v145 + 0x100000;
    v147 = v8 + 470296 * v132 + 666643 * v135 + (v146 >> 21);
    v148 = v114 + 470296 * v130 - (v115 & 0xffffffffffe00000) + 654183 * v137 + 0xfffffffffff0c653 * v138 + 136657 * v134 + 0xfffffffffff59083 * v135;
    v149 = v148 + 0x100000;
    v150 = 654183 * v130 + 0xfffffffffff0c653 * v137 + 136657 * v138 + v116 - (v143 & 0xffffffffffe00000) + 0xfffffffffff59083 * v134 + (v149 >> 21);
    v151 = v144 + 0x100000;
    v152 = 136657 * v130 + 0xfffffffffff59083 * v137 + v140 - (v141 & 0xffffffffffe00000) + (v151 >> 21);
    v153 = v142 + 0x100000;
    v154 = v126 - (v131 & 0xffffffffffe00000) + (v153 >> 21);
    v155 = v147 + 0x100000;
    v156 = v150 + 0x100000;
    v157 = v152 + 0x100000;
    v158 = v154 + 0x100000;
    v159 = v158 >> 21;
    v160 = v16 + (v7 >> 21) - (v83 & 0xffffffffffe00000) + 654183 * v132 + 666643 * v134 + 470296 * v135;
    v161 = v160 + 0x100000;
    v162 = v10 + 666643 * v138 + 0xfffffffffff0c653 * v132 + 470296 * v134 + 654183 * v135 + (v161 >> 21);
    v163 = v162 + 0x100000;
    v164 = v12 + 666643 * v137 + 470296 * v138 + 136657 * v132 + 654183 * v134 + 0xfffffffffff0c653 * v135;
    v165 = v164 + 0x100000;
    v166 = v15 + 666643 * v130 - (v113 & 0xffffffffffe00000) + 470296 * v137 + 654183 * v138 + 0xfffffffffff59083 * v132 + 0xfffffffffff0c653 * v134 + 136657 * v135 + (v165 >> 21);
    v167 = v166 + 0x100000;
    v168 = v145 - (v146 & 0xffffffffffe00000) + 666643 * v159;
    v169 = v147 + 470296 * v159 - (v155 & 0xffffffffffe00000) + (v168 >> 21);
    v170 = v160 + 654183 * v159 - (v161 & 0xffffffffffe00000) + (v155 >> 21) + (v169 >> 21);
    v171 = v162 + 0xfffffffffff0c653 * v159 - (v163 & 0xffffffffffe00000) + (v170 >> 21);
    v172 = v164 + 136657 * v159 - (v165 & 0xffffffffffe00000) + (v163 >> 21) + (v171 >> 21);
    v173 = v166 + 0xfffffffffff59083 * v159 - (v167 & 0xffffffffffe00000) + (v172 >> 21);
    v174 = v148 - (v149 & 0xffffffffffe00000) + (v167 >> 21) + (v173 >> 21);
    v175 = v150 - (v156 & 0xffffffffffe00000) + (v174 >> 21);
    v176 = v144 - (v151 & 0xffffffffffe00000) + (v156 >> 21) + (v175 >> 21);
    v177 = v152 - (v157 & 0xffffffffffe00000) + (v176 >> 21);
    v178 = v142 + (v157 >> 21) - (v153 & 0xffffffffffe00000) + (v177 >> 21);
    v179 = v154 - (v158 & 0xffffffffffe00000) + (v178 >> 21);
    v180 = (long long)(v179) >> 21;
    v181 = (v168 & 0x1fffff) + 666643 * v180;
    a0->field_1 = v181 >> 8;
    v182 = (v169 & 0x1fffff) + 470296 * v180 + ((long long)(v181) >> 21);
    a0->field_0 = v181;
    a0->field_2 = ((char)v181 * 0 | (char)(v181 >> 16)) & 31 | (char)(__ROL__((unsigned int)v182, 5)) & 224;
    a0->field_3 = v182 >> 3;
    a0->field_4 = v182 >> 11;
    v183 = (v170 & 0x1fffff) + 654183 * v180 + ((long long)(v182) >> 21);
    a0->field_5 = (char)(__ROL__((unsigned int)v182, 13)) & 3 | (char)v183 * 4;
    a0->field_6 = v183 >> 6;
    v184 = (v171 & 0x1fffff) + 0xfffffffffff0c653 * v180 + ((long long)(v183) >> 21);
    a0->field_7 = (char)(__ROL__((unsigned int)v183, 18)) & 127 | (char)v184 * 128;
    a0->field_8 = v184 >> 1;
    a0->field_9 = v184 >> 9;
    v185 = (v172 & 0x1fffff) + 136657 * v180 + ((long long)(v184) >> 21);
    a0->field_a = (char)(__ROL__((unsigned int)v184, 15)) & 15 | (char)v185 * 16;
    a0->field_b = v185 >> 4;
    a0->field_c = v185 >> 12;
    v186 = (v173 & 0x1fffff) + 0xfffffffffff59083 * v180 + ((long long)(v185) >> 21);
    a0->field_d = (char)(__ROL__((unsigned int)v185, 12)) & 1 | (char)v186 * 2;
    a0->field_e = v186 >> 7;
    v187 = (v174 & 0x1fffff) + ((long long)(v186) >> 21);
    a0->field_f = (char)(__ROL__((unsigned int)v186, 0x11)) & 63 | (char)v187 * 64;
    a0->field_10 = v187 >> 2;
    a0->field_11 = v187 >> 10;
    v188 = (v175 & 0x1fffff) + ((long long)(v187) >> 21);
    a0->field_12 = (char)(__ROL__((unsigned int)v187, 14)) & 7 | (char)v188 * 8;
    a0->field_13 = v188 >> 5;
    v189 = (v176 & 0x1fffff) + ((long long)(v188) >> 21);
    a0->field_14 = v188 >> 13;
    a0->field_16 = v189 >> 8;
    v190 = (v177 & 0x1fffff) + ((long long)(v189) >> 21);
    v191 = (v178 & 0x1fffff) + ((long long)(v190) >> 21);
    a0->field_15 = v189;
    a0->field_17 = ((char)v189 * 0 | (char)(v189 >> 16)) & 31 | (char)(__ROL__((unsigned int)v190, 5)) & 224;
    a0->field_18 = v190 >> 3;
    a0->field_19 = v190 >> 11;
    a0->field_1a = (char)(__ROL__((unsigned int)v190, 13)) & 3 | (char)v191 * 4;
    a0->field_1b = v191 >> 6;
    v192 = (long long)(v191) >> 21;
    v193 = v192 + (v179 & 0x1fffff);
    a0->field_1c = (char)(__ROL__((unsigned int)v191, 18)) & 127 | (char)v193 * 128;
    a0->field_1d = (int)v192 + (unsigned int)v179 >> 1;
    a0->field_1e = v193 >> 9;
    a0->field_1f = v193 >> 0x11;
    return a0;
}
