/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d4ddc..0x3d501c (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d4ddc_3 {
    char field_0[8];
    char field_1;
    char padding_2[1];
    char field_3;
    char padding_4[1];
    char field_5;
    char padding_6[1];
    char field_7;
    char field_8[8];
    char field_9;
    char padding_a[1];
    char field_b;
    char padding_c[1];
    char field_d;
    char padding_e[1];
    char field_f;
} st_3d4ddc_3;

typedef struct st_3d4ddc_1 {
    struct st_3d4ddc_2 *field_0;
    char padding_8[16];
    void* field_18;
} st_3d4ddc_1;

typedef struct st_3d4ddc_2 {
    unsigned int field_0;
    unsigned int field_4;
} st_3d4ddc_2;

typedef struct st_3d4ddc_0 {
    char field_0;
} st_3d4ddc_0;


void sub_3d4ddc(st_3d4ddc_1 *a0, void* a1, unsigned int a2)
{
    unsigned long v2;  // x8
    void* iter;  // x9
    char v12;  // 4126
    __m128i v13;  // 4135
    unsigned long long v14;  // x13
    char *node;  // x9
    st_3d4ddc_3 *v16;  // x10
    unsigned long v17;  // 4147
    unsigned long v18;  // 4150
    __m128i v19;  // 4153
    unsigned long long v21;  // d1
    unsigned long long v4;  // x10
    unsigned long long v23;  // 4183
    unsigned long long v24;  // w8
    unsigned long long v25;  // w8
    unsigned long long v26;  // x10
    char *iter1;  // x9
    unsigned long v28;  // x8
    unsigned long long i;  // x11
    char v6;  // 4114
    char *iter2;  // x12
    unsigned long v8;  // x13
    uint128_t v9;  // q1
    unsigned long long v10;  // x11
    unsigned long long v11;  // x13
    st_3d4ddc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3d4ddc_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0->field_0 * a0->field_0->field_4;
    iter = a0->field_18;
    if (a2 == 2)
    {
        if ((unsigned int)v2)
        {
            if ((unsigned int)v2 < 9 || a1 + 1 > iter && iter + ((unsigned int)v2 - 1) * 2 + 2 > a1)
            {
                v10 = 0;
            }
            else if (0x11 > (unsigned int)v2)
            {
                v4 = 0;
LABEL_3d4f94:
                if (!(v2 & 7))
                    v11 = 8;
                else
                    v11 = v2 & 7;
                v10 = v2 - v11;
                v12 = *(char *)a1;
                v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(CONCAT(v12 | v12 * 0x100 | (v12 | v12 * 0x100) * 0x10000 | (v12 | v12 * 0x100 | (v12 | v12 * 0x100) * 0x10000) * 0x100000000, v12 | v12 * 0x100 | (v12 | v12 * 0x100) * 0x10000 | (v12 | v12 * 0x100 | (v12 | v12 * 0x100) * 0x10000) * 0x100000000));
                v14 = v11 + v4 - v2;
                node = iter + v4 * 2 + 7;
                do
                {
                    v16 = node - 7;
                    v17 = *(long long *)&v16->field_1;
                    v18 = (unsigned long)v16->field_0;
                    v19 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi8(v17, v17), _mm_unpacklo_epi8(v18, v18)), CatEvenLanesV(_mm_unpacklo_epi8(v17, v17), _mm_unpacklo_epi8(v18, v18))));
                    v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(~__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v19, v13)));
                    *(node - 6) = v21;
                    *(node - 4) = *(char *)((void*)&v21 + 1);
                    *(node - 2) = *(char *)((void*)&v21 + 2);
                    *node = *(char *)((void*)&v21 + 3);
                    node[2] = *(char *)((void*)&v21 + 4);
                    node[4] = *(char *)((void*)&v21 + 5);
                    node[6] = *(char *)((void*)&v21 + 6);
                    node[8] = *(char *)((void*)&v21 + 7);
                    node += 16;
                    v23 = arm64g_calculate_condition(18, v14, 8, 0);
                    v14 += 8;
                } while (v23 & 1);
                iter += v10 * 2;
            }
            else
            {
                i = 16;
                if (v2 & 15)
                    i = v2 & 15;
                v4 = v2 - i;
                v6 = *(char *)a1;
                iter2 = iter + 15;
                v8 = v2;
                do
                {
                    v9 = ~_mm_cmpeq_epi8(CatEvenLanesV(*(int128_t *)&iter2[1], *(int128_t *)(iter2 - 15)), CONCAT(v6 | v6 * 0x100 | (v6 | v6 * 0x100) * 0x10000 | (v6 | v6 * 0x100 | (v6 | v6 * 0x100) * 0x10000) * 0x100000000, v6 | v6 * 0x100 | (v6 | v6 * 0x100) * 0x10000 | (v6 | v6 * 0x100 | (v6 | v6 * 0x100) * 0x10000) * 0x100000000));
                    *(iter2 - 14) = *(char *)&v9;
                    *(iter2 - 12) = *(char *)((void*)&v9 + 1);
                    *(iter2 - 10) = *(char *)((void*)&v9 + 2);
                    *(iter2 - 8) = *(char *)((void*)&v9 + 3);
                    *(iter2 - 6) = *(char *)((void*)&v9 + 4);
                    *(iter2 - 4) = *(char *)((void*)&v9 + 5);
                    *(iter2 - 2) = *(char *)((void*)&v9 + 6);
                    *iter2 = *(char *)((void*)&v9 + 7);
                    iter2[2] = *(char *)((void*)&v9 + 8);
                    iter2[4] = *(char *)((void*)&v9 + 9);
                    iter2[6] = *(char *)((void*)&v9 + 10);
                    iter2[8] = *(char *)((void*)&v9 + 11);
                    iter2[10] = *(char *)((void*)&v9 + 12);
                    iter2[12] = *(char *)((void*)&v9 + 13);
                    iter2[14] = *(char *)((void*)&v9 + 14);
                    iter2[16] = *(char *)((void*)&v9 + 15);
                    v8 -= 16;
                    iter2 += 32;
                } while (i != v8);
                if (9 <= i)
                    goto LABEL_3d4f94;
                iter += v4 * 2;
                v10 = v4;
            }
            v24 = (unsigned int)(v2 - v10);
            do
            {
                v25 = v24;
                if (*(char *)iter == *(char *)a1)
                    v26 = 0;
                else
                    v26 = 0xff;
            } while ((*(char *)&iter[1] = v26, iter += 2, v24 = v25 - 1, v25 != 1));
            return;
        }
        else
        {
            return;
        }
    }
    else
    {
        if ((unsigned int)v2)
        {
            iter1 = iter + 1;
            do
            {
                v28 = v2;
                if (*(iter1 - 1) == *(char *)a1 && *iter1 == (char)a1[1] && iter1[1] == (char)a1[2])
                    iter1[2] = 0;
            } while ((iter1 += 4, v2 = (unsigned int)v28 - 1, (unsigned int)v28 != 1));
            return;
        }
        else
        {
            return;
        }
    }
}
