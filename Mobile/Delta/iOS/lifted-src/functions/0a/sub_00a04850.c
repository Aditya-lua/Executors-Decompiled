/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04850..0xa04b70 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a04850_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[16];
    unsigned long long field_20;
    unsigned long long field_28;
} st_a04850_0;

extern char g_10002b0;

void sub_a04850(st_a04850_0 *a0, void* a1, void* a2)
{
    unsigned long long i;  // x8
    unsigned long long v11;  // x21
    unsigned long v20;  // x14
    unsigned long v21;  // x15
    unsigned long long *v22;  // x17
    unsigned long long v23;  // x3
    unsigned long long v24;  // x23
    unsigned long long v25;  // x7
    unsigned long long v26;  // x6
    unsigned long v27;  // x7
    unsigned long v28;  // x25
    unsigned long long v29;  // x19
    unsigned long long v12;  // x22
    unsigned long v30;  // 4185
    unsigned long long v31;  // x20
    unsigned long v32;  // x23
    unsigned long long v33;  // x21
    unsigned long v34;  // 4187
    unsigned long long v35;  // x22
    unsigned long long idx;  // x24
    unsigned long v37;  // x23
    unsigned long long v38;  // x7
    unsigned long v39;  // 4215
    unsigned long long v13;  // x19
    unsigned long v40;  // x23
    unsigned long long v41;  // x19
    unsigned long v42;  // 4219
    unsigned long v43;  // x23
    unsigned long long v44;  // x21
    unsigned long v45;  // 4221
    unsigned long long index;  // x24
    unsigned long v47;  // x23
    unsigned long long v48;  // x7
    unsigned long v49;  // 4215
    unsigned long long v14;  // x20
    unsigned long v50;  // x23
    unsigned long long v51;  // x19
    unsigned long v52;  // 4219
    unsigned long v53;  // x23
    unsigned long long v54;  // x21
    unsigned long v55;  // 4221
    unsigned long long idx1;  // x23
    unsigned long v57;  // x24
    unsigned long v58;  // 4163
    unsigned long v59;  // x24
    void* v15;  // x9
    unsigned long v60;  // 4180
    unsigned long v61;  // x23
    unsigned long v62;  // 4202
    unsigned long long j;  // x23
    unsigned long long *v64;  // x26
    unsigned long long *v65;  // x25
    unsigned long long v66;  // x21
    unsigned long long v67;  // x19
    unsigned long v68;  // x7
    unsigned long v69;  // x27
    unsigned long v16;  // x10
    unsigned long long *v70;  // x26
    unsigned long v71;  // 4239
    unsigned int v72;  // w28
    unsigned long v73;  // x27
    unsigned long v74;  // 4245
    unsigned long long *v75;  // x25
    unsigned long v76;  // x16
    unsigned long v77;  // 4249
    unsigned long long v78;  // x16
    unsigned long long v79;  // 4186
    unsigned long v17;  // x11
    unsigned long long v80;  // x20
    unsigned long long v81;  // x7
    unsigned long v82;  // 4187
    unsigned long long v83;  // x6
    st_a04850_0 *v84;  // x23
    unsigned long long v85;  // x8
    unsigned long v86;  // 4118
    unsigned long long v87;  // x9
    unsigned long v88;  // x11
    unsigned long long v89;  // x8
    unsigned long long *v18;  // x12
    unsigned long long v90;  // 4135
    unsigned long v91;  // x12
    unsigned long long v92;  // x10
    unsigned long long v93;  // 4129
    unsigned long long v94;  // x11
    unsigned long v19;  // x13
    unsigned long v0;  // [bp-0xd8]
    __m128i v1;  // [bp-0xd0]
    __m128i v2;  // [bp-0xc0]
    __m128i v3;  // [bp-0xb0]
    __m128i v4;  // [bp-0xa0]
    __m128i v5;  // [bp-0x90]
    __m128i v6;  // [bp-0x80]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    i = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v7 = *(long long *)&g_10002b0;
    v15 = a2 + 32;
    v5 = _mm_add_epi64((int128_t)a1[32], *(int128_t *)a1);
    v6 = _mm_add_epi64((int128_t)a1[48], (int128_t)a1[16]);
    v3 = _mm_add_epi64((int128_t)a2[32], *(int128_t *)a2);
    v4 = _mm_add_epi64((int128_t)a2[48], (int128_t)a2[16]);
    v1 = _mm_add_epi64(v3, (int128_t)a2[32]);
    v2 = _mm_add_epi64(v4, (int128_t)a2[48]);
    v16 = *(long long *)a1;
    v17 = (long long)a1[32];
    v18 = &v5 | 8;
    v19 = _mm_cvtsi128_si64(v5);
    v20 = _mm_extract_epi64(v5, 1);
    v21 = _mm_cvtsi128_si64(v6);
    v0 = _mm_extract_epi64(v6, 1);
    v22 = a1 + 40;
    v23 = 1;
    do
    {
        v24 = i * 8;
        v25 = v24 & 0x7fffffff8;
        v26 = *(long long *)((char *)a2 + v25) * v16 >> 64;
        v27 = v16 * *(long long *)((char *)a2 + v25);
        v28 = v19 * *(long long *)((char *)&v3 + v25);
        v29 = v28 + v13;
        v30 = arm64g_calculate_flag_c(2, v28, v13, 0);
        v31 = (*(long long *)((char *)&v3 + v25) * v19 >> 64) + v14 + v30;
        v32 = v17 * *(long long *)((char *)v15 + v24);
        v33 = v32 + v11;
        v34 = arm64g_calculate_flag_c(2, v32, v11, 0);
        v35 = (*(long long *)((char *)v15 + v24) * v17 >> 64) + v12 + v34;
        if (v23 != 1)
        {
            idx = i - 1;
            v37 = (long long)a1[8] * *(long long *)((char *)a2 + 8 * (idx & 0xffffffff));
            v38 = v37 + v27;
            v39 = arm64g_calculate_flag_c(2, v37, v27, 0);
            v26 = ((unsigned long long)(*(long long *)((char *)a2 + 8 * (idx & 0xffffffff)) * (long long)a1[8]) >> 64) + v26 + v39;
            v40 = v20 * *(long long *)((char *)&v3 + 8 * (idx & 0xffffffff));
            v41 = v40 + v29;
            v42 = arm64g_calculate_flag_c(2, v40, v29, 0);
            v31 = (*(long long *)((char *)&v3 + 8 * (idx & 0xffffffff)) * v20 >> 64) + v31 + v42;
            v43 = (long long)a1[40] * *(long long *)((char *)v15 + 8 * idx);
            v44 = v43 + v33;
            v45 = arm64g_calculate_flag_c(2, v43, v33, 0);
            v35 = ((unsigned long long)(*(long long *)((char *)v15 + 8 * idx) * (long long)a1[40]) >> 64) + v35 + v45;
            v33 = v44;
            v29 = v41;
            v27 = v38;
            if (v23 != 2)
            {
                index = i - 2;
                v47 = (long long)a1[16] * *(long long *)((char *)a2 + 8 * (index & 0xffffffff));
                v48 = v47 + v38;
                v49 = arm64g_calculate_flag_c(2, v47, v38, 0);
                v26 = ((unsigned long long)(*(long long *)((char *)a2 + 8 * (index & 0xffffffff)) * (long long)a1[16]) >> 64) + v26 + v49;
                v50 = v21 * *(long long *)((char *)&v3 + 8 * (index & 0xffffffff));
                v51 = v50 + v41;
                v52 = arm64g_calculate_flag_c(2, v50, v41, 0);
                v31 = (*(long long *)((char *)&v3 + 8 * (index & 0xffffffff)) * v21 >> 64) + v31 + v52;
                v53 = (long long)a1[48] * *(long long *)((char *)v15 + 8 * index);
                v54 = v53 + v44;
                v55 = arm64g_calculate_flag_c(2, v53, v44, 0);
                v35 = ((unsigned long long)(*(long long *)((char *)v15 + 8 * index) * (long long)a1[48]) >> 64) + v35 + v55;
                v33 = v54;
                v29 = v51;
                v27 = v48;
                if (v23 != 3)
                {
                    idx1 = i - 3;
                    v57 = (long long)a1[24] * *(long long *)((char *)a2 + 8 * (idx1 & 0xffffffff));
                    v27 = v57 + v48;
                    v58 = arm64g_calculate_flag_c(2, v57, v48, 0);
                    v26 = ((unsigned long long)(*(long long *)((char *)a2 + 8 * (idx1 & 0xffffffff)) * (long long)a1[24]) >> 64) + v26 + v58;
                    v59 = v0 * *(long long *)((char *)&v3 + 8 * (idx1 & 0xffffffff));
                    v29 = v59 + v51;
                    v60 = arm64g_calculate_flag_c(2, v59, v51, 0);
                    v31 = (*(long long *)((char *)&v3 + 8 * (idx1 & 0xffffffff)) * v0 >> 64) + v31 + v60;
                    v61 = (long long)a1[56] * *(long long *)((char *)v15 + 8 * idx1);
                    v33 = v61 + v54;
                    v62 = arm64g_calculate_flag_c(2, v61, v54, 0);
                    v35 = ((unsigned long long)(*(long long *)((char *)v15 + 8 * idx1) * (long long)a1[56]) >> 64) + v35 + v62;
                }
            }
        }
        if (2 >= i)
        {
            j = 0;
            v64 = v18;
            v65 = v22;
            v66 = v33;
            v67 = v29;
            v68 = v27;
            do
            {
                v69 = *(long long *)((char *)v65 - 32) * *(long long *)((char *)a2 + 8 * j + 56);
                v27 = v69 + v68;
                v70 = v64 + 1;
                v71 = arm64g_calculate_flag_c(2, v69, v68, 0);
                v26 = ((unsigned long long)(*(long long *)((char *)a2 + 8 * j + 56) * *(long long *)((char *)v65 - 32)) >> 64) + v26 + v71;
                v72 = (unsigned int)j + 3;
                v73 = *v64 * *(long long *)((char *)&v1 + 8 * v72);
                v29 = v73 + v67;
                v74 = arm64g_calculate_flag_c(2, v73, v67, 0);
                v31 = (*(long long *)((char *)&v1 + 8 * v72) * *v64 >> 64) + v31 + v74;
                v75 = v65 + 1;
                v76 = *v65 * *(long long *)((char *)&v3 + 8 * v72);
                v33 = v76 + v66;
                v77 = arm64g_calculate_flag_c(2, v76, v66, 0);
                v35 = (*(long long *)((char *)&v3 + 8 * v72) * *v65 >> 64) + v35 + v77;
                j -= 1;
                v64 = v70;
                v65 = v75;
                v66 = v33;
                v67 = v29;
                v68 = v27;
            } while (i - 3 != j);
        }
        v78 = v29 - v27;
        v79 = arm64g_calculate_flag_c(4, v29, v27, 0);
        v80 = v31 - v26 - (v79 ^ 1);
        v81 = v33 + v27;
        v82 = arm64g_calculate_flag_c(2, v33, v27, 0);
        v83 = v35 + v26 + v82;
        v84 = &(&a0->field_0)[i];
        v84->field_0 = v81 & 0xffffffffffffff;
        v11 = v83 * 0x100 | v81 >> 56;
        v12 = v83 >> 56;
        v13 = v80 * 0x100 | v78 >> 56;
        v14 = v80 >> 56;
        i += 1;
        v84->field_20 = v78 & 0xffffffffffffff;
        v23 += 1;
        v18 += 1;
        v22 += 1;
    } while (i != 4);
    v85 = v11 + v13;
    v86 = arm64g_calculate_flag_c(2, v11, v13, 0);
    v87 = v12 + v14 + v86;
    v88 = a0->field_28;
    v89 = v85 + a0->field_20;
    v90 = arm64g_calculate_condition(50, v85, a0->field_20, 0);
    if (!(v90 & 1))
        v87 += 1;
    v91 = a0->field_8;
    v92 = v13 + a0->field_0;
    v93 = arm64g_calculate_condition(50, v13, a0->field_0, 0);
    if (v93 & 1)
        v94 = v14;
    else
        v94 = v14 + 1;
    a0->field_20 = v89 & 0xffffffffffffff;
    a0->field_28 = v88 + (v87 * 0x100 | v89 >> 56);
    a0->field_0 = v92 & 0xffffffffffffff;
    a0->field_8 = v91 + (v94 * 0x100 | v92 >> 56);
    if (*(long long *)&g_10002b0 == v7)
        return;
    ___stack_chk_fail();
}
