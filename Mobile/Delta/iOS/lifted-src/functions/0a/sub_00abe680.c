/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabe680..0xabf4c0 (3648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_df81c0;
extern unsigned int g_f0d568;

unsigned int * sub_abe680(unsigned int *a0, unsigned int *i, unsigned long a2)
{
    unsigned long long v19;  // x30
    unsigned long long v20;  // x19
    unsigned long long v29;  // x28
    unsigned long long v119;  // x27
    unsigned int v120;  // w15
    unsigned int v121;  // w28
    unsigned int v122;  // w17
    unsigned long v123;  // x26
    unsigned long long v124;  // x22
    unsigned long long v125;  // x13
    unsigned long long v126;  // x26
    unsigned int v127;  // w0
    unsigned int v128;  // w19
    unsigned long v30;  // x20
    unsigned int v129;  // w17
    unsigned long v130;  // x25
    unsigned long long v131;  // x21
    unsigned long long v132;  // x14
    unsigned long v133;  // x15
    unsigned long v134;  // x0
    unsigned int *v135;  // x1
    unsigned long long v136;  // x25
    unsigned int v137;  // w6
    unsigned int v138;  // w28
    unsigned long v31;  // x21
    unsigned int v139;  // w17
    unsigned long v140;  // x24
    unsigned long long v141;  // x20
    unsigned long long v142;  // x15
    unsigned long long v143;  // x24
    unsigned int v144;  // w7
    unsigned int v145;  // w19
    unsigned int v146;  // w17
    unsigned long v147;  // x23
    unsigned long long v148;  // x27
    unsigned long v32;  // x22
    unsigned long long v149;  // x0
    unsigned long v150;  // x1
    unsigned long v151;  // x2
    unsigned long long v152;  // x23
    unsigned int v153;  // w8
    unsigned int v154;  // w28
    unsigned int v155;  // w17
    unsigned long v156;  // x22
    unsigned long long v157;  // x26
    unsigned long long v158;  // x1
    unsigned long v33;  // x23
    unsigned long v159;  // x6
    unsigned long long v160;  // x22
    unsigned int v161;  // w9
    unsigned int v162;  // w19
    unsigned int v163;  // w17
    unsigned long v164;  // x21
    unsigned long long v165;  // x25
    unsigned long long v166;  // x2
    unsigned long v167;  // x7
    unsigned long long v168;  // x21
    unsigned long v34;  // x24
    unsigned int v169;  // w28
    unsigned long v170;  // x20
    unsigned long long v171;  // x24
    unsigned long long v172;  // x19
    unsigned long long v173;  // x20
    unsigned long long v174;  // x3
    unsigned long v175;  // x8
    unsigned int v176;  // w19
    unsigned long v177;  // x27
    unsigned long long v178;  // x23
    unsigned long v35;  // x25
    unsigned long long v179;  // x27
    unsigned long long v180;  // x4
    unsigned long v181;  // x9
    unsigned int v182;  // w28
    unsigned long v183;  // x26
    unsigned long long v184;  // x22
    unsigned long long v185;  // x26
    unsigned long long v186;  // x5
    unsigned long v187;  // x10
    unsigned int v188;  // w19
    unsigned long v36;  // x26
    unsigned long v189;  // x25
    unsigned long long v190;  // x21
    unsigned long long v191;  // x25
    unsigned long long v192;  // x6
    unsigned long v193;  // x11
    unsigned int v194;  // w28
    unsigned long v195;  // x24
    unsigned long long v196;  // x20
    unsigned long long v197;  // x24
    unsigned long long v198;  // x7
    unsigned long v37;  // x27
    unsigned long v199;  // x12
    unsigned int v200;  // w19
    unsigned long v201;  // x23
    unsigned long long v202;  // x27
    unsigned long long v203;  // x23
    unsigned long long v204;  // x8
    unsigned long v205;  // x13
    unsigned int v206;  // w28
    unsigned long v207;  // x22
    unsigned long long v208;  // x26
    unsigned long v38;  // x3
    unsigned long long v209;  // x22
    unsigned long long v210;  // x9
    unsigned long v211;  // x14
    unsigned int v212;  // w19
    unsigned long v213;  // x21
    unsigned long long v214;  // x25
    unsigned long long v215;  // x21
    unsigned long long v216;  // x10
    unsigned long v217;  // x15
    unsigned int v218;  // w28
    unsigned long long v21;  // x20
    unsigned long v39;  // x4
    unsigned long v219;  // x20
    unsigned long long v220;  // x24
    unsigned long long v221;  // x20
    unsigned long v222;  // x0
    unsigned int v223;  // w19
    unsigned long v224;  // x27
    unsigned long long v225;  // x23
    unsigned long long v226;  // x27
    unsigned long v227;  // x1
    unsigned int v228;  // w28
    unsigned int *v40;  // x1
    unsigned long v229;  // x26
    unsigned long long v230;  // x22
    unsigned long long v231;  // x26
    unsigned long v232;  // x2
    unsigned int v233;  // w19
    unsigned long v234;  // x25
    unsigned long long v235;  // x21
    unsigned long long v236;  // x25
    unsigned long v237;  // x3
    unsigned int v238;  // w28
    unsigned long long v41;  // x3
    unsigned long v239;  // x24
    unsigned long long v240;  // x20
    unsigned long long v241;  // x24
    unsigned int v242;  // w19
    unsigned long v243;  // x23
    unsigned int v244;  // w28
    unsigned long v245;  // x22
    unsigned int v246;  // w19
    unsigned long v247;  // x21
    unsigned long v248;  // x20
    unsigned int v42;  // w6
    unsigned long v249;  // x7
    unsigned long v250;  // x8
    unsigned long v251;  // x9
    unsigned long v252;  // x10
    unsigned int v43;  // w19
    unsigned int v44;  // w17
    unsigned long v45;  // x27
    unsigned long long v46;  // x23
    unsigned long long v47;  // x4
    unsigned long v48;  // x5
    unsigned long long v22;  // x21
    unsigned long v49;  // x6
    unsigned int *v50;  // x1
    unsigned long long v51;  // x27
    unsigned int v52;  // w7
    unsigned int v53;  // w28
    unsigned int v54;  // w17
    unsigned long v55;  // x26
    unsigned long long v56;  // x22
    unsigned long long v57;  // x5
    unsigned long long v58;  // x26
    unsigned long long v23;  // x22
    unsigned int v59;  // w8
    unsigned int v60;  // w19
    unsigned int v61;  // w17
    unsigned long v62;  // x25
    unsigned long long v63;  // x21
    unsigned long long v64;  // x6
    unsigned long v65;  // x7
    unsigned long v66;  // x8
    unsigned int *v67;  // x1
    unsigned long long v68;  // x25
    unsigned long long v24;  // x23
    unsigned int v69;  // w9
    unsigned int v70;  // w28
    unsigned int v71;  // w17
    unsigned long v72;  // x24
    unsigned long long v73;  // x20
    unsigned long long v74;  // x7
    unsigned long long v75;  // x24
    unsigned int v76;  // w10
    unsigned int v77;  // w19
    unsigned int v78;  // w17
    unsigned long long v25;  // x24
    unsigned long v79;  // x23
    unsigned long long v80;  // x27
    unsigned long long v81;  // x8
    unsigned long v82;  // x9
    unsigned long v83;  // x10
    unsigned int *v84;  // x1
    unsigned long long v85;  // x23
    unsigned int v86;  // w11
    unsigned int v87;  // w28
    unsigned int v88;  // w17
    unsigned long long v26;  // x25
    unsigned long v89;  // x22
    unsigned long long v90;  // x26
    unsigned long long v91;  // x9
    unsigned long long v92;  // x22
    unsigned int v93;  // w12
    unsigned int v94;  // w19
    unsigned int v95;  // w17
    unsigned long v96;  // x21
    unsigned long long v97;  // x25
    unsigned long long v98;  // x10
    unsigned long long v27;  // x26
    unsigned long v99;  // x11
    unsigned long v100;  // x12
    unsigned int *v101;  // x1
    unsigned long long v102;  // x21
    unsigned int v103;  // w13
    unsigned int v104;  // w28
    unsigned int v105;  // w17
    unsigned long v106;  // x20
    unsigned long long v107;  // x24
    unsigned long long v108;  // x11
    unsigned long long v28;  // x27
    unsigned long long v109;  // x20
    unsigned int v110;  // w14
    unsigned int v111;  // w19
    unsigned int v112;  // w17
    unsigned long v113;  // x27
    unsigned long long v114;  // x23
    unsigned long long v115;  // x12
    unsigned long v116;  // x13
    unsigned long v117;  // x14
    unsigned int *v118;  // x1
    unsigned int v0;  // [bp-0x90]
    unsigned int v1;  // [bp-0x8c]
    unsigned int v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x84]
    char *v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    unsigned long long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    unsigned long long v12;  // [bp-0x40]
    unsigned long long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x30]
    unsigned long long v15;  // [bp-0x28]
    unsigned int *v16;  // [bp-0x18]
    unsigned int *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    if (g_f0d568 & 16)
        goto LABEL_0xabf4c0;
    if (g_f0d568 & 1)
        goto LABEL_0xabf6b0;
    v4 = &v18;
    v5 = v19;
    v6 = v20;
    v7 = v21;
    v8 = v22;
    v9 = v23;
    v10 = v24;
    v11 = v25;
    v12 = v26;
    v13 = v27;
    v14 = v28;
    v15 = v29;
    v30 = *a0;
    v31 = a0[1];
    v32 = a0[2];
    v33 = a0[3];
    v34 = a0[4];
    v35 = a0[5];
    v36 = a0[6];
    v37 = a0[7];
    x30 = (int)&g_df81c0;
    v16 = &i[16 * a2];
    do
    {
        v38 = *i;
        v39 = i[1];
        v40 = i + 2;
        x30 = x30 + 4;
        v17 = v40;
        v41 = (((((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v42 = (unsigned int)v34 ^ ((unsigned int)v34 * 0x40000 | (unsigned int)v34 >> 14);
        v43 = (unsigned int)v30 ^ (unsigned int)v31;
        v44 = (unsigned int)v30 ^ ((unsigned int)v30 * 0x800000 | (unsigned int)v30 >> 9);
        v45 = v37 + *(int *)x30 + v41 + ((unsigned int)v35 & (unsigned int)v34 | (unsigned int)v36 & ~(unsigned int)v34) + (((unsigned int)v34 * 0x4000000 | (unsigned int)v34 >> 6) ^ (v42 * 0x200000 | v42 >> 11));
        v46 = v33 + v45;
        x30 = x30 + 4;
        v47 = (((((v39 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v39 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v39 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v39 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v48 = *v40;
        v49 = v40[1];
        v50 = v40 + 2;
        v51 = v45 + (((unsigned int)v31 ^ (unsigned int)v32) & v43 ^ (unsigned int)v31) + (((unsigned int)v30 * 0x40000000 | (unsigned int)v30 >> 2) ^ (v44 * 0x80000 | v44 >> 13));
        v52 = (unsigned int)v46 ^ ((unsigned int)v46 * 0x40000 | (unsigned int)v46 >> 14);
        v53 = (unsigned int)v51 ^ (unsigned int)v30;
        v54 = (unsigned int)v51 ^ ((unsigned int)v51 * 0x800000 | (unsigned int)v51 >> 9);
        v55 = v36 + *(int *)x30 + v47 + ((unsigned int)v34 & (unsigned int)v46 | (unsigned int)v35 & ~(unsigned int)v46) + (((unsigned int)v46 * 0x4000000 | (unsigned int)v46 >> 6) ^ (v52 * 0x200000 | v52 >> 11));
        v56 = v32 + v55;
        x30 = x30 + 4;
        v57 = (((((v48 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v48 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v48 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v48 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v58 = v55 + (v43 & v53 ^ (unsigned int)v30) + (((unsigned int)v51 * 0x40000000 | (unsigned int)v51 >> 2) ^ (v54 * 0x80000 | v54 >> 13));
        v59 = (unsigned int)v56 ^ ((unsigned int)v56 * 0x40000 | (unsigned int)v56 >> 14);
        v60 = (unsigned int)v58 ^ (unsigned int)v51;
        v61 = (unsigned int)v58 ^ ((unsigned int)v58 * 0x800000 | (unsigned int)v58 >> 9);
        v62 = v35 + *(int *)x30 + v57 + ((unsigned int)v46 & (unsigned int)v56 | (unsigned int)v34 & ~(unsigned int)v56) + (((unsigned int)v56 * 0x4000000 | (unsigned int)v56 >> 6) ^ (v59 * 0x200000 | v59 >> 11));
        v63 = v31 + v62;
        x30 = x30 + 4;
        v64 = (((((v49 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v49 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v49 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v49 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v65 = *v50;
        v66 = v50[1];
        v67 = v50 + 2;
        v68 = v62 + (v53 & v60 ^ (unsigned int)v51) + (((unsigned int)v58 * 0x40000000 | (unsigned int)v58 >> 2) ^ (v61 * 0x80000 | v61 >> 13));
        v69 = (unsigned int)v63 ^ ((unsigned int)v63 * 0x40000 | (unsigned int)v63 >> 14);
        v70 = (unsigned int)v68 ^ (unsigned int)v58;
        v71 = (unsigned int)v68 ^ ((unsigned int)v68 * 0x800000 | (unsigned int)v68 >> 9);
        v72 = v34 + *(int *)x30 + v64 + ((unsigned int)v56 & (unsigned int)v63 | (unsigned int)v46 & ~(unsigned int)v63) + (((unsigned int)v63 * 0x4000000 | (unsigned int)v63 >> 6) ^ (v69 * 0x200000 | v69 >> 11));
        v73 = v30 + v72;
        x30 = x30 + 4;
        v74 = (((((v65 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v65 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v65 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v65 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v75 = v72 + (v60 & v70 ^ (unsigned int)v58) + (((unsigned int)v68 * 0x40000000 | (unsigned int)v68 >> 2) ^ (v71 * 0x80000 | v71 >> 13));
        v76 = (unsigned int)v73 ^ ((unsigned int)v73 * 0x40000 | (unsigned int)v73 >> 14);
        v77 = (unsigned int)v75 ^ (unsigned int)v68;
        v78 = (unsigned int)v75 ^ ((unsigned int)v75 * 0x800000 | (unsigned int)v75 >> 9);
        v79 = v46 + *(int *)x30 + v74 + ((unsigned int)v63 & (unsigned int)v73 | (unsigned int)v56 & ~(unsigned int)v73) + (((unsigned int)v73 * 0x4000000 | (unsigned int)v73 >> 6) ^ (v76 * 0x200000 | v76 >> 11));
        v80 = v51 + v79;
        x30 = x30 + 4;
        v81 = (((((v66 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v66 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v66 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v66 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v82 = *v67;
        v83 = v67[1];
        v84 = v67 + 2;
        v85 = v79 + (v70 & v77 ^ (unsigned int)v68) + (((unsigned int)v75 * 0x40000000 | (unsigned int)v75 >> 2) ^ (v78 * 0x80000 | v78 >> 13));
        v86 = (unsigned int)v80 ^ ((unsigned int)v80 * 0x40000 | (unsigned int)v80 >> 14);
        v87 = (unsigned int)v85 ^ (unsigned int)v75;
        v88 = (unsigned int)v85 ^ ((unsigned int)v85 * 0x800000 | (unsigned int)v85 >> 9);
        v89 = v56 + *(int *)x30 + v81 + ((unsigned int)v73 & (unsigned int)v80 | (unsigned int)v63 & ~(unsigned int)v80) + (((unsigned int)v80 * 0x4000000 | (unsigned int)v80 >> 6) ^ (v86 * 0x200000 | v86 >> 11));
        v90 = v58 + v89;
        x30 = x30 + 4;
        v91 = (((((v82 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v82 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v82 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v82 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v92 = v89 + (v77 & v87 ^ (unsigned int)v75) + (((unsigned int)v85 * 0x40000000 | (unsigned int)v85 >> 2) ^ (v88 * 0x80000 | v88 >> 13));
        v93 = (unsigned int)v90 ^ ((unsigned int)v90 * 0x40000 | (unsigned int)v90 >> 14);
        v94 = (unsigned int)v92 ^ (unsigned int)v85;
        v95 = (unsigned int)v92 ^ ((unsigned int)v92 * 0x800000 | (unsigned int)v92 >> 9);
        v96 = v63 + *(int *)x30 + v91 + ((unsigned int)v80 & (unsigned int)v90 | (unsigned int)v73 & ~(unsigned int)v90) + (((unsigned int)v90 * 0x4000000 | (unsigned int)v90 >> 6) ^ (v93 * 0x200000 | v93 >> 11));
        v97 = v68 + v96;
        x30 = x30 + 4;
        v98 = (((((v83 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v83 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v83 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v83 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v99 = *v84;
        v100 = v84[1];
        v101 = v84 + 2;
        v102 = v96 + (v87 & v94 ^ (unsigned int)v85) + (((unsigned int)v92 * 0x40000000 | (unsigned int)v92 >> 2) ^ (v95 * 0x80000 | v95 >> 13));
        v103 = (unsigned int)v97 ^ ((unsigned int)v97 * 0x40000 | (unsigned int)v97 >> 14);
        v104 = (unsigned int)v102 ^ (unsigned int)v92;
        v105 = (unsigned int)v102 ^ ((unsigned int)v102 * 0x800000 | (unsigned int)v102 >> 9);
        v106 = v73 + *(int *)x30 + v98 + ((unsigned int)v90 & (unsigned int)v97 | (unsigned int)v80 & ~(unsigned int)v97) + (((unsigned int)v97 * 0x4000000 | (unsigned int)v97 >> 6) ^ (v103 * 0x200000 | v103 >> 11));
        v107 = v75 + v106;
        x30 = x30 + 4;
        v108 = (((((v99 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v99 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v99 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v99 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v109 = v106 + (v94 & v104 ^ (unsigned int)v92) + (((unsigned int)v102 * 0x40000000 | (unsigned int)v102 >> 2) ^ (v105 * 0x80000 | v105 >> 13));
        v110 = (unsigned int)v107 ^ ((unsigned int)v107 * 0x40000 | (unsigned int)v107 >> 14);
        v111 = (unsigned int)v109 ^ (unsigned int)v102;
        v112 = (unsigned int)v109 ^ ((unsigned int)v109 * 0x800000 | (unsigned int)v109 >> 9);
        v113 = v80 + *(int *)x30 + v108 + ((unsigned int)v97 & (unsigned int)v107 | (unsigned int)v90 & ~(unsigned int)v107) + (((unsigned int)v107 * 0x4000000 | (unsigned int)v107 >> 6) ^ (v110 * 0x200000 | v110 >> 11));
        v114 = v85 + v113;
        x30 = x30 + 4;
        v115 = (((((v100 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v100 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v100 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v100 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v116 = *v101;
        v117 = v101[1];
        v118 = v101 + 2;
        v119 = v113 + (v104 & v111 ^ (unsigned int)v102) + (((unsigned int)v109 * 0x40000000 | (unsigned int)v109 >> 2) ^ (v112 * 0x80000 | v112 >> 13));
        v120 = (unsigned int)v114 ^ ((unsigned int)v114 * 0x40000 | (unsigned int)v114 >> 14);
        v121 = (unsigned int)v119 ^ (unsigned int)v109;
        v122 = (unsigned int)v119 ^ ((unsigned int)v119 * 0x800000 | (unsigned int)v119 >> 9);
        v123 = v90 + *(int *)x30 + v115 + ((unsigned int)v107 & (unsigned int)v114 | (unsigned int)v97 & ~(unsigned int)v114) + (((unsigned int)v114 * 0x4000000 | (unsigned int)v114 >> 6) ^ (v120 * 0x200000 | v120 >> 11));
        v124 = v92 + v123;
        x30 = x30 + 4;
        v125 = (((((v116 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v116 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v116 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v116 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v126 = v123 + (v111 & v121 ^ (unsigned int)v109) + (((unsigned int)v119 * 0x40000000 | (unsigned int)v119 >> 2) ^ (v122 * 0x80000 | v122 >> 13));
        v127 = (unsigned int)v124 ^ ((unsigned int)v124 * 0x40000 | (unsigned int)v124 >> 14);
        v128 = (unsigned int)v126 ^ (unsigned int)v119;
        v129 = (unsigned int)v126 ^ ((unsigned int)v126 * 0x800000 | (unsigned int)v126 >> 9);
        v130 = v97 + *(int *)x30 + v125 + ((unsigned int)v114 & (unsigned int)v124 | (unsigned int)v107 & ~(unsigned int)v124) + (((unsigned int)v124 * 0x4000000 | (unsigned int)v124 >> 6) ^ (v127 * 0x200000 | v127 >> 11));
        v131 = v102 + v130;
        x30 = x30 + 4;
        v132 = (((((v117 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v117 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v117 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v117 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v133 = *v118;
        v134 = v118[1];
        v135 = v118 + 2;
        v136 = v130 + (v121 & v128 ^ (unsigned int)v119) + (((unsigned int)v126 * 0x40000000 | (unsigned int)v126 >> 2) ^ (v129 * 0x80000 | v129 >> 13));
        v3 = v64;
        v137 = (unsigned int)v131 ^ ((unsigned int)v131 * 0x40000 | (unsigned int)v131 >> 14);
        v138 = (unsigned int)v136 ^ (unsigned int)v126;
        v139 = (unsigned int)v136 ^ ((unsigned int)v136 * 0x800000 | (unsigned int)v136 >> 9);
        v140 = v107 + *(int *)x30 + v132 + ((unsigned int)v124 & (unsigned int)v131 | (unsigned int)v114 & ~(unsigned int)v131) + (((unsigned int)v131 * 0x4000000 | (unsigned int)v131 >> 6) ^ (v137 * 0x200000 | v137 >> 11));
        v141 = v109 + v140;
        x30 = x30 + 4;
        v142 = (((((v133 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v133 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v133 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v133 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v143 = v140 + (v128 & v138 ^ (unsigned int)v126) + (((unsigned int)v136 * 0x40000000 | (unsigned int)v136 >> 2) ^ (v139 * 0x80000 | v139 >> 13));
        v0 = v74;
        v144 = (unsigned int)v141 ^ ((unsigned int)v141 * 0x40000 | (unsigned int)v141 >> 14);
        v145 = (unsigned int)v143 ^ (unsigned int)v136;
        v146 = (unsigned int)v143 ^ ((unsigned int)v143 * 0x800000 | (unsigned int)v143 >> 9);
        v147 = v114 + *(int *)x30 + v142 + ((unsigned int)v131 & (unsigned int)v141 | (unsigned int)v124 & ~(unsigned int)v141) + (((unsigned int)v141 * 0x4000000 | (unsigned int)v141 >> 6) ^ (v144 * 0x200000 | v144 >> 11));
        v148 = v119 + v147;
        x30 = x30 + 4;
        v149 = (((((v134 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v134 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v134 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v134 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v150 = *v135;
        v151 = v135[1];
        v152 = v147 + (v138 & v145 ^ (unsigned int)v136) + (((unsigned int)v143 * 0x40000000 | (unsigned int)v143 >> 2) ^ (v146 * 0x80000 | v146 >> 13));
        v1 = v81;
        v153 = (unsigned int)v148 ^ ((unsigned int)v148 * 0x40000 | (unsigned int)v148 >> 14);
        v154 = (unsigned int)v152 ^ (unsigned int)v143;
        v155 = (unsigned int)v152 ^ ((unsigned int)v152 * 0x800000 | (unsigned int)v152 >> 9);
        v156 = v124 + *(int *)x30 + v149 + ((unsigned int)v141 & (unsigned int)v148 | (unsigned int)v131 & ~(unsigned int)v148) + (((unsigned int)v148 * 0x4000000 | (unsigned int)v148 >> 6) ^ (v153 * 0x200000 | v153 >> 11));
        v157 = v126 + v156;
        x30 = x30 + 4;
        v158 = (((((v150 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v150 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v150 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v150 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v159 = v3;
        v160 = v156 + (v145 & v154 ^ (unsigned int)v143) + (((unsigned int)v152 * 0x40000000 | (unsigned int)v152 >> 2) ^ (v155 * 0x80000 | v155 >> 13));
        v2 = v91;
        v161 = (unsigned int)v157 ^ ((unsigned int)v157 * 0x40000 | (unsigned int)v157 >> 14);
        v162 = (unsigned int)v160 ^ (unsigned int)v152;
        v163 = (unsigned int)v160 ^ ((unsigned int)v160 * 0x800000 | (unsigned int)v160 >> 9);
        v164 = v131 + *(int *)x30 + v158 + ((unsigned int)v148 & (unsigned int)v157 | (unsigned int)v141 & ~(unsigned int)v157) + (((unsigned int)v157 * 0x4000000 | (unsigned int)v157 >> 6) ^ (v161 * 0x200000 | v161 >> 11));
        v165 = v136 + v164;
        x30 = x30 + 4;
        v166 = (((((v151 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v151 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v151 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v151 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v167 = v0;
        v168 = v164 + (v154 & v162 ^ (unsigned int)v152) + (((unsigned int)v160 * 0x40000000 | (unsigned int)v160 >> 2) ^ (v163 * 0x80000 | v163 >> 13));
        v3 = v98;
        v169 = (unsigned int)v168 ^ (unsigned int)v160;
        v170 = v141 + *(int *)x30 + v166 + ((unsigned int)v157 & (unsigned int)v165 | (unsigned int)v148 & ~(unsigned int)v165) + (((unsigned int)v165 * 0x4000000 | (unsigned int)v165 >> 6) ^ ((unsigned int)v165 * 0x200000 | (unsigned int)v165 >> 11) ^ ((unsigned int)v165 * 128 | (unsigned int)v165 >> 25));
        v171 = v143 + v170;
        v172 = *(int *)x30;
        x30 = x30 + 4;
        v173 = v170 + (v162 & v169 ^ (unsigned int)v160) + (((unsigned int)v168 * 0x40000000 | (unsigned int)v168 >> 2) ^ ((unsigned int)v168 * 0x80000 | (unsigned int)v168 >> 13) ^ ((unsigned int)v168 * 0x400 | (unsigned int)v168 >> 22));
        v174 = v41 + v115 + (((unsigned int)v47 * 0x2000000 | (unsigned int)v47 >> 7) ^ ((unsigned int)v47 * 0x4000 | (unsigned int)v47 >> 18) ^ (unsigned int)v47 >> 3) + (((unsigned int)v158 * 0x8000 | (unsigned int)v158 >> 0x11) ^ ((unsigned int)v158 * 0x2000 | (unsigned int)v158 >> 19) ^ (unsigned int)v158 >> 10);
        do
        {
            v175 = v1;
            v0 = v108;
            v176 = (unsigned int)v173 ^ (unsigned int)v168;
            v177 = v148 + v172 + v174 + ((unsigned int)v165 & (unsigned int)v171 | (unsigned int)v157 & ~(unsigned int)v171) + (((unsigned int)v171 * 0x4000000 | (unsigned int)v171 >> 6) ^ ((unsigned int)v171 * 0x200000 | (unsigned int)v171 >> 11) ^ ((unsigned int)v171 * 128 | (unsigned int)v171 >> 25));
            v178 = v152 + v177;
            x30 = x30 + 4;
            v179 = v177 + (v169 & v176 ^ (unsigned int)v168) + (((unsigned int)v173 * 0x40000000 | (unsigned int)v173 >> 2) ^ ((unsigned int)v173 * 0x80000 | (unsigned int)v173 >> 13) ^ ((unsigned int)v173 * 0x400 | (unsigned int)v173 >> 22));
            v180 = v47 + v125 + (((unsigned int)v57 * 0x2000000 | (unsigned int)v57 >> 7) ^ ((unsigned int)v57 * 0x4000 | (unsigned int)v57 >> 18) ^ (unsigned int)v57 >> 3) + (((unsigned int)v166 * 0x8000 | (unsigned int)v166 >> 0x11) ^ ((unsigned int)v166 * 0x2000 | (unsigned int)v166 >> 19) ^ (unsigned int)v166 >> 10);
            v181 = v2;
            v1 = v115;
            v182 = (unsigned int)v179 ^ (unsigned int)v173;
            v183 = v157 + *(int *)x30 + v180 + ((unsigned int)v171 & (unsigned int)v178 | (unsigned int)v165 & ~(unsigned int)v178) + (((unsigned int)v178 * 0x4000000 | (unsigned int)v178 >> 6) ^ ((unsigned int)v178 * 0x200000 | (unsigned int)v178 >> 11) ^ ((unsigned int)v178 * 128 | (unsigned int)v178 >> 25));
            v184 = v160 + v183;
            x30 = x30 + 4;
            v185 = v183 + (v176 & v182 ^ (unsigned int)v173) + (((unsigned int)v179 * 0x40000000 | (unsigned int)v179 >> 2) ^ ((unsigned int)v179 * 0x80000 | (unsigned int)v179 >> 13) ^ ((unsigned int)v179 * 0x400 | (unsigned int)v179 >> 22));
            v186 = v57 + v132 + (((unsigned int)v159 * 0x2000000 | (unsigned int)v159 >> 7) ^ ((unsigned int)v159 * 0x4000 | (unsigned int)v159 >> 18) ^ (unsigned int)v159 >> 3) + (((unsigned int)v174 * 0x8000 | (unsigned int)v174 >> 0x11) ^ ((unsigned int)v174 * 0x2000 | (unsigned int)v174 >> 19) ^ (unsigned int)v174 >> 10);
            v187 = v3;
            v2 = v125;
            v188 = (unsigned int)v185 ^ (unsigned int)v179;
            v189 = v165 + *(int *)x30 + v186 + ((unsigned int)v178 & (unsigned int)v184 | (unsigned int)v171 & ~(unsigned int)v184) + (((unsigned int)v184 * 0x4000000 | (unsigned int)v184 >> 6) ^ ((unsigned int)v184 * 0x200000 | (unsigned int)v184 >> 11) ^ ((unsigned int)v184 * 128 | (unsigned int)v184 >> 25));
            v190 = v168 + v189;
            x30 = x30 + 4;
            v191 = v189 + (v182 & v188 ^ (unsigned int)v179) + (((unsigned int)v185 * 0x40000000 | (unsigned int)v185 >> 2) ^ ((unsigned int)v185 * 0x80000 | (unsigned int)v185 >> 13) ^ ((unsigned int)v185 * 0x400 | (unsigned int)v185 >> 22));
            v192 = v159 + v142 + (((unsigned int)v167 * 0x2000000 | (unsigned int)v167 >> 7) ^ ((unsigned int)v167 * 0x4000 | (unsigned int)v167 >> 18) ^ (unsigned int)v167 >> 3) + (((unsigned int)v180 * 0x8000 | (unsigned int)v180 >> 0x11) ^ ((unsigned int)v180 * 0x2000 | (unsigned int)v180 >> 19) ^ (unsigned int)v180 >> 10);
            v193 = v0;
            v3 = v132;
            v194 = (unsigned int)v191 ^ (unsigned int)v185;
            v195 = v171 + *(int *)x30 + v192 + ((unsigned int)v184 & (unsigned int)v190 | (unsigned int)v178 & ~(unsigned int)v190) + (((unsigned int)v190 * 0x4000000 | (unsigned int)v190 >> 6) ^ ((unsigned int)v190 * 0x200000 | (unsigned int)v190 >> 11) ^ ((unsigned int)v190 * 128 | (unsigned int)v190 >> 25));
            v196 = v173 + v195;
            x30 = x30 + 4;
            v197 = v195 + (v188 & v194 ^ (unsigned int)v185) + (((unsigned int)v191 * 0x40000000 | (unsigned int)v191 >> 2) ^ ((unsigned int)v191 * 0x80000 | (unsigned int)v191 >> 13) ^ ((unsigned int)v191 * 0x400 | (unsigned int)v191 >> 22));
            v198 = v167 + v149 + (((unsigned int)v175 * 0x2000000 | (unsigned int)v175 >> 7) ^ ((unsigned int)v175 * 0x4000 | (unsigned int)v175 >> 18) ^ (unsigned int)v175 >> 3) + (((unsigned int)v186 * 0x8000 | (unsigned int)v186 >> 0x11) ^ ((unsigned int)v186 * 0x2000 | (unsigned int)v186 >> 19) ^ (unsigned int)v186 >> 10);
            v199 = v1;
            v0 = v142;
            v200 = (unsigned int)v197 ^ (unsigned int)v191;
            v201 = v178 + *(int *)x30 + v198 + ((unsigned int)v190 & (unsigned int)v196 | (unsigned int)v184 & ~(unsigned int)v196) + (((unsigned int)v196 * 0x4000000 | (unsigned int)v196 >> 6) ^ ((unsigned int)v196 * 0x200000 | (unsigned int)v196 >> 11) ^ ((unsigned int)v196 * 128 | (unsigned int)v196 >> 25));
            v202 = v179 + v201;
            x30 = x30 + 4;
            v203 = v201 + (v194 & v200 ^ (unsigned int)v191) + (((unsigned int)v197 * 0x40000000 | (unsigned int)v197 >> 2) ^ ((unsigned int)v197 * 0x80000 | (unsigned int)v197 >> 13) ^ ((unsigned int)v197 * 0x400 | (unsigned int)v197 >> 22));
            v204 = v175 + v158 + (((unsigned int)v181 * 0x2000000 | (unsigned int)v181 >> 7) ^ ((unsigned int)v181 * 0x4000 | (unsigned int)v181 >> 18) ^ (unsigned int)v181 >> 3) + (((unsigned int)v192 * 0x8000 | (unsigned int)v192 >> 0x11) ^ ((unsigned int)v192 * 0x2000 | (unsigned int)v192 >> 19) ^ (unsigned int)v192 >> 10);
            v205 = v2;
            v1 = v149;
            v206 = (unsigned int)v203 ^ (unsigned int)v197;
            v207 = v184 + *(int *)x30 + v204 + ((unsigned int)v196 & (unsigned int)v202 | (unsigned int)v190 & ~(unsigned int)v202) + (((unsigned int)v202 * 0x4000000 | (unsigned int)v202 >> 6) ^ ((unsigned int)v202 * 0x200000 | (unsigned int)v202 >> 11) ^ ((unsigned int)v202 * 128 | (unsigned int)v202 >> 25));
            v208 = v185 + v207;
            x30 = x30 + 4;
            v209 = v207 + (v200 & v206 ^ (unsigned int)v197) + (((unsigned int)v203 * 0x40000000 | (unsigned int)v203 >> 2) ^ ((unsigned int)v203 * 0x80000 | (unsigned int)v203 >> 13) ^ ((unsigned int)v203 * 0x400 | (unsigned int)v203 >> 22));
            v210 = v181 + v166 + (((unsigned int)v187 * 0x2000000 | (unsigned int)v187 >> 7) ^ ((unsigned int)v187 * 0x4000 | (unsigned int)v187 >> 18) ^ (unsigned int)v187 >> 3) + (((unsigned int)v198 * 0x8000 | (unsigned int)v198 >> 0x11) ^ ((unsigned int)v198 * 0x2000 | (unsigned int)v198 >> 19) ^ (unsigned int)v198 >> 10);
            v211 = v3;
            v2 = v158;
            v212 = (unsigned int)v209 ^ (unsigned int)v203;
            v213 = v190 + *(int *)x30 + v210 + ((unsigned int)v202 & (unsigned int)v208 | (unsigned int)v196 & ~(unsigned int)v208) + (((unsigned int)v208 * 0x4000000 | (unsigned int)v208 >> 6) ^ ((unsigned int)v208 * 0x200000 | (unsigned int)v208 >> 11) ^ ((unsigned int)v208 * 128 | (unsigned int)v208 >> 25));
            v214 = v191 + v213;
            x30 = x30 + 4;
            v215 = v213 + (v206 & v212 ^ (unsigned int)v203) + (((unsigned int)v209 * 0x40000000 | (unsigned int)v209 >> 2) ^ ((unsigned int)v209 * 0x80000 | (unsigned int)v209 >> 13) ^ ((unsigned int)v209 * 0x400 | (unsigned int)v209 >> 22));
            v216 = v187 + v174 + (((unsigned int)v193 * 0x2000000 | (unsigned int)v193 >> 7) ^ ((unsigned int)v193 * 0x4000 | (unsigned int)v193 >> 18) ^ (unsigned int)v193 >> 3) + (((unsigned int)v204 * 0x8000 | (unsigned int)v204 >> 0x11) ^ ((unsigned int)v204 * 0x2000 | (unsigned int)v204 >> 19) ^ (unsigned int)v204 >> 10);
            v217 = v0;
            v3 = v166;
            v218 = (unsigned int)v215 ^ (unsigned int)v209;
            v219 = v196 + *(int *)x30 + v216 + ((unsigned int)v208 & (unsigned int)v214 | (unsigned int)v202 & ~(unsigned int)v214) + (((unsigned int)v214 * 0x4000000 | (unsigned int)v214 >> 6) ^ ((unsigned int)v214 * 0x200000 | (unsigned int)v214 >> 11) ^ ((unsigned int)v214 * 128 | (unsigned int)v214 >> 25));
            v220 = v197 + v219;
            x30 = x30 + 4;
            v221 = v219 + (v212 & v218 ^ (unsigned int)v209) + (((unsigned int)v215 * 0x40000000 | (unsigned int)v215 >> 2) ^ ((unsigned int)v215 * 0x80000 | (unsigned int)v215 >> 13) ^ ((unsigned int)v215 * 0x400 | (unsigned int)v215 >> 22));
            v108 = v193 + v180 + (((unsigned int)v199 * 0x2000000 | (unsigned int)v199 >> 7) ^ ((unsigned int)v199 * 0x4000 | (unsigned int)v199 >> 18) ^ (unsigned int)v199 >> 3) + (((unsigned int)v210 * 0x8000 | (unsigned int)v210 >> 0x11) ^ ((unsigned int)v210 * 0x2000 | (unsigned int)v210 >> 19) ^ (unsigned int)v210 >> 10);
            v222 = v1;
            v0 = v174;
            v223 = (unsigned int)v221 ^ (unsigned int)v215;
            v224 = v202 + *(int *)x30 + v108 + ((unsigned int)v214 & (unsigned int)v220 | (unsigned int)v208 & ~(unsigned int)v220) + (((unsigned int)v220 * 0x4000000 | (unsigned int)v220 >> 6) ^ ((unsigned int)v220 * 0x200000 | (unsigned int)v220 >> 11) ^ ((unsigned int)v220 * 128 | (unsigned int)v220 >> 25));
            v225 = v203 + v224;
            x30 = x30 + 4;
            v226 = v224 + (v218 & v223 ^ (unsigned int)v215) + (((unsigned int)v221 * 0x40000000 | (unsigned int)v221 >> 2) ^ ((unsigned int)v221 * 0x80000 | (unsigned int)v221 >> 13) ^ ((unsigned int)v221 * 0x400 | (unsigned int)v221 >> 22));
            v115 = v199 + v186 + (((unsigned int)v205 * 0x2000000 | (unsigned int)v205 >> 7) ^ ((unsigned int)v205 * 0x4000 | (unsigned int)v205 >> 18) ^ (unsigned int)v205 >> 3) + (((unsigned int)v216 * 0x8000 | (unsigned int)v216 >> 0x11) ^ ((unsigned int)v216 * 0x2000 | (unsigned int)v216 >> 19) ^ (unsigned int)v216 >> 10);
            v227 = v2;
            v1 = v180;
            v228 = (unsigned int)v226 ^ (unsigned int)v221;
            v229 = v208 + *(int *)x30 + v115 + ((unsigned int)v220 & (unsigned int)v225 | (unsigned int)v214 & ~(unsigned int)v225) + (((unsigned int)v225 * 0x4000000 | (unsigned int)v225 >> 6) ^ ((unsigned int)v225 * 0x200000 | (unsigned int)v225 >> 11) ^ ((unsigned int)v225 * 128 | (unsigned int)v225 >> 25));
            v230 = v209 + v229;
            x30 = x30 + 4;
            v231 = v229 + (v223 & v228 ^ (unsigned int)v221) + (((unsigned int)v226 * 0x40000000 | (unsigned int)v226 >> 2) ^ ((unsigned int)v226 * 0x80000 | (unsigned int)v226 >> 13) ^ ((unsigned int)v226 * 0x400 | (unsigned int)v226 >> 22));
            v125 = v205 + v192 + (((unsigned int)v211 * 0x2000000 | (unsigned int)v211 >> 7) ^ ((unsigned int)v211 * 0x4000 | (unsigned int)v211 >> 18) ^ (unsigned int)v211 >> 3) + (((unsigned int)v108 * 0x8000 | (unsigned int)v108 >> 0x11) ^ ((unsigned int)v108 * 0x2000 | (unsigned int)v108 >> 19) ^ (unsigned int)v108 >> 10);
            v232 = v3;
            v2 = v186;
            v233 = (unsigned int)v231 ^ (unsigned int)v226;
            v234 = v214 + *(int *)x30 + v125 + ((unsigned int)v225 & (unsigned int)v230 | (unsigned int)v220 & ~(unsigned int)v230) + (((unsigned int)v230 * 0x4000000 | (unsigned int)v230 >> 6) ^ ((unsigned int)v230 * 0x200000 | (unsigned int)v230 >> 11) ^ ((unsigned int)v230 * 128 | (unsigned int)v230 >> 25));
            v235 = v215 + v234;
            x30 = x30 + 4;
            v236 = v234 + (v228 & v233 ^ (unsigned int)v226) + (((unsigned int)v231 * 0x40000000 | (unsigned int)v231 >> 2) ^ ((unsigned int)v231 * 0x80000 | (unsigned int)v231 >> 13) ^ ((unsigned int)v231 * 0x400 | (unsigned int)v231 >> 22));
            v132 = v211 + v198 + (((unsigned int)v217 * 0x2000000 | (unsigned int)v217 >> 7) ^ ((unsigned int)v217 * 0x4000 | (unsigned int)v217 >> 18) ^ (unsigned int)v217 >> 3) + (((unsigned int)v115 * 0x8000 | (unsigned int)v115 >> 0x11) ^ ((unsigned int)v115 * 0x2000 | (unsigned int)v115 >> 19) ^ (unsigned int)v115 >> 10);
            v237 = v0;
            v3 = v192;
            v238 = (unsigned int)v236 ^ (unsigned int)v231;
            v239 = v220 + *(int *)x30 + v132 + ((unsigned int)v230 & (unsigned int)v235 | (unsigned int)v225 & ~(unsigned int)v235) + (((unsigned int)v235 * 0x4000000 | (unsigned int)v235 >> 6) ^ ((unsigned int)v235 * 0x200000 | (unsigned int)v235 >> 11) ^ ((unsigned int)v235 * 128 | (unsigned int)v235 >> 25));
            v240 = v221 + v239;
            x30 = x30 + 4;
            v241 = v239 + (v233 & v238 ^ (unsigned int)v231) + (((unsigned int)v236 * 0x40000000 | (unsigned int)v236 >> 2) ^ ((unsigned int)v236 * 0x80000 | (unsigned int)v236 >> 13) ^ ((unsigned int)v236 * 0x400 | (unsigned int)v236 >> 22));
            v142 = v217 + v204 + (((unsigned int)v222 * 0x2000000 | (unsigned int)v222 >> 7) ^ ((unsigned int)v222 * 0x4000 | (unsigned int)v222 >> 18) ^ (unsigned int)v222 >> 3) + (((unsigned int)v125 * 0x8000 | (unsigned int)v125 >> 0x11) ^ ((unsigned int)v125 * 0x2000 | (unsigned int)v125 >> 19) ^ (unsigned int)v125 >> 10);
            v47 = v1;
            v0 = v198;
            v242 = (unsigned int)v241 ^ (unsigned int)v236;
            v243 = v225 + *(int *)x30 + v142 + ((unsigned int)v235 & (unsigned int)v240 | (unsigned int)v230 & ~(unsigned int)v240) + (((unsigned int)v240 * 0x4000000 | (unsigned int)v240 >> 6) ^ ((unsigned int)v240 * 0x200000 | (unsigned int)v240 >> 11) ^ ((unsigned int)v240 * 128 | (unsigned int)v240 >> 25));
            v148 = v226 + v243;
            x30 = x30 + 4;
            v152 = v243 + (v238 & v242 ^ (unsigned int)v236) + (((unsigned int)v241 * 0x40000000 | (unsigned int)v241 >> 2) ^ ((unsigned int)v241 * 0x80000 | (unsigned int)v241 >> 13) ^ ((unsigned int)v241 * 0x400 | (unsigned int)v241 >> 22));
            v149 = v222 + v210 + (((unsigned int)v227 * 0x2000000 | (unsigned int)v227 >> 7) ^ ((unsigned int)v227 * 0x4000 | (unsigned int)v227 >> 18) ^ (unsigned int)v227 >> 3) + (((unsigned int)v132 * 0x8000 | (unsigned int)v132 >> 0x11) ^ ((unsigned int)v132 * 0x2000 | (unsigned int)v132 >> 19) ^ (unsigned int)v132 >> 10);
            v57 = v2;
            v1 = v204;
            v244 = (unsigned int)v152 ^ (unsigned int)v241;
            v245 = v230 + *(int *)x30 + v149 + ((unsigned int)v240 & (unsigned int)v148 | (unsigned int)v235 & ~(unsigned int)v148) + (((unsigned int)v148 * 0x4000000 | (unsigned int)v148 >> 6) ^ ((unsigned int)v148 * 0x200000 | (unsigned int)v148 >> 11) ^ ((unsigned int)v148 * 128 | (unsigned int)v148 >> 25));
            v157 = v231 + v245;
            x30 = x30 + 4;
            v160 = v245 + (v242 & v244 ^ (unsigned int)v241) + (((unsigned int)v152 * 0x40000000 | (unsigned int)v152 >> 2) ^ ((unsigned int)v152 * 0x80000 | (unsigned int)v152 >> 13) ^ ((unsigned int)v152 * 0x400 | (unsigned int)v152 >> 22));
            v158 = v227 + v216 + (((unsigned int)v232 * 0x2000000 | (unsigned int)v232 >> 7) ^ ((unsigned int)v232 * 0x4000 | (unsigned int)v232 >> 18) ^ (unsigned int)v232 >> 3) + (((unsigned int)v142 * 0x8000 | (unsigned int)v142 >> 0x11) ^ ((unsigned int)v142 * 0x2000 | (unsigned int)v142 >> 19) ^ (unsigned int)v142 >> 10);
            v159 = v3;
            v2 = v210;
            v246 = (unsigned int)v160 ^ (unsigned int)v152;
            v247 = v235 + *(int *)x30 + v158 + ((unsigned int)v148 & (unsigned int)v157 | (unsigned int)v240 & ~(unsigned int)v157) + (((unsigned int)v157 * 0x4000000 | (unsigned int)v157 >> 6) ^ ((unsigned int)v157 * 0x200000 | (unsigned int)v157 >> 11) ^ ((unsigned int)v157 * 128 | (unsigned int)v157 >> 25));
            v165 = v236 + v247;
            x30 = x30 + 4;
            v168 = v247 + (v244 & v246 ^ (unsigned int)v152) + (((unsigned int)v160 * 0x40000000 | (unsigned int)v160 >> 2) ^ ((unsigned int)v160 * 0x80000 | (unsigned int)v160 >> 13) ^ ((unsigned int)v160 * 0x400 | (unsigned int)v160 >> 22));
            v166 = v232 + v108 + (((unsigned int)v237 * 0x2000000 | (unsigned int)v237 >> 7) ^ ((unsigned int)v237 * 0x4000 | (unsigned int)v237 >> 18) ^ (unsigned int)v237 >> 3) + (((unsigned int)v149 * 0x8000 | (unsigned int)v149 >> 0x11) ^ ((unsigned int)v149 * 0x2000 | (unsigned int)v149 >> 19) ^ (unsigned int)v149 >> 10);
            v167 = v0;
            v3 = v216;
            v169 = (unsigned int)v168 ^ (unsigned int)v160;
            v248 = v240 + *(int *)x30 + v166 + ((unsigned int)v157 & (unsigned int)v165 | (unsigned int)v148 & ~(unsigned int)v165) + (((unsigned int)v165 * 0x4000000 | (unsigned int)v165 >> 6) ^ ((unsigned int)v165 * 0x200000 | (unsigned int)v165 >> 11) ^ ((unsigned int)v165 * 128 | (unsigned int)v165 >> 25));
            v171 = v241 + v248;
            v172 = *(int *)x30;
            x30 = x30 + 4;
            v173 = v248 + (v246 & v169 ^ (unsigned int)v160) + (((unsigned int)v168 * 0x40000000 | (unsigned int)v168 >> 2) ^ ((unsigned int)v168 * 0x80000 | (unsigned int)v168 >> 13) ^ ((unsigned int)v168 * 0x400 | (unsigned int)v168 >> 22));
        } while ((v174 = v237 + v115 + (((unsigned int)v47 * 0x2000000 | (unsigned int)v47 >> 7) ^ ((unsigned int)v47 * 0x4000 | (unsigned int)v47 >> 18) ^ (unsigned int)v47 >> 3) + (((unsigned int)v158 * 0x8000 | (unsigned int)v158 >> 0x11) ^ ((unsigned int)v158 * 0x2000 | (unsigned int)v158 >> 19) ^ (unsigned int)v158 >> 10), (unsigned int)v172));
        x30 = x30 - 260;
        i = v17 + 14;
        v249 = a0[4];
        v250 = a0[5];
        v30 = v173 + *a0;
        v251 = a0[6];
        v252 = a0[7];
        v31 = v168 + a0[1];
        v32 = v160 + a0[2];
        v33 = v152 + a0[3];
        *a0 = v30;
        a0[1] = v31;
        v34 = v171 + v249;
        v35 = v165 + v250;
        a0[2] = v32;
        a0[3] = v33;
        v36 = v157 + v251;
        v37 = v148 + v252;
        a0[4] = v34;
        a0[5] = v35;
        a0[6] = v36;
        a0[7] = v37;
    } while (i != v16);
    return a0;
}
