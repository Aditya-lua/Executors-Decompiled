/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7778..0x1f7cd8 (1376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7778_2 {
    char padding_0[136];
    unsigned int field_88;
    char padding_8c[8];
    unsigned int field_94;
} st_1f7778_2;

typedef struct st_1f7778_3 {
    char padding_0[12];
    unsigned int field_c;
} st_1f7778_3;

typedef struct st_1f7778_1 {
    char padding_0[8];
    unsigned int field_8;
    unsigned int field_c;
    char padding_10[56];
    char field_48;
    char padding_49[7];
    long long field_50;
} st_1f7778_1;

typedef struct st_1f7778_0 {
    char field_0;
} st_1f7778_0;

extern unsigned long long g_e77d68;

unsigned long long sub_1f7778(st_1f7778_2 *a0, st_1f7778_3 **a1, long long a2, unsigned int **a3, unsigned int *a4, st_1f7778_1 *a5)
{
    unsigned int *v13;  // x10
    unsigned long v14;  // x26
    long long v23;  // x25
    unsigned int v24;  // w8
    unsigned long long v27;  // x0
    unsigned int *v28;  // x8
    unsigned int v29;  // w9
    unsigned long long v30;  // x10
    unsigned long long v31;  // x9
    unsigned int *v15;  // x8
    unsigned int *v16;  // x8
    unsigned int v17;  // w6
    unsigned long long v18;  // x10
    unsigned long long v19;  // x11
    unsigned int v20;  // w8
    unsigned long long v21;  // 4118
    unsigned int v22;  // w9
    st_1f7778_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_1f7778_0 *v1;  // [bp-0x98]
    char v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x88]
    unsigned int v4;  // [bp-0x78], Other Possible Types: unsigned long
    double v5;  // [bp-0x78]
    unsigned int v6;  // [bp-0x74]
    uint128_t v7;  // [bp-0x70], Other Possible Types: unsigned int
    unsigned long long v8;  // [bp-0x68]
    unsigned long long v9;  // [bp-0x60], Other Possible Types: uint128_t
    unsigned long long v10;  // [bp-0x58]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v1 = &v0;
    v0 = &v1;
    v13 = *a3;
    if (v13 != a4)
    {
        v14 = a5->field_8;
        v4 = 9;
        v7 = 0x10000000100000001;
        v9 = 1;
        if (*v13 == 63)
        {
            v15 = v13 + 1;
            *a3 = v15;
            if (v15 != a4)
            {
                v6 = *v15;
                if (v6 != 60)
                {
                    v8 = 0;
                    v17 = v6;
LABEL_1f78d0:
                    v18 = 464;
                    if (v17 == 33)
                        v18 = 0x88;
                    if (v17 == 61)
                        v18 = 440;
                    v19 = 16;
                    if (v17 != 58)
                        v19 = v18;
                    goto *((void *)(*(long long *)((char *)&g_e77d68 + v19)));
                }
                v16 = v13 + 2;
                *a3 = v16;
                if (v16 != a4)
                {
                    v17 = *v16;
                    v6 = v17;
                    if (v17 == 33 || v17 == 61)
                        goto LABEL_1f78d0;
                    sub_1fac4c(a0, a3, a4, a5);
                    if (v3)
                    {
                        if (sub_1f3848(a0 + 1, &v2, a0->field_88, &a5->field_48) & 1)
                        {
                            sub_1eccac(&v2);
LABEL_1f7884:
                            v20 = a0->field_88;
                            v21 = arm64g_calculate_condition(1, v20, 1, 0);
                            if (v21 & 1)
                            {
                                *(unsigned long long *)&a0->padding_0[8] = 0;
                                a0->field_94 = a0->field_94 | 0x6f000000;
                                return 0;
                            }
                            v22 = v20 + 1;
                            a0->field_88 = v22;
                            v9 = 0x10000000000000002;
                            v4 = _INSERT(CONCAT(v4, 0), 4, v20);
                            v7 = v22;
                            sub_1f42b0(a1, &v4);
                            v5 = (double)_INSERT(v4, 0, 10);
                            v9 = 0;
                            v10 = 0;
                            goto LABEL_1f7a9c;
                        }
                        else
                        {
                            *(unsigned long long *)&a0->padding_0[8] = 0;
                            a0->field_94 = a0->field_94 | 0x67000000;
                        }
                    }
                    sub_1eccac(&v2);
                    return 0;
                }
            }
        }
        else
        {
            if (!(v14 >> 2 & 1))
                goto LABEL_1f7884;
            v5 = 1.230757558775e-312;
            v7 = a0->field_88;
LABEL_1f7a9c:
            sub_1f42b0(a1, &v5);
            v23 = a5->field_50;
            v24 = a5->field_c + 1;
            a5->field_c = v24;
            if (v24 >= 0x101)
            {
                *(unsigned long long *)&a0->padding_0[8] = 0;
                a0->field_94 = a0->field_94 | 0x6f000000;
                return 0;
            }
            v27 = sub_1f0934(a0, a1, a2, a3, a4, a5);
            if (!(unsigned int)v27)
                return v27;
            v28 = *a3;
            if (v28 != a4)
            {
                a5->field_c = a5->field_c - 1;
                *a3 = v28 + 1;
                sub_1fb614(&a5->field_48, v23);
                a5->field_8 = v14;
                *a1->field_c = a0->field_88 - 1;
                v29 = *(unsigned int *)&v5;
                v30 = 32;
                if (v29 == 3)
                    v30 = 0x100;
                v31 = 392;
                if (v29 != 0x11)
                    v31 = v30;
                goto *((void *)(*(long long *)((char *)&g_e77d68 + v31)));
            }
        }
    }
    *(unsigned long long *)&a0->padding_0[8] = 0;
    a0->field_94 = a0->field_94 | 0x69000000;
    return 0;
}
