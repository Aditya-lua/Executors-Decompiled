/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7fa4..0xa84f0 (1356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7fa4_1 {
    struct st_a7fa4_2 *field_0;
} st_a7fa4_1;

typedef struct st_a7fa4_2 {
    struct st_a7fa4_1 *field_0;
} st_a7fa4_2;

typedef struct st_a7fa4_0 {
    char field_0;
} st_a7fa4_0;

extern char g_10002b0;

unsigned long long sub_a7fa4(void* a0, unsigned int *a1, long long a2, unsigned long long *a3)
{
    unsigned long v16;  // x13
    unsigned long v17;  // x11
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long v27;  // cc_ndep
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4108
    unsigned long v30;  // cc_op
    unsigned long long v31;  // 4112
    char v18;  // x15
    unsigned long long v32;  // 4108
    unsigned int *v19;  // x22
    unsigned int v33;  // w12
    unsigned int v34;  // w17
    unsigned int v35;  // w14
    unsigned int *v36;  // x16
    unsigned long v37;  // x3
    unsigned int *v38;  // x4
    unsigned long v39;  // x1
    unsigned long long v20;  // x23
    unsigned long v40;  // x2
    unsigned long long v41;  // 4120
    unsigned long j;  // x3
    unsigned long long idx;  // x7
    unsigned long v44;  // x19
    unsigned long long v45;  // x6
    char *v46;  // x6
    unsigned int v47;  // w20
    unsigned int v48;  // x25
    unsigned long long index;  // x20
    unsigned int *v21;  // x8
    unsigned long long v50;  // x4
    unsigned long long v51;  // x5
    unsigned int v52;  // w6
    unsigned int v53;  // w6
    unsigned int k;  // w4
    unsigned long v55;  // x20
    unsigned long long v56;  // w4
    char v58;  // x5
    unsigned long long i;  // x3
    unsigned int v22;  // w9
    unsigned long long idx1;  // x28
    unsigned long long v61;  // x27
    char *v62;  // x27
    unsigned int v63;  // w10
    unsigned int v64;  // x12
    unsigned long long idx2;  // x10
    unsigned long long v66;  // x12
    unsigned long v67;  // x10
    unsigned int *v68;  // x13
    void* v69;  // x11
    unsigned long v23;  // x24
    __m128i v70;  // q1
    __m128i v71;  // q0
    unsigned int v72;  // w15
    unsigned long long v73;  // x17
    __m128i v74;  // q2
    unsigned long v77;  // d3
    unsigned long long v78;  // x10
    unsigned int v79;  // x25
    unsigned int v24;  // w12
    unsigned long long v80;  // x16
    unsigned int v81;  // w10
    unsigned long long v82;  // 4128
    unsigned long long v83;  // 4130
    unsigned int v84;  // x1
    unsigned int v85;  // w1
    unsigned int v86;  // w1
    unsigned int v87;  // w1
    unsigned long long v88;  // x1
    unsigned long long v89;  // x16
    unsigned int v90;  // w9
    unsigned int v91;  // x10
    unsigned long long v92;  // x9
    unsigned int v93;  // w10
    st_a7fa4_2 **v94;  // x28
    unsigned long long v95;  // x19
    unsigned long long v96;  // x25
    unsigned long v97;  // x20
    unsigned int *v98;  // x8
    unsigned long long v99;  // x0
    unsigned int v0;  // [bp-0x1cc]
    st_a7fa4_0 **v1;  // [bp-0x1b8], Other Possible Types: char
    st_a7fa4_0 *v2;  // [bp-0x1b0]
    st_a7fa4_0 **v3;  // [bp-0x1a8], Other Possible Types: char
    st_a7fa4_0 *v4;  // [bp-0x1a0]
    st_a7fa4_0 **v5;  // [bp-0x198], Other Possible Types: char
    st_a7fa4_0 *v6;  // [bp-0x190]
    char *v7;  // [bp-0x188], Other Possible Types: st_a7fa4_0 *
    st_a7fa4_0 **v8;  // [bp-0x180]
    st_a7fa4_2 **v9;  // [bp-0x178]
    st_a7fa4_2 **v10;  // [bp-0x170]
    st_a7fa4_2 **v11;  // [bp-0x170], Other Possible Types: unsigned long
    st_a7fa4_2 **v12;  // [bp-0x170]
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
    v20 = (long long)a0[16];
    v21 = a1 - v19;
    v22 = 1 << ((char)(int)a0[0x100] & 31);
    v23 = (int)a0[24];
    v24 = (int)a0[28];
    if (v22 < (unsigned int)(unsigned int *)((char *)v21 - (int)a0[28]))
    {
        v28 = arm64g_calculate_condition(v30 | 128, v25, v26, v27);
        v29 = arm64g_calculate_condition(3, (v28 & 1 ? (int)a0[40] : 0), 0, 0);
        if (!(v29 & 1))
            goto LABEL_a802e;
LABEL_a802d:
        v24 = (unsigned int)(unsigned int *)((char *)v21 - v22);
    }
    else
    {
        v31 = arm64g_calculate_condition(v30 | 128, v25, v26, v27);
        v32 = arm64g_calculate_condition(0, (v31 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v32 & 1)
            goto LABEL_a802d;
LABEL_a802e:
    }
    v33 = (int)a0[268];
    if ((unsigned int)(int)a0[268] >= 5)
        v33 = 5;
    v34 = (long long)a0[96];
    if ((int)a0[300])
    {
        v35 = (2654435761 * *a1 ^ v34) >> ((char)(24 - v18) & 31);
        *(unsigned int *)&a0[44] = (unsigned int)v21;
    }
    else
    {
        v0 = v33;
        v36 = a0 + 64;
        v4 = &v3;
        v3 = &v4;
        v37 = (int)a0[44];
        if (385 > (unsigned int)(unsigned int *)((char *)v21 - v37))
        {
            v38 = v19;
            v39 = v17;
            v40 = v16;
            v6 = &v5;
            v5 = &v6;
            if ((unsigned int)v21 > (unsigned int)v37)
                goto LABEL_a80b8;
        }
        else
        {
            v39 = v17;
            v40 = v16;
            v41 = arm64g_calculate_condition(129, v37 & 0xffffffff, 97, 0);
            if (!(v41 & 1))
            {
                j = v37;
                do
                {
                    idx = j & 7;
                    v44 = v36[idx];
                    v36[idx] = (2654435761 * *(int *)((char *)v19 + j + 8) ^ (int)a0[96]) >> ((char)(24 - v18) & 31);
                    v45 = v44 >> 3 & 0x1fffffe0;
                    v46 = v17 + v45;
                    v47 = *v46 - 1;
                    if (!(v47 & 31))
                        v48 = 31;
                    else
                        v48 = 0;
                    index = v48 + (v47 & 31);
                    *v46 = index;
                    v46[index] = v44;
                    *(unsigned int *)(v16 + v45 * 4 + index * 4) = j;
                    j += 1;
                } while (v37 + 96 != j);
                v40 = (long long)a0[112];
                v39 = (long long)a0[56];
            }
            v37 = (unsigned int)v21 - 32;
            v50 = (char *)a1 + 1;
            v8 = &v7;
            v7 = &v8;
            v51 = (char *)v19 + v37;
            v52 = v50 - v51;
            if (8 <= v52 + 1)
                v53 = 8;
            else
                v53 = v52 + 1;
            if (v50 < v51)
                k = 0;
            else
                k = v53;
            if (k + (unsigned int)v37 > (unsigned int)v37)
            {
                v11 = v10;
                v55 = v37;
                do
                {
                    v56 = k;
                    v9 = &v11;
                    v11 = &v9;
                    v36[v55 & 7] = (2654435761 * *(int *)((char *)v19 + v55) ^ (int)a0[96]) >> ((char)(24 - (int)a0[52]) & 31);
                    v55 += 1;
                    k = v56 - 1;
                } while (k);
            }
            v38 = (long long)a0[8];
            v6 = &v5;
            v5 = &v6;
            if ((unsigned int)v37 < (unsigned int)v21)
            {
LABEL_a80b8:
                v58 = 24 - (int)a0[52];
                i = v37 & 0xffffffff;
                v11 = v10;
                do
                {
                    v7 = &v8;
                    v8 = &v7;
                    v9 = &v11;
                    v12 = &v9;
                    idx1 = i & 7;
                    x30 = v36[idx1];
                    v36[idx1] = (2654435761 * *(int *)((char *)v38 + i + 8) ^ (int)a0[96]) >> (v58 & 31);
                    v61 = (unsigned int)(x30) >> 3 & 0x1fffffe0;
                    v62 = v39 + v61;
                    v9 = &v12;
                    v11 = &v9;
                    v63 = *v62 - 1;
                    if (!(v63 & 31))
                        v64 = 31;
                    else
                        v64 = 0;
                    idx2 = v64 + (v63 & 31);
                    *v62 = idx2;
                    v62[idx2] = x30;
                    *(unsigned int *)(v40 + v61 * 4 + idx2 * 4) = i;
                    i += 1;
                } while (i < (v21 & 0xffffffff));
            }
        }
        *(unsigned int *)&a0[44] = (unsigned int)v21;
        v66 = v21 & 7;
        v35 = v36[v66];
        v36[v66] = (2654435761 * *(int *)((char *)v19 + (v21 & 0xffffffff) + 8) ^ v34) >> ((char)(24 - v18) & 31);
        v33 = v0;
    }
    *(unsigned int *)&a0[104] = (int)a0[104] + v35;
    v67 = v35 >> 3 & 0x1fffffe0;
    v68 = v16 + v67 * 4;
    v69 = v17 + v67;
    v70 = CatOddLanesV((int128_t)v69[16], *(int128_t *)v69);
    v71 = CatEvenLanesV((int128_t)v69[16], *(int128_t *)v69);
    v72 = *(char *)v69;
    v73 = v72 * 2;
    v74 = (__m128i)(CONCAT(v35 & 0xff | (v35 & 0xff) * 0x100 | (v35 & 0xff | (v35 & 0xff) * 0x100) * 0x10000 | (v35 & 0xff | (v35 & 0xff) * 0x100 | (v35 & 0xff | (v35 & 0xff) * 0x100) * 0x10000) * 0x100000000, v35 & 0xff | (v35 & 0xff) * 0x100 | (v35 & 0xff | (v35 & 0xff) * 0x100) * 0x10000 | (v35 & 0xff | (v35 & 0xff) * 0x100 | (v35 & 0xff | (v35 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v77 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(ShlNV(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v74, v70), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v74, v70), 6))), 4), _mm_and_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v74, v71), 6), _mm_srli_epi16(_mm_cmpeq_epi8(v74, v71), 6))), ShrNV(_mm_set1_epi8(-1), 4))));
    v78 = __double_as_longlong(v77);
    if (v73 & 63)
        v78 = v78 << (char)(64 - (v73 & 63)) | v78 >> ((char)v73 & 63);
    v79 = 0;
    v80 = v78 & 0x5555555555555555;
    if (v78 & 0x5555555555555555)
    {
        v81 = 1 << ((char)v33 & 31);
        do
        {
            v82 = ((((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v83 = (((((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v80 & 0xaaaaaaaaaaaaaaaa) >> 1 | v80 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v84 = ((((v83 | v82) & 0xffff0000ffff0000) >> 16 | (v83 | v82) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v83 | v82) & 0xffff0000ffff0000) >> 16 | (v83 | v82) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v84)
                v85 = 64;
            else
                v85 = Clz(v84);
            v86 = __ROL__(v85 + ((unsigned int)v73 & 254), 31) & 0x8000001f & 31;
            if (!v86)
                continue;
            v87 = v68[v86];
            if (v87 < v24)
                break;
            *(unsigned int *)((char *)&v11 + 4 * v79) = v87;
            v79 += 1;
            v81 -= 1;
        } while ((v88 = v80 - 1, v89 = v88 & v80, v88 & v80 && (v80 &= v88, v81)));
    }
    v90 = v72 - 1;
    if (!(v90 & 31))
        v91 = 31;
    else
        v91 = 0;
    v92 = v91 + (v90 & 31);
    *(char *)v69 = v92;
    *((char *)v69 + v92) = v35;
    v93 = (int)a0[44];
    *(unsigned int *)&a0[44] = v93 + 1;
    v68[v92] = v93;
    if (v79)
    {
        v94 = &v11;
        v95 = 3;
        do
        {
            v96 = v79;
            v97 = *(int *)v94;
            v94 = (char *)v94 + 4;
            if ((unsigned int)v23 > (unsigned int)v97)
            {
                v98 = v20 + v97;
                if (*v98 != *a1 || !(v99 = sub_84f30(a1 + 1, v98 + 1, a2, v20 + v23, (char *)v19 + v23) + 4, v99 > v95))
                    continue;
            }
            else if (!(*(int *)((char *)v19 + v97 + v95 - 3) == *(int *)((char *)a1 + v95 - 3) && (v99 = sub_7cdfc(a1), v99 > v95)))
            {
                continue;
            }
            *a3 = (unsigned int)v21 + 3 - v97;
            v95 = v99;
            if ((char *)a1 + v99 == a2)
                break;
        } while ((v99 = v95, v79 = v96 - 1, v96 != 1));
    }
    else
    {
        v99 = 3;
    }
    if (*(long long *)&g_10002b0 == v13)
        return v99;
    ___stack_chk_fail();
}
