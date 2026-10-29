/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5619b4..0x562904 (3920 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5619b4_0 {
    char field_0;
} st_5619b4_0;

extern unsigned short g_f04990;
extern unsigned short g_f04992;
extern unsigned short g_f04994;
extern unsigned short g_f04996;
extern unsigned long long g_f04998;
extern unsigned short g_f123c8;
extern unsigned short g_f123ca;
extern unsigned short g_f123cc;
extern unsigned short g_f123ce;
extern unsigned int g_ffffffffffffffec;
extern char g_fffffffffffffffc;

int sub_5619b4(void)
{
    st_5619b4_0 *v4;  // x8
    st_5619b4_0 **v5;  // x9
    unsigned long long v14;  // x11
    unsigned long long v104;  // x16
    unsigned long long v105;  // x0
    unsigned long v106;  // x16
    unsigned long long v107;  // x10
    unsigned long long v108;  // x10
    unsigned int v109;  // w10
    unsigned long long v110;  // x16
    unsigned long v111;  // x17
    unsigned long long v112;  // x0
    unsigned long long v113;  // x13
    unsigned long long v15;  // x12
    unsigned long long v114;  // x0
    unsigned long long v115;  // x1
    unsigned long long v116;  // x1
    unsigned long long v117;  // x2
    unsigned long long v118;  // x16
    unsigned long long v119;  // x17
    unsigned long long v120;  // x13
    unsigned long long v121;  // x16
    unsigned long long v122;  // x13
    unsigned long long v123;  // x16
    unsigned long long v16;  // x8
    unsigned long long v124;  // x0
    unsigned long long v125;  // x17
    unsigned long long v126;  // x16
    unsigned int v127;  // w16
    unsigned int v128;  // w0
    unsigned int v129;  // w13
    unsigned int v130;  // w13
    unsigned int v131;  // w16
    unsigned int v132;  // w13
    unsigned short v133;  // x10
    unsigned long v17;  // x9
    unsigned long v134;  // x13
    unsigned long v135;  // x16
    unsigned long long v136;  // x2
    unsigned long long v137;  // x13
    unsigned long long v138;  // x13
    unsigned long long v139;  // x13
    unsigned long long v140;  // x17
    unsigned long v141;  // x13
    unsigned short v143;  // x16
    unsigned long long v18;  // x9
    unsigned int v144;  // w17
    unsigned int v145;  // w14
    unsigned short v146;  // x9
    unsigned short v147;  // x13
    unsigned short v148;  // x14
    unsigned short v149;  // x15
    unsigned short v150;  // x9
    unsigned int v151;  // w8
    unsigned int v152;  // w9
    unsigned int v153;  // w13
    unsigned long long v19;  // x9
    unsigned int v154;  // w12
    unsigned int v155;  // w10
    unsigned int v156;  // w11
    unsigned int v157;  // w10
    unsigned int v158;  // w11
    unsigned int v159;  // w8
    unsigned int v160;  // w9
    unsigned int v161;  // w10
    unsigned int v162;  // w12
    unsigned int v163;  // w13
    unsigned long long v20;  // x12
    unsigned int v164;  // w11
    unsigned int v165;  // w11
    unsigned int v166;  // w13
    unsigned int v167;  // w8
    unsigned int v168;  // w10
    unsigned int v169;  // w12
    unsigned int v170;  // w8
    unsigned int v171;  // w9
    unsigned long long v21;  // x16
    unsigned long v22;  // x13
    unsigned long long v23;  // x14
    unsigned long long v6;  // x11
    unsigned long long v24;  // x14
    unsigned long long v25;  // x9
    unsigned long long v26;  // x12
    unsigned long long v27;  // x9
    unsigned long long v28;  // x12
    unsigned long long v29;  // x9
    unsigned long v30;  // x14
    unsigned long long v31;  // x9
    unsigned long long v32;  // x12
    unsigned long long v33;  // x15
    unsigned long long v7;  // x12
    unsigned long long v34;  // x16
    unsigned long long v35;  // x14
    unsigned long long v36;  // x11
    unsigned long long v37;  // x12
    unsigned long v38;  // x14
    unsigned long long v39;  // x0
    unsigned long long v40;  // x16
    unsigned long long v41;  // x15
    unsigned long long v42;  // x16
    unsigned long long v43;  // x12
    unsigned long long v8;  // x14
    unsigned long long v44;  // x14
    unsigned long long v45;  // x14
    unsigned long long v46;  // x12
    unsigned long long v47;  // x14
    unsigned long long v48;  // x12
    unsigned long long v49;  // x15
    unsigned long long v50;  // x12
    unsigned long long v51;  // x14
    char v52;  // x15
    char v53;  // x12
    unsigned long long v9;  // x12
    unsigned long long v54;  // x12
    unsigned long long v55;  // x11
    st_5619b4_0 *v56;  // x14
    st_5619b4_0 **v57;  // x15
    unsigned long long v58;  // x17
    unsigned long long v59;  // x0
    unsigned long long v60;  // x0
    unsigned long long v61;  // x14
    unsigned long long v62;  // x14
    unsigned long long v63;  // x14
    unsigned long long v10;  // x9
    unsigned long long v64;  // x16
    unsigned long long v65;  // x17
    unsigned long v66;  // x14
    unsigned int v67;  // w14
    unsigned int v68;  // w15
    unsigned int v69;  // w16
    unsigned int v70;  // w14
    unsigned int v71;  // w14
    unsigned int v72;  // w16
    unsigned short v73;  // x14
    unsigned long long v11;  // x8
    unsigned long v74;  // x15
    unsigned long v75;  // x16
    unsigned long long v76;  // x17
    unsigned long long v77;  // x15
    unsigned long long v78;  // x0
    unsigned long long v79;  // x17
    unsigned long long v80;  // x15
    unsigned long long v81;  // x15
    unsigned int v82;  // w15
    unsigned long v83;  // x16
    unsigned long long v12;  // x8
    unsigned long long v84;  // x17
    unsigned long long v85;  // x0
    unsigned long long v86;  // x2
    unsigned long long v87;  // x1
    unsigned long long v88;  // x16
    unsigned long long v89;  // x3
    unsigned long long v90;  // x16
    unsigned long long v91;  // x17
    unsigned long long v92;  // x16
    unsigned long long v93;  // x0
    unsigned long long v13;  // x9
    unsigned long long v94;  // x1
    unsigned long long v95;  // x0
    unsigned int v96;  // w16
    unsigned int v97;  // w15
    unsigned int v98;  // w16
    unsigned long v99;  // x17
    unsigned long long v100;  // x0
    unsigned long long v101;  // x16
    unsigned long long v102;  // x17
    unsigned long long v103;  // x1
    st_5619b4_0 **v0;  // [bp-0x20], Other Possible Types: unsigned long long, char
    st_5619b4_0 *v1;  // [bp-0x18], Other Possible Types: unsigned long long, unsigned long
    st_5619b4_0 **v2;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_5619b4_0 *v3;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v4 = v3;
    v5 = v2;
    v6 = (v4 - v5 | ((&g_fffffffffffffffc + -0x3 * v4 + -0x4 * ~v4 | v5) & v4 * 3 + ~v4 * 4 + 4) * 4 + ((&g_fffffffffffffffc + -0x3 * v4 + -0x4 * ~v4 | v5) ^ v4 * 3 + ~v4 * 4 + 4) * 2) + (((&g_fffffffffffffffc + -0x3 * v4 + -0x4 * ~v4 | v5) & v4 * 3 + ~v4 * 4 + 4) * 4 + ((&g_fffffffffffffffc + -0x3 * v4 + -0x4 * ~v4 | v5) ^ v4 * 3 + ~v4 * 4 + 4) * 2 & v4 - v5);
    v7 = v5 * 2;
    v8 = v5 + v4;
    v9 = v7 - (v8 + (v5 | ~v4));
    v10 = (v9 & v8 + ~v7) * 4 + (v9 ^ v8 + ~v7) * 2;
    v11 = (v5 ^ -v4) + ((char *)v5 + (-v4 | ~v5)) * 2 + ~v10 + 4;
    v12 = (v6 ^ -((v11 & 1) + (-(v11 + v10 * 2) | 1))) + ~(((1 - (v11 + v10 * 2) | ~v6) & v6 + 1) * 4 + ((1 - (v11 + v10 * 2) | ~v6) ^ v6 + 1) * 2) + (((1 - (v11 + v10 * 2) | ~v6) & v6 + 1) * 4 + ((1 - (v11 + v10 * 2) | ~v6) ^ v6 + 1) * 2) * 2 + (v6 + 1 + ~v6 * 2 + ((v11 & 1) + (-(v11 + v10 * 2) | 1) | ~(v6 + 1 + ~v6 * 2)) + (v6 & -((v11 & 1) + (-(v11 + v10 * 2) | 1)))) * 2;
    v13 = v12 + 4;
    v14 = ~v13 + v13 * 2;
    v15 = ((v14 | 4) + 1 ^ v14 & 4) + ((v14 | 4) + 1 & v14 & 4) * 2;
    v16 = (((&(&g_fffffffffffffffc)[-1 * v12] | 29) ^ v13) + ((&(&g_fffffffffffffffc)[-1 * v12] | 29) & v13) * 2 ^ (v14 | 29) + 1) + (((&(&g_fffffffffffffffc)[-1 * v12] | 29) ^ v13) + ((&(&g_fffffffffffffffc)[-1 * v12] | 29) & v13) * 2 & (v14 | 29) + 1) * 2;
    v2 = ~v15 + v15 * 2;
    v3 = ~v16 + v16 * 2;
    v17 = 15747472 >> ((char)((((char)~v3 + (char)v3 * 2 + 2 ^ (char)v2) + (~v3 + v3 * 2 + 2 & v2) * 2 | 1) + (((char)~v3 + (char)v3 * 2 + 2 ^ (char)v2) & 1) - 2) & 63);
    v18 = (((char *)~&g_f04990 + v17 + (15747472 & ~v17)) * 2 + 3 ^ (char *)&g_f04990 + v17 + 2 * ~v17 + 2) + (((char *)~&g_f04990 + v17 + (15747472 & ~v17)) * 2 + 3 & (char *)&g_f04990 + v17 + 2 * ~v17 + 2) * 2;
    v19 = v3;
    v20 = v2;
    v21 = v19 + 1;
    v22 = (v20 | ~v19) + v21 + (v20 ^ v19);
    v23 = ((v21 + ~v19 * 2 | v20) ^ v21) + ((v21 + ~v19 * 2 | v20) & v21) * 2;
    v24 = v22 + v23 + (-v23 & ~v22) * 2 + (v22 - (v23 + (v22 | -v23))) * 2;
    v25 = (v20 ^ -v19) + (v20 + (-v19 | ~v20)) * 2 + 2;
    v26 = (0xffffffffffffffff ^ (v19 & ~v20) * 2) + (v19 & ~v20) * 4 + 2;
    v27 = ~((v25 ^ v26) + (v25 & v26) * 2) + ((v25 ^ v26) + (v25 & v26) * 2) * 2;
    v28 = (v24 ^ v27) + (v24 & v27) * 2 - (v24 + v27 + (-v27 | ~v24)) * 2 - 2;
    v29 = (v24 - v27 + (v27 - 1 & ~v24)) * 2 + 3;
    v30 = v29 ^ v28;
    v31 = v29 & v28;
    v32 = v30 + v31 * 2;
    v33 = v32 - 1;
    v34 = -v32;
    v35 = v32 + 6591040075048873163 + (v30 + (v31 - v32) * 2 | 11855703998660678452);
    v2 = v32 + (v34 | 6591040075048873163) + (v34 | 6591040075048873163) + v33 + v35 + (v35 | 0xfffffffffffffffe - ((v34 | 6591040075048873163) + v33)) + (0xfffffffffffffffe - ((v34 | 6591040075048873163) + v33) | ~v35) + 3;
    v3 = v32 + (v33 | 11806639219670949890) + (v34 & 0x5c26642f18515ffd) + 11806639219670949890;
    v36 = ((~v3 + v3 * 2 + 2 ^ v2) + (~v3 + v3 * 2 + 2 & v2) * 2 - 1) * (~v18 + v18 * 2);
    v37 = v3;
    v38 = v2;
    v39 = v37 + 1;
    v40 = v39 + v37 - v38 + (v38 | ~v37) + (v38 & ~v37) * 2;
    v41 = v39 + ~v37 * 2;
    v42 = (v41 | v38) + v37 + v40 + (~v40 & ~((v41 | v38) + v37)) * 2 + (v40 & ~((v41 | v38) + v37)) * 2 + 1;
    v43 = v39 + v41 + (v38 | ~v41) + ((v38 + 1 + ~v38 * 2 | v37) ^ ~v38 * 2 + v38) - ((v38 + 1 + ~v38 * 2 | v37) & v38 + 1) * 2;
    v44 = v42 + ~v42 * 2 + 1;
    v45 = v43 + v42 + (v44 + (~v44 | ~v43)) * 2;
    v46 = (v42 & ~v43) * 2;
    v47 = v45 + 3;
    v48 = v47 + v46;
    v49 = ((v45 + v46 + 4 + ~v48 * 2 | 25) ^ v45 + v46 + 4) + ((v45 + v46 + 4 + ~v48 * 2 | 25) & v45 + v46 + 4) * 2;
    v2 = ~((v48 | 1) + (v47 & 1) + 4) + ((v48 | 1) + (v47 & 1) + 4) * 2;
    v3 = v48 + (v48 & 25) - (0xffffffffffffffcd | v48 * 2) - 26 + (v49 & 25 - (v48 + (v48 & 25) - (0xffffffffffffffcd | v48 * 2))) + (v49 & v48 + (v48 & 25) - (0xffffffffffffffcd | v48 * 2) - 26);
    v50 = v2;
    v51 = v3;
    v52 = ((char)v50 + (char)~v50 * 2 + 1 | (char)v51) + (char)v50;
    v53 = ((char)v51 + (char)~v51 * 2 + 1 & (char)v50) + (char)v51;
    v54 = v36 >> ((char)(v53 + v52 * 2 + (0xfffffffffffffffe - v52 | v53) - (v52 + 1 & v53)) + 3 & 63);
    v55 = (v36 ^ -v54) + (v36 - (v54 + (v36 | -v54)) + (v36 + (0xffffffffffffffff ^ v36 * 2) + v54 ^ -(v36 + (0xffffffffffffffff ^ v36 * 2) | v54))) * 2 + (v36 + (0xffffffffffffffff ^ v36 * 2) + v54 & -(v36 + (0xffffffffffffffff ^ v36 * 2) | v54)) * 4;
    v56 = v1;
    v57 = v0;
    v58 = v57 | v56;
    v59 = (v57 - v56 + (v56 | ~v57) ^ v56 + 1) + (v57 - v56 + (v56 | ~v57) & v56 + 1) * 2;
    v60 = v59 + v58 + (-v59 & ~v58) * 2 + (v58 - (v59 + (v58 | -v59))) * 2;
    v61 = v56 * 2 - (v57 + v56 + (v58 & -v57) * 4 + (v58 ^ -v57) * 2);
    v62 = (v60 ^ v61) + (v60 & v61) * 2 - 1;
    v63 = (v62 * 2 & 4) + (v62 ^ 2);
    v64 = v63 - 1;
    v65 = ((~(unsigned int)v64 & 56116) + (v64 ^ 0xffffffffffff24cb) ^ v63) + ((~(unsigned int)v64 & 56116) + (v64 ^ 0xffffffffffff24cb) & v63) * 2;
    v66 = v63 + (v64 ^ 56116) + (-v63 & 0xffffffffffff24cb) + 56116;
    v0 = (v64 | 1) + (v64 & 1) + 9418;
    v1 = v66 + v65 + (v66 | ~v65) + (v65 & ~v66) + 1;
    v67 = v0;
    v68 = v1;
    v69 = v68 + (v67 | ~v68) + 1;
    v70 = v67 - v68 + (v68 & v67) + (v68 & ~v67) * 2 + 1;
    v71 = (v70 ^ v69) + (v70 & v69) * 2;
    v72 = (v71 ^ (unsigned int)v55) + (v71 & (unsigned int)v55) * 2;
    v73 = v71 - ((v71 - 1 | ~(unsigned int)v55) + (v71 - 1 | (unsigned int)v55) * 2) - 2;
    g_f123c8 = (v73 ^ (unsigned short)~v72 + (unsigned short)v72 * 2) + ((v73 | (unsigned short)-v72) + (unsigned short)v72) * 2;
    v74 = v1;
    v75 = v0;
    v76 = ((v74 ^ -v75) + (v74 - (v75 + (v74 | -v75))) * 2 | (~(v74 + v75 + (0xffffffffffffffff ^ v74 * 2)) - (v74 | ~v75) & v74 + v75 + (0xffffffffffffffff ^ v74 * 2)) * 4 + (~(v74 + v75 + (0xffffffffffffffff ^ v74 * 2)) - (v74 | ~v75) ^ v74 + v75 + (0xffffffffffffffff ^ v74 * 2)) * 2) + ((~(v74 + v75 + (0xffffffffffffffff ^ v74 * 2)) - (v74 | ~v75) & v74 + v75 + (0xffffffffffffffff ^ v74 * 2)) * 4 + (~(v74 + v75 + (0xffffffffffffffff ^ v74 * 2)) - (v74 | ~v75) ^ v74 + v75 + (0xffffffffffffffff ^ v74 * 2)) * 2 & (v74 ^ -v75) + (v74 - (v75 + (v74 | -v75))) * 2);
    v77 = (v75 & ~v74) + ~v75 + (v75 | v74);
    v78 = ~v76;
    v79 = v76 + 1;
    v80 = v79 + v78 * 2 | (0xfffffffffffffffe - v77 | 1) + (v77 & 1);
    v81 = (v76 ^ v77 + 1) + (v78 & ~v77) * 2 + (v76 & v77 + 1) * 2 - ((v80 & v79) * 4 + (v80 ^ v79) * 2 + ~((v80 & v79) * 4 + (v80 ^ v79) * 2) * 2 | 1);
    v0 = v81 + 8;
    v1 = (v81 - 1 ^ 8) + ((-v81 | 8) + v81) * 2 - 1;
    v82 = v55 >> ((char)v1 + (char)v0 & 63);
    v83 = v1;
    v84 = v0;
    v85 = (v83 + ~v83 * 2 + 1 | v84) + v83;
    v86 = v84 | v83;
    v87 = v86 + ~v85;
    v88 = v86 - (v84 & v83);
    v89 = v87 + v88;
    v90 = v89 + (v88 + ~v88 * 2 + v87 + v86 - v85 + (v85 - v86) * 2 + (v88 - 1 & v87) - v89 + (0x7ffffffffffffffd - (v88 + ~v88 * 2) | ~(v86 - v85 + (v85 - v86) * 2))) * 2;
    v91 = v90 + 8;
    v92 = v90 + 9;
    v93 = v92 + ~v91 * 2;
    v94 = ((v93 | 37966) ^ v92) + ((v93 | 37966) & v92) * 2;
    v95 = (v91 | 1) + (v89 & 1) + v93 - (v93 & 0xffffffffffff6bb1);
    v0 = (v94 ^ v95) + (v94 & v95) * 2 - 1;
    v1 = ((27569 | ~v91) ^ v92) + (v91 | 27569) + ((27569 | ~v91) & v92) * 2;
    v96 = v0 + ((unsigned int)v1 | ~v0) + ((unsigned int)v1 | v0) + 1;
    v97 = v82 | v96;
    v98 = v82 + (v96 | ~v82) + v97 + 1;
    g_f123ca = (unsigned short)v98 + (unsigned short)v97 + ((unsigned short)v98 + ((unsigned short)-v97 | (unsigned short)~v98) + ((unsigned short)-v97 & (unsigned short)~v98)) * 2 + 2;
    v99 = v0;
    v100 = v99 | v1;
    v101 = (v1 | ~v99) + v99;
    v102 = (v100 & ~v101) * 2 - (v101 ^ v100);
    v103 = v102 - 1;
    v104 = (v100 - v101 | 1) + (v100 - v101 & 1);
    v105 = (v104 - 3 & v103) - v104 + (v104 - 3 & v103) - v102;
    v106 = ((-v102 | 2 - v104) + v103) * 2 + 2;
    v107 = v105 + (&(&g_fffffffffffffffc)[-1 * v105] | v106) + (v105 + 3 | v106);
    v108 = (v107 + 5 + (v107 + 5 + ~(v107 + 4) * 2 | 18) ^ (v107 + 4 & (char *)&g_ffffffffffffffec + 1) + 19) + (v107 + 5 + (v107 + 5 + ~(v107 + 4) * 2 | 18) & (v107 + 4 & (char *)&g_ffffffffffffffec + 1) + 19) * 2;
    v0 = (v107 + 19 | 1) + (v107 + 19 & 1) - 2;
    v1 = ~v108 + v108 * 2;
    v109 = v55 >> ((char)(v0 - v1) + ((char)v1 + 1 & ~v0) * 2 + (v0 + ((char)v1 + 1 | ~v0)) * 2 & 63);
    v110 = v1;
    v111 = v0;
    v112 = v110 + (0xffffffffffffffff ^ v110 * 2) & v111;
    v113 = ((0xffffffffffffffff ^ v112 * 2) + v112 * 4 + 2 ^ v110 - v111) + ((0xffffffffffffffff ^ v112 * 2) + v112 * 4 + 2 & v110 - v111) * 2;
    v114 = ~v113 + v113 * 2;
    v115 = v111 + ~v111 * 2;
    v116 = v115 + 2;
    v117 = v116 + ~(v115 + 1) * 2 | v110;
    v118 = (v110 + ~v110 * 2 + v111 + 2 | (v117 & v116) * 4 + (v117 ^ v116) * 2) + ((v117 & v116) * 4 + (v117 ^ v116) * 2 & v110 + ~v110 * 2 + v111 + 2);
    v119 = -v118;
    v120 = v114 + v118 + ((v113 - 1 | v119) - v113) * 2 + 3;
    v121 = (v114 - v118 & -(v114 | v119)) * 4 + (v114 - v118 ^ -(v114 | v119)) * 2 + ~((v114 - v118 & -(v114 | v119)) * 4 + (v114 - v118 ^ -(v114 | v119)) * 2) * 2 | 1;
    v122 = v121 - v120;
    v123 = v122 + (v120 + ~v121) * 2;
    v124 = v123 + 1;
    v125 = (v124 + ~v123 * 2 | 30635) + v123;
    v126 = (0xffffffffffff8854 | ~v123) + v124 + 30635;
    v0 = ((v123 | 1) + (v122 & 1) + 34900 | 1) + ((v123 | 1) + (v122 & 1) + 34900 & 1) - 2;
    v1 = v126 + v125 * 2 + (0xfffffffffffffffe - v125 | v126) - (v125 + 1 & v126) + 3;
    v127 = v1;
    v128 = v127 + ~v127 * 2 + 1;
    v129 = v127 + v128 + (v0 | ~v128) + 2;
    v130 = (v129 ^ v127 & v0) + (v129 & v127 & v0) * 2;
    v131 = ~v130 + v130 * 2;
    v132 = v131 + (v109 & -v130) + (v131 & v109);
    v133 = (unsigned short)(v131 - (v109 + (v131 & ~v109) * 2)) + (unsigned short)(~v109 - (v131 | ~v109));
    g_f123cc = (v133 ^ (unsigned short)v132) + ((unsigned short)v132 + (v133 | (unsigned short)~v132)) * 2 + 2;
    v134 = v1;
    v135 = v0;
    v136 = v135 | v134;
    v137 = (v134 + ~v136 ^ v135 + ~v135 * 2) - (v134 + ~v136 & v135 + 1) * 2 + v136;
    v138 = (v137 + 1 ^ 1) - v137 * 2 + (((v137 + 1) * 2 | v137 + 1 >> 63) & 2 & 3) + v136 - (v135 & v134);
    v139 = v138 + (3 - v138 | 1) + (v138 - 4 | 1) - 3;
    v140 = ~v139 | 8;
    v141 = v140 + (v139 | 1) + (v139 & 1) + (v139 ^ 8);
    v0 = v139 + (82 & v139 * 2) + (82 & v139 * 2 ^ 82) - 42;
    v1 = v141 + (v140 + v139) * 2 + (v141 | 0xfffffffffffffffe - (v140 + v139)) - (v141 & v140 + v139 + 1) + 3;
    g_f123ce = v55 >> ((char)(v0 - v1 + ((char)v1 + 1 & v0) * 2 + ((char)v1 + 1 & ~v0) * 2 - 2) & 63);
    v143 = g_f123c8 + g_f04990;
    v144 = g_f04990 | g_f123c8;
    g_f04990 = (unsigned short)(v143 - ((g_f123c8 & g_f04990) + (v143 & -v144) * 2)) + ((unsigned short)(v144 - 1) ^ v143) + 1;
    g_f04992 = g_f04992 + (g_f123ca | ~g_f04992) + (g_f123ca ^ g_f04992) - g_f04992 - (g_f04992 + ~g_f04992 * 2 + 1 | g_f123ca);
    v145 = g_f123cc | g_f04994;
    v146 = -(g_f123cc & g_f04994);
    g_f04994 = ((unsigned short)v145 ^ v146) + ((unsigned short)v145 + (v146 | (unsigned short)~v145)) * 2 + 2;
    v147 = -g_f123ce;
    v148 = g_f123ce | g_f04996;
    v149 = -g_f04996;
    v150 = g_f123ce + g_f04996 + (v147 & ~g_f04996) * 2 + (unsigned short)(g_f04996 - g_f123ce - (v147 | g_f04996)) * 2;
    g_f04996 = (v150 | (v148 & v149) * 4 + (v148 ^ v149) * 2) + (v150 & (v148 & v149) * 4 + (v148 ^ v149) * 2);
    g_f04998 = g_f04998 + v55 + ((g_f04998 | v55) + (-v55 | ~g_f04998) + (-v55 & ~g_f04998)) * 2 + 2;
    v151 = v1;
    v152 = v0;
    v153 = v152 + v151;
    v154 = v153 + (0xffffffff ^ v151 * 2) + ~(v153 + (0xffffffff ^ v151 * 2) + (v151 | ~v152));
    v155 = v153 + (-v152 & ~v151) * 2 + (unsigned int)(v151 - v152 - (v151 | -v152)) * 2;
    v156 = (0xffffffff ^ v154 * 2) + v154 * 4 + 2;
    v157 = (v156 ^ v155) + (v156 & v155) * 2;
    v158 = ~v157 + v157 * 2;
    v159 = v158 - v151 + (-v157 & v151) * 2;
    v160 = ((v158 | v152) - 1 ^ v158 + v152) - (v158 + v152 & -(v158 | v152)) * 2 + (v158 | v152);
    v161 = v160 + 1;
    v162 = v161 | v159;
    v163 = (v160 ^ ~v159) + (v159 & ~v160) * 2;
    v164 = (v162 - v160 & v160 - v159) * 4 + (v162 - v160 ^ v160 - v159) * 2;
    v165 = v163 + v164 + (~v163 | ~v164) + (v163 & v164);
    v166 = v165 + 1;
    v167 = v162 - (((unsigned int)(0xfffffffe - v160) | v159) & v160 + 2) * 2 + (v161 + (unsigned int)(0xfffffffe - v160) * 2 ^ ((unsigned int)(0xfffffffe - v160) | v159));
    v168 = v166 - v167 + (v167 | ~v166);
    v169 = (v166 & v167) - v166;
    v170 = ~v166 - v167 + (v166 | v167);
    v171 = v165 + 2;
    return (v168 ^ v169) + (v170 & v171) * 4 + ((v170 ^ v171) + (v168 & v169)) * 2;
}
