/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43c8c0..0x43d39c (2780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43c8c0_0 {
    char field_0;
} st_43c8c0_0;

extern unsigned short g_f044d0;
extern unsigned short g_f044d2;
extern unsigned short g_f044d4;
extern unsigned short g_f044d6;
extern unsigned long long g_f044d8;
extern unsigned short g_f12038;
extern unsigned short g_f1203a;
extern unsigned short g_f1203c;
extern unsigned short g_f1203e;

int sub_43c8c0(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long v12;  // x14
    unsigned int v102;  // w9
    unsigned int v103;  // w10
    unsigned int v104;  // w15
    unsigned int v105;  // w11
    unsigned int v106;  // w12
    unsigned int v107;  // w11
    unsigned int v108;  // w12
    unsigned int v109;  // w14
    unsigned int v110;  // w15
    unsigned int v111;  // w9
    unsigned long long v13;  // x10
    unsigned int v112;  // w16
    unsigned int v113;  // w9
    unsigned int v114;  // w10
    unsigned int v115;  // w11
    unsigned int v116;  // w10
    unsigned int v117;  // w10
    unsigned int v14;  // w10
    unsigned long long v15;  // x11
    unsigned long v16;  // x12
    unsigned long long v17;  // x13
    unsigned long long v18;  // x14
    unsigned long long v19;  // x13
    unsigned long long v20;  // x12
    unsigned long long v21;  // x11
    st_43c8c0_0 *v4;  // x10
    unsigned long long v22;  // x12
    unsigned long long v23;  // x11
    __m128i v24;  // q0
    __m128i v25;  // q1
    __m128i v26;  // q0
    __m128i v27;  // q0
    unsigned long v28;  // x12
    unsigned long long v30;  // x14
    unsigned int v31;  // w12
    st_43c8c0_0 **v5;  // x12
    unsigned long v32;  // x14
    unsigned long v33;  // x15
    unsigned long long v34;  // x16
    unsigned long long v35;  // x17
    unsigned long long v36;  // x14
    unsigned long long v37;  // x15
    unsigned long long v38;  // x14
    unsigned long long v39;  // x16
    unsigned long long v40;  // x15
    unsigned long long v41;  // x14
    unsigned long long v6;  // x13
    unsigned int v42;  // w14
    unsigned long v43;  // x14
    unsigned long v44;  // x15
    unsigned long long v45;  // x16
    unsigned long long v46;  // x17
    unsigned long long v47;  // x17
    unsigned long long v48;  // x14
    unsigned long long v49;  // x2
    unsigned long long v50;  // x13
    unsigned long long v51;  // x13
    unsigned long long v7;  // x13
    unsigned long v52;  // x15
    unsigned long long v53;  // x13
    unsigned long long v54;  // x13
    unsigned int v55;  // w13
    unsigned long long v56;  // x14
    unsigned long long v57;  // x15
    unsigned long long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x1
    unsigned long long v61;  // x14
    unsigned long long v8;  // x14
    unsigned long long v62;  // x14
    unsigned long long v63;  // x15
    unsigned long long v64;  // x14
    unsigned long long v65;  // x15
    unsigned long v66;  // x1
    unsigned long long v67;  // x16
    unsigned int v68;  // w15
    unsigned long long v69;  // x14
    unsigned long long v70;  // x16
    unsigned long long v71;  // x17
    unsigned long long v9;  // x10
    unsigned long long v72;  // x0
    unsigned long long v73;  // x1
    unsigned long long v74;  // x15
    unsigned long long v75;  // x14
    unsigned long long v76;  // x15
    unsigned long v77;  // x14
    unsigned long long v78;  // x14
    unsigned long long v79;  // x11
    unsigned int v80;  // w15
    unsigned int v81;  // w10
    unsigned long long v10;  // x11
    unsigned int v82;  // w10
    unsigned short v83;  // x12
    unsigned short v84;  // x15
    unsigned int v85;  // w10
    unsigned int v86;  // w11
    unsigned int v87;  // w12
    unsigned short v88;  // x10
    unsigned long long v89;  // x13
    unsigned long long v90;  // x11
    unsigned long long v91;  // x8
    unsigned long long v11;  // x12
    unsigned int v92;  // w9
    unsigned int v93;  // w11
    unsigned int v94;  // w13
    unsigned int v95;  // w8
    unsigned int v96;  // w12
    unsigned int v97;  // w12
    unsigned int v98;  // w13
    unsigned int v99;  // w14
    unsigned int v100;  // w9
    unsigned int v101;  // w10
    st_43c8c0_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_43c8c0_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f044d0 + ~(~&g_f044d0 + &g_f044d0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (&v4[0xffffffffffffffff ^ v4 * 2] + v5 & -(&v4[0xffffffffffffffff ^ v4 * 2] | v5)) * 4 + (&v4[0xffffffffffffffff ^ v4 * 2] + v5 ^ -(&v4[0xffffffffffffffff ^ v4 * 2] | v5)) * 2 | 1;
    v7 = ~((v6 ^ v4 - v5) + (v6 & v4 - v5) * 2) + ((v6 ^ v4 - v5) + (v6 & v4 - v5) * 2) * 2;
    v8 = (char *)v5 + 0x2 * ~v5 + 1;
    v9 = (v5 ^ -v4) + (v5 - v4 - (v5 | -v4)) * 2 + ((v4 | ~v8) + v8) * 2 + 1;
    v10 = v7 | ~v9;
    v11 = v9 - v7 + v10 + 1;
    v12 = v11 ^ v10;
    v13 = (v12 + (v11 & v10) * 2 | (v7 & ~v9) * 2) + (v12 + (v11 & v10) * 2 & (v7 & ~v9) * 2);
    v0 = (109812 & v13 * 2) + v13 + (109812 & v13 * 2 ^ 109812) + 0xffffffffffff2985;
    v1 = (v13 | 0xffffffffffffd679) + (v13 | 1) + (v12 & 1) + 10630 + ~(v13 & 10630) + ((v13 | 0xffffffffffffd679) + 10631 & (v13 & 10630) - ((v13 | 1) + (v12 & 1) + 10630)) + (0xffffffffffffd678 - (v13 | 0xffffffffffffd679) | (v13 | 1) + (v12 & 1) + 10630 + ~(v13 & 10630)) + 10632;
    v14 = v0 + ~(unsigned int)v1 + (unsigned int)v1 * 2 + 2;
    g_f12038 = (unsigned short)~v14 + (unsigned short)v14 * 2 & (unsigned short)v3;
    v15 = v1;
    v16 = v0;
    v17 = v15 * 3 + ~v15 * 4 + 3;
    v18 = v15 - v16;
    v19 = v18 + (v17 + v16 ^ -(v17 | v16)) * 2 + (v17 + v16 & -(v17 | v16)) * 4;
    v20 = (v18 + (v16 & ~v15)) * 2;
    v21 = v16 - v15 + (v20 | ~(v16 - v15)) + (v20 | v16 - v15);
    v22 = v21 + v19 + 1 + (v19 + 1 + ~v19 * 2 + (~(v19 + 1 + ~v19 * 2) | ~v21)) * 2;
    v23 = v22 + (v19 & ~v21) * 2 + ((v19 & ~v21) * 2 | 0xfffffffffffffffd - v22) + (v22 + 2 & ~((v19 & ~v21) * 2)) + 3;
    v24 = (__m128i)(CONCAT(v23, v23));
    v25 = _mm_and_si128(v24, _mm_set_epi64x(-9, 8));
    v26 = _mm_add_epi64(v24, _mm_set_epi64x(8, 9));
    v27 = _mm_add_epi64(v26, _mm_xor_si128(_mm_set_epi64x(-9, -1), v25));
    v28 = _mm_extract_epi64(v27, 1);
    v0 = v23 + _mm_cvtsi128_si64(v25) - (v23 * 2 | 0xffffffffffffffef) + v28 - 8;
    v1 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(v27, _mm_unpackhi_epi64(v27, v27))) + (v28 + 1 & _mm_cvtsi128_si64(v25) - _mm_cvtsi128_si64(v26)) + (0xfffffffffffffffe - v28 | _mm_cvtsi128_si64(v27)) + 2;
    v30 = (v1 ^ 1) + ~v1 * 2 + ((v1 * 2 | v1 >> 63) & 2 & 3);
    v31 = v3 >> ((char)(v0 + v30 + (-v30 & ~v0) * 2 + (v0 - v30 - (v0 | -v30)) * 2 - 1) & 63);
    v32 = v1;
    v33 = v0;
    v34 = v33 | v32;
    v35 = (v32 | ~v33) + v33;
    v36 = v33 & v32;
    v37 = v34 - v36;
    v38 = v35 - v36 + (v34 + ~v35 | -v37) * 2;
    v39 = v34 - v35 + (v35 - v34) * 2;
    v40 = v39 - v37 + (v37 - 1 | ~v39) + 1;
    v41 = v38 + ((v40 & -v39) * 4 + (v40 ^ -v39) * 2 | 0xfffffffffffffffe - v38) + ((v40 & -v39) * 4 + (v40 ^ -v39) * 2 | v38 + 1) + 2;
    v0 = ((v41 | 1) + (v41 & 1) + 5776) * 3 + ~((v41 | 1) + (v41 & 1) + 5776) * 2 + 1;
    v1 = (v41 ^ 59760) + (v41 + (59760 | ~v41)) * 2 + 1;
    v42 = (v0 & ~(unsigned int)v1) + (v0 | ~(unsigned int)v1) + (unsigned int)v1 * 2 + 1;
    g_f1203a = (unsigned short)v31 + (unsigned short)v42 + ((unsigned short)v31 + (unsigned short)~v31 * 2 + 1 & (unsigned short)~v42) + 1;
    v43 = v1;
    v44 = v0;
    v45 = v44 + v43 + (-v44 & ~v43) * 2 + (v43 - v44 - (v43 | -v44)) * 2;
    v46 = (v44 + ~v43 + (v43 & ~v44)) * 2;
    v47 = v44 + (v43 | ~v44) + (v44 ^ v43) + 1;
    v48 = (v44 & ~v43) - v44;
    v49 = (v47 & v48) * 2;
    v50 = v48 - v47 + v46 + 2 + v45 + (v46 + 2 | ~v45) + (v45 & 0xfffffffffffffffd - v46) - (v48 & ~v47) * 2 + 1;
    v51 = v50 - v49;
    v52 = ~(unsigned int)v51 & 2;
    v53 = (v51 + (v51 ^ 0xfffffffffffffffd) + v52 + 1 ^ (v51 | 2) + 1) + (v51 + (v51 ^ 0xfffffffffffffffd) + v52 + 1 & (v51 | 2) + 1) * 2;
    v0 = v50 + ~v49 + (v51 | 30) + (0xffffffffffffffe1 & ~v51) + 32;
    v1 = ~v53 + v53 * 2;
    v54 = ((v0 + 1 ^ (v1 | ~v0)) + (v0 + 1 & (v1 | ~v0)) * 2 ^ v1 + v0 + 1 - (v1 & v0)) + ((v0 + 1 ^ (v1 | ~v0)) + (v0 + 1 & (v1 | ~v0)) * 2 & v1 + v0 + 1 - (v1 & v0)) * 2;
    v55 = v3 >> ((char)~v54 + (char)v54 * 2 & 63);
    v56 = v1;
    v57 = v0;
    v58 = (v56 ^ -v57) + (v56 - v57 - (v56 | -v57)) * 2;
    v59 = (v57 + ~v56 & -(v57 | ~v56)) * 4 + (v57 + ~v56 ^ -(v57 | ~v56)) * 2;
    v60 = v57 - v56 + (v57 & v56) + (v56 & ~v57) * 2;
    v61 = -(((v56 | ~v57) ^ v57 + 1) + ((v56 | ~v57) & v57 + 1) * 2);
    v62 = (v60 ^ v61) + (v60 + (v61 | ~v60)) * 2 + 2;
    v63 = v62 * 2;
    v64 = v58 + (v59 | ~v58) + (v58 | v59) + v62 + 1;
    v65 = v64 - v63;
    v66 = 0xffffffff ^ (unsigned int)v65 * 2;
    v67 = ((v66 & 21212) + (v65 & 10606) + v64 + ~v63 + 0xffffffffffffd694 ^ v65 + (0xfffffffffffffffe - (v64 + ~v63) | 10606) + 1) + ((v66 & 21212) + (v65 & 10606) + v64 + ~v63 + 0xffffffffffffd694 & v65 + (0xfffffffffffffffe - (v64 + ~v63) | 10606) + 1) * 2;
    v0 = ~v67 + v67 * 2;
    v1 = (v65 | 1) + (v64 & 1) + 54928;
    v68 = (unsigned int)v1 + ~(unsigned int)v1 * 2;
    g_f1203c = (unsigned short)v55 + ((unsigned short)((unsigned int)v0 + 1 + v68 + (~v68 & ~(unsigned int)v0) * 2 + ((unsigned int)v0 + 1 + (~v68 | ~(unsigned int)v0)) * 2 - 1) | (unsigned short)~v55) + 1;
    v69 = v1;
    v70 = v0;
    v71 = v70 + v69;
    v72 = (v70 & ~v69) + ~v70;
    v73 = v72 + v71 + (v70 & v69) + ~(v70 & v69) * 2;
    v74 = v71 + 1;
    v75 = v74 + (-v69 & ~v70) * 2 + (v70 - v69 - (v70 | -v69)) * 2 + (v72 + v69) * 2;
    v76 = (v73 + 3 | (0xfffffffffffffffe - v75 | 1) + (v74 & 1)) - ((0xfffffffffffffffe - v75 | 1) + (v74 & 1) & v73 + 3);
    v77 = (v73 - v75 + (v75 + 0x8000000000000000 & 0x7ffffffffffffffc - v73)) * 2 + 6;
    v78 = v76 + (v77 | ~v76) + (v77 | v76);
    v79 = v78 + (0xfffffffffffffffe - v78 & 0xfffffffffffffffa) + 7;
    v0 = (v79 | v78 + 1 | 5) + (v79 & (v78 + 1 | 5));
    v1 = v78 + 44;
    g_f1203e = v3 >> ((char)((v1 & 0xff | ~v0) - v1) + ((char)v0 + 1 ^ ((char)v1 | (char)~v0)) + (((char)v1 | (char)v0) + ((char)v0 + 1 & ((char)v1 | (char)~v0))) * 2 + 1 & 63);
    v80 = g_f12038 | g_f044d0;
    v81 = (unsigned int)(g_f12038 - g_f044d0) + (g_f044d0 | ~g_f12038);
    v82 = (v81 ^ g_f044d0 + 1) + (v81 & g_f044d0 + 1) * 2;
    g_f044d0 = (unsigned short)v80 + (unsigned short)v82 + ((unsigned short)-v82 & (unsigned short)~v80) * 2 + (unsigned short)(v80 - v82 - (v80 | -v82)) * 2;
    v83 = g_f044d2 | g_f1203a;
    v84 = -g_f044d2;
    g_f044d2 = g_f044d2 - g_f1203a + (v83 ^ v84) * 2 + (v83 & v84) * 4;
    v85 = g_f044d4 + g_f1203c + ~g_f1203c * 2 + 2;
    v86 = 1 | (g_f1203c & ~g_f044d4) * 2;
    g_f044d4 = (unsigned short)~((v85 ^ v86) + (v85 & v86) * 2) + (((unsigned short)v85 ^ (unsigned short)v86) + ((unsigned short)v85 & (unsigned short)v86) * 2) * 2;
    v87 = g_f1203e | g_f044d6;
    v88 = g_f1203e + g_f044d6;
    g_f044d6 = (unsigned short)(v87 - (v88 & -v87) * 2) + ((unsigned short)(v87 - 1) ^ v88) + 1;
    v89 = g_f044d8 * 2;
    v90 = v89 + (g_f044d8 ^ 1) + (v89 & 2 | ~g_f044d8 * 4) + 2;
    v91 = g_f044d8 - v3 + ~((v90 + v3 & -(v90 | v3)) * 4 + (v90 + v3 ^ -(v90 | v3)) * 2) + ((v90 + v3 & -(v90 | v3)) * 4 + (v90 + v3 ^ -(v90 | v3)) * 2) * 2 + 2;
    g_f044d8 = ~v91 + v91 * 2;
    v92 = v1;
    v93 = v0;
    v94 = v92 + (v93 | ~v92) + (v93 ^ v92);
    v95 = v92 + 1;
    v96 = v95 + ~v92 * 2 | v93;
    v97 = (v96 ^ v95) + (v96 & v95) * 2 + v94 + 2 + (-((v96 ^ v95) + (v96 & v95) * 2) & (unsigned int)(0xfffffffe - v94)) * 2 + ((-((v96 ^ v95) + (v96 & v95) * 2) | (unsigned int)(0xfffffffe - v94)) + v94 + 2) * 2;
    v98 = v97 - 1;
    v99 = -v97;
    v100 = v98 + v92 + (v99 & -v92) * 2 + ((v99 | -v92) + v97) * 2;
    v101 = ((v98 & ~v92) + 1 & v92 - v97) * 4 + ((v98 & ~v92) + 1 ^ v92 - v97) * 2;
    v102 = v100 + (v101 | ~v100) + (v101 | v100);
    v103 = v102 + 1;
    v104 = (v98 ^ 1) - v97 * 2 + (__ROL__(v98, 1) & 2 & 3);
    v105 = (v98 ^ -v93) + ((v99 | -v93) + v97) * 2;
    v106 = (v104 + (v93 | ~v104)) * 2 + 2;
    v107 = v105 + (v106 | ~v105) + (v106 | v105);
    v108 = v107 + 1;
    v109 = v108 | v103;
    v110 = ~v109;
    v111 = v102 + 2;
    v112 = v111 + ~v103 * 2 | v108;
    v113 = (v112 ^ v111) + (v112 & v111) * 2 + v111 + v108 + (v108 ^ v103) + v110 + (-((v112 ^ v111) + (v112 & v111) * 2) & ~(v111 + v108 + (v108 ^ v103) + v110)) * 2 + (v111 + v108 + (v108 ^ v103) + v110 + (-((v112 ^ v111) + (v112 & v111) * 2) | ~(v111 + v108 + (v108 ^ v103) + v110))) * 2 + 2;
    v114 = (v103 + v110 ^ v108 + ~v108 * 2) - (v103 + v110 & v107 + 2) * 2 + v109;
    v115 = v114 + 1;
    v116 = v114 - v115 * 2;
    v117 = v113 + v116 + (v115 | ~v113) + (v116 & v113) + 2;
    return ((unsigned int)(0xfffffffe - (v113 + v116 + (v115 | ~v113) + (v116 & v113))) | 1) + (v117 | 0xfffffffe) + v117 * 2 + 1;
}
