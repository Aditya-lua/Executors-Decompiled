/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4260c..0xc44d00 (9972 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4260c_7 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_c4260c_7;

typedef struct st_c4260c_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_c4260c_1;

typedef struct st_c4260c_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[16];
    unsigned long long *field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_c4260c_0;

typedef struct st_c4260c_2 {
    unsigned long long field_0;
    struct st_c4260c_3 *field_8;
    struct st_c4260c_4 *field_10;
    struct st_c4260c_1 *field_18;
    uint128_t field_20;
    unsigned long long field_30;
} st_c4260c_2;

typedef struct st_c4260c_8 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
    char padding_14[4];
    struct st_c4260c_4 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_c4260c_8;

typedef struct st_c4260c_3 {
    unsigned long long field_0;
} st_c4260c_3;

typedef struct st_c4260c_4 {
    char field_0;
} st_c4260c_4;

extern long long g_efd5f0;
extern unsigned long long g_f0a668;
extern st_c4260c_0 *g_f0a670;
extern char g_f0a678;
extern unsigned int g_f0afc0;

unsigned int sub_c4260c(st_c4260c_2 *a0, st_c4260c_7 *a1)
{
    unsigned int v119;  // w8
    unsigned int v120;  // x0
    unsigned long long v128;  // x27
    unsigned int v129;  // x26
    unsigned int v130;  // x0
    unsigned int v258;  // x22
    unsigned int v131;  // x0
    char *v132;  // x8
    unsigned int k;  // w23
    unsigned int v134;  // x21
    unsigned int idx;  // x27
    char *v121;  // x24
    unsigned int index;  // x28
    void* node;  // x19
    unsigned int v138;  // x8
    unsigned int v139;  // x24
    unsigned int v140;  // x21
    unsigned int v142;  // x8
    unsigned long long v143;  // 4153
    unsigned long long v144;  // 4155
    unsigned int v145;  // x9
    unsigned long long v122;  // x15
    unsigned long long v146;  // 4198
    __m128i v147;  // q8
    __m128i v148;  // q0
    unsigned int v150;  // x9
    unsigned long long v151;  // 4153
    unsigned long long v152;  // 4155
    unsigned int v153;  // x10
    unsigned long long v154;  // 4198
    unsigned long long v155;  // x19
    unsigned long long count;  // x0
    unsigned int v156;  // x10
    unsigned long v157;  // x8
    unsigned int v158;  // x11
    unsigned long long v159;  // x12
    unsigned long long v160;  // x13
    unsigned long long *iter;  // x9
    unsigned long long *iter1;  // x14
    unsigned long long l;  // x15
    unsigned int v164;  // x15
    unsigned long v165;  // x17
    unsigned int i;  // x21
    unsigned int ptr1;  // x0
    st_c4260c_8 *v168;  // x8
    unsigned long long **v169;  // x22
    unsigned int v170;  // x21
    unsigned long long v171;  // x20
    unsigned int iter2;  // x23
    st_c4260c_0 *j;  // x10
    unsigned long long *n;  // x12
    unsigned int v125;  // x20
    unsigned long v176;  // x28
    unsigned long v177;  // x10
    unsigned int v178;  // x11
    unsigned long long *v179;  // x12
    unsigned long long v180;  // x13
    unsigned long long v181;  // 4151
    unsigned int v126;  // x22
    unsigned long long v127;  // x28
    st_c4260c_1 *v0;  // [bp-0x1f50], Other Possible Types: unsigned int
    uint128_t v1;  // [bp-0x1f40]
    unsigned long long v2;  // [bp-0x1f30]
    char *v3;  // [bp-0x1f20]
    unsigned int v4;  // [bp-0x1f14]
    char *v5;  // [bp-0x1f10]
    char *v6;  // [bp-0x1f10]
    unsigned long long v7;  // [bp-0x1f08]
    unsigned long long v8;  // [bp-0x1f08]
    unsigned long long v9;  // [bp-0x1f00]
    unsigned long long len;  // [bp-0x1ef8]
    unsigned int v11;  // [bp-0x1ef0]
    uint128_t v12;  // [bp-0x1ee0]
    unsigned int v14;  // [bp-0x1ec1]
    unsigned int *v15;  // [bp-0x1ec0]
    unsigned long v16;  // [bp-0x1eb8]
    uint128_t v17;  // [bp-0x1eb0]
    unsigned long v18;  // [bp-0x1ea0]
    st_c4260c_1 *v19;  // [bp-0x1e98]
    char *v20;  // [bp-0x1e90]
    st_c4260c_7 *v21;  // [bp-0x1e88]
    uint128_t v22;  // [bp-0x1e80], Other Possible Types: char
    unsigned int v23;  // [bp-0x1e70], Other Possible Types: unsigned long long
    uint128_t v24;  // [bp-0x1e70]
    uint128_t v41;  // [bp-0x12e0]
    uint128_t v42;  // [bp-0x12d0]
    unsigned long long v43;  // [bp-0x12d0]
    unsigned int v48;  // [bp-0x1070]
    char *v117;  // [bp-0x10]
    char v118;  // [bp+0x0]

    v117 = &v118;
    v48 = 0;
    v0 = 0;
    if (!*(char *)a0->field_0 && (unsigned long long)*(long long *)a0->field_8 > 100)
        v119 = 0;
    v14 = 0;
    v15 = &v14;
    v16 = a0->field_0;
    v1 = a0->field_20;
    v17 = a0->field_20;
    v18 = a0->field_30;
    v19 = a0->field_18;
    v20 = a0->field_10;
    v21 = a1;
    v120 = a1->field_8;
    v0 = a0->field_18;
    if (!(a1->field_0 & 1))
        v120 = __Unwind_GetIP(a1->field_8);
    v3 = a0->field_10;
    v121 = &v22;
    v122 = (!v120 ? 0 : v120 - 1);
    v2 = v122;
    if (g_f0a668 == 0x8000000000000000)
    {
        v41 = CONCAT(8, 0);
        *(unsigned long long *)&v42 = 0;
        count = __dyld_image_count();
        if (!(unsigned int)count)
        {
LABEL_c42b00:
            v22 = v41;
            *(unsigned long long *)&v24 = *(unsigned long long *)&v42;
            if (g_f0a668 != 0x8000000000000000)
            {
                i = *(long long *)&g_f0a678;
                if (*(long long *)&g_f0a678)
                {
                    v169 = &g_f0a670->field_20;
                    do
                    {
                        v170 = i;
                        if (*(long long *)((char *)v169 - 32))
                            _free(*(long long *)((char *)v169 - 24));
                        if (*(long long *)((char *)v169 - 8))
                            _free(*v169);
                        v169 += 7;
                        i = v170 - 1;
                    } while (i);
                }
                if (g_f0a668)
                    _free(g_f0a670);
            }
            v171 = &g_f0a668;
            _memcpy(&g_f0a668, &v22, 2392);
            *(unsigned long long *)&g_f0afc0 = 0;
            v122 = v2;
            goto LABEL_c42ba0;
        }
        i = count;
        v125 = 0;
        v126 = 0;
        v4 = count;
        v7 = v8;
        v5 = v6;
        while (1)
        {
            v130 = __dyld_get_image_name(v126);
            if (v130)
            {
                v9 = v130;
                len = _strlen();
                v131 = __dyld_get_image_header(v126);
                if (!v131)
                    goto LABEL_c4276c;
                if (*(int *)v131 != 0xfeedface)
                {
                    if (*(int *)v131 == 4277009103)
                    {
                        v132 = 32;
                        goto LABEL_c427bc;
                    }
                    goto LABEL_c4276c;
                }
                else
                {
                    v132 = 28;
LABEL_c427bc:
                    k = *(int *)(v131 + 16);
                    v134 = *(int *)(v131 + 20);
                    v22 = CONCAT(8, 0);
                    v23 = 0;
                    if (k)
                    {
                        idx = 0;
                        v11 = 0;
                        index = 0;
                        node = (v134 ? &v132[v131] : 1);
                        v138 = 8;
                        do
                        {
                            if (v134 < 8 || (v139 = (int)node[4], v139 < 8 || (v140 = (v134 < v139 ? 0 : v134 - v139), v134 < v139)))
                            {
LABEL_c429ac:
                                if (*(unsigned long long *)&v22)
                                    _free(*(unsigned long long *)((void*)&v22 + 8));
                                v155 = 0x8000000000000000;
                                i = v258;
                                v121 = &v22;
                                goto LABEL_c42ab0;
                            }
                            if (*(int *)node != 25)
                            {
                                if (*(int *)node != 1)
                                    continue;
                                if (v139 < 56)
                                    goto LABEL_c429ac;
                                if (((unsigned long long)((uint128_t)((int128_t)node[8]) >> 0) & 0xffffffffffff) == 92738097012575)
                                {
                                    v142 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8((int128_t)node[8], _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8((int128_t)node[8], _mm_setzero_si128()), 4))) & 0x8888888888888888;
                                    v143 = ((((((v142 & 0xaaaaaaaaaaaaaaaa) >> 1 | v142 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v142 & 0xaaaaaaaaaaaaaaaa) >> 1 | v142 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v142 & 0xaaaaaaaaaaaaaaaa) >> 1 | v142 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v142 & 0xaaaaaaaaaaaaaaaa) >> 1 | v142 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v144 = (((((((v142 & 0xaaaaaaaaaaaaaaaa) >> 1 | v142 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v142 & 0xaaaaaaaaaaaaaaaa) >> 1 | v142 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v142 & 0xaaaaaaaaaaaaaaaa) >> 1 | v142 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v142 & 0xaaaaaaaaaaaaaaaa) >> 1 | v142 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v145 = ((((v144 | v143) & 0xffff0000ffff0000) >> 16 | (v144 | v143) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v144 | v143) & 0xffff0000ffff0000) >> 16 | (v144 | v143) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v146 = arm64g_calculate_condition((v142 ? 4 : 0) | 16, (v142 ? (!v145 ? 64 : Clz(v145)) & 60 : 0), (v142 ? 24 : 0), 0);
                                    if (!(v146 & 1))
                                    {
                                        if ((int)node[32])
                                        {
                                            index = idx;
                                        }
                                        else
                                        {
                                            v11 |= (int)node[36] != 0;
                                            index = idx;
                                            v147 = __double_as_longlong((double)node[24]);
                                            if (idx != *(unsigned long long *)&v22)
                                                goto LABEL_c427f8;
LABEL_c428b8:
                                            sub_c6c28c(&v22);
LABEL_c427f8:
                                            v148 = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v147), 32);
                                            v138 = *(unsigned long long *)((void*)&v22 + 8);
                                            goto LABEL_c42800;
                                        }
                                    }
                                }
                                v147 = __double_as_longlong((double)node[24]);
                                if (idx != *(unsigned long long *)&v22)
                                    goto LABEL_c427f8;
                                goto LABEL_c428b8;
                            }
                            else
                            {
                                if (v139 < 72)
                                    goto LABEL_c429ac;
                                if (((unsigned long long)((uint128_t)((int128_t)node[8]) >> 0) & 0xffffffffffff) == 92738097012575)
                                {
                                    v150 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8((int128_t)node[8], _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8((int128_t)node[8], _mm_setzero_si128()), 4))) & 0x8888888888888888;
                                    v151 = ((((((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v152 = (((((((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v153 = ((((v152 | v151) & 0xffff0000ffff0000) >> 16 | (v152 | v151) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v152 | v151) & 0xffff0000ffff0000) >> 16 | (v152 | v151) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    v154 = arm64g_calculate_condition((v150 ? 4 : 0) | 16, (v150 ? (!v153 ? 64 : Clz(v153)) & 60 : 0), (v150 ? 24 : 0), 0);
                                    if (v154 & 1)
                                        goto LABEL_c42920;
                                    if ((long long)node[40])
                                    {
                                        index = idx;
                                        goto LABEL_c42920;
                                    }
                                    else
                                    {
                                        v11 |= (long long)node[48] != 0;
                                        index = idx;
                                        v12 = (int128_t)node[24];
                                        if (idx != *(unsigned long long *)&v22)
                                            goto LABEL_c42940;
LABEL_c42934:
                                        sub_c6c28c(&v22);
                                        v138 = *(unsigned long long *)((void*)&v22 + 8);
LABEL_c42940:
                                        v148 = v12;
LABEL_c42800:
                                        *(__m128i *)(v138 + idx * 16) = v148;
                                        idx += 1;
                                        v23 = idx;
                                    }
                                }
                                else
                                {
LABEL_c42920:
                                    v12 = (int128_t)node[24];
                                    if (idx != *(unsigned long long *)&v22)
                                        goto LABEL_c42940;
                                    goto LABEL_c42934;
                                }
                            }
                            node += v139;
                            k -= 1;
                            v134 = (v134 < v139 ? 0 : v134 - v139);
                        } while (k);
                        v7 = __dyld_get_image_vmaddr_slide(v126);
                        v121 = &v22;
                        i = len;
                        if (!(v11 & 1))
                        {
                            if (idx > index)
                            {
                                v156 = *(unsigned long long *)((void*)&v22 + 8);
                                v157 = *(long long *)(v156 + index * 16);
                                v158 = idx * 16;
                                if (v158 != 16)
                                {
                                    v159 = ((unsigned long long)(v158 - 16) >> 4) + 1;
                                    v160 = v159 & 0x1ffffffffffffffe;
                                    iter = v156 + v160 * 16;
                                    iter1 = v156 + 16;
                                    l = v159 & 0x1ffffffffffffffe;
                                    do
                                    {
                                        v164 = l;
                                        v165 = *iter1;
                                        *(unsigned long *)((char *)iter1 - 16) = *(long long *)((char *)iter1 - 16) - v157;
                                        *iter1 = v165 - v157;
                                        iter1 += 4;
                                        l = v164 - 2;
                                    } while (l);
                                    if (v159 == v160)
                                        goto LABEL_c42a70;
                                }
                                else
                                {
                                    iter = (unsigned long long *)v156;
                                }
                                do
                                {
                                    *iter = *iter - v157;
                                    iter += 2;
                                } while (iter != v156 + v158);
LABEL_c42a70:
                                v7 += v157;
                                goto LABEL_c42a7c;
                            }
                            goto LABEL_c44428;
                        }
                        else
                        {
LABEL_c42a7c:
                            if (i)
                            {
                                ptr1 = _malloc(i);
                                if (ptr1)
                                {
                                    v129 = ptr1;
                                    _memcpy();
                                    goto LABEL_c42aa4;
                                }
                            }
                            v129 = 1;
LABEL_c42aa4:
                            v127 = *(unsigned long long *)((void*)&v22 + 8);
                            v5 = *(unsigned long long *)&v22;
                            v155 = i;
                            v128 = idx;
LABEL_c42ab0:
                            v125 = *(unsigned long long *)&v42;
                            v258 = i;
                            i = v4;
                            if ((v155 != 0x8000000000000000) <= *(unsigned long long *)&v41 - v125)
                            {
LABEL_c42788:
                                if (v155 != 0x8000000000000000)
                                    goto LABEL_c42790;
                                goto LABEL_c4270c;
                            }
                            else
                            {
LABEL_c42adc:
                                sub_c6c0cc(&v41, v125);
                                v125 = *(unsigned long long *)&v42;
                                if (v155 != 0x8000000000000000)
                                {
LABEL_c42790:
                                    v168 = *(unsigned long long *)((void*)&v41 + 8) + 56 * v125;
                                    v168->field_0 = v155;
                                    *(unsigned long long *)&v168->field_8 = v129;
                                    *(unsigned long long *)&v168->field_10 = v258;
                                    v168->field_18 = v5;
                                    v168->field_20 = v127;
                                    v168->field_28 = v128;
                                    v168->field_30 = v7;
                                    v125 += 1;
                                }
LABEL_c4270c:
                                v126 += 1;
                                v43 = v125;
                                if (v126 == i)
                                    goto LABEL_c42b00;
                            }
                        }
                    }
                    else
                    {
                        __dyld_get_image_vmaddr_slide(v126);
                        idx = 0;
                        index = 0;
LABEL_c44428:
                        sub_c73c94(index, idx, &g_efd5f0);
                    }
                }
            }
            else
            {
LABEL_c4276c:
                v155 = 0x8000000000000000;
                if (*(unsigned long long *)&v41 - v125 < 0)
                    goto LABEL_c42adc;
                goto LABEL_c42788;
            }
        }
    }
    else
    {
LABEL_c42ba0:
        if (*(long long *)&g_f0a678)
        {
            iter2 = 0;
            j = g_f0a670;
            do
            {
                n = j->field_20;
                v176 = j->field_30;
                v177 = j + 1;
                for (v178 = j->field_28 * 16; v178; n = v179)
                {
                    v179 = n + 2;
                    v180 = *n + v176;
                    v178 -= 16;
                    v181 = arm64g_calculate_condition((v180 <= v122 ? 4 : 0) | 144, (v180 <= v122 ? v180 + n[1] : 0), (v180 <= v122 ? v122 : 0), 0);
                }
                iter2 += 1;
                j = v177;
            } while (j != &g_f0a670[*(long long *)&g_f0a678]);
        }
    }
}
