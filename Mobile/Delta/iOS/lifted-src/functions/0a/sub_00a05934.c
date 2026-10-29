/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa05934..0xa05e24 (1264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a05934(void* a0, long long a1, unsigned int a2)
{
    void* v31;  // x20
    unsigned long long v32;  // x8
    unsigned long long v41;  // x8
    unsigned long long v42;  // x9
    unsigned long long v43;  // x10
    unsigned long long v44;  // x11
    unsigned long long v45;  // x13
    unsigned long long v46;  // x14
    unsigned long long v47;  // x15
    unsigned long long v48;  // x15
    unsigned long long v49;  // x12
    unsigned long long v50;  // x10
    unsigned long long v33;  // x9
    unsigned long long v51;  // x11
    unsigned long long v52;  // x13
    unsigned long long v53;  // x14
    unsigned long long v54;  // x16
    unsigned long long v55;  // x17
    unsigned long long v56;  // x0
    unsigned long long v57;  // x14
    unsigned long long v58;  // x3
    unsigned long long v59;  // x4
    unsigned long long v60;  // x5
    unsigned long long v34;  // x11
    unsigned long long v61;  // x6
    unsigned long long v62;  // x22
    unsigned long long v63;  // x26
    unsigned long long v64;  // x27
    unsigned long long v65;  // x28
    unsigned long long v66;  // x13
    unsigned long long v67;  // x15
    unsigned long long v68;  // x0
    unsigned long long v69;  // x11
    unsigned long long v70;  // x12
    unsigned long long v35;  // x14
    unsigned long long v71;  // x9
    unsigned long long v72;  // x8
    unsigned long long v73;  // x10
    unsigned long long v74;  // x0
    unsigned long long v75;  // x13
    unsigned long long v76;  // x15
    unsigned long long v77;  // x21
    unsigned long long v78;  // x7
    unsigned long long v79;  // x1
    unsigned long long v80;  // x6
    unsigned long long v36;  // x12
    unsigned long long v81;  // x16
    unsigned long long v82;  // x27
    unsigned long long v83;  // x17
    unsigned long long v84;  // x14
    unsigned long long v85;  // x10
    unsigned long long v86;  // x11
    unsigned long long v87;  // x2
    unsigned long long v88;  // x4
    unsigned long long v89;  // x8
    unsigned long long v90;  // x3
    unsigned long long v37;  // x13
    unsigned long long v91;  // x28
    unsigned long long v92;  // x12
    unsigned long long v93;  // x9
    unsigned long long v94;  // x22
    unsigned long long v95;  // x23
    unsigned long long v96;  // x20
    unsigned long long v97;  // x8
    unsigned long long v98;  // x9
    unsigned long long v99;  // x10
    unsigned long long v100;  // x13
    unsigned long long v38;  // x10
    unsigned long long v101;  // x11
    unsigned long long v102;  // x12
    unsigned long long v103;  // x10
    unsigned long long v104;  // x10
    unsigned long long v105;  // x11
    unsigned long long v106;  // x0
    __m128i v39;  // q0
    unsigned long long v0;  // [bp-0x150]
    unsigned long v1;  // [bp-0x148]
    void* v2;  // [bp-0x140]
    unsigned long v3;  // [bp-0x130]
    unsigned long long v4;  // [bp-0x128]
    unsigned long long v5;  // [bp-0x120]
    unsigned long long v6;  // [bp-0x118]
    unsigned long long v7;  // [bp-0x110]
    unsigned long long v8;  // [bp-0x108]
    unsigned long long v9;  // [bp-0x100]
    unsigned long long v10;  // [bp-0xf8]
    unsigned long long v11;  // [bp-0xf0], Other Possible Types: unsigned long
    uint128_t v12;  // [bp-0xe8], Other Possible Types: unsigned long long
    unsigned long long v13;  // [bp-0xe0]
    unsigned long long v14;  // [bp-0xd8]
    unsigned long v15;  // [bp-0xd0], Other Possible Types: unsigned long long
    unsigned long v16;  // [bp-0xc8], Other Possible Types: unsigned long long
    unsigned long v17;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long v18;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long v19;  // [bp-0xb0]
    unsigned long long v20;  // [bp-0xb0]
    unsigned long long v21;  // [bp-0xa8]
    unsigned long long v22;  // [bp-0xa0]
    unsigned long long v23;  // [bp-0x98]
    unsigned long long v24;  // [bp-0x90]
    unsigned long long v25;  // [bp-0x88]
    unsigned long long v26;  // [bp-0x80]
    unsigned long long v27;  // [bp-0x78]
    unsigned long v28;  // [bp-0x70]
    char *v29;  // [bp-0x10]
    char v30;  // [bp+0x0]

    v29 = &v30;
    v28 = *(long long *)&g_10002b0;
    v31 = a0 + 64;
    v32 = (long long)a0[64] - *(long long *)a0 + 0x1fffffffffffffe;
    v33 = (long long)a0[88] - (long long)a0[24] + 0x1fffffffffffffe;
    v34 = (long long)a0[120] - (long long)a0[56] + 0x1fffffffffffffe;
    v35 = v34 >> 56;
    v36 = (long long)a0[104] - (long long)a0[40] + 0x1fffffffffffffe;
    v37 = (long long)a0[112] - (long long)a0[48] + 0x1fffffffffffffe;
    v38 = (long long)a0[96] - (long long)a0[32] + 0x1fffffffffffffc + v35;
    v18 = (v34 & 0xffffffffffffff) + (v37 >> 56);
    v16 = (v36 & 0xffffffffffffff) + (v38 >> 56);
    v17 = (v37 & 0xffffffffffffff) + (v36 >> 56);
    v39 = _mm_add_epi64(_mm_sub_epi64((int128_t)a0[72], (int128_t)a0[8]), _mm_set1_epi64x(0x1fffffffffffffe));
    v14 = (v33 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v39, 1)) >> 56);
    v15 = (v38 & 0xffffffffffffff) + (v33 >> 56);
    v12 = _mm_add_epi64(_mm_and_si128(v39, _mm_set1_epi64x(0xffffffffffffff)), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v39, v39), 0, __longlong_as_double(v32)), 56));
    v11 = v35 + (v32 & 0xffffffffffffff);
    sub_a04850(&v20);
    v41 = *(long long *)v31 + *(long long *)a0;
    v42 = (long long)a0[72] + (long long)a0[8];
    v43 = (long long)a0[80] + (long long)a0[16];
    v44 = (long long)a0[88] + (long long)a0[24];
    v45 = (long long)a0[104] + (long long)a0[40];
    v46 = (long long)a0[112] + (long long)a0[48];
    v47 = (long long)a0[120] + (long long)a0[56];
    v48 = v47 >> 56;
    v49 = (long long)a0[96] + (long long)a0[32] + v48;
    v17 = (v46 & 0xffffffffffffff) + (v45 >> 56);
    v18 = (v47 & 0xffffffffffffff) + (v46 >> 56);
    v15 = (v49 & 0xffffffffffffff) + (v44 >> 56);
    v16 = (v45 & 0xffffffffffffff) + (v49 >> 56);
    v13 = (v43 & 0xffffffffffffff) + (v42 >> 56);
    v14 = (v44 & 0xffffffffffffff) + (v43 >> 56);
    v11 = (v41 & 0xffffffffffffff) + v48;
    v12 = (v42 & 0xffffffffffffff) + (v41 >> 56);
    v2 = v31;
    sub_a04850(v31, a1 + 64, &v11);
    sub_a04850(a0, a1 + 128, a0 + 192);
    v50 = v26;
    v51 = v27;
    v52 = (long long)a0[112] + v50;
    v53 = (long long)a0[120] + v51;
    v54 = v24;
    v55 = v25;
    v56 = (long long)a0[104] + v55;
    v57 = v53 >> 56;
    v58 = (long long)a0[96] + v54 + v57;
    v59 = v22;
    v60 = v23;
    v61 = (long long)a0[88] + v60;
    v62 = (long long)a0[80] + v59;
    v63 = v21;
    v64 = (long long)a0[72] + v63;
    v20 += *(long long *)v31;
    v65 = *(long long *)v31 - v20 + 0x1fffffffffffffe;
    v9 = (v52 & 0xffffffffffffff) + (v56 >> 56);
    v10 = (v53 & 0xffffffffffffff) + (v52 >> 56);
    v66 = (long long)a0[72] - v63 + 0x1fffffffffffffe;
    v67 = (long long)a0[80] - v59 + 0x1fffffffffffffe;
    v7 = (v58 & 0xffffffffffffff) + (v61 >> 56);
    v8 = (v56 & 0xffffffffffffff) + (v58 >> 56);
    v68 = (long long)a0[88] - v60 + 0x1fffffffffffffe;
    v5 = (v62 & 0xffffffffffffff) + (v64 >> 56);
    v6 = (v61 & 0xffffffffffffff) + (v62 >> 56);
    v69 = (long long)a0[120] - v51 + 0x1fffffffffffffe;
    v70 = v69 >> 56;
    v71 = (long long)a0[104] - v55 + 0x1fffffffffffffe;
    v3 = (v20 & 0xffffffffffffff) + v57;
    v4 = (v64 & 0xffffffffffffff) + (v20 >> 56);
    v72 = (long long)a0[112] - v50 + 0x1fffffffffffffe;
    v73 = (long long)a0[96] - v54 + 0x1fffffffffffffc + v70;
    v17 = (v72 & 0xffffffffffffff) + (v71 >> 56);
    v18 = (v69 & 0xffffffffffffff) + (v72 >> 56);
    v74 = (long long)a0[128];
    v75 = *(long long *)a0;
    v0 = (v68 & 0xffffffffffffff) + (v67 >> 56);
    v1 = (long long)a0[8];
    v76 = v74 - v75 + 0x1fffffffffffffe;
    v77 = (long long)a0[0x88];
    v78 = (long long)a0[144];
    v79 = v77 - (long long)a0[8] + 0x1fffffffffffffe;
    v80 = (long long)a0[16];
    v81 = (long long)a0[24];
    v82 = v78 - v80 + 0x1fffffffffffffe;
    v83 = (long long)a0[152];
    v84 = (long long)a0[160];
    v85 = v83 - v81 + 0x1fffffffffffffe;
    v86 = (long long)a0[176];
    v87 = (long long)a0[184];
    x30 = (long long)a0[48];
    v88 = (long long)a0[56];
    v89 = v87 - v88 + 0x1fffffffffffffe;
    v90 = (long long)a0[32];
    v91 = (long long)a0[40];
    v92 = (long long)a0[168];
    v15 = (v73 & 0xffffffffffffff) + (v68 >> 56);
    v16 = (v71 & 0xffffffffffffff) + (v73 >> 56);
    v93 = v92 - v91 + 0x1fffffffffffffe;
    v94 = v86 - x30 + 0x1fffffffffffffe;
    v95 = v89 >> 56;
    v13 = (v67 & 0xffffffffffffff) + (v66 >> 56);
    v14 = v0;
    v11 = v70 + (v65 & 0xffffffffffffff);
    v12 = (v66 & 0xffffffffffffff) + (v65 >> 56);
    *(unsigned long long *)&a0[120] = (v89 & 0xffffffffffffff) + (v94 >> 56);
    v96 = v84 - v90 + 0x1fffffffffffffc + v95;
    *(unsigned long long *)&a0[104] = (v93 & 0xffffffffffffff) + (v96 >> 56);
    *(unsigned long long *)&a0[112] = (v94 & 0xffffffffffffff) + (v93 >> 56);
    *(unsigned long long *)&a0[88] = (v85 & 0xffffffffffffff) + (v82 >> 56);
    *(unsigned long long *)&a0[96] = (v96 & 0xffffffffffffff) + (v85 >> 56);
    *(unsigned long long *)&a0[72] = (v79 & 0xffffffffffffff) + (v76 >> 56);
    *(unsigned long long *)&a0[80] = (v82 & 0xffffffffffffff) + (v79 >> 56);
    *(unsigned long long *)v2 = v95 + (v76 & 0xffffffffffffff);
    v97 = v74 + v75;
    v98 = v83 + v81;
    v99 = v87 + v88;
    v100 = v99 >> 56;
    v101 = v86 + x30;
    v102 = v92 + v91;
    v26 = (v101 & 0xffffffffffffff) + (v102 >> 56);
    v27 = (v99 & 0xffffffffffffff) + (v101 >> 56);
    v103 = v84 + v90 + v100;
    v24 = (v103 & 0xffffffffffffff) + (v98 >> 56);
    v25 = (v102 & 0xffffffffffffff) + (v103 >> 56);
    v104 = v77 + v1;
    v105 = v78 + v80;
    v22 = (v105 & 0xffffffffffffff) + (v104 >> 56);
    v23 = (v98 & 0xffffffffffffff) + (v105 >> 56);
    v19 = (v97 & 0xffffffffffffff) + v100;
    v21 = (v104 & 0xffffffffffffff) + (v97 >> 56);
    sub_a04850(a0 + 128, &v19, v2);
    sub_a04850(a0, v2, &v11);
    v106 = sub_a04850(v2, &v19, &v3);
    if (!a2)
        v106 = sub_a04850(a0 + 192, &v11, &v3);
    if (*(long long *)&g_10002b0 == v28)
        return v106;
    ___stack_chk_fail();
}
