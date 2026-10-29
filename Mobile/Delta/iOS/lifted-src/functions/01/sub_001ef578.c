/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ef578..0x1efb98 (1568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ef578_2 {
    char padding_0[148];
    unsigned int field_94;
} st_1ef578_2;

typedef struct st_1ef578_1 {
    char padding_0[72];
    unsigned long long field_48;
} st_1ef578_1;

typedef struct st_1ef578_0 {
    char field_0;
} st_1ef578_0;

extern unsigned long long g_e730c8;
extern unsigned long long g_e730d0;
extern unsigned long long g_e77fa0;

char sub_1ef578(st_1ef578_2 *a0, st_1ef578_1 *a1, unsigned int **a2, unsigned int *a3, void* a4)
{
    unsigned int *iter;  // x8
    unsigned long v19;  // x25
    unsigned int *v28;  // x10
    unsigned int v29;  // w9
    unsigned int *v30;  // x8
    unsigned int v31;  // w9
    unsigned int *v32;  // x8
    unsigned long long v33;  // x8
    unsigned int *v34;  // x10
    unsigned int v35;  // w10
    unsigned long long v36;  // x10
    unsigned int v37;  // w8
    unsigned long v20;  // x9
    char v21;  // w27
    unsigned int v22;  // w9
    unsigned int *v24;  // x8
    char v25;  // w9
    unsigned int *v27;  // x8
    unsigned long v0;  // [bp-0x128]
    uint128_t v1;  // [bp-0x120]
    char v2;  // [bp-0x110]
    st_1ef578_0 **v3;  // [bp-0x100], Other Possible Types: char
    st_1ef578_0 *v4;  // [bp-0xf8]
    char v5;  // [bp-0xf0]
    uint128_t v6;  // [bp-0xe8]
    char v7;  // [bp-0xd8]
    char v8;  // [bp-0xc8]
    char v9;  // [bp-0xc4]
    char v10;  // [bp-0xc0]
    char v11;  // [bp-0xb0]
    char v12;  // [bp-0xa0]
    char v13;  // [bp-0x90]
    char v14;  // [bp-0x80]
    unsigned long long v15;  // [bp-0x78]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v4 = &v3;
    v3 = &v4;
    iter = *a2;
    if (iter == a3)
    {
        *(unsigned long long *)&a0->padding_0[8] = 0;
        a0->field_94 = a0->field_94 | 0x68000000;
        return 0;
    }
    v19 = (int)a4[8];
    if (*iter == 94)
    {
        iter += 1;
        *a2 = iter;
        v20 = g_e730d0;
    }
    else
    {
        v20 = g_e730c8;
    }
    v0 = v20;
    v21 = 0;
    v14 = 0;
    v12 = 0;
    v13 = 0;
    v10 = 0;
    v11 = 0;
    v2 = 1;
    v1 = 0x10000000100000001;
    while (1)
    {
        if (iter != a3)
        {
            v22 = *iter;
            if (v22 == 93)
            {
                *a2 = iter + 1;
                goto *((void *)(v0));
            }
            if (v19 >> 7 & 1)
            {
                v34 = iter + 1;
                if (v34 != a3 && v22 == *v34 && !(v35 = v22 - 33, (63 < v22 - 33 || !(1 << ((char)(v22 - 33) & 63) & 11529215050329898557)) && v22 != 126))
                    break;
                else
                    break;
            }
            if (iter == a3)
                goto LABEL_1efaa4;
            v5 = 0;
            v7 = v2;
            v6 = v1;
            if (!(sub_1fb7dc(a0, &v10, &v5, a2, a3, a4, 0) & 1))
            {
LABEL_1efb1c:
LABEL_1efabc:
                sub_1eccac(&v13);
                sub_1eccac(&v11 + 8);
                sub_1eccac(&v10);
                return 0;
            }
            v24 = *a2;
            if (v24 == a3)
                goto LABEL_1efaa4;
            if (v21 == 1)
                v25 = 2;
            else
                v25 = v21;
            if (v21)
                v21 = v25;
            else
                v21 = 1;
            switch (*(unsigned int *)&v5)
            {
            case 2:
                if (v19 >> 7 & 1)
                    goto LABEL_1ef9a4;
                if (*v24 != 45 || (v32 = v24 + 1, v32 == a3 || *v32 == 93))
                    goto LABEL_1ef9d4;
                goto LABEL_1efb40;
            case 0:
                if (sub_1ecea4(&v10) & 1)
                    goto LABEL_1ef9a0;
                v8 = *(unsigned int *)((void*)&v5 + 4);
                v9 = v8;
                if (2 < v21 || (v27 = *a2, *v27 != 45 || (v28 = v27 + 1, v28 == a3 || (v29 = *v28, v29 == 93))))
                {
LABEL_1ef984:
                    sub_1fa300(&v13, &v8);
                    if ((char)((char)a4[8]) >> 1 & 1)
                        sub_1f0f04(&v13);
                    goto LABEL_1ef9a0;
                }
                *a2 = v28;
                if (v19 >> 7 & 1 && v21 != 2 && v29 == 45)
                {
                    *a2 = v27 + 2;
                    sub_1fa300(&a1->padding_0[48], &v8);
                    v30 = *a2;
                    if (v30 != a3)
                    {
                        v5 = 0;
                        v7 = v2;
                        v6 = v1;
                        if (*v30 == 91)
                        {
                            v31 = (int)a4[12] + 1;
                            *(unsigned int *)&a4[12] = v31;
                            if (0x100 >= v31)
                            {
                                *a2 = v30 + 1;
                                if ((unsigned int)sub_1ef578(a0, &v10, a2, a3, a4))
                                {
                                    *(int *)&a4[12] = (int)a4[12] - 1;
                                    goto LABEL_1efa5c;
                                }
                            }
                            else
                            {
                                v37 = 0x6f000000;
                                goto LABEL_1efaa8;
                            }
                            break;
                        }
                        if (!sub_1fb7dc(a0, &v10, &v5, a2, a3, a4, 0))
                            break;
LABEL_1efa5c:
                        if (*a2 != a3)
                        {
                            if (*(unsigned int *)&v5 || sub_1ecea4(&v10) & 1)
                            {
LABEL_1efa7c:
                                sub_1ec824(a1, &v10);
                                v21 = 4;
                                iter = *a2;
                                continue;
                            }
                            else
                            {
                                v8 = *(unsigned int *)((void*)&v5 + 4);
                                v9 = v8;
                                v21 = 4;
                                goto LABEL_1ef984;
                            }
                        }
                    }
                }
                else
                {
                    if (sub_1fb7dc(a0, &v10, &v5, a2, a3, a4, 1))
                    {
                        v9 = *(unsigned int *)((void*)&v5 + 4);
                        if (v9 >= v8)
                        {
                            v21 = 2;
                            goto LABEL_1ef984;
                        }
                        else
                        {
LABEL_1efb40:
                            v37 = 0x6c000000;
LABEL_1efaa8:
                            *(unsigned long long *)&a0->padding_0[8] = 0;
                            a0->field_94 = a0->field_94 | v37;
                            goto LABEL_1efabc;
                        }
                    }
                    break;
                }
                goto LABEL_1efaa4;
            default:
LABEL_1ef9a0:
                if (v19 >> 7 & 1)
                {
LABEL_1ef9a4:
                    if (v21 != 4)
                    {
                        if (v21 == 3)
                        {
                            sub_1f7f48(a1, &v10);
                            v21 = 3;
                            iter = *a2;
                            continue;
                        }
                        else if (v21 == 2)
                        {
                            sub_1fcde8(a1, &v10);
                            v21 = 2;
                            iter = *a2;
                            continue;
                        }
                        else
                        {
                            sub_1f7d40(a1, &v10);
                            sub_1f7d40(&a1->padding_0[24], &v11 + 8);
                            sub_1f7d40(&a1->padding_0[48], &v13);
                            v33 = a1->field_48;
                            a1->field_48 = v15;
                            v15 = v33;
                            goto LABEL_1efa30;
                        }
                    }
                    goto LABEL_1efa7c;
                }
                else
                {
LABEL_1ef9d4:
                    sub_1ebd3c(&a1->padding_0[48], &v13);
LABEL_1efa30:
                    iter = *a2;
                    continue;
                }
            }
            goto LABEL_1efb1c;
        }
        else
        {
LABEL_1efaa4:
            v37 = 0x68000000;
            goto LABEL_1efaa8;
        }
    }
    v36 = 32;
    if (v21 == 3)
        v36 = 464;
    if (v21 == 4)
        v36 = 408;
    if (v21 == 1)
        v36 = 632;
    goto *((void *)(*(long long *)((char *)&g_e77fa0 + v36)));
}
