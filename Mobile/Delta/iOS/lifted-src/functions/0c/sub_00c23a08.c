/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc23a08..0xc23e9c (1172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c23a08_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    void* field_10;
} st_c23a08_2;

typedef struct st_c23a08_1 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_c23a08_1;

typedef struct st_c23a08_0 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_c23a08_0;

typedef struct st_c23a08_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    void* field_40;
} st_c23a08_3;

extern long long g_efbbf0;
extern long long g_efbc08;
extern long long g_efbc20;
extern long long g_efbc38;

void* sub_c23a08(unsigned long long *a0, long long a1, long long a2, unsigned long long a3, void* a4)
{
    unsigned long long v16;  // x24
    st_c23a08_1 *v17;  // x10
    unsigned long long v26;  // x8
    st_c23a08_2 *v27;  // x8
    void* v28;  // x24
    void* ptr;  // x0
    st_c23a08_3 *v30;  // x23
    void* *v31;  // x24
    unsigned long long v32;  // 4102
    void* ptr1;  // x0
    void* ptr2;  // x0
    void* j;  // x24
    unsigned int v18;  // w10
    long long v38;  // x0
    st_c23a08_0 *v19;  // x9
    unsigned long long v20;  // x9
    void* iter;  // x10
    unsigned long long v22;  // x12
    unsigned long long i;  // x13
    unsigned int *v24;  // x15
    unsigned long long v25;  // 4127
    void* v0;  // [bp-0x118], Other Possible Types: char
    unsigned int *v1;  // [bp-0x110]
    void* v2;  // [bp-0x108]
    unsigned long v3;  // [bp-0x100]
    unsigned long long v4;  // [bp-0xf8]
    unsigned int v5;  // [bp-0xf0]
    unsigned long long v6;  // [bp-0xec]
    uint128_t v7;  // [bp-0xe0]
    unsigned long long v8;  // [bp-0xd0]
    uint248_t v9;  // [bp-0xc0]
    void* v10;  // [bp-0xa0], Other Possible Types: uint384_t, char
    void* v11;  // [bp-0x98]
    void* v12;  // [bp-0x90], Other Possible Types: unsigned long long
    uint128_t v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a2 & 0xffffffff;
    if (a0[5] <= v16 || (v17 = a0[4] + v16 * 32, v17->field_0 == 0x8000000000000000))
        v18 = 0xffffffff;
    else
        v18 = v17->field_18;
    v3 = a0[7];
    v4 = a0[8];
    v5 = v18;
    v6 = 0xffffffffffffffff;
    sub_c27e78(&v0, &v3);
    if (1 >= v2)
    {
        if (a0[5] <= v16 || (v19 = a0[4] + v16 * 32, v19->field_0 == 0x8000000000000000))
            v20 = 0xffffffff;
        else
            v20 = v19->field_1c;
        iter = 0;
        v22 = a0[8];
        i = 0xffffffff;
        if (0xffffffff < v22)
            goto LABEL_c23b0c;
        while (1)
        {
            do
            {
                if (v22 <= v20)
                {
                    if (iter == 1 && (!v2 || *v1 == (unsigned int)a3))
                    {
                        sub_bd8578(&v10, a0, a2);
                        if (*(unsigned long long *)&v10 == 0x8000000000000000)
                        {
                            sub_c73c64(&g_efbbf0);
                            __debugbreak();
                        }
                        v7 = v10;
                        v8 = v12;
                        v26 = a1 & 0xffffffff;
                        if (a0[5] <= v26 || (v27 = a0[4] + v26 * 32, v27->field_0 == 0x8000000000000000))
                        {
                            v38 = &g_efbc08;
                        }
                        else if (v27->field_10)
                        {
                            v28 = v27->field_8 + 264 * v27->field_10;
                            if (*(long long *)((char *)v28 - 240) == 16)
                            {
                                *(uint128_t *)((char *)&v9 + 7) = v7;
                                *(unsigned long long *)((char *)&v9 + 23) = v8;
                                v10 = _INSERT(CONCAT(v10, 0), 0, 1);
                                *((char *)&v10 + 8) = 0;
                                *(uint128_t *)((char *)&v10 + 9) = *(uint128_t *)&v9;
                                *(uint128_t *)((char *)&v10 + 24) = *(uint128_t *)((void*)&v9 + 15);
                                ptr = _malloc(40);
                                if (!ptr)
                                {
                                    sub_c6ba70(8, 40);
                                    __debugbreak();
                                }
                                v30 = v28 - 232;
                                *(uint128_t *)ptr = *(uint128_t *)&v10;
                                *(uint128_t *)&ptr[16] = *(uint128_t *)((void*)&v10 + 16);
                                *(unsigned long long *)&ptr[32] = *(unsigned long long *)((void*)&v10 + 32);
                                v31 = v28 - 168;
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                v32 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                if (!(v32 & 1))
                                {
                                    /* unsupported instruction */;
                                    sub_b869ec(v31);
                                }
                                *v31 = ptr;
                                if (a4)
                                {
                                    sub_c234c4(&v10, v30);
                                    ptr1 = _malloc(64);
                                    if (!ptr1)
                                    {
                                        sub_c6ba70(8, 64);
                                        __debugbreak();
                                    }
                                    *(uint128_t *)ptr1 = *(uint128_t *)&v10;
                                    *(uint128_t *)&ptr1[16] = *(uint128_t *)((void*)&v10 + 16);
                                    *(uint128_t *)&ptr1[32] = *(uint128_t *)((void*)&v10 + 32);
                                    *(uint128_t *)&ptr1[48] = v13;
                                    sub_b7fa90(&v10, ptr1, 0);
                                    sub_c172f8(v30);
                                    v30->field_0 = *(uint128_t *)&v10;
                                    v30->field_10 = *(uint128_t *)((void*)&v10 + 16);
                                    v30->field_20 = *(uint128_t *)((void*)&v10 + 32);
                                    v30->field_30 = v13;
                                }
                                ptr2 = _malloc(40);
                                if (ptr2)
                                {
                                    *(unsigned int *)ptr2 = a3;
                                    *(unsigned long long *)&ptr2[8] = 0;
                                    *(unsigned long long *)&ptr2[16] = 8;
                                    *(unsigned long long *)&ptr2[24] = 0;
                                    *(char *)&ptr2[32] = 0;
                                    v10 = 1;
                                    v11 = ptr2;
                                    v12 = 1;
                                    sub_bd9184(&v9, a0, a1, &v10);
                                    for (j = *(unsigned long long *)((void*)&v9 + 16) + 1; j != 1; j -= 1)
                                    {
                                        sub_c2a8d0();
                                    }
                                    if (*(unsigned long long *)&v9)
                                        _free(*(unsigned long long *)((void*)&v9 + 8));
                                    sub_c22470(a0, a1, 1, a3);
                                    if (!v0)
                                        return 1;
                                    _free(v1);
                                    return 1;
                                }
                                sub_c6ba70(8, 40);
                                __debugbreak();
                            }
                            else
                            {
                                v38 = &g_efbc38;
                            }
                        }
                        else
                        {
                            v38 = &g_efbc20;
                        }
                        sub_c73c64(v38);
                        __debugbreak();
                    }
                    goto LABEL_c23d00;
                }
            } while ((v24 = a0[7] + 48 * v20, v20 = v24[9], v25 = arm64g_calculate_condition(1, v24[10], 1, 0), v25 & 1 || (iter += 1, v22 <= i)));
            do
            {
LABEL_c23b0c:
                i = *(int *)(a0[7] + 48 * i + 32);
                iter += 1;
            } while (i < v22);
        }
    }
LABEL_c23d00:
    if (!v0)
        return 0;
    _free(v1);
    return 0;
}
