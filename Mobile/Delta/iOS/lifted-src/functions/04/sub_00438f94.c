/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x438f94..0x439ad4 (2880 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_438f94_0 {
    char field_0;
} st_438f94_0;

extern unsigned short g_f045e0;
extern unsigned short g_f045e2;
extern unsigned short g_f045e4;
extern unsigned short g_f045e6;
extern unsigned long long g_f045e8;
extern unsigned short g_f120c0;
extern unsigned short g_f120c2;
extern unsigned short g_f120c4;
extern unsigned short g_f120c6;

int sub_438f94(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x12
    __m128i v103;  // q0
    __m128i v105;  // q0
    __m128i v106;  // q1
    __m128i v109;  // q0
    __m128i v110;  // q0
    unsigned long long v111;  // d1
    unsigned long long v13;  // x10
    unsigned int v112;  // w9
    unsigned int v113;  // w10
    unsigned int v114;  // w11
    unsigned int v115;  // w13
    unsigned int v116;  // w9
    unsigned int v117;  // w12
    unsigned int v118;  // w12
    unsigned int v119;  // w8
    unsigned int v120;  // w8
    unsigned int v14;  // w10
    unsigned int v15;  // w12
    unsigned int v16;  // w12
    unsigned long long v17;  // x13
    unsigned long v18;  // x14
    unsigned long long v19;  // x15
    unsigned long long v20;  // x16
    unsigned long long v21;  // x13
    st_438f94_0 *v4;  // x10
    unsigned long long v22;  // x13
    unsigned long long v23;  // x13
    unsigned long long v24;  // x15
    unsigned long long v25;  // x16
    unsigned long long v26;  // x13
    unsigned long long v27;  // x15
    unsigned long long v28;  // x13
    unsigned int v29;  // w13
    unsigned long v30;  // x15
    unsigned long long v31;  // x16
    st_438f94_0 **v5;  // x13
    unsigned long long v32;  // x0
    unsigned long long v33;  // x3
    unsigned long long v34;  // x16
    unsigned long long v35;  // x3
    unsigned long long v36;  // x15
    unsigned long long v37;  // x15
    unsigned long long v38;  // x16
    unsigned long long v39;  // x15
    unsigned int v40;  // w15
    unsigned int v41;  // w16
    unsigned long long v6;  // x14
    unsigned long v42;  // x15
    unsigned long long v43;  // x17
    unsigned long long v44;  // x2
    unsigned long long v45;  // x15
    unsigned long long v46;  // x0
    unsigned long long v47;  // x1
    unsigned long long v48;  // x16
    unsigned long long v49;  // x17
    unsigned long long v50;  // x16
    unsigned long long v51;  // x17
    unsigned long long v7;  // x14
    unsigned long long v52;  // x14
    unsigned long long v53;  // x0
    unsigned long v54;  // x14
    unsigned long long v55;  // x16
    char v56;  // x17
    char v57;  // x0
    unsigned int v58;  // w14
    unsigned long long v59;  // x16
    unsigned long v60;  // x17
    unsigned long long v61;  // x0
    unsigned long long v8;  // x15
    unsigned long long v62;  // x16
    unsigned long long v63;  // x16
    unsigned long long v64;  // x17
    unsigned long long v65;  // x16
    unsigned short v66;  // x16
    unsigned int v67;  // w17
    unsigned long v68;  // x17
    unsigned long long v69;  // x0
    unsigned long long v70;  // x1
    unsigned long v71;  // x2
    unsigned long long v9;  // x10
    unsigned long long v72;  // x1
    unsigned long long v73;  // x17
    unsigned long long v74;  // x11
    unsigned long long v75;  // x17
    unsigned long long v76;  // x1
    unsigned long long v77;  // x0
    unsigned long v78;  // x5
    unsigned short v79;  // x17
    unsigned int v80;  // w15
    unsigned int v81;  // w12
    unsigned long long v10;  // x12
    unsigned int v82;  // w10
    unsigned int v83;  // w15
    unsigned int v84;  // w10
    unsigned int v85;  // w10
    unsigned int v86;  // w12
    unsigned int v87;  // w13
    unsigned int v88;  // w10
    unsigned long v89;  // x12
    unsigned long long v90;  // x11
    unsigned long long v91;  // x11
    unsigned long long v11;  // x14
    unsigned long long v92;  // x13
    unsigned long long v93;  // x8
    unsigned int v94;  // w8
    unsigned int v95;  // w9
    unsigned int v96;  // w10
    __m128i v97;  // q0
    __m128i v98;  // q1
    __m128i v99;  // q2
    uint128_t v100;  // q0
    uint128_t v101;  // q1
    st_438f94_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_438f94_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long, unsigned long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f045e0 + ~(~&g_f045e0 + &g_f045e0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = ((char *)v4 + 0x2 * ~v4 ^ ~((char *)v4 + 0x2 * ~v4 + 1 | v5)) + (((char *)v4 + 0x2 * ~v4 + 1 | v5) & ~(struct st_438f94_0 *)((char *)v4 + 0x2 * ~v4)) * 2;
    v7 = v6 + (v4 | v5) + (-v6 & ~(v4 | v5)) * 2 + ((v4 | v5) + (-v6 | ~(v4 | v5))) * 2;
    v8 = v7 + 2;
    v9 = (v5 ^ -v4) + ((char *)v5 + (0xffffffffffffffff ^ v5 * 2) + v4 & -((char *)v5 + (0xffffffffffffffff ^ v5 * 2) | v4)) * 4 + (v5 - v4 - (v5 | -v4) + ((char *)v5 + (0xffffffffffffffff ^ v5 * 2) + v4 ^ -((char *)v5 + (0xffffffffffffffff ^ v5 * 2) | v4))) * 2;
    v10 = -v9;
    v11 = v7 + 3;
    v12 = v11 + ~v8 * 2 | v10;
    v13 = v9 - v8 + (v12 & v11) * 4 + ((v12 ^ v11) + (v8 | v10)) * 2;
    v0 = ((v13 | 0xffffffffffff86a6) + 31066 ^ -(0xffffffffffff86a6 & ~v13)) + ((v13 | 0xffffffffffff86a6) + 31066 & -(0xffffffffffff86a6 & ~v13)) * 2 - 1;
    v1 = v13 + 34470;
    v14 = ((unsigned int)v1 + v0 + 4 | 1) + ((unsigned int)v1 - (unsigned int)v1 * 4 + v0 & 1) - 4;
    v15 = v14 + ~v14 * 2 + v14 * 2 + 1;
    v16 = (v15 ^ (unsigned int)v3 + (0xffffffff ^ (unsigned int)v3 * 2)) + (v15 & ~(unsigned int)v3);
    g_f120c0 = (unsigned short)v16 + (unsigned short)~(unsigned int)v3 + ((unsigned short)v16 & (unsigned short)v3 + 1 | (unsigned short)v3 + 1 & (unsigned short)~v16) * 2;
    v17 = v1;
    v18 = v0;
    v19 = v17 + ~v17 * 2 + 1;
    v20 = (v18 | ~v19) + v19 - (v19 | v18);
    v21 = ~(v19 + v18) - (v17 & ~v18) * 2;
    v22 = (v20 ^ v21) + (v20 & v21) * 2 - 1;
    v23 = (v22 * 2 & 4) + (v22 ^ 2);
    v24 = ~v23 + v23 * 2;
    v25 = v24 * 2;
    v26 = ((-v23 | 7) ^ v23) + ((-v23 | 7) & v23) * 2;
    v27 = (~(unsigned int)v25 & 14) + (v24 & 7) + v24 - 6;
    v0 = v24 + (v25 & 20) + (v25 & 20 ^ 20) - 11;
    v1 = (v27 ^ v26) + (v27 & v26) * 2 - 1;
    v28 = (v1 ^ 0xfffffffffffffffe) + v1 * 2 + v0 - (v1 * 2 & 2) + 3;
    v29 = v3 >> ((char)v28 * 3 + (char)~v28 * 2 + 1 & 63);
    v30 = v1;
    v31 = v0;
    v32 = (v30 + ~v30 * 2 ^ ~(v30 + ~v30 * 2 + 1 | v31)) + ((v30 + ~v30 * 2 + 1 | v31) & ~(v30 + ~v30 * 2)) * 2;
    v33 = (v31 ^ 1) + ~v31 * 2 + ((v31 * 2 | v31 >> 63) & 2 & 3);
    v34 = v31 + v30 + (-v30 & ~v31) * 2 + (v31 + (-v30 | ~v31)) * 2 + 2;
    v35 = (v33 + v30 & -(v33 | v30)) * 4 + (v33 + v30 ^ -(v33 | v30)) * 2 | 1;
    v36 = v30 + (v31 | ~v30) + (v31 ^ v30) + v32 + ~v32 * 2 - ((v35 ^ v34) + (v35 & v34) * 2) + 3;
    v37 = v36 + (v36 | 1) + (~v36 | 1);
    v38 = v37 + 1;
    v39 = (v37 + 60823 ^ -(v38 | 60822)) + (v37 + 60823 & -(v38 | 60822)) * 2;
    v0 = (v39 ^ (v38 & 0xffffffffffff1269) + 60823) + (v39 & (v38 & 0xffffffffffff1269) + 60823) * 2 - 1;
    v1 = (v38 | 4713) + (v38 | 0xffffffffffffed96) * 2 - (v38 | 0xffffffffffffed96) + 4714;
    v40 = (unsigned int)v0 + 1 + (unsigned int)v1 + ((unsigned int)v1 & (unsigned int)v0) + ((unsigned int)v1 + ~(unsigned int)v1 * 2 + 1 | (unsigned int)v0 + 1 + ~(unsigned int)v0 * 2);
    v41 = (v40 + 1 ^ v29) + (v40 + 1 & v29) * 2;
    g_f120c2 = (v40 | v29) - v41 + ((-v41 | -(v40 | v29)) + v41) * 2 + ((-v41 & -(v40 | v29)) + v41) * 2 - 1;
    v42 = v1;
    v43 = v0;
    v44 = v43 + 1;
    v45 = v43 | v42;
    v46 = v44 + v44 + ~v43 * 2 + (v42 | ~(v44 + ~v43 * 2)) + (v45 - 1 ^ v43 + v42) - (v43 + v42 & -v45) * 2;
    v47 = v46 + 1;
    v48 = (v43 ^ -v42) + (v44 + (-v42 | ~v43) + (v45 ^ -v43)) * 2 + (v45 & -v43) * 4;
    v49 = v48 - 1;
    v50 = v48 + ~v46 + (v47 | -v48) + (v49 & v47) - v48;
    v51 = v50 - ((~(v47 - v48) - (v49 | 0xfffffffffffffffe - v46) & v47 - v48) * 4 + (~(v47 - v48) - (v49 | 0xfffffffffffffffe - v46) ^ v47 - v48) * 2) + ((~(v47 - v48) - (v49 | 0xfffffffffffffffe - v46) & v47 - v48) * 4 + (~(v47 - v48) - (v49 | 0xfffffffffffffffe - v46) ^ v47 - v48) * 2) * 2;
    v52 = (~(unsigned int)v51 & 20) + (v51 ^ 0xffffffffffffffeb);
    v53 = (v51 + 12 ^ -(v51 | 12)) + (v51 + 12 & -(v51 | 12)) * 2;
    v0 = v51 + 2 + (1 - (v51 + 2) | 0xffffffffffffffeb) + (v52 ^ v51 + 1) + (v52 & v51 + 1) * 2 + 19;
    v1 = (v51 | 1) + (v50 & 1) + 12 - (v51 & 12) + v53 + ((v51 & 12) - ((v51 | 1) + (v50 & 1) + 12) | ~v53) + (v53 & (v51 | 1) + (v50 & 1) + 12 + ~(v51 & 12));
    v54 = v0;
    v55 = v1;
    v56 = ~v54;
    v57 = ((char)v54 + v56 * 2 + 1 | (char)v55) + (char)v54;
    v58 = v3 >> ((char)((v56 & ~v55) + (v55 | v54) * 2 + v57 * 2 - ((v57 + 1 & 0xfffffffffffffffe - ((v56 & ~v55) + (v55 | v54) * 2)) + ((v56 & ~v55) + (v55 | v54) * 2 + 1 & v57 + 1))) + 3 & 63);
    v59 = v1;
    v60 = v0;
    v61 = ((((v59 | v60) & -v59) * 4 + ((v59 | v60) ^ -v59) * 2 | 1) ^ v60 + v59 + (-v60 & ~v59) * 2 + (v59 - v60 - (v59 | -v60)) * 2) + ((((v59 | v60) & -v59) * 4 + ((v59 | v60) ^ -v59) * 2 | 1) & v60 + v59 + (-v60 & ~v59) * 2 + (v59 - v60 - (v59 | -v60)) * 2) * 2;
    v62 = v60 - v59 + ((0xfffffffffffffffc - (v60 * 3 + ~v60 * 4) | v59) ^ v60 * 3 + ~v60 * 4 + 4) * 2 + ((0xfffffffffffffffc - (v60 * 3 + ~v60 * 4) | v59) & v60 * 3 + ~v60 * 4 + 4) * 4;
    v63 = v62 + (0xffffffffffffffff ^ v62 * 2) + v61 + (~v61 + v61 * 2 & v62) + (v62 + (0xffffffffffffffff ^ v62 * 2) | -v61);
    v64 = v63 + 1;
    v65 = (((0xfffffffffffffffe - v63 | 59411) ^ v63 + 2) + ((0xfffffffffffffffe - v63 | 59411) & v63 + 2) * 2 ^ (v64 | 59411) + 1) + (((0xfffffffffffffffe - v63 | 59411) ^ v63 + 2) + ((0xfffffffffffffffe - v63 | 59411) & v63 + 2) * 2 & (v64 | 59411) + 1) * 2;
    v0 = ~v65 + v65 * 2;
    v1 = (v64 | 1) + (v64 & 1) + 6123;
    v66 = (unsigned short)v0 + (unsigned short)~(unsigned int)v1 + (unsigned short)v1 * 2;
    v67 = v58 + ~v58 * 2 + 1;
    g_f120c4 = v66 + (unsigned short)v58 + (unsigned short)v67 + ((unsigned short)(0xfffffffe - v66) | (unsigned short)~v67) + 3;
    v68 = v1;
    v69 = v0;
    v70 = v69 + v68 + (-v69 & ~v68) * 2 + (v68 - v69 - (v68 | -v69)) * 2;
    v71 = ((v68 + ~v68 * 2 + 1 | ~v69) + v69) * 2 + 2;
    v72 = v70 + (v71 | ~v70) + (v71 | v70) + 1;
    v73 = (-((v69 + 1 ^ (v68 | ~v69)) + (v69 + 1 & (v68 | ~v69)) * 2) ^ v69 + 1 + (v68 | ~v69) + (v69 ^ v68)) + (-((v69 + 1 ^ (v68 | ~v69)) + (v69 + 1 & (v68 | ~v69)) * 2) & v69 + 1 + (v68 | ~v69) + (v69 ^ v68)) * 2;
    v74 = v73 + v72 + (v72 & -v73) * 4 + (0xffffffffffffffff ^ (v72 & -v73) * 2) + ((v73 - 1 & v72) - (v73 + v72)) * 2;
    v75 = v74 + 2;
    v76 = v75 * 2;
    v77 = v76 + ~v75;
    v78 = 0xffffffff ^ (unsigned int)v77 * 2;
    v0 = v77 + (v77 & 3) + (v77 + 3 ^ -(v77 | 3)) + (v77 + 3 & -(v77 | 3)) * 2 + (v78 & 6) - 3;
    v1 = v75 + (0xfffffffffffffffe - v74 | 45) + v77 + ((v75 - v76 | 45) ^ v75) + ((v75 - v76 | 45) & v75) * 2 + (v78 & 90) - 45;
    g_f120c6 = v3 >> ((char)v1 + v0 & 63);
    v79 = g_f045e0 + (g_f120c0 | ~g_f045e0) + (g_f120c0 ^ g_f045e0);
    v80 = g_f045e0 + 1;
    v81 = v80 + ~g_f045e0 * 2 | g_f120c0;
    g_f045e0 = v79 + 1 + ((unsigned short)v81 ^ (unsigned short)v80) + ((unsigned short)v81 & (unsigned short)v80) * 2 + ((unsigned short)(v79 + 1 - ((v81 ^ v80) + (v81 & v80) * 2) - (v79 + 1 | -((v81 ^ v80) + (v81 & v80) * 2))) + ((unsigned short)-((v81 ^ v80) + (v81 & v80) * 2) & (unsigned short)(0xfffffffe - v79))) * 2;
    v82 = (0xffffffff ^ g_f045e2 * 2) + g_f045e2;
    v83 = v82 + g_f120c2;
    v84 = -(v82 | g_f120c2);
    g_f045e2 = g_f045e2 + g_f120c2 + ~g_f120c2 * 2 + (unsigned short)~((v83 & v84) * 4 + (v83 ^ v84) * 2) + (((unsigned short)v83 & (unsigned short)v84) * 4 + ((unsigned short)v83 ^ (unsigned short)v84) * 2) * 2 + 3;
    v85 = g_f045e4 - g_f120c4;
    v86 = (g_f045e4 * 3 + ~g_f045e4 * 4 + 3 & g_f120c4) * 2;
    g_f045e4 = (unsigned short)v85 + (unsigned short)v86 + ((unsigned short)v86 | (unsigned short)~v85) + ((unsigned short)v85 & (unsigned short)~v86) + 1;
    v87 = (unsigned int)(g_f045e6 - g_f120c6) + (g_f120c6 & g_f045e6) + (g_f120c6 & ~g_f045e6) * 2;
    v88 = (g_f045e6 + ~g_f045e6 * 2 + 1 | g_f120c6) + g_f045e6;
    g_f045e6 = ((unsigned short)v88 ^ (unsigned short)~v87) + ((unsigned short)v87 & (unsigned short)~v88) * 2;
    v89 = g_f045e8 + 1;
    v90 = v89 + ~g_f045e8 * 2;
    v91 = v90 + 1;
    v92 = v91 + ~v90 * 2 | v3;
    v93 = (g_f045e8 ^ -v3) + (v89 + (-v3 | ~g_f045e8)) * 2;
    g_f045e8 = v93 + ((v92 & v91) * 4 + (v92 ^ v91) * 2 | ~v93) + ((v92 & v91) * 4 + (v92 ^ v91) * 2 | v93) + 1;
    v94 = v1;
    v95 = *(unsigned int *)&v0;
    v96 = (v95 | v94) + ((v94 + 1 + ~v94 * 2 | v95) ^ ~v94 * 2 + v94) - ((v94 + 1 + ~v94 * 2 | v95) & v94 + 1) * 2;
    v97 = v96 + 1 | (v96 + 1) * 0x100000000;
    v98 = (__m128i)_INSERT(__float_as_int(__int_as_float(v94)), 4, v95);
    v99 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(v97, v98));
    v100 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v97, v98));
    v101 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(_mm_setzero_si128(), v99));
    v103 = __dirty_unsupported_Iop_ZeroHI64ofV128(v100 & v101);
    v105 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v103, v103)), __dirty_unsupported_Iop_ZeroHI64ofV128(v101 ^ v100)));
    v106 = __dirty_unsupported_Iop_ZeroHI64ofV128(~v105);
    v109 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v105, __dirty_unsupported_Iop_ZeroHI64ofV128(~v99)));
    v110 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v109, __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v106, v106))));
    v111 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v110, _mm_set_epi32(0, 0, 1, 3)));
    v112 = _mm_cvtsi128_si32(v110);
    v113 = v112 + 1;
    v114 = *(unsigned int *)((void*)&v111 + 4);
    v115 = 0xfffffffe - v112;
    v116 = v112 + v115 * 2 + 2;
    v117 = (v113 + v114 ^ -(v113 | v114)) + (v113 + v114 & -(v113 | v114)) * 2;
    v118 = (unsigned int)v111 + (v116 & v114) + v117 + ~v117 * 2;
    v119 = _mm_extract_epi32(v110, 1) + v113 + (v116 | (unsigned int)(0xfffffffe - _mm_extract_epi32(v110, 1))) + (v115 & v114) - v114 + 2;
    v120 = v119 + ~v119 * 2 + 1;
    return (v118 | v120) + (v120 & v118) + 1;
}
