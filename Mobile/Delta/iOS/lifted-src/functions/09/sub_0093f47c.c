/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93f47c..0x93fedc (2656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_93f47c_0 {
    char field_0;
} st_93f47c_0;

extern unsigned short g_f04c00;
extern unsigned short g_f04c02;
extern unsigned short g_f04c04;
extern unsigned short g_f04c06;
extern unsigned long long g_f04c08;
extern unsigned short g_f12764;
extern unsigned short g_f12766;
extern unsigned short g_f12768;
extern unsigned short g_f1276a;

unsigned int sub_93f47c(void)
{
    unsigned long long v2;  // x8
    st_93f47c_0 *v3;  // x10
    unsigned long long v102;  // x15
    unsigned long long v103;  // x15
    unsigned long v104;  // x13
    unsigned long long v105;  // x13
    unsigned long v106;  // x14
    unsigned long long v107;  // x16
    unsigned long long v108;  // x13
    unsigned long long v109;  // x13
    unsigned int v110;  // w17
    unsigned int v111;  // w15
    unsigned long long v13;  // x10
    unsigned short v112;  // x16
    unsigned short v113;  // x15
    unsigned short v114;  // x10
    unsigned short v115;  // x13
    unsigned short v116;  // x13
    unsigned int v117;  // w15
    unsigned int v118;  // w10
    unsigned int v119;  // w11
    unsigned long long v120;  // x11
    unsigned long v121;  // x8
    unsigned long long v14;  // x12
    unsigned long long v15;  // x15
    unsigned long long v16;  // x15
    unsigned int v17;  // w10
    unsigned int v18;  // w12
    unsigned int v19;  // w14
    unsigned int v20;  // w13
    unsigned int v21;  // w10
    st_93f47c_0 **v4;  // x11
    unsigned int v22;  // w10
    unsigned int v23;  // w10
    unsigned long long v24;  // x13
    unsigned long v25;  // x14
    unsigned long long v26;  // x15
    unsigned long long v27;  // x0
    unsigned long long v28;  // x17
    unsigned long long v29;  // x15
    unsigned long long v30;  // x13
    unsigned long long v31;  // x13
    st_93f47c_0 *v5;  // x13
    unsigned long long v32;  // x14
    unsigned long long v33;  // x13
    unsigned long long v34;  // x14
    unsigned long long v35;  // x14
    unsigned int v36;  // w13
    unsigned long v37;  // x14
    unsigned long long v38;  // x15
    unsigned long long v39;  // x16
    unsigned long long v40;  // x0
    unsigned long long v41;  // x16
    unsigned long long v6;  // x12
    unsigned long long v42;  // x14
    unsigned long long v43;  // x14
    unsigned long long v44;  // x15
    unsigned long v45;  // x15
    unsigned short v46;  // x11
    unsigned short v47;  // x13
    unsigned long long v48;  // x13
    unsigned long long v49;  // x14
    unsigned long long v50;  // x15
    unsigned long long v51;  // x1
    unsigned long long v7;  // x13
    unsigned long long v52;  // x2
    unsigned long long v53;  // x3
    unsigned long long v54;  // x16
    unsigned long long v55;  // x17
    unsigned long long v56;  // x13
    unsigned long long v57;  // x12
    unsigned long long v58;  // x14
    unsigned long long v59;  // x12
    unsigned long long v60;  // x12
    unsigned long long v61;  // x12
    unsigned long long v8;  // x12
    unsigned int v62;  // w12
    unsigned long long v63;  // x14
    unsigned long long v64;  // x15
    unsigned long long v65;  // x17
    unsigned long long v66;  // x17
    unsigned long long v67;  // x16
    unsigned long long v68;  // x17
    unsigned long long v69;  // x14
    unsigned long long v70;  // x16
    unsigned long long v71;  // x0
    unsigned long long v9;  // x10
    unsigned long long v72;  // x15
    unsigned long long v73;  // x14
    unsigned long long v74;  // x13
    unsigned long long v75;  // x14
    unsigned long long v76;  // x13
    unsigned long long v77;  // x15
    unsigned long long v78;  // x16
    unsigned long long v79;  // x13
    unsigned int v80;  // w13
    unsigned int v81;  // w14
    unsigned long long v10;  // x11
    unsigned int v82;  // w15
    unsigned int v83;  // w16
    unsigned int v84;  // w13
    unsigned int v85;  // w13
    unsigned int v86;  // w14
    unsigned short v87;  // x12
    unsigned long long v88;  // x13
    unsigned long long v89;  // x15
    unsigned long long v90;  // x2
    unsigned long long v91;  // x16
    unsigned long v11;  // x13
    unsigned long long v92;  // x0
    unsigned long long v93;  // x17
    unsigned long long v94;  // x17
    unsigned long long v95;  // x13
    unsigned long long v96;  // x13
    unsigned long long v97;  // x15
    unsigned long long v98;  // x13
    unsigned long long v99;  // x14
    unsigned long long v100;  // x15
    unsigned long long v101;  // x13
    st_93f47c_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_93f47c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 16527477628888151732 + ((0x1aa29aa965fcdc00 + ~0x1aa29aa965fcdc00 * 2 + 1 & 3574912331) + 0x1aa29aa920e80800) * 2;
    v3 = v1;
    v4 = v0;
    v5 = v3 + 1;
    v6 = &v3[(char *)v5 + 0x2 * ~v3 & v4];
    v7 = -(((v4 | ~v3) ^ v5) + ((v4 | ~v3) & v5) * 2);
    v8 = (v7 ^ v6) + (v6 + (v7 | ~v6)) * 2 + 2;
    v9 = (v4 ^ -v3) + ((char *)v4 + (-v3 | ~v4)) * 2 + 2;
    v10 = ((v4 | v3) & -v4) * 4 + ((v4 | v3) ^ -v4) * 2 | 1;
    v11 = v10 ^ v9;
    v13 = ((v8 ^ -((-(v11 + (v10 & v9) * 2) | 1) + (v11 & 1))) + (v8 & -((-(v11 + (v10 & v9) * 2) | 1) + (v11 & 1)) | (-(v11 + (v10 & v9) * 2) | 1) + (v11 & 1) & ~v8) * 2 ^ ((v8 - (v11 + (v10 & v9) * 2) + 1 & -(1 - (v11 + (v10 & v9) * 2) | v8)) * 4 + (v8 - (v11 + (v10 & v9) * 2) + 1 ^ -(1 - (v11 + (v10 & v9) * 2) | v8)) * 2 | 1)) + ((v8 ^ -((-(v11 + (v10 & v9) * 2) | 1) + (v11 & 1))) + (v8 & -((-(v11 + (v10 & v9) * 2) | 1) + (v11 & 1)) | (-(v11 + (v10 & v9) * 2) | 1) + (v11 & 1) & ~v8) * 2 & ((v8 - (v11 + (v10 & v9) * 2) + 1 & -(1 - (v11 + (v10 & v9) * 2) | v8)) * 4 + (v8 - (v11 + (v10 & v9) * 2) + 1 ^ -(1 - (v11 + (v10 & v9) * 2) | v8)) * 2 | 1)) * 2;
    v14 = v13 - 1;
    v15 = -v13;
    v16 = ((v15 | 8249) ^ v13) + ((v15 | 8249) & v13) * 2;
    v0 = (v14 ^ 57287) + ((v15 | 57287) + v13) * 2 - 1;
    v1 = (v16 & (v14 & 8249) - (v13 + 8249)) + v13 + 8249 + ~(v14 & 8249) + (v16 & v13 + 8249 + ~(v14 & 8249));
    v17 = v0;
    v18 = v1;
    v19 = v17 + 1;
    v20 = (v19 + ~v17 * 2 | v18) + v17;
    v21 = (v18 | ~v17) + v19 + (v18 ^ v17);
    v22 = (unsigned int)(v21 + v20 * 2 + ((unsigned int)(0xfffffffe - v20) | v21) - (v20 + 1 & v21)) + 3;
    v23 = (unsigned int)(v2 - v22) + (v22 & (unsigned int)v2) + (v22 & ~(unsigned int)v2) * 2;
    g_f12764 = (unsigned short)v22 + (unsigned short)v2 + (unsigned short)v23 + ((unsigned short)(v22 + v2 - v23 - (v22 + (unsigned int)v2 | -v23)) + ((unsigned short)-v23 & (unsigned short)~(v22 + (unsigned int)v2))) * 2;
    v24 = v1;
    v25 = v0;
    v26 = v25 | v24;
    v27 = v24 + 1;
    v28 = ((v25 | ~v24) ^ 0xfffffffffffffffe - v24) - ((v25 | ~v24) & v27) * 2 + v26;
    v29 = (v25 + v24 ^ -v26) + (v25 + v24 & -v26) * 2;
    v30 = v24 + v27 + ~v24 * 2 + (v25 | ~(v27 + ~v24 * 2)) + v29 + ~v29 * 2 + 2;
    v31 = (v30 + v28 + 1 - ((0x7ffffffffffffffe - v28 & v30) + v28) * 2 - 3 ^ (0xffffffffffffffff ^ (v28 + 1 & ~v30) * 2) + (v28 + 1 & ~v30) * 4 + 2) + (v30 + v28 + 1 - ((0x7ffffffffffffffe - v28 & v30) + v28) * 2 - 3 & (0xffffffffffffffff ^ (v28 + 1 & ~v30) * 2) + (v28 + 1 & ~v30) * 4 + 2) * 2;
    v32 = ~v31;
    v33 = v32 + v31 * 2;
    v34 = v32 | 0xfffffffffffffffe;
    v0 = v34 + (v33 & 0xfffffffffffffffe) + 15;
    v1 = v34 + (v33 + (v33 * 2 & 8) + (v33 * 2 & 8 ^ 8) - 4 & 0xfffffffffffffffe) + 1;
    v35 = (v1 ^ 0xfffffffffffffffe) + v1 * 2 - (v1 * 2 & 2) + 3;
    v36 = v2 >> ((char)v0 + (char)~v35 + (char)v35 * 2 & 63);
    v37 = v1;
    v38 = v0;
    v39 = (v37 ^ 1) + ~v37 * 2 + ((v37 * 2 | v37 >> 63) & 2 & 3);
    v40 = v38 + 1;
    v41 = v40 + v39 + (~v39 & ~v38);
    v42 = ((v40 + ~v38 * 2 | v37) ^ ~v38 * 2 + v38) - ((v40 + ~v38 * 2 | v37) & v40) * 2 + (v38 | v37);
    v43 = (v37 - v38 + (v40 + v39 + (~v39 & ~v38)) * 4 + 1 + ~((v40 + v39 + (~v39 & ~v38)) * 2) ^ -((0xfffffffffffffffe - v42 | 1) + (v42 & 1))) + ((0xfffffffffffffffe - v42 | 1) + (v42 & 1) & (v40 + v39 + (~v39 & ~v38)) * 2 - (v37 - v38 + (v40 + v39 + (~v39 & ~v38)) * 4 + 1)) * 2 + (v42 - (v37 - v38 + v41 * 4 + 1 + ~((v40 + v39 + (~v39 & ~v38)) * 2) + ((v40 + v39 + (~v39 & ~v38)) * 2 - (v37 - v38 + v41 * 4 + 1) | v42)) & v37 - v38 + (v40 + v39 + (~v39 & ~v38)) * 4 + 1 + ~((v40 + v39 + (~v39 & ~v38)) * 2) + ~v42) * 4 + ((v42 - (v37 - v38 + v41 * 4 + 1 + ~((v40 + v39 + (~v39 & ~v38)) * 2) + ((v40 + v39 + (~v39 & ~v38)) * 2 - (v37 - v38 + v41 * 4 + 1) | v42)) ^ v37 - v38 + (v40 + v39 + (~v39 & ~v38)) * 4 + 1 + ~((v40 + v39 + (~v39 & ~v38)) * 2) + ~v42) + (v37 - v38 + (v40 + v39 + (~v39 & ~v38)) * 4 + 1 + ~((v40 + v39 + (~v39 & ~v38)) * 2) & -((0xfffffffffffffffe - v42 | 1) + (v42 & 1)))) * 2 + 1;
    v44 = ~v43 + v43 * 2;
    v45 = v44 + (v44 & 57077) + 0xffffffffffff210b + ((0xffffffff ^ (unsigned int)v44 * 2) & 114154);
    v0 = (1 & ~v43) + 8457 + (v44 | 1);
    v1 = ((v44 | 0xffffffffffff210a) + 57078 | v45) + (v45 & (v44 | 0xffffffffffff210a) + 57078);
    v46 = ((unsigned short)v1 + (unsigned short)v0 + (unsigned short)~((unsigned int)v1 + (unsigned int)v0) * 2 + 1 & (unsigned short)~v36) + (unsigned short)v1 + (unsigned short)v0;
    v47 = (unsigned short)(v36 * 2 + (v36 ^ 0xfffffffe) - (v36 * 2 & 2)) + 3;
    g_f12766 = (v47 ^ v46) + (v47 & v46) * 2;
    v48 = v1;
    v49 = v0;
    v50 = v49 + v48;
    v51 = v49 | v48;
    v52 = -v51;
    v53 = (v50 & v52) * 2;
    v54 = v48 + 1 + ~v48 * 2 + v48 + 1 + (v49 | ~(v48 + 1 + ~v48 * 2)) + (v51 - 1 ^ v50) - v53;
    v55 = v54 + 1;
    v56 = (v49 + 1 + ~v49 * 2 & v48) + v49 + 1 + v53 + (v50 ^ v52) + ~(v53 + (v50 ^ v52)) * 2;
    v57 = 0xfffffffffffffffe - v54;
    v58 = (v56 + 1 ^ v55) + (v54 + v57 * 2 + 2 + (v56 + 1 & v55) + (~(v54 + v57 * 2 + 2) | ~v56)) * 2 + 2;
    v59 = ((v57 | ~v56) + v55) * 2;
    v60 = (v58 & 0xfffffffffffffffd - v59) + v59 + 2 + (v58 & v59 + 2);
    v0 = v60 + 23;
    v1 = v60 + 9;
    v61 = (v1 * 2 + (v1 ^ 0xfffffffffffffffe) - (v1 * 2 & 2) + 3 ^ v0) + (v1 * 2 + (v1 ^ 0xfffffffffffffffe) - (v1 * 2 & 2) + 3 & v0) * 2;
    v62 = v2 >> ((char)~v61 + (char)v61 * 2 & 63);
    v63 = v1;
    v64 = v0;
    v65 = v63 + 1;
    v66 = (v63 ^ -v64) + ((-v64 | ~v63) + v65) * 2;
    v67 = v66 + (v65 + ~v63 * 2 + v64 & -(v65 + ~v63 * 2 | v64)) * 4 + (v65 + ~v63 * 2 + v64 ^ -(v65 + ~v63 * 2 | v64)) * 2 + (v66 & ~((v65 + ~v63 * 2 + v64 & -(v65 + ~v63 * 2 | v64)) * 4 + (v65 + ~v63 * 2 + v64 ^ -(v65 + ~v63 * 2 | v64)) * 2)) + ((v65 + ~v63 * 2 + v64 & -(v65 + ~v63 * 2 | v64)) * 4 + (v65 + ~v63 * 2 + v64 ^ -(v65 + ~v63 * 2 | v64)) * 2 | ~v66);
    v68 = v67 + 1;
    v69 = v64 + 1 - (v64 & v63) + v64 + 1 + ~v64 * 2 + (v63 | ~(v64 + 1 + ~v64 * 2));
    v70 = v67 + 2;
    v71 = v70 + ~v68 * 2;
    v72 = (v68 ^ v69) + (v68 & v69) * 2 + (v71 + (-v69 | ~v71)) * 2;
    v73 = (v70 - v69 + v71 + (v69 - 1 | ~v71)) * 2;
    v74 = v73 + 2 + v72 * 2 + (v73 + 2 | ~(v72 + 2)) + (0xfffffffffffffffd - v73 | ~(v72 + 2));
    v75 = v74 + 6;
    v76 = v74 + 7;
    v77 = v76 + ~v75 * 2;
    v78 = (((v77 | 44089) ^ v76) + ((v77 | 44089) & v76) * 2 ^ (v75 | 44089) + 1) + (((v77 | 44089) ^ v76) + ((v77 | 44089) & v76) * 2 & (v75 | 44089) + 1) * 2;
    v79 = (((v77 | 21446) ^ v76) + ((v77 | 21446) & v76) * 2 ^ v75 + (v75 & 21446) - (0xffffffffffff5873 | v75 * 2) + 0xffffffffffffac3a) + (((v77 | 21446) ^ v76) + ((v77 | 21446) & v76) * 2 & v75 + (v75 & 21446) - (0xffffffffffff5873 | v75 * 2) + 0xffffffffffffac3a) * 2;
    v0 = ~v78 + v78 * 2;
    v1 = ~v79 + v79 * 2;
    v80 = v0;
    v81 = v1;
    v82 = v80 + 1;
    v83 = v82 + ~v80 * 2 | v81;
    v84 = v81 + v82 - (v81 & v80);
    v85 = ((v83 ^ v82) + (v83 & v82) * 2 ^ v84) + ((v83 ^ v82) + (v83 & v82) * 2 & v84) * 2;
    v86 = ~v85 + v85 * 2;
    v87 = -v86 - (v62 & -v85);
    g_f12768 = ((unsigned short)v86 + (unsigned short)v62 ^ v87) + ((unsigned short)v86 + (unsigned short)v62 + (v87 | (unsigned short)~(v86 + v62))) * 2 + 2;
    v88 = v1;
    v89 = v0;
    v90 = v89 + v88;
    v91 = v90 + ((v88 & ~v89) - (v88 | -v89) + (-v89 & ~v88)) * 2;
    v92 = v89 + 1;
    v93 = v92 + ~v89 * 2;
    v94 = v93 + 1;
    v95 = v94 + ~v93 * 2 | v88;
    v96 = v90 + (v95 & v94) * 4 + (v92 + (-v88 | ~v89) + (-v88 & ~v89) + (v95 ^ v94)) * 2;
    v97 = (v96 ^ v91) + ((v96 & v91) - (v96 + v91) + (v96 - 1 & v91)) * 2;
    v98 = v97 + (((v91 & -v96) - (v91 - v96) & v91 - v96) * 4 + ((v91 & -v96) - (v91 - v96) ^ v91 - v96) * 2 | ~v97) + (v97 | ((v91 & -v96) - (v91 - v96) & v91 - v96) * 4 + ((v91 & -v96) - (v91 - v96) ^ v91 - v96) * 2);
    v99 = v98 + 1;
    v100 = ~v99;
    v101 = v98 + 2;
    v102 = v101 + v100 * 2;
    v103 = ((v102 | 0x11) ^ v101) + ((v102 | 0x11) & v101) * 2;
    v104 = v101 + (0x11 | ~v99) + (v99 ^ 0x11);
    v0 = ((v100 | 31) ^ -v102) + (v99 | 31) + ((v100 | 31) & -v102) * 2;
    v1 = v103 + (v104 | ~v103) + (v103 | v104) + 1;
    v105 = v0;
    v106 = v1;
    v107 = v105 + 1;
    v108 = v107 - v106 + (v106 & v105) + (v106 & ~v105) * 2;
    v109 = (v108 ^ (v107 + ~v105 * 2 | v106) + v107) + (v108 & (v107 + ~v105 * 2 | v106) + v107) * 2;
    g_f1276a = v2 >> ((char)~v109 + (char)v109 * 2 & 63);
    v110 = g_f04c00 * 2;
    v111 = v110 + ~g_f04c00 * 4 + (g_f04c00 ^ 1) + (v110 & 2) + 2;
    v112 = (unsigned short)v111 + g_f12764;
    v113 = -(v111 | g_f12764);
    v114 = g_f04c00 - g_f12764;
    v115 = (v112 & v113) * 4 + (v112 ^ v113) * 2 | 1;
    g_f04c00 = (v115 ^ v114) + (v115 & v114) * 2 - 1;
    v116 = g_f12766 + g_f04c02;
    v117 = g_f12766 | g_f04c02;
    g_f04c02 = (unsigned short)(v116 - ((g_f12766 & g_f04c02) + (v116 & -v117) * 2)) + ((unsigned short)(v117 - 1) ^ v116) + 1;
    g_f04c04 = (g_f04c04 | g_f12768) - (g_f12768 & g_f04c04);
    v118 = g_f1276a & g_f04c06;
    v119 = (unsigned int)(g_f04c06 - g_f1276a) + v118 + (g_f1276a & ~g_f04c06) * 2;
    g_f04c06 = (unsigned short)v119 + (unsigned short)v118 + ((unsigned short)v119 + ((unsigned short)-v118 | (unsigned short)~v119) + ((unsigned short)-v118 & (unsigned short)~v119)) * 2 + 2;
    v120 = g_f04c08 | v2;
    v121 = g_f04c08 + v2;
    g_f04c08 = v120 - (v121 & -v120) * 2 + (v120 - 1 ^ v121) + 1;
    return v110 & 2;
}
