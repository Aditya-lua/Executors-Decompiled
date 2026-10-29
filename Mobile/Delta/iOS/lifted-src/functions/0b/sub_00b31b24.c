/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb31b24..0xb31dec (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_b31b24(unsigned long a0, uint128_t *a1, unsigned long long a2)
{
    unsigned long long v27;  // x22
    uint128_t *v28;  // x8
    unsigned int v37;  // w3
    unsigned int v38;  // w9
    unsigned int v39;  // w5
    unsigned int v40;  // w0
    unsigned int v41;  // w17
    unsigned int v42;  // w12
    unsigned int v43;  // w14
    unsigned int v44;  // w11
    unsigned int v45;  // w1
    unsigned int v46;  // w8
    uint128_t *iter;  // x20
    unsigned int v47;  // w4
    unsigned int v48;  // w13
    unsigned int j;  // w6
    unsigned int v50;  // w2
    unsigned int v51;  // w15
    unsigned int v52;  // w16
    unsigned int v53;  // w5
    unsigned int v54;  // w17
    unsigned int v55;  // w3
    unsigned int v56;  // w0
    unsigned long long i;  // x23
    unsigned int v57;  // w12
    unsigned int v58;  // w9
    unsigned int v59;  // w10
    unsigned int v60;  // w14
    unsigned int v61;  // w4
    unsigned int v62;  // w2
    unsigned int v63;  // w1
    unsigned int v64;  // w13
    unsigned int v65;  // w15
    unsigned int v66;  // w8
    __m128i v31;  // q2
    unsigned int v67;  // w11
    uint128_t v69;  // q0
    __m128i v70;  // q0
    uint128_t v72;  // q3
    __m128i v73;  // q3
    uint128_t v75;  // q0
    __m128i v76;  // q0
    __m128i v32;  // q3
    uint128_t v78;  // q0
    __m128i v79;  // q0
    unsigned long long v80;  // x8
    uint128_t *v81;  // x8
    unsigned long long v82;  // x0
    __m128i v33;  // q4
    __m128i v34;  // q5
    unsigned int v35;  // w16
    unsigned int v36;  // w10
    __m128i v0;  // [bp-0x110]
    __m128i v1;  // [bp-0x100]
    __m128i v2;  // [bp-0xf0]
    __m128i v3;  // [bp-0xe0]
    __m128i v4;  // [bp-0xd0]
    __m128i v5;  // [bp-0xc0]
    __m128i v6;  // [bp-0xb0]
    __m128i v7;  // [bp-0xa0]
    __m128i v8;  // [bp-0x90], Other Possible Types: unsigned int
    unsigned int v9;  // [bp-0x8c]
    unsigned int v10;  // [bp-0x88]
    unsigned int v11;  // [bp-0x84]
    __m128i v12;  // [bp-0x80], Other Possible Types: unsigned int
    unsigned int v13;  // [bp-0x7c]
    unsigned int v14;  // [bp-0x78]
    unsigned int v15;  // [bp-0x74]
    __m128i v16;  // [bp-0x70], Other Possible Types: unsigned int
    unsigned int v17;  // [bp-0x6c]
    unsigned int v18;  // [bp-0x68]
    unsigned int v19;  // [bp-0x64]
    __m128i v20;  // [bp-0x60], Other Possible Types: unsigned int
    unsigned int v21;  // [bp-0x5c]
    unsigned int v22;  // [bp-0x58]
    unsigned int v23;  // [bp-0x54]
    unsigned long v24;  // [bp-0x48]
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v24 = *(long long *)&g_10002b0;
    v27 = a2 * 2;
    v28 = &a1[8 * a2];
    v4 = *(int128_t *)((char *)v28 - 64);
    v5 = *(int128_t *)((char *)v28 - 48);
    v6 = *(int128_t *)((char *)v28 - 32);
    v7 = *(int128_t *)((char *)v28 - 16);
    if (v27)
    {
        iter = a1;
        i = 0;
        v31 = v4;
        v32 = v5;
        v33 = v6;
        v34 = v7;
        do
        {
            v4 = _mm_xor_si128(*iter, v31);
            v5 = _mm_xor_si128(iter[1], v32);
            v6 = _mm_xor_si128(iter[2], v33);
            v7 = _mm_xor_si128(iter[3], v34);
            v8 = v4;
            v12 = v5;
            v16 = v6;
            v20 = v7;
            v35 = _mm_cvtsi128_si32(v12);
            v36 = _mm_extract_epi32(v12, 1);
            v37 = _mm_cvtsi128_si32(v8);
            v38 = _mm_extract_epi32(v8, 1);
            v39 = _mm_cvtsi128_si32(v16);
            v40 = _mm_extract_epi32(v16, 1);
            v41 = _mm_cvtsi128_si32(v20);
            v42 = _mm_extract_epi32(v20, 1);
            v43 = _mm_extract_epi32(v20, 2);
            v44 = _mm_extract_epi32(v20, 3);
            v45 = _mm_extract_epi32(v16, 2);
            v46 = _mm_extract_epi32(v16, 3);
            v47 = _mm_extract_epi32(v8, 2);
            v48 = _mm_extract_epi32(v8, 3);
            j = 10;
            v50 = _mm_extract_epi32(v12, 2);
            v51 = _mm_extract_epi32(v12, 3);
            do
            {
                v52 = v35 ^ __ROL__(v41 + v37, 7);
                v53 = v39 ^ __ROL__(v52 + v37, 9);
                v54 = v41 ^ __ROL__(v53 + v52, 13);
                v55 = v37 ^ __ROL__(v54 + v53, 18);
                v56 = v40 ^ __ROL__(v38 + v36, 7);
                v57 = v42 ^ __ROL__(v56 + v36, 9);
                v58 = v38 ^ __ROL__(v57 + v56, 13);
                v59 = v36 ^ __ROL__(v58 + v57, 18);
                v60 = v43 ^ __ROL__(v50 + v45, 7);
                v61 = v47 ^ __ROL__(v60 + v45, 9);
                v62 = v50 ^ __ROL__(v61 + v60, 13);
                v63 = v45 ^ __ROL__(v62 + v61, 18);
                v64 = v48 ^ __ROL__(v46 + v44, 7);
                v65 = v51 ^ __ROL__(v64 + v44, 9);
                v66 = v46 ^ __ROL__(v65 + v64, 13);
                v67 = v44 ^ __ROL__(v66 + v65, 18);
                v38 = v58 ^ __ROL__(v64 + v55, 7);
                v47 = v61 ^ __ROL__(v38 + v55, 9);
                v48 = v64 ^ __ROL__(v47 + v38, 13);
                v37 = v55 ^ __ROL__(v48 + v47, 18);
                v50 = v62 ^ __ROL__(v59 + v52, 7);
                v51 = v65 ^ __ROL__(v50 + v59, 9);
                v35 = v52 ^ __ROL__(v51 + v50, 13);
                v36 = v59 ^ __ROL__(v35 + v51, 18);
                v46 = v66 ^ __ROL__(v63 + v56, 7);
                v39 = v53 ^ __ROL__(v46 + v63, 9);
                v40 = v56 ^ __ROL__(v39 + v46, 13);
                v45 = v63 ^ __ROL__(v40 + v39, 18);
                v41 = v54 ^ __ROL__(v67 + v60, 7);
                v42 = v57 ^ __ROL__(v41 + v67, 9);
                v43 = v60 ^ __ROL__(v42 + v41, 13);
                j -= 2;
                v44 = v67 ^ __ROL__(v43 + v42, 18);
            } while (2 < j);
            iter += 4;
            v12 = (__m128i)v35;
            v13 = v36;
            v8 = (__m128i)v37;
            v9 = v38;
            v16 = (__m128i)v39;
            v17 = v40;
            v20 = (__m128i)v41;
            v21 = v42;
            v22 = v43;
            v23 = v44;
            v18 = v45;
            v19 = v46;
            v10 = v47;
            v11 = v48;
            v69 = _INSERT(_INSERT(__float_as_int(__int_as_float(v37)), 4, v38), 8, v47);
            v14 = v50;
            v15 = v51;
            v70 = (__m128i)_INSERT(v69, 12, v48);
            v72 = _INSERT(_INSERT(__float_as_int(__int_as_float(v35)), 4, v36), 8, v50);
            v73 = (__m128i)_INSERT(v72, 12, v51);
            v75 = _INSERT(_INSERT(__float_as_int(__int_as_float(v39)), 4, v40), 8, v45);
            v2 = _mm_add_epi32(v5, v73);
            v3 = _mm_add_epi32(v4, v70);
            v76 = (__m128i)_INSERT(v75, 12, v46);
            v78 = _INSERT(_INSERT(__float_as_int(__int_as_float(v41)), 4, v42), 8, v43);
            v4 = v3;
            v5 = v2;
            v79 = (__m128i)_INSERT(v78, 12, v44);
            v0 = _mm_add_epi32(v7, v79);
            v1 = _mm_add_epi32(v6, v76);
            v6 = v1;
            v7 = v0;
            sub_a66ec0(&v8, 64);
            v34 = v0;
            v33 = v1;
            v32 = v2;
            v31 = v3;
            if (i & 1)
                v80 = a2;
            else
                v80 = 0;
            v81 = a0 + (v80 + (i >> 1)) * 64;
            *v81 = v4;
            v81[1] = v5;
            v81[2] = v6;
            v81[3] = v7;
            i += 1;
        } while (i != v27);
    }
    v82 = sub_a66ec0(&v4, 64);
    if (*(long long *)&g_10002b0 == v24)
        return v82;
    ___stack_chk_fail();
}
