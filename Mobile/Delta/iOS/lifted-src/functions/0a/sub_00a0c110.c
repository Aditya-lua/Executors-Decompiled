/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0c110..0xa0c920 (2064 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0c110_0 {
    unsigned int field_0;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
    char field_8;
    char field_9;
    char field_a;
    char field_b;
    char field_c;
    char field_d;
    char field_e;
    char field_f;
    unsigned int field_10;
    char field_14;
    char field_15;
    char field_16;
    char field_17;
    char field_18;
    char field_19;
    char field_1a;
    char field_1b;
    char field_1c;
    char field_1d;
    char field_1e;
    char field_1f;
} st_a0c110_0;

extern long long g_d44104;
extern long long g_d4412c;
extern long long g_d44154;
extern char g_1000000;
extern char g_10002b0;

int sub_a0c110(void* a0, st_a0c110_0 *a1)
{
    unsigned long long v44;  // x8
    unsigned long v45;  // x9
    unsigned long v54;  // x2
    unsigned long v55;  // x3
    unsigned long v56;  // x6
    unsigned long long v57;  // x17
    unsigned long long v58;  // x10
    unsigned long v59;  // x2
    unsigned long long v60;  // x10
    unsigned long v61;  // x13
    unsigned long long v62;  // x0
    unsigned long v63;  // x10
    unsigned long long v46;  // x12
    void* v64;  // x22
    unsigned long long v65;  // x5
    unsigned long long v66;  // x6
    unsigned long long v67;  // x15
    unsigned long long v68;  // x1
    unsigned long v69;  // x5
    unsigned long long v70;  // x4
    unsigned long long v71;  // x14
    unsigned long long v72;  // x16
    unsigned long long v73;  // x17
    unsigned long long v47;  // x9
    unsigned long long v74;  // x1
    unsigned long long v75;  // x10
    unsigned long long v76;  // x9
    uint128_t v77;  // q0
    uint128_t v78;  // q1
    __m128i v79;  // q1
    __m128i v81;  // q3
    unsigned long v48;  // x10
    uint128_t v84;  // q0
    __m128i v85;  // q0
    unsigned int i;  // w19
    unsigned int v88;  // w19
    unsigned int j;  // w19
    unsigned int v90;  // w19
    unsigned int k;  // w19
    unsigned int v92;  // w19
    unsigned int v93;  // w26
    unsigned long v49;  // x9
    unsigned int v94;  // w25
    unsigned int v95;  // w28
    unsigned int v96;  // w27
    unsigned int v97;  // w19
    unsigned int v98;  // w22
    unsigned int v99;  // w24
    unsigned int v100;  // w23
    __m128i v102;  // q1
    unsigned long v103;  // d0
    unsigned long long v50;  // x8
    unsigned long long v51;  // x15
    unsigned long long v52;  // x13
    unsigned long long v53;  // x16
    void* v0;  // [bp-0x1a0]
    unsigned int v1;  // [bp-0x198]
    unsigned int v2;  // [bp-0x194]
    unsigned int v3;  // [bp-0x190]
    unsigned int v4;  // [bp-0x18c]
    unsigned int v5;  // [bp-0x188]
    unsigned int v6;  // [bp-0x184]
    unsigned int v7;  // [bp-0x180]
    unsigned int v8;  // [bp-0x17c]
    unsigned int v9;  // [bp-0x178]
    unsigned int v10;  // [bp-0x174]
    unsigned int v11;  // [bp-0x170]
    unsigned int v12;  // [bp-0x16c]
    char v13;  // [bp-0x168]
    __m128i v14;  // [bp-0x140]
    __m128i v15;  // [bp-0x130]
    unsigned long long v16;  // [bp-0x120]
    uint128_t v17;  // [bp-0x110]
    __m128i v18;  // [bp-0x100]
    unsigned long long v19;  // [bp-0xf0]
    char v20;  // [bp-0xe8]
    char v21;  // [bp-0xc0], Other Possible Types: unsigned int
    unsigned int v22;  // [bp-0xbc]
    unsigned int v23;  // [bp-0xb8]
    unsigned int v24;  // [bp-0xb4]
    unsigned int v25;  // [bp-0xb0]
    unsigned int v26;  // [bp-0xac]
    unsigned int v27;  // [bp-0xa8]
    unsigned int v28;  // [bp-0xa4]
    unsigned int v29;  // [bp-0xa0]
    unsigned int v30;  // [bp-0x9c]
    char v31;  // [bp-0x98], Other Possible Types: unsigned int
    unsigned int v32;  // [bp-0x94]
    unsigned int v33;  // [bp-0x90]
    unsigned int v34;  // [bp-0x8c]
    unsigned int v35;  // [bp-0x88]
    unsigned int v36;  // [bp-0x84]
    unsigned int v37;  // [bp-0x80]
    unsigned int v38;  // [bp-0x7c]
    unsigned int v39;  // [bp-0x78]
    unsigned int v40;  // [bp-0x74]
    unsigned long v41;  // [bp-0x70]
    char *v42;  // [bp-0x10]
    char v43;  // [bp+0x0]

    v42 = &v43;
    v41 = *(long long *)&g_10002b0;
    v44 = a1->field_1d * 4;
    v45 = a1->field_1e;
    v46 = a1->field_4 * 64 | a1->field_5 * 0x4000 | a1->field_6 * 0x400000;
    v47 = a1->field_7 * 32 | a1->field_8 * 0x2000;
    v48 = a1->field_9;
    v49 = a1->field_1f;
    v50 = (v44 | v45 * 0x400) & 0xfffffffffe000000 | ((v44 | v45 * 0x400) & 0xfffffffffe03ffff | (v49 * 0x40000 | v49 >> 46) & 0x1fc0000) & 0x1ffffff;
    v51 = &(&g_1000000)[v50];
    v52 = a1->field_0 + (unsigned int)(v51 >> 25) * 19;
    v53 = v52 + 0x2000000;
    v54 = a1->field_f;
    v55 = a1->field_10;
    v56 = a1->field_16;
    v57 = a1->field_a * 8 | a1->field_b * 0x800 | a1->field_c * 0x80000;
    v58 = a1->field_d * 4 | a1->field_e * 0x400;
    v59 = a1->field_1a;
    v60 = a1->field_14 * 128 | a1->field_15 * 0x8000;
    v61 = a1->field_1b;
    v62 = a1->field_17 * 32 | a1->field_18 * 0x2000 | a1->field_19 * 0x200000;
    v63 = a1->field_1c;
    *(unsigned int *)&a0[40] = v52 - ((unsigned int)v53 & 0xfc000000);
    v64 = a0 + 40;
    v65 = &(&g_1000000)[v46];
    v66 = (v47 | v48 * 0x200000) + (v65 >> 25);
    v67 = &(&g_1000000)[v57];
    v68 = (v58 | v54 * 0x40000) + (v67 >> 25);
    v69 = &(&g_1000000)[v55];
    v70 = (v60 | v56 * 0x800000) + (v69 >> 25);
    v71 = &(&g_1000000)[v62];
    v72 = v66 + 0x2000000;
    v73 = v68 + 0x2000000;
    v74 = v70 + 0x2000000;
    *(unsigned int *)&v64[4] = (unsigned int)(v46 - ((unsigned int)v65 & 0x7e000000)) + (unsigned int)(v53 >> 26);
    *(unsigned int *)&v64[8] = v66 - ((unsigned int)v72 & 0xfc000000);
    *(unsigned int *)&v64[12] = (v72 >> 26) + v57 - ((unsigned int)v67 & 0xe000000);
    *(unsigned int *)&v64[16] = v68 - ((unsigned int)v73 & 0xfc000000);
    v75 = (v59 * 16 | v61 * 0x1000 | v63 * 0x100000) + (v71 >> 25);
    v76 = v75 + 0x2000000;
    *(unsigned int *)&v64[20] = (unsigned int)(v55 - ((unsigned int)v69 & 0xfe000000)) + (unsigned int)(v73 >> 26);
    *(unsigned int *)&v64[24] = v70 - ((unsigned int)v74 & 0xfc000000);
    *(unsigned int *)&v64[28] = (v74 >> 26) + v62 - ((unsigned int)v71 & 0x3e000000);
    *(unsigned int *)&v64[32] = v75 - ((unsigned int)v76 & 0xfc000000);
    *(unsigned int *)&v64[36] = v50 + (v76 >> 26) - ((unsigned int)v51 & 0x2000000);
    *(uint128_t *)&v64[40] = 0;
    *(uint128_t *)&v64[56] = 0;
    *(unsigned long long *)&v64[72] = 0;
    *(unsigned int *)&v64[40] = 1;
    sub_a113ac(&v17, v64);
    sub_a10314(&v14, &v17, &g_d44104);
    v77 = __double_as_longlong((double)v64[44]);
    v78 = __dirty_unsupported_Iop_SliceV128(v77, v77, 12);
    v79 = (__m128i)_INSERT(v78, 12, (int)v64[52]);
    v17 = _INSERT(_mm_sub_epi32(v17, v79), 0, *(unsigned int *)&v17 + 0xffffffff);
    v18 = _mm_sub_epi32(v18, (int128_t)v64[56]);
    v0 = v64;
    v81 = __double_as_longlong((double)v64[72]);
    v19 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v19, v81));
    v84 = __dirty_unsupported_Iop_SliceV128(v77, __dirty_unsupported_Iop_SliceV128(CONCAT(4294967297, 4294967297), CONCAT(4294967297, 4294967297), 4), 12);
    v85 = (__m128i)_INSERT(v84, 12, (int)v64[52]);
    v14 = _mm_add_epi32(v14, v85);
    v15 = _mm_add_epi32(v15, (int128_t)v64[56]);
    v16 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v16, v81));
    sub_a10314(&v13, &v17, &v14);
    sub_a113ac(&v31, &v13);
    sub_a113ac(&v21, &v31);
    sub_a113ac(&v21, &v21);
    sub_a10314(&v21, &v13, &v21);
    sub_a10314(&v31, &v31, &v21);
    sub_a113ac(&v31, &v31);
    sub_a10314(&v31, &v21, &v31);
    sub_a113ac(&v21, &v31);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a10314(&v31, &v21, &v31);
    sub_a113ac(&v21, &v31);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a10314(&v21, &v21, &v31);
    sub_a113ac(&v20, &v21);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a113ac(&v20, &v20);
    sub_a10314(&v21, &v20, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a113ac(&v21, &v21);
    sub_a10314(&v31, &v21, &v31);
    sub_a113ac(&v21, &v31);
    i = 49;
    do
    {
        v88 = i;
        sub_a113ac(&v21, &v21);
        i = v88 - 1;
    } while (i);
    sub_a10314(&v21, &v21, &v31);
    sub_a113ac(&v20, &v21);
    j = 99;
    do
    {
        v90 = j;
        sub_a113ac(&v20, &v20);
        j = v90 - 1;
    } while (j);
    sub_a10314(&v21, &v20, &v21);
    sub_a113ac(&v21, &v21);
    k = 49;
    do
    {
        v92 = k;
        sub_a113ac(&v21, &v21);
        k = v92 - 1;
    } while (k);
    sub_a10314(&v31, &v21, &v31);
    sub_a113ac(&v31, &v31);
    sub_a113ac(&v31, &v31);
    sub_a10314(a0, &v31, &v13);
    sub_a10314(a0, a0, &v17);
    sub_a113ac(&v31, a0);
    sub_a10314(&v31, &v31, &v14);
    v11 = v32;
    v12 = v31;
    v9 = *(unsigned int *)&v17;
    v10 = *(unsigned int *)((void*)&v17 + 4);
    v21 = v12 - v9;
    v22 = v11 - v10;
    v7 = v34;
    v8 = v33;
    v5 = *(unsigned int *)((void*)&v17 + 8);
    v6 = *(unsigned int *)((void*)&v17 + 12);
    v23 = v8 - v5;
    v24 = v7 - v6;
    v3 = v36;
    v4 = v35;
    v1 = _mm_cvtsi128_si32(v18);
    v2 = _mm_extract_epi32(v18, 1);
    v25 = v4 - v1;
    v26 = v3 - v2;
    v93 = v37;
    v94 = v38;
    v95 = _mm_extract_epi32(v18, 2);
    v96 = _mm_extract_epi32(v18, 3);
    v27 = v93 - v95;
    v28 = v94 - v96;
    v97 = v39;
    v98 = v40;
    v99 = v19;
    v100 = *(unsigned int *)((void*)&v19 + 4);
    v29 = v97 - v99;
    v30 = v98 - v100;
    sub_a106a8(&v20, &v21);
    if (sub_a66f20(&v20, &g_d44154, 32))
    {
        v21 = v9 + v12;
        v22 = v10 + v11;
        v23 = v5 + v8;
        v24 = v6 + v7;
        v25 = v1 + v4;
        v26 = v2 + v3;
        v27 = v95 + v93;
        v28 = v96 + v94;
        v29 = v99 + v97;
        v30 = v100 + v98;
        sub_a106a8(&v20, &v21);
        if (sub_a66f20(&v20, &g_d44154, 32))
        {
            if (*(long long *)&g_10002b0 == v41)
                return 0xffffffff;
            ___stack_chk_fail();
        }
        else
        {
            sub_a10314(a0, a0, &g_d4412c);
        }
    }
    sub_a106a8(&v20, a0);
    if ((v20 & 1) != a1->field_1f >> 7)
    {
        v102 = (int128_t)a0[16];
        *(__m128i *)a0 = _mm_sub_epi32(_mm_setzero_si128(), *(int128_t *)a0);
        *(__m128i *)&a0[16] = _mm_sub_epi32(_mm_setzero_si128(), v102);
        v103 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(_mm_setzero_si128(), __double_as_longlong((double)a0[32])));
        *(unsigned long *)&a0[32] = v103;
    }
    sub_a10314(a0 + 120, a0, v0);
    if (*(long long *)&g_10002b0 == v41)
        return 0;
    ___stack_chk_fail();
}
