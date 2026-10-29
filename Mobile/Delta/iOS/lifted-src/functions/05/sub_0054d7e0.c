/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54d7e0..0x54e6d4 (3828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54d7e0_1 {
    char padding_0[31494449];
    unsigned short field_1e09131;
} st_54d7e0_1;

typedef struct st_54d7e0_0 {
    char field_0;
} st_54d7e0_0;

extern unsigned short g_f04898;
extern unsigned short g_f0489a;
extern unsigned short g_f0489c;
extern unsigned short g_f0489e;
extern unsigned long long g_f048a0;
extern unsigned short g_f12162;
extern unsigned short g_f12164;
extern unsigned short g_f12166;
extern unsigned short g_f12168;

int sub_54d7e0(void)
{
    st_54d7e0_0 *v4;  // x8
    st_54d7e0_0 **v5;  // x9
    unsigned long long v14;  // x9
    unsigned long long v104;  // x0
    unsigned long long v105;  // x17
    unsigned int v106;  // w17
    unsigned long long v107;  // x17
    unsigned long long v108;  // x0
    unsigned long long v109;  // x3
    unsigned long long v110;  // x1
    unsigned long long v111;  // x4
    unsigned long long v112;  // x1
    unsigned long long v113;  // x17
    unsigned long long v15;  // x11
    unsigned long long v114;  // x17
    unsigned long long v115;  // x0
    unsigned long long v116;  // x15
    unsigned long long v117;  // x10
    unsigned short v119;  // x17
    unsigned int v120;  // w0
    unsigned int v121;  // w1
    unsigned int v122;  // w0
    unsigned long v16;  // x8
    unsigned short v124;  // x16
    unsigned short v125;  // x17
    unsigned int v126;  // w14
    unsigned int v127;  // w10
    unsigned long long v128;  // x12
    unsigned long long v129;  // x9
    unsigned long long v130;  // x10
    unsigned int v131;  // w8
    unsigned int v132;  // w10
    unsigned int v133;  // w11
    char v17;  // x10
    unsigned int v134;  // w12
    unsigned int v135;  // w8
    unsigned int v136;  // w9
    unsigned int v137;  // w8
    unsigned int v138;  // w9
    unsigned int v139;  // w10
    unsigned int v140;  // w13
    unsigned int v141;  // w11
    unsigned int v142;  // w8
    unsigned int v143;  // w15
    unsigned long long v18;  // x9
    unsigned int v144;  // w8
    unsigned int v145;  // w11
    unsigned int v146;  // w9
    unsigned int v147;  // w13
    unsigned int v148;  // w9
    unsigned int v149;  // w10
    unsigned int v150;  // w8
    unsigned int v151;  // w9
    st_54d7e0_1 *v19;  // x11
    unsigned long v20;  // x10
    unsigned long v21;  // x11
    unsigned long long v22;  // x14
    unsigned long long v23;  // x14
    unsigned long long v6;  // x10
    unsigned long long v24;  // x14
    unsigned long long v25;  // x13
    unsigned long long v26;  // x11
    unsigned long long v27;  // x10
    unsigned long long v28;  // x11
    unsigned long long v29;  // x15
    unsigned long long v30;  // x10
    unsigned long long v31;  // x10
    unsigned long long v32;  // x11
    unsigned long long v33;  // x9
    unsigned long long v7;  // x12
    unsigned long v34;  // x10
    unsigned long v35;  // x13
    unsigned long long v36;  // x15
    unsigned long long v37;  // x16
    unsigned long long v38;  // x14
    unsigned long long v39;  // x9
    unsigned long long v40;  // x9
    unsigned long long v41;  // x13
    unsigned long long v42;  // x15
    unsigned long long v43;  // x16
    unsigned long long v8;  // x11
    unsigned long long v44;  // x9
    unsigned long long v45;  // x13
    unsigned long long v46;  // x13
    unsigned long long v47;  // x9
    st_54d7e0_0 *v48;  // x14
    st_54d7e0_0 **v49;  // x16
    unsigned long long v50;  // x14
    unsigned long long v51;  // x14
    unsigned long long v52;  // x15
    unsigned long long v53;  // x16
    unsigned long long v9;  // x8
    unsigned long long v54;  // x14
    unsigned int v55;  // w14
    unsigned int v56;  // w13
    unsigned int v57;  // w14
    unsigned long long v58;  // x11
    unsigned long v59;  // x13
    unsigned long long v60;  // x15
    unsigned long long v61;  // x17
    unsigned long long v62;  // x15
    unsigned long long v63;  // x0
    unsigned long v10;  // x9
    unsigned long long v64;  // x1
    unsigned long long v65;  // x13
    unsigned long long v66;  // x13
    unsigned long long v67;  // x13
    unsigned int v68;  // w16
    unsigned long long v69;  // x17
    unsigned long long v70;  // x0
    unsigned long long v71;  // x1
    unsigned long long v72;  // x1
    unsigned long long v73;  // x2
    unsigned long long v11;  // x8
    unsigned long long v74;  // x0
    unsigned long long v75;  // x17
    unsigned long long v76;  // x17
    unsigned long long v77;  // x17
    unsigned long long v78;  // x0
    unsigned long long v79;  // x1
    unsigned long long v80;  // x2
    unsigned long long v81;  // x2
    unsigned long v82;  // x17
    unsigned long v83;  // x1
    unsigned long long v12;  // x8
    unsigned long v84;  // x4
    unsigned long long v85;  // x3
    unsigned long long v86;  // x2
    unsigned long long v87;  // x17
    unsigned long long v88;  // x17
    unsigned long long v89;  // x0
    unsigned long long v90;  // x12
    char v91;  // x17
    unsigned int v92;  // w12
    unsigned long v93;  // x17
    unsigned long long v13;  // x8
    unsigned long v94;  // x0
    unsigned long long v95;  // x1
    unsigned long long v96;  // x2
    unsigned long long v97;  // x3
    unsigned long long v98;  // x0
    unsigned long long v99;  // x17
    unsigned long long v100;  // x4
    unsigned long long v101;  // x6
    unsigned long long v102;  // x0
    unsigned long long v103;  // x17
    st_54d7e0_0 **v0;  // [bp-0x30], Other Possible Types: unsigned long long, char
    st_54d7e0_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long, unsigned long long
    st_54d7e0_0 **v2;  // [bp-0x20], Other Possible Types: unsigned long long, char
    st_54d7e0_0 *v3;  // [bp-0x18], Other Possible Types: unsigned long, unsigned long long

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
    v18 = 15747224 >> ((char)v3 + (char)v16 * 2 + (v17 | (char)v3) + ((char)v3 + (char)~v3 * 2 + 1 | v17) + 2 & 63);
    v19 = (char *)&g_f04898 + 0x2 * ~&g_f04898 + 1;
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
    v32 = ((-v18 ^ 15747224) + (&v19->padding_0[v18] & -(v18 | v19)) * 4 + ((char *)&g_f04898 - v18 - (-v18 | 15747224) + (&v19->padding_0[v18] ^ -(v18 | v19))) * 2) * (~v31 + v31 * 2);
    v33 = v3;
    v34 = v2;
    v35 = -v34;
    v36 = v34 - v33;
    v37 = -(v36 + (v33 | ~v34));
    v38 = v33 + v34 + (v33 - v34 - (v33 | v35)) * 2 + (v34 + ~v33 & v37) * 4 + ((v34 + ~v33 ^ v37) + (v35 & ~v33)) * 2;
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
    v48 = v1;
    v49 = v0;
    v50 = (v49 ^ -v48) + (v49 - v48 - (v49 | -v48)) * 2 + ((v49 | v48) ^ -v49) * 2 + ((v49 | v48) & -v49) * 4;
    v51 = ((v50 - 1 & (v49 ^ v48)) - (v50 + 1) + 1 ^ (v50 - 1 & (v49 ^ v48)) - (v49 ^ v48)) + ((v49 ^ v48) - (v50 + 1) + (v50 - 1 & (v49 ^ v48) + (v49 ^ ~v48) * 2 + 1) + ((v50 - 1 & (v49 ^ v48)) - (v50 + 1) + 1 & (v50 - 1 & (v49 ^ v48)) - (v49 ^ v48))) * 2;
    v52 = v51 + 4;
    v53 = v52 | 1167;
    v54 = (v51 + 1171 ^ -v53) + (v51 + 1171 & -v53) * 2;
    v0 = (v54 | v53) + (v54 & v53);
    v1 = (128738 & v52 * 2) + v52 + (128738 & v52 * 2 ^ 128738) + 0xffffffffffff048e;
    v55 = ((unsigned int)((v0 & 0xffffffff) - ((unsigned int)v1 + 1)) | 0xfffffffe) + ((unsigned int)((v0 & 0xffffffff) - ((unsigned int)v1 + 1)) + (((unsigned int)v1 + 1 & (unsigned int)v0) + ((unsigned int)v1 + 1 & ~(unsigned int)v0)) * 2 | 1);
    v56 = (unsigned int)v46 ^ (unsigned int)~v32;
    v57 = (unsigned int)v47 * 3 + v56 * 4 + 3 - v55 + (v55 & (unsigned int)v47 * 3 + v56 * 4 + 3) + (v55 & (unsigned int)(0xfffffffc - ((unsigned int)v47 * 3 + v56 * 4))) * 2;
    v58 = v47 + 1;
    g_f12162 = (unsigned short)v58 + (unsigned short)v56 * 2 + (unsigned short)v57 + ((unsigned short)-((unsigned int)v58 + v56 * 2) & (unsigned short)~v57) * 2 + (unsigned short)(v57 - ((unsigned int)v58 + v56 * 2) - (v57 | -((unsigned int)v58 + v56 * 2))) * 2;
    v59 = v1;
    v60 = v0;
    v61 = v59 | v60;
    v62 = v60 & v59;
    v63 = -v62;
    v64 = v61 + v62 + (v63 & ~v61) * 2 + (v61 - v62 - (v61 | v63)) * 2;
    v65 = 0xfffffffffffffffc - (((~v60 & ~v59) + v61 * 2 + 1 ^ v63) + ((~v60 & ~v59) + v61 * 2 + (0xfffffffffffffffe - ((~v60 & ~v59) + v61 * 2) | v63)) * 2);
    v66 = (v65 ^ v64 | 0xfffffffffffffffe) + (-((v65 ^ v64) + (v65 & v64) * 2) | 1) + ((v65 ^ v64) + (v65 & v64) * 2) * 2;
    v0 = v66 + 3;
    v1 = v66 + 15;
    v67 = ((v1 + v0 ^ -(v1 | v0)) + (v1 + v0 & -(v1 | v0)) * 2 ^ (~v0 & ~v1) + (v1 | v0) * 2 + 2) + ((v1 + v0 ^ -(v1 | v0)) + (v1 + v0 & -(v1 | v0)) * 2 & (~v0 & ~v1) + (v1 | v0) * 2 + 2) * 2;
    v68 = v47 >> ((char)~v67 + (char)v67 * 2 & 63);
    v69 = v1;
    v70 = v0;
    v71 = (v69 + (0xffffffffffffffff ^ v69 * 2) & v70) * 2;
    v72 = v69 - v70 + v71 + (v69 - v70 & ~v71) + (v71 | ~(v69 - v70)) + 1;
    v73 = v70 + ~v70 * 2 + 1 + ~(v70 + ~v70 * 2 + 1) * 2;
    v74 = ((v73 + 1 | v69) & ~v73) * 4 + (v73 ^ ~(v73 + 1 | v69)) * 2 | 1;
    v75 = (v74 ^ v70 - v69) + (v74 & v70 - v69) * 2 - ((v74 ^ v70 - v69) + (v74 & v70 - v69) * 2) * 2 + 1;
    v76 = (v75 ^ v72) + (v75 & v72) * 2 - 1;
    v77 = (v76 * 2 & 4) + (v76 ^ 2);
    v78 = v77 - 1;
    v79 = v77 + 8694 + (-(unsigned int)v77 | 0xffffffffffffde09);
    v80 = (unsigned int)v77 - 1 | 0xffffffffffff21f6;
    v81 = (v80 - v77 + 56842 ^ v77) + (v80 - v77 + 56842 & v77) * 2;
    v0 = (v78 & 8694) + (v79 | ~(v78 & 8694)) + (v78 & 8694 | v79) + 1;
    v1 = (v81 ^ v77 - (v78 & 56841) + 56841) + (v81 & v77 - (v78 & 56841) + 56841) * 2 - 1;
    g_f12164 = (unsigned short)v68 + ((unsigned short)(v0 + (unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffe) - ((unsigned int)v1 * 2 & 2)) + 2 | (unsigned short)~v68) + 1;
    v82 = v1;
    v83 = v0;
    v84 = ~v83;
    v85 = v83 + v82 + 1;
    v86 = v85 + v84 * 2 + ((v82 + (0xffffffffffffffff ^ v82 * 2) + v83 & -(v82 + (0xffffffffffffffff ^ v82 * 2) | v83)) * 4 + (v82 + (0xffffffffffffffff ^ v82 * 2) + v83 ^ -(v82 + (0xffffffffffffffff ^ v82 * 2) | v83)) * 2 | 0xfffffffffffffffe - (v85 + v84 * 2)) + ((v82 + (0xffffffffffffffff ^ v82 * 2) + v83 & -(v82 + (0xffffffffffffffff ^ v82 * 2) | v83)) * 4 + (v82 + (0xffffffffffffffff ^ v82 * 2) + v83 ^ -(v82 + (0xffffffffffffffff ^ v82 * 2) | v83)) * 2 | v85 + v84 * 2 + 1);
    v87 = v85 + (-v82 & ~v83) * 2 + (v83 - v82 - (v83 | -v82)) * 2 + (v83 * 2 + v84 * 4 + (v83 ^ 1) + (v83 * 2 & 2) + 2 & v82) * 2;
    v88 = v86 + 2 - v87 + (v86 + 3 & -v87 - (1 - v87 | v86 + 2)) * 4 + ((v86 + 3 ^ -v87 - (1 - v87 | v86 + 2)) - (1 - v87 & v86 + 2)) * 2 + 1;
    v89 = (v88 ^ 32) + (v88 + (~v88 | 32)) * 2 + 2;
    v0 = v89 * 3 + ~v89 * 2 + 1;
    v1 = v88 + v88 - (v88 | 1) + (0xfffffffffffffffe - (v88 - (v88 | 1)) | v88 | 1) - (v88 - (v88 | 1) + 1 & (v88 | 1)) + 3;
    v90 = v1 | v0;
    v91 = ((char)v1 + v0 ^ (char)-v90) + ((char)v1 + v0 & (char)-v90) * 2;
    v92 = v47 >> ((char)((v91 ^ v90 + 1) + (v91 & v90 + 1) * 2 - 1) & 63);
    v93 = v1;
    v94 = v0;
    v95 = v93 + 1 + v94 + (v94 + ~v94 * 2 + 1 | v93 + 1 + ~v93 * 2);
    v96 = (v93 | ~v94) + v94;
    v97 = v95 + ~v96;
    v98 = (0xffffffffffffffff ^ (v93 & ~v94) * 2) + (v93 & ~v94) * 4 + 2;
    v99 = ~((v98 ^ v94 - v93) + (v98 & v94 - v93) * 2) + ((v98 ^ v94 - v93) + (v98 & v94 - v93) * 2) * 2;
    v100 = v99 - 1;
    v101 = v96 - v95;
    v102 = ((v100 & v97) - v99 ^ v96 - v95 - (v101 | -v99)) + ((v100 & v97) - v99 & v96 - v95 - (v101 | -v99)) * 2;
    v103 = v102 + ((~(v97 - v99) - (v100 | v101) & v97 - v99) * 4 + (~(v97 - v99) - (v100 | v101) ^ v97 - v99) * 2 | ~v102) + (v102 | (~(v97 - v99) - (v100 | v101) & v97 - v99) * 4 + (~(v97 - v99) - (v100 | v101) ^ v97 - v99) * 2);
    v104 = v103 + 1;
    v105 = (((65043 | ~v104) ^ v103 + 2) + ((65043 | ~v104) & v103 + 2) * 2 ^ (v104 | 65043) + 1) + (((65043 | ~v104) ^ v103 + 2) + ((65043 | ~v104) & v103 + 2) * 2 & (v104 | 65043) + 1) * 2;
    v0 = ~v105 + v105 * 2;
    v1 = (0xfffffffffffffe13 & ~v104) + v104 * 2 + (v104 & 492) + (~((unsigned int)v104 * 2) & 984) + 1;
    v106 = (unsigned int)v0 + ((unsigned int)v1 ^ 0xfffffffe) - ~(unsigned int)v1 * 2 - (__ROL__((unsigned int)v1, 1) & 2 & 3);
    g_f12166 = ((unsigned short)v106 | (unsigned short)v92) + ((unsigned short)v106 + 1 ^ (unsigned short)v92) + (((unsigned short)v106 + 1 & (unsigned short)v92) + (unsigned short)~(v106 | v92)) * 2 + 1;
    v107 = v1;
    v108 = v0;
    v109 = v107 + 1;
    v110 = v108 + v109 + (v108 + ~v108 * 2 + 1 | ~v107);
    v111 = (v108 + v107 ^ -(v107 | v108)) + (v108 + v107 & -(v107 | v108)) * 2;
    v112 = v111 + v110 + (-v111 & ~v110) * 2 + (v110 - v111 - (v110 | -v111)) * 2;
    v113 = v109 + ~v107 * 2 - (v108 | ~v107) + (v108 | ~(v109 + ~v107 * 2));
    v114 = ~(v112 + v113) + (v112 & v113 + 0x7fffffffffffffff) * 2 + ((v112 | v113 + 0x7fffffffffffffff) - v113) * 2;
    v115 = v114 + 3;
    v116 = ((0xfffffffffffffffc - v114 | 41) ^ v114 + 4) + ((0xfffffffffffffffc - v114 | 41) & v114 + 4) * 2;
    v117 = ((0xffffffff ^ (unsigned int)v115 * 2) & 82) + (v115 & 41) + v114 - 37;
    v0 = (v117 ^ v116) + (v117 & v116) * 2 - 1;
    v1 = (v114 + 9 | 1) + (v115 & 1);
    g_f12168 = v47 >> ((char)(v0 - v1 + ((char)v1 + 1 & v0) * 2 + ((char)v1 + 1 & ~v0) * 2 - 2) & 63);
    v119 = -g_f12162;
    v120 = g_f04898 + ~g_f04898 * 2;
    v121 = g_f12162 | ~(v120 + 1);
    v122 = (v121 & v120 + 2) * 4 + (v121 ^ v120 + 2) * 2;
    g_f04898 = g_f04898 + g_f12162 + ((unsigned short)(g_f04898 - g_f12162 - (v119 | g_f04898)) + (v119 & ~g_f04898)) * 2 + (unsigned short)~v122 + (unsigned short)v122 * 2 + 1;
    v124 = g_f0489a + 1;
    v125 = g_f12164 | ~g_f0489a;
    g_f0489a = v124 + g_f12164 + (v125 ^ (unsigned int)(0xfffe - g_f0489a)) - ((g_f12164 & g_f0489a) + (v125 & v124) * 2);
    g_f0489c = g_f12166 ^ g_f0489c;
    v126 = (g_f12168 + ~g_f12168 * 2 + 1 & g_f0489e) + g_f12168;
    v127 = (g_f0489e + ~g_f0489e * 2 + 1 | g_f12168) + g_f0489e;
    g_f0489e = (unsigned short)v127 + (unsigned short)v126 + ((unsigned short)v126 & (unsigned short)~v127) * 2 + ((unsigned short)~v126 & (unsigned short)~v127) * 2 + 1;
    v128 = (g_f048a0 ^ 1) + ~g_f048a0 * 2 + ((g_f048a0 * 2 | g_f048a0 >> 63) & 2 & 3);
    v129 = g_f048a0 + v47 + (-v47 & ~g_f048a0) * 2 + (g_f048a0 + (-v47 | ~g_f048a0)) * 2 + 2;
    v130 = (0xffffffffffffffff ^ (v58 + v128 + (~v128 & ~v47)) * 2) + (v58 + v128 + (~v128 & ~v47)) * 4 + 2;
    g_f048a0 = (v130 ^ v129) + (v130 & v129) * 2 - 1;
    v131 = v1;
    v132 = *(unsigned int *)&v0;
    v133 = v131 - v132 + (v132 & ~v131) * 2;
    v134 = (v133 ^ 1) + v133 * 2 + ~v133 * 4 + (v133 * 2 & 2) + 2;
    v135 = v133 + v131 + (-v131 & ~v133) * 2 + (unsigned int)(v133 - v131 - (v133 | -v131)) * 2;
    v136 = (v134 + v131 + (v134 + ~v134 * 2 + 1 & ~v131)) * 2;
    v137 = v135 + v136 + 2 + ((unsigned int)(0xfffffffd - v136) | ~v135) + (v136 + 2 & v135);
    v138 = v137 + 1;
    v139 = (v133 | v132) - (v133 & v132);
    v140 = v138 | v139;
    v141 = v138 + v139 + (-v139 & ~v138) * 2 + (unsigned int)(v138 - v139 - (v138 | -v139)) * 2;
    v142 = (v140 & ~v137) * 4 + (v137 ^ ~v140) * 2 | 1;
    v143 = v142 ^ v141;
    v144 = v142 & v141;
    v145 = v143 + v144 * 2;
    v146 = v140 + ~((v138 | v139 + ~v139 * 2 + 1) + v139);
    v147 = v146 - 1;
    v148 = v145 - v146;
    v149 = (v148 + (v147 | -v145) ^ -v145 - (-v145 | -v146)) + (v148 + (v147 | -v145) & -v145 - (-v145 | -v146)) * 2;
    v150 = v143 + (v144 - v145) * 2;
    v151 = (v148 + v150 + (v147 | ~v150)) * 2 + 2;
    return v149 + v151 + ((unsigned int)(0xfffffffd - (v148 + v150 + (v147 | ~v150)) * 2) | ~v149) + (v151 & v149) + 1;
}
