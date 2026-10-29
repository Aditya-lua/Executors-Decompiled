/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9819c..0x986fc (1376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9819c_1 {
    struct st_9819c_2 *field_0;
} st_9819c_1;

typedef struct st_9819c_2 {
    struct st_9819c_1 *field_0;
} st_9819c_2;

typedef struct st_9819c_0 {
    char field_0;
} st_9819c_0;

extern char g_10002b0;

unsigned long long sub_9819c(void* a0, unsigned int *a1, long long a2, unsigned long long *a3)
{
    unsigned long v16;  // x13
    unsigned long v17;  // x12
    unsigned long v25;  // cc_dep1
    unsigned long long idx;  // x9
    unsigned int v101;  // w10
    st_9819c_2 **v102;  // x28
    unsigned long long v103;  // x19
    unsigned long long v104;  // x25
    unsigned long v105;  // x20
    unsigned int *v106;  // x8
    unsigned long long v107;  // x0
    unsigned long v26;  // cc_dep2
    unsigned long v27;  // cc_ndep
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4108
    unsigned long v30;  // cc_op
    unsigned long long v31;  // 4112
    char v18;  // x15
    unsigned long long v32;  // 4108
    unsigned int *v19;  // x22
    unsigned int v33;  // w11
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
    unsigned long long idx1;  // x7
    unsigned long v44;  // x19
    unsigned long long v45;  // x6
    char *v46;  // x6
    unsigned int v47;  // w20
    unsigned long long v48;  // x25
    unsigned long long index;  // x20
    unsigned int *v21;  // x8
    unsigned long long v50;  // x4
    unsigned long long v51;  // x5
    unsigned int v52;  // w6
    unsigned int v53;  // w6
    unsigned long long k;  // w4
    unsigned long v55;  // x20
    unsigned long long v56;  // w4
    char v58;  // x5
    unsigned long long i;  // x3
    unsigned int v22;  // w9
    unsigned long long idx2;  // x28
    unsigned long long v61;  // x27
    char *v62;  // x27
    unsigned int v63;  // w10
    unsigned long long v64;  // x11
    unsigned long long v65;  // x10
    unsigned long long v66;  // x11
    unsigned long v67;  // x10
    unsigned int *v68;  // x13
    void* v69;  // x12
    unsigned long v23;  // x24
    unsigned long v70;  // x15
    __m128i v71;  // 4178
    __m128i v72;  // 4180
    __m128i v73;  // 4182
    __m128i v74;  // 4184
    __m128i v75;  // 4188
    __m128i v76;  // 4190
    __m128i v77;  // 4193
    __m128i v78;  // 4195
    __m128i v79;  // 4198
    unsigned int v24;  // w11
    __m128i v80;  // 4200
    __m128i v81;  // 4203
    __m128i v82;  // 4205
    __m128i v83;  // q4
    __m128i v84;  // q0
    unsigned long long v86;  // x25
    unsigned long long v87;  // x16
    unsigned long long v88;  // w10
    unsigned long long v89;  // x11
    unsigned long long v90;  // 4128
    unsigned long long v91;  // 4130
    unsigned long long v92;  // x17
    unsigned int v93;  // w17
    unsigned int v94;  // w17
    unsigned int v95;  // w17
    unsigned long v96;  // x17
    unsigned long long v97;  // x11
    unsigned int v98;  // w9
    unsigned long long v99;  // x10
    unsigned int v0;  // [bp-0x1cc]
    st_9819c_0 **v1;  // [bp-0x1b8], Other Possible Types: char
    st_9819c_0 *v2;  // [bp-0x1b0]
    st_9819c_0 **v3;  // [bp-0x1a8], Other Possible Types: char
    st_9819c_0 *v4;  // [bp-0x1a0]
    st_9819c_0 **v5;  // [bp-0x198], Other Possible Types: char
    st_9819c_0 *v6;  // [bp-0x190]
    char *v7;  // [bp-0x188], Other Possible Types: st_9819c_0 *
    st_9819c_0 **v8;  // [bp-0x180]
    st_9819c_2 **v9;  // [bp-0x178]
    st_9819c_2 **v10;  // [bp-0x170]
    st_9819c_2 **v11;  // [bp-0x170], Other Possible Types: unsigned long
    st_9819c_2 **v12;  // [bp-0x170]
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
            goto LABEL_98226;
LABEL_98225:
        v24 = (unsigned int)(unsigned int *)((char *)v21 - v22);
    }
    else
    {
        v31 = arm64g_calculate_condition(v30 | 128, v25, v26, v27);
        v32 = arm64g_calculate_condition(0, (v31 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v32 & 1)
            goto LABEL_98225;
LABEL_98226:
    }
    v33 = (int)a0[268];
    if ((unsigned int)(int)a0[268] >= 6)
        v33 = 6;
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
                goto LABEL_982b0;
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
                    idx1 = j & 7;
                    v44 = v36[idx1];
                    v36[idx1] = (2654435761 * *(int *)((char *)v19 + j + 8) ^ (int)a0[96]) >> ((char)(24 - v18) & 31);
                    v45 = v44 >> 2 & 0x3fffffc0;
                    v46 = v17 + v45;
                    v47 = *v46 - 1;
                    if (!(v47 & 63))
                        v48 = 63;
                    else
                        v48 = 0;
                    index = v48 + (v47 & 63);
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
LABEL_982b0:
                v58 = 24 - (int)a0[52];
                i = v37 & 0xffffffff;
                v11 = v10;
                do
                {
                    v7 = &v8;
                    v8 = &v7;
                    v9 = &v11;
                    v12 = &v9;
                    idx2 = i & 7;
                    x30 = v36[idx2];
                    v36[idx2] = (2654435761 * *(int *)((char *)v38 + i + 8) ^ (int)a0[96]) >> (v58 & 31);
                    v61 = (unsigned int)(x30) >> 2 & 0x3fffffc0;
                    v62 = v39 + v61;
                    v9 = &v12;
                    v11 = &v9;
                    v63 = *v62 - 1;
                    if (!(v63 & 63))
                        v64 = 63;
                    else
                        v64 = 0;
                    v65 = v64 + (v63 & 63);
                    *v62 = v65;
                    v62[v65] = x30;
                    *(unsigned int *)(v40 + v61 * 4 + v65 * 4) = i;
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
    v67 = v35 >> 2 & 0x3fffffc0;
    v68 = v16 + v67 * 4;
    v69 = v17 + v67;
    v70 = *(char *)v69;
    v71 = (int128_t)v69[48];
    v72 = (int128_t)v69[32];
    v73 = (int128_t)v69[16];
    v74 = *(int128_t *)v69;
    v75 = __dirty_unsupported_Iop_SliceV128(v74, v74, 12);
    v76 = __dirty_unsupported_Iop_SliceV128(v74, v74, 12);
    v77 = __dirty_unsupported_Iop_SliceV128(v73, v73, 12);
    v78 = __dirty_unsupported_Iop_SliceV128(v73, v73, 12);
    v79 = __dirty_unsupported_Iop_SliceV128(v72, v72, 12);
    v80 = __dirty_unsupported_Iop_SliceV128(v72, v72, 12);
    v81 = __dirty_unsupported_Iop_SliceV128(v71, v71, 12);
    v82 = __dirty_unsupported_Iop_SliceV128(v71, v71, 12);
    v83 = (__m128i)(CONCAT(v35 & 0xff | (v35 & 0xff) * 0x100 | (v35 & 0xff | (v35 & 0xff) * 0x100) * 0x10000 | (v35 & 0xff | (v35 & 0xff) * 0x100 | (v35 & 0xff | (v35 & 0xff) * 0x100) * 0x10000) * 0x100000000, v35 & 0xff | (v35 & 0xff) * 0x100 | (v35 & 0xff | (v35 & 0xff) * 0x100) * 0x10000 | (v35 & 0xff | (v35 & 0xff) * 0x100 | (v35 & 0xff | (v35 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v84 = _mm_or_si128(ShrNV(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v74), _mm_unpackhi_epi8(v76, v74)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v74), _mm_unpackhi_epi8(v76, v74))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v73), _mm_unpackhi_epi8(v78, v73)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v73), _mm_unpackhi_epi8(v78, v73)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v72), _mm_unpackhi_epi8(v80, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v72), _mm_unpackhi_epi8(v80, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v81, v71), _mm_unpackhi_epi8(v82, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v81, v71), _mm_unpackhi_epi8(v82, v71))))), v83), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v74), _mm_unpackhi_epi8(v76, v74)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v74), _mm_unpackhi_epi8(v76, v74))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v73), _mm_unpackhi_epi8(v78, v73)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v73), _mm_unpackhi_epi8(v78, v73)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v72), _mm_unpackhi_epi8(v80, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v72), _mm_unpackhi_epi8(v80, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v81, v71), _mm_unpackhi_epi8(v82, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v81, v71), _mm_unpackhi_epi8(v82, v71))))), v83), ShlNV(_mm_set1_epi8(-1), 7))), 2), _mm_and_si128(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v74), _mm_unpackhi_epi8(v76, v74)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v74), _mm_unpackhi_epi8(v76, v74))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v73), _mm_unpackhi_epi8(v78, v73)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v73), _mm_unpackhi_epi8(v78, v73)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v72), _mm_unpackhi_epi8(v80, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v72), _mm_unpackhi_epi8(v80, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v81, v71), _mm_unpackhi_epi8(v82, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v81, v71), _mm_unpackhi_epi8(v82, v71))))), v83), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v74), _mm_unpackhi_epi8(v76, v74)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v74), _mm_unpackhi_epi8(v76, v74))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v73), _mm_unpackhi_epi8(v78, v73)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v73), _mm_unpackhi_epi8(v78, v73)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v72), _mm_unpackhi_epi8(v80, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v72), _mm_unpackhi_epi8(v80, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v81, v71), _mm_unpackhi_epi8(v82, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v81, v71), _mm_unpackhi_epi8(v82, v71))))), v83), ShlNV(_mm_set1_epi8(-1), 7))), ShlNV(_mm_set1_epi8(-1), 6)));
    v86 = 0;
    v87 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_or_si128(ShrNV(v84, 4), _mm_and_si128(v84, ShlNV(_mm_set1_epi8(-1), 4))), 4), _mm_srli_epi16(_mm_or_si128(ShrNV(v84, 4), _mm_and_si128(v84, ShlNV(_mm_set1_epi8(-1), 4))), 4)));
    if (v87)
    {
        v88 = 1 << ((char)v33 & 31);
        if (!(v70 & 63))
            v89 = v87;
        else
            v89 = v87 << (char)(64 - (v70 & 63)) | v87 >> ((char)v70 & 63);
        do
        {
            v90 = ((((((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v91 = (((((((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v89 & 0xaaaaaaaaaaaaaaaa) >> 1 | v89 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v92 = ((((v91 | v90) & 0xffff0000ffff0000) >> 16 | (v91 | v90) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v91 | v90) & 0xffff0000ffff0000) >> 16 | (v91 | v90) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v92)
                v93 = 64;
            else
                v93 = Clz(v92);
            v94 = v93 + (unsigned int)v70;
            if (!(v94 & 63))
                continue;
            v95 = v68[v94 & 63];
            if (v95 < v24)
                break;
            *(unsigned int *)((char *)&v11 + 4 * v86) = v95;
            v86 += 1;
            v88 -= 1;
        } while ((v96 = v89 - 1, v97 = v96 & v89, v96 & v89 && (v89 &= v96, v88)));
    }
    v98 = (unsigned int)v70 - 1;
    if (!(v98 & 63))
        v99 = 63;
    else
        v99 = 0;
    idx = v99 + (v98 & 63);
    *(char *)v69 = idx;
    *((char *)v69 + idx) = v35;
    v101 = (int)a0[44];
    *(unsigned int *)&a0[44] = v101 + 1;
    v68[idx] = v101;
    if (v86)
    {
        v102 = &v11;
        v103 = 3;
        do
        {
            v104 = v86;
            v105 = *(int *)v102;
            v102 = (char *)v102 + 4;
            if ((unsigned int)v23 > (unsigned int)v105)
            {
                v106 = v20 + v105;
                if (*v106 != *a1 || !(v107 = sub_84f30(a1 + 1, v106 + 1, a2, v20 + v23, (char *)v19 + v23) + 4, v107 > v103))
                    continue;
            }
            else if (!(*(int *)((char *)v19 + v105 + v103 - 3) == *(int *)((char *)a1 + v103 - 3) && (v107 = sub_7cdfc(a1), v107 > v103)))
            {
                continue;
            }
            *a3 = (unsigned int)v21 + 3 - v105;
            v103 = v107;
            if ((char *)a1 + v107 == a2)
                break;
        } while ((v107 = v103, v86 = v104 - 1, v104 != 1));
    }
    else
    {
        v107 = 3;
    }
    if (*(long long *)&g_10002b0 == v13)
        return v107;
    ___stack_chk_fail();
}
