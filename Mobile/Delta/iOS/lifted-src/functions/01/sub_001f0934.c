/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f0934..0x1f0b68 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f0934_1 {
    char padding_0[136];
    unsigned int field_88;
} st_1f0934_1;

typedef struct st_1f0934_3 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_1f0934_3;

typedef struct st_1f0934_2 {
    unsigned int field_0;
} st_1f0934_2;

typedef struct st_1f0934_4 {
    char padding_0[4];
    unsigned int field_4;
} st_1f0934_4;

typedef struct st_1f0934_0 {
    char field_0;
} st_1f0934_0;


unsigned long long sub_1f0934(st_1f0934_1 *a0, st_1f0934_3 *a1, void* a2, st_1f0934_2 **a3, unsigned int *a4, unsigned long long *a5)
{
    unsigned long long v11;  // x27
    unsigned long long v12;  // x28
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned int *v13;  // x25
    unsigned int v26;  // w9
    unsigned long long v14;  // x0
    unsigned int *v27;  // x8
    unsigned int v15;  // w10
    st_1f0934_4 *v28;  // x8
    unsigned int v16;  // w8
    unsigned int v17;  // w9
    st_1f0934_0 **v0;  // [bp-0xc8], Other Possible Types: char
    st_1f0934_0 *v1;  // [bp-0xc0]
    char v2;  // [bp-0xb4]
    unsigned int v3;  // [bp-0xb0]
    unsigned long long idx;  // [bp-0xa8]
    unsigned long long v5;  // [bp-0xa0]
    unsigned long long v6;  // [bp-0x98]
    uint320_t v7;  // [bp-0x90]
    unsigned int v8;  // [bp-0x64]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = 0;
    v12 = 0;
    v1 = &v0;
    v0 = &v1;
    v13 = &a0->field_88;
    v8 = a0->field_88;
    idx = 0;
    v5 = 0;
    v6 = 0;
    *(unsigned long *)a2 = 0xffffffff;
    *(unsigned int *)&a2[8] = 0;
    *(double *)&v7 = 2.63127478081e-312;
    *(uint128_t *)((char *)&v7 + 24) = 1;
    *(uint128_t *)((char *)&v7 + 8) = 0x10000000100000001;
    while (1)
    {
        v5 = 0;
        v14 = sub_1f25ec(a0, &idx, &v2, a3, a4, a5);
        if (!(v14 & 1))
            break;
        v15 = *(int *)a2;
        v16 = (int)a2[4];
        v17 = v2;
        if (v15 <= v16)
        {
            v19 = arm64g_calculate_condition(v21 | 144, v22, v23, v18);
            v20 = arm64g_calculate_condition(131, (v19 & 1 ? v15 : 0x20000000), (v19 & 1 ? v17 : 0), 0);
            if (v20 & 1)
                goto LABEL_1f0a20;
            goto LABEL_1f0a04;
        }
        else
        {
            v24 = arm64g_calculate_condition(v21 | 144, v22, v23, v18);
            v25 = arm64g_calculate_condition(128, (v24 & 1 ? v15 : 0x20000000), (v24 & 1 ? v17 : 0), 0);
            if (!(v25 & 1))
            {
LABEL_1f0a04:
                v26 = v3;
                if (v16 < v26)
                    goto LABEL_1f0a30;
                goto LABEL_1f0a10;
            }
            else
            {
LABEL_1f0a20:
                *(unsigned int *)a2 = v17;
                v26 = v3;
                if (v26 <= v16)
                {
LABEL_1f0a10:
                    v27 = *a3;
                    if (v27 == a4)
                        goto LABEL_1f0abc;
                    goto LABEL_1f0a40;
                }
                else
                {
LABEL_1f0a30:
                    *(unsigned int *)&a2[4] = v26;
                    v27 = *a3;
                    if (v27 == a4)
                        goto LABEL_1f0abc;
LABEL_1f0a40:
                    if (*v27 == 124)
                    {
                        *(unsigned long long *)((char *)&v7 + 32) = v5 + 2;
                        sub_1f2e20(&idx, 0, 1);
                        *(unsigned long long *)(idx + 32) = *(unsigned long long *)((void*)&v7 + 32);
                        *(uint128_t *)idx = *(uint128_t *)&v7;
                        *(uint128_t *)(idx + 16) = *(uint128_t *)((void*)&v7 + 16);
                        if (v8 != *v13)
                        {
                            if (v11 & 1)
                            {
                                *(unsigned int *)(a5[9] + a5[10] * 4 - 4) = *v13;
                            }
                            else
                            {
                                sub_1f8478(a5 + 9, &v8);
                                sub_1f8478(a5 + 9, v13);
                            }
                            v11 = 1;
                        }
                    }
LABEL_1f0abc:
                    if (v12)
                    {
                        v28 = a1->field_0 + 40 * v12;
                        *(unsigned long long *)&v28[3] = v5 + 1;
                        v28->field_4 = 47;
                    }
                    sub_1ecb68(a1, &idx);
                    if (*a3 == a4 || *(int *)*a3 == 41)
                        break;
                    v12 = a1->field_8;
                    *(unsigned long long *)((char *)&v7 + 32) = 0;
                    sub_1f42b0(a1, &v7);
                    *a3 = *a3 + 1;
                }
            }
        }
    }
    sub_1eccac(&idx);
    return v14;
}
