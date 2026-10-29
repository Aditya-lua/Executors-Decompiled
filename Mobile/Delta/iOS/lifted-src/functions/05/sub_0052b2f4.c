/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52b2f4..0x52c0cc (3544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52b2f4_1 {
    char padding_0[31494625];
    unsigned short field_1e091e1;
} st_52b2f4_1;

typedef struct st_52b2f4_0 {
    char field_0;
} st_52b2f4_0;

extern unsigned short g_f048f0;
extern unsigned short g_f048f2;
extern unsigned short g_f048f4;
extern unsigned short g_f048f6;
extern unsigned short g_f048f8;
extern unsigned short g_f048fa;
extern unsigned short g_f048fc;
extern unsigned short g_f048fe;
extern unsigned long long g_f04900;

int sub_52b2f4(void)
{
    st_52b2f4_0 *v4;  // x8
    st_52b2f4_0 **v5;  // x9
    unsigned long long v14;  // x9
    unsigned long long v104;  // x1
    unsigned long long v105;  // x16
    unsigned long v106;  // x9
    unsigned long long v107;  // x9
    unsigned long long v108;  // x9
    unsigned short v109;  // x9
    unsigned short v110;  // x12
    unsigned short v111;  // x15
    unsigned short v112;  // x17
    unsigned short v113;  // x9
    unsigned long long v15;  // x11
    unsigned short v114;  // x14
    unsigned int v115;  // w9
    unsigned short v116;  // x14
    unsigned short v117;  // x15
    unsigned long long v118;  // x14
    unsigned int v119;  // w8
    unsigned int v120;  // w9
    unsigned int v121;  // w11
    unsigned int v122;  // w10
    unsigned int v123;  // w11
    unsigned long v16;  // x8
    unsigned int v124;  // w12
    unsigned int v125;  // w11
    unsigned int v126;  // w12
    unsigned int v127;  // w15
    unsigned int v128;  // w8
    unsigned int v129;  // w9
    unsigned int v130;  // w10
    unsigned int v131;  // w11
    unsigned int v132;  // w12
    unsigned int v133;  // w11
    char v17;  // x10
    unsigned int v134;  // w16
    unsigned int v135;  // w14
    unsigned int v136;  // w14
    unsigned int v137;  // w16
    unsigned int v138;  // w9
    unsigned int v139;  // w8
    unsigned int v140;  // w8
    unsigned int v141;  // w9
    unsigned int v142;  // w8
    unsigned long long v18;  // x9
    st_52b2f4_1 *v19;  // x11
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
    unsigned long long v33;  // x10
    unsigned long long v7;  // x12
    unsigned long v34;  // x12
    unsigned long v35;  // x13
    unsigned long long v36;  // x15
    unsigned long long v37;  // x16
    unsigned long long v38;  // x14
    unsigned long long v39;  // x10
    unsigned long long v40;  // x10
    unsigned long long v41;  // x13
    unsigned long long v42;  // x15
    unsigned long long v43;  // x16
    unsigned long long v8;  // x11
    unsigned long long v44;  // x10
    unsigned long long v45;  // x12
    unsigned long long v46;  // x12
    unsigned long long v47;  // x10
    unsigned long long v48;  // x15
    unsigned int v49;  // w15
    unsigned int v50;  // w16
    unsigned short v51;  // x17
    unsigned short v52;  // x15
    unsigned long long v53;  // x11
    unsigned long long v9;  // x8
    unsigned long long v54;  // x15
    unsigned long v55;  // x16
    unsigned long long v56;  // x17
    unsigned long long v57;  // x0
    unsigned long long v58;  // x15
    unsigned long long v59;  // x17
    unsigned long long v60;  // x16
    unsigned long long v61;  // x16
    unsigned long long v62;  // x15
    unsigned long long v63;  // x16
    unsigned long v10;  // x9
    unsigned long long v64;  // x15
    char v65;  // x16
    unsigned int v66;  // w15
    unsigned long long v67;  // x16
    unsigned long long v68;  // x17
    unsigned long long v69;  // x0
    unsigned long long v70;  // x16
    unsigned long long v71;  // x16
    unsigned int v72;  // w16
    unsigned long long v73;  // x16
    unsigned long long v11;  // x8
    unsigned long long v74;  // x17
    unsigned long long v75;  // x0
    unsigned long long v76;  // x1
    unsigned long long v77;  // x1
    unsigned long long v78;  // x16
    unsigned long long v79;  // x17
    unsigned long long v80;  // x0
    unsigned long long v81;  // x16
    unsigned long long v82;  // x16
    unsigned long long v83;  // x17
    unsigned long long v12;  // x8
    unsigned long long v84;  // x16
    unsigned int v85;  // w14
    unsigned long long v86;  // x16
    unsigned long v87;  // x17
    unsigned long long v88;  // x0
    unsigned long long v89;  // x1
    unsigned long long v90;  // x16
    unsigned long long v91;  // x16
    unsigned long long v92;  // x13
    unsigned long long v93;  // x17
    unsigned long long v13;  // x8
    unsigned long long v94;  // x1
    unsigned int v95;  // w13
    unsigned int v96;  // w16
    unsigned int v97;  // w17
    unsigned int v98;  // w16
    unsigned long long v99;  // x16
    unsigned long long v100;  // x17
    unsigned long long v101;  // x0
    unsigned long long v102;  // x0
    unsigned long long v103;  // x2
    st_52b2f4_0 **v0;  // [bp-0x20], Other Possible Types: char, unsigned long long
    st_52b2f4_0 *v1;  // [bp-0x18], Other Possible Types: unsigned long long
    st_52b2f4_0 **v2;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_52b2f4_0 *v3;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

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
    v18 = 15747312 >> ((char)v3 + (char)v16 * 2 + (v17 | (char)v3) + ((char)v3 + (char)~v3 * 2 + 1 | v17) + 2 & 63);
    v19 = (char *)&g_f048f0 + 0x2 * ~&g_f048f0 + 1;
    v20 = v3;
    v21 = v2;
    v22 = v20 | v21;
    v23 = (v21 + v20 ^ -v22) + (v21 + v20 & -v22) * 2;
    v24 = (~v20 & ~v21) + v22 * 2 + v23 + (-v23 & 0xfffffffffffffffe - ((~v20 & ~v21) + v22 * 2)) * 2 + ((~v20 & ~v21) + v22 * 2 + 1 - (v23 + ((~v20 & ~v21) + v22 * 2 + 1 | -v23))) * 2;
    v25 = (v21 ^ 1) + ~v21 * 2 + ((v21 * 2 | v21 >> 63) & 2 & 3);
    v26 = ((v25 + ~v25 * 2 + 1 | v20) & ~(v25 + ~v25 * 2)) * 4 + (v25 + ~v25 * 2 ^ ~(v25 + ~v25 * 2 + 1 | v20)) * 2;
    v27 = (v21 - v20 | v26) + (v26 & v21 - v20) - v24 + ((v21 - v20 | v26) + (v26 & v21 - v20) - ((v21 - v20 | v26) + (v26 & v21 - v20) - 1 & v24 + 1) & v24 + 1 - ((v21 - v20 | v26) + (v26 & v21 - v20))) * 4 + (((v21 - v20 | v26) + (v26 & v21 - v20) - ((v21 - v20 | v26) + (v26 & v21 - v20) - 1 & v24 + 1) ^ v24 + 1 - ((v21 - v20 | v26) + (v26 & v21 - v20))) + (v24 + 1 | -((v21 - v20 | v26) + (v26 & v21 - v20)))) * 2;
    v28 = v27 - 1;
    v29 = -v27;
    v30 = v28 + (9898673051734457728 & ~(v28 * 2)) + (v27 + (v29 | 4949336525867228864)) * 2 + 13497407547842322752;
    v2 = (v27 + 4998401304856957424 | 0xfffffffffffffffe) + ((8449941463995636766 & ~(v28 * 2)) + v27 + 4998401304856957424 + (v27 + (v29 | 4224970731997818383)) * 2 & 0xfffffffffffffffe) + 1;
    v3 = ~v30 + v30 * 2;
    v31 = v2 + ~v3 + (v3 + 1 & ~v2) * 2 + (v3 + 1 & v2) * 2;
    v32 = ((-v18 ^ 15747312) + (&v19->padding_0[v18] & -(v18 | v19)) * 4 + ((char *)&g_f048f0 - v18 - (-v18 | 15747312) + (&v19->padding_0[v18] ^ -(v18 | v19))) * 2) * (~v31 + v31 * 2);
    v33 = v3;
    v34 = v2;
    v35 = -v34;
    v36 = v34 - v33;
    v37 = -(v36 + (v33 | ~v34));
    v38 = v33 + v34 + (v33 - (v34 + (v33 | v35))) * 2 + (v34 + ~v33 & v37) * 4 + ((v34 + ~v33 ^ v37) + (v35 & ~v33)) * 2;
    v39 = ((v34 | v33) & v35) * 4 + ((v34 | v33) ^ v35) * 2 | 1;
    v40 = ~((v39 ^ v36) + (v39 & v36) * 2) + ((v39 ^ v36) + (v39 & v36) * 2) * 2;
    v41 = v38 - v40;
    v42 = v40 - 1;
    v43 = v41 + (v42 | ~v38) + 1;
    v44 = (v38 + (-v40 | ~v38) ^ ~v43) + (v40 - (v42 & v38) & v41) * 4 + ((v40 - (v42 & v38) ^ v41) + (v43 & ~(v38 + (-v40 | ~v38)))) * 2;
    v2 = v44 + (v44 + (~v44 | 15)) * 2 + ((0xffffffff ^ (unsigned int)v44 * 2) & 30) - 14;
    v3 = v44 + 15;
    v45 = (v3 ^ 0xfffffffffffffffe) + v3 * 2 - (v3 * 2 & 2) + 3;
    v46 = v32 >> ((char)v2 + (char)~v45 + ((char)v45 & (char)~v2) * 2 + ((char)v2 + ((char)v45 | (char)~v2)) * 2 + 2 & 63);
    v47 = v46 ^ v32;
    v48 = (v1 - v0 + v0 + v1 + (0xffffffffffffffff ^ v1 * 2) + ~(v0 + v1 + (0xffffffffffffffff ^ v1 * 2) + (v1 | ~v0)) - ((v0 | v1) ^ -v0)) * 2 - ((v0 | v1) & -v0) * 4;
    v0 = (v48 ^ 58204) + (116408 & v48 * 2) - 1;
    v1 = v48 + 7332;
    v49 = v0;
    v50 = v1;
    v51 = ((unsigned short)v50 + (unsigned short)v49 ^ (unsigned short)-(v50 | v49)) + ((unsigned short)v50 + (unsigned short)v49 & (unsigned short)-(v50 | v49)) * 2;
    v52 = (unsigned short)(v49 - v50) + ((unsigned short)v50 & (unsigned short)v49) + ((unsigned short)v50 & (unsigned short)~v49) * 2;
    v53 = v47 + (v46 ^ ~v32) * 2 + 1;
    g_f048f2 = ((v51 | v52) + (v51 & v52) | (unsigned short)v53) + (unsigned short)v47 + 1;
    v54 = v1;
    v55 = v0;
    v56 = -v54;
    v57 = v55 | v54;
    v58 = v54 - v55 + (v57 ^ v56) * 2 + (v57 & v56) * 4;
    v59 = (v57 & -v55) * 4 + (v57 ^ -v55) * 2;
    v60 = (v55 ^ v56) + (v55 + (v56 | ~v55)) * 2 + ~v59;
    v61 = ~(v60 + v59 * 2 + 4) + (v60 + v59 * 2 + 4) * 2;
    v62 = (v61 | ~v58) + v58 * 2 + v61 + (0xffffffffffffffff ^ v61 * 2) + (v61 + (0xffffffffffffffff ^ v61 * 2) | ~v58);
    v63 = v62 + 3;
    v64 = v62 + 4 + (v62 + 4 + ~v63 * 2 | 1);
    v0 = (v63 | 15) + (v63 & 15);
    v1 = (v64 | v63 | 1) + (v64 & (v63 | 1));
    v65 = (char)v1 + 1;
    v66 = v47 >> ((char)((v0 - v65 + (v0 + (v65 | ~v0) + (v65 & ~v0)) * 2 + 2 | 1) + (v0 - v65 & 1) - 2) & 63);
    v67 = v1;
    v68 = v0;
    v69 = v67 + ~v67 * 2 + 1;
    v70 = (v67 - v68 + (v68 | ~v67) ^ v68 + 1) + (v67 - v68 + (v68 | ~v67) & v68 + 1) * 2;
    v71 = (-v70 ^ (v69 & v68) + v67) + (v69 + v67 + (v68 | ~v69) + 1 ^ (v67 | ~v68) + v68) + ((v67 | ~v68) + v68 - (v69 + v67 + (v68 | ~v69)) + (v69 & v68) + v67 + (v69 + v67 + (v68 | ~v69) + 1 | ~((v67 | ~v68) + v68)) - v70 - (-v70 | (v69 & v68) + v67)) * 2;
    v0 = (39324 & ~v71) + (39324 | ~v71);
    v1 = ((52424 & ~v71 * 2) - v71 + (52424 & ~v71 * 2 ^ 52424) + 0xffffffffffff999b) * 3 + ~((52424 & ~v71 * 2) - v71 + (52424 & ~v71 * 2 ^ 52424) + 0xffffffffffff999b) * 2 + 1;
    v72 = ((unsigned int)v1 * 4 + (unsigned int)(v1 - (unsigned int)v1 * 4) + (unsigned int)v0 + 4 | 1) + ((unsigned int)(v1 - (unsigned int)v1 * 4) + (unsigned int)v0 & 1) - 4;
    g_f048f4 = ((unsigned short)((v72 | 1) + (v72 & 1) - 1) ^ (unsigned short)v66) + (unsigned short)~((v72 | 1) + (v72 & 1) - 2 | v66) + ((unsigned short)((v72 | 1) + (v72 & 1) - 1) & (unsigned short)v66) * 2;
    v73 = v1;
    v74 = v0;
    v75 = v74 | v73;
    v76 = ((v74 | ~v73) ^ v73 + 1) + ((v74 | ~v73) & v73 + 1) * 2;
    v77 = v76 + v75 + (-v76 & ~v75) * 2 + (v75 - (v76 + (v75 | -v76))) * 2;
    v78 = v75 + ~((v74 + ~v74 * 2 + 1 | v73) + v74);
    v79 = v78 + 0x7fffffffffffffff;
    v80 = v77 + v78 + ((v77 & v79) - (v77 + v78)) * 2;
    v81 = (v77 - v78 + (v79 & ~v77)) * 2;
    v82 = v81 + v80 + (v80 & 0xfffffffffffffffd - v81) + (v81 + 2 | ~v80);
    v83 = v82 + 3;
    v84 = v82 + 4;
    v0 = (v83 ^ 18) + (v84 + (18 | ~v83)) * 2 - 1;
    v1 = (v83 | 0xfffffffffffffffe) + (v83 + ((0xffffffff ^ (unsigned int)v83 * 2) & 32) + (v84 + (~v83 | 16)) * 2 - 16 | 1);
    v85 = v47 >> ((char)v1 + v0 & 63);
    v86 = v1;
    v87 = v0;
    v88 = v87 | v86;
    v89 = (v87 - v86 + (v86 | ~v87) ^ v86 + ~v86 * 2) - (v87 - v86 + (v86 | ~v87) & v86 + 1) * 2 + v88;
    v90 = (v87 + v86 ^ -v88) + (v87 + v86 & -v88) * 2;
    v91 = v88 + v90 + (-v90 & ~v88) * 2 + (v88 - (v90 + (v88 | -v90))) * 2;
    v92 = (v91 - v89 + (-v91 | v89 + 1) * 2 - 1 ^ (0xffffffffffffffff ^ (-v91 & v89 + 1) * 2) + (-v91 & v89 + 1) * 4 + 2) + (v91 - v89 + (-v91 | v89 + 1) * 2 - 1 & (0xffffffffffffffff ^ (-v91 & v89 + 1) * 2) + (-v91 & v89 + 1) * 4 + 2) * 2;
    v93 = -v92;
    v94 = ((v93 | 49692) ^ v92) + ((v93 | 49692) & v92) * 2;
    v0 = v92 + (v92 - 1 & 15843) + (v92 + 15842 ^ -(v92 - 1 | 15843)) - (0xffffffffffff8439 | (v92 - 1) * 2) + (v92 + 15842 & -(v92 - 1 | 15843)) * 2 + 0xffffffffffffc21b;
    v1 = (v93 | 0xffffffffffff3de3) + v92 + v94 + (0xffffffffffff3de3 - ((v93 | 0xffffffffffff3de3) + v92) | ~v94) + (v94 & (v93 | 0xffffffffffff3de3) + v92 + 49692) + 49693;
    v95 = (unsigned int)v0 + ~(unsigned int)v1 + ((unsigned int)v1 + 1 & ~(unsigned int)v0) * 2 + ((unsigned int)v0 + ((unsigned int)v1 + 1 | ~(unsigned int)v0)) * 2 + 2;
    v96 = v95 * 3 + ~v95 * 2;
    v97 = v96 + 1;
    v98 = (v85 & (unsigned int)(0xfffffffe - v96)) + v97 + (v97 & v85);
    g_f048f6 = ((unsigned short)v98 ^ (unsigned short)-(v97 | v85)) + ((unsigned short)v98 + ((unsigned short)-(v97 | v85) | (unsigned short)~v98)) * 2 + 2;
    v99 = v1;
    v100 = v0;
    v101 = (v99 ^ 1) + ~v99 * 2 + ((v99 * 2 | v99 >> 63) & 2 & 3);
    v102 = (((v101 + v100 & -(v101 | v100)) * 4 + (v101 + v100 ^ -(v101 | v100)) * 2 | 1) ^ (v99 ^ -v100) + (v99 + (-v100 | ~v99)) * 2 + 2) + (((v101 + v100 & -(v101 | v100)) * 4 + (v101 + v100 ^ -(v101 | v100)) * 2 | 1) & (v99 ^ -v100) + (v99 + (-v100 | ~v99)) * 2 + 2) * 2;
    v103 = v100 + 1;
    v104 = v103 + ~v100 * 2;
    v105 = v104 | v99;
    v106 = v104 + v100 + (v99 | ~v104) + (v105 ^ 0xfffffffffffffffe - v100);
    v107 = (~v102 + v102 * 2 ^ (v105 & v103) * 2 - v106 - 2) + (~v102 + v102 * 2 & (v105 & v103) * 2 - v106 - 2) * 2;
    v108 = ((0xffffffffffffffd4 - (v107 & 0xffffffffffffffd3) ^ v107 + 44) + (0xffffffffffffffd4 - (v107 & 0xffffffffffffffd3) & v107 + 44) * 2 ^ (v107 | 44) + 1) + ((0xffffffffffffffd4 - (v107 & 0xffffffffffffffd3) ^ v107 + 44) + (0xffffffffffffffd4 - (v107 & 0xffffffffffffffd3) & v107 + 44) * 2 & (v107 | 44) + 1) * 2;
    v0 = v107 + 4;
    v1 = ~v108 + v108 * 2;
    g_f048f8 = v47 >> ((char)(v0 + (v1 ^ 0xfffffffffffffffe) - ~v1 * 2 - ((v1 * 2 | v1 >> 63) & 2 & 3)) & 63);
    v109 = g_f048f0 + g_f048f2 + ~g_f048f2 * 2 + 2;
    v110 = (g_f048f2 + ~g_f048f0 + (g_f048f0 & ~g_f048f2)) * 2 + 3;
    g_f048f0 = (v109 ^ v110) + (v109 & v110) * 2 - 1;
    v111 = g_f048f4 + ~g_f048fa;
    v112 = g_f048fa - g_f048f4 - (g_f048fa | ~g_f048f4);
    v113 = g_f048fa - g_f048f4;
    g_f048fa = (v113 | (v112 & v111) * 4 + (v112 ^ v111) * 2) + ((v112 & v111) * 4 + (v112 ^ v111) * 2 & v113);
    v114 = g_f048fc | g_f048f6;
    v115 = g_f048f6 & g_f048fc;
    g_f048fc = (v114 ^ (unsigned short)-v115) + (unsigned short)(v114 - v115 - (v114 | -v115)) * 2;
    v116 = g_f048f8 | g_f048fe;
    v117 = -g_f048fe;
    g_f048fe = g_f048fe - g_f048f8 + (v116 ^ v117) * 2 + (v116 & v117) * 4;
    v118 = v47 - g_f04900 + (g_f04900 | ~v47);
    g_f04900 = v47 + v53 + (g_f04900 | ~v53) + (v118 ^ g_f04900 + ~g_f04900 * 2) - (v118 & g_f04900 + 1) * 2 + 2;
    v119 = v1;
    v120 = v0;
    v121 = v119 + 1;
    v122 = v121 + ~v119 * 2;
    v123 = (v119 ^ -v120) + ((-v120 | ~v119) + v121) * 2;
    v124 = (v122 + v120 & -(v122 | v120)) * 4 + (v122 + v120 ^ -(v122 | v120)) * 2 | 1;
    v125 = (v124 ^ v123) + (v124 & v123) * 2;
    v126 = v125 - 1;
    v127 = -v125;
    v128 = (v125 + v119 + (v122 | v127) ^ -(v126 & v119)) + (v125 + v119 + (v122 | v127) + (-(v126 & v119) | ~(v125 + v119 + (v122 | v127)))) * 2 + 2;
    v129 = (v126 | v120) - ((v120 | v127) & v125) * 2 + (v126 - v125 * 2 ^ (v120 | v127));
    v130 = v129 + 1;
    v131 = v128 + ~v128 * 2;
    v132 = v131 + 1;
    v133 = v131 + 2;
    v134 = (v129 ^ ~v128) + (v128 & ~v129) * 2;
    v135 = ((v130 | ~v132) & v133) * 4 + ((v130 | ~v132) ^ v133) * 2 | 1;
    v136 = (v135 ^ v134) + (v135 & v134) * 2;
    v137 = v130 + v128;
    v138 = v133 + v137 + ((unsigned int)(0xfffffffe - v129) & ~v132);
    v139 = (v137 ^ -(v130 | v128)) + (v137 & -(v130 | v128)) * 2;
    v140 = v139 + v138;
    v141 = v140 + (v138 + (-v139 | ~v138) + (-v139 & ~v138)) * 2 + 2;
    v142 = (v141 ^ 1) + (__ROL__(v140, 1) & 2 & 3) + ~v141 * 2;
    return v136 + v142 + (v142 | -v136) + (~v136 + v136 * 2 & ~v142) + 1;
}
