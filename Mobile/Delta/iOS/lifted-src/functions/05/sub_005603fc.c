/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5603fc..0x561368 (3948 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5603fc_0 {
    char field_0;
} st_5603fc_0;

extern unsigned short g_f04978;
extern unsigned short g_f0497a;
extern unsigned short g_f0497c;
extern unsigned short g_f0497e;
extern unsigned short g_f04980;
extern unsigned short g_f04982;
extern unsigned short g_f04984;
extern unsigned short g_f04986;
extern unsigned long long g_f04988;

int sub_5603fc(void)
{
    st_5603fc_0 *v4;  // x8
    st_5603fc_0 **v5;  // x10
    unsigned long long v14;  // x12
    unsigned long long v104;  // x1
    unsigned long long v105;  // x1
    __m128i v106;  // q0
    __m128i v107;  // q2
    __m128i v108;  // q2
    __m128i v109;  // q0
    __m128i v110;  // q0
    unsigned long long v111;  // x17
    unsigned long long v112;  // x0
    unsigned long long v113;  // x2
    unsigned long long v15;  // x13
    unsigned long long v114;  // x4
    unsigned long long v115;  // x1
    unsigned long long v116;  // x1
    unsigned long long v117;  // x17
    unsigned long long v118;  // x10
    unsigned long long v119;  // x10
    unsigned long long v120;  // x10
    unsigned long v121;  // x10
    unsigned long long v122;  // x10
    unsigned short v123;  // x1
    unsigned long long v16;  // x9
    unsigned int v124;  // w10
    unsigned short v125;  // x10
    unsigned short v126;  // x13
    unsigned int v127;  // w16
    unsigned int v128;  // w10
    unsigned short v129;  // x10
    unsigned short v130;  // x10
    unsigned short v131;  // x13
    unsigned int v132;  // w9
    unsigned int v133;  // w10
    unsigned long v17;  // x10
    unsigned int v134;  // w12
    unsigned int v135;  // w11
    unsigned int v136;  // w11
    unsigned int v137;  // w12
    unsigned int v138;  // w11
    unsigned int v139;  // w9
    unsigned int v140;  // w13
    unsigned int v141;  // w10
    unsigned int v142;  // w11
    unsigned int v143;  // w10
    unsigned long long v18;  // x10
    unsigned int v144;  // w11
    unsigned int v145;  // w12
    unsigned int v146;  // w8
    unsigned int v147;  // w8
    unsigned int v148;  // w8
    unsigned long long v19;  // x10
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
    unsigned long long v32;  // x15
    unsigned long long v33;  // x16
    unsigned long long v7;  // x12
    unsigned long long v34;  // x17
    unsigned long long v35;  // x12
    unsigned long long v36;  // x11
    unsigned long long v37;  // x12
    unsigned long v38;  // x13
    unsigned long long v39;  // x0
    unsigned long long v40;  // x16
    unsigned long long v41;  // x15
    unsigned long long v42;  // x16
    unsigned long long v43;  // x12
    unsigned long long v8;  // x14
    unsigned long long v44;  // x13
    unsigned long long v45;  // x13
    unsigned long long v46;  // x12
    unsigned long long v47;  // x13
    unsigned long long v48;  // x12
    unsigned long long v49;  // x15
    unsigned long long v50;  // x12
    unsigned long long v51;  // x13
    char v52;  // x15
    char v53;  // x12
    unsigned long long v9;  // x12
    unsigned long long v54;  // x12
    unsigned long long v55;  // x12
    st_5603fc_0 *v56;  // x13
    st_5603fc_0 **v57;  // x15
    unsigned long long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x13
    unsigned long long v61;  // x13
    unsigned short v62;  // x13
    unsigned long long v63;  // x15
    unsigned long long v10;  // x10
    unsigned long v64;  // x16
    unsigned long v65;  // x17
    unsigned long long v66;  // x2
    unsigned long long v67;  // x0
    unsigned long long v68;  // x0
    unsigned long long v69;  // x15
    unsigned long long v70;  // x17
    unsigned long long v71;  // x15
    unsigned long long v72;  // x15
    char v73;  // x16
    unsigned long long v11;  // x8
    char v74;  // x17
    char v75;  // x15
    unsigned int v76;  // w15
    unsigned long long v77;  // x16
    unsigned long long v78;  // x17
    unsigned long long v79;  // x16
    unsigned long long v80;  // x17
    unsigned long long v81;  // x16
    unsigned long long v82;  // x14
    unsigned int v83;  // w14
    unsigned long long v12;  // x10
    unsigned int v84;  // w16
    unsigned int v85;  // w14
    unsigned int v86;  // w14
    unsigned long long v87;  // x15
    unsigned long long v88;  // x17
    unsigned long long v89;  // x1
    unsigned long long v90;  // x2
    unsigned long long v91;  // x0
    unsigned long long v92;  // x4
    unsigned long long v93;  // x16
    unsigned long long v13;  // x11
    unsigned long long v94;  // x15
    unsigned long long v95;  // x15
    unsigned long long v96;  // x16
    unsigned long long v97;  // x0
    unsigned long long v98;  // x16
    unsigned long v99;  // x0
    unsigned long v100;  // x16
    unsigned long v101;  // x1
    unsigned long v102;  // x2
    unsigned long long v103;  // x4
    st_5603fc_0 **v0;  // [bp-0x20], Other Possible Types: char, unsigned long long
    st_5603fc_0 *v1;  // [bp-0x18], Other Possible Types: unsigned long, unsigned long long
    st_5603fc_0 **v2;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_5603fc_0 *v3;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v4 = v3;
    v5 = v2;
    v6 = (v4 - v5 | ((0xfffffffffffffffc - (v4 * 3 + ~v4 * 4) | v5) & v4 * 3 + ~v4 * 4 + 4) * 4 + ((0xfffffffffffffffc - (v4 * 3 + ~v4 * 4) | v5) ^ v4 * 3 + ~v4 * 4 + 4) * 2) + (((0xfffffffffffffffc - (v4 * 3 + ~v4 * 4) | v5) & v4 * 3 + ~v4 * 4 + 4) * 4 + ((0xfffffffffffffffc - (v4 * 3 + ~v4 * 4) | v5) ^ v4 * 3 + ~v4 * 4 + 4) * 2 & v4 - v5);
    v7 = v5 * 2;
    v8 = v5 + v4;
    v9 = v7 - (v8 + (v5 | ~v4));
    v10 = (v9 & v8 + ~v7) * 4 + (v9 ^ v8 + ~v7) * 2;
    v11 = (v5 ^ -v4) + ((char *)v5 + (-v4 | ~v5)) * 2 + ~v10 + 4;
    v12 = (v6 ^ -((v11 & 1) + (-(v11 + v10 * 2) | 1))) + ~(((1 - (v11 + v10 * 2) | ~v6) & v6 + 1) * 4 + ((1 - (v11 + v10 * 2) | ~v6) ^ v6 + 1) * 2) + (((1 - (v11 + v10 * 2) | ~v6) & v6 + 1) * 4 + ((1 - (v11 + v10 * 2) | ~v6) ^ v6 + 1) * 2) * 2 + (v6 + 1 + ~v6 * 2 + ((v11 & 1) + (-(v11 + v10 * 2) | 1) | ~(v6 + 1 + ~v6 * 2)) + (v6 & -((v11 & 1) + (-(v11 + v10 * 2) | 1)))) * 2;
    v13 = v12 + 4;
    v14 = ~v13 + v13 * 2;
    v15 = ((v14 | 4) + 1 ^ v14 & 4) + ((v14 | 4) + 1 & v14 & 4) * 2;
    v16 = (((0xfffffffffffffffc - v12 | 29) ^ v13) + ((0xfffffffffffffffc - v12 | 29) & v13) * 2 ^ (v14 | 29) + 1) + (((0xfffffffffffffffc - v12 | 29) ^ v13) + ((0xfffffffffffffffc - v12 | 29) & v13) * 2 & (v14 | 29) + 1) * 2;
    v2 = ~v15 + v15 * 2;
    v3 = ~v16 + v16 * 2;
    v17 = 15747448 >> ((char)((((char)~v3 + (char)v3 * 2 + 2 ^ (char)v2) + (~v3 + v3 * 2 + 2 & v2) * 2 | 1) + (((char)~v3 + (char)v3 * 2 + 2 ^ (char)v2) & 1) - 2) & 63);
    v18 = (((char *)~&g_f04978 + v17 + (15747448 & ~v17)) * 2 + 3 ^ (char *)&g_f04978 + v17 + 2 * ~v17 + 2) + (((char *)~&g_f04978 + v17 + (15747448 & ~v17)) * 2 + 3 & (char *)&g_f04978 + v17 + 2 * ~v17 + 2) * 2;
    v19 = v3;
    v20 = v2;
    v21 = v19 + 1;
    v22 = (v20 | ~v19) + v21 + (v20 ^ v19);
    v23 = ((v21 + ~v19 * 2 | v20) ^ v21) + ((v21 + ~v19 * 2 | v20) & v21) * 2;
    v24 = v22 + v23 + (-v23 & ~v22) * 2 + (v22 - (v23 + (v22 | -v23))) * 2;
    v25 = (v20 ^ -v19) + (v20 + (-v19 | ~v20)) * 2 + 2;
    v26 = (0xffffffffffffffff ^ (v19 & ~v20) * 2) + (v19 & ~v20) * 4 + 2;
    v27 = ~((v25 ^ v26) + (v25 & v26) * 2) + ((v25 ^ v26) + (v25 & v26) * 2) * 2;
    v28 = (v24 ^ v27) + (v24 & v27) * 2 - (v24 + v27 + (-v27 | ~v24)) * 2 - 2;
    v29 = (v24 - v27 + (v27 - 1 & ~v24)) * 2 + 3;
    v30 = v29 ^ v28;
    v31 = v29 & v28;
    v32 = v30 + v31 * 2;
    v33 = v32 - 1;
    v34 = -v32;
    v35 = v32 + 6591040075048873163 + (v30 + (v31 - v32) * 2 | 11855703998660678452);
    v2 = v32 + (v34 | 6591040075048873163) + (v34 | 6591040075048873163) + v33 + v35 + (v35 | 0xfffffffffffffffe - ((v34 | 6591040075048873163) + v33)) + (0xfffffffffffffffe - ((v34 | 6591040075048873163) + v33) | ~v35) + 3;
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
    v54 = v36 >> ((char)(v53 + v52 * 2 + (0xfffffffffffffffe - v52 | v53) - (v52 + 1 & v53)) + 3 & 63);
    v55 = (v36 ^ -v54) + (v36 - (v54 + (v36 | -v54))) * 2 + (v36 + (0xffffffffffffffff ^ v36 * 2) + v54 & -(v36 + (0xffffffffffffffff ^ v36 * 2) | v54)) * 4 + (v36 + (0xffffffffffffffff ^ v36 * 2) + v54 ^ -(v36 + (0xffffffffffffffff ^ v36 * 2) | v54)) * 2;
    v56 = v1;
    v57 = v0;
    v58 = v57 | v56;
    v59 = -((v57 + v56 ^ -v58) + (v57 + v56 & -v58) * 2);
    v60 = (v57 ^ -v56) + ((char *)v57 + (-v56 | ~v57) + 1) * 2 + ~(((char *)v57 + 0x2 * ~v57 + 1 + v56 & -((char *)v57 + 0x2 * ~v57 + 1 | v56)) * 4 + ((char *)v57 + 0x2 * ~v57 + 1 + v56 ^ -((char *)v57 + 0x2 * ~v57 + 1 | v56)) * 2) + (((char *)v57 + 0x2 * ~v57 + 1 + v56 & -((char *)v57 + 0x2 * ~v57 + 1 | v56)) * 4 + ((char *)v57 + 0x2 * ~v57 + 1 + v56 ^ -((char *)v57 + 0x2 * ~v57 + 1 | v56)) * 2) * 2;
    v61 = (~(v60 + 2) + (v60 + 2) * 2 ^ (v59 ^ v58) + (v59 & v58) * 2) + (~(v60 + 2) + (v60 + 2) * 2 & (v59 ^ v58) + (v59 & v58) * 2) * 2 + (((v59 ^ ~v58) - (v59 & v58) * 2 | ~v60) + (v59 ^ v58) + (v59 & v58) * 2) * 2 + ((~(v60 + 2) + (v60 + 2) * 2 - 1 & (v59 ^ v58) + (v59 & v58) * 2) - (~(v60 + 2) + (v60 + 2) * 2 + (v59 ^ v58) + (v59 & v58) * 2)) * 2;
    v0 = (v61 + 2 ^ 17073) + (34146 & (v61 + 2) * 2) - 1;
    v1 = v61 + 48465;
    v62 = ((unsigned short)~v0 & (unsigned short)~(unsigned int)v1) + ((unsigned short)v1 & v0) + ((unsigned short)v1 | v0) * 2;
    g_f0497a = ((unsigned int)v55 & (unsigned int)(0xfffe - v62)) + v62 + 1 + ((unsigned int)v55 & v62 + 1) - ((unsigned int)v55 | v62 + 1);
    v63 = v1;
    v64 = v0;
    v65 = -v64;
    v66 = v63 * 2;
    v67 = (v63 ^ 1) + ~v63 * 2 + (v66 & 2);
    v68 = ~(v67 + v64 + (v63 | v65)) + v63 + v67 + 0x8000000000000000 + (v67 + 0x8000000000000000 & v64);
    v69 = ((v63 ^ v65) + v68 * 2 + 2 ^ v66 - (v64 + v63 + ((v64 | v63) & v65) * 4 + ((v64 | v63) ^ v65) * 2)) + ((v63 ^ v65) + v68 * 2 + 2 & v66 - (v64 + v63 + ((v64 | v63) & v65) * 4 + ((v64 | v63) ^ v65) * 2)) * 2;
    v70 = (0xfffffffffffffff2 - (v69 & 0xfffffffffffffff1) ^ v69 + 14) + (0xfffffffffffffff2 - (v69 & 0xfffffffffffffff1) & v69 + 14) * 2;
    v71 = ((v69 ^ 2) + v69 + (~v69 | 2) + 2 ^ (v69 | 0xfffffffffffffffd) + 3) + ((v69 ^ 2) + v69 + (~v69 | 2) + 2 & (v69 | 0xfffffffffffffffd) + 3) * 2;
    v0 = (v70 | v69 | 14) + (v70 & (v69 | 14));
    v1 = ~v71 + v71 * 2;
    v72 = v0;
    v73 = v1;
    v74 = ((char)v72 + (char)~v72 * 2 + 1 | v73) + (char)v72;
    v75 = (char)(v72 - v73) + (v73 & (char)v72) + (v73 & (char)~v72) * 2;
    v76 = v55 >> (v74 + ((char)(0xfffffffffffffffe - v74) | v75) + (v74 + 1 | v75) + 2 & 63);
    v77 = v1;
    v78 = v0;
    v79 = v78 | v77;
    v80 = (v78 + v77 ^ -v79) + (v78 + v77 & -v79) * 2;
    v81 = v80 + v79 + (-v80 & ~v79) * 2 + (v79 + (-v80 | ~v79)) * 2;
    v82 = ((v81 + 1 & (v78 ^ v77)) - (v81 + 2) ^ v81 + 2 - (v78 ^ v77) + (v78 ^ v77 | 0xfffffffffffffffe - v81)) + (~((v78 ^ v77) - (v81 + 2)) - (v81 + 1 | ~(v78 ^ v77)) & (v78 ^ v77) - (v81 + 2)) * 4 + ((~((v78 ^ v77) - (v81 + 2)) - (v81 + 1 | ~(v78 ^ v77)) ^ (v78 ^ v77) - (v81 + 2)) + ((v81 + 1 & (v78 ^ v77)) - (v81 + 2) & v81 + 2 - (v78 ^ v77) + (v78 ^ v77 | 0xfffffffffffffffe - v81))) * 2;
    v0 = v82 + 51842;
    v1 = v82 + 13693;
    v83 = (unsigned int)v1 | (unsigned int)v0;
    v84 = ((unsigned int)v1 + (unsigned int)v0 ^ -v83) + ((unsigned int)v1 + (unsigned int)v0 & -v83) * 2;
    v85 = v83 + v84 + (v83 | ~v84) + (v84 & ~v83) + 1;
    v86 = ~v76 - v85 + (v85 & ~v76) + (v85 & v76) * 2;
    g_f0497e = (unsigned short)(v86 - v76) + ((unsigned short)v76 + 1 & (unsigned short)~v86) * 2 + ((unsigned short)v86 + ((unsigned short)v76 + 1 | (unsigned short)~v86)) * 2 + 1;
    v87 = v1;
    v88 = v0;
    v89 = ~v88;
    v90 = v88 + v87 + 1;
    v91 = v90 + v89 * 2 + (v88 & ~v87) * 2;
    v92 = v88 - (v87 + (v88 | ~v87));
    v93 = (v92 & v87 + v89) * 4 + (v92 ^ v87 + v89) * 2 + ~((v92 & v87 + v89) * 4 + (v92 ^ v87 + v89) * 2) * 2 | 1;
    v94 = v93 - (v90 + (-v87 & ~v88) * 2 + (v88 - (v87 + (v88 | -v87))) * 2) + (v90 + (-v87 & ~v88) * 2 + (v88 - (v87 + (v88 | -v87))) * 2 + ~v93) * 2;
    v95 = (((~v91 - v94 + (v94 - 1 | v91 + 1) & v91 + 2) * 4 + (~v91 - v94 + (v94 - 1 | v91 + 1) ^ v91 + 2) * 2 | 1) ^ (v94 ^ v91 + 1) + ((v94 & v91 + 1) + (0x7ffffffffffffffe - v91 & -v94)) * 2) + (((~v91 - v94 + (v94 - 1 | v91 + 1) & v91 + 2) * 4 + (~v91 - v94 + (v94 - 1 | v91 + 1) ^ v91 + 2) * 2 | 1) & (v94 ^ v91 + 1) + ((v94 & v91 + 1) + (0x7ffffffffffffffe - v91 & -v94)) * 2) * 2;
    v96 = ~v95 + v95 * 2;
    v97 = (v96 + 12 ^ -(v96 | 12)) + (v96 + 12 & -(v96 | 12)) * 2;
    v98 = v96 + (v96 & 12) + ((0xffffffff ^ (unsigned int)v96 * 2) & 24) - 12;
    v0 = (v96 ^ 21) + ((-v95 | 21) + v95) * 2 - 1;
    v1 = v97 + (v98 | ~v97) + (v98 | v97) + 1;
    v99 = v0;
    v100 = v1;
    v101 = v1;
    v102 = v0;
    v103 = v102 - v101;
    v104 = ((0xffffffffffffffff ^ (v101 & ~v102) * 2) + (v101 & ~v102) * 4 + 2 ^ v103) + ((0xffffffffffffffff ^ (v101 & ~v102) * 2) + (v101 & ~v102) * 4 + 2 & v103) * 2;
    v105 = v104 + (v103 + (v101 | ~v102) ^ v101 + ~v101 * 2) + (v102 | v101) - ((v103 + (v101 | ~v102) & v101 + 1) + v104) * 2 + 2;
    v0 = v105 + (v105 | 34887) + (0xffffffffffff77b8 & ~v105) + 34888;
    v1 = v105 + (v105 + (30649 | ~v105)) * 2 + ((0xffffffff ^ (unsigned int)v105 * 2) & 61298) + 0xffffffffffff8848;
    v106 = (__m128i)_INSERT(v0, 8, v99);
    v107 = (__m128i)_INSERT(__double_as_longlong(__longlong_as_double(v1 | __double_as_longlong(~_mm_cvtsi128_si64(v106)))), 8, v100 - v99 + (v99 | ~v100));
    v108 = (__m128i)_INSERT(v1, 8, v100);
    v109 = _mm_add_epi64(_mm_add_epi64(_mm_sub_epi64(v106, v108), _mm_and_si128(v108, v106)), _mm_add_epi64(_mm_and_si128(v108, ~v106), _mm_and_si128(v108, ~v106)));
    v110 = _mm_add_epi64(_mm_sub_epi64(_mm_or_si128(v109, ~_mm_add_epi64(_mm_add_epi64(_mm_and_si128(v107, _mm_add_epi64(v106, _mm_set1_epi64x(1))), _mm_and_si128(v107, _mm_add_epi64(v106, _mm_set1_epi64x(1)))), _mm_xor_si128(_mm_add_epi64(v106, _mm_set1_epi64x(1)), v107))), ~_mm_add_epi64(_mm_add_epi64(_mm_and_si128(v107, _mm_add_epi64(v106, _mm_set1_epi64x(1))), _mm_and_si128(v107, _mm_add_epi64(v106, _mm_set1_epi64x(1)))), _mm_xor_si128(_mm_add_epi64(v106, _mm_set1_epi64x(1)), v107))), _mm_or_si128(_mm_add_epi64(_mm_add_epi64(_mm_and_si128(v107, _mm_add_epi64(v106, _mm_set1_epi64x(1))), _mm_and_si128(v107, _mm_add_epi64(v106, _mm_set1_epi64x(1)))), _mm_xor_si128(_mm_add_epi64(v106, _mm_set1_epi64x(1)), v107)), v109));
    g_f04982 = (short)_mm_cvtsi128_si32(v110) & (unsigned short)(v55 >> ((char)_mm_extract_epi64(v110, 1) & 63));
    v111 = v1;
    v112 = v0;
    v113 = v111 * 2 + ~v111 * 4 + (v111 ^ 1) + (v111 * 2 & 2);
    v114 = v112 + 1;
    v115 = (v111 ^ -v112) + (v111 - (v112 + (v111 | -v112))) * 2;
    v116 = v115 + ((v114 - (v113 + 3) + (v113 + 2 | ~v112) & v113 + 3) * 4 + (v114 - (v113 + 3) + (v113 + 2 | ~v112) ^ v113 + 3) * 2 | ~v115) + ((v114 - (v113 + 3) + (v113 + 2 | ~v112) & v113 + 3) * 4 + (v114 - (v113 + 3) + (v113 + 2 | ~v112) ^ v113 + 3) * 2 | v115) + 1;
    v117 = v112 + v111 + (-v111 & ~v112) * 2 + (v114 + (-v111 | ~v112)) * 2;
    v118 = (v112 + (0xffffffffffffffff ^ v112 * 2) + v111 & -(v112 + (0xffffffffffffffff ^ v112 * 2) | v111)) * 4 + (v112 + (0xffffffffffffffff ^ v112 * 2) + v111 ^ -(v112 + (0xffffffffffffffff ^ v112 * 2) | v111)) * 2 | 1;
    v119 = (v118 ^ v117) + (v118 & v117) * 2 - ((v118 ^ v117) + (v118 & v117) * 2) * 2 + 1;
    v120 = ~((v119 ^ v116) + (v119 & v116) * 2) + ((v119 ^ v116) + (v119 & v116) * 2) * 2;
    v121 = (v120 * 2 & 4) + (v120 ^ 2);
    v122 = (v121 + (v121 - v121 * 2 | 32) ^ (v121 * 2 + ~v121 | 32) + 1) + (v121 + (v121 - v121 * 2 | 32) & (v121 * 2 + ~v121 | 32) + 1) * 2;
    v0 = (v121 + (-v121 | 16) & 0xffffffffffffffef - ((-v121 | 0xffffffffffffffef) + v121)) + (-v121 | 0xffffffffffffffef) + v121 + 16 + (v121 + (-v121 | 16) & (-v121 | 0xffffffffffffffef) + v121 + 16);
    v1 = ~v122 + v122 * 2;
    g_f04986 = v55 >> (((char)v1 + (char)v0 ^ (char)-(v1 | v0)) + (char)v1 + ((char)v1 + (char)v0 & (char)-(v1 | v0)) * 2 + ((char)v1 + (char)~v1 * 2 + 1 & (char)v0) & 63);
    v123 = g_f0497a + 1;
    v124 = g_f04978 & g_f0497a;
    g_f04978 = v123 + (unsigned short)v124 + (v123 + ~g_f0497a * 2 & g_f04978) + (unsigned short)~v124 * 2 + 1;
    v125 = g_f0497c + g_f0497e + ~g_f0497e * 2;
    v126 = (g_f0497e & ~g_f0497c) * 2;
    g_f0497c = (unsigned short)(v126 + v125 * 2 + ((unsigned int)(0xfffd - v125) | v126) - (v125 + 2 & v126)) + 5;
    v127 = g_f04982 | g_f04980;
    v128 = g_f04982 + g_f04980;
    v129 = -((v128 ^ -v127) + (v128 & -v127) * 2);
    g_f04980 = (v129 ^ (unsigned short)v127) + ((unsigned short)v127 + (v129 | (unsigned short)~v127)) * 2 + 2;
    v130 = g_f04984 + g_f04986 + ~g_f04986 * 2;
    v131 = ((0xffff ^ g_f04984 * 2) + g_f04984 & g_f04986) * 2;
    g_f04984 = v130 + ((unsigned short)(0xfffd - v130) | v131) + (v130 + 2 | v131) + 3;
    g_f04988 = v55 + 1 + ~g_f04988 + (g_f04988 & ~v55) + (g_f04988 & v55 + 1 - (v55 + 1) * 2);
    v132 = v1;
    v133 = v0;
    v134 = v133 | v132;
    v135 = -((v133 + v132 ^ -v134) + (v133 + v132 & -v134) * 2);
    v136 = (v135 ^ v134) + (v134 + (v135 | ~v134)) * 2;
    v137 = v136 + 3;
    v138 = v136 + 2;
    v139 = ((v138 | v132) - 1 ^ v138 + v132) - (v138 + v132 & -(v138 | v132)) * 2 + (v138 | v132);
    v140 = v139 + 1;
    v141 = v138 + v133 + (-v133 & ~v138) * 2 + ((-v133 | ~v138) + v137) * 2;
    v142 = 1 | (v138 - v137 * 2 + 1 & v133) * 2;
    v143 = (v142 ^ v141) + (v142 & v141) * 2;
    v144 = v143 - 1;
    v145 = v144 + ~((unsigned int)(0xfffffffe - v139) | v144);
    v146 = 1 | ((v144 ^ 1) - v143 * 2 + (__ROL__(v144, 1) & 2 & 3) & v140) * 2;
    v147 = (v146 ^ v144 - v140) + (v146 & v144 - v140) * 2;
    v148 = v139 - v143 + (v139 ^ ~v145) * 2 + (v145 & ~v139) * 4 - v147 * 2 + (__ROL__(~v147, 1) & 2 & 3) + (v147 * 2 + ~v147 ^ 1) + 2;
    return (v148 ^ 2) + (v148 * 2 & 4) - 1;
}
