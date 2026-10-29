/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f9fa0..0x1fa300 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f9fa0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[120];
    unsigned int field_88;
    char padding_8c[8];
    unsigned int field_94;
} st_1f9fa0_1;

typedef struct st_1f9fa0_0 {
    char field_0;
} st_1f9fa0_0;

extern unsigned long long g_e778e8;
extern unsigned long long g_e778f8;
extern unsigned long long g_e779c0;

char sub_1f9fa0(st_1f9fa0_1 *a0, long long a1)
{
    unsigned long v14;  // x22
    char v15;  // x25
    unsigned long v24;  // x21
    char v25;  // w27
    unsigned long v26;  // x8
    unsigned long v27;  // x8
    __m128i v28;  // q0
    unsigned long v29;  // x8
    char v30;  // x9
    unsigned long long *v31;  // x8
    void* v16;  // x28
    unsigned long long v17;  // x8
    unsigned long long v18;  // 4110
    unsigned int *v19;  // x26
    unsigned int *v20;  // x21
    unsigned long long v21;  // x0
    unsigned long long v22;  // x0
    unsigned long long v23;  // x1
    char v0;  // [bp-0xe0]
    st_1f9fa0_0 **v1;  // [bp-0xd0], Other Possible Types: char
    st_1f9fa0_0 *v2;  // [bp-0xc8]
    uint128_t v3;  // [bp-0xc0], Other Possible Types: unsigned long
    unsigned int v4;  // [bp-0xbc]
    unsigned long long v5;  // [bp-0xb8]
    uint128_t v6;  // [bp-0xb0]
    unsigned long v7;  // [bp-0xa0]
    char v8;  // [bp-0x90]
    char v9;  // [bp-0x88]
    char v10;  // [bp-0x80]
    char *v11;  // [bp-0x78], Other Possible Types: char
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v2 = &v1;
    v1 = &v2;
    v14 = a0->field_8;
    sub_1ecbe0(&v11, a0->field_88);
    v8 = 0;
    v9 = 0;
    v10 = 0;
    sub_1f2330(&v11);
    if (v14 >= 2)
    {
        v0 = 1;
        v15 = 1;
        do
        {
            v16 = a0->field_0 + 40 * v15;
            if (*(int *)v16 != 15)
            {
                if (*(int *)v16 == 11)
                    v11[(int)v16[4]] = 1;
            }
            else
            {
                if (!((char)((char)v16[20]) >> 1 & 1))
                {
                    v17 = (int)v16[4];
                    if (a0->field_88 <= (unsigned int)v17)
                    {
                        a0->field_8 = 0;
                        a0->field_94 = a0->field_94 | 0x67000000;
                        sub_1eccac(&v8);
                        sub_1eccac(&v11);
                        return 0;
                    }
                    else if (!v11[v17])
                    {
                        v18 = arm64g_calculate_condition(18, (long long)v16[24], 1, 0);
                        if (!(v18 & 1))
                        {
                            v19 = a0->field_0 + 40 * v15;
                            v20 = (char *)v19 - 40;
                            if (sub_1ee7f4(v20))
                            {
                                v21 = sub_1eca64(v20);
                                *(unsigned long long *)&v16[24] = (long long)v16[24] + v21;
                                *(uint128_t *)((char *)v19 - 16) = v0;
                                *(unsigned int *)((char *)v19 - 36) = 92;
                            }
                        }
                        *(unsigned long long *)v16 = 395136991235;
                        *(unsigned long long *)&v16[32] = 0;
                    }
                }
                else
                {
                    v22 = sub_1ef16c(a1 + 24);
                    if (v22 < (int)v16[4])
                    {
                        a0->field_8 = 0;
                        a0->field_94 = a0->field_94 | 0x67000000;
                        sub_1eccac(&v8);
                        sub_1eccac(&v11);
                        return 0;
                    }
                    *(unsigned int *)&v16[20] = (int)v16[20] & 0xfffffffd;
                    v23 = (int)v16[4];
                    v3 = sub_1f4104(a1 + 24, v23);
                    v5 = v23;
                    v24 = sub_1fab7c(a0 + 1, &v3);
                    if (v24 && *(int *)v24)
                    {
                        v7 = (long long)v16[32];
                        v3 = *(int128_t *)v16;
                        v6 = (int128_t)v16[16];
                        v25 = 1;
                        do
                        {
                            v26 = *(int *)(v24 + v25 * 4);
                            if (*(char *)(v11 + v26))
                            {
                                v4 = v26;
                                sub_1f42b0(&v8, &v3);
                            }
                        } while ((v25 += 1, (unsigned int)*(int *)v24 >= v25));
                        if (v9)
                        {
                            *(int *)&v16[4] = *(int *)(v8 + 4);
                            sub_1f9ba8(&v8, 0);
                            if (v9)
                            {
                                v27 = a0->field_8;
                                *(unsigned int *)&v16[20] = (int)v16[20] | 4;
                                v28 = (int128_t)v16[24];
                                *(unsigned long *)&v16[24] = v27 - v15;
                                *(unsigned long long *)&v16[32] = a0->field_8 - v15;
                                v29 = a0->field_8 + v9;
                                v30 = v8 + 40 * v9;
                                *(unsigned int *)(v30 - 20) = *(int *)(v30 - 20) | 8;
                                *(__m128i *)(v30 - 16) = _mm_add_epi64(_mm_unpacklo_epi64(_mm_add_epi64(__double_as_longlong(__longlong_as_double(1 - v29)), __double_as_longlong(__longlong_as_double(v15))), _mm_add_epi64(__double_as_longlong(__longlong_as_double(1 - v29)), __double_as_longlong(__longlong_as_double(v15)))), v28);
                                sub_1ecb68(a0, &v8);
                                v9 = 0;
                            }
                        }
                        v31 = &g_e779c0;
                        if (v9)
                            v31 = &g_e778e8;
                        goto *((void *)(*v31));
                    }
                    a0->field_8 = 0;
                    a0->field_94 = a0->field_94 | 0x67000000;
                    goto *((void *)(g_e778f8));
                }
            }
        } while ((v15 += 1, v15 != v14));
    }
    if (v14 != a0->field_8)
        sub_1f84e0(a0, a0);
    sub_1eccac(&v8);
    sub_1eccac(&v11);
    return 1;
}
