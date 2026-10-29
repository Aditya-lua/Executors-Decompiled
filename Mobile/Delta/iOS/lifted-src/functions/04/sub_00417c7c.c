/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x417c7c..0x4187a0 (2852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_417c7c_0 {
    char field_0;
} st_417c7c_0;

extern unsigned short g_f04510;
extern unsigned short g_f04512;
extern unsigned short g_f04514;
extern unsigned short g_f04516;
extern unsigned long long g_f04518;
extern unsigned short g_f12058;
extern unsigned short g_f1205a;
extern unsigned short g_f1205c;
extern unsigned short g_f1205e;

int sub_417c7c(void)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x10
    unsigned long long v14;  // x0
    unsigned int v104;  // w14
    unsigned int v105;  // w10
    unsigned int v106;  // w11
    unsigned short v107;  // x12
    unsigned long long v108;  // x11
    unsigned long v109;  // x8
    unsigned int v110;  // w8
    unsigned int v111;  // w9
    unsigned int v112;  // w10
    unsigned int v113;  // w11
    unsigned long long v15;  // x13
    unsigned int v114;  // w10
    unsigned int v115;  // w8
    unsigned int v116;  // w11
    unsigned int v117;  // w9
    unsigned int v118;  // w11
    unsigned int v119;  // w10
    unsigned int v120;  // w8
    unsigned int v121;  // w8
    unsigned long long v16;  // x15
    unsigned long long v17;  // x13
    unsigned long long v18;  // x14
    unsigned long long v19;  // x11
    unsigned long v20;  // x12
    unsigned long long v21;  // x11
    unsigned long long v22;  // x14
    unsigned long long v23;  // x12
    unsigned long long v6;  // x11
    unsigned long long v24;  // x11
    unsigned int v25;  // w11
    unsigned long long v26;  // x11
    unsigned long long v27;  // x12
    unsigned long long v28;  // x13
    unsigned long long v29;  // x14
    unsigned long long v30;  // x14
    unsigned long long v31;  // x11
    unsigned long long v32;  // x13
    unsigned long long v33;  // x14
    unsigned long long v7;  // x8
    unsigned long long v34;  // x11
    unsigned long long v35;  // x11
    unsigned long long v36;  // x12
    unsigned long long v37;  // x11
    unsigned long long v38;  // x12
    unsigned long long v39;  // x14
    unsigned long long v40;  // x11
    unsigned long long v41;  // x11
    unsigned int v42;  // w11
    unsigned long long v43;  // x12
    unsigned long long v8;  // x10
    unsigned long long v44;  // x15
    unsigned long long v45;  // x16
    unsigned long long v46;  // x13
    unsigned long long v47;  // x16
    unsigned long long v48;  // x16
    unsigned long long v49;  // x12
    unsigned long long v50;  // x12
    unsigned long long v51;  // x14
    unsigned long long v52;  // x15
    unsigned long long v53;  // x12
    unsigned long long v9;  // x8
    unsigned long v54;  // x14
    unsigned int v55;  // w14
    unsigned int v56;  // w14
    unsigned long long v57;  // x14
    unsigned long long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x0
    unsigned long long v61;  // x14
    unsigned long long v62;  // x15
    unsigned long long v63;  // x14
    st_417c7c_0 *v10;  // x11
    unsigned long long v64;  // x15
    unsigned long long v65;  // x16
    unsigned long long v66;  // x13
    unsigned long long v67;  // x13
    unsigned long long v68;  // x14
    unsigned int v69;  // w13
    unsigned long long v70;  // x14
    unsigned long v71;  // x15
    unsigned long long v72;  // x2
    unsigned long long v73;  // x14
    st_417c7c_0 **v11;  // x12
    unsigned long long v74;  // x14
    unsigned long long v75;  // x15
    unsigned long long v76;  // x16
    unsigned long long v77;  // x1
    unsigned int v78;  // w13
    unsigned int v79;  // w15
    unsigned int v80;  // w13
    unsigned int v81;  // w12
    unsigned long v82;  // x13
    unsigned long v83;  // x14
    st_417c7c_0 *v12;  // x14
    unsigned long long v84;  // x15
    unsigned long long v85;  // x13
    unsigned long long v86;  // x17
    unsigned long long v87;  // x13
    unsigned long long v88;  // x13
    unsigned long long v89;  // x15
    unsigned short v91;  // x17
    unsigned short v92;  // x15
    unsigned int v93;  // w16
    unsigned long long v13;  // x17
    unsigned int v94;  // w10
    unsigned short v95;  // x14
    unsigned int v96;  // w15
    unsigned int v97;  // w14
    unsigned short v98;  // x16
    unsigned short v99;  // x14
    unsigned short v100;  // x11
    unsigned short v101;  // x10
    unsigned short v102;  // x11
    unsigned int v103;  // w12
    st_417c7c_0 **v2;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_417c7c_0 *v3;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v3 = &v2;
    v2 = &v3;
    v4 = 0xff51afd7ed558ccd * ((char *)&g_f04510 + ~(~&g_f04510 + &g_f04510));
    v5 = v4 >> 29;
    v6 = v4 | v5;
    v7 = ~v4 - (v5 | ~v4);
    v8 = v6 ^ v7;
    v9 = v8 + (v6 & v7) * 2;
    v10 = v3;
    v11 = v2;
    v12 = ~v10;
    v13 = v11 + v10;
    v14 = v13 + 1;
    v15 = v14 + (-v11 & ~v10) * 2 + (v10 - v11 - (v10 | -v11)) * 2;
    v16 = (v10 * 3 + v12 * 4 + 3 & v11) * 2;
    v17 = v16 + v15 + (v16 | -v15) + (v15 - 1 & ~v16);
    v18 = v14 + ((char *)v11 + 0x2 * ~v11 + 1 | (char *)v10 + 0x2 * v12 + 1);
    v19 = -((v13 ^ -(v11 | v10)) + (v13 & -(v11 | v10)) * 2);
    v20 = v19 ^ v18;
    v21 = v19 & v18;
    v22 = v20 + v21 * 2;
    v23 = v22 + ~v22 * 2 + 2;
    v24 = (((v23 + v17 & -(v23 | v17)) * 4 + (v23 + v17 ^ -(v23 | v17)) * 2 | 1) ^ v17 - (v20 + (v21 + (v17 & -v22)) * 2)) + (((v23 + v17 & -(v23 | v17)) * 4 + (v23 + v17 ^ -(v23 | v17)) * 2 | 1) & v17 - (v20 + (v21 + (v17 & -v22)) * 2)) * 2;
    v2 = ~((v24 - 1 | 1) + (v24 - 1 & 1) + 55430) + ((v24 - 1 | 1) + (v24 - 1 & 1) + 55430) * 2;
    v3 = v24 + 10104;
    v25 = (unsigned int)v2 + 1 + (unsigned int)v2 + 1 + ~(unsigned int)v2 * 2 + ((unsigned int)v3 + (unsigned int)v2 ^ -((unsigned int)v3 | (unsigned int)v2)) + ((unsigned int)v3 | ~((unsigned int)v2 + 1 + ~(unsigned int)v2 * 2)) + ((unsigned int)v3 + (unsigned int)v2 & -((unsigned int)v3 | (unsigned int)v2)) * 2;
    g_f12058 = ((unsigned int)v9 ^ 0xfffe) + 0xfffd * (unsigned int)v9 - (__ROL__((unsigned int)v8, 1) & 2 & 3 | (unsigned int)~v9 * 4) + v25 + ((unsigned short)v25 + (unsigned short)~v25 * 2 + 1 | (unsigned short)v9) - 1;
    v26 = v3;
    v27 = v2;
    v28 = v27 + v26;
    v29 = v26 + ~v26 * 2 + 1;
    v30 = (v27 & v26) - v27 + v28 + v29 + ~(v27 & v26) * 2 + (v27 | ~v29);
    v31 = ((v27 | v26) - 1 ^ v28) - (v28 & -(v27 | v26)) * 2 + (v27 | v26);
    v32 = 0xfffffffffffffffc - v30;
    v33 = v30 + 4;
    v34 = v33 + v32 * 2 - v31 + (v31 | ~(v33 + v32 * 2));
    v35 = (((v34 & v33) * 4 + (v34 ^ v33) * 2 | 1) ^ (v31 + 1 ^ v30 + 3) + ((v32 & ~v31) + (v31 + 1 & v30 + 3)) * 2) + (((v34 & v33) * 4 + (v34 ^ v33) * 2 | 1) & (v31 + 1 ^ v30 + 3) + ((v32 & ~v31) + (v31 + 1 & v30 + 3)) * 2) * 2;
    v36 = ~v35 + v35 * 2;
    v2 = (v36 ^ 13) + ((-v35 | 13) + v35) * 2 - 1;
    v3 = (10 & v36 * 2) + v36 + (10 & v36 * 2 ^ 10) - 6;
    v37 = v2;
    v38 = v3;
    v39 = v37 + 1;
    v40 = v39 - v38 + (v38 & v37) + (v38 & ~v37) * 2;
    v41 = (v40 ^ v39 + (v39 + ~v37 * 2 | v38)) + (v40 & v39 + (v39 + ~v37 * 2 | v38)) * 2;
    v42 = v9 >> ((char)~v41 + (char)v41 * 2 & 63);
    v43 = v3;
    v44 = v2;
    v45 = v43 + 1;
    v46 = v45 + ~v43 * 2;
    v47 = ((v46 | v44) ^ v45) + ((v46 | v44) & v45) * 2;
    v48 = v46 + v43 + (v44 | ~v46) + v47 + (0x7ffffffffffffffe - (v46 + v43 + (v44 | ~v46)) & -v47) * 2 + (v46 + v43 + (v44 | ~v46) + 1 - v47 - (v46 + v43 + (v44 | ~v46) + 1 | -v47)) * 2;
    v49 = (v44 ^ -v43) + (v44 - v43 - (v44 | -v43)) * 2;
    v50 = v49 + (v43 & ~v44) * 2 + (v49 & ~((v43 & ~v44) * 2)) + ((v43 & ~v44) * 2 | ~v49);
    v51 = v50 + 1;
    v52 = v48 + v51 + 2;
    v53 = v52 + ((v48 + 1 & v50) - (v48 + 1 + v51)) * 2 + ((0xfffffffffffffffe - v48 | ~v50) + v48 + 1) * 2;
    v54 = v53 * 2 + 2;
    v2 = (v52 | 0xfffffffffffffffe) + (v53 + (v54 & 90194) + (v54 & 90194 ^ 90194) + 0xffffffffffff4fd8 | 1);
    v3 = ~(v53 + (v54 & 40880) + (v54 & 40880 ^ 40880) + 0xffffffffffffb029) + (v53 + (v54 & 40880) + (v54 & 40880 ^ 40880) + 0xffffffffffffb029) * 2;
    v55 = ((unsigned int)v3 | ~(unsigned int)v2) + (unsigned int)v2 + ((unsigned int)v3 ^ (unsigned int)v2) + ((unsigned int)v3 & (unsigned int)v2);
    v56 = v55 + (v42 + (0xffffffff ^ v42 * 2) & (unsigned int)(0xfffffffe - v55)) + 1;
    g_f1205a = (unsigned short)(v56 - v42) + ((unsigned short)v42 + 1 & (unsigned short)~v56) * 2 + ((unsigned short)v56 + ((unsigned short)v42 + 1 | (unsigned short)~v56)) * 2 + 1;
    v57 = v3;
    v58 = v2;
    v59 = ((v58 | v57) - 1 ^ v58 + v57) - (v58 + v57 & -(v58 | v57)) * 2 + (v58 | v57);
    v60 = v59 + 1;
    v61 = (v58 ^ -v57) + (v58 - v57 - (v58 | -v57)) * 2;
    v62 = (v58 + ~v58 * 2 + 1 & v57) * 2;
    v63 = v61 + (v62 | ~v61) + (v61 | v62);
    v64 = v63 + 1;
    v65 = v64 + v60;
    v66 = v65 + (0x7ffffffffffffffe - v59 & ~v63) * 2;
    v67 = (v66 | (v60 - v64 & -(v60 | ~v63)) * 4 + (v60 - v64 ^ -(v60 | ~v63)) * 2) + ((v60 - v64 & -(v60 | ~v63)) * 4 + (v60 - v64 ^ -(v60 | ~v63)) * 2 & v66);
    v2 = (v67 | 1) + (v65 & 1) + 6;
    v3 = (v67 ^ 26) + (v67 + (26 | ~v67)) * 2 + 1;
    v68 = (v3 ^ 1) + ~v3 * 2 + ((v3 * 2 | v3 >> 63) & 2 & 3);
    v69 = v9 >> (v2 + (char)v68 + (v2 + ((char)-v68 | ~v2) + ((char)-v68 & ~v2)) * 2 + 1 & 63);
    v70 = v3;
    v71 = v2;
    v72 = v70 + 1;
    v73 = v72 + v71 + v72 + ~v70 * 2 + ~(v72 + ~v70 * 2 | v71) + (v71 & v70) + ((v72 + ~v70 * 2 | v71) - (v72 + v71 + v72 + ~v70 * 2) & -(v71 & v70)) * 2 + (v72 + v71 + v72 + ~v70 * 2 + ~(v72 + ~v70 * 2 | v71) - (v71 & v70) - (v72 + v71 + v72 + ~v70 * 2 + ~(v72 + ~v70 * 2 | v71) | -(v71 & v70))) * 2;
    v74 = (v70 ^ -v71) + v73 + ~v73 * 4 + ((-v71 | ~v70) + v72 + (v71 & ~v70) + v73) * 2;
    v75 = v74 + 3;
    v76 = v74 + 4;
    v77 = 0xfffffffffffffffb - v74;
    v2 = (v76 | 1) + (v76 & 1) + (~(unsigned int)v76 | 0xffffffffffffe89b) + (0xffffffffffffe89a - v75 - (v77 | 0xffffffffffffe89b) ^ v74 + 5992) + (0xffffffffffffe89a - v75 - (v77 | 0xffffffffffffe89b) & v74 + 5992) * 2 + 5988;
    v3 = (v77 | 59547) + (v74 + 59551 ^ -(v76 | 59547)) + ((0xffffffff ^ (unsigned int)v76 * 2) & 119094) + ((v74 + 59551 & -(v76 | 59547)) + v75) * 2 + 0xffffffffffff1768;
    v78 = v69 * 2;
    v79 = (v78 & 2) + (v69 ^ 1);
    v80 = v78 + 2;
    v81 = v80 + ~v69 * 4 + v79 | ((v2 | (unsigned int)v3) + 1 ^ (unsigned int)v3 & v2) + ((v2 | (unsigned int)v3) + 1 & (unsigned int)v3 & v2) * 2 - 1;
    g_f1205c = ((unsigned short)v81 ^ (unsigned short)(v80 - v79)) + ((unsigned short)v81 + ((unsigned short)(v80 - v79) | (unsigned short)~v81)) * 2 + 2;
    v82 = v3;
    v83 = v2;
    v84 = ((((v83 | v82) & -v82) * 4 + ((v83 | v82) ^ -v82) * 2 | 1) ^ v82 - v83) + ((((v83 | v82) & -v82) * 4 + ((v83 | v82) ^ -v82) * 2 | 1) & v82 - v83) * 2;
    v85 = v82 + ~v82 * 2 + v83 + 2;
    v86 = (0xffffffffffffffff ^ (v82 & ~v83) * 2) + (v82 & ~v83) * 4 + 2;
    v87 = ~((v86 ^ v85) + (v86 & v85) * 2) + ((v86 ^ v85) + (v86 & v85) * 2) * 2;
    v88 = (v87 - (~v84 + v84 * 2) + (~v84 + v84 * 2 | -v87) ^ (~v84 + v84 * 2 | -v87)) + (~v84 + v84 * 2 + (-v84 | -v87) + (v87 - (~v84 + v84 * 2) + (~v84 + v84 * 2 | -v87) & (~v84 + v84 * 2 | -v87))) * 2;
    v89 = v88 + 2;
    v2 = v88 + 3 + (v89 | 3) + (v88 + 3 + ~v89 * 2 | 3);
    v3 = (v89 | 0xffffffffffffffd2) + (v89 | 45) + 46;
    g_f1205e = v9 >> ((char)(v3 + (0xffffffffffffffff ^ v3 * 2) + (-(v3 + (0xffffffffffffffff ^ v3 * 2)) & ~v2) * 2 + (v3 + 1 & v2) * 2 + v2 - 1) & 63);
    v91 = g_f04510 * 2;
    v92 = v91 + ~g_f04510 * 4 + (g_f04510 ^ 1) + (v91 & 2);
    v93 = -g_f12058;
    v94 = g_f12058 + g_f04510 + (v93 & ~g_f04510) * 2 + (g_f04510 + (v93 | ~g_f04510)) * 2 + 2;
    v95 = (v92 + ((unsigned short)(0xfffffffd - v92) | g_f12058)) * 2 + 6;
    g_f04510 = (unsigned short)v94 + (v95 | (unsigned short)~v94) + (v95 | (unsigned short)v94) + 1;
    v96 = g_f04512 + 1;
    v97 = v96 + ~g_f04512 * 2;
    v98 = (unsigned short)v97 + g_f1205a;
    v99 = -(v97 | g_f1205a);
    v100 = -g_f1205a;
    v101 = (v100 ^ g_f04512) + ((v100 | ~g_f04512) + (unsigned short)v96) * 2;
    v102 = (v98 & v99) * 4 + (v98 ^ v99) * 2 | 1;
    g_f04512 = (v102 ^ v101) + (v102 & v101) * 2 - 1;
    v103 = g_f04514 * 3 + ~g_f04514 * 4;
    v104 = (unsigned int)(g_f1205c - v103) + (v103 + 3 | ~g_f1205c) - 3;
    v105 = g_f04514 + g_f1205c + ~g_f1205c * 2 + 2;
    v106 = (v104 & v103 + 4) * 4 + (v104 ^ v103 + 4) * 2 | 1;
    g_f04514 = (unsigned short)~((v106 ^ v105) + (v106 & v105) * 2) + (((unsigned short)v106 ^ (unsigned short)v105) + ((unsigned short)v106 & (unsigned short)v105) * 2) * 2;
    v107 = g_f1205e | ~g_f04516;
    g_f04516 = (unsigned short)(v107 - (v107 + g_f04516 + g_f1205e)) + (g_f1205e | g_f04516) * 2;
    v108 = g_f04518 | v9;
    v109 = (g_f04518 | ~v9) + v9;
    g_f04518 = v109 + v108 + (v108 & ~v109 | ~v109 & ~v108) * 2 + 1;
    v110 = v3;
    v111 = v2;
    v112 = (v110 ^ -v111) + (unsigned int)(v110 - v111 - (v110 | -v111)) * 2;
    v113 = ((v110 | v111) & -v110) * 4 + ((v110 | v111) ^ -v110) * 2;
    v114 = v112 + (v113 | ~v112) + (v113 | v112) + 1;
    v115 = v114 - v110 + (v110 & ~v114) * 2;
    v116 = (v114 * 3 + ~v114 * 4 + ((unsigned int)(0x7ffffffc - (v114 * 3 + ~v114 * 4)) | v111)) * 2;
    v117 = v114 - v111 + v116 + 8 + ((unsigned int)(0xfffffff7 - v116) | ~(v114 - v111)) + (v116 + 8 & v114 - v111) + 1;
    v118 = v115 & ~v117;
    v119 = (v118 - v115 ^ (v117 | v115)) + (v118 - v115 & (v117 | v115)) * 2;
    v120 = v117 - v115 + v118 * 2 + (v117 - v115 & ~(v118 * 2)) + (v118 * 2 | ~(v117 - v115)) + 1;
    v121 = (v120 ^ 1) + ~v120 * 2 + (__ROL__(v120, 1) & 2 & 3);
    return v119 + (v121 | ~v119) + (v121 | v119) + 2;
}
