/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa10c84..0xa1110c (1160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;
extern char g_10002b0;

double sub_a10c84(void* a0, int *a1)
{
    unsigned long v13;  // x6
    unsigned long v14;  // x22
    unsigned long long v23;  // x11
    unsigned long long v24;  // x12
    unsigned long long v25;  // x15
    unsigned long long v26;  // x0
    unsigned long long v27;  // x4
    unsigned long long v28;  // x2
    unsigned long long v29;  // x16
    unsigned long v30;  // x23
    unsigned long v31;  // x25
    unsigned long v32;  // x21
    unsigned long v15;  // x7
    unsigned long v33;  // x5
    unsigned long long v34;  // x11
    unsigned long long v35;  // x15
    unsigned long long v36;  // x12
    unsigned long long v37;  // x17
    unsigned long long v38;  // x11
    unsigned long long v39;  // x0
    unsigned long long v40;  // x11
    unsigned long long v41;  // x2
    unsigned long long v42;  // x17
    unsigned long v16;  // x3
    unsigned long long v43;  // x14
    unsigned long long v44;  // x0
    unsigned long long v45;  // x3
    unsigned long long v46;  // x0
    unsigned long long v47;  // x13
    unsigned long long v48;  // x14
    unsigned long long v49;  // x15
    unsigned int v50;  // w25
    unsigned long long v51;  // x14
    unsigned long long v52;  // x16
    unsigned long v17;  // x17
    unsigned long long v53;  // x13
    unsigned long long v54;  // x10
    unsigned long long v55;  // x14
    unsigned long long v56;  // x8
    unsigned long long v57;  // x12
    unsigned int v58;  // w28
    unsigned int v59;  // w22
    unsigned int v60;  // w26
    unsigned int v61;  // w27
    unsigned long long v62;  // x9
    unsigned long v18;  // x1
    unsigned int v63;  // w23
    unsigned int v64;  // w24
    void* v65;  // x21
    __m128i v66;  // q1
    __m128i v67;  // q2
    __m128i v68;  // q0
    __m128i v69;  // q3
    __m128i v70;  // q4
    __m128i v71;  // q5
    __m128i v72;  // q2
    unsigned long v19;  // x14
    __m128i v73;  // q6
    unsigned long long v74;  // d1
    unsigned long v75;  // d4
    unsigned long v77;  // d5
    unsigned int v78;  // w8
    unsigned int v79;  // w9
    unsigned int v80;  // w10
    unsigned int v81;  // w11
    unsigned int v82;  // w12
    unsigned long v20;  // x13
    unsigned int v83;  // w13
    unsigned long v84;  // x14
    unsigned long v85;  // x15
    unsigned long v86;  // x16
    unsigned long v87;  // x17
    unsigned long long v88;  // x0
    unsigned long long v89;  // x1
    unsigned int v90;  // w8
    unsigned int v91;  // w9
    unsigned int v92;  // w10
    unsigned long v21;  // x9
    unsigned int v93;  // w11
    unsigned long v22;  // x10
    unsigned int v0;  // [bp-0x9c]
    unsigned int v1;  // [bp-0x98]
    unsigned int v2;  // [bp-0x94]
    unsigned long long v3;  // [bp-0x90]
    unsigned int v4;  // [bp-0x88]
    unsigned int v5;  // [bp-0x84]
    unsigned int v6;  // [bp-0x80]
    unsigned int v7;  // [bp-0x7c]
    unsigned long long v8;  // [bp-0x78]
    unsigned long long v9;  // [bp-0x70]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    sub_a113ac();
    sub_a113ac(a0 + 80, a1 + 10);
    v13 = a1[20];
    v14 = a1[21];
    v15 = a1[22];
    v16 = a1[23];
    v17 = a1[24];
    v18 = a1[25];
    v19 = a1[26];
    v20 = a1[27];
    v21 = a1[28];
    v22 = a1[29];
    v23 = v13 * 2;
    v24 = v14 * 2;
    v25 = v15 * 2;
    v26 = v16 * 2;
    v27 = v17 * 2;
    v28 = v18 * 2;
    v29 = v20 * 2;
    v30 = (unsigned int)v19 * 19;
    v31 = (unsigned int)v20 * 38;
    v32 = (unsigned int)v21 * 19;
    v33 = (unsigned int)v22 * 38;
    v34 = (38 * (unsigned int)v18 * (unsigned int)v18 + (unsigned int)v13 * (unsigned int)v13 + v27 * v30 + v26 * v31 + v25 * v32 + v24 * v33) * 2;
    v35 = (v24 * v26 + (unsigned int)v15 * (unsigned int)v15 + v23 * v17 + v20 * v31 + v32 * v19 * 2 + v28 * v33) * 2;
    v36 = v34 + 0x2000000;
    v37 = ((long long)(v36) >> 26) + (v14 * v23 + v28 * v30 + v17 * v31 + v26 * v32 + v15 * v33) * 2;
    v38 = v35 + 0x2000000;
    v39 = ((long long)(v38) >> 26) + (v16 * v25 + v24 * v17 + v23 * v18 + v29 * v32 + v19 * v33) * 2;
    v40 = &(&g_1000000)[v37];
    v41 = ((long long)(v40) >> 25) + (v14 * v24 + v23 * v15 + v19 * v30 + v28 * v31 + v27 * v32 + v26 * v33) * 2;
    v42 = &(&g_1000000)[v39];
    v43 = ((long long)(v42) >> 25) + (v25 * v17 + v16 * v26 + v24 * v28 + v23 * v19 + v21 * v32 + v29 * v33) * 2;
    v44 = v41 + 0x2000000;
    v45 = ((long long)(v44) >> 26) + (v15 * v24 + v23 * v16 + v19 * v31 + v28 * v32 + v17 * v33) * 2;
    v46 = v43 + 0x2000000;
    v47 = ((long long)(v46) >> 26) + (v17 * v26 + v25 * v18 + v24 * v19 + v23 * v20 + v21 * v33) * 2;
    v2 = v43 - ((unsigned int)v46 & 0xfc000000);
    v48 = &(&g_1000000)[v45];
    v49 = v35 - (v38 & 0xfffffffffc000000) + ((long long)(v48) >> 25);
    v50 = v45 - ((unsigned int)v48 & 0xfe000000);
    v51 = &(&g_1000000)[v47];
    v52 = ((long long)(v51) >> 25) + (v25 * v19 + (unsigned int)v17 * (unsigned int)v17 + v26 * v28 + v24 * v29 + v23 * v21 + v22 * v33) * 2;
    v0 = v41 - ((unsigned int)v44 & 0xfc000000);
    v1 = v47 - ((unsigned int)v51 & 0xfe000000);
    v53 = v52 + 0x2000000;
    v54 = ((long long)(v53) >> 26) + (v18 * v27 + v26 * v19 + v25 * v20 + v24 * v21 + v23 * v22) * 2;
    v55 = &(&g_1000000)[v54];
    v56 = v34 - (v36 & 0xfffffffffc000000) + 19 * ((long long)(v55) >> 25);
    v57 = v49 + 0x2000000;
    v58 = (unsigned int)(v39 - ((unsigned int)v42 & 0xfe000000)) + (unsigned int)(v57 >> 26);
    v59 = v49 - ((unsigned int)v57 & 0xfc000000);
    v60 = v52 - ((unsigned int)v53 & 0xfc000000);
    v61 = v54 - ((unsigned int)v55 & 0xfe000000);
    v62 = v56 + 0x2000000;
    v63 = (unsigned int)(v37 - ((unsigned int)v40 & 0xfe000000)) + (unsigned int)(v62 >> 26);
    v64 = v56 - ((unsigned int)v62 & 0xfc000000);
    *(unsigned int *)&a0[120] = v64;
    *(unsigned int *)&a0[124] = v63;
    *(unsigned int *)&a0[128] = v0;
    *(unsigned int *)&a0[132] = v50;
    *(unsigned int *)&a0[0x88] = v59;
    *(unsigned int *)&a0[140] = v58;
    *(unsigned int *)&a0[144] = v2;
    *(unsigned int *)&a0[148] = v1;
    *(unsigned int *)&a0[152] = v60;
    *(unsigned int *)&a0[156] = v61;
    *(int *)&a0[40] = a1[10] + *a1;
    v65 = a0 + 40;
    *(int *)&a0[44] = a1[11] + a1[1];
    *(int *)&a0[48] = a1[12] + a1[2];
    *(int *)&a0[52] = a1[13] + a1[3];
    *(int *)&a0[56] = a1[14] + a1[4];
    *(int *)&a0[60] = a1[15] + a1[5];
    *(int *)&a0[64] = a1[16] + a1[6];
    *(int *)&a0[0x44] = a1[0x11] + a1[7];
    *(int *)&a0[72] = a1[18] + a1[8];
    *(int *)&a0[76] = a1[19] + a1[9];
    sub_a113ac(&v3, v65, v2, v1, v0);
    v66 = (int128_t)a0[104];
    v67 = (int128_t)a0[24];
    v68 = _mm_sub_epi32(v66, v67);
    v69 = __double_as_longlong((double)a0[80]);
    v70 = *(unsigned long long *)&*(double *)a0;
    v71 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v70, v69));
    *(long long *)v65 = _mm_cvtsi128_si64(v71);
    v72 = _mm_add_epi32(v67, v66);
    v73 = _mm_unpackhi_epi64(v72, v72);
    v74 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v69, v70));
    v75 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v9, v73));
    *(uint128_t *)&a0[72] = _INSERT(v73, 8, __double_as_longlong(v74));
    v77 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v3, v71));
    v78 = (int)a0[88];
    v79 = (int)a0[92];
    v80 = (int)a0[8];
    v81 = (int)a0[12];
    v82 = v80 + v78;
    v83 = v81 + v79;
    *(unsigned int *)&a0[48] = v82;
    *(unsigned int *)&a0[52] = v83;
    v84 = (int)a0[96];
    v85 = (int)a0[100];
    v86 = (int)a0[16];
    v87 = (int)a0[20];
    v88 = v86 + v84;
    v89 = v87 + v85;
    *(unsigned int *)&a0[56] = v88;
    *(unsigned int *)&a0[60] = v89;
    v90 = v78 - v80;
    v91 = v79 - v81;
    *(unsigned int *)&a0[88] = v90;
    *(unsigned int *)&a0[92] = v91;
    v92 = v84 - v86;
    v93 = v85 - v87;
    *(unsigned int *)&a0[96] = v92;
    *(unsigned int *)&a0[100] = v93;
    *(__m128i *)&a0[104] = v68;
    *(unsigned long *)a0 = v77;
    *(unsigned int *)&a0[8] = v4 - v82;
    *(unsigned int *)&a0[12] = v5 - v83;
    *(unsigned int *)&a0[16] = v6 - v88;
    *(unsigned int *)&a0[20] = v7 - v89;
    *(long long *)&a0[64] = _mm_cvtsi128_si64(v72);
    *(unsigned long long *)&a0[24] = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v8, v72));
    *(unsigned long *)&a0[32] = v75;
    *(unsigned int *)&a0[120] = v64 - (unsigned int)v74;
    *(unsigned int *)&a0[124] = v63 - *(unsigned int *)((void*)&v74 + 4);
    *(unsigned int *)&a0[128] = v0 - v90;
    *(unsigned int *)&a0[132] = v50 - v91;
    *(unsigned int *)&a0[0x88] = v59 - v92;
    *(unsigned int *)&a0[140] = v58 - v93;
    *(unsigned int *)&a0[144] = v2 - _mm_cvtsi128_si32(v68);
    *(unsigned int *)&a0[148] = v1 - _mm_extract_epi32(v68, 1);
    *(unsigned int *)&a0[152] = v60 - _mm_extract_epi32(v68, 2);
    *(unsigned int *)&a0[156] = v61 - _mm_extract_epi32(v68, 3);
    if (*(long long *)&g_10002b0 == v10)
        return _mm_cvtsi128_si64(v68);
    ___stack_chk_fail(v88, v89);
}
