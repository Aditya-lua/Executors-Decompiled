/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x562904..0x5637c4 (3776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_562904_0 {
    char field_0;
} st_562904_0;

extern unsigned short g_f049b0;
extern unsigned short g_f049b2;
extern unsigned short g_f049b4;
extern unsigned short g_f049b6;
extern unsigned short g_f049b8;
extern unsigned short g_f049ba;
extern unsigned short g_f049bc;
extern unsigned short g_f049be;
extern unsigned long long g_f049c0;
extern unsigned int g_fffffffffffffffc;

int sub_562904(void)
{
    st_562904_0 *v4;  // x8
    st_562904_0 **v5;  // x10
    unsigned long long v14;  // x12
    unsigned long long v104;  // x16
    unsigned long long v105;  // x17
    unsigned long long v106;  // x1
    unsigned long long v107;  // x2
    unsigned long long v108;  // x3
    unsigned long long v109;  // x4
    unsigned long long v110;  // x0
    unsigned long long v111;  // x16
    unsigned long long v112;  // x17
    unsigned long long v113;  // x16
    unsigned long long v15;  // x13
    unsigned short v114;  // x17
    unsigned long long v115;  // x10
    unsigned long long v116;  // x10
    unsigned long long v117;  // x16
    unsigned long long v118;  // x17
    unsigned long long v119;  // x16
    unsigned long long v120;  // x10
    unsigned int v121;  // w17
    unsigned short v122;  // x10
    unsigned int v123;  // w15
    unsigned long long v16;  // x9
    unsigned int v124;  // w10
    unsigned int v125;  // w14
    unsigned int v126;  // w10
    unsigned short v127;  // x12
    unsigned int v128;  // w14
    unsigned short v129;  // x10
    unsigned long long v130;  // x12
    unsigned long long v131;  // x10
    unsigned int v132;  // w9
    unsigned int v133;  // w10
    unsigned long v17;  // x10
    unsigned int v134;  // w11
    unsigned int v135;  // w12
    unsigned int v136;  // w11
    unsigned int v137;  // w12
    unsigned int v138;  // w12
    unsigned int v139;  // w9
    unsigned int v140;  // w14
    unsigned int v141;  // w15
    unsigned int v142;  // w10
    unsigned int v143;  // w11
    unsigned long long v18;  // x10
    unsigned int v144;  // w10
    unsigned int v145;  // w11
    unsigned int v146;  // w8
    unsigned int v147;  // w17
    unsigned int v148;  // w9
    unsigned int v149;  // w8
    unsigned int v150;  // w10
    unsigned int v151;  // w8
    unsigned int v152;  // w8
    unsigned int v153;  // w9
    unsigned long long v19;  // x10
    unsigned int v154;  // w10
    unsigned int v155;  // w9
    unsigned long long v20;  // x12
    unsigned long long v21;  // x16
    unsigned long v22;  // x13
    unsigned long long v23;  // x14
    unsigned long long v6;  // x11
    unsigned long long v24;  // x13
    unsigned long long v25;  // x12
    unsigned long long v26;  // x14
    unsigned long long v27;  // x12
    unsigned long long v28;  // x14
    unsigned long long v29;  // x12
    unsigned long v30;  // x13
    unsigned long long v31;  // x12
    unsigned long long v32;  // x14
    unsigned long long v33;  // x15
    unsigned long long v7;  // x12
    unsigned long long v34;  // x16
    unsigned long long v35;  // x13
    unsigned long long v36;  // x11
    unsigned long long v37;  // x13
    unsigned long v38;  // x14
    unsigned long long v39;  // x0
    unsigned long long v40;  // x16
    unsigned long long v41;  // x15
    unsigned long long v42;  // x16
    unsigned long long v43;  // x13
    unsigned long long v8;  // x14
    unsigned long long v44;  // x14
    unsigned long long v45;  // x14
    unsigned long long v46;  // x13
    unsigned long long v47;  // x14
    unsigned long long v48;  // x13
    unsigned long long v49;  // x15
    unsigned long long v50;  // x13
    unsigned long long v51;  // x14
    char v52;  // x15
    char v53;  // x13
    unsigned long long v9;  // x12
    unsigned long long v54;  // x13
    unsigned long long v55;  // x11
    st_562904_0 *v56;  // x13
    st_562904_0 **v57;  // x14
    unsigned long long v58;  // x15
    st_562904_0 **v59;  // x16
    unsigned long long v60;  // x15
    unsigned long long v61;  // x13
    unsigned long long v62;  // x13
    unsigned long long v63;  // x13
    unsigned long long v10;  // x10
    unsigned long long v64;  // x14
    unsigned long long v65;  // x13
    unsigned long v66;  // x13
    unsigned long long v67;  // x15
    unsigned long long v68;  // x16
    unsigned long long v69;  // x0
    unsigned long long v70;  // x16
    unsigned long long v71;  // x13
    unsigned long long v72;  // x15
    unsigned long long v73;  // x13
    unsigned long long v11;  // x8
    unsigned long long v74;  // x15
    unsigned long long v75;  // x13
    unsigned int v76;  // w15
    unsigned long v77;  // x13
    unsigned long long v78;  // x16
    unsigned long long v79;  // x17
    unsigned long long v80;  // x0
    unsigned long long v81;  // x2
    unsigned long long v82;  // x17
    unsigned long long v83;  // x13
    unsigned long long v12;  // x10
    unsigned long long v84;  // x0
    unsigned long long v85;  // x16
    unsigned long long v86;  // x17
    unsigned long long v87;  // x0
    unsigned long long v88;  // x1
    unsigned long long v89;  // x16
    unsigned long long v90;  // x17
    unsigned long long v91;  // x0
    unsigned long long v92;  // x1
    unsigned long long v93;  // x16
    unsigned long long v13;  // x11
    unsigned long long v94;  // x2
    unsigned long long v95;  // x17
    unsigned long v96;  // x16
    unsigned long long v97;  // x16
    unsigned long long v98;  // x17
    unsigned long long v99;  // x0
    unsigned long long v100;  // x1
    unsigned long long v101;  // x2
    unsigned long long v102;  // x16
    unsigned int v103;  // w12
    st_562904_0 **v0;  // [bp-0x20], Other Possible Types: char, unsigned long long
    st_562904_0 *v1;  // [bp-0x18], Other Possible Types: unsigned long, unsigned long long
    st_562904_0 **v2;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_562904_0 *v3;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v4 = v3;
    v5 = v2;
    v6 = (v4 - v5 | (((char *)&g_fffffffffffffffc + -0x3 * v4 + -0x4 * ~v4 | v5) & v4 * 3 + ~v4 * 4 + 4) * 4 + (((char *)&g_fffffffffffffffc + -0x3 * v4 + -0x4 * ~v4 | v5) ^ v4 * 3 + ~v4 * 4 + 4) * 2) + ((((char *)&g_fffffffffffffffc + -0x3 * v4 + -0x4 * ~v4 | v5) & v4 * 3 + ~v4 * 4 + 4) * 4 + (((char *)&g_fffffffffffffffc + -0x3 * v4 + -0x4 * ~v4 | v5) ^ v4 * 3 + ~v4 * 4 + 4) * 2 & v4 - v5);
    v7 = v5 * 2;
    v8 = v5 + v4;
    v9 = v7 - (v8 + (v5 | ~v4));
    v10 = (v9 & v8 + ~v7) * 4 + (v9 ^ v8 + ~v7) * 2;
    v11 = (v5 ^ -v4) + ((char *)v5 + (-v4 | ~v5)) * 2 + ~v10 + 4;
    v12 = (v6 ^ -((v11 & 1) + (-(v11 + v10 * 2) | 1))) + ~(((1 - (v11 + v10 * 2) | ~v6) & v6 + 1) * 4 + ((1 - (v11 + v10 * 2) | ~v6) ^ v6 + 1) * 2) + (((1 - (v11 + v10 * 2) | ~v6) & v6 + 1) * 4 + ((1 - (v11 + v10 * 2) | ~v6) ^ v6 + 1) * 2) * 2 + (v6 + 1 + ~v6 * 2 + ((v11 & 1) + (-(v11 + v10 * 2) | 1) | ~(v6 + 1 + ~v6 * 2)) + (v6 & -((v11 & 1) + (-(v11 + v10 * 2) | 1)))) * 2;
    v13 = v12 + 4;
    v14 = ~v13 + v13 * 2;
    v15 = ((v14 | 4) + 1 ^ v14 & 4) + ((v14 | 4) + 1 & v14 & 4) * 2;
    v16 = ((((char *)&g_fffffffffffffffc - v12 | 29) ^ v13) + (((char *)&g_fffffffffffffffc - v12 | 29) & v13) * 2 ^ (v14 | 29) + 1) + ((((char *)&g_fffffffffffffffc - v12 | 29) ^ v13) + (((char *)&g_fffffffffffffffc - v12 | 29) & v13) * 2 & (v14 | 29) + 1) * 2;
    v2 = ~v15 + v15 * 2;
    v3 = ~v16 + v16 * 2;
    v17 = 15747504 >> ((char)((((char)~v3 + (char)v3 * 2 + 2 ^ (char)v2) + (~v3 + v3 * 2 + 2 & v2) * 2 | 1) + (((char)~v3 + (char)v3 * 2 + 2 ^ (char)v2) & 1) - 2) & 63);
    v18 = (((char *)~&g_f049b0 + v17 + (15747504 & ~v17)) * 2 + 3 ^ (char *)&g_f049b0 + v17 + 2 * ~v17 + 2) + (((char *)~&g_f049b0 + v17 + (15747504 & ~v17)) * 2 + 3 & (char *)&g_f049b0 + v17 + 2 * ~v17 + 2) * 2;
    v19 = v3;
    v20 = v2;
    v21 = v19 + 1;
    v22 = (v20 | ~v19) + v21 + (v20 ^ v19);
    v23 = ((v21 + ~v19 * 2 | v20) ^ v21) + ((v21 + ~v19 * 2 | v20) & v21) * 2;
    v24 = v22 + v23 + (-v23 & ~v22) * 2 + (v22 - v23 - (v22 | -v23)) * 2;
    v25 = (v20 ^ -v19) + (v20 + (-v19 | ~v20)) * 2 + 2;
    v26 = ((char *)&g_fffffffffffffffc + 3 ^ (v19 & ~v20) * 2) + (v19 & ~v20) * 4 + 2;
    v27 = ~((v25 ^ v26) + (v25 & v26) * 2) + ((v25 ^ v26) + (v25 & v26) * 2) * 2;
    v28 = (v24 ^ v27) + (v24 & v27) * 2 - (v24 + v27 + (-v27 | ~v24)) * 2 - 2;
    v29 = (v24 - v27 + (v27 - 1 & ~v24)) * 2 + 3;
    v30 = v29 ^ v28;
    v31 = v29 & v28;
    v32 = v30 + v31 * 2;
    v33 = v32 - 1;
    v34 = -v32;
    v35 = v32 + 6591040075048873163 + (v30 + (v31 - v32) * 2 | 11855703998660678452);
    v2 = v32 + (v34 | 6591040075048873163) + (v34 | 6591040075048873163) + v33 + v35 + (v35 | (char *)&g_fffffffffffffffc - (v34 | 6591040075048873163) - v33 + 2) + ((char *)&g_fffffffffffffffc - (v34 | 6591040075048873163) - v33 + 2 | ~v35) + 3;
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
    v54 = v36 >> ((char)(v53 + v52 * 2 + ((char *)&g_fffffffffffffffc - v52 + 2 | v53) - (v52 + 1 & v53)) + 3 & 63);
    v55 = (v36 ^ -v54) + (v36 - v54 - (v36 | -v54) + (v36 + ((char *)&g_fffffffffffffffc + 3 ^ v36 * 2) + v54 ^ -(v36 + ((char *)&g_fffffffffffffffc + 3 ^ v36 * 2) | v54))) * 2 + (v36 + ((char *)&g_fffffffffffffffc + 3 ^ v36 * 2) + v54 & -(v36 + ((char *)&g_fffffffffffffffc + 3 ^ v36 * 2) | v54)) * 4;
    v56 = v1;
    v57 = v0;
    v58 = (v56 ^ 1) + ~v56 * 2 + ((v56 * 2 | v56 >> 63) & 2 & 3);
    v59 = (char *)v57 + 1;
    v60 = v56 - v57 + ((char *)v59 + v58 - 1 & (char *)-(st_562904_0 **)((char *)v59 + v58) - (~v58 | ~v57)) * 4 + ((char *)v59 + v58 - 1 ^ (char *)-(st_562904_0 **)((char *)v59 + v58) - (~v58 | ~v57)) * 2 + (((char *)v59 + v58 - 1 & (char *)-(st_562904_0 **)((char *)v59 + v58) - (~v58 | ~v57)) * 4 + ((char *)v59 + v58 - 1 ^ (char *)-(st_562904_0 **)((char *)v59 + v58) - (~v58 | ~v57)) * 2 | ~(v56 - v57)) + (v56 - v57 & ~(((char *)v59 + v58 - 1 & (char *)-(st_562904_0 **)((char *)v59 + v58) - (~v58 | ~v57)) * 4 + ((char *)v59 + v58 - 1 ^ (char *)-(st_562904_0 **)((char *)v59 + v58) - (~v58 | ~v57)) * 2)) + 1;
    v61 = (&v56[~(v57 | v56)] ^ (char *)&g_fffffffffffffffc + 2 - v57) - (&v56[~(v57 | v56)] & v59) * 2 + (v57 | v56);
    v62 = (v60 & v61 + 1) + v61 - (v61 + 1) * 2 + (v60 & v61 - (v61 + 1) * 2);
    v63 = v62 + (v62 | 1) + (~v62 | 1);
    v64 = v63 + 1;
    v65 = v63 + 2;
    v0 = (v64 | 0xffffffffffff9f8b) + v65 + (0xffffffffffff9f8b | ~v64) + 24692 + (0xffffffffffff9f8a - (v64 | 0xffffffffffff9f8b) | v65 + (0xffffffffffff9f8b | ~v64) + 24692) + ((v64 | 0xffffffffffff9f8b) + 24693 & 0xffffffffffff9f8b - (v65 + (0xffffffffffff9f8b | ~v64))) + 24694;
    v1 = (v64 ^ 40844) + (v65 + (40844 | ~v64)) * 2 - 1;
    g_f049b2 = (unsigned short)v55 & (unsigned short)v1 + (unsigned short)v0;
    v66 = v1;
    v67 = v0;
    v68 = v66 + ~v66 * 2 + 1 & v67;
    v69 = v67 + v66;
    v70 = (((char *)&g_fffffffffffffffc + 3 ^ v68 * 2) + v68 * 4 + 2 ^ v69 + ~v67 * 2 + 2) + (((char *)&g_fffffffffffffffc + 3 ^ v68 * 2) + v68 * 4 + 2 & v69 + ~v67 * 2 + 2) * 2;
    v71 = v67 | v66;
    v72 = (v69 ^ -v71) + (v69 & -v71) * 2;
    v73 = (v72 + (v71 | -v72) - v71) * 2 - (v72 + v71 + (-v72 & ~v71) * 2);
    v74 = ~v70 + v70 * 2 + v73 - (~v70 + v70 * 2 & v73) * 2;
    v75 = v74 + (((v73 | -v70) & v70) * 4 + ((v73 | -v70) ^ v70) * 2 | ~v74) + (v74 | ((v73 | -v70) & v70) * 4 + ((v73 | -v70) ^ v70) * 2);
    v0 = v75 + 8;
    v1 = (v75 + 1 | 1) + (v75 + 1 & 1) + 8;
    v76 = v55 >> ((char)v1 + (char)v0 & 63);
    v77 = v1;
    v78 = v0;
    v79 = (v77 ^ 1) + ~v77 * 2 + ((v77 * 2 | v77 >> 63) & 2 & 3);
    v80 = -v78;
    v81 = v77 + 1 + v78 + (v80 & ~v77) * 2 + (v77 + 1 + (v80 | ~v77)) * 2;
    v82 = ((v79 + v78 & -(v79 | v78)) * 4 + (v79 + v78 ^ -(v79 | v78)) * 2 | -v81) + v81 + ((v79 + v78 & -(v79 | v78)) * 4 + (v79 + v78 ^ -(v79 | v78)) * 2 | v81 - 1);
    v83 = (v78 - v77 | ((v78 | v77) & v80) * 4 + ((v78 | v77) ^ v80) * 2) + (((v78 | v77) & v80) * 4 + ((v78 | v77) ^ v80) * 2 & v78 - v77);
    v84 = v82 + ~v82 * 2 + 1;
    v85 = (v82 ^ v83) + ((v82 & -v83) - (v82 - v83) & v82 - v83) * 4 + (v84 - v83 - (v84 | -v83)) * 2 + (((v82 & -v83) - (v82 - v83) ^ v82 - v83) + (v82 & v83)) * 2 + 1;
    v86 = ~v85;
    v87 = v85 * 2;
    v88 = v87 + v86;
    v0 = v88 + 53430;
    v1 = ((0xffffffff ^ (unsigned int)v88 * 2) & 24212) + 0xffffffffffffd0b5 + (-v87 | 24212) + v85 * 4 + v86;
    g_f049b4 = (unsigned short)v76 + ((unsigned short)v76 ^ (unsigned short)~((unsigned int)v1 + (unsigned int)v0)) + ((unsigned short)v1 + (unsigned short)v0 & (unsigned short)~v76) + 1;
    v89 = v1;
    v90 = v0;
    v91 = (v90 + 1 + v89 + (v90 + 1 + ~v90 * 2 | ~v89) ^ -((v90 + v89 ^ -(v90 | v89)) + (v90 + v89 & -(v90 | v89)) * 2)) + (v90 + 1 + v89 + (v90 + 1 + ~v90 * 2 | ~v89) & -((v90 + v89 ^ -(v90 | v89)) + (v90 + v89 & -(v90 | v89)) * 2)) * 2;
    v92 = v91 + 1;
    v93 = v90 - v89 + (v89 & ~v90) * 2;
    v94 = v93 - 1;
    v95 = ((v91 & v94) - v93 ^ -(v92 + (-v93 | ~v91))) + ((v91 & v94) - v93 & -(v92 + (-v93 | ~v91))) * 2;
    v96 = (v91 - v93 - v92 + (v91 | v94)) * 2 + 4;
    v97 = v95 + (v96 | ~v95) + (v95 | v96);
    v98 = v97 + 1;
    v99 = ~v98;
    v100 = v97 + 2;
    v101 = (v100 + v99 * 2 | 24) + v98;
    v102 = (0xfffffffffffffff8 - (v98 & 0xfffffffffffffff7) ^ v97 + 9) + (0xfffffffffffffff8 - (v98 & 0xfffffffffffffff7) & v97 + 9) * 2;
    v0 = (v99 | 0xffffffffffffffe7) + v100 + 24 + v101 * 2 + ((char *)&g_fffffffffffffffc - v101 + 2 | (v99 | 0xffffffffffffffe7) + v100 + 24) - (v101 + 1 & (v99 | 0xffffffffffffffe7) + v100 + 24) + 3;
    v1 = v102 + (v98 | 8 | ~v102) + (v102 | v98 | 8) + 1;
    v103 = v55 >> (((char)v1 + 1 ^ (char)v0) + ((char)v0 + ((char)v1 + 1 | (char)~v0)) * 2 + 1 & 63);
    v104 = v1;
    v105 = v0;
    v106 = v105 + 1;
    v107 = v104 + 1;
    v108 = ~v104 * 2;
    v109 = v107 + v108;
    v110 = (v106 + ~v105 * 2 & v104) + v105 + ((v109 | v105) ^ v108 + v104) - ((v109 | v105) & v107) * 2;
    v111 = (1 | ((v104 & ~v105) * 2 | (v104 & ~v105) >> 63) & (char *)&g_fffffffffffffffc + 2) - (v106 + v109 + (v104 & ~v105) * 4) + v110 + 1 + ((0x7ffffffffffffffe - v110 | (v104 & ~v105) * 2 - (v106 + v109 + (v104 & ~v105) * 4)) + v110 + 1 - (v110 + 1 & (v104 & ~v105) * 2 - (v106 + v109 + (v104 & ~v105) * 4))) * 2;
    v112 = v111 + 1;
    v113 = v111 + 2;
    v0 = ((0xffffffff ^ (unsigned int)v112 * 2) & 68660) + v112 + (v113 + (34330 | ~v112)) * 2 + 0xffffffffffff79e5;
    v1 = v113 + (31206 | ~v112) + (v112 | 31206);
    v114 = (unsigned short)v103 * 3 + (unsigned short)~v103 * 4;
    g_f049b6 = (unsigned short)v103 + v114 + ((unsigned short)(0xfffc - v114) & v0 + 0xfffd * (unsigned short)v1 + (unsigned short)v1 * 4) + 4;
    v115 = v1 + ((v0 | v1) - (v0 + v1) ^ (v0 | v1)) - (v0 + (v0 + ((char *)&g_fffffffffffffffc + 3 ^ v0 * 2) & v1) * 2) + ((v0 | v1) - (v0 + v1) & (v0 | v1)) * 2 - 1;
    v116 = (v115 * 2 & 4) + (v115 ^ 2);
    v117 = ~v116 + v116 * 2;
    v118 = (v117 | 1) + (1 & ~v116);
    v119 = v117 & 4;
    v120 = ((v119 ^ 4) + (v117 ^ 0xfffffffffffffffb) ^ v116) + ((v119 ^ 4) + (v117 ^ 0xfffffffffffffffb) & v116) * 2;
    v0 = v118 + 43;
    v1 = v118 + 4 - v119 + v120 + (v118 + 4 + ~v119 | ~v120) + (v120 & v119 - (v118 + 4));
    g_f049b8 = v55 >> ((char)v1 + (char)v0 & 63);
    v121 = (~g_f049b0 & ~g_f049b2) + (g_f049b2 | g_f049b0) * 2 + 1;
    v122 = (g_f049b0 & ~g_f049b2) - g_f049b0;
    g_f049b0 = (unsigned short)(v121 - v122) + ((unsigned short)v121 & v122) * 2 + (v122 & (unsigned short)~v121) * 2;
    v123 = g_f049ba | g_f049b4;
    v124 = (g_f049ba | ~g_f049b4) + g_f049b4;
    g_f049ba = ((unsigned short)v124 ^ (unsigned short)~v123) + ((unsigned short)v123 & (unsigned short)~v124) * 2;
    v125 = -g_f049b6;
    v126 = (v125 ^ g_f049bc) + (unsigned int)(g_f049bc - g_f049b6 - (v125 | g_f049bc)) * 2;
    v127 = ((0xffff ^ g_f049bc * 2) + g_f049bc & g_f049b6) * 2;
    g_f049bc = (unsigned short)v126 + (v127 | (unsigned short)~v126) + ((unsigned short)v126 | v127) + 1;
    v128 = g_f049b8 | g_f049be;
    v129 = g_f049b8 + g_f049be;
    g_f049be = (unsigned short)(v128 - (v129 & -v128) * 2) + ((unsigned short)(v128 - 1) ^ v129) + 1;
    v130 = g_f049c0 + (v55 | ~g_f049c0) + (g_f049c0 ^ v55) + 1;
    v131 = (g_f049c0 | ~v55) + v55;
    g_f049c0 = (v131 ^ ~v130) + (v130 & ~v131) * 2;
    v132 = v1;
    v133 = v0;
    v134 = v132 * 3 + ~v132 * 4;
    v135 = (unsigned int)(0xfffffffc - v134) | v133;
    v136 = v132 - v133 + (v135 ^ v134 + 4) * 2 + (v135 & v134 + 4) * 4;
    v137 = (v136 + (0xffffffff ^ v136 * 2) + v132 & -(v136 + (0xffffffff ^ v136 * 2) | v132)) * 4 + (v136 + (0xffffffff ^ v136 * 2) + v132 ^ -(v136 + (0xffffffff ^ v136 * 2) | v132)) * 2;
    v138 = v137 + ~v137 * 2 | 1;
    v139 = v136 + 1 + v132 + (-v132 & ~v136) * 2 + (v136 + 1 + (-v132 | ~v136)) * 2;
    v140 = v139 + ~v138;
    v141 = v140 - 1;
    v142 = v136 & v133;
    v143 = v136 - v133 + v142 + (v133 & ~v136) * 2;
    v144 = (v143 ^ -v142) + (v143 + (-v142 | ~v143)) * 2;
    v145 = v144 + 2;
    v146 = 1 - v140;
    v147 = v145 | -v140;
    v148 = v139 - v138 + v147 + (v141 ^ v145) - 1 + (v141 & v145) + (-(v139 - v138 + v147 + (v141 ^ v145)) & -(v141 & v145)) * 2 + (unsigned int)(v139 - v138 + v147 + (v141 ^ v145) - 1 - (v141 & v145) - (v139 - v138 + v147 + (v141 ^ v145) - 1 | -(v141 & v145))) * 2;
    v149 = (v146 ^ v145) + 1;
    v150 = v149 + (v144 + (v146 | ~v145)) * 2 + (v145 + (0xffffffff ^ v145 * 2) + v141 & -(v140 + v145 + (0xffffffff ^ v145 * 2)) - v147) * 4 + (v145 + (0xffffffff ^ v145 * 2) + v141 ^ -(v140 + v145 + (0xffffffff ^ v145 * 2)) - v147) * 2;
    v151 = ((unsigned int)(0xfffffffa - v150) | 1) + (v149 & 1);
    v152 = (v148 ^ -v151) + (v151 & ~v148) * 2 + (v148 & -v151) * 2;
    v153 = v148 + ~v148 * 2;
    v154 = v153 + 1 | (unsigned int)(0xfffffffb - v150);
    v155 = (v154 & ~v153) * 4 + (v153 ^ ~v154) * 2;
    return v152 + (v155 | ~v152) + (v152 | v155) + 1;
}
