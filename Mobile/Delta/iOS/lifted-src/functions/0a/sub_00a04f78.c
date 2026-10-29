/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04f78..0xa054c4 (1356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a04f78(void* a0, unsigned long long *a1, unsigned int a2)
{
    unsigned long long v23;  // x8
    __m128i v24;  // q1
    void* v33;  // x21
    void* v34;  // x21
    unsigned long long v35;  // x9
    unsigned long long v36;  // x10
    unsigned long long v37;  // x11
    unsigned long long v38;  // x12
    unsigned long long v39;  // x13
    unsigned long long v40;  // x14
    unsigned long long v41;  // x15
    unsigned long long v42;  // x15
    uint128_t v25;  // q0
    unsigned long long v43;  // x12
    unsigned long long v44;  // x8
    unsigned long long v45;  // x9
    __m128i v46;  // q2
    __m128i v47;  // q0
    __m128i v48;  // q3
    unsigned long long v49;  // x10
    unsigned long long v50;  // x12
    unsigned long long v51;  // x11
    __m128i v26;  // q6
    __m128i v53;  // q2
    __m128i v54;  // q0
    unsigned long long v56;  // x8
    unsigned long long v57;  // x9
    __m128i v58;  // q0
    unsigned long long v59;  // x11
    unsigned long long v60;  // x12
    unsigned long long v61;  // x10
    __m128i v27;  // q1
    __m128i v63;  // q0
    unsigned long v65;  // x9
    unsigned long long v66;  // x9
    unsigned long long v67;  // x8
    __m128i v68;  // q0
    __m128i v70;  // q2
    __m128i v71;  // q1
    unsigned long long v72;  // x10
    __m128i v28;  // q2
    __m128i v73;  // q3
    __m128i v74;  // q0
    uint128_t v75;  // q4
    __m128i v76;  // q4
    __m128i v77;  // q3
    __m128i v78;  // q0
    unsigned long long v79;  // x8
    void* v80;  // x22
    unsigned long long v81;  // x8
    unsigned long long v82;  // x11
    __m128i v29;  // q3
    __m128i v83;  // q3
    __m128i v84;  // q1
    unsigned long long v85;  // x12
    unsigned long long v86;  // x10
    unsigned long long v87;  // x9
    __m128i v88;  // q4
    __m128i v90;  // q0
    unsigned long long v92;  // x0
    unsigned long long v30;  // x8
    __m128i v31;  // q4
    unsigned long long v32;  // x8
    __m128i v0;  // [bp-0x170]
    uint192_t v1;  // [bp-0x160]
    __m128i v2;  // [bp-0x148]
    unsigned long long v3;  // [bp-0x138]
    __m128i v4;  // [bp-0x130]
    uint256_t v5;  // [bp-0x120]
    unsigned long v6;  // [bp-0x100]
    uint192_t v7;  // [bp-0xf8]
    unsigned long v8;  // [bp-0xe0]
    __m128i v9;  // [bp-0xd8]
    unsigned long v10;  // [bp-0xc8], Other Possible Types: unsigned long long
    unsigned long v11;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long v12;  // [bp-0xb8], Other Possible Types: unsigned long long
    __m128i v13;  // [bp-0xb0]
    uint256_t v14;  // [bp-0xa0], Other Possible Types: unsigned long
    __m128i v15;  // [bp-0x98]
    unsigned long long v16;  // [bp-0x88]
    unsigned long v17;  // [bp-0x80]
    uint192_t v18;  // [bp-0x78], Other Possible Types: unsigned long long
    __m128i v19;  // [bp-0x70]
    unsigned long v20;  // [bp-0x58]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v20 = *(long long *)&g_10002b0;
    sub_a04c64(&v5);
    sub_a04c64(&v14, a1 + 8);
    v23 = *(unsigned long long *)((void*)&v18 + 16) + *(unsigned long long *)((void*)&v7 + 16);
    v24 = _mm_add_epi64(*(uint128_t *)&v18, *(uint128_t *)&v7);
    v25 = _INSERT(_mm_unpackhi_epi64(v24, v24), 8, v23);
    v26 = _mm_set1_epi64x(0xffffffffffffff);
    v27 = _mm_add_epi64(*(uint128_t *)&v14, *(uint128_t *)&v5);
    v28 = (__m128i)_INSERT(_mm_unpacklo_epi64(v27, v27), 0, __longlong_as_double(v23));
    v29 = _mm_add_epi64(*(uint128_t *)((void*)&v14 + 16), *(uint128_t *)((void*)&v5 + 16));
    v30 = v17 + v6 + ((unsigned long long)(_mm_cvtsi128_si64(v28)) >> 56);
    v31 = (__m128i)_INSERT(_mm_unpackhi_epi64(v29, v29), 8, v30);
    v3 = (_mm_cvtsi128_si64(v24) & 0xffffffffffffff) + (v30 >> 56);
    *(unsigned long long *)((char *)&v1 + 16) = (_mm_cvtsi128_si64(v29) & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v27, 1)) >> 56);
    v32 = *a1 + a1[8];
    v33 = a0;
    *(unsigned long long *)&v33[192] = v32;
    v34 = v33 + 192;
    v35 = a1[1] + a1[9];
    *(unsigned long long *)&a0[200] = v35;
    v36 = a1[2] + a1[10];
    *(unsigned long long *)&a0[208] = v36;
    v37 = a1[3] + a1[11];
    *(unsigned long long *)&a0[216] = v37;
    v38 = a1[4] + a1[12];
    *(unsigned long long *)&a0[224] = v38;
    v39 = a1[5] + a1[13];
    *(unsigned long long *)&a0[232] = v39;
    v40 = a1[6] + a1[14];
    *(unsigned long long *)&a0[240] = v40;
    v41 = a1[7] + a1[15];
    v42 = v41 >> 56;
    v4 = _mm_add_epi64(_mm_and_si128(v25, _mm_set1_epi64x(0xffffffffffffff)), _mm_srli_epi64(v24, 56));
    v2 = _mm_add_epi64(_mm_and_si128(v31, v26), _mm_srli_epi64(v29, 56));
    v0 = _mm_add_epi64(_mm_and_si128(v27, v26), _mm_srli_epi64(v28, 56));
    *(__m128i *)&v1 = v0;
    v43 = v38 + v42;
    *(unsigned long long *)&a0[240] = (v40 & 0xffffffffffffff) + (v39 >> 56);
    *(unsigned long long *)&a0[248] = (v41 & 0xffffffffffffff) + (v40 >> 56);
    *(unsigned long long *)&a0[224] = (v43 & 0xffffffffffffff) + (v37 >> 56);
    *(unsigned long long *)&a0[232] = (v39 & 0xffffffffffffff) + (v43 >> 56);
    *(unsigned long long *)&a0[208] = (v36 & 0xffffffffffffff) + (v35 >> 56);
    *(unsigned long long *)&a0[216] = (v37 & 0xffffffffffffff) + (v36 >> 56);
    *(unsigned long long *)&a0[200] = (v35 & 0xffffffffffffff) + (v32 >> 56);
    *(unsigned long long *)v34 = (v32 & 0xffffffffffffff) + v42;
    sub_a04c64(&v8, v34);
    v44 = v8 - _mm_cvtsi128_si64(v0) + 0x1fffffffffffffe;
    v45 = v10 - _mm_cvtsi128_si64(v2) + 0x1fffffffffffffe;
    v46 = _mm_set1_epi64x(0x1fffffffffffffe);
    v47 = _mm_add_epi64(_mm_sub_epi64(v13, v4), v46);
    v48 = v46;
    v49 = (unsigned long long)(_mm_extract_epi64(v47, 1)) >> 56;
    v50 = v12 - v3 + 0x1fffffffffffffe;
    v51 = v11 - _mm_extract_epi64(v2, 1) + 0x1fffffffffffffc + v49;
    v53 = _mm_set1_epi64x(0xffffffffffffff);
    v13 = _mm_add_epi64(_mm_and_si128(v47, v53), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v47, v47), 0, __longlong_as_double(v50)), 56));
    v11 = (v51 & 0xffffffffffffff) + (v45 >> 56);
    v12 = (v50 & 0xffffffffffffff) + (v51 >> 56);
    v54 = _mm_add_epi64(_mm_sub_epi64(v9, *(uint128_t *)((void*)&v1 + 8)), v48);
    v9 = _mm_add_epi64(_mm_and_si128(v54, v53), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v54, v54), 0, __longlong_as_double(v44)), 56));
    v10 = (v45 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v54, 1)) >> 56);
    v8 = v49 + (v44 & 0xffffffffffffff);
    v56 = *(unsigned long long *)&v14 - *(unsigned long long *)&v5 + 0x1fffffffffffffe;
    v57 = *(unsigned long long *)((void*)&v14 + 24) - *(unsigned long long *)((void*)&v5 + 24) + 0x1fffffffffffffe;
    v58 = _mm_add_epi64(_mm_sub_epi64(*(uint128_t *)((void*)&v18 + 8), *(uint128_t *)((void*)&v7 + 8)), v48);
    v0 = v48;
    v59 = (unsigned long long)(_mm_extract_epi64(v58, 1)) >> 56;
    v60 = *(unsigned long long *)&v18 - *(unsigned long long *)&v7 + 0x1fffffffffffffe;
    v61 = v17 - v6 + 0x1fffffffffffffc + v59;
    *(__m128i *)&a0[240] = _mm_add_epi64(_mm_and_si128(v58, v53), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v58, v58), 0, __longlong_as_double(v60)), 56));
    v63 = _mm_add_epi64(_mm_sub_epi64(*(uint128_t *)((void*)&v14 + 8), *(uint128_t *)((void*)&v5 + 8)), v48);
    *(unsigned long long *)&a0[224] = (v61 & 0xffffffffffffff) + (v57 >> 56);
    *(unsigned long long *)&a0[232] = (v60 & 0xffffffffffffff) + (v61 >> 56);
    *(unsigned long long *)&a0[216] = (v57 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v63, 1)) >> 56);
    *(__m128i *)&a0[200] = _mm_add_epi64(_mm_and_si128(v63, v53), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v63, v63), 0, __longlong_as_double(v56)), 56));
    *(unsigned long long *)v34 = v59 + (v56 & 0xffffffffffffff);
    sub_a04c64(a0, a1 + 16);
    v65 = (long long)a0[56];
    v66 = (v65 * 0x200 | v65 >> 55) & 0xfffffffffffffeff & 0xff;
    v67 = v66 + (long long)a0[32] * 2;
    v68 = _mm_add_epi64((int128_t)a0[40], (int128_t)a0[40]);
    v70 = _mm_set1_epi64x(0xfffffffffffffe);
    v71 = _mm_add_epi64(_mm_and_si128(_INSERT(_mm_unpackhi_epi64(v68, v68), 8, v65 * 2), v70), _mm_srli_epi64(v68, 56));
    *(__m128i *)&a0[176] = v71;
    v72 = (_mm_cvtsi128_si64(v68) & 0xfffffffffffffe) + (v67 >> 56);
    v73 = *(int128_t *)a0;
    v74 = _mm_add_epi64((int128_t)a0[16], (int128_t)a0[16]);
    v75 = _INSERT(_mm_unpackhi_epi64(v74, v74), 8, v67);
    *(unsigned long long *)&a0[168] = v72;
    v76 = _mm_add_epi64(_mm_and_si128(v75, _mm_set_epi64x(0xffffffffffffff, 0xfffffffffffffe)), _mm_srli_epi64(v74, 56));
    *(__m128i *)&a0[152] = v76;
    v77 = _mm_add_epi64(v73, v73);
    v78 = _mm_add_epi64(_mm_and_si128(_mm_unpacklo_epi64(_mm_unpackhi_epi64(v77, v77), v74), v70), _mm_srli_epi64(v77, 56));
    v79 = (_mm_cvtsi128_si64(v77) & 0xfffffffffffffe) + v66;
    v80 = a0;
    *(unsigned long long *)&v80[128] = v79;
    *(__m128i *)&a0[0x88] = v78;
    v81 = v79 - *(long long *)v34 + 0x1fffffffffffffe;
    v82 = _mm_cvtsi128_si64(v76) - (long long)a0[216] + 0x1fffffffffffffe;
    v83 = v0;
    v84 = _mm_add_epi64(_mm_sub_epi64(v71, (int128_t)a0[240]), v83);
    v85 = (unsigned long long)(_mm_extract_epi64(v84, 1)) >> 56;
    v86 = v72 - (long long)a0[232] + 0x1fffffffffffffe;
    v87 = _mm_extract_epi64(v76, 1) - (long long)a0[224] + 0x1fffffffffffffc + v85;
    v88 = _mm_set1_epi64x(0xffffffffffffff);
    v19 = _mm_add_epi64(_mm_and_si128(v84, v88), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v84, v84), 0, __longlong_as_double(v86)), 56));
    v17 = (v87 & 0xffffffffffffff) + (v82 >> 56);
    v18 = (v86 & 0xffffffffffffff) + (v87 >> 56);
    v90 = _mm_add_epi64(_mm_sub_epi64(v78, (int128_t)a0[200]), v83);
    v15 = _mm_add_epi64(_mm_and_si128(v90, v88), _mm_srli_epi64(_INSERT(_mm_unpacklo_epi64(v90, v90), 0, __longlong_as_double(v81)), 56));
    v16 = (v82 & 0xffffffffffffff) + ((unsigned long long)(_mm_extract_epi64(v90, 1)) >> 56);
    v14 = v85 + (v81 & 0xffffffffffffff);
    sub_a04850(a0, &v14, &v8);
    sub_a04850(v80 + 128, v34, &v14);
    v92 = sub_a04850(a0 + 64, v34, &v1);
    if (!a2)
        v92 = sub_a04850(v34, &v8, &v1);
    if (*(long long *)&g_10002b0 == v20)
        return v92;
    ___stack_chk_fail();
}
