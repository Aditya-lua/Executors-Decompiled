/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x547ec0..0x548db0 (3824 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_547ec0_1 {
    char padding_0[31494513];
    unsigned short field_1e09171;
} st_547ec0_1;

typedef struct st_547ec0_0 {
    char field_0;
} st_547ec0_0;

extern unsigned short g_f048b8;
extern unsigned short g_f048ba;
extern unsigned short g_f048bc;
extern unsigned short g_f048be;
extern unsigned long long g_f048c0;
extern unsigned short g_f12172;
extern unsigned short g_f12174;
extern unsigned short g_f12176;
extern unsigned short g_f12178;
extern unsigned int g_fffffffffffffff8;
extern char g_fffffffffffffffc;

int sub_547ec0(void)
{
    st_547ec0_0 *v4;  // x8
    st_547ec0_0 **v5;  // x9
    unsigned long long v14;  // x9
    unsigned long long v104;  // x16
    unsigned long long v105;  // x16
    unsigned long v106;  // x17
    unsigned long long v107;  // x16
    unsigned long long v108;  // x0
    unsigned long long v109;  // x2
    unsigned short v110;  // x13
    unsigned long v111;  // x13
    unsigned long long v112;  // x16
    unsigned long long v113;  // x17
    unsigned long long v15;  // x11
    unsigned long long v114;  // x0
    unsigned long long v115;  // x0
    unsigned long long v116;  // x1
    unsigned long long v117;  // x1
    unsigned long long v118;  // x13
    unsigned long long v119;  // x13
    unsigned long long v120;  // x13
    unsigned long long v121;  // x13
    unsigned int v122;  // w17
    unsigned int v123;  // w12
    unsigned long v16;  // x8
    unsigned int v124;  // w12
    unsigned int v125;  // w11
    unsigned int v126;  // w12
    unsigned int v127;  // w13
    unsigned long long v128;  // x12
    unsigned long long v129;  // x13
    unsigned long v130;  // x11
    unsigned long long v131;  // x10
    unsigned int v132;  // w8
    unsigned int v133;  // w10
    char v17;  // x10
    unsigned int v134;  // w11
    unsigned int v135;  // w13
    unsigned int v136;  // w12
    unsigned int v137;  // w12
    unsigned int v138;  // w13
    unsigned int v139;  // w15
    unsigned int v140;  // w8
    unsigned int v141;  // w16
    unsigned int v142;  // w8
    unsigned int v143;  // w10
    unsigned long long v18;  // x9
    unsigned int v144;  // w11
    unsigned int v145;  // w12
    unsigned int v146;  // w10
    unsigned int v147;  // w11
    unsigned int v148;  // w13
    unsigned int v149;  // w12
    unsigned int v150;  // w11
    unsigned int v152;  // w10
    unsigned int v153;  // w8
    st_547ec0_1 *v19;  // x11
    unsigned int v154;  // w11
    unsigned int v155;  // w8
    unsigned long v20;  // x10
    unsigned long v21;  // x12
    unsigned long long v22;  // x15
    unsigned long long v23;  // x15
    unsigned long long v6;  // x10
    unsigned long long v24;  // x15
    unsigned long long v25;  // x13
    unsigned long long v26;  // x12
    unsigned long long v27;  // x10
    unsigned long long v28;  // x12
    unsigned long long v29;  // x16
    unsigned long long v30;  // x10
    unsigned long long v31;  // x10
    unsigned long long v32;  // x10
    unsigned long v33;  // x12
    unsigned long long v7;  // x12
    unsigned long v34;  // x13
    unsigned long long v35;  // x16
    unsigned long long v36;  // x17
    unsigned long long v37;  // x15
    unsigned long long v38;  // x10
    unsigned long long v39;  // x10
    unsigned long long v40;  // x13
    unsigned long long v41;  // x16
    unsigned long long v42;  // x17
    unsigned long long v43;  // x10
    unsigned long long v8;  // x11
    unsigned long long v44;  // x12
    unsigned long long v45;  // x10
    st_547ec0_0 *v46;  // x9
    st_547ec0_0 **v47;  // x12
    unsigned long long v48;  // x9
    unsigned long long v49;  // x9
    unsigned long long v50;  // x12
    unsigned long long v51;  // x15
    unsigned int v52;  // w12
    unsigned int v53;  // w0
    unsigned long long v9;  // x8
    unsigned int v54;  // w12
    unsigned int v55;  // w12
    unsigned short v56;  // x15
    unsigned long long v57;  // x15
    unsigned long long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x17
    unsigned long long v61;  // x17
    unsigned long long v62;  // x16
    unsigned long long v63;  // x15
    unsigned long v10;  // x9
    unsigned long long v64;  // x15
    unsigned long long v65;  // x16
    unsigned long long v66;  // x14
    unsigned long long v67;  // x15
    unsigned int v68;  // w15
    unsigned long v69;  // x14
    unsigned long long v70;  // x17
    unsigned long long v71;  // x1
    unsigned long long v72;  // x3
    unsigned long long v73;  // x4
    unsigned long long v11;  // x8
    unsigned long long v74;  // x0
    unsigned long long v75;  // x14
    unsigned long long v76;  // x14
    unsigned long long v77;  // x17
    unsigned long long v78;  // x0
    unsigned long long v79;  // x1
    unsigned long v80;  // x3
    unsigned long long v81;  // x14
    unsigned int v82;  // w17
    unsigned int v83;  // w15
    unsigned long long v12;  // x8
    unsigned long v84;  // x17
    unsigned long long v85;  // x1
    unsigned long long v86;  // x2
    unsigned long long v87;  // x3
    unsigned long long v88;  // x4
    unsigned long long v89;  // x3
    unsigned long long v90;  // x17
    unsigned long long v91;  // x17
    unsigned long long v92;  // x0
    unsigned long long v93;  // x11
    unsigned long long v13;  // x8
    unsigned long long v94;  // x4
    unsigned long long v95;  // x1
    unsigned long long v96;  // x11
    char v97;  // x17
    unsigned short v98;  // x11
    unsigned long long v99;  // x17
    unsigned long v100;  // x1
    unsigned long long v101;  // x2
    unsigned long long v102;  // x2
    unsigned long long v103;  // x17
    st_547ec0_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_547ec0_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long, unsigned long long
    st_547ec0_0 **v2;  // [bp-0x20], Other Possible Types: unsigned long long, char
    st_547ec0_0 *v3;  // [bp-0x18], Other Possible Types: unsigned long, unsigned long long

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
    v18 = 15747256 >> ((char)v3 + (char)v16 * 2 + (v17 | (char)v3) + ((char)v3 + (char)~v3 * 2 + 1 | v17) + 2 & 63);
    v19 = (char *)&g_f048b8 + 0x2 * ~&g_f048b8 + 1;
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
    v45 = ((-v18 ^ 15747256) + (&v19->padding_0[v18] & -(v18 | v19)) * 4 + ((char *)&g_f048b8 - v18 - (-v18 | 15747256) + (&v19->padding_0[v18] ^ -(v18 | v19))) * 2) * (~v31 + v31 * 2) >> ((char)v2 + (char)~v44 + ((char)v44 & (char)~v2) * 2 + ((char)v2 + ((char)v44 | (char)~v2)) * 2 + 2 & 63) ^ ((-v18 ^ 15747256) + (&v19->padding_0[v18] & -(v18 | v19)) * 4 + ((char *)&g_f048b8 - v18 - (-v18 | 15747256) + (&v19->padding_0[v18] ^ -(v18 | v19))) * 2) * (~v31 + v31 * 2);
    v46 = v1;
    v47 = v0;
    v48 = ((char *)v47 + 0x2 * ~v47 + 1 | v46) + (char *)v47;
    v49 = (((char *)v46 + 0x2 * ~v46 + 1 | v47) ^ 0x2 * ~v46 + (char *)v46) + ~v48 - ((~v48 & ~(v47 | v46)) + (((char *)v46 + 0x2 * ~v46 + 1 | v47) & v46 + 1) + ((v47 | v46) & ~v48)) * 2 & 0xfffffffffffffffe | (((char *)v46 + 0x2 * ~v46 + 1 | v47) ^ 0x2 * ~v46 + (char *)v46) + ~v48 & 1;
    v50 = v49 + 2;
    v51 = (unsigned int)v50 * 2 + 0xffe & 2794;
    v0 = v49 + 64140;
    v1 = v50 + v51 + (v51 ^ 2794) - 1399;
    v52 = v1;
    v53 = v52 + ~v52 * 2 + 1;
    v54 = (v52 & (unsigned int)v0) + v53 + v52 + ((unsigned int)v0 | ~v53) + 1 + ((unsigned int)(0xfffffffe - (v53 + v52 + ((unsigned int)v0 | ~v53))) | (v52 | (unsigned int)v0) + ~(v52 + (unsigned int)v0)) + (v53 + v52 + ((unsigned int)v0 | ~v53) + 1 & v52 & (unsigned int)v0);
    v55 = (v54 + 2 ^ (unsigned int)v45) + (v54 + 2 & (unsigned int)v45) * 2;
    v56 = (unsigned short)(v54 + 1 - ((unsigned int)v45 + (v54 + 1 & ~(unsigned int)v45) * 2)) + (unsigned short)(~(unsigned int)v45 - (v54 + 1 | ~(unsigned int)v45));
    g_f12172 = ((unsigned short)(v55 - 1) ^ v56) + ((v56 | (unsigned short)-v55) + (unsigned short)v55) * 2;
    v57 = v1;
    v58 = v0;
    v59 = -v58;
    v60 = v58 + v57 + (v59 & ~v57) * 2;
    v61 = (v60 + (v57 + (v59 | ~v57)) * 2 + 2 ^ (v58 + ~v57 + (v57 & ~v58)) * 2 + 3) + (v60 + (v57 + (v59 | ~v57)) * 2 + 2 & (v58 + ~v57 + (v57 & ~v58)) * 2 + 3) * 2;
    v62 = (v57 + ~v58 + (v58 & ~v57)) * 2 + 3;
    v63 = ~((v62 ^ v58 - v57) + (v62 & v58 - v57) * 2) + ((v62 ^ v58 - v57) + (v62 & v58 - v57) * 2) * 2;
    v64 = (v63 ^ v61 - 1) + ((v63 & v61 - 1) - v63 * 2 + (v63 + 0x7fffffffffffffff & -v61) + (v63 + 0x7fffffffffffffff & v61 - 1)) * 2;
    v65 = v64 + 2;
    v66 = (v64 + 7 ^ -(v65 | 5)) + (v64 + 7 & -(v65 | 5)) * 2;
    v67 = v65 + (~(unsigned int)v65 | (char *)&g_fffffffffffffff8 + 2);
    v0 = (v65 ^ 12) + (v65 * 2 & 24) - 1;
    v1 = v67 + v66 + ((char *)&g_fffffffffffffff8 - v67 + 1 | ~v66) + (v66 & v67 + 6) + 7;
    v68 = v45 >> ((char)(v0 - v1 + ((char)v1 + 1 & v0) * 2 + ((char)v1 + 1 & ~v0) * 2 - 2) & 63);
    v69 = v1;
    v70 = v0;
    v71 = ~v70;
    v72 = v70 + 1;
    v73 = v69 + v71 * 2 + v72 + 1;
    v74 = (v69 + (0xffffffffffffffff ^ v69 * 2) + v70 & -(v69 + (0xffffffffffffffff ^ v69 * 2) | v70)) * 4 + (v69 + (0xffffffffffffffff ^ v69 * 2) + v70 ^ -(v69 + (0xffffffffffffffff ^ v69 * 2) | v70)) * 2 | 1;
    v75 = v70 + v69 + ((&(&g_fffffffffffffffc)[-3 * v70 + -4 * v71] | v69) & v70 * 3 + v71 * 4 + 4) * 4 + (v72 + (-v69 | ~v70) + (-v69 & ~v70) + ((&(&g_fffffffffffffffc)[-3 * v70 + -4 * v71] | v69) ^ v70 * 3 + v71 * 4 + 4)) * 2;
    v76 = v75 - ((v74 ^ v73) + (v74 & v73) * 2) + ((v74 ^ v73) + (v74 & v73) * 2 + ~v75) * 2;
    v77 = (v76 * 2 & 4) + (v76 ^ 2);
    v78 = ~v77 + v77 * 2;
    v79 = -v77;
    v80 = 0xffffffff ^ (unsigned int)v78 * 2;
    v81 = ((v80 & 112518) + (v78 & 56259) + v78 + 0xffffffffffff243e ^ ((v79 | 56259) ^ v77) + ((v79 | 56259) & v77) * 2) + ((v80 & 112518) + (v78 & 56259) + v78 + 0xffffffffffff243e & ((v79 | 56259) ^ v77) + ((v79 | 56259) & v77) * 2) * 2;
    v0 = ~v81 + v81 * 2;
    v1 = (v79 | 0xffffffffffffdbc3) + (1 & ~v77) + (v78 | 1) + (v78 + 9276 ^ -(v78 | 9276)) + (v78 + 9276 & -(v78 | 9276)) * 2 + 9276;
    v82 = (unsigned int)v0 + 1 + ((unsigned int)v1 | (unsigned int)v0) + ((unsigned int)v0 + 1 + ~(unsigned int)v0 * 2 | (unsigned int)v1);
    v83 = v68 + (v82 & v68 + ~v68 * 2 + 1);
    g_f12174 = (unsigned short)v82 + (unsigned short)v68 + (unsigned short)v83 + (unsigned short)~v83 * 2 + 2;
    v84 = v1;
    v85 = v0;
    v86 = v85 + v84;
    v87 = ~v85 * 2;
    v88 = (v85 | ~v84) + v84 + v86 + v85 + v87 + 1 + 1 + ~(v85 + v87 + 1 | v84) + ((v85 + v87 + 1 | v84) - (v86 + v85 + v87 + 1 + 1) & ~((v85 | ~v84) + v84)) * 2 + (v86 + v85 + v87 + 1 + 1 + ~(v85 + v87 + 1 | v84) & ~((v85 | ~v84) + v84)) * 2 + 1;
    v89 = ((v85 * 2 | v85 >> 63) & 2 & 3) + (v85 ^ 1) + v87;
    v90 = v86 + (v89 + v84 + v85 - v84 - (v85 | -v84) + (-v84 & ~v85) + (~v89 & ~v84)) * 2 + 2;
    v91 = v88 - v90 + (v90 | ~v88) + (v88 & ~v90);
    v92 = v91 + 1;
    v93 = 0xfffffffffffffffe - v91;
    v94 = v91 + 2;
    v95 = (~(unsigned int)v92 & 3) + (v92 ^ &g_fffffffffffffffc);
    v96 = (unsigned int)v94 + (unsigned int)v93 * 2 | &g_fffffffffffffffc;
    v0 = (v92 ^ 30) + ((v93 | 30) + v94) * 2 - 1;
    v1 = (v96 & v91 + 5) + (v96 | v92) + (v95 ^ v94) + (v95 & v94) * 2;
    v97 = (char)v1 * 3 + (char)~v1 * 4;
    v98 = v45 >> (v0 + v97 + ((char)(0x7ffffffffffffffd - v97) & ~v0) * 2 + (v0 + ((char)(0x7ffffffffffffffd - v97) | ~v0)) * 2 + 4 & 63);
    v99 = v1;
    v100 = v0;
    v101 = (v99 + ~v99 * 2 + 2 & (v100 | ~(v99 + ~v99 * 2 + 1))) * 4 + (v99 + ~v99 * 2 + 2 ^ (v100 | ~(v99 + ~v99 * 2 + 1))) * 2 | 1;
    v102 = (v101 ^ v99 - v100) + (v101 & v99 - v100) * 2 - 1;
    v103 = (v100 ^ -v99) + (v100 - v99 - (v100 | -v99)) * 2;
    v104 = (0xffffffffffffffff ^ (v99 & ~v100) * 2) + (v99 & ~v100) * 4 + 2;
    v105 = (v103 ^ v104) + (v103 & v104) * 2 - ((v103 ^ v104) + (v103 & v104) * 2) * 2 + 1;
    v106 = v102 ^ v105;
    v107 = v102 & v105;
    v108 = v106 + v107 * 2;
    v109 = v108 + 1;
    v0 = ((0xffffffff ^ (unsigned int)v108 * 2) & 56782) + 0xffffffffffff9118 + v106 + (v107 + v109 + (28391 | ~v108)) * 2;
    v1 = (v108 ^ 37146) + (v109 + (37146 | ~v108)) * 2 - 1;
    v110 = (unsigned short)((v0 & 0xffffffff) - v1) + ((unsigned short)v1 + 1 & (unsigned short)v0) * 2 + ((unsigned short)v1 + 1 & (unsigned short)~(unsigned int)v0) * 2;
    g_f12176 = (unsigned short)((v110 - 1 ^ v98) - (v110 + ((unsigned int)(1 - v110) & v98))) + (v110 - 1 & v98) * 2 + 1;
    v111 = v1;
    v112 = v0;
    v113 = ~v111 * 2;
    v114 = v113 + (v111 ^ 1) + ((v111 * 2 | v111 >> 63) & 2 & 3);
    v115 = v114 + 1;
    v116 = v115 + ~v114 * 2 | v112;
    v117 = v112 + ~v112 * 2 + 1;
    v118 = (v111 + 1 + v117 + (v116 ^ v115) * 2 + (v116 & v115) * 4 ^ (v117 | v111) - (v111 + (v111 + 1 + v113 | ~v112))) + (v111 + 1 + v117 + (v116 ^ v115) * 2 + (v116 & v115) * 4 & (v117 | v111) - (v111 + (v111 + 1 + v113 | ~v112))) * 2;
    v119 = (-v118 | 1) + v118 + (v118 - 1 | 1);
    v120 = (v119 + (~v119 | 1) + v119 - (v119 * 2 | 0xfffffffffffffffd) ^ (v119 + 1 ^ -(v119 | 1)) + (v119 + 1 & -(v119 | 1)) * 2) + (v119 + (~v119 | 1) + v119 - (v119 * 2 | 0xfffffffffffffffd) & (v119 + 1 ^ -(v119 | 1)) + (v119 + 1 & -(v119 | 1)) * 2) * 2;
    v0 = v119 + 47;
    v1 = ~v120 + v120 * 2;
    v121 = (v0 + 1 + (v1 | ~v0) ^ v0 + 1 + v1 - (v1 & v0)) + (v0 + 1 + (v1 | ~v0) & v0 + 1 + v1 - (v1 & v0)) * 2;
    g_f12178 = v45 >> ((char)~v121 + (char)v121 * 2 & 63);
    v122 = (g_f12172 + ~g_f12172 * 2 + 1 & g_f048b8) + g_f12172;
    v123 = ~(g_f12172 | g_f048b8) + g_f12172;
    v124 = (v123 ^ g_f048b8 + 1) + (v123 & g_f048b8 + 1) * 2;
    g_f048b8 = (unsigned short)v124 + (unsigned short)v122 + ((unsigned short)(v122 - v124 - (v122 | -v124)) + ((unsigned short)-v124 & (unsigned short)~v122)) * 2;
    g_f048ba = (g_f12174 | g_f048ba) * 2 - (g_f048ba + g_f12174);
    v125 = g_f12176 & g_f048bc;
    v126 = (unsigned int)(g_f048bc - g_f12176) + v125 + (g_f12176 & ~g_f048bc) * 2;
    g_f048bc = (unsigned short)v126 + (unsigned short)v125 + ((unsigned short)v126 + ((unsigned short)-v125 | (unsigned short)~v126) + ((unsigned short)-v125 & (unsigned short)~v126)) * 2 + 2;
    v127 = g_f12178 + ~g_f12178 * 2 + 1;
    g_f048be = (g_f12178 & ~g_f048be) + (unsigned short)v127 + (g_f048be | (unsigned short)~v127) + 1;
    v128 = g_f048c0 | v45;
    v129 = ~g_f048c0;
    v130 = g_f048c0 + 1;
    v131 = ((v130 + v129 * 2 | v45) ^ v130) + ((v130 + v129 * 2 | v45) & v130) * 2;
    g_f048c0 = v131 + v128 + (-v131 & ~v128) * 2 + (v128 + (-v131 | ~v128)) * 2 + 2;
    v132 = v1;
    v133 = v0;
    v134 = -v133;
    v135 = (v132 ^ v134) + (v132 + (v134 | ~v132)) * 2 + 2;
    v136 = 1 | (v133 & ~v132) * 2;
    v137 = (v135 ^ v136) + (v135 & v136) * 2;
    v138 = -v137;
    v139 = v137 - 1;
    v140 = v139 + v132 + (v138 & -v132) * 2 + ((v138 | -v132) + v137) * 2;
    v141 = (v132 - v137 + (v139 & ~v132)) * 2;
    v142 = (v140 & (unsigned int)(0xfffffffd - v141)) + v141 + 2 + (v140 & v141 + 2);
    v143 = v139 + v133 + (v138 & v134) * 2 + (unsigned int)(v139 - v133 - (v139 | v134)) * 2;
    v144 = ((v139 | v133) & (unsigned int)(1 - v137)) * 4 + ((v139 | v133) ^ (unsigned int)(1 - v137)) * 2 | 1;
    v145 = v144 ^ v143;
    v146 = v144 & v143;
    v147 = v145 + v146 * 2;
    v148 = ~v147 + v147 * 2;
    v149 = v142 + 1;
    v150 = v148 | v149 + ~v142 * 2;
    v152 = (v145 + (v146 - v147) * 2 & v142) + v148 + (v150 ^ (unsigned int)(0xfffffffe - v142)) - (v150 & v149) * 2 + 1;
    v153 = (v148 ^ -v142) + (v142 & -v147) * 2 + (unsigned int)(v148 - v142 - (v148 | -v142)) * 2;
    v154 = -v153;
    v155 = v153 + ~v153 * 2;
    return (v152 | v154) - (v152 & v154) + (v152 + v155 + ((unsigned int)(0x7ffffffd - v155) & (unsigned int)(0x7ffffffe - ((v145 + (v146 - v147) * 2 & v142) + v148 + (v150 ^ (unsigned int)(0xfffffffe - v142)) - (v150 & v149) * 2)))) * 2 + 6;
}
