/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x536974..0x537820 (3756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_536974_1 {
    char padding_0[31494577];
    unsigned short field_1e091b1;
} st_536974_1;

typedef struct st_536974_0 {
    char field_0;
} st_536974_0;

extern unsigned short g_f048d8;
extern unsigned short g_f048da;
extern unsigned short g_f048dc;
extern unsigned short g_f048de;
extern unsigned short g_f048e0;
extern unsigned short g_f048e2;
extern unsigned short g_f048e4;
extern unsigned short g_f048e6;
extern unsigned long long g_f048e8;

int sub_536974(void)
{
    st_536974_0 *v4;  // x8
    st_536974_0 **v5;  // x9
    unsigned long long v14;  // x9
    unsigned long long v104;  // x2
    unsigned long v105;  // x3
    unsigned long long v106;  // x0
    unsigned long long v107;  // x2
    unsigned long long v108;  // x5
    unsigned long long v109;  // x16
    unsigned long long v110;  // x17
    unsigned long long v111;  // x9
    unsigned long long v112;  // x16
    unsigned long long v113;  // x17
    unsigned long long v15;  // x11
    unsigned int v114;  // w1
    unsigned int v115;  // w0
    unsigned short v116;  // x2
    unsigned short v117;  // x13
    unsigned int v118;  // w16
    unsigned int v119;  // w0
    unsigned int v120;  // w13
    unsigned int v121;  // w11
    unsigned short v122;  // x11
    unsigned short v123;  // x9
    unsigned long v16;  // x8
    unsigned short v124;  // x13
    unsigned short v125;  // x14
    unsigned short v126;  // x9
    unsigned short v127;  // x11
    unsigned long long v128;  // x11
    unsigned long long v129;  // x13
    unsigned long long v130;  // x9
    unsigned long long v131;  // x9
    unsigned int v132;  // w8
    unsigned int v133;  // w10
    char v17;  // x10
    unsigned int v134;  // w11
    unsigned int v135;  // w8
    unsigned int v136;  // w9
    unsigned int v137;  // w8
    unsigned int v138;  // w9
    unsigned int v139;  // w10
    unsigned int v140;  // w11
    unsigned int v141;  // w14
    unsigned int v142;  // w8
    unsigned int v143;  // w15
    unsigned long long v18;  // x9
    unsigned int v144;  // w8
    unsigned int v145;  // w8
    unsigned int v146;  // w10
    unsigned int v147;  // w9
    unsigned int v148;  // w9
    st_536974_1 *v19;  // x11
    unsigned long v20;  // x11
    unsigned long v21;  // x12
    unsigned long long v22;  // x14
    unsigned long long v23;  // x14
    unsigned long long v6;  // x10
    unsigned long long v24;  // x14
    unsigned long long v25;  // x13
    unsigned long long v26;  // x12
    unsigned long long v27;  // x11
    unsigned long long v28;  // x12
    unsigned long long v29;  // x15
    unsigned long long v30;  // x11
    unsigned long long v31;  // x11
    unsigned long long v32;  // x11
    unsigned long v33;  // x12
    unsigned long long v7;  // x12
    unsigned long v34;  // x13
    unsigned long long v35;  // x15
    unsigned long long v36;  // x16
    unsigned long long v37;  // x14
    unsigned long long v38;  // x11
    unsigned long long v39;  // x11
    unsigned long long v40;  // x13
    unsigned long long v41;  // x15
    unsigned long long v42;  // x16
    unsigned long long v43;  // x12
    unsigned long long v8;  // x11
    unsigned long long v44;  // x13
    unsigned long long v45;  // x10
    st_536974_0 *v46;  // x12
    st_536974_0 **v47;  // x13
    unsigned long long v48;  // x14
    unsigned long long v49;  // x14
    unsigned long long v50;  // x12
    unsigned long long v51;  // x12
    unsigned long long v52;  // x12
    unsigned long long v53;  // x13
    unsigned long long v9;  // x8
    unsigned long long v54;  // x12
    unsigned int v55;  // w14
    unsigned int v56;  // w13
    unsigned int v57;  // w14
    unsigned long long v58;  // x14
    unsigned long long v59;  // x15
    unsigned long long v60;  // x17
    unsigned long long v61;  // x14
    unsigned long long v62;  // x14
    unsigned long long v63;  // x15
    unsigned long v10;  // x9
    unsigned long long v64;  // x16
    unsigned long long v65;  // x17
    unsigned int v66;  // w14
    unsigned long long v67;  // x15
    unsigned long v68;  // x16
    unsigned long long v69;  // x15
    unsigned long long v70;  // x15
    unsigned long long v71;  // x15
    unsigned long long v72;  // x16
    unsigned long long v73;  // x0
    unsigned long long v11;  // x8
    unsigned int v74;  // w15
    unsigned short v75;  // x16
    unsigned short v76;  // x17
    unsigned short v77;  // x0
    unsigned short v78;  // x15
    unsigned short v79;  // x15
    unsigned long long v80;  // x15
    unsigned long v81;  // x16
    unsigned long long v82;  // x1
    unsigned long long v83;  // x17
    unsigned long long v12;  // x8
    unsigned long long v84;  // x15
    unsigned long long v85;  // x16
    unsigned long long v86;  // x15
    unsigned long long v87;  // x16
    unsigned long long v88;  // x15
    unsigned int v89;  // w15
    unsigned long v90;  // x16
    unsigned long long v91;  // x17
    unsigned long long v92;  // x0
    unsigned long long v93;  // x1
    unsigned long long v13;  // x8
    unsigned long long v94;  // x16
    unsigned long long v95;  // x16
    unsigned long long v96;  // x17
    unsigned short v97;  // x16
    unsigned long long v98;  // x16
    unsigned long v99;  // x17
    unsigned long long v100;  // x1
    unsigned long long v101;  // x4
    unsigned long long v102;  // x4
    unsigned long long v103;  // x0
    st_536974_0 **v0;  // [bp-0x20], Other Possible Types: unsigned long long, char
    st_536974_0 *v1;  // [bp-0x18], Other Possible Types: unsigned long, unsigned long long
    st_536974_0 **v2;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_536974_0 *v3;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

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
    v18 = 15747288 >> ((char)v3 + (char)v16 * 2 + (v17 | (char)v3) + ((char)v3 + (char)~v3 * 2 + 1 | v17) + 2 & 63);
    v19 = (char *)&g_f048d8 + 0x2 * ~&g_f048d8 + 1;
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
    v45 = ((-v18 ^ 15747288) + (&v19->padding_0[v18] & -(v18 | v19)) * 4 + ((char *)&g_f048d8 - v18 - (-v18 | 15747288) + (&v19->padding_0[v18] ^ -(v18 | v19))) * 2) * (~v31 + v31 * 2) >> ((char)v2 + (char)~v44 + ((char)v44 & (char)~v2) * 2 + ((char)v2 + ((char)v44 | (char)~v2)) * 2 + 2 & 63) ^ ((-v18 ^ 15747288) + (&v19->padding_0[v18] & -(v18 | v19)) * 4 + ((char *)&g_f048d8 - v18 - (-v18 | 15747288) + (&v19->padding_0[v18] ^ -(v18 | v19))) * 2) * (~v31 + v31 * 2);
    v46 = v1;
    v47 = v0;
    v48 = (v46 ^ 1) + ~v46 * 2 + ((v46 * 2 | v46 >> 63) & 2 & 3);
    v49 = (v46 - v47 | (v48 & v47) * 2) + ((v48 & v47) * 2 & v46 - v47);
    v50 = ((char *)v47 + 0x2 * ~v47 ^ ~((char *)v47 + 0x2 * ~v47 + 1 | v46)) + (((char *)v47 + 0x2 * ~v47 + 1 | v46) & ~(st_536974_0 **)((char *)v47 + 0x2 * ~v47)) * 2;
    v51 = v49 + ((v47 | v46) + v50 + ~v50 * 2 + 2 & v49) + (v47 | v46) + v50 + ~v50 * 2 - ((v47 | v46) + v50 + ~v50 * 2 + 2) * 2 + 1 + ((v47 | v46) + v50 + ~v50 * 2 - ((v47 | v46) + v50 + ~v50 * 2 + 2) * 2 + 1 | ~v49) + 1;
    v52 = v51 + (v51 | 1) + (~v51 | 1);
    v53 = v52 + 1;
    v54 = ((v53 & 0xffffffffffff721e ^ 0xffffffffffff721f ^ v52 + 36322) + ((v53 & 0xffffffffffff721e ^ 0xffffffffffff721f) & v52 + 36322) * 2 ^ (v53 | 36321) + 1) + ((v53 & 0xffffffffffff721e ^ 0xffffffffffff721f ^ v52 + 36322) + ((v53 & 0xffffffffffff721e ^ 0xffffffffffff721f) & v52 + 36322) * 2 & (v53 | 36321) + 1) * 2;
    v0 = (v52 + 29215 ^ -(v53 | 29214)) + (v53 | 29214) + (v52 + 29215 & -(v53 | 29214)) * 2;
    v1 = ~v54 + v54 * 2;
    v55 = ((unsigned int)v1 ^ 1) + (unsigned int)v1 * 2 + ~(unsigned int)v1 * 4 + ((unsigned int)v1 * 2 & 2);
    v56 = (v55 + (unsigned int)v0 + 2 | 0xfffffffe) + (v55 + (unsigned int)v0 + 2 + ((unsigned int)v0 + ((unsigned int)(0xfffffffe - v55) | ~(unsigned int)v0) + ((unsigned int)(0xfffffffe - v55) & ~(unsigned int)v0)) * 2 + 2 & 0xfffffffe) + 1;
    v57 = (unsigned int)(v45 - v56) + (v56 & (unsigned int)v45) + (v56 & ~(unsigned int)v45) * 2;
    g_f048da = (unsigned short)v45 + (unsigned short)v56 + (unsigned short)v57 + (unsigned short)~v57 * 2 + 2;
    v58 = v1;
    v59 = v0;
    v60 = v58 + v59 + ((v58 & ~v59) - v58 & ~(v58 | v59)) * 2 + ((v58 | v59) + ((v58 & ~v59) - v58 | ~(v58 | v59))) * 2;
    v61 = (v59 - v58 | (v58 - (v59 + ~v59 * 2 + 1) + (v59 + ~v59 * 2 + 1 | ~v58) & v59 + ~v59 * 2 + 2) * 4 + (v58 - (v59 + ~v59 * 2 + 1) + (v59 + ~v59 * 2 + 1 | ~v58) ^ v59 + ~v59 * 2 + 2) * 2) + ((v58 - (v59 + ~v59 * 2 + 1) + (v59 + ~v59 * 2 + 1 | ~v58) & v59 + ~v59 * 2 + 2) * 4 + (v58 - (v59 + ~v59 * 2 + 1) + (v59 + ~v59 * 2 + 1 | ~v58) ^ v59 + ~v59 * 2 + 2) * 2 & v59 - v58);
    v62 = (v61 | ~(v60 + 2)) + v60 * 2 + v61 + (0xffffffffffffffff ^ v61 * 2) + (v61 + (0xffffffffffffffff ^ v61 * 2) | ~(v60 + 2));
    v63 = v62 + 7;
    v64 = (v62 + 21 ^ -(v63 | 14)) + (v62 + 21 & -(v63 | 14)) * 2;
    v65 = v63 + ~v63 * 2 + 1;
    v0 = (v64 ^ (v63 & 0xfffffffffffffff1) + 15) + (v64 & (v63 & 0xfffffffffffffff1) + 15) * 2 - 1;
    v1 = v63 + (v62 + 9 ^ 0xfffffffffffffffe - (v63 & 0xfffffffffffffffd)) + v65 - (v65 & 0xfffffffffffffffd) + (v62 + 9 & 0xfffffffffffffffe - (v63 & 0xfffffffffffffffd)) * 2;
    v66 = v45 >> (((char)v1 + (char)~v1 * 2 + 1 & v0) + (char)v1 + (v0 + ~v0 * 2 ^ (char)~(v0 + ~v0 * 2 + 1 | v1)) + ((v0 + ~v0 * 2 + 1 | (char)v1) & (char)~(v0 + ~v0 * 2)) * 2 & 63);
    v67 = v1;
    v68 = v0;
    v69 = v68 - v67 + ~((v67 + ~v68 & -(v67 | ~v68)) * 4 + (v67 + ~v68 ^ -(v67 | ~v68)) * 2) + ((v67 + ~v68 & -(v67 | ~v68)) * 4 + (v67 + ~v68 ^ -(v67 | ~v68)) * 2) * 2;
    v70 = (v68 ^ v67) - v69 * 2 + (v69 + 1 ^ 1) + (((v69 + 1) * 2 | v69 + 1 >> 63) & 2 & 3) - 4;
    v71 = (v70 * 2 & 4) + (v70 ^ 2);
    v72 = v71 - 1;
    v73 = v72 * 2;
    v0 = (v72 & 59715) + v71 * 2 + (-v71 & 0xffffffffffff16bc) - (v73 | 0xfffffffffffe2d79) - 2;
    v1 = ~(v71 + (v73 & 11642) + (v73 & 11642 ^ 11642) + 0xffffffffffffe942) + (v71 + (v73 & 11642) + (v73 & 11642 ^ 11642) + 0xffffffffffffe942) * 2;
    v74 = v0;
    v75 = v1;
    v76 = v75 | (unsigned short)~v74;
    v77 = (unsigned short)v74 + 1;
    v78 = (unsigned short)(v77 + v74 - v75) + v76 + (v75 & (unsigned short)~v74) * 2 + 1;
    v79 = (v78 ^ (v76 ^ v77) + (v76 & v77) * 2) + (v78 & (v76 ^ v77) + (v76 & v77) * 2) * 2 - 1;
    g_f048dc = (v79 | (unsigned short)~v66) + v66 + v79 + (v79 | v66) - ((v79 | (unsigned short)~v66) + (v79 | v66) * 2);
    v80 = v1;
    v81 = v0;
    v82 = (v80 ^ -v81) + (v80 + (-v81 | ~v80)) * 2;
    v83 = v82 + (v81 + ~v80 & -(v81 | ~v80)) * 4 + (v81 + ~v80 ^ -(v81 | ~v80)) * 2 + ((v81 + ~v80 & -(v81 | ~v80)) * 4 + (v81 + ~v80 ^ -(v81 | ~v80)) * 2 | ~(v82 + 2)) + (v82 + 2 & ~((v81 + ~v80 & -(v81 | ~v80)) * 4 + (v81 + ~v80 ^ -(v81 | ~v80)) * 2)) + 3;
    v84 = (v81 ^ -v80) + (v81 + 1 + (-v80 | ~v81)) * 2 + (v81 + 1 + ~v81 * 2 + v80 ^ -(v81 + 1 + ~v81 * 2 | v80)) * 2 + (v81 + 1 + ~v81 * 2 + v80 & -(v81 + 1 + ~v81 * 2 | v80)) * 4;
    v85 = (~v83 - (-v84 | ~v83) ^ (-v84 | v83)) + (~v83 - (-v84 | ~v83) & (-v84 | v83)) * 2;
    v86 = v85 + (v84 - (v84 - 1 & v83) & v83 - v84) * 4 + (v84 - (v84 - 1 & v83) ^ v83 - v84) * 2 + ((v84 - (v84 - 1 & v83) & v83 - v84) * 4 + (v84 - (v84 - 1 & v83) ^ v83 - v84) * 2 | ~v85) + (v85 & ~((v84 - (v84 - 1 & v83) & v83 - v84) * 4 + (v84 - (v84 - 1 & v83) ^ v83 - v84) * 2));
    v87 = v86 + 1;
    v88 = ((v86 + 21 ^ -(v87 | 20)) + (v86 + 21 & -(v87 | 20)) * 2 ^ (v87 & 20) - (v87 ^ 0xffffffffffffffeb)) + ((v86 + 21 ^ -(v87 | 20)) + (v86 + 21 & -(v87 | 20)) * 2 & (v87 & 20) - (v87 ^ 0xffffffffffffffeb)) * 2;
    v0 = ~v88 + v88 * 2;
    v1 = ((v87 | 1) + (v87 & 1) + 12 | 1) + ((v87 | 1) + (v87 & 1) + 12 & 1) - 2;
    v89 = v45 >> ((char)v1 + (char)v0 & 63);
    v90 = v1;
    v91 = v0;
    v92 = v91 | v90;
    v93 = v90 - v91 + (v92 ^ -v90) * 2 + (v92 & -v90) * 4;
    v94 = (v91 & v90) + v92 + ~(v91 & v90) * 2;
    v95 = v93 + 1 + v94 + 2 + (v94 + 2 - (v93 & v94 + 1) ^ v93 - (v94 + 2)) * 2 + (v94 + 2 - (v93 & v94 + 1) & v93 - (v94 + 2)) * 4 + (v93 + 1 + ~v93 * 2 & ~(v94 + 1)) * 2;
    v96 = v95 - 1;
    v0 = (v96 | 0xfffffffffffffffe) + (v95 + (59672 & v96 * 2) + (59672 & v96 * 2 ^ 59672) + 0xffffffffffff8b73 & 0xfffffffffffffffe) + 1;
    v1 = (v96 | 35700) + ((-v95 | 35700) ^ v95) + ((-v95 | 35700) & v95) * 2;
    v97 = (unsigned short)(v0 + (unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 2;
    g_f048de = (unsigned short)(v89 * 2 + (v89 ^ 0xfffe) - ((v89 * 2 & 2) + (v97 ^ v89))) + (v97 & (unsigned short)~v89) + 2;
    v98 = v1;
    v99 = v0;
    v100 = ~v98;
    v101 = v98 - v99;
    v102 = v99 + v98;
    v103 = v102 + (-v99 & ~v98) * 2 + (v101 - (v98 | -v99)) * 2;
    v104 = (v101 - (v98 | ~v99) & v99 + v100) * 4 + (v101 - (v98 | ~v99) ^ v99 + v100) * 2 | 1;
    v105 = v104 ^ v103;
    v106 = v104 & v103;
    v107 = v105 + v106 * 2;
    v108 = v107 - 1;
    v109 = v102 + v100 * 2 + (v98 - v99 + (v99 & ~v98)) * 2;
    v110 = v109 + 2;
    v111 = v105 + (v106 - v107) * 2 + (v108 & v110) + (0xfffffffffffffffe - v109 | ~(v105 + (v106 - v107) * 2));
    v112 = ((v108 ^ v110) + v111 * 2 + 2 ^ (v108 - v110 + (v109 + 1 & -v107)) * 2 + 3) + ((v108 ^ v110) + v111 * 2 + 2 & (v108 - v110 + (v109 + 1 & -v107)) * 2 + 3) * 2;
    v113 = ~v112 + v112 * 2;
    v0 = (v113 ^ 37) + ((-v112 | 37) + v112) * 2 - 1;
    v1 = (1 & ~v112) + (v113 | 1) + 11;
    g_f048e0 = v45 >> ((char)v1 + v0 & 63);
    v114 = g_f048d8 + 1;
    v115 = v114 + ~g_f048d8 * 2;
    v116 = g_f048da | (unsigned short)~v115;
    v117 = -g_f048da;
    g_f048d8 = (v117 ^ g_f048d8) + ((unsigned short)v115 + 1 & v116) * 4 + ((unsigned short)v114 + (v117 | ~g_f048d8) + ((unsigned short)v115 + 1 ^ v116)) * 2;
    v118 = -g_f048dc;
    v119 = g_f048dc & ~g_f048e2;
    v120 = g_f048dc + g_f048e2 + (v118 & ~g_f048e2) * 2 + (unsigned int)(g_f048e2 - g_f048dc - (v118 | g_f048e2)) * 2;
    v121 = (0xffffffff ^ v119 * 2) + v119 * 4 + 2;
    g_f048e2 = (unsigned short)~((v120 ^ v121) + (v120 & v121) * 2) + (((unsigned short)v120 ^ (unsigned short)v121) + ((unsigned short)v120 & (unsigned short)v121) * 2) * 2;
    v122 = g_f048e4 - g_f048de;
    v123 = 1 | (g_f048de & ~g_f048e4) * 2;
    g_f048e4 = (v123 ^ v122) + (v123 & v122) * 2 - 1;
    v124 = g_f048e0 | g_f048e6;
    v125 = -g_f048e6;
    v126 = g_f048e6 - g_f048e0;
    v127 = (v124 & v125) * 4 + (v124 ^ v125) * 2 | 1;
    g_f048e6 = (v127 ^ v126) + (v127 & v126) * 2 - 1;
    v128 = g_f048e8 - v45 + (g_f048e8 & v45) + (v45 & ~g_f048e8) * 2;
    v129 = g_f048e8 + v45;
    v130 = -(g_f048e8 | v45);
    v131 = -((v129 ^ v130) + (v129 & v130) * 2);
    g_f048e8 = (v131 ^ v128) + (v128 + (v131 | ~v128)) * 2 + 2;
    v132 = v1;
    v133 = *(unsigned int *)&v0;
    v134 = v132 - v133 + (v133 & ~v132) * 2;
    v135 = v134 + v132 + (-v132 & ~v134) * 2 + (unsigned int)(v134 - v132 - (v134 | -v132)) * 2;
    v136 = ((v134 | v132) & -v134) * 4 + ((v134 | v132) ^ -v134) * 2;
    v137 = v135 + v136 + (v136 | ~v135) + (v135 & ~v136);
    v138 = v137 + 1;
    v139 = (v134 & v133 + ~v133 * 2 + 1) + v133 + (v133 - v134 + (v134 | ~v133) ^ v134 - (v134 + 1) * 2) - (v133 - v134 + (v134 | ~v133) & v134 + 1) * 2;
    v140 = v139 + 1;
    v141 = v140 & ~v138;
    v142 = v137 + 2;
    v143 = v138 + ~v139 + (v140 | ~v138) + v142 + v141 * 2;
    v144 = v138 + v140 + (v142 + ~v138 * 2 & (unsigned int)(0xfffffffe - v139));
    v145 = (v144 ^ ~v143) + (v143 & ~v144) * 2;
    v146 = (v138 - v139 + v141) * 2 - 1;
    v147 = (v146 ^ v140 - v138) + (v146 & v140 - v138) * 2;
    v148 = (~v147 + v147 * 2 ^ 1) + ~((~v147 + v147 * 2) * 2) + ((~v147 + v147 * 2) * 2 & 2);
    return (v148 ^ v145) + (v148 & v145) * 2;
}
