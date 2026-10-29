/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bda40..0x9bdca0 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bda40_3 {
    unsigned int field_0[4];
    unsigned int field_c;
} st_9bda40_3;

typedef struct st_9bda40_2 {
    char padding_0[240];
    unsigned int field_f0;
} st_9bda40_2;


double sub_9bda40(uint128_t *a0, uint128_t *a1, unsigned long long a2, st_9bda40_2 *a3, st_9bda40_3 *a4, unsigned long a5, unsigned long a6, unsigned long a7, char a8, unsigned long a9, char a10, unsigned long a11)
{
    unsigned long long v13;  // x30
    unsigned long long v14;  // d8
    __m128i v23;  // q15
    __m128i v24;  // q0
    __m128i v25;  // q11
    uint128_t v26;  // q4
    __m128i v27;  // q12
    __m128i v28;  // q14
    __m128i v29;  // q1
    __m128i v30;  // q2
    __m128i v31;  // q3
    __m128i v32;  // q6
    unsigned long long v15;  // d9
    __m128i v33;  // q4
    __m128i v34;  // q7
    uint128_t *v35;  // x0
    unsigned long long v36;  // x2
    uint128_t *v37;  // x0
    __m128i v38;  // q17
    uint128_t *v39;  // x0
    __m128i v40;  // q17
    uint128_t *v41;  // x0
    uint128_t *v42;  // x1
    unsigned long long v16;  // d10
    __m128i v43;  // q16
    uint128_t *v44;  // x0
    uint128_t *v45;  // x1
    uint128_t *v46;  // x1
    __m128i v47;  // q1
    uint128_t *v48;  // x0
    __m128i v49;  // q3
    uint128_t *v50;  // x0
    __m128i v51;  // q6
    __m128i v52;  // q6
    unsigned long long v17;  // d11
    uint128_t *v53;  // x1
    uint128_t *v54;  // x1
    uint128_t *v55;  // x1
    uint128_t *v56;  // x1
    unsigned long long v57;  // 4186
    unsigned long long v58;  // x2
    uint128_t *v59;  // x0
    uint128_t *v60;  // x1
    uint128_t *v61;  // x0
    uint128_t *v62;  // x1
    unsigned long long v18;  // d12
    unsigned long long v63;  // 4112
    uint128_t *v64;  // x0
    uint128_t *v65;  // x1
    uint128_t *v66;  // x0
    uint128_t *v67;  // x1
    unsigned long long v68;  // 4112
    uint128_t *v69;  // x0
    uint128_t *v70;  // x1
    unsigned long long v71;  // 4112
    unsigned long long v72;  // x30
    unsigned long long v19;  // d13
    unsigned long long v73;  // x19
    unsigned long long v74;  // x20
    unsigned long long v75;  // x21
    unsigned long long v76;  // x22
    unsigned long long v77;  // x23
    uint128_t *v78;  // x19
    uint128_t *iter;  // x20
    unsigned long long i;  // x21
    unsigned long v81;  // x23
    unsigned long long v82;  // x23
    unsigned long long v20;  // d14
    unsigned long long v83;  // x21
    uint128_t *v84;  // x19
    uint128_t v21;  // q15
    uint128_t v22;  // q7
    char *v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x50], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    uint128_t v8;  // [bp-0x20], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0x18]
    uint128_t v10;  // [bp-0x10], Other Possible Types: unsigned long long
    unsigned long v11;  // [bp-0x8]
    unsigned int v12;  // [bp-0x4]

    if (a2 >= 8)
    {
        v2 = &a8;
        v3 = v13;
        v4 = v14;
        v5 = v15;
        v6 = v16;
        v7 = v17;
        v8 = v18;
        v9 = v19;
        v10 = v20;
        v11 = v21;
        xsp = (int)&(&a10)[-128 * a3->field_f0];
        sub_9bd640();
        *(uint128_t *)xsp = v21 ^ v22;
        v23 = __dirty_unsupported_Iop_Reverse8sIn32_x4(a4->field_0);
        v24 = __dirty_unsupported_Iop_Reverse8sIn32_x4(a4->field_0);
        v25 = __dirty_unsupported_Iop_SliceV128(CONCAT(4294967297, 4294967297), 0, 4);
        v26 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*(int128_t *)xsp);
        v27 = _mm_add_epi32(v25, v25);
        *(uint128_t *)xsp = v26;
        v28 = _mm_add_epi32(v27, v27);
        do
        {
            v29 = _mm_add_epi32(v23, v25);
            v30 = _mm_add_epi32(v23, v27);
            v31 = _mm_add_epi32(v23, _mm_add_epi32(v25, v27));
            v32 = _mm_add_epi32(v30, v28);
            v33 = _mm_add_epi32(v23, v28);
            v34 = _mm_add_epi32(v31, v28);
            v23 = _mm_add_epi32(v33, v28);
            v35 = sub_9bd040();
            v36 = a2 - 8;
            if (a2 < 8)
            {
                v58 = v36 + 8;
                v59 = v35 + 1;
                *a1 = _mm_xor_si128(*v35, v24);
                v60 = a1 + 1;
                if (v58 >= 2)
                {
                    v61 = v59 + 1;
                    *v60 = _mm_xor_si128(*v59, v29);
                    v62 = v60 + 1;
                    v63 = arm64g_calculate_condition(4, v58, 2, 0);
                    if (!(v63 & 1))
                    {
                        v64 = v61 + 1;
                        *v62 = _mm_xor_si128(*v61, v33);
                        v65 = v62 + 1;
                        if (v58 >= 4)
                        {
                            v66 = v64 + 1;
                            *v65 = _mm_xor_si128(*v64, v32);
                            v67 = v65 + 1;
                            v68 = arm64g_calculate_condition(4, v58, 4, 0);
                            if (!(v68 & 1))
                            {
                                v69 = v66 + 1;
                                *v67 = _mm_xor_si128(*v66, v31);
                                v70 = v67 + 1;
                                if (v58 >= 6)
                                {
                                    *v70 = _mm_xor_si128(*v69, v34);
                                    v71 = arm64g_calculate_condition(4, v58, 6, 0);
                                    if (!(v71 & 1))
                                    {
                                        v70[1] = _mm_xor_si128(v69[1], v30);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            v37 = v35 + 1;
            v38 = *v37;
            v39 = v37 + 1;
            v40 = *v39;
            v41 = v39 + 1;
            *a1 = _mm_xor_si128(*v35, v24);
            v42 = a1 + 1;
            v43 = *v41;
            v44 = v41 + 1;
            *v42 = _mm_xor_si128(v38, v29);
            v45 = v42 + 1;
            v24 = v23;
            *v45 = _mm_xor_si128(v40, v33);
            v46 = v45 + 1;
            v47 = *v44;
            v48 = v44 + 1;
            v49 = *v48;
            v50 = v48 + 1;
            v51 = *v50;
            v52 = v50[1];
            *v46 = _mm_xor_si128(v43, v32);
            v53 = v46 + 1;
            *v53 = _mm_xor_si128(v47, v31);
            v54 = v53 + 1;
            *v54 = _mm_xor_si128(v49, v34);
            v55 = v54 + 1;
            *v55 = _mm_xor_si128(v51, v30);
            v56 = v55 + 1;
            *v56 = _mm_xor_si128(v52, _mm_add_epi32(v29, v28));
            a1 = v56 + 1;
            v57 = arm64g_calculate_condition(20, a2, 8, 0);
            a2 = v36;
        } while (v57 & 1);
        do
        {
            *(uint128_t *)xsp = 0;
            *(uint128_t *)(xsp + 16) = 0;
            xsp = xsp + 32;
        } while (xsp != &v2);
        return 0;
    }
    else
    {
        v0 = &a8;
        v1 = v72;
        v2 = v73;
        v3 = v74;
        v4 = v75;
        v5 = v76;
        v6 = v77;
        v78 = a0;
        iter = a1;
        i = a2;
        v81 = a4->field_0[3];
        v82 = (((((v81 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v81 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v81 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v81 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v10 = (uint128_t)a4->field_0;
        do
        {
            v83 = i;
            sub_9b8de4(&v10, &v8, a3);
            v84 = v78 + 1;
            v82 += 1;
            v12 = (((((v82 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v82 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v82 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v82 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            *iter = v8 ^ *v78;
            iter += 1;
            i = v83 - 1;
            v78 = v84;
        } while (i);
        return 0;
    }
}
