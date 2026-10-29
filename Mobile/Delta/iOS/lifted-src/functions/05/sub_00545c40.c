/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x545c40..0x546af4 (3764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_545c40_1 {
    char padding_0[31494481];
    unsigned short field_1e09151;
} st_545c40_1;

typedef struct st_545c40_0 {
    char field_0;
} st_545c40_0;

extern unsigned short g_f048a8;
extern unsigned short g_f048aa;
extern unsigned short g_f048ac;
extern unsigned short g_f048ae;
extern unsigned long long g_f048b0;
extern unsigned short g_f1216a;
extern unsigned short g_f1216c;
extern unsigned short g_f1216e;
extern unsigned short g_f12170;
extern unsigned int g_fffffffffffffff8;

int sub_545c40(void)
{
    st_545c40_0 *v4;  // x8
    st_545c40_0 **v5;  // x9
    unsigned long long v14;  // x9
    unsigned long long v104;  // x0
    unsigned long long v105;  // x1
    unsigned long long v106;  // x16
    unsigned long long v107;  // x14
    unsigned long long v108;  // x14
    unsigned long long v109;  // x16
    unsigned int v110;  // w14
    unsigned int v111;  // w16
    unsigned int v112;  // w16
    unsigned int v113;  // w16
    unsigned long long v15;  // x11
    unsigned int v114;  // w0
    unsigned long v115;  // x16
    unsigned long v116;  // x17
    unsigned long long v117;  // x11
    unsigned long long v118;  // x0
    unsigned long long v119;  // x16
    unsigned long long v120;  // x17
    unsigned long long v121;  // x1
    unsigned long long v122;  // x11
    unsigned long long v123;  // x11
    unsigned long v16;  // x8
    unsigned long long v124;  // x16
    unsigned long long v125;  // x11
    unsigned short v126;  // x17
    unsigned short v127;  // x0
    unsigned short v128;  // x13
    unsigned int v129;  // w17
    unsigned short v130;  // x0
    unsigned short v131;  // x17
    unsigned short v132;  // x11
    unsigned short v133;  // x12
    char v17;  // x10
    unsigned short v134;  // x13
    unsigned int v135;  // w9
    unsigned short v136;  // x15
    unsigned short v137;  // x9
    unsigned short v138;  // x11
    unsigned long long v139;  // x11
    unsigned long long v140;  // x9
    unsigned long long v141;  // x10
    unsigned int v142;  // w8
    unsigned int v143;  // w9
    unsigned long long v18;  // x9
    unsigned int v144;  // w10
    unsigned int v145;  // w10
    unsigned int v146;  // w8
    unsigned int v147;  // w9
    unsigned int v148;  // w10
    unsigned int v149;  // w9
    unsigned int v150;  // w10
    unsigned int v151;  // w11
    unsigned int v153;  // w13
    unsigned long long v19;  // x10
    unsigned int v154;  // w12
    unsigned int v155;  // w8
    unsigned int v156;  // w9
    unsigned int v157;  // w8
    st_545c40_1 *v20;  // x11
    unsigned long long v21;  // x12
    unsigned long long v22;  // x11
    unsigned long v23;  // x9
    unsigned long long v6;  // x10
    unsigned long v24;  // x10
    unsigned long v25;  // x12
    unsigned long long v26;  // x14
    unsigned long long v27;  // x14
    unsigned long long v28;  // x14
    unsigned long long v29;  // x13
    unsigned long long v30;  // x12
    unsigned long long v31;  // x10
    unsigned long long v32;  // x12
    unsigned long long v33;  // x15
    unsigned long long v7;  // x12
    unsigned long long v34;  // x10
    unsigned long long v35;  // x10
    unsigned long long v36;  // x9
    unsigned long v37;  // x12
    unsigned long v38;  // x13
    unsigned long long v39;  // x15
    unsigned long long v40;  // x16
    unsigned long long v41;  // x14
    unsigned long long v42;  // x9
    unsigned long long v43;  // x9
    unsigned long long v8;  // x11
    unsigned long long v44;  // x13
    unsigned long long v45;  // x15
    unsigned long long v46;  // x16
    unsigned long long v47;  // x12
    unsigned long long v48;  // x13
    unsigned long long v49;  // x10
    st_545c40_0 *v50;  // x12
    st_545c40_0 **v51;  // x13
    unsigned long long v52;  // x14
    unsigned long long v53;  // x15
    unsigned long long v9;  // x8
    unsigned long long v54;  // x14
    unsigned long long v55;  // x12
    unsigned long long v56;  // x12
    unsigned long long v57;  // x13
    unsigned long long v58;  // x12
    unsigned long long v59;  // x15
    unsigned int v60;  // w12
    unsigned long long v61;  // x13
    unsigned long long v62;  // x14
    unsigned long long v63;  // x15
    unsigned long v10;  // x9
    unsigned long long v64;  // x17
    unsigned long long v65;  // x0
    unsigned long long v66;  // x17
    unsigned long v67;  // x14
    unsigned long long v68;  // x13
    unsigned long long v69;  // x14
    unsigned long long v70;  // x0
    unsigned int v71;  // w13
    unsigned long long v72;  // x14
    unsigned long v73;  // x16
    unsigned long long v11;  // x8
    unsigned long long v74;  // x17
    unsigned long long v75;  // x0
    unsigned long long v76;  // x16
    unsigned long long v77;  // x16
    unsigned long long v78;  // x16
    unsigned long long v79;  // x16
    unsigned long long v80;  // x17
    unsigned long long v81;  // x0
    unsigned long long v82;  // x15
    unsigned long long v83;  // x16
    unsigned long long v12;  // x8
    unsigned long long v84;  // x15
    unsigned long long v85;  // x16
    unsigned long long v86;  // x17
    unsigned long long v87;  // x1
    unsigned long long v88;  // x0
    unsigned long long v89;  // x1
    unsigned long long v90;  // x2
    unsigned long long v91;  // x16
    unsigned long long v92;  // x15
    unsigned long long v93;  // x15
    unsigned long long v13;  // x8
    unsigned long long v94;  // x17
    unsigned long long v95;  // x15
    unsigned long long v96;  // x16
    unsigned long long v97;  // x16
    unsigned long long v98;  // x0
    unsigned long long v99;  // x15
    unsigned int v100;  // w15
    unsigned long long v101;  // x16
    unsigned long long v102;  // x17
    unsigned long long v103;  // x2
    st_545c40_0 **v0;  // [bp-0x20], Other Possible Types: unsigned long long, char
    st_545c40_0 *v1;  // [bp-0x18], Other Possible Types: unsigned long, unsigned long long
    st_545c40_0 **v2;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_545c40_0 *v3;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v4 = v3;
    v5 = v2;
    v6 = (char *)v5 + 1 + v4 + ((char *)v5 + 0x2 * ~v5 + 1 | ~v4);
    v7 = v5 | v4;
    v8 = -((v5 + v4 ^ -v7) + (v5 + v4 & -v7) * 2);
    v9 = -(v5 & v4);
    v10 = v7 ^ v9;
    v11 = v10 + (v7 + (v9 | ~v7)) * 2 + 2;
    v12 = (v11 ^ 1) + ((v10 * 2 | v10 >> 63) & 2 & 3) + (v6 ^ v8) + (v6 - v11 + (v8 | ~v6)) * 2;
    v13 = v12 + (v12 | 1) + (~v12 | 1);
    v14 = v13 + 1;
    v15 = v14 * 2;
    v2 = (v14 ^ 30) + (v15 & 60) - 1;
    v3 = (v13 - 4 | 0xfffffffffffffffe) + ((~(unsigned int)v15 & 10) + v13 - 4 + (v14 + (5 | ~v14)) * 2 + 2 & 0xfffffffffffffffe) + 1;
    v16 = v2;
    v17 = (char)v16 + (char)~v16 * 2 + 1;
    v18 = 15747240 >> ((char)v3 + (char)v16 * 2 + (v17 | (char)v3) + ((char)v3 + (char)~v3 * 2 + 1 | v17) + 2 & 63);
    v19 = -v18;
    v20 = (char *)&g_f048a8 + 0x2 * ~&g_f048a8 + 1;
    v21 = &v20->padding_0[v18];
    v22 = -(v18 | v20);
    v23 = (char *)&g_f048a8 - v18 - (v19 | 15747240) + (v21 ^ v22);
    v24 = v3;
    v25 = v2;
    v26 = v24 | v25;
    v27 = (v25 + v24 ^ -v26) + (v25 + v24 & -v26) * 2;
    v28 = (~v24 & ~v25) + v26 * 2 + v27 + (-v27 & 0xfffffffffffffffe - ((~v24 & ~v25) + v26 * 2)) * 2 + ((~v24 & ~v25) + v26 * 2 + 1 - (v27 + ((~v24 & ~v25) + v26 * 2 + 1 | -v27))) * 2;
    v29 = (v25 ^ 1) + ~v25 * 2 + ((v25 * 2 | v25 >> 63) & 2 & 3);
    v30 = ((v29 + ~v29 * 2 + 1 | v24) & ~(v29 + ~v29 * 2)) * 4 + (v29 + ~v29 * 2 ^ ~(v29 + ~v29 * 2 + 1 | v24)) * 2;
    v31 = (v25 - v24 | v30) + (v30 & v25 - v24) - v28 + ((v25 - v24 | v30) + (v30 & v25 - v24) - ((v25 - v24 | v30) + (v30 & v25 - v24) - 1 & v28 + 1) & v28 + 1 - ((v25 - v24 | v30) + (v30 & v25 - v24))) * 4 + (((v25 - v24 | v30) + (v30 & v25 - v24) - ((v25 - v24 | v30) + (v30 & v25 - v24) - 1 & v28 + 1) ^ v28 + 1 - ((v25 - v24 | v30) + (v30 & v25 - v24))) + (v28 + 1 | -((v25 - v24 | v30) + (v30 & v25 - v24)))) * 2;
    v32 = v31 - 1;
    v33 = -v31;
    v34 = v32 + (9898673051734457728 & ~(v32 * 2)) + (v31 + (v33 | 4949336525867228864)) * 2 + 13497407547842322752;
    v2 = (v31 + 4998401304856957424 | 0xfffffffffffffffe) + ((8449941463995636766 & ~(v32 * 2)) + v31 + 4998401304856957424 + (v31 + (v33 | 4224970731997818383)) * 2 & 0xfffffffffffffffe) + 1;
    v3 = ~v34 + v34 * 2;
    v35 = v2 + ~v3 + (v3 + 1 & ~v2) * 2 + (v3 + 1 & v2) * 2;
    v36 = v3;
    v37 = v2;
    v38 = -v37;
    v39 = v37 - v36;
    v40 = -(v39 + (v36 | ~v37));
    v41 = v36 + v37 + (v36 - (v37 + (v36 | v38))) * 2 + (v37 + ~v36 & v40) * 4 + ((v37 + ~v36 ^ v40) + (v38 & ~v36)) * 2;
    v42 = ((v37 | v36) & v38) * 4 + ((v37 | v36) ^ v38) * 2 | 1;
    v43 = ~((v42 ^ v39) + (v42 & v39) * 2) + ((v42 ^ v39) + (v42 & v39) * 2) * 2;
    v44 = v41 - v43;
    v45 = v43 - 1;
    v46 = v44 + (v45 | ~v41) + 1;
    v47 = (v41 + (-v43 | ~v41) ^ ~v46) + (v43 - (v45 & v41) & v44) * 4 + ((v43 - (v45 & v41) ^ v44) + (v46 & ~(v41 + (-v43 | ~v41)))) * 2;
    v2 = v47 + (v47 + (~v47 | 15)) * 2 + ((0xffffffff ^ (unsigned int)v47 * 2) & 30) - 14;
    v3 = v47 + 15;
    v48 = (v3 ^ 0xfffffffffffffffe) + v3 * 2 - (v3 * 2 & 2) + 3;
    v49 = ((v19 ^ 15747240) + (v21 & v22) * 4 + v23 * 2) * (~v35 + v35 * 2) >> ((char)v2 + (char)~v48 + ((char)v48 & (char)~v2) * 2 + ((char)v2 + ((char)v48 | (char)~v2)) * 2 + 2 & 63) ^ ((v19 ^ 15747240) + (v21 & v22) * 4 + v23 * 2) * (~v35 + v35 * 2);
    v50 = v1;
    v51 = v0;
    v52 = &v50[(char *)v50 + 0x2 * ~v50 + 1 | v51];
    v53 = v51 | v50;
    v54 = (v53 & ~v52) * 2 - (v52 ^ v53);
    v55 = (char *)v51 - v53 - (v51 & ~v50);
    v56 = v54 - (v55 + 1) + (v55 + 1 + v54 + (-v54 & ~v55) + (v55 & -v54)) * 2;
    v57 = v56 - 2;
    v58 = v56 - 1;
    v59 = v58 + ~v57 * 2 | 56530;
    v0 = v57 + (v58 + (9006 | ~v57)) * 2 + ((0xffffffff ^ (unsigned int)v57 * 2) & 18012) + 0xffffffffffffdcd1;
    v1 = v58 + (56530 | ~v57) + (v57 ^ 56530) + (v59 ^ v58) + (v59 & v58) * 2;
    v60 = (unsigned int)v1 + (0xffffffff ^ (unsigned int)v1 * 2) + (unsigned int)v0 + (-((unsigned int)v1 + (0xffffffff ^ (unsigned int)v1 * 2)) & ~(unsigned int)v0) * 2 + ((unsigned int)v0 + ((unsigned int)v1 + 1 | ~(unsigned int)v0)) * 2 + 2;
    g_f1216a = (unsigned short)v49 + (unsigned short)~v60 + (unsigned short)v60 * 2 + ((unsigned short)~v60 + (unsigned short)v60 * 2 | (unsigned short)v49) + (unsigned short)~(~v60 + v60 * 2 | (unsigned int)v49) * 2 + 2;
    v61 = v1;
    v62 = -v61;
    v63 = v0;
    v64 = v63 + ~v63 * 2;
    v65 = v61 + ~(v64 + 1 | v61);
    v66 = v64 + 2;
    v67 = v63 - (v61 + (v63 | v62)) + (v65 ^ v66);
    v68 = v61 - v63 + (v61 * 3 + ~v61 * 4 + 3 & v63) * 2 + (v63 ^ v62) + v67 * 2 + (v65 & v66) * 4 + ~((v63 ^ v62) + v67 * 2 + (v65 & v66) * 4) * 2;
    v69 = v68 + 2;
    v70 = ((0xfffffffffffffffd - v68 | 9) ^ v68 + 3) + ((0xfffffffffffffffd - v68 | 9) & v68 + 3) * 2;
    v0 = (v70 ^ (v69 | 9) + 1) + (v70 & (v69 | 9) + 1) * 2 - 1;
    v1 = v68 + (v69 * 2 & 16) + (v69 * 2 & 16 ^ 16) - 7;
    v71 = v49 >> ((char)v1 + v0 & 63);
    v72 = v1;
    v73 = v0;
    v74 = (~v72 & ~v73) - (v73 & v72) + (v73 | v72) * 2 + 1;
    v75 = (v73 ^ 1) + ~v73 * 2 + ((v73 * 2 | v73 >> 63) & 2 & 3);
    v76 = ((v75 + ~v75 * 2 + 1 | v72) & ~(v75 + ~v75 * 2)) * 4 + (v75 + ~v75 * 2 ^ ~(v75 + ~v75 * 2 + 1 | v72)) * 2;
    v77 = v76 + ~v76 * 2 | 1;
    v78 = v77 - (v73 + 1 + v72 + (-v72 & ~v73) * 2 + (v73 + 1 + (-v72 | ~v73)) * 2) + (v73 + 1 + v72 + (-v72 & ~v73) * 2 + (v73 + 1 + (-v72 | ~v73)) * 2 + ~v77) * 2;
    v79 = v74 + (v78 & v74) + v78 + (0xffffffffffffffff ^ v78 * 2) + (v78 + (0xffffffffffffffff ^ v78 * 2) | ~v74);
    v80 = v79 + 1;
    v81 = v79 + 2;
    v82 = (((0xfffffffffffffffd - v79 | 34887) ^ v79 + 3) + ((0xfffffffffffffffd - v79 | 34887) & v79 + 3) * 2 ^ v80 - (v81 & 34887) + 34889) + (((0xfffffffffffffffd - v79 | 34887) ^ v79 + 3) + ((0xfffffffffffffffd - v79 | 34887) & v79 + 3) * 2 & v80 - (v81 & 34887) + 34889) * 2;
    v83 = (v80 + 30650 + (0xffffffffffff8847 & ~v81) ^ -(0xffffffffffff8847 & ~v81)) + (v80 + 30650 + (0xffffffffffff8847 & ~v81) & -(0xffffffffffff8847 & ~v81)) * 2;
    v0 = ~v82 + v82 * 2;
    v1 = ~v83 + v83 * 2;
    g_f1216c = ((unsigned short)v1 + (unsigned short)v0 | (unsigned short)v71) + (unsigned short)v1 + (unsigned short)v0 + (unsigned short)v71 + ((unsigned short)-((unsigned int)v1 + (unsigned int)v0 | v71) & (unsigned short)~((unsigned int)v1 + (unsigned int)v0 + v71)) * 2 + ((unsigned short)v1 + (unsigned short)v0 + (unsigned short)v71 + ((unsigned short)-((unsigned int)v1 + (unsigned int)v0 | v71) | (unsigned short)~((unsigned int)v1 + (unsigned int)v0 + v71))) * 2 + 2;
    v84 = v1;
    v85 = v0;
    v86 = v85 | v84;
    v87 = v84 + 1;
    v88 = v87 + ~v84 * 2;
    v89 = ((v88 | v85) ^ v87) + ((v88 | v85) & v87) * 2;
    v90 = v85 + ~v85 * 2 + 1;
    v91 = v86 - (v85 + v88) + v89 - 4;
    v92 = v91 + ((v86 | -v89) - (v89 + (v86 | -v89) + (v90 + ~v90 * 2 + 1 & ~v84) + v90 + v84)) * 2;
    v93 = (v92 * 2 & 4) + (v92 ^ 2);
    v94 = v93 - 1;
    v0 = (v91 | 0xfffffffffffffffe) + (v93 + ((-v93 | 3) + v93) * 2 + ((0xffffffff ^ (unsigned int)v94 * 2) & 6) - 4 & 0xfffffffffffffffe) + 1;
    v1 = ((v93 - v93 * 2 | 30) ^ v93) + (v94 | 30) + ((v93 - v93 * 2 | 30) & v93) * 2;
    v95 = v0;
    v96 = v1;
    v97 = v96 + 1;
    v98 = v97 + ~v96 * 2 | ~v95;
    v99 = (v97 + v95 + v98 + 1 ^ v96 & v95) + (v97 + v95 + v98 + 1 & v96 & v95) * 2;
    v100 = v49 >> ((char)~v99 + (char)v99 * 2 & 63);
    v101 = v1;
    v102 = v0;
    v103 = v101 + 1;
    v104 = v103 + ~v101 * 2 - v102 + (v102 | ~(v103 + ~v101 * 2)) + v102 + v101;
    v105 = ((v102 | ~v101) ^ v103) + ((v102 | ~v101) & v103) * 2;
    v106 = -(((v101 | ~v102) ^ v102 + 1) + ((v101 | ~v102) & v102 + 1) * 2);
    v107 = v104 + v105 + ~v105 * 2 + (0xffffffffffffffff ^ (v104 + 1 & v106) * 2) - (v104 + 1 ^ v106) + 3;
    v108 = v107 + (v107 | 1) + (~v107 | 1);
    v109 = v108 + 1;
    v0 = (v109 | 1) + (v109 & 1) + 2148;
    v1 = (((0xffffffff ^ (unsigned int)v109 * 2) & 126774) + v108 + 0xffffffffffff0866 + (v109 + (63387 | ~v109)) * 2 + 2 | 1) + (v108 + 0xffffffffffff0866 & 1) - 2;
    v110 = v0;
    v111 = v1;
    v112 = v110 + (v111 | ~v110) + (v111 ^ v110) + 1;
    v113 = v111 + v110 + ~(v111 | v110) + ((unsigned int)(0xfffffffe - (v111 + v110 + ~(v111 | v110))) | v112) + (v111 & v110 | v112);
    v114 = (v100 ^ 1) + ~v100 * 2 + (__ROL__(v100, 1) & 2 & 3);
    g_f1216e = (unsigned short)v113 + 3 + (unsigned short)v100 + (unsigned short)v114 + ((unsigned short)v114 + (unsigned short)~v114 * 2 + 1 | (unsigned short)v113 + 3 + (unsigned short)~(v113 + 2) * 2) + 1;
    v115 = v1;
    v116 = v0;
    v117 = v115 + 1 + v115 + 1 + ~v115 * 2 + (v116 | ~(v115 + 1 + ~v115 * 2)) + ((v115 + 1 + ~v115 * 2 | v116) ^ 0xfffffffffffffffe - v115) - ((v115 + 1 + ~v115 * 2 | v116) & v115 + 1) * 2;
    v118 = v117 + 1;
    v119 = ((v116 ^ -v115) + (v116 + 1 + (-v115 | ~v116)) * 2 | (v116 + 1 + ~v116 * 2 + 1 & (v115 | ~(v116 + 1 + ~v116 * 2))) * 4 + (v116 + 1 + ~v116 * 2 + 1 ^ (v115 | ~(v116 + 1 + ~v116 * 2))) * 2) + ((v116 + 1 + ~v116 * 2 + 1 & (v115 | ~(v116 + 1 + ~v116 * 2))) * 4 + (v116 + 1 + ~v116 * 2 + 1 ^ (v115 | ~(v116 + 1 + ~v116 * 2))) * 2 & (v116 ^ -v115) + (v116 + 1 + (-v115 | ~v116)) * 2);
    v120 = v119 + ~v119 * 2;
    v121 = v120 + 1;
    v122 = ((v118 & ~v121) + ~v117 + (v120 + 2 | v118)) * 2;
    v123 = (v118 - v119 & -(v118 | -v119)) * 4 + (v118 - v119 ^ -(v118 | -v119)) * 2 - (v121 ^ v118) + v122 + ((v121 ^ v118) - v122 | (v118 - v119 & -(v118 | -v119)) * 4 + (v118 - v119 ^ -(v118 | -v119)) * 2) + (v122 + (v121 ^ ~v118) & ~((v118 - v119 & -(v118 | -v119)) * 4 + (v118 - v119 ^ -(v118 | -v119)) * 2));
    v124 = ((char *)&g_fffffffffffffff8 - (v123 & (char *)&g_fffffffffffffff8 + 1) + 2 ^ v123 + 6) + ((char *)&g_fffffffffffffff8 - (v123 & (char *)&g_fffffffffffffff8 + 1) + 2 & v123 + 6) * 2;
    v0 = (v123 | 6) + v124 + (v123 | 6 | ~v124) + (v124 & ~(v123 | 6)) + 1;
    v1 = ((v123 ^ 43) + (v123 + (43 | ~v123)) * 2 + 2 | 1) + ((v123 ^ 43) & 1) - 2;
    v125 = (v1 + 1 ^ v0) + (v0 + (v1 + 1 | ~v0)) * 2 + 2;
    g_f12170 = v49 >> ((char)v125 * 3 + (char)~v125 * 2 + 1 & 63);
    v126 = g_f1216a | g_f048a8;
    v127 = -g_f048a8;
    g_f048a8 = g_f048a8 - g_f1216a + (v126 ^ v127) * 2 + (v126 & v127) * 4;
    v128 = -g_f1216c;
    v129 = g_f048aa + ~g_f048aa * 2 + 1;
    v130 = (unsigned short)v129 + g_f1216c;
    v131 = -(v129 | g_f1216c);
    v132 = g_f1216c + g_f048aa + (v128 & ~g_f048aa) * 2 + (unsigned short)(g_f048aa - g_f1216c - (v128 | g_f048aa)) * 2;
    v133 = (v130 & v131) * 4 + (v130 ^ v131) * 2 | 1;
    g_f048aa = (v133 ^ v132) + (v133 & v132) * 2 - 1;
    g_f048ac = g_f1216e + g_f048ac + ((g_f048ac & ~g_f1216e) + ~g_f048ac) * 2 + 2;
    v134 = -g_f12170;
    v135 = (0xffffffff ^ g_f048ae * 2) + g_f048ae;
    v136 = (unsigned short)v135 + g_f12170;
    v137 = -(v135 | g_f12170);
    v138 = (v134 ^ g_f048ae) + (unsigned short)(g_f048ae - g_f12170 - (v134 | g_f048ae)) * 2;
    g_f048ae = (v138 | (v136 & v137) * 4 + (v136 ^ v137) * 2) + ((v136 & v137) * 4 + (v136 ^ v137) * 2 & v138);
    v139 = g_f048b0 + v49;
    v140 = g_f048b0 | v49;
    v141 = -((v139 ^ -v140) + (v139 & -v140) * 2);
    g_f048b0 = (v141 ^ v140) + (v140 + (v141 | ~v140)) * 2 + 2;
    v142 = v1;
    v143 = *(unsigned int *)&v0;
    v144 = (unsigned int)(v143 - v142 - (v142 + ~v142 * 2 + 1 | v143)) + (v143 + ~v143 * 2 + 1 & v142);
    v145 = (v144 | 1) + (v144 & 1) - 2;
    v146 = ((v145 | v142) ^ -(v145 & v142)) + ((v145 ^ v142) - (v145 | v142 | -(v145 & v142))) * 2;
    v147 = v145 & v143;
    v148 = v145 - v143 + v147 + (v143 & ~v145) * 2;
    v149 = v148 + v147 + (-v147 & ~v148) * 2 + (v148 + (-v147 | ~v148)) * 2 + 2;
    v150 = ~v146;
    v151 = (v150 & ~v149) + (v149 | v146) * 2;
    v153 = (v149 & v146) + v151 + 2 + ((unsigned int)(0xfffffffe - v151) & -(v149 & v146)) * 2 + (((unsigned int)(0xfffffffe - v151) | -(v149 & v146)) + v151 + 2) * 2 - 1;
    v154 = (v149 ^ 1) + v149 * 2 + ~v149 * 4 + (v149 * 2 & 2) + 2;
    v155 = v146 + v150 * 2 + v149 + 2;
    v156 = (v154 + v146 & -(v154 | v146)) * 4 + (v154 + v146 ^ -(v154 | v146)) * 2;
    v157 = (v155 | v156) + (v156 & v155);
    return v153 - v157 + (v157 | -((v149 & v146) + v151 + 2 + ((unsigned int)(0xfffffffe - v151) & -(v149 & v146)) * 2 + (((unsigned int)(0xfffffffe - v151) | -(v149 & v146)) + v151 + 2) * 2)) + (v153 & ~v157) + 1;
}
