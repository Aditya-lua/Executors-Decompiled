/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4b058..0xc4b278 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4b058_0 {
    struct st_c4b058_0 *field_0;
    char field_1;
    char padding_2[2];
    unsigned short field_4;
    char field_6;
    char field_7;
    char padding_8[136];
    struct st_c4b058_0 *field_90;
    struct st_c4b058_0 *field_98;
} st_c4b058_0;

typedef struct st_c4b058_1 {
    long long field_0;
    struct st_c4b058_0 *field_8;
    struct st_c4b058_0 *field_10;
} st_c4b058_1;

typedef struct st_c4b058_3 {
    char padding_0[80];
    struct st_c4b058_0 *field_50;
    struct st_c4b058_0 *field_58;
    char padding_60[32];
    struct st_c4b058_0 *field_80;
    struct st_c4b058_0 *field_88;
    struct st_c4b058_0 *field_90;
    unsigned long long field_98;
    char padding_a0[80];
    struct st_c4b058_0 *field_f0;
} st_c4b058_3;

typedef struct st_c4b058_2 {
    struct st_c4b058_0 *field_0;
    struct st_c4b058_0 *field_8;
    char field_9;
    char padding_a[6];
    struct st_c4b058_0 *field_10;
} st_c4b058_2;


st_c4b058_2 * sub_c4b058(st_c4b058_2 *a0, st_c4b058_3 *a1, char a2, unsigned long a3, st_c4b058_1 *a4)
{
    long long v0;  // x8
    st_c4b058_0 *v1;  // x10
    unsigned long v10;  // x8
    st_c4b058_0 *v11;  // x10
    st_c4b058_0 *v12;  // x9
    st_c4b058_0 *v13;  // x8
    st_c4b058_0 *v14;  // x10
    unsigned long long v15;  // 4106
    st_c4b058_0 *v16;  // x9
    st_c4b058_0 *v17;  // x8
    st_c4b058_0 *v18;  // x10
    st_c4b058_0 *v19;  // x8
    st_c4b058_0 *v2;  // x10
    unsigned long long v20;  // 4106
    st_c4b058_0 *v21;  // x10
    st_c4b058_0 *v22;  // x8
    unsigned long long v23;  // 4106
    st_c4b058_0 *v3;  // x9
    st_c4b058_0 *v4;  // x8
    unsigned long long v5;  // 4106
    st_c4b058_0 *iter;  // x10
    st_c4b058_0 *v7;  // x9
    unsigned long long v8;  // x8
    unsigned long long v9;  // x10

    v0 = a4->field_0;
    if (v0 > 28)
    {
        if (v0 == 29)
        {
            v7 = a1->field_90;
            v8 = a1->field_98 - a3;
            if (a1->field_98 >= a3 && (v7 = (char *)a1->field_90 + a3, v9 = a2 * a4->field_8, v10 = v8 - v9, v9 <= v8))
            {
                v7 = (char *)v7 + v9;
                if (a2 == 8)
                {
                    if (v10 > 7)
                    {
                        v11 = *((char *)&v7->field_0 + 7) * 0x100000000000000 | ((int)v7->field_0 * 0x100 | (*(short *)((char *)&v7->field_0 + 4) | *((char *)&v7->field_0 + 6) * 0x10000) * 0x10000000000) >> 8;
                        goto LABEL_c4b20c;
                    }
                }
                else
                {
                    if (v10 > 3)
                    {
                        v11 = (int)v7->field_0;
LABEL_c4b20c:
                        v12 = a1->field_80;
                        v13 = a1->field_88;
                        if (v11 > v13)
                        {
                            *(char *)&a0->field_8 = 19;
                            *(st_c4b058_0 **)&a0->field_9 = v12;
                            a0->field_0 = 1;
                            return a0;
                        }
                        v14 = v12 + v11;
                        v15 = arm64g_calculate_condition(4, v13, v11, 0);
                        if (!(v15 & 1))
                        {
                            v16 = 0;
                            do
                            {
                                if (!*(char *)(v14 + v16))
                                {
                                    a0->field_8 = v14;
                                    *(st_c4b058_0 **)&a0->field_9 = v16;
                                    a0->field_0 = 0;
                                    return a0;
                                }
                            } while ((v16 = (char *)&v16->field_0 + 1, v13 - v11 != v16));
                        }
                        *(char *)&a0->field_8 = 19;
                        *(st_c4b058_0 **)&a0->field_9 = v14;
                        a0->field_0 = 1;
                        return a0;
                    }
                }
            }
            *(char *)&a0->field_8 = 19;
            memset((char *)&a0->field_8 + 1, 0, 7);
            *(st_c4b058_0 **)&a0->field_9 = v7;
            a0->field_0 = 1;
            return a0;
        }
        else if (v0 == 30)
        {
            v2 = a4->field_8;
            v3 = a1->field_50;
            v4 = a1->field_58;
            if (v4 >= v2)
            {
                v3 = a1->field_50 + v2;
                v5 = arm64g_calculate_condition(4, v4, v2, 0);
                if (!(v5 & 1))
                {
                    iter = 0;
                    do
                    {
                        if (!*(char *)(v3 + iter))
                        {
                            a0->field_8 = v3;
                            *(st_c4b058_0 **)&a0->field_9 = iter;
                            a0->field_0 = 0;
                            return a0;
                        }
                    } while ((iter = (char *)&iter->field_0 + 1, v4 - v2 != iter));
                }
            }
        }
        else if (v0 == 31)
        {
            v1 = a4->field_10;
            a0->field_8 = a4->field_8;
            *(st_c4b058_0 **)&a0->field_9 = v1;
            a0->field_0 = 0;
            return a0;
        }
        else
        {
            *(char *)&a0->field_8 = 72;
            a0->field_0 = 1;
            return a0;
        }
    }
    else
    {
        if (v0 == 26)
        {
            v21 = a4->field_8;
            v3 = a1->field_80;
            v22 = a1->field_88;
            if (v22 >= v21)
            {
                v3 = a1->field_80 + v21;
                v23 = arm64g_calculate_condition(4, v22, v21, 0);
                if (!(v23 & 1))
                {
                    iter = 0;
                    do
                    {
                        if (!*(char *)(v3 + iter))
                        {
                            a0->field_8 = v3;
                            *(st_c4b058_0 **)&a0->field_9 = iter;
                            a0->field_0 = 0;
                            return a0;
                        }
                    } while ((iter = (char *)&iter->field_0 + 1, v22 - v21 != iter));
                }
            }
        }
        else if (v0 == 27)
        {
            v17 = a1->field_f0;
            if (!v17)
            {
                *(char *)&a0->field_8 = 72;
                a0->field_0 = 1;
                return a0;
            }
            v18 = a4->field_8;
            v3 = *(long long *)&v17->padding_8[128];
            v19 = v17->field_90;
            if (v19 >= v18)
            {
                v3 = *(long long *)&v17->padding_8[128] + (char *)v18;
                v20 = arm64g_calculate_condition(4, v19, v18, 0);
                if (!(v20 & 1))
                {
                    iter = 0;
                    do
                    {
                        if (!*(char *)(v3 + iter))
                        {
                            a0->field_8 = v3;
                            *(st_c4b058_0 **)&a0->field_9 = iter;
                            a0->field_0 = 0;
                            return a0;
                        }
                    } while ((iter = (char *)&iter->field_0 + 1, v19 - v18 != iter));
                }
            }
        }
        else
        {
            *(char *)&a0->field_8 = 72;
            a0->field_0 = 1;
            return a0;
        }
    }
    *(char *)&a0->field_8 = 19;
    *(st_c4b058_0 **)&a0->field_9 = v3;
    a0->field_0 = 1;
    return a0;
}
