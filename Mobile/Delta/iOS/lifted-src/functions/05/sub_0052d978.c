/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52d978..0x52e850 (3800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52d978_1 {
    char padding_0[31494545];
    unsigned short field_1e09191;
} st_52d978_1;

typedef struct st_52d978_0 {
    char field_0;
} st_52d978_0;

extern unsigned short g_f048c8;
extern unsigned short g_f048ca;
extern unsigned short g_f048cc;
extern unsigned short g_f048ce;
extern unsigned long long g_f048d0;
extern unsigned short g_f1217a;
extern unsigned short g_f1217c;
extern unsigned short g_f1217e;
extern unsigned short g_f12180;

int sub_52d978(void)
{
    st_52d978_0 *v4;  // x8
    st_52d978_0 **v5;  // x9
    unsigned long long v14;  // x9
    unsigned long long v104;  // x0
    unsigned long long v105;  // x17
    unsigned long long v106;  // x0
    unsigned long long v107;  // x11
    unsigned long long v108;  // x15
    unsigned long long v109;  // x15
    unsigned long long v110;  // x17
    unsigned long long v111;  // x15
    unsigned long long v112;  // x0
    unsigned long long v113;  // x15
    unsigned long long v15;  // x11
    unsigned long long v114;  // x15
    unsigned long long v115;  // x17
    unsigned long long v116;  // x1
    unsigned long long v117;  // x0
    unsigned long long v118;  // x15
    unsigned long long v119;  // x15
    unsigned long long v120;  // x16
    unsigned long long v121;  // x17
    unsigned long long v122;  // x13
    unsigned long long v123;  // x15
    unsigned long v16;  // x9
    unsigned long long v124;  // x0
    unsigned long long v125;  // x13
    unsigned int v126;  // w16
    unsigned int v127;  // w17
    unsigned int v128;  // w17
    unsigned int v129;  // w0
    unsigned int v130;  // w12
    unsigned short v131;  // x12
    unsigned short v132;  // x14
    unsigned short v133;  // x14
    char v17;  // x11
    unsigned short v134;  // x15
    unsigned short v135;  // x16
    unsigned long long v136;  // x12
    unsigned long long v137;  // x13
    unsigned long long v138;  // x10
    unsigned long long v139;  // x11
    unsigned int v140;  // w9
    unsigned int v141;  // w10
    unsigned int v142;  // w11
    unsigned int v143;  // w12
    unsigned long long v18;  // x10
    unsigned int v144;  // w9
    unsigned int v145;  // w13
    unsigned int v146;  // w11
    unsigned int v147;  // w8
    unsigned int v148;  // w8
    unsigned int v149;  // w9
    unsigned int v150;  // w10
    unsigned int v151;  // w9
    unsigned int v152;  // w10
    unsigned int v153;  // w8
    st_52d978_1 *v19;  // x12
    unsigned int v154;  // w12
    unsigned int v155;  // w11
    unsigned int v156;  // w9
    unsigned int v157;  // w8
    unsigned int v158;  // w8
    unsigned long v20;  // x12
    unsigned long v21;  // x13
    unsigned long long v22;  // x15
    unsigned long long v23;  // x15
    unsigned long long v6;  // x10
    unsigned long long v24;  // x15
    unsigned long long v25;  // x14
    unsigned long long v26;  // x13
    unsigned long long v27;  // x12
    unsigned long long v28;  // x13
    unsigned long long v29;  // x16
    unsigned long long v30;  // x12
    unsigned long long v31;  // x12
    unsigned long long v32;  // x12
    unsigned long v33;  // x13
    unsigned long long v7;  // x12
    unsigned long v34;  // x14
    unsigned long long v35;  // x16
    unsigned long long v36;  // x17
    unsigned long long v37;  // x15
    unsigned long long v38;  // x12
    unsigned long long v39;  // x12
    unsigned long long v40;  // x14
    unsigned long long v41;  // x16
    unsigned long long v42;  // x17
    unsigned long long v43;  // x12
    unsigned long long v8;  // x11
    unsigned long long v44;  // x13
    unsigned long long v45;  // x10
    st_52d978_0 *v46;  // x12
    st_52d978_0 **v47;  // x13
    st_52d978_0 *v48;  // x14
    unsigned long long v49;  // x16
    unsigned long long v50;  // x15
    unsigned long long v51;  // x12
    unsigned long long v52;  // x12
    unsigned long long v53;  // x0
    unsigned long long v9;  // x8
    unsigned long long v54;  // x12
    unsigned long long v55;  // x13
    unsigned int v56;  // w12
    unsigned short v57;  // x12
    unsigned int v58;  // w13
    unsigned long v59;  // x13
    unsigned long v60;  // x14
    unsigned long long v61;  // x15
    unsigned long long v62;  // x16
    unsigned long long v63;  // x15
    unsigned long v10;  // x9
    unsigned long long v64;  // x14
    unsigned long long v65;  // x16
    unsigned long long v66;  // x0
    unsigned long long v67;  // x1
    unsigned long long v68;  // x15
    unsigned long long v69;  // x14
    unsigned long long v70;  // x14
    unsigned long long v71;  // x15
    unsigned int v72;  // w14
    unsigned long long v73;  // x15
    unsigned long long v11;  // x8
    unsigned long long v74;  // x16
    unsigned long long v75;  // x0
    unsigned long long v76;  // x17
    unsigned long long v77;  // x17
    unsigned long long v78;  // x0
    unsigned long long v79;  // x16
    unsigned long long v80;  // x16
    unsigned long long v81;  // x0
    unsigned int v82;  // w17
    unsigned short v83;  // x2
    unsigned long long v12;  // x8
    unsigned short v84;  // x1
    unsigned short v85;  // x16
    unsigned int v86;  // w17
    unsigned short v87;  // x16
    unsigned short v88;  // x14
    unsigned long v89;  // x16
    unsigned long long v90;  // x0
    unsigned long long v91;  // x2
    unsigned long long v92;  // x1
    unsigned long long v93;  // x1
    unsigned long long v13;  // x8
    unsigned long long v94;  // x3
    unsigned long long v95;  // x16
    unsigned long long v96;  // x17
    unsigned long long v98;  // x17
    unsigned long long v99;  // x0
    unsigned long long v100;  // x1
    unsigned long long v101;  // x2
    unsigned long long v102;  // x1
    unsigned long long v103;  // x3
    st_52d978_0 **v0;  // [bp-0x20], Other Possible Types: char, unsigned long long
    st_52d978_0 *v1;  // [bp-0x18], Other Possible Types: unsigned long, unsigned long long
    st_52d978_0 **v2;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_52d978_0 *v3;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

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
    v18 = 15747272 >> ((char)v3 + (char)v16 * 2 + (v17 | (char)v3) + ((char)v3 + (char)~v3 * 2 + 1 | v17) + 2 & 63);
    v19 = (char *)&g_f048c8 + 0x2 * ~&g_f048c8 + 1;
    v20 = v3;
    v21 = v2;
    v22 = v20 | v21;
    v23 = (v21 + v20 ^ -v22) + (v21 + v20 & -v22) * 2;
    v24 = (~v20 & ~v21) + v22 * 2 + v23 + (-v23 & 0xfffffffffffffffe - ((~v20 & ~v21) + v22 * 2)) * 2 + ((~v20 & ~v21) + v22 * 2 + 1 - v23 - ((~v20 & ~v21) + v22 * 2 + 1 | -v23)) * 2;
    v25 = (v21 ^ 1) + ~v21 * 2 + ((v21 * 2 | v21 >> 63) & 2 & 3);
    v26 = ((v25 + ~v25 * 2 + 1 | v20) & ~(v25 + ~v25 * 2)) * 4 + (v25 + ~v25 * 2 ^ ~(v25 + ~v25 * 2 + 1 | v20)) * 2;
    v27 = (v21 - v20 | v26) + (v26 & v21 - v20) - v24 + ((v21 - v20 | v26) + (v26 & v21 - v20) - ((v21 - v20 | v26) + (v26 & v21 - v20) - 1 & v24 + 1) & v24 + 1 - ((v21 - v20 | v26) + (v26 & v21 - v20))) * 4 + (((v21 - v20 | v26) + (v26 & v21 - v20) - ((v21 - v20 | v26) + (v26 & v21 - v20) - 1 & v24 + 1) ^ v24 + 1 - ((v21 - v20 | v26) + (v26 & v21 - v20))) + (v24 + 1 | -((v21 - v20 | v26) + (v26 & v21 - v20)))) * 2;
    v28 = v27 - 1;
    v29 = -v27;
    v30 = v28 + (9898673051734457728 & ~(v28 * 2)) + (v27 + (v29 | 4949336525867228864)) * 2 + 13497407547842322752;
    v2 = (v27 + 4998401304856957424 | 0xfffffffffffffffe) + ((8449941463995636766 & ~(v28 * 2)) + v27 + 4998401304856957424 + (v27 + (v29 | 4224970731997818383)) * 2 & 0xfffffffffffffffe) + 1;
    v3 = ~v30 + v30 * 2;
    v31 = v2 + ~v3 + (v3 + 1 & ~v2) * 2 + (v3 + 1 & v2) * 2;
    v32 = v3;
    v33 = v2;
    v34 = -v33;
    v35 = v33 - v32;
    v36 = -(v35 + (v32 | ~v33));
    v37 = v32 + v33 + (v32 - v33 - (v32 | v34)) * 2 + (v33 + ~v32 & v36) * 4 + ((v33 + ~v32 ^ v36) + (v34 & ~v32)) * 2;
    v38 = ((v33 | v32) & v34) * 4 + ((v33 | v32) ^ v34) * 2 | 1;
    v39 = ~((v38 ^ v35) + (v38 & v35) * 2) + ((v38 ^ v35) + (v38 & v35) * 2) * 2;
    v40 = v37 - v39;
    v41 = v39 - 1;
    v42 = v40 + (v41 | ~v37) + 1;
    v43 = (v37 + (-v39 | ~v37) ^ ~v42) + (v39 - (v41 & v37) & v40) * 4 + ((v39 - (v41 & v37) ^ v40) + (v42 & ~(v37 + (-v39 | ~v37)))) * 2;
    v2 = v43 + (v43 + (~v43 | 15)) * 2 + ((0xffffffff ^ (unsigned int)v43 * 2) & 30) - 14;
    v3 = v43 + 15;
    v44 = (v3 ^ 0xfffffffffffffffe) + v3 * 2 - (v3 * 2 & 2) + 3;
    v45 = ((-v18 ^ 15747272) + (&v19->padding_0[v18] & -(v18 | v19)) * 4 + ((char *)&g_f048c8 - v18 - (-v18 | 15747272) + (&v19->padding_0[v18] ^ -(v18 | v19))) * 2) * (~v31 + v31 * 2) >> ((char)v2 + (char)~v44 + ((char)v44 & (char)~v2) * 2 + ((char)v2 + ((char)v44 | (char)~v2)) * 2 + 2 & 63) ^ ((-v18 ^ 15747272) + (&v19->padding_0[v18] & -(v18 | v19)) * 4 + ((char *)&g_f048c8 - v18 - (-v18 | 15747272) + (&v19->padding_0[v18] ^ -(v18 | v19))) * 2) * (~v31 + v31 * 2);
    v46 = v1;
    v47 = v0;
    v48 = ~v46;
    v49 = v47 | v46;
    v50 = (v47 + v46 ^ -v49) + (v47 + v46 & -v49) * 2;
    v51 = v46 + 1 + v47 + ((char *)v46 + 0x2 * v48 + 1 | ~v47);
    v52 = v51 + v50 + (-v50 & ~v51) * 2 + (v51 + (-v50 | ~v51)) * 2 + 2;
    v53 = v52 * 2;
    v54 = (v48 & ~v47) + v50 + (v49 + ~v50) * 2 + v52 + 3;
    v55 = v54 - v53;
    v0 = (v55 | 1) + (v54 & 1) + 56350 + ~(v55 & 56350) + ((v55 ^ 0xffffffffffff23e1) + v55 + (v55 & 56350 ^ 56350)) * 2 + (0xfffffffffffffffe - ((v55 ^ 0xffffffffffff23e1) + v55 + (v55 & 56350 ^ 56350)) | (v55 | 1) + (v54 & 1) + 56350 + ~(v55 & 56350)) + (0xfffffffffffffffe - ((v55 ^ 0xffffffffffff23e1) + v55 + (v55 & 56350 ^ 56350)) | (v55 & 56350) - ((v55 | 1) + (v54 & 1) + 56350)) + 4;
    v1 = v55 + (v55 | 9185) + (v53 + ~v54 | 9185) + 1;
    v56 = v0 + ~(unsigned int)v1 + ((unsigned int)v1 + 1 & ~v0) * 2 + (v0 + ((unsigned int)v1 + 1 | ~v0)) * 2 + 2;
    v57 = (unsigned short)v56 * 3 + (unsigned short)~v56 * 2;
    v58 = ((unsigned int)v45 ^ 1) + ~(unsigned int)v45 * 2 + (__ROL__((unsigned int)v45, 1) & 2 & 3);
    g_f1217a = v57 + (unsigned short)v45 + (unsigned short)v58 + ((unsigned short)(0xfffffffe - v57) | (unsigned short)~v58) + 3;
    v59 = v1;
    v60 = v0;
    v61 = (v59 ^ -v60) + (v59 - v60 - (v59 | -v60)) * 2;
    v62 = (v59 * 3 + ~v59 * 4 + 3 & v60) * 2;
    v63 = v61 + (v62 | ~v61) + (v62 | v61) + 1;
    v64 = v60 + (v59 | ~v60) + (v60 ^ v59) + (v60 + v59 ^ -(v60 | v59)) + (v60 + v59 & -(v60 | v59)) * 2 + ~((v60 + v59 ^ -(v60 | v59)) + (v60 + v59 & -(v60 | v59)) * 2) * 2;
    v65 = v64 + 3;
    v66 = v63 + ~v63 * 2;
    v67 = v66 + 1;
    v68 = (v63 ^ v65) + ((v63 & v65) + v67 - v65 - (v67 | 0xfffffffffffffffd - v64)) * 2;
    v69 = ((v67 & v64 + 2) - v65 & ~v66) * 4 + (v66 ^ ~((v67 & v64 + 2) - v65)) * 2;
    v70 = v68 + (v69 | ~v68) + (v69 | v68);
    v0 = v70 + 5;
    v1 = ((v70 + 1 | 1) + (v70 + 1 & 1) + 12 | 1) + ((v70 + 1 | 1) + (v70 + 1 & 1) + 12 & 1) - 2;
    v71 = (v1 ^ 1) + ~v1 * 2 + ((v1 * 2 | v1 >> 63) & 2 & 3);
    v72 = v45 >> ((char)(v71 + (v0 - v71 - (v0 | -v71)) * 2 + (-v71 & ~v0) * 2 + v0 - 1) & 63);
    v73 = v1;
    v74 = v0;
    v75 = v73 + 1;
    v76 = v75 + ~v73 * 2 | v74;
    v77 = -((v76 ^ v75) + (v76 & v75) * 2);
    v78 = v74 | v73;
    v79 = (1 | (v74 + v73 & -v78) * 2) - (v78 + (v78 - 1 ^ v74 + v73)) + (v77 ^ v78);
    v80 = v79 + (v78 + (v77 | ~v78)) * 2 + (v79 | 0xfffffffffffffffe) + (~(unsigned int)v79 & 1) + 1;
    v81 = v80 * 2;
    v0 = (v80 ^ 46312) + (v81 & 92624) - 1;
    v1 = (v80 ^ 19225) + (v81 & 38450) - 1;
    v82 = v1;
    v83 = (unsigned short)v82 + 1;
    v84 = v83 + ((unsigned short)v0 | (unsigned short)~v82);
    v85 = (v83 + (unsigned short)~v82 * 2 & (unsigned short)v0) + (unsigned short)v82;
    v86 = v72 * 2;
    v87 = (unsigned short)v72 + (unsigned short)~v86 | (v84 | v85) + (v85 & v84);
    v88 = (unsigned short)(v86 + (v72 ^ 0xfffffffe) - (v86 & 2)) + 3;
    g_f1217c = (v87 ^ v88) + (v87 & v88) * 2;
    v89 = v1;
    v90 = v0;
    v91 = v90 + 1;
    v92 = v91 + ~v90 * 2;
    v93 = v92 + 1;
    v94 = v93 + ~v92 * 2 | v89;
    v95 = (v90 ^ v89) - (v89 + v90 + (v91 + (-v89 | ~v90)) * 2 + (v94 & v93) * 4 + ((v94 ^ v93) + (-v89 & ~v90)) * 2);
    v96 = v95 + (21 | ~v95) + 1;
    v0 = (v96 ^ (v95 & 0xffffffffffffffea) + 22) + (v96 & (v95 & 0xffffffffffffffea) + 22) * 2 - 1;
    v1 = v95 + (v95 | 11) + (0xfffffffffffffff4 & ~v95) + 12;
    v98 = v1;
    v99 = v0;
    v100 = v98 + 1;
    v101 = v100 + ~v98 * 2 | v99;
    v102 = v99 + v100 - (v99 & v98) + (v101 ^ 0xfffffffffffffffe - v98) - (v101 & v100) * 2;
    v103 = v99 + 1;
    v104 = (v103 + ~v99 * 2 & v98) * 2;
    v105 = (v99 ^ -v98) + (v103 + (-v98 | ~v99)) * 2;
    v106 = (v104 | ~v105) + v104 + v105 * 2 - (v105 & v104);
    v107 = ((1 & ~v105) + (0xfffffffffffffffe - v106 | 1) | v102) + ~(((1 & ~v105) + (0xfffffffffffffffe - v106 | 1) | ~v102) + v102);
    v108 = v102 + ~v102 * 2 + 1;
    v109 = v107 + (v102 - v106 + v108 + (v106 + 0x8000000000000000 | ~v108)) * 2;
    v110 = v109 + 2;
    v111 = v109 + 3;
    v112 = v110 + v111 + ~v110 * 2 + (~((unsigned int)v111 + (unsigned int)~v110 * 2) | 0xffffffffffff13d6);
    v113 = ((5078 | ~v110) ^ v111) + ((5078 | ~v110) & v111) * 2;
    v0 = v112 + v111 + (0xffffffffffff13d6 | ~v110) + (0xffffffffffff13d4 - v112 | v111 + (0xffffffffffff13d6 | ~v110) + 60457) + (v112 + 60459 & 0xffffffffffff13d6 - (v111 + (0xffffffffffff13d6 | ~v110))) + 120917;
    v1 = (v110 | 1) + (v107 & 1) + 5078 - (v110 & 5078) + v113 + (v113 & (v110 & 5078) - ((v110 | 1) + (v107 & 1) + 5078)) + ((v110 | 1) + (v107 & 1) + 5078 + ~(v110 & 5078) | ~v113);
    g_f1217e = (unsigned short)(((unsigned short)v1 + 1 ^ (unsigned int)v0) + ((unsigned short)v1 + 1 & (unsigned int)v0) * 2 - 1) & (unsigned short)(v45 >> ((((char)v1 + (char)~(v1 | v0) ^ (char)v0 + 1) + ((char)v1 + (char)~(v1 | v0) & (char)v0 + 1) * 2 ^ ((char)v1 | (char)v0) + 1) + (((char)v1 + (char)~(v1 | v0) ^ (char)v0 + 1) + ((char)v1 + (char)~(v1 | v0) & (char)v0 + 1) * 2 & ((char)v1 | (char)v0) + 1) * 2 - 1 & 63));
    v114 = v1;
    v115 = v0;
    v116 = v115 | v114;
    v117 = (v116 - 1 ^ v115 + v114) - (v115 + v114 & -v116) * 2 + v116;
    v118 = (v115 ^ -v114) + (v116 & -v115) * 4 + (v115 - v114 - (v115 | -v114) + (v116 ^ -v115)) * 2;
    v119 = (v117 + 1 ^ v118) + (v117 + 1 & v118) * 2 + (~v117 - v118 + (v118 + 0x7fffffffffffffff & v117 + 1)) * 2 + (v117 + 1 - v118 + (v118 + 0x7fffffffffffffff & 0x7ffffffffffffffe - v117)) * 2;
    v120 = v119 + 1;
    v121 = v120 * 2 + 2;
    v122 = 0xfffffffffffffffd - v119;
    v123 = v119 + 3;
    v124 = v120 + (~(unsigned int)v121 & 94) + ((v122 | 47) + v123) * 2 - 46;
    v0 = v124 * 3 + ~v124 * 2 + 1;
    v1 = v120 + (v122 | 2) + v122 * 2 + v121 - (v122 * 2 + v123 & 0xfffffffffffffffd) + 3;
    v125 = ((v1 + v0 ^ -(v1 | v0)) + (v1 + v0 & -(v1 | v0)) * 2 ^ (v1 | v0) + 1) + ((v1 + v0 ^ -(v1 | v0)) + (v1 + v0 & -(v1 | v0)) * 2 & (v1 | v0) + 1) * 2;
    g_f12180 = v45 >> ((char)~v125 + (char)v125 * 2 & 63);
    v126 = -g_f1217a;
    v127 = g_f048c8 + ~g_f048c8 * 2;
    v128 = v127 + 2;
    v129 = v128 + ~(v127 + 1) * 2 | g_f1217a;
    v130 = g_f1217a + g_f048c8 + (v126 & ~g_f048c8) * 2 + (unsigned int)(g_f048c8 - g_f1217a - (v126 | g_f048c8)) * 2;
    g_f048c8 = (unsigned short)v130 + ((unsigned short)v129 & (unsigned short)v128) * 4 + ((unsigned short)v129 ^ (unsigned short)v128) * 2 + (((unsigned short)v129 & (unsigned short)v128) * 4 + ((unsigned short)v129 ^ (unsigned short)v128) * 2 | (unsigned short)~v130) + ((unsigned short)v130 & (unsigned short)~((v129 & v128) * 4 + (v129 ^ v128) * 2)) + 1;
    v131 = g_f048ca - g_f1217c;
    v132 = (g_f048ca + ~g_f048ca * 2 + 1 & g_f1217c) * 2;
    g_f048ca = (v131 | v132) + (v132 & v131);
    v133 = -g_f1217e;
    v134 = g_f1217e + ~g_f048cc;
    v135 = -(g_f1217e | ~g_f048cc);
    g_f048cc = g_f1217e + g_f048cc + (v134 & v135) * 4 + ((unsigned short)(g_f048cc - g_f1217e - (v133 | g_f048cc)) + (v133 & ~g_f048cc) + (v134 ^ v135)) * 2;
    g_f048ce = (unsigned short)((~g_f048ce & ~g_f12180) - (g_f12180 & g_f048ce)) + (g_f12180 | g_f048ce) * 2 + 1;
    v136 = g_f048d0 | v45;
    v137 = -g_f048d0;
    v138 = g_f048d0 - v45;
    v139 = (v136 & v137) * 4 + (v136 ^ v137) * 2 | 1;
    g_f048d0 = (v139 ^ v138) + (v139 & v138) * 2 - 1;
    v140 = v1;
    v141 = *(unsigned int *)&v0;
    v142 = (v140 | v141) + (v141 & v140) + ~(v141 & v140) * 2;
    v143 = v142 + 2;
    v144 = ((unsigned int)((v143 | v140) - (v143 + v140)) & (v143 | v140)) * 2 - ((v143 | v140) ^ v143 + v140 + ~(v143 | v140));
    v145 = v144 - 1;
    v146 = (v143 ^ 1) - v142 * 2 + (__ROL__(v143, 1) & 2 & 3);
    v147 = (unsigned int)(5 - v146) | v141;
    v148 = v143 - v141 + (v147 ^ v146 - 5) * 2 + (v147 & v146 - 5) * 4;
    v149 = v148 + v145 + (-v148 & -v144) * 2 + ((-v148 | -v144) + v144) * 2;
    v150 = (v145 - v144 * 4 + v145 * 2 + 3 & v148) * 2;
    v151 = v149 + (v150 | ~v149) + (v150 | v149);
    v152 = v151 + 1;
    v153 = (v148 | v145) + ~((v148 + ~v148 * 2 + 1 | v145) + v148);
    v154 = v153 - 1;
    v155 = ((v152 & v154) - v153 ^ v153 - v152 + (v152 | -v153)) + ((v152 & v154) - v153 & v153 - v152 + (v152 | -v153)) * 2;
    v156 = v151 + 2;
    v157 = (v156 + ~v152 * 2 & v154) - v153;
    v158 = (v157 & v156) * 4 + (v157 ^ v156) * 2 | 1;
    return ~((v158 ^ v155) + (v158 & v155) * 2) + ((v158 ^ v155) + (v158 & v155) * 2) * 2;
}
