/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fcde8..0x1fd06c (644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fcde8_1 {
    struct st_1fcde8_2 *field_0;
    unsigned int field_8;
    char padding_c[12];
    struct st_1fcde8_2 *field_18;
} st_1fcde8_1;

typedef struct st_1fcde8_2 {
    unsigned int field_0;
} st_1fcde8_2;

typedef struct st_1fcde8_0 {
    char field_0;
} st_1fcde8_0;

extern unsigned int g_fffffffffffffff8;

long long sub_1fcde8(void* *a0, st_1fcde8_1 *a1)
{
    unsigned long long v8;  // x22
    unsigned long long j;  // x21
    unsigned long long index;  // x10
    unsigned long v19;  // x27
    unsigned long node;  // x10
    unsigned long long k;  // x11
    unsigned long long v22;  // x11
    uint128_t *v23;  // x12
    uint128_t v24;  // q1
    void* v26;  // x8
    unsigned long long idx;  // x9
    unsigned long idx1;  // x23
    uint128_t *iter;  // x9
    unsigned long long l;  // x10
    unsigned long long v30;  // x10
    __m128i v31;  // q1
    unsigned int i;  // w24
    unsigned long iter1;  // x28
    unsigned long long v13;  // x25
    unsigned long long v14;  // x26
    unsigned int v15;  // w0
    unsigned int *v16;  // x8
    unsigned long long v17;  // 4115
    __m128i v0;  // [bp-0xa0]
    st_1fcde8_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_1fcde8_0 *v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x78]
    unsigned long long v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v2 = &v1;
    v3 = 0;
    v1 = &v2;
    v4 = 0;
    v5 = 0;
    sub_1ebd3c(a0 + 6, &a1[1].padding_c[4]);
    if (sub_1eca80(a1) && !(sub_1eca80(a0) & 1))
        sub_1ebcb0(a0);
    if (a1->field_8 >= 3)
    {
        v8 = 0;
        j = 2;
        do
        {
            v8 += 1;
            idx1 = j - 1;
            i = *(int *)&a1->field_0[idx1];
            iter1 = *(int *)&a1->field_0[j];
            if ((unsigned int)iter1 != i)
            {
                sub_1f7538(a0, j);
                sub_1fb614(&v3, j);
                if (i > (unsigned int)iter1)
                {
                    v13 = j & &g_fffffffffffffff8;
                    v14 = j & 0x7ffffffffffffff8;
                    v0 = (__m128i)(CONCAT(j & 0xffffffff | (j & 0xffffffff) * 0x100000000, j & 0xffffffff | (j & 0xffffffff) * 0x100000000));
                    do
                    {
                        v15 = sub_1f3f34(a0, &a1->field_18[iter1 & 0xffffffff], j);
                        if (v15 != *(int *)((char *)*a0 + 4 * idx1))
                        {
                            iter1 += j;
                            continue;
                        }
                        v16 = a1->field_18;
                        if (11 >= j)
                        {
LABEL_1fcf0c:
                            goto LABEL_1fcf10;
                        }
                        else
                        {
                            v17 = arm64g_calculate_condition(33, iter1 & 0xffffffff, v8 & 0xffffffff, 0);
                            if (v17 & 1 || v8 > 0xffffffff)
                            {
                                index = 0;
LABEL_1fcf10:
                                v19 = iter1;
                                goto LABEL_1fcf14;
                            }
                            if (v3 - (char *)&v16[iter1 & 0xffffffff] < 32)
                                goto LABEL_1fcf0c;
                            v19 = iter1 + v14;
                            node = v3 + 16;
                            k = v13;
                            do
                            {
                                v22 = k;
                                v23 = &v16[iter1 & 0xffffffff];
                                v24 = v23[1];
                                *(uint128_t *)(node - 16) = *v23;
                                *(uint128_t *)node = v24;
                                node += 32;
                                iter1 = (unsigned int)iter1 + 8;
                                k = v22 - 8;
                            } while (k);
                            index = v14;
                            if (j == v14)
                                goto LABEL_1fcf2c;
                            do
                            {
LABEL_1fcf14:
                                *(unsigned int *)(v3 + index * 4) = v16[v19 & 0xffffffff];
                                index += 1;
                                v19 = (unsigned int)v19 + 1;
                            } while (j != index);
LABEL_1fcf2c:
                            iter1 = v19;
                            sub_1ee86c(a0 + 3, v15, &v3);
                            v26 = *a0;
                            if (8 > j)
                            {
                                idx = 0;
                            }
                            else
                            {
                                iter = v26 + 16;
                                l = v13;
                                do
                                {
                                    v30 = l;
                                    v31 = *iter;
                                    *(uint128_t *)((char *)iter - 16) = _mm_add_epi32(*(int128_t *)((char *)iter - 16), v0);
                                    *iter = _mm_add_epi32(v31, v0);
                                    iter += 2;
                                    l = v30 - 8;
                                } while (l);
                                idx = v14;
                                if (j == v14)
                                    continue;
                            }
                            do
                            {
                                *(unsigned int *)((char *)v26 + 4 * idx) = *(int *)((char *)v26 + 4 * idx) + (unsigned int)j;
                                idx += 1;
                            } while (j != idx);
                        }
                    } while (i > (unsigned int)iter1);
                }
            }
        } while ((j += 1, a1->field_8 > j));
    }
    sub_1f2420(a0);
    return sub_1eccac(&v3);
}
