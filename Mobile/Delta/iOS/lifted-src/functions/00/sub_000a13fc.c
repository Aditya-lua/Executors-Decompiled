/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa13fc..0xa1910 (1300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a13fc_1 {
    struct st_a13fc_2 *field_0;
} st_a13fc_1;

typedef struct st_a13fc_2 {
    struct st_a13fc_1 *field_0;
} st_a13fc_2;

typedef struct st_a13fc_0 {
    char field_0;
} st_a13fc_0;

extern char g_10002b0;

unsigned long long sub_a13fc(void* a0, unsigned int *a1, unsigned long a2, unsigned long long *a3)
{
    unsigned long v16;  // x13
    unsigned long v17;  // x12
    unsigned long v23;  // cc_ndep
    unsigned long long v100;  // x22
    unsigned long long v101;  // x24
    unsigned long v102;  // x28
    unsigned long long v103;  // x0
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
    unsigned long v68;  // x15
    __m128i v69;  // 4178
    __m128i v70;  // 4180
    __m128i v71;  // 4182
    __m128i v72;  // 4184
    __m128i v73;  // 4188
    __m128i v74;  // 4190
    __m128i v75;  // 4193
    __m128i v76;  // 4195
    __m128i v77;  // 4198
    __m128i v78;  // 4200
    __m128i v79;  // 4203
    __m128i v80;  // 4205
    __m128i v81;  // q4
    __m128i v82;  // q0
    unsigned long long v84;  // x24
    unsigned long long v85;  // x16
    unsigned long long v86;  // w10
    unsigned long long v87;  // x11
    unsigned long long v88;  // 4128
    unsigned long long v89;  // 4130
    unsigned long long v90;  // x17
    unsigned int v91;  // w17
    unsigned int v92;  // w17
    unsigned long v93;  // x17
    unsigned long long v94;  // x11
    unsigned int v95;  // w9
    unsigned long long v96;  // x10
    unsigned long long v97;  // x9
    unsigned int v98;  // w10
    st_a13fc_2 **v99;  // x27
    unsigned int v0;  // [bp-0x1bc]
    st_a13fc_0 **v1;  // [bp-0x1b8], Other Possible Types: char
    st_a13fc_0 *v2;  // [bp-0x1b0]
    st_a13fc_0 **v3;  // [bp-0x1a8], Other Possible Types: char
    st_a13fc_0 *v4;  // [bp-0x1a0]
    st_a13fc_0 **v5;  // [bp-0x198], Other Possible Types: char
    st_a13fc_0 *v6;  // [bp-0x190]
    char *v7;  // [bp-0x188], Other Possible Types: st_a13fc_0 *
    st_a13fc_0 **v8;  // [bp-0x180]
    st_a13fc_2 **v9;  // [bp-0x178]
    st_a13fc_2 **v10;  // [bp-0x170]
    st_a13fc_2 **v11;  // [bp-0x170], Other Possible Types: unsigned long
    st_a13fc_2 **v12;  // [bp-0x170]
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
            goto LABEL_a148a;
LABEL_a1489:
        v22 = (unsigned int)(unsigned int *)((char *)v20 - v21);
    }
    else
    {
        v29 = arm64g_calculate_condition(v26 | 128, v27, v28, v23);
        v30 = arm64g_calculate_condition(0, (v29 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v30 & 1)
            goto LABEL_a1489;
LABEL_a148a:
    }
    v31 = (int)a0[268];
    if ((unsigned int)(int)a0[268] >= 6)
        v31 = 6;
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
                goto LABEL_a1514;
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
                    v43 = v42 >> 2 & 0x3fffffc0;
                    v44 = v17 + v43;
                    v45 = *v44 - 1;
                    if (!(v45 & 63))
                        v46 = 63;
                    else
                        v46 = 0;
                    index = v46 + (v45 & 63);
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
LABEL_a1514:
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
                    v59 = (unsigned int)(x30) >> 2 & 0x3fffffc0;
                    v60 = v37 + v59;
                    v9 = &v12;
                    v11 = &v9;
                    v61 = *v60 - 1;
                    if (!(v61 & 63))
                        v62 = 63;
                    else
                        v62 = 0;
                    idx2 = v62 + (v61 & 63);
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
    v65 = v33 >> 2 & 0x3fffffc0;
    v66 = v16 + v65 * 4;
    v67 = v17 + v65;
    v68 = *(char *)v67;
    v69 = (int128_t)v67[48];
    v70 = (int128_t)v67[32];
    v71 = (int128_t)v67[16];
    v72 = *(int128_t *)v67;
    v73 = __dirty_unsupported_Iop_SliceV128(v72, v72, 12);
    v74 = __dirty_unsupported_Iop_SliceV128(v72, v72, 12);
    v75 = __dirty_unsupported_Iop_SliceV128(v71, v71, 12);
    v76 = __dirty_unsupported_Iop_SliceV128(v71, v71, 12);
    v77 = __dirty_unsupported_Iop_SliceV128(v70, v70, 12);
    v78 = __dirty_unsupported_Iop_SliceV128(v70, v70, 12);
    v79 = __dirty_unsupported_Iop_SliceV128(v69, v69, 12);
    v80 = __dirty_unsupported_Iop_SliceV128(v69, v69, 12);
    v81 = (__m128i)(CONCAT(v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000 | (v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000) * 0x100000000, v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000 | (v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v82 = _mm_or_si128(ShrNV(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69))))), v81), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)))), _mm_unpacklo_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69))))), v81), ShlNV(_mm_set1_epi8(-1), 7))), 2), _mm_and_si128(_mm_or_si128(ShrNV(_mm_cmpeq_epi8(_mm_unpacklo_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69))))), v81), 1), _mm_and_si128(_mm_cmpeq_epi8(_mm_unpackhi_epi64(_mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v73, v72), _mm_unpackhi_epi8(v74, v72))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v75, v71), _mm_unpackhi_epi8(v76, v71)))), _mm_unpackhi_epi32(_mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v77, v70), _mm_unpackhi_epi8(v78, v70))), _mm_unpackhi_epi16(_mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69)) * 0x10000000000000000, _mm_unpackhi_epi64(_mm_unpacklo_epi8(v79, v69), _mm_unpackhi_epi8(v80, v69))))), v81), ShlNV(_mm_set1_epi8(-1), 7))), ShlNV(_mm_set1_epi8(-1), 6)));
    v84 = 0;
    v85 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_or_si128(ShrNV(v82, 4), _mm_and_si128(v82, ShlNV(_mm_set1_epi8(-1), 4))), 4), _mm_srli_epi16(_mm_or_si128(ShrNV(v82, 4), _mm_and_si128(v82, ShlNV(_mm_set1_epi8(-1), 4))), 4)));
    if (v85)
    {
        v86 = 1 << ((char)v31 & 31);
        if (!(v68 & 63))
            v87 = v85;
        else
            v87 = v85 << (char)(64 - (v68 & 63)) | v85 >> ((char)v68 & 63);
        do
        {
            v88 = ((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v89 = (((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v90 = ((((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v90)
                v91 = 64;
            else
                v91 = Clz(v90);
            v92 = v91 + (unsigned int)v68;
            if (!(v92 & 63))
                continue;
            if (v66[v92 & 63] < v22)
                break;
            *(unsigned int *)((char *)&v11 + 4 * v84) = v66[v92 & 63];
            v84 += 1;
            v86 -= 1;
        } while ((v93 = v87 - 1, v94 = v93 & v87, v93 & v87 && (v87 &= v93, v86)));
    }
    v95 = (unsigned int)v68 - 1;
    if (!(v95 & 63))
        v96 = 63;
    else
        v96 = 0;
    v97 = v96 + (v95 & 63);
    *(char *)v67 = v97;
    *((char *)v67 + v97) = v33;
    v98 = (int)a0[44];
    *(unsigned int *)&a0[44] = v98 + 1;
    v66[v97] = v98;
    if (v84)
    {
        v99 = &v11;
        v100 = 3;
        do
        {
            v101 = v84;
            v102 = *(int *)v99;
            v99 = (char *)v99 + 4;
            if (*(int *)((char *)v19 + v102 + v100 - 3) == *(int *)((char *)a1 + v100 - 3) && !(v103 = sub_7cdfc(a1), v103 <= v100 || (*a3 = (unsigned int)v20 + 3 - v102, v100 = v103, (char *)a1 + v103 != a2)))
                break;
        } while ((v84 = v101 - 1, v101 != 1));
    }
    else
    {
        v100 = 3;
    }
    if (*(long long *)&g_10002b0 == v13)
        return v100;
    ___stack_chk_fail();
}
