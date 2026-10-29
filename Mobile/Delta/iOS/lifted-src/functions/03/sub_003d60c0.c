/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d60c0..0x3d66b4 (1524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d60c0_1 {
    struct st_3d60c0_0 *field_0;
} st_3d60c0_1;

typedef struct st_3d60c0_4 {
    void* field_0;
    char field_4;
    char padding_5[19];
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    char padding_28[44];
    unsigned int field_54;
    unsigned int field_58;
} st_3d60c0_4;

typedef struct st_3d60c0_0 {
    char field_0;
} st_3d60c0_0;

typedef struct st_3d60c0_2 {
    st_3d60c0_0 field_0;
} st_3d60c0_2;

typedef struct st_3d60c0_3 {
    unsigned long long field_0;
} st_3d60c0_3;

extern char g_d0da1b;
extern st_3d60c0_3 *g_f0b120;
extern char g_1000001;
extern unsigned long g_fffffffffffffff0;

unsigned long long sub_3d60c0(st_3d60c0_4 *a0, unsigned long long a1)
{
    unsigned int *v15;  // x21
    unsigned int v16;  // w0
    unsigned long iter;  // x10
    unsigned long long i;  // x11
    unsigned long long v27;  // x11
    unsigned long long iter1;  // x10
    unsigned long long j;  // x8
    unsigned long long v31;  // x8
    unsigned long long k;  // x23
    unsigned long idx;  // x25
    unsigned int v17;  // w23
    unsigned long node;  // x24
    unsigned int v36;  // w0
    unsigned int v37;  // w0
    unsigned long long v38;  // 4128
    unsigned int v39;  // w8
    unsigned long long v40;  // 4129
    unsigned long long v41;  // w0
    unsigned long long v42;  // x22
    unsigned long long v43;  // x8
    __m128i v44;  // q0
    unsigned int v18;  // w0
    unsigned long v45;  // x9
    __m128i v46;  // q0
    __m128i v47;  // q1
    unsigned long long l;  // x10
    unsigned long long v49;  // x10
    unsigned long long v51;  // x9
    unsigned long long m;  // x8
    unsigned long long v53;  // x8
    unsigned long long v19;  // w8
    unsigned long v56;  // x10
    unsigned long long n;  // x11
    unsigned long long v58;  // x11
    unsigned long v59;  // x12
    unsigned long v60;  // x12
    unsigned long long v61;  // d1
    unsigned long long v62;  // x28
    unsigned long long v63;  // x26
    st_3d60c0_4 *v64;  // x8
    unsigned int v20;  // w0
    void* v65;  // w9
    unsigned int v66;  // w10
    unsigned int v67;  // w21
    unsigned long long v68;  // x23
    unsigned int v69;  // w27
    unsigned long long v70;  // x24
    st_3d60c0_4 *v71;  // x20
    unsigned long long v72;  // x0
    st_3d60c0_4 *v73;  // x8
    unsigned long long v74;  // x0
    unsigned long long v21;  // w8
    unsigned long long v22;  // w0
    unsigned long long v23;  // x8
    unsigned long long v24;  // x9
    unsigned long long v0;  // [bp-0xa8]
    unsigned int v1;  // [bp-0xa0]
    unsigned int v2;  // [bp-0x9c]
    unsigned int v3;  // [bp-0x98]
    unsigned int v4;  // [bp-0x94]
    unsigned int v5;  // [bp-0x90]
    unsigned int v6;  // [bp-0x8c]
    unsigned int v7;  // [bp-0x88]
    unsigned int v8;  // [bp-0x84]
    st_3d60c0_0 **v9;  // [bp-0x80], Other Possible Types: char
    st_3d60c0_0 *v10;  // [bp-0x78]
    st_3d60c0_0 **v11;  // [bp-0x70], Other Possible Types: st_3d60c0_1 **, st_3d60c0_2 **, char
    st_3d60c0_0 *v12;  // [bp-0x68], Other Possible Types: st_3d60c0_1 **
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v10 = &v9;
    v9 = &v10;
    v15 = a0->field_0;
    v12 = &v11;
    v11 = &v12;
    v16 = sub_3d706c(v15);
    v17 = sub_3d706c(v15) | v16 * 0x100;
    if (10 >= v17)
    {
        g_f0b120();
    }
    else if (sub_3d706c(v15) == 8)
    {
        v11 = &v12;
        v12 = &v11;
        v18 = sub_3d706c(v15);
        v19 = sub_3d706c(v15) | v18 * 0x100;
        v15[1] = v19;
        if (!v19)
            g_f0b120();
        v11 = &v12;
        v12 = &v11;
        v20 = sub_3d706c(v15);
        v21 = sub_3d706c(v15) | v20 * 0x100;
        *v15 = v21;
        if (!v21)
        {
            g_f0b120();
        }
        else if (v15[1] >= &g_1000001)
        {
            g_f0b120();
        }
        else
        {
            v22 = (unsigned int)sub_3d706c(v15);
            if (4 >= v22 && 1 << ((char)v22 & 31) & 26)
            {
                v15[2] = v22;
                v23 = v22;
                if (2 > v22)
                {
                    v24 = 0;
                }
                else
                {
                    v24 = v23 & 126;
                    iter = &a0[190].field_4;
                    i = v24;
                    do
                    {
                        v27 = i;
                        *(unsigned long long *)(iter - 120) = 0;
                        *(unsigned long long *)(iter - 24) = 0;
                        *(unsigned long long *)(iter - 96) = 0;
                        *(unsigned long long *)iter = 0;
                        iter += 192;
                        i = v27 - 2;
                    } while (i);
                    if (v24 == v23)
                        goto LABEL_3d6304;
                }
                iter1 = &(&a0[189].field_4)[(unsigned int)v24 * 96];
                j = v23 - v24;
                do
                {
                    v31 = j;
                    *(unsigned long long *)(iter1 - 24) = 0;
                    *(unsigned long long *)iter1 = 0;
                    iter1 += 96;
                    j = v31 - 1;
                } while (j);
LABEL_3d6304:
                if (v17 != v22 * 3 + 8)
                    g_f0b120();
                k = 0;
                idx = &a0[0xaa].padding_28[20];
                *(unsigned int *)(idx + 2128) = 0;
                node = idx + 1708;
                do
                {
                    v36 = sub_3d706c(v15);
                    *(unsigned int *)(node - 12) = v36;
                    if (v15[2] == 3 && v36 == (&g_d0da1b)[k])
                        *(int *)(idx + 2128) = *(int *)(idx + 2128) + 1;
                    v37 = sub_3d706c(v15);
                    *(unsigned int *)(node - 8) = v37 >> 4;
                    v38 = arm64g_calculate_condition(145, v37 - 80, 65, 0);
                    if (v38 & 1)
                        g_f0b120();
                    v39 = v37 & 15;
                    *(unsigned int *)(node - 4) = v39;
                    v40 = arm64g_calculate_condition(145, v39 - 5, 5, 0);
                    if (v40 & 1)
                        g_f0b120();
                    v41 = (unsigned int)sub_3d706c(v15);
                    *(unsigned int *)node = v41;
                    if (4 <= v41)
                        g_f0b120();
                    k += 1;
                    v42 = v15[2];
                    node += 96;
                } while ((long long)k < (long long)v42);
                if (a1)
                    return 1;
                v7 = v15[1];
                v8 = *v15;
                if (!sub_3cfce4(v8, v7, v42, 0))
                    g_f0b120();
                if ((int)v42 >= 1)
                {
                    if ((unsigned int)v42 == 1)
                    {
                        v43 = 0;
                        v44 = _mm_set_epi64x(0, 4294967297);
                    }
                    else
                    {
                        v43 = v42 & 0x7ffffffe;
                        v45 = idx + 1700;
                        v46 = _mm_set_epi64x(0, 4294967297);
                        v47 = _mm_set_epi64x(0, 4294967297);
                        l = v43;
                        do
                        {
                            v49 = l;
                            v46 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_max_epi32(*(unsigned long long *)&*(double *)v45, v46));
                            v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_max_epi32(*(unsigned long long *)&*(double *)(v45 + 96), v47));
                            v45 += 192;
                            l = v49 - 2;
                        } while (l);
                        v44 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_max_epi32(v46, v47));
                        if (v43 == v42)
                            goto LABEL_3d64a4;
                    }
                    v51 = (char *)a0 + (unsigned int)v43 * 96 + 18084;
                    m = v42 - v43;
                    do
                    {
                        v53 = m;
                        v44 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_max_epi32(*(unsigned long long *)&*(double *)v51, v44));
                        m = v53 - 1;
                        v51 += 96;
                    } while (m);
LABEL_3d64a4:
                    v56 = idx + 1704;
                    n = v42;
                    do
                    {
                        v58 = n;
                        v59 = *(int *)(v56 - 4);
                        if (_mm_cvtsi128_si32(v44) - (unsigned int)v59 * (unsigned int)(_mm_cvtsi128_si32(v44) / v59))
                            g_f0b120();
                        v60 = *(int *)v56;
                        if (_mm_extract_epi32(v44, 1) - (unsigned int)v60 * (unsigned int)(_mm_extract_epi32(v44, 1) / v60))
                            g_f0b120();
                        v56 += 96;
                        n = v58 - 1;
                    } while (n);
                }
                else
                {
                    v44 = _mm_set_epi64x(0, 4294967297);
                }
                *(long long *)&a0[188].field_4 = _mm_cvtsi128_si64(v44);
                v61 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_slli_epi32(v44, 3));
                *(unsigned long long *)&a0[188].padding_5[15] = v61;
                v6 = (v8 + (unsigned int)v61 - 1) / (unsigned int)v61;
                *(unsigned int *)(idx + 1680) = v6;
                v5 = (v7 + *(unsigned int *)((void*)&v61 + 4) - 1) / *(unsigned int *)((void*)&v61 + 4);
                *(unsigned int *)(idx + 1684) = v5;
                if ((int)v42 >= 1)
                {
                    v62 = 0;
                    v4 = _mm_cvtsi128_si32(v44);
                    v2 = _mm_extract_epi32(v44, 1);
                    v3 = v4 - 1;
                    v1 = v2 - 1;
                    v0 = v42 * 96;
                    v63 = 18084;
                    while (1)
                    {
                        v64 = (char *)a0 + v63;
                        v65 = (void*)(int)v64->field_0;
                        v66 = *(int *)((char *)&v64->field_0 + 4);
                        *(unsigned int *)&v64->padding_5[15] = (v3 + v8 * v65) / v4;
                        v64->field_18 = (v1 + v7 * v66) / v2;
                        v67 = v6 * v65;
                        v68 = v67 * 8;
                        v69 = v5 * v66;
                        v70 = v69 * 8;
                        v64->field_1c = v68;
                        v64->field_20 = v70;
                        v71 = (char *)a0 + v62;
                        v72 = sub_3ceae0(v68, v70, 15);
                        memset(v71 + 189, 0, 24);
                        *(unsigned long long *)&v71[188].field_54 = v72;
                        if (!v72)
                            break;
                        *(unsigned long *)&v71[188].padding_28[36] = v72 + 15 & &g_fffffffffffffff0;
                        if (*(int *)(idx + 2096))
                        {
                            v73 = (char *)a0 + v63;
                            *(unsigned int *)&v73->padding_28[40] = v67;
                            v73->field_54 = v69;
                            v74 = sub_3d6ef0(v68, v70, 2, 15);
                            v71[189].field_0 = v74;
                            if (!v74)
                                break;
                            *(unsigned long *)&v71[189].padding_5[7] = v74 + 15 & &g_fffffffffffffff0;
                        }
                        v62 += 96;
                        v63 += 96;
                        if (v0 == v62)
                            return 1;
                    }
                    g_f0b120();
                }
                return 1;
            }
            g_f0b120();
        }
    }
    else
    {
        g_f0b120();
    }
}
