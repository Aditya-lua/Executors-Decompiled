/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa07770..0xa07c60 (1264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a07770(void* a0, long long a1, unsigned int a2)
{
    void* v29;  // x20
    unsigned long long v30;  // x8
    unsigned long long v39;  // x8
    unsigned long long v40;  // x9
    unsigned long long v41;  // x10
    unsigned long long v42;  // x11
    unsigned long long v43;  // x13
    unsigned long long v44;  // x14
    unsigned long long v45;  // x15
    unsigned long long v46;  // x15
    unsigned long long v47;  // x12
    unsigned long long v48;  // x10
    unsigned long long v31;  // x9
    unsigned long long v49;  // x11
    unsigned long long v50;  // x13
    unsigned long long v51;  // x14
    unsigned long long v52;  // x16
    unsigned long long v53;  // x17
    unsigned long long v54;  // x0
    unsigned long long v55;  // x14
    unsigned long long v56;  // x3
    unsigned long long v57;  // x4
    unsigned long long v58;  // x5
    unsigned long long v32;  // x11
    unsigned long long v59;  // x6
    unsigned long long v60;  // x25
    unsigned long long v61;  // x27
    unsigned long long v62;  // x28
    unsigned long long v63;  // x8
    unsigned long long v64;  // x14
    unsigned long long v65;  // x13
    unsigned long long v66;  // x15
    unsigned long long v67;  // x0
    unsigned long long v68;  // x11
    unsigned long long v33;  // x14
    unsigned long long v69;  // x12
    unsigned long long v70;  // x9
    unsigned long long v71;  // x8
    unsigned long long v72;  // x10
    unsigned long long v73;  // x0
    unsigned long long v74;  // x11
    unsigned long v75;  // x12
    unsigned long long v76;  // x2
    unsigned long long v77;  // x13
    unsigned long long v78;  // x26
    unsigned long long v34;  // x12
    unsigned long long v79;  // x24
    unsigned long long v80;  // x14
    unsigned long long v81;  // x27
    unsigned long long v82;  // x16
    unsigned long long v83;  // x15
    unsigned long long v84;  // x17
    unsigned long long v85;  // x1
    unsigned long long v86;  // x28
    unsigned long long v87;  // x3
    unsigned long long v88;  // x4
    unsigned long long v35;  // x13
    unsigned long long v89;  // x10
    unsigned long long v90;  // x8
    unsigned long long v91;  // x6
    unsigned long long v92;  // x7
    unsigned long long v93;  // x8
    unsigned long long v94;  // x20
    unsigned long long v95;  // x22
    unsigned long long v96;  // x9
    unsigned long long v97;  // x8
    unsigned long long v98;  // x11
    unsigned long long v36;  // x10
    unsigned long long v99;  // x10
    unsigned long long v100;  // x13
    unsigned long long v101;  // x15
    unsigned long long v102;  // x14
    unsigned long long v103;  // x10
    unsigned long long v104;  // x10
    unsigned long long v105;  // x0
    __m128i v37;  // q0
    unsigned long v0;  // [bp-0x148]
    void* v1;  // [bp-0x140]
    unsigned long v2;  // [bp-0x130]
    unsigned long long v3;  // [bp-0x128]
    unsigned long long v4;  // [bp-0x120]
    unsigned long long v5;  // [bp-0x118]
    unsigned long long v6;  // [bp-0x110]
    unsigned long long v7;  // [bp-0x108]
    unsigned long long v8;  // [bp-0x100]
    unsigned long long v9;  // [bp-0xf8]
    unsigned long long v10;  // [bp-0xf0], Other Possible Types: unsigned long
    uint128_t v11;  // [bp-0xe8], Other Possible Types: unsigned long long
    unsigned long long v12;  // [bp-0xe0]
    unsigned long long v13;  // [bp-0xd8]
    unsigned long v14;  // [bp-0xd0], Other Possible Types: unsigned long long
    unsigned long v15;  // [bp-0xc8], Other Possible Types: unsigned long long
    unsigned long v16;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long v17;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long v18;  // [bp-0xb0]
    unsigned long long v19;  // [bp-0xa8]
    unsigned long long v20;  // [bp-0xa0]
    unsigned long long v21;  // [bp-0x98]
    unsigned long long v22;  // [bp-0x90]
    unsigned long long v23;  // [bp-0x88]
    unsigned long long v24;  // [bp-0x80]
    unsigned long long v25;  // [bp-0x78]
    unsigned long v26;  // [bp-0x70]
    char *v27;  // [bp-0x10]
    char v28;  // [bp+0x0]

    v27 = &v28;
    v26 = *(long long *)&g_10002b0;
    v29 = a0 + 64;
    v30 = (long long)a0[64] - *(long long *)a0 + 0x1fffffffffffffe;
    v31 = (long long)a0[88] - (long long)a0[24] + 0x1fffffffffffffe;
    v32 = (long long)a0[120] - (long long)a0[56] + 0x1fffffffffffffe;
    v33 = v32 >> 56;
    v34 = (long long)a0[104] - (long long)a0[40] + 0x1fffffffffffffe;
    v35 = (long long)a0[112] - (long long)a0[48] + 0x1fffffffffffffe;
    v36 = (long long)a0[96] - (long long)a0[32] + 0x1fffffffffffffc + v33;
    v17 = (v32 & 0xffffffffffffff) + (v35 >> 56);
    v15 = (v34 & 0xffffffffffffff) + (v36 >> 56);
    v16 = (v35 & 0xffffffffffffff) + (v34 >> 56);
    v37 = _mm_add_epi64(_mm_sub_epi64((int128_t)a0[72], (int128_t)a0[8]), _mm_set1_epi64x(0x1fffffffffffffe));
    v13 = (v31 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v37, 1)) >> 56);
    v14 = (v36 & 0xffffffffffffff) + (v31 >> 56);
    v11 = _mm_add_epi64(_mm_and_si128(v37, _mm_set1_epi64x(0xffffffffffffff)), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v37, v37), 0, __longlong_as_double(v30)), 56));
    v10 = v33 + (v30 & 0xffffffffffffff);
    sub_a04850(&v18, a1 + 64, &v10);
    v39 = *(long long *)v29 + *(long long *)a0;
    v40 = (long long)a0[72] + (long long)a0[8];
    v41 = (long long)a0[80] + (long long)a0[16];
    v42 = (long long)a0[88] + (long long)a0[24];
    v43 = (long long)a0[104] + (long long)a0[40];
    v44 = (long long)a0[112] + (long long)a0[48];
    v45 = (long long)a0[120] + (long long)a0[56];
    v46 = v45 >> 56;
    v47 = (long long)a0[96] + (long long)a0[32] + v46;
    v16 = (v44 & 0xffffffffffffff) + (v43 >> 56);
    v17 = (v45 & 0xffffffffffffff) + (v44 >> 56);
    v14 = (v47 & 0xffffffffffffff) + (v42 >> 56);
    v15 = (v43 & 0xffffffffffffff) + (v47 >> 56);
    v12 = (v41 & 0xffffffffffffff) + (v40 >> 56);
    v13 = (v42 & 0xffffffffffffff) + (v41 >> 56);
    v10 = (v39 & 0xffffffffffffff) + v46;
    v11 = (v40 & 0xffffffffffffff) + (v39 >> 56);
    v1 = v29;
    sub_a04850(v29, a1, &v10);
    sub_a04850(a0, a1 + 128, a0 + 192);
    v48 = v24;
    v49 = v25;
    v50 = (long long)a0[112] + v48;
    v51 = (long long)a0[120] + v49;
    v52 = v22;
    v53 = v23;
    v54 = (long long)a0[104] + v53;
    v55 = v51 >> 56;
    v56 = (long long)a0[96] + v52 + v55;
    v57 = v20;
    v58 = v21;
    v59 = (long long)a0[88] + v58;
    v60 = (long long)a0[80] + v57;
    v61 = v19;
    v62 = (long long)a0[72] + v61;
    v63 = *(long long *)v29 + v18;
    v64 = *(long long *)v29 - v18 + 0x1fffffffffffffe;
    v8 = (v50 & 0xffffffffffffff) + (v54 >> 56);
    v9 = (v51 & 0xffffffffffffff) + (v50 >> 56);
    v65 = (long long)a0[72] - v61 + 0x1fffffffffffffe;
    v66 = (long long)a0[80] - v57 + 0x1fffffffffffffe;
    v6 = (v56 & 0xffffffffffffff) + (v59 >> 56);
    v7 = (v54 & 0xffffffffffffff) + (v56 >> 56);
    v67 = (long long)a0[88] - v58 + 0x1fffffffffffffe;
    v4 = (v60 & 0xffffffffffffff) + (v62 >> 56);
    v5 = (v59 & 0xffffffffffffff) + (v60 >> 56);
    v68 = (long long)a0[120] - v49 + 0x1fffffffffffffe;
    v69 = v68 >> 56;
    v70 = (long long)a0[104] - v53 + 0x1fffffffffffffe;
    v2 = (v63 & 0xffffffffffffff) + v55;
    v3 = (v62 & 0xffffffffffffff) + (v63 >> 56);
    v71 = (long long)a0[112] - v48 + 0x1fffffffffffffe;
    v72 = (long long)a0[96] - v52 + 0x1fffffffffffffc + v69;
    v16 = (v71 & 0xffffffffffffff) + (v70 >> 56);
    v17 = (v68 & 0xffffffffffffff) + (v71 >> 56);
    v73 = (long long)a0[128];
    v74 = *(long long *)a0;
    v75 = (long long)a0[8];
    v76 = v74 + v73;
    v77 = (long long)a0[0x88];
    v0 = (long long)a0[144];
    v78 = v75 + v77;
    v79 = (long long)a0[16];
    v80 = (long long)a0[24];
    v81 = v79 + (long long)a0[144];
    v82 = (long long)a0[32];
    v83 = (long long)a0[40];
    v84 = (long long)a0[168];
    v85 = (long long)a0[176];
    v86 = v83 + v84;
    v87 = (long long)a0[48];
    v88 = (long long)a0[56];
    v85 += v87;
    v89 = (long long)a0[184];
    v90 = v88 + v89;
    v14 = (v72 & 0xffffffffffffff) + (v67 >> 56);
    v15 = (v70 & 0xffffffffffffff) + (v72 >> 56);
    v12 = (v66 & 0xffffffffffffff) + (v65 >> 56);
    v13 = (v67 & 0xffffffffffffff) + (v66 >> 56);
    v91 = (long long)a0[152];
    v92 = (long long)a0[160];
    v93 = v90 >> 56;
    v94 = v82 + v92 + v93;
    v10 = v69 + (v64 & 0xffffffffffffff);
    v11 = (v65 & 0xffffffffffffff) + (v64 >> 56);
    v95 = v80 + v91;
    *(unsigned long long *)&a0[112] = (v85 & 0xffffffffffffff) + (v86 >> 56);
    *(unsigned long long *)&a0[120] = (v90 & 0xffffffffffffff) + (v85 >> 56);
    *(unsigned long long *)&a0[96] = (v94 & 0xffffffffffffff) + (v95 >> 56);
    *(unsigned long long *)&a0[104] = (v86 & 0xffffffffffffff) + (v94 >> 56);
    *(unsigned long long *)&a0[80] = (v81 & 0xffffffffffffff) + (v78 >> 56);
    *(unsigned long long *)&a0[88] = (v95 & 0xffffffffffffff) + (v81 >> 56);
    *(unsigned long long *)&a0[72] = (v78 & 0xffffffffffffff) + (v76 >> 56);
    v96 = v73 - v74 + 0x1fffffffffffffe;
    *(unsigned long long *)v1 = (v76 & 0xffffffffffffff) + v93;
    v97 = v77 - v75 + 0x1fffffffffffffe;
    v98 = v91 - v80 + 0x1fffffffffffffe;
    v99 = v89 - v88 + 0x1fffffffffffffe;
    v100 = v99 >> 56;
    v101 = v85 - v87 + 0x1fffffffffffffe;
    v102 = v84 - v83 + 0x1fffffffffffffe;
    v24 = (v101 & 0xffffffffffffff) + (v102 >> 56);
    v25 = (v99 & 0xffffffffffffff) + (v101 >> 56);
    v103 = v92 - v82 + 0x1fffffffffffffc + v100;
    v22 = (v103 & 0xffffffffffffff) + (v98 >> 56);
    v23 = (v102 & 0xffffffffffffff) + (v103 >> 56);
    v104 = v0 - v79 + 0x1fffffffffffffe;
    v20 = (v104 & 0xffffffffffffff) + (v97 >> 56);
    v21 = (v98 & 0xffffffffffffff) + (v104 >> 56);
    v18 = v100 + (v96 & 0xffffffffffffff);
    v19 = (v97 & 0xffffffffffffff) + (v96 >> 56);
    sub_a04850(a0 + 128, &v18, v1);
    sub_a04850(a0, v1, &v10);
    v105 = sub_a04850(v1, &v18, &v2);
    if (!a2)
        v105 = sub_a04850(a0 + 192, &v10, &v2);
    if (*(long long *)&g_10002b0 == v26)
        return v105;
    ___stack_chk_fail();
}
