/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb35e8..0xb3b38 (1360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b35e8_1 {
    char padding_0[8];
    unsigned long long *field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[4];
    unsigned int field_34;
    unsigned long long field_38;
    unsigned int field_40;
    char padding_44[28];
    unsigned long long field_60;
    unsigned int field_68;
    char padding_6c[4];
    unsigned long long field_70;
    char padding_78[136];
    unsigned int field_100;
    char padding_104[8];
    unsigned int field_10c;
} st_b35e8_1;

typedef struct st_b35e8_2 {
    struct st_b35e8_3 *field_0;
} st_b35e8_2;

typedef struct st_b35e8_3 {
    struct st_b35e8_2 *field_0;
} st_b35e8_3;

typedef struct st_b35e8_0 {
    char field_0;
} st_b35e8_0;

extern char g_10002b0;

unsigned long long sub_b35e8(st_b35e8_1 *a0, void* a1, long long a2, unsigned long long *a3)
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
    unsigned long long *v19;  // x22
    unsigned int v33;  // w12
    unsigned long long v34;  // x17
    unsigned int v35;  // w14
    unsigned int *v36;  // x16
    unsigned long v37;  // x3
    unsigned long long *v38;  // x4
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
    void* v21;  // x8
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
    st_b35e8_3 **v94;  // x28
    unsigned long long v95;  // x19
    unsigned long long v96;  // x25
    unsigned long v97;  // x20
    unsigned int *v98;  // x8
    unsigned long long v99;  // x0
    unsigned int v0;  // [bp-0x1cc]
    st_b35e8_0 **v1;  // [bp-0x1b8], Other Possible Types: char
    st_b35e8_0 *v2;  // [bp-0x1b0]
    st_b35e8_0 **v3;  // [bp-0x1a8], Other Possible Types: char
    st_b35e8_0 *v4;  // [bp-0x1a0]
    st_b35e8_0 **v5;  // [bp-0x198], Other Possible Types: char
    st_b35e8_0 *v6;  // [bp-0x190]
    char *v7;  // [bp-0x188], Other Possible Types: st_b35e8_0 *
    st_b35e8_0 **v8;  // [bp-0x180]
    st_b35e8_3 **v9;  // [bp-0x178]
    st_b35e8_3 **v10;  // [bp-0x170]
    st_b35e8_3 **v11;  // [bp-0x170], Other Possible Types: unsigned long
    st_b35e8_3 **v12;  // [bp-0x170]
    unsigned long v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    v16 = a0->field_70;
    v17 = a0->field_38;
    v18 = a0->field_34;
    v19 = a0->field_8;
    v20 = a0->field_10;
    v21 = a1 - v19;
    v22 = 1 << ((char)a0->field_100 & 31);
    v23 = a0->field_18;
    v24 = a0->field_1c;
    if (v22 < (unsigned int)(v21 - a0->field_1c))
    {
        v28 = arm64g_calculate_condition(v30 | 128, v25, v26, v27);
        v29 = arm64g_calculate_condition(3, (v28 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v29 & 1))
            goto LABEL_b3676;
LABEL_b3675:
        v24 = (unsigned int)(v21 - v22);
    }
    else
    {
        v31 = arm64g_calculate_condition(v30 | 128, v25, v26, v27);
        v32 = arm64g_calculate_condition(0, (v31 & 1 ? a0->field_28 : 0), 0, 0);
        if (v32 & 1)
            goto LABEL_b3675;
LABEL_b3676:
    }
    v33 = a0->field_10c;
    if (a0->field_10c >= 5)
        v33 = 5;
    v34 = a0->field_60;
    if (a0[1].field_1c)
    {
        v35 = (0xcf1bbcdcbf9b0000 * *(long long *)a1 ^ v34) >> ((char)(56 - v18) & 63);
        a0->field_2c = (unsigned int)v21;
    }
    else
    {
        v0 = v33;
        v36 = &a0->field_40;
        v4 = &v3;
        v3 = &v4;
        v37 = a0->field_2c;
        if (385 > (unsigned int)(v21 - v37))
        {
            v38 = v19;
            v39 = v17;
            v40 = v16;
            v6 = &v5;
            v5 = &v6;
            if ((unsigned int)v21 > (unsigned int)v37)
                goto LABEL_b3700;
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
                    v36[idx] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v19 + j + 8) ^ a0->field_60) >> ((char)(56 - v18) & 63);
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
                v40 = a0->field_70;
                v39 = a0->field_38;
            }
            v37 = (unsigned int)v21 - 32;
            v50 = a1 + 1;
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
                    v36[v55 & 7] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v19 + v55) ^ a0->field_60) >> ((char)(56 - a0->field_34) & 63);
                    v55 += 1;
                    k = v56 - 1;
                } while (k);
            }
            v38 = a0->field_8;
            v6 = &v5;
            v5 = &v6;
            if ((unsigned int)v37 < (unsigned int)v21)
            {
LABEL_b3700:
                v58 = 56 - a0->field_34;
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
                    v36[idx1] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v38 + i + 8) ^ a0->field_60) >> (v58 & 63);
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
        a0->field_2c = (unsigned int)v21;
        v66 = v21 & 7;
        v35 = v36[v66];
        v36[v66] = (0xcf1bbcdcbf9b0000 * *(long long *)((char *)v19 + (v21 & 0xffffffff) + 8) ^ v34) >> ((char)(56 - v18) & 63);
        v33 = v0;
    }
    a0->field_68 = a0->field_68 + v35;
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
    v93 = a0->field_2c;
    a0->field_2c = v93 + 1;
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
                if (*v98 != *(int *)a1 || !(v99 = sub_84f30(a1 + 4, v98 + 1, a2, v20 + v23, (char *)v19 + v23) + 4, v99 > v95))
                    continue;
            }
            else if (!(*(int *)((char *)v19 + v97 + v95 - 3) == *(int *)((char *)a1 + v95 - 3) && (v99 = sub_7cdfc(a1), v99 > v95)))
            {
                continue;
            }
            *a3 = (unsigned int)v21 + 3 - v97;
            v95 = v99;
            if (a1 + v99 == a2)
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
