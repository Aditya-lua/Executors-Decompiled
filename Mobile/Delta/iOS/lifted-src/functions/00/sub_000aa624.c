/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa624..0xaab24 (1280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa624_1 {
    struct st_aa624_2 *field_0;
} st_aa624_1;

typedef struct st_aa624_2 {
    struct st_aa624_1 *field_0;
} st_aa624_2;

typedef struct st_aa624_0 {
    char field_0;
} st_aa624_0;

extern char g_10002b0;

unsigned long long sub_aa624(void* a0, unsigned int *a1, unsigned long a2, unsigned long long *a3)
{
    unsigned long v16;  // x13
    unsigned long v17;  // x12
    unsigned long v23;  // cc_ndep
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4108
    unsigned long v26;  // cc_op
    unsigned long v27;  // cc_dep1
    unsigned long v28;  // cc_dep2
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4108
    char v18;  // x15
    unsigned int *v19;  // x23
    unsigned int v31;  // w11
    unsigned int v32;  // w17
    unsigned int v33;  // w14
    unsigned int *v34;  // x16
    unsigned long v35;  // x3
    unsigned int *v36;  // x4
    unsigned long v37;  // x1
    unsigned long v38;  // x2
    unsigned long long v39;  // 4120
    unsigned int *v20;  // x8
    unsigned long j;  // x3
    unsigned long long idx;  // x7
    unsigned long v42;  // x22
    unsigned long long v43;  // x6
    char *v44;  // x6
    unsigned int v45;  // w24
    unsigned long long v46;  // x25
    unsigned long long index;  // x24
    unsigned long long v48;  // x4
    unsigned long long v49;  // x5
    unsigned int v21;  // w9
    unsigned int v50;  // w6
    unsigned int v51;  // w6
    unsigned long long k;  // w4
    unsigned long v53;  // x24
    unsigned long long v54;  // w4
    char v56;  // x5
    unsigned long long i;  // x3
    unsigned long long idx1;  // x28
    unsigned long long v59;  // x27
    unsigned int v22;  // w11
    char *v60;  // x27
    unsigned int v61;  // w10
    unsigned long long v62;  // x11
    unsigned long long idx2;  // x10
    unsigned long long v64;  // x11
    unsigned long v65;  // x10
    unsigned int *v66;  // x13
    void* v67;  // x12
    __m128i v68;  // q1
    __m128i v69;  // q0
    unsigned int v70;  // w15
    unsigned long long v71;  // x17
    __m128i v72;  // q2
    unsigned long v75;  // d3
    unsigned long long v76;  // x10
    unsigned long long v77;  // x24
    unsigned long long v78;  // x16
    unsigned long long v79;  // w10
    unsigned long long v80;  // 4128
    unsigned long long v81;  // 4130
    unsigned long long v82;  // x1
    unsigned int v83;  // w1
    unsigned long long v84;  // w1
    unsigned long long v85;  // x1
    unsigned long long v86;  // x16
    unsigned int v87;  // w9
    unsigned long long v88;  // x10
    unsigned long long v89;  // x9
    unsigned int v90;  // w10
    st_aa624_2 **v91;  // x27
    unsigned long long v92;  // x22
    unsigned long long v93;  // x24
    unsigned long v94;  // x28
    unsigned long long v95;  // x0
    unsigned int v0;  // [bp-0x1bc]
    st_aa624_0 **v1;  // [bp-0x1b8], Other Possible Types: char
    st_aa624_0 *v2;  // [bp-0x1b0]
    st_aa624_0 **v3;  // [bp-0x1a8], Other Possible Types: char
    st_aa624_0 *v4;  // [bp-0x1a0]
    st_aa624_0 **v5;  // [bp-0x198], Other Possible Types: char
    st_aa624_0 *v6;  // [bp-0x190]
    char *v7;  // [bp-0x188], Other Possible Types: st_aa624_0 *
    st_aa624_0 **v8;  // [bp-0x180]
    st_aa624_2 **v9;  // [bp-0x178]
    st_aa624_2 **v10;  // [bp-0x170]
    st_aa624_2 **v11;  // [bp-0x170], Other Possible Types: unsigned long
    st_aa624_2 **v12;  // [bp-0x170]
    unsigned long v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    v16 = (long long)a0[112];
    v17 = (long long)a0[56];
    v18 = (int)a0[52];
    v19 = (long long)a0[8];
    v20 = a1 - v19;
    v21 = 1 << ((char)(int)a0[0x100] & 31);
    v22 = (int)a0[28];
    if (v21 < (unsigned int)(unsigned int *)((char *)v20 - (int)a0[28]))
    {
        v24 = arm64g_calculate_condition(v26 | 128, v27, v28, v23);
        v25 = arm64g_calculate_condition(3, (v24 & 1 ? (int)a0[40] : 0), 0, 0);
        if (!(v25 & 1))
            goto LABEL_aa6b2;
LABEL_aa6b1:
        v22 = (unsigned int)(unsigned int *)((char *)v20 - v21);
    }
    else
    {
        v29 = arm64g_calculate_condition(v26 | 128, v27, v28, v23);
        v30 = arm64g_calculate_condition(0, (v29 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v30 & 1)
            goto LABEL_aa6b1;
LABEL_aa6b2:
    }
    v31 = (int)a0[268];
    if ((unsigned int)(int)a0[268] >= 5)
        v31 = 5;
    v32 = (long long)a0[96];
    if ((int)a0[300])
    {
        v33 = (2654435761 * *a1 ^ v32) >> ((char)(24 - v18) & 31);
        *(unsigned int *)&a0[44] = (unsigned int)v20;
    }
    else
    {
        v0 = v31;
        v34 = a0 + 64;
        v4 = &v3;
        v3 = &v4;
        v35 = (int)a0[44];
        if (385 > (unsigned int)(unsigned int *)((char *)v20 - v35))
        {
            v36 = v19;
            v37 = v17;
            v38 = v16;
            v6 = &v5;
            v5 = &v6;
            if ((unsigned int)v20 > (unsigned int)v35)
                goto LABEL_aa73c;
        }
        else
        {
            v37 = v17;
            v38 = v16;
            v39 = arm64g_calculate_condition(129, v35 & 0xffffffff, 97, 0);
            if (!(v39 & 1))
            {
                j = v35;
                do
                {
                    idx = j & 7;
                    v42 = v34[idx];
                    v34[idx] = (2654435761 * *(int *)((char *)v19 + j + 8) ^ (int)a0[96]) >> ((char)(24 - v18) & 31);
                    v43 = v42 >> 3 & 0x1fffffe0;
                    v44 = v17 + v43;
                    v45 = *v44 - 1;
                    if (!(v45 & 31))
                        v46 = 31;
                    else
                        v46 = 0;
                    index = v46 + (v45 & 31);
                    *v44 = index;
                    v44[index] = v42;
                    *(unsigned int *)(v16 + v43 * 4 + index * 4) = j;
                    j += 1;
                } while (v35 + 96 != j);
                v38 = (long long)a0[112];
                v37 = (long long)a0[56];
            }
            v35 = (unsigned int)v20 - 32;
            v48 = (char *)a1 + 1;
            v8 = &v7;
            v7 = &v8;
            v49 = (char *)v19 + v35;
            v50 = v48 - v49;
            if (8 <= v50 + 1)
                v51 = 8;
            else
                v51 = v50 + 1;
            if (v48 < v49)
                k = 0;
            else
                k = v51;
            if (k + (unsigned int)v35 > (unsigned int)v35)
            {
                v11 = v10;
                v53 = v35;
                do
                {
                    v54 = k;
                    v9 = &v11;
                    v11 = &v9;
                    v34[v53 & 7] = (2654435761 * *(int *)((char *)v19 + v53) ^ (int)a0[96]) >> ((char)(24 - (int)a0[52]) & 31);
                    v53 += 1;
                    k = v54 - 1;
                } while (k);
            }
            v36 = (long long)a0[8];
            v6 = &v5;
            v5 = &v6;
            if ((unsigned int)v35 < (unsigned int)v20)
            {
LABEL_aa73c:
                v56 = 24 - (int)a0[52];
                i = v35 & 0xffffffff;
                v11 = v10;
                do
                {
                    v7 = &v8;
                    v8 = &v7;
                    v9 = &v11;
                    v12 = &v9;
                    idx1 = i & 7;
                    x30 = v34[idx1];
                    v34[idx1] = (2654435761 * *(int *)((char *)v36 + i + 8) ^ (int)a0[96]) >> (v56 & 31);
                    v59 = (unsigned int)(x30) >> 3 & 0x1fffffe0;
                    v60 = v37 + v59;
                    v9 = &v12;
                    v11 = &v9;
                    v61 = *v60 - 1;
                    if (!(v61 & 31))
                        v62 = 31;
                    else
                        v62 = 0;
                    idx2 = v62 + (v61 & 31);
                    *v60 = idx2;
                    v60[idx2] = x30;
                    *(unsigned int *)(v38 + v59 * 4 + idx2 * 4) = i;
                    i += 1;
                } while (i < (v20 & 0xffffffff));
            }
        }
        *(unsigned int *)&a0[44] = (unsigned int)v20;
        v64 = v20 & 7;
        v33 = v34[v64];
        v34[v64] = (2654435761 * *(int *)((char *)v19 + (v20 & 0xffffffff) + 8) ^ v32) >> ((char)(24 - v18) & 31);
        v31 = v0;
    }
    *(unsigned int *)&a0[104] = (int)a0[104] + v33;
    v65 = v33 >> 3 & 0x1fffffe0;
    v66 = v16 + v65 * 4;
    v67 = v17 + v65;
    v68 = CatOddLanesV((int128_t)v67[16], *(int128_t *)v67);
    v69 = CatEvenLanesV((int128_t)v67[16], *(int128_t *)v67);
    v70 = *(char *)v67;
    v71 = v70 * 2;
    v72 = (__m128i)(CONCAT(v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000 | (v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000) * 0x100000000, v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000 | (v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v75 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(ShlNV(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v72, v68), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v72, v68), 6))), 4), _mm_and_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v72, v69), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v72, v69), 6))), ShrNV(_mm_set1_epi8(-1), 4))));
    v76 = __double_as_longlong(v75);
    if (v71 & 63)
        v76 = v76 << (char)(64 - (v71 & 63)) | v76 >> ((char)v71 & 63);
    v77 = 0;
    v78 = v76 & 0x5555555555555555;
    if (v76 & 0x5555555555555555)
    {
        v79 = 1 << ((char)v31 & 31);
        do
        {
            v80 = ((((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v81 = (((((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v78 & 0xaaaaaaaaaaaaaaaa) >> 1 | v78 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v82 = ((((v81 | v80) & 0xffff0000ffff0000) >> 16 | (v81 | v80) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v81 | v80) & 0xffff0000ffff0000) >> 16 | (v81 | v80) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v82)
                v83 = 64;
            else
                v83 = Clz(v82);
            v84 = __ROL__(v83 + ((unsigned int)v71 & 254), 31) & 0x8000001f & 31;
            if (!v84)
                continue;
            if (v66[v84] < v22)
                break;
            *(unsigned int *)((char *)&v11 + 4 * v77) = v66[v84];
            v77 += 1;
            v79 -= 1;
        } while ((v85 = v78 - 1, v86 = v85 & v78, v85 & v78 && (v78 &= v85, v79)));
    }
    v87 = v70 - 1;
    if (!(v87 & 31))
        v88 = 31;
    else
        v88 = 0;
    v89 = v88 + (v87 & 31);
    *(char *)v67 = v89;
    *((char *)v67 + v89) = v33;
    v90 = (int)a0[44];
    *(unsigned int *)&a0[44] = v90 + 1;
    v66[v89] = v90;
    if (v77)
    {
        v91 = &v11;
        v92 = 3;
        do
        {
            v93 = v77;
            v94 = *(int *)v91;
            v91 = (char *)v91 + 4;
            if (*(int *)((char *)v19 + v94 + v92 - 3) == *(int *)((char *)a1 + v92 - 3) && !(v95 = sub_7cdfc(a1), v95 <= v92 || (*a3 = (unsigned int)v20 + 3 - v94, v92 = v95, (char *)a1 + v95 != a2)))
                break;
        } while ((v77 = v93 - 1, v93 != 1));
    }
    else
    {
        v92 = 3;
    }
    if (*(long long *)&g_10002b0 == v13)
        return v92;
    ___stack_chk_fail();
}
