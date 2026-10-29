/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x507de8..0x508798 (2480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_507de8_0 {
    char field_0;
} st_507de8_0;

extern unsigned short g_f04530;
extern unsigned short g_f04532;
extern unsigned short g_f04534;
extern unsigned short g_f04536;
extern unsigned long long g_f04538;
extern unsigned short g_f12068;
extern unsigned short g_f1206a;
extern unsigned short g_f1206c;
extern unsigned short g_f1206e;

int sub_507de8(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v12;  // x14
    unsigned long long v102;  // x11
    unsigned long long v13;  // x15
    unsigned long long v14;  // x10
    unsigned long long v15;  // x12
    unsigned long long v16;  // x14
    unsigned long v17;  // x15
    unsigned long long v18;  // x12
    unsigned long long v19;  // x14
    unsigned long long v20;  // x16
    unsigned long long v21;  // x15
    unsigned long long v4;  // x12
    unsigned long v22;  // x14
    unsigned int v23;  // w12
    unsigned int v24;  // w14
    unsigned int v25;  // w16
    unsigned int v26;  // w17
    unsigned int v27;  // w12
    unsigned int v28;  // w14
    unsigned short v29;  // x12
    unsigned short v30;  // x11
    unsigned long v31;  // x12
    unsigned long long v5;  // x8
    unsigned long long v32;  // x14
    unsigned long v33;  // x15
    unsigned long long v34;  // x16
    unsigned long long v35;  // x17
    unsigned long long v36;  // x16
    unsigned long long v37;  // x15
    unsigned long long v38;  // x14
    unsigned long long v39;  // x15
    unsigned long long v40;  // x14
    unsigned long long v41;  // x14
    unsigned long long v6;  // x11
    unsigned long long v42;  // x15
    unsigned long long v43;  // x14
    unsigned long long v44;  // x13
    unsigned int v45;  // w13
    unsigned long long v46;  // x14
    unsigned long long v47;  // x16
    unsigned long long v48;  // x0
    unsigned long long v49;  // x1
    unsigned long long v50;  // x14
    unsigned long long v51;  // x16
    unsigned long long v7;  // x8
    unsigned long long v52;  // x15
    unsigned long long v53;  // x14
    unsigned long long v54;  // x14
    unsigned long long v55;  // x15
    unsigned int v56;  // w15
    unsigned int v57;  // w14
    unsigned int v58;  // w15
    unsigned int v59;  // w14
    unsigned long v60;  // x14
    unsigned long v61;  // x15
    st_507de8_0 *v8;  // x10
    unsigned long long v62;  // x16
    unsigned long long v63;  // x14
    unsigned long long v64;  // x15
    __m128i v65;  // q0
    __m128i v66;  // q1
    __m128i v67;  // q0
    __m128i v68;  // q2
    unsigned long long v70;  // x16
    unsigned int v71;  // w15
    st_507de8_0 **v9;  // x12
    unsigned long long v72;  // x16
    unsigned long long v73;  // x17
    unsigned long long v74;  // x0
    unsigned long long v75;  // x3
    unsigned long long v76;  // x2
    unsigned long long v77;  // x5
    unsigned long long v78;  // x1
    unsigned long long v79;  // x16
    unsigned long long v80;  // x12
    unsigned long long v81;  // x16
    st_507de8_0 *v10;  // x13
    unsigned long long v82;  // x1
    unsigned long v83;  // x12
    unsigned long v84;  // x15
    unsigned long long v85;  // x16
    unsigned long long v86;  // x15
    unsigned long long v87;  // x15
    unsigned long long v88;  // x15
    unsigned long v89;  // x16
    unsigned long long v90;  // x0
    unsigned long long v91;  // x17
    st_507de8_0 *v11;  // x16
    char v92;  // x15
    unsigned int v93;  // w15
    unsigned short v94;  // x17
    unsigned int v95;  // w11
    unsigned short v96;  // x11
    unsigned short v97;  // x10
    unsigned int v98;  // w12
    unsigned int v99;  // w13
    unsigned int v100;  // w12
    unsigned int v101;  // w10
    st_507de8_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_507de8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long, unsigned long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04530 + ~(~&g_f04530 + &g_f04530));
    v3 = v2 >> 29;
    v4 = v2 | v3;
    v5 = ~v2 - (v3 | ~v2);
    v6 = v4 ^ v5;
    v7 = v6 + (v4 & v5) * 2;
    v8 = v1;
    v9 = v0;
    v10 = ~v8;
    v11 = v8 + 1;
    v12 = v11 + v9 + ~v9 * 2 + (v8 * 3 + v10 * 4 + (0x7ffffffffffffffc - (v8 * 3 + v10 * 4) | v9)) * 2;
    v13 = v12 + 9;
    v14 = (v9 & v8) - (char *)v8 - ((char *)v11 + 0x2 * v10 & v9);
    v15 = (v13 | v14) + ~((0xfffffffffffffff6 - v12 | v14) + v13);
    v16 = 1 | (v13 & v14) * 2;
    v17 = v15 ^ v16;
    v18 = v15 & v16;
    v19 = v17 + v18 * 2;
    v20 = v19 - 1;
    v21 = (v19 + 35694 ^ -(v20 | 35695)) + (v19 + 35694 & -(v20 | 35695)) * 2;
    v22 = (-v19 | 35695) + v19 + (v20 ^ 35695);
    v0 = ((v17 + (v18 - v19) * 2 | 29840) ^ -(v17 + (v18 - v19) * 2)) + (v20 | 29840) + ((v17 + (v18 - v19) * 2 | 29840) & -(v17 + (v18 - v19) * 2)) * 2;
    v1 = v21 + (v22 | ~v21) + (v21 | v22) + 1;
    v23 = v0;
    v24 = v1;
    v25 = v24 + 1;
    v26 = v25 + v23;
    v27 = (unsigned int)((v25 + ~v24 * 2 | v23) - (v26 + v25 + ~v24 * 2)) + (v26 + v25 + ~v24 * 2 + ~(v25 + ~v24 * 2 | v23)) * 2 + 2;
    v28 = 1 | (unsigned int)~v7 * 2;
    v29 = ((unsigned short)v27 ^ (unsigned short)v26 + (unsigned short)~(v24 | v23)) + ((unsigned short)v27 & (unsigned short)v26 + (unsigned short)~(v24 | v23)) * 2 + (unsigned short)v28 + (unsigned short)v7 + ((unsigned short)-((v27 ^ v26 + ~(v24 | v23)) + (v27 & v26 + ~(v24 | v23)) * 2) | (unsigned short)~(v28 + (unsigned int)v7));
    v30 = (2 & ~((unsigned int)v6 * 2)) + ((unsigned int)v7 ^ 0xfffffffe) - v28;
    g_f12068 = (v29 ^ v30) + (v29 & v30) * 2;
    v31 = v1;
    v32 = v0;
    v33 = ~v31;
    v34 = v31 - v32 + ~((v32 + v33 & -(v32 | ~v31)) * 4 + (v32 + v33 ^ -(v32 | ~v31)) * 2) + ((v32 + v33 & -(v32 | ~v31)) * 4 + (v32 + v33 ^ -(v32 | ~v31)) * 2) * 2;
    v35 = v34 + 2;
    v36 = v34 + 1;
    v37 = (v32 * 3 + ~v32 * 4 + 3 & v31) * 2;
    v38 = v31 + v33 * 2 + v32 + v37 + (0xfffffffffffffffd - (v31 + v33 * 2 + v32) | ~v37) + (v37 & v31 + v33 * 2 + v32 + 2);
    v39 = v38 + v35 + 3;
    v40 = (v38 + 2 | v36) - v39 + 1;
    v41 = (((v40 & v35) * 4 + (v40 ^ v35) * 2 | 1) ^ v39 + ((v36 | 0xfffffffffffffffd - v38) - v35) * 2 + 1) + (((v40 & v35) * 4 + (v40 ^ v35) * 2 | 1) & v39 + ((v36 | 0xfffffffffffffffd - v38) - v35) * 2 + 1) * 2;
    v42 = ~v41 + v41 * 2;
    v43 = -(unsigned int)v41 | 0xfffffffffffffff8;
    v44 = ((v42 + 9 ^ -(v42 | 9)) + (v42 + 9 & -(v42 | 9)) * 2 ^ (v42 & 0xfffffffffffffff6) + 10) + ((v42 + 9 ^ -(v42 | 9)) + (v42 + 9 & -(v42 | 9)) * 2 & (v42 & 0xfffffffffffffff6) + 10) * 2;
    v0 = v42 + 8 + (v42 | v43) + (v42 + 8 & v43) + (0xfffffffffffffff8 & ~v42);
    v1 = ~v44 + v44 * 2;
    v45 = v7 >> (((char)v1 + (char)v0 ^ (char)-(v1 | v0)) + ((char)v1 | (char)v0) + ((char)v1 + (char)v0 & (char)-(v1 | v0)) * 2 & 63);
    v46 = v1;
    v47 = v0;
    v48 = ((1 | (v47 - v46 + (v46 & ~v47)) * 2) ^ v46 - v47) + ((1 | (v47 - v46 + (v46 & ~v47)) * 2) & v46 - v47) * 2;
    v49 = ~v48 + v48 * 2;
    v50 = (v47 ^ -v46) + (v46 + ~v47 & -(v46 | ~v47)) * 4 + (v47 - v46 - (v47 | -v46) + (v46 + ~v47 ^ -(v46 | ~v47))) * 2;
    v51 = v50 + 1;
    v52 = v49 + v51 - (v48 + v50 + (-v48 | -v50)) * 2;
    v53 = (v51 + ~v50 * 2 | 1) + (v51 & 1) & v49;
    v54 = (v53 * 2 | -v52) - (v52 - 1 & v53 * 2) + (v52 + v53) * 2;
    v55 = v54 - 1;
    v0 = ((-v54 & 0xffffffffffff40e8) + v54 + 48919 ^ v54 + 48919 - (v55 & 48919)) + ((-v54 & 0xffffffffffff40e8) + v54 + 48919 & v54 + 48919 - (v55 & 48919)) * 2 - 1;
    v1 = ((v55 | 1) + (v55 & 1) + 16616 | 1) + ((v55 | 1) + (v55 & 1) + 16616 & 1) - 2;
    v56 = ((unsigned int)v1 ^ 1) + (unsigned int)v1 * 2 + ~(unsigned int)v1 * 4 + ((unsigned int)v1 * 2 & 2);
    v57 = v56 + v0 + (v0 + ((unsigned int)(0xfffffffe - v56) | ~v0) + ((unsigned int)(0xfffffffe - v56) & ~v0)) * 2 + 3;
    v58 = (v45 ^ 1) + ~v45 * 2 + (__ROL__(v45, 1) & 2 & 3);
    v59 = v58 + (v57 | ~v58) + (v57 ^ v58) + 1;
    g_f1206a = v59 - v45 + (v45 + 1 & ~v59 | v59 & v45 + 1) * 2 - 1;
    v60 = v1;
    v61 = v0;
    v62 = (v60 ^ -v61) + (v60 - v61 - (v60 | -v61) + ((v60 ^ 1) + ~v60 * 2 + ((v60 * 2 | v60 >> 63) & 2 & 3) & v61)) * 2;
    v63 = v61 + v60 - (v61 & v60) + ((v61 | v60) - 1 ^ v61 + v60) - (v61 + v60 & -(v61 | v60)) * 2;
    v64 = ((v63 & v62) - (v63 + 1) ^ v63 + 1 - v62 + (v62 | ~v63)) + (((v63 + 2 + ~(v63 + 1) * 2 | 1) + (v63 + 2 & 1) & v62) + ((v63 & v62) - (v63 + 1) & v63 + 1 - v62 + (v62 | ~v63))) * 2;
    v65 = (__m128i)(CONCAT(v64, v64));
    v66 = _mm_add_epi64(v65, _mm_set_epi64x(13, 14));
    v67 = _mm_and_si128(v65, _mm_set_epi64x(-14, 13));
    v68 = _mm_add_epi64(v66, _mm_xor_si128(_mm_set_epi64x(-14, -1), v67));
    v0 = v64 + 19;
    v1 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(v68, _mm_unpackhi_epi64(v68, v68))) + (0xfffffffffffffffe - _mm_extract_epi64(v68, 1) | _mm_cvtsi128_si64(v68)) + (_mm_extract_epi64(v68, 1) + 1 & _mm_cvtsi128_si64(v67) - _mm_cvtsi128_si64(v66)) + 2;
    v70 = v1 + ~v1 * 2 + 1;
    v71 = v7 >> ((char)v0 + (char)v70 + (char)~v70 * 2 + 1 & 63);
    v72 = v1;
    v73 = v0;
    v74 = v73 + v72;
    v75 = v72 + 1;
    v76 = v75 + ~v72 * 2;
    v77 = v73 | v72;
    v78 = v74 + (v73 + ~v73 * 2 + 1 | v76) + (v73 + ~v77 ^ 0xfffffffffffffffe - v72) - (v73 + ~v77 & v75) * 2;
    v79 = (v76 & v73) + v72 + (v77 - 1 ^ v74) - (v74 & -v77) * 2;
    v80 = (v78 + 2 | ~v79) - (v78 + 2 & ~v79) + ~(((0xfffffffffffffffd - v78 & v79) + ~v79 & v78 + 3) * 4 + ((0xfffffffffffffffd - v78 & v79) + ~v79 ^ v78 + 3) * 2) + (((0xfffffffffffffffd - v78 & v79) + ~v79 & v78 + 3) * 4 + ((0xfffffffffffffffd - v78 & v79) + ~v79 ^ v78 + 3) * 2) * 2 + 2;
    v81 = ~v80 + v80 * 2;
    v82 = (v81 + 48621 ^ -(v81 | 48621)) + (v81 + 48621 & -(v81 | 48621)) * 2;
    v83 = v81 + (-(unsigned int)v80 & 48621);
    v0 = v81 + 16914;
    v1 = v83 + v82 + (v83 | ~v82) + (v82 & ~v83) + 1;
    g_f1206c = -(v71 & ~((unsigned int)v1 + (unsigned int)v0)) - (v71 - v71 * 2);
    v84 = v1;
    v85 = v0;
    v86 = v84 + (v84 + ~v84 * 2 + 1 & v85) - (v85 + (v85 + ~v85 * 2 + 1 | v84));
    v87 = ((v86 | 1) + (v86 & 1) - 2 ^ 1) + (v85 ^ v84) + ~((v86 | 1) + (v86 & 1) - 2) * 2 + ((((v86 | 1) + (v86 & 1) - 2) * 2 | (v86 | 1) + (v86 & 1) - 2 >> 63) & 2 & 3);
    v0 = v87 + 0x11;
    v1 = v87 + (v87 + 1 ^ 0xffffffffffffffdf) + (v87 + 1 | 32) + (~((unsigned int)v87 + 1) & 32) + 2;
    v88 = v0;
    v89 = v1;
    v90 = v88 + 1;
    v91 = ((v89 | ~v88) ^ v90) + ((v89 | ~v88) & v90) * 2;
    v92 = (char)v90 + (char)v89 + ((char)v89 + (char)~v89 * 2 + 1 | (char)~v88);
    g_f1206e = v7 >> ((char)v91 + (v92 | (char)~v91) + ((char)v91 | v92) + 1 & 63);
    v93 = g_f04530;
    v94 = g_f12068 | (unsigned short)v93;
    v95 = -g_f12068;
    g_f04530 = ((unsigned short)v95 ^ (unsigned short)v93) + (v94 & (unsigned short)-v93) * 4 + ((unsigned short)v93 + ((unsigned short)v95 | (unsigned short)~v93) + (v94 ^ (unsigned short)-v93)) * 2 + 2;
    v96 = g_f04532 + g_f1206a + ~g_f1206a * 2 + 2;
    v97 = 1 | (g_f1206a & ~g_f04532) * 2;
    g_f04532 = (v97 ^ v96) + (v97 & v96) * 2 - 1;
    g_f04534 = (g_f1206c | g_f04534) + (unsigned short)~((g_f04534 | ~g_f1206c) + g_f1206c);
    v98 = g_f04536 + ~g_f04536 * 2 + 1;
    v99 = v98 + g_f1206e;
    v100 = -(v98 | g_f1206e);
    v101 = (unsigned int)(g_f04536 - g_f1206e) + ~((v99 & v100) * 4 + (v99 ^ v100) * 2) + ((v99 & v100) * 4 + (v99 ^ v100) * 2) * 2 + 2;
    g_f04536 = (unsigned short)~v101 + (unsigned short)v101 * 2;
    v102 = (g_f04538 ^ 1) + ~g_f04538 * 2 + ((g_f04538 * 2 | g_f04538 >> 63) & 2 & 3);
    g_f04538 = (g_f04538 ^ -v7) + (v102 + v7 & ~(v102 + v7 + (~v102 | ~v7))) * 4 + (g_f04538 - v7 - (g_f04538 | -v7) + (v102 + v7 + (~v102 | ~v7) ^ ~(v102 + v7))) * 2;
    return v95 ^ v93;
}
