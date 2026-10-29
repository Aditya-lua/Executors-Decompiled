/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ec1a0..0x1ec70c (1388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ec1a0_3 {
    char padding_0[140];
    unsigned int field_8c;
    unsigned int field_90;
    unsigned int field_94;
} st_1ec1a0_3;

typedef struct st_1ec1a0_1 {
    void* field_0;
    unsigned long long field_8;
} st_1ec1a0_1;

typedef struct st_1ec1a0_2 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
} st_1ec1a0_2;

typedef struct st_1ec1a0_0 {
    char field_0;
} st_1ec1a0_0;


char sub_1ec1a0(st_1ec1a0_3 *a0, long long a1, st_1ec1a0_1 *a2, void* a3, unsigned long a4)
{
    void* v7;  // x24
    char v8;  // w0
    unsigned long v17;  // x8
    unsigned long long v18;  // x9
    unsigned int v19;  // w9
    unsigned long long v20;  // x8
    unsigned long v21;  // x8
    unsigned int v22;  // w8
    unsigned long long v23;  // 4145
    unsigned long long v24;  // 4139
    void* v25;  // x8
    void* v26;  // x8
    unsigned int v9;  // w8
    unsigned int v27;  // w23
    unsigned long long v28;  // 4118
    char j;  // w22
    unsigned int v30;  // w8
    unsigned long long v31;  // 4118
    void* v32;  // x8
    void* v33;  // x8
    unsigned long v34;  // x8
    unsigned long v35;  // x22
    st_1ec1a0_2 *v36;  // x9
    unsigned long v10;  // x9
    unsigned long v37;  // x8
    void* v11;  // x8
    unsigned long v12;  // x9
    unsigned long v13;  // x22
    char i;  // w23
    char v15;  // w10
    unsigned long v16;  // x23
    st_1ec1a0_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_1ec1a0_0 *v1;  // [bp-0x90]
    uint320_t v2;  // [bp-0x88], Other Possible Types: unsigned int
    unsigned int v3;  // [bp-0x84]
    uint128_t v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    if (!(int)a3[4])
        return 1;
    v7 = a2->field_0;
    v8 = sub_1fd084(v7);
    if (v8)
        v9 = 42;
    else
        v9 = 64;
    *(unsigned int *)&v2 = 3;
    *(unsigned int *)((char *)&v2 + 4) = v9;
    *(uint128_t *)((char *)&v2 + 24) = 1;
    *(long long *)((char *)&v2 + 8) = *(long long *)a3;
    *(int *)((char *)&v2 + 16) = (int)a3[8];
    *(unsigned int *)((char *)&v2 + 20) = 0;
    if ((int)a3[4] == 1)
    {
        if (!*(int *)a3)
        {
            v10 = a2->field_8 + 1;
            *(unsigned long *)((char *)&v2 + 32) = v10;
            if (!(int)a3[8])
            {
                *(unsigned long *)((char *)&v2 + 24) = v10;
                *(unsigned long long *)((char *)&v2 + 32) = 1;
            }
            v11 = a2->field_0 + 40 * a2->field_8;
            v12 = *(long long *)a3;
            *(int *)((char *)v11 - 24) = (int)a3[8];
            *(unsigned long *)((char *)v11 - 32) = v12;
            sub_1f42b0(a1, &v2);
        }
        if (*(int *)v7 == 9)
        {
            *(unsigned int *)&a2->field_0[52] = 0;
            *(unsigned int *)&v7[12] = 0;
        }
        sub_1ecb68(a1, a2);
    }
    else if (v8 && sub_1f106c(a3))
    {
        v13 = a2->field_8 + 1;
        if (*(int *)a3)
        {
            i = 0;
            do
            {
                sub_1ecb68(a1, a2);
                i += 1;
            } while (i < (unsigned int)*(int *)a3);
        }
        v15 = (int)a3[8];
        *(double *)&v7[8] = 2.121995791e-314;
        *(unsigned int *)&v7[16] = v15;
        v16 = *(int *)a3;
        v17 = (int)a3[4];
        v18 = (v17 - v16) * v13;
        *(unsigned long long *)((char *)&v2 + 32) = v18;
        if (!v15)
        {
            *(unsigned long long *)((char *)&v2 + 24) = v18;
            *(unsigned long long *)((char *)&v2 + 32) = 1;
        }
        if ((unsigned int)v17 > (unsigned int)v16)
        {
            do
            {
                sub_1f42b0(a1, &v2);
                sub_1ecb68(a1, a2);
                v19 = (int)a3[4];
                if (!(int)a3[8])
                    v20 = 24;
                else
                    v20 = 32;
            } while ((*(unsigned long *)((char *)&v2 + v20) = *(long long *)((char *)&v2 + v20) - v13, v16 = (unsigned int)v16 + 1, (unsigned int)v16 < v19));
        }
    }
    else
    {
        if (*(int *)v7 != 15 || !((char)((char)v7[20]) >> 1 & 1))
        {
            if (!sub_1fa8d0(v7) || *(int *)a4 && (unsigned int)(int)v7[12] < (unsigned int)(int)v7[8])
                goto LABEL_1ec4d0;
            *(int *)((char *)&v2 + 16) = (int)v7[16];
            *(long long *)((char *)&v2 + 8) = (long long)v7[8];
            v22 = a0->field_90;
            v24 = arm64g_calculate_condition(0x11, v22, 1, 0);
            if (!(v24 & 1))
            {
                *(unsigned long long *)&a0->padding_0[8] = 0;
                a0->field_94 = a0->field_94 | 0x6f000000;
                return 0;
            }
        }
        else
        {
            v21 = *(long long *)a3;
            *(int *)&v7[16] = (int)a3[8];
            *(unsigned long *)&v7[8] = v21;
            *(double *)((char *)&v2 + 8) = 5e-324;
            v22 = a0->field_90;
            v23 = arm64g_calculate_condition(1, a0->field_90, 1, 0);
            if (v23 & 1)
            {
                *(unsigned long long *)&a0->padding_0[8] = 0;
                a0->field_94 = a0->field_94 | 0x6f000000;
                return 0;
            }
        }
        a0->field_90 = v22 + 1;
        *(unsigned int *)&v2 = 13;
        *(unsigned int *)((char *)&v2 + 4) = v22;
        *(unsigned long long *)((char *)&v2 + 24) = 0;
        *(unsigned long long *)((char *)&v2 + 32) = 0;
        sub_1f2e20(a2, 0, 1);
        v25 = a2->field_0;
        *(unsigned long long *)&v25[32] = *(unsigned long long *)((void*)&v2 + 32);
        *(uint128_t *)v25 = *(uint128_t *)&v2;
        *(uint128_t *)&v25[16] = *(uint128_t *)((void*)&v2 + 16);
        *(unsigned int *)&v2 = 12;
        *(uint128_t *)((char *)&v2 + 24) = 0x10000000000000002;
        sub_1f2e20(a2, 0, 1);
        v26 = a2->field_0;
        *(unsigned long long *)&v26[32] = *(unsigned long long *)((void*)&v2 + 32);
        *(uint128_t *)v26 = *(uint128_t *)&v2;
        *(uint128_t *)&v26[16] = *(uint128_t *)((void*)&v2 + 16);
        *(long long *)((char *)&v2 + 8) = *(long long *)a3;
        *(int *)((char *)&v2 + 16) = (int)a3[8];
        *(unsigned int *)&v2 = 14;
        *(unsigned long long *)((char *)&v2 + 32) = 1;
        sub_1f42b0(a2, &v2);
        if (*(int *)a4 || (int)a2->field_0[80] == 15)
        {
            *(unsigned int *)((char *)&v2 + 4) = 64;
LABEL_1ec4d0:
            *(unsigned int *)&v2 = 3;
            if (!(sub_1fa568(a3) & 1))
            {
                v27 = *(unsigned int *)((void*)&v2 + 4);
                if (!sub_1fab58(a3))
                {
                    if (v27 != 42 || (v28 = arm64g_calculate_condition(0x11, (int)a3[4], 1, 0), v28 & 1))
                        goto LABEL_1ec594;
                    if (6 >= (unsigned int)*(int *)a3)
                    {
                        if (*(int *)a3)
                        {
                            j = 0;
                            do
                            {
                                sub_1ecb68(a1, a2);
                                j += 1;
                            } while (j < (unsigned int)*(int *)a3);
                        }
                        *(unsigned int *)((char *)&v2 + 8) = 0;
                    }
                    else
                    {
                        *(unsigned int *)((char *)&v2 + 12) = *(unsigned int *)((void*)&v2 + 8);
                        goto LABEL_1ec594;
                    }
                }
                else if (v27 == 42)
                {
                    sub_1ecb68(a1, a2);
                    *(unsigned int *)((char *)&v2 + 8) = *(unsigned int *)((void*)&v2 + 8) - 1;
                }
                else
                {
                    *(uint128_t *)((char *)&v2 + 24) = 2;
                    v3 = 43;
                    sub_1f42b0(a1, &v2);
                    *(unsigned int *)((char *)&v2 + 4) = v27;
                }
            }
        }
        else
        {
LABEL_1ec594:
            v30 = a0->field_8c;
            v31 = arm64g_calculate_condition(1, v30, 1, 0);
            if (v31 & 1)
            {
                *(unsigned long long *)&a0->padding_0[8] = 0;
                a0->field_94 = a0->field_94 | 0x6f000000;
                return 0;
            }
            a0->field_8c = v30 + 1;
            v2 = 7;
            v2 = _INSERT(CONCAT(v2, 0), 4, v30);
            v4 = 0x10000000000000002;
            sub_1f42b0(a1, &v2);
            v2 = 8;
            v2 = _INSERT(CONCAT(v2, 0), 24, 0);
            *(unsigned long long *)((char *)&v2 + 32) = 0;
            sub_1f42b0(a1, &v2);
            *(unsigned int *)&v2 = 6;
            sub_1f2e20(a2, 0, 1);
            v32 = a2->field_0;
            *(unsigned long long *)&v32[32] = *(unsigned long long *)((void*)&v2 + 32);
            *(uint128_t *)v32 = *(uint128_t *)&v2;
            *(uint128_t *)&v32[16] = *(uint128_t *)((void*)&v2 + 16);
            *(unsigned long long *)((char *)&v2 + 24) = 2;
            *(unsigned long long *)((char *)&v2 + 32) = sub_1fd084(a2->field_0 + 40) ^ 1;
            *(unsigned int *)&v2 = 5;
            sub_1f2e20(a2, 0, 1);
            v33 = a2->field_0;
            *(unsigned long long *)&v33[32] = *(unsigned long long *)((void*)&v2 + 32);
            *(uint128_t *)v33 = *(uint128_t *)&v2;
            *(uint128_t *)&v33[16] = *(uint128_t *)((void*)&v2 + 16);
            *(unsigned int *)&v2 = 4;
        }
        while (1)
        {
            v34 = a2->field_8;
            v35 = v34 - 1;
            v36 = a2->field_0 + 40 * v35;
            v36->field_10 = *(unsigned int *)((void*)&v2 + 16);
            v36->field_8 = *(unsigned long long *)((void*)&v2 + 8);
            v36->field_18 = -v34;
            v37 = v34 + 1;
            *(unsigned long long *)((char *)&v2 + 24) = 1;
            *(unsigned long *)((char *)&v2 + 32) = v37;
            if (!(int)a3[8])
            {
                *(unsigned long *)((char *)&v2 + 24) = v37;
                *(unsigned long long *)((char *)&v2 + 32) = 1;
            }
            sub_1f42b0(a1, &v2);
            sub_1ecb68(a1, a2);
            if (*(unsigned int *)((void*)&v2 + 12) == (int)a3[4])
                break;
            *(double *)&v2 = 8.9123823222e-313;
            *(unsigned int *)((char *)&v2 + 8) = 0;
            *(int *)((char *)&v2 + 12) = (int)a3[4];
            sub_1ecae8(a2, 0, v35);
        }
    }
    return 1;
}
