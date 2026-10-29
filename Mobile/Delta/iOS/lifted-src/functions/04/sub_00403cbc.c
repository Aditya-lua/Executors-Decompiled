/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x403cbc..0x4047c8 (2828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_403cbc_0 {
    char field_0;
} st_403cbc_0;

extern unsigned short g_f03948;
extern unsigned short g_f0394a;
extern unsigned short g_f0394c;
extern unsigned short g_f0394e;
extern unsigned short g_f03950;
extern unsigned short g_f03952;
extern unsigned short g_f03954;
extern unsigned short g_f03956;
extern unsigned long long g_f03958;

int sub_403cbc(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x11
    unsigned int v102;  // w14
    unsigned int v103;  // w15
    unsigned int v104;  // w9
    unsigned int v105;  // w12
    unsigned int v106;  // w9
    unsigned int v107;  // w10
    unsigned int v108;  // w8
    unsigned int v109;  // w11
    unsigned int v110;  // w8
    unsigned int v111;  // w10
    unsigned long long v13;  // x13
    unsigned long long v14;  // x13
    unsigned int v15;  // w11
    unsigned int v16;  // w11
    unsigned long long v17;  // x12
    unsigned long v18;  // x13
    unsigned long long v19;  // x17
    unsigned long long v20;  // x14
    unsigned long long v21;  // x13
    st_403cbc_0 *v4;  // x10
    unsigned long long v22;  // x16
    unsigned long long v23;  // x12
    unsigned long long v24;  // x13
    unsigned long long v25;  // x13
    unsigned long long v26;  // x14
    unsigned long long v27;  // x16
    unsigned long long v28;  // x14
    unsigned long long v29;  // x13
    unsigned long v30;  // x14
    unsigned long long v31;  // x16
    st_403cbc_0 **v5;  // x11
    unsigned long long v32;  // x17
    unsigned long long v33;  // x0
    unsigned long long v34;  // x17
    unsigned long long v35;  // x14
    unsigned long v36;  // x15
    unsigned long long v37;  // x14
    unsigned long long v38;  // x14
    unsigned int v39;  // w14
    unsigned int v40;  // w15
    unsigned int v41;  // w17
    unsigned long long v6;  // x12
    unsigned int v42;  // w16
    unsigned int v43;  // w1
    unsigned int v44;  // w14
    unsigned long long v45;  // x13
    unsigned long long v46;  // x15
    unsigned long long v47;  // x17
    unsigned long long v48;  // x0
    unsigned long long v49;  // x13
    unsigned long long v50;  // x15
    unsigned long long v51;  // x13
    unsigned long long v7;  // x13
    unsigned long long v52;  // x15
    unsigned long long v53;  // x17
    unsigned long long v54;  // x16
    unsigned long long v55;  // x13
    unsigned short v56;  // x15
    unsigned long long v57;  // x13
    unsigned long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x17
    unsigned long long v61;  // x16
    unsigned long long v8;  // x14
    unsigned long long v62;  // x16
    unsigned long long v63;  // x0
    unsigned long long v64;  // x17
    unsigned long long v65;  // x0
    unsigned short v66;  // x16
    unsigned long long v67;  // x16
    unsigned long v68;  // x0
    unsigned long long v69;  // x1
    unsigned long long v70;  // x1
    unsigned long long v71;  // x2
    unsigned long v9;  // x15
    unsigned long long v72;  // x3
    unsigned long long v73;  // x16
    unsigned long long v74;  // x17
    unsigned long long v75;  // x16
    unsigned long long v76;  // x12
    unsigned long long v77;  // x17
    unsigned int v78;  // w17
    unsigned short v79;  // x11
    unsigned int v80;  // w14
    unsigned int v81;  // w11
    unsigned long long v10;  // x12
    unsigned int v82;  // w12
    unsigned short v83;  // x14
    unsigned short v84;  // x15
    unsigned short v85;  // x17
    unsigned int v86;  // w11
    unsigned int v87;  // w10
    unsigned int v88;  // w9
    unsigned int v89;  // w10
    unsigned int v90;  // w12
    unsigned int v91;  // w14
    unsigned long long v11;  // x10
    unsigned int v92;  // w15
    unsigned int v93;  // w16
    unsigned int v94;  // w12
    unsigned int v95;  // w15
    unsigned int v96;  // w9
    unsigned int v97;  // w11
    unsigned int v98;  // w14
    unsigned int v99;  // w12
    unsigned int v100;  // w10
    unsigned int v101;  // w10
    st_403cbc_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_403cbc_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f03948 + ~(~&g_f03948 + &g_f03948));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 - v5 + (v5 & v4) + (v5 & ~v4) * 2;
    v7 = (v4 | ~v5) + (char *)v5;
    v8 = v6 + ~v7;
    v9 = v5 ^ v4;
    v10 = v8 + v9 + (v6 - v7 + (v7 - v6) * 2 + (-v9 | ~(v6 - v7 + (v7 - v6) * 2))) * 2 + 2;
    v11 = (v9 + 1 + (v5 ^ ~v4) * 2 | 1) + (v9 + 1 & 1);
    v12 = v10 + ((v11 + v8 & -(v8 | v11)) * 4 + (v11 + v8 ^ -(v8 | v11)) * 2 | ~v10) + (v10 | (v11 + v8 & -(v8 | v11)) * 4 + (v11 + v8 ^ -(v8 | v11)) * 2) + 1;
    v13 = v12 + ~v12 * 2 + 1;
    v14 = v12 + v13 + (~(unsigned int)v13 | 0xffffffffffff4835);
    v0 = ((0xffffffff ^ (unsigned int)v12 * 2) & 36970) - v12 + ((v12 & 18485) + v12) * 2 + 0xffffffffffffb7cb;
    v1 = (v12 | 47050) + v14 * 2 + (0xffffffffffff4833 - v14 | v12 | 47050) + (0xffffffffffff4833 - v14 | ~(v12 | 47050)) + 94106;
    v15 = ((unsigned int)(v0 + v1 - ((unsigned int)v1 | v0)) ^ ((unsigned int)v1 | v0) + 1) + ((unsigned int)(v0 + v1 - ((unsigned int)v1 | v0)) & ((unsigned int)v1 | v0) + 1) * 2;
    v16 = (v15 ^ (unsigned int)v3) + (v15 & (unsigned int)v3) * 2;
    g_f0394a = (v15 - 1 | (unsigned int)v3) - v16 + ((-v16 | -(v15 - 1 | (unsigned int)v3)) + v16) * 2 + ((-v16 & -(v15 - 1 | (unsigned int)v3)) + v16) * 2 - 1;
    v17 = v1;
    v18 = v0;
    v19 = v18 + v17;
    v20 = v19 + ((v17 & ~v18) + (-v18 & ~v17) + ~(v17 | -v18)) * 2 + 2;
    v21 = v18 * 2 + ~v18 * 4 + (v18 ^ 1) + (v18 * 2 & 2);
    v22 = v21 + 3;
    v23 = v17 - v22 + (v21 + 2 | ~v17) + 1;
    v24 = v19 + ~v17 * 2 + (v23 & v22) * 4 + (v23 ^ v22) * 2 + ((v23 & v22) * 4 + (v23 ^ v22) * 2 | 0xfffffffffffffffd - (v19 + ~v17 * 2)) + (v19 + ~v17 * 2 + 2 & ~((v23 & v22) * 4 + (v23 ^ v22) * 2)) + 3;
    v25 = v20 - v24 + (v24 | ~v20) + (v20 & ~v24);
    v26 = v25 + 1;
    v27 = 0xfffffffffffffffe - v25;
    v28 = (v25 + 15 ^ -(v26 | 14)) + (v25 + 15 & -(v26 | 14)) * 2;
    v0 = v25 + (v26 & 2) + (0xfffffffffffffffc - v25 - (v27 | 0xfffffffffffffffd) ^ v25 + 3) + ((0xffffffff ^ (unsigned int)v26 * 2) & 4) + (0xfffffffffffffffc - v25 - (v27 | 0xfffffffffffffffd) & v25 + 3) * 2 - 1;
    v1 = v28 + (v25 + (v27 | 0xfffffffffffffff1) + 16 | ~v28) + (v28 | v25 + (v27 | 0xfffffffffffffff1) + 16) + 1;
    v29 = (((v1 | ~v0) ^ v0 + 1) + ((v1 | ~v0) & v0 + 1) * 2 ^ v0 + (v1 | ~v0) + (v1 ^ v0) + 2) + (((v1 | ~v0) ^ v0 + 1) + ((v1 | ~v0) & v0 + 1) * 2 & v0 + (v1 | ~v0) + (v1 ^ v0) + 2) * 2;
    v30 = v1;
    v31 = v0;
    v32 = (v30 ^ -v31) + (v30 + (-v31 | ~v30)) * 2 + 2;
    v33 = ((v30 ^ 1) + v30 * 2 + ~v30 * 4 + (v30 * 2 & 2) + 2 & v31) * 2;
    v34 = v32 + (v33 | ~v32) + (v33 | v32) + 1;
    v35 = (v30 + (v31 | -v30) - v31) * 2 - (v31 + v30 + ((v31 * 3 + ~v31 * 4 + 3 & v30) + (-v30 & ~v31)) * 2);
    v36 = v34 ^ v35;
    v37 = v36 + (v34 & v35) * 2;
    v38 = (v37 + (v37 & 16738) - (0xffffffffffff7d3b | v37 * 2) + 0xffffffffffffbe9e ^ v37 & 16738) + (v37 + (v37 & 16738) - (0xffffffffffff7d3b | v37 * 2) + 0xffffffffffffbe9e & v37 & 16738) * 2;
    v0 = (v36 | 0xfffffffffffffffe) + 48799 + (v37 & 0xfffffffffffffffe);
    v1 = ~v38 + v38 * 2;
    v39 = v0;
    v40 = v1;
    v41 = v39 + 1;
    v42 = v41 + ~v39 * 2 | v40;
    v43 = v40 + ~v40 * 2 + 1;
    v44 = v41 + v40 + v43 + (v42 ^ v41) + ~(v43 | v39) + (v42 & v41) * 2;
    g_f0394e = (unsigned short)v44 + ((unsigned short)v44 + (unsigned short)~v44 * 2 + 1 | (unsigned short)(v3 >> ((char)~v29 + (char)v29 * 2 & 63))) + 1;
    v45 = v1;
    v46 = v0;
    v47 = v46 | v45;
    v48 = -(v46 & v45);
    v49 = (v46 ^ v45) - (v46 + v45 + (v48 & ~v47) * 2);
    v50 = v49 + (~v47 - (v48 | ~v47)) * 2;
    v51 = v50 + (v49 | 0xfffffffffffffffe) + v50 - (~v50 + v50 * 2 | 1);
    v52 = v51 + 1;
    v53 = v51 + 2;
    v54 = v53 + ~v52 * 2 | 31;
    v55 = (v53 + (v52 ^ 0xfffffffffffffffe) + (v52 & 1 ^ 1) ^ v51 + 3 & ~(v52 & 1)) + (v53 + (v52 ^ 0xfffffffffffffffe) + (v52 & 1 ^ 1) & v51 + 3 & ~(v52 & 1)) * 2;
    v0 = v52 + (v52 ^ 31) + (0xffffffffffffffe0 & ~v52) + (v54 ^ v53) + (v54 & v53) * 2 + 32;
    v1 = ~v55 + v55 * 2;
    v56 = v3 >> (((char)v1 + 1 ^ v0) + (v0 + ((char)v1 + 1 | ~v0)) * 2 + 1 & 63);
    v57 = v1;
    v58 = v0;
    v59 = (v57 ^ 1) + ~v57 * 2 + ((v57 * 2 | v57 >> 63) & 2 & 3);
    v60 = v57 - v58 + (v59 + v58 ^ -(v59 | v58)) * 2 + (v59 + v58 & -(v59 | v58)) * 4;
    v61 = v58 + 1 + v57 + (v57 + ~v58 & -(v57 | ~v58)) * 4 + (v58 + 1 + (-v57 | ~v58)) * 2 + ((v57 + ~v58 ^ -(v57 | ~v58)) + (-v57 & ~v58)) * 2;
    v62 = (v60 ^ v61 - v61 * 2 + 1) + (v60 - v61 + 1 ^ (v60 & 1 - v61) + ~(v60 - v61)) * 2 + (v60 - v61 + 1 & (v60 & 1 - v61) + ~(v60 - v61)) * 4;
    v63 = v62 + 1;
    v64 = ((v63 + ~v62 * 2 | 60951) ^ -(v63 + ~v62 * 2)) + ((v63 + ~v62 * 2 | 60951) & -(v63 + ~v62 * 2)) * 2;
    v65 = (0xffffffffffff11e8 | ~v62) + v63 + 60951;
    v0 = v64 + (v65 | ~v64) + (v64 | v65) + 1;
    v1 = v62 + 4584;
    v66 = (unsigned short)((v0 & 0xffffffff) - v1) + ((unsigned short)v1 + 1 & v0) * 2 + ((unsigned short)v1 + 1 & (unsigned short)~v0) * 2;
    g_f03952 = ((unsigned int)(1 - v66) & v56) + v66 - 2 + (v66 - 2 & v56) - (v66 - 2 | v56);
    v67 = v1;
    v68 = v0;
    v69 = (v67 ^ 1) + ~v67 * 2 + ((v67 * 2 | v67 >> 63) & 2 & 3);
    v70 = (((v69 + v68 & -(v69 | v68)) * 4 + (v69 + v68 ^ -(v69 | v68)) * 2 | 1) ^ v67 - v68) + (((v69 + v68 & -(v69 | v68)) * 4 + (v69 + v68 ^ -(v69 | v68)) * 2 | 1) & v67 - v68) * 2;
    v71 = v70 - 1;
    v72 = (v68 ^ 1) + ~v68 * 2 + ((v68 * 2 | v68 >> 63) & 2 & 3);
    v73 = (v68 ^ -v67) + (v72 + v67 & -(v72 | v67)) * 4 + (v68 - v67 - (v68 | -v67) + (v72 + v67 ^ -(v72 | v67))) * 2;
    v74 = v71 - (v73 + (v71 & -v73) * 2);
    v75 = ((v73 - 1 & -v70) - v73 + v71) * 2;
    v76 = (0xfffffffffffffffd - v75 & v74) + v75 + 2 + (v75 + 2 & v74);
    v0 = (v76 ^ 9) + (18 & v76 * 2) - 1;
    v1 = (v74 & 1) + (v76 | 1) + 39;
    v77 = ((v1 | ~v0) ^ v0 + 1) + ((v1 | ~v0) & v0 + 1) * 2;
    g_f03956 = v3 >> ((char)v77 + ((char)v1 | (char)v0 | (char)~v77) + ((char)v77 | (char)v1 | (char)v0) + 1 & 63);
    v78 = g_f0394a | g_f03948;
    v79 = (g_f03948 & ~g_f0394a) - g_f03948;
    g_f03948 = (unsigned short)(v78 - v79) + (v79 & (unsigned short)v78) * 2 + (v79 & (unsigned short)~v78) * 2;
    v80 = g_f0394e | g_f0394c;
    v81 = g_f0394c + 1;
    v82 = v81 + ~g_f0394c * 2 | g_f0394e;
    g_f0394c = ((unsigned short)v82 ^ (unsigned short)v81) + ((unsigned short)v82 & (unsigned short)v81) * 2 + (unsigned short)v80 + ((unsigned short)v80 + ((unsigned short)-((v82 ^ v81) + (v82 & v81) * 2) | (unsigned short)~v80) + ((unsigned short)-((v82 ^ v81) + (v82 & v81) * 2) & (unsigned short)~v80)) * 2 + 2;
    v83 = g_f03950 + 1;
    v84 = ~g_f03950 * 2;
    v85 = v83 + v84 | g_f03952;
    g_f03950 = v83 + g_f03952 + (v85 ^ v84 + g_f03950) - ((g_f03952 & g_f03950) + (v85 & v83) * 2);
    v86 = g_f03954 - g_f03956;
    v87 = ((0xffffffff ^ g_f03954 * 2) + g_f03954 & g_f03956) * 2;
    g_f03954 = (unsigned short)v86 + (unsigned short)v87 + ((unsigned short)v86 & (unsigned short)~v87) + ((unsigned short)v87 | (unsigned short)~v86) + 1;
    g_f03958 = (g_f03958 & ~v3) - g_f03958 + (g_f03958 | v3);
    v88 = v1;
    v89 = v0;
    v90 = (v89 | ~v88) + v88;
    v91 = (v89 ^ v88) + v90;
    v92 = v91 + 1;
    v93 = v92 - ~v90;
    v94 = v93 + ((unsigned int)(0xfffffffe - v91) & ~v90) * 2 + (v92 & ~v90) * 2;
    v95 = ~v94 * 2;
    v96 = (v94 & v88 + ~v88 * 2 + 1) + v88 + ((v94 + 1 + v95 | v88) ^ v95 + v94) - ((v94 + 1 + v95 | v88) & v94 + 1) * 2;
    v97 = v96 + 1;
    v98 = (v94 ^ 1) + (__ROL__(v93, 1) & 2 & 3) + v95;
    v99 = (v98 + v89 & -(v98 | v89)) * 4 + (v98 + v89 ^ -(v98 | v89)) * 2 | 1;
    v100 = (v99 ^ v94 - v89) + (v99 & v94 - v89) * 2;
    v101 = ~v100 + v100 * 2;
    v102 = 0xfffffffe - v96;
    v103 = (v97 ^ 1) + v102 * 2 + (__ROL__(v97, 1) & 2 & 3);
    v104 = v96 + v101 + (v102 & -v101) * 2 + (unsigned int)(v97 - v101 - (v97 | -v101)) * 2;
    v105 = ((v101 | ~v103) + v103) * 2;
    v106 = v104 + v105 + 2 + ((unsigned int)(0xfffffffd - v105) | (unsigned int)(0xfffffffe - v104)) + (v104 + 1 & v105 + 2) + 2;
    v107 = ((v101 | v97) ^ -(v101 & v97)) + ((v101 | v97) + (-(v101 & v97) | ~(v101 | v97))) * 2;
    v108 = 0xfffffffe - v107;
    v109 = v106 | v108;
    v110 = (v108 | ~v106) + v106;
    v111 = (v106 - v107 + (v107 + 1 & ~v106)) * 2 - 2;
    return v109 - v110 + v111 + (v111 | v110 - v109) + ((unsigned int)(1 - (v106 - v107 + (v107 + 1 & ~v106)) * 2) & v109 + ~v110);
}
