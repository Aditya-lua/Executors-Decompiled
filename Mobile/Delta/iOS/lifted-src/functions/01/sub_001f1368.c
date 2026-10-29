/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f1368..0x1f2118 (3504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f1368_1 {
    struct st_1f1368_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char *field_20;
    char *field_28;
    char padding_30[72];
    struct st_1f1368_3 *field_78;
    char padding_80[16];
    char *field_90;
} st_1f1368_1;

typedef struct st_1f1368_2 {
    uint128_t field_0;
} st_1f1368_2;

typedef struct st_1f1368_3 {
    struct st_1f1368_3 *field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    char padding_10[8];
    struct st_1f1368_3 *field_18;
    struct st_1f1368_3 *field_20;
} st_1f1368_3;

typedef struct st_1f1368_0 {
    char field_0;
} st_1f1368_0;

extern unsigned long long g_e770e0;
extern unsigned long long g_e77140;
extern unsigned long long g_e77298;
extern unsigned long long g_e773a0;

char * sub_1f1368(long long a0, st_1f1368_1 *a1)
{
    char *v4;  // x21
    char *v5;  // w8
    unsigned long v14;  // x8
    unsigned int v15;  // w0
    char *v16;  // x21
    char *v17;  // x8
    unsigned int v18;  // w9
    char *v19;  // x10
    unsigned long long v20;  // x9
    unsigned long long v21;  // x8
    unsigned long long *v22;  // x8
    unsigned long long v6;  // 4102
    char *v7;  // x22
    char *v8;  // x8
    unsigned long long v9;  // 4102
    char **v10;  // x8
    char *v11;  // x22
    char *v12;  // x8
    char *v13;  // x8
    st_1f1368_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1f1368_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    while (1)
    {
        v4 = a1->field_20;
        v5 = (char *)*(int *)v4;
        if (1 >= v5)
        {
            v6 = arm64g_calculate_condition(19, (unsigned long long)v5, 1, 0);
            if (!(v6 & 1))
            {
                v7 = a1->field_28;
                if (v7 != a1->field_90)
                {
                    a1->field_28 = v7 - 1;
                    v15 = sub_1f9f2c(*(v7 - 1));
                    v16 = a1->field_20;
                    while (1)
                    {
                        if (*(int *)&v16[4] != v15)
                        {
                            v17 = *(long long *)&v16[32];
                            if (v17)
                            {
                                a1->field_20 = v17;
                                v16 = v17;
                                if (*(int *)v16 != 1)
                                {
                                    a1->field_28 = v7;
                                    goto *((void *)(g_e77140));
                                }
                            }
                            else
                            {
                                goto *((void *)(g_e77298));
                            }
                        }
                        else
                        {
                            a1->field_20 = *(long long *)&v16[24];
                            goto *((void *)(g_e77140));
                        }
                    }
                }
            }
            else
            {
                v8 = a1->field_28;
                if (v8 != a1->field_90)
                {
                    a1->field_28 = v8 - 1;
                    v18 = *(v8 - 1);
                    while (1)
                    {
                        if (*(int *)&v4[4] != v18)
                        {
                            v19 = *(long long *)&v4[32];
                            if (v19)
                            {
                                a1->field_20 = v19;
                                v4 = v19;
                                if (*(int *)v4)
                                {
                                    a1->field_28 = v8;
                                    goto *((void *)(g_e77140));
                                }
                            }
                            else
                            {
                                goto *((void *)(g_e77298));
                            }
                        }
                        else
                        {
                            a1->field_20 = *(long long *)&v4[24];
                            goto *((void *)(g_e77140));
                        }
                    }
                }
            }
        }
        else
        {
            if (3 < v5)
            {
                v20 = 176;
                if (v5 == 4)
                    v20 = 592;
                if (v5 == 5)
                {
                    v20 = 664;
                    break;
                }
                else
                {
                    break;
                }
            }
            v9 = arm64g_calculate_condition(19, (unsigned long long)v5, 3, 0);
            if (!(v9 & 1))
            {
                sub_1f7088(a1, &a1->field_20);
                v10 = a1->field_20 + 24;
                goto LABEL_1f13bc;
            }
            else
            {
                v11 = a1->field_28;
                if (v11 != a1->field_90)
                {
                    a1->field_28 = v11 - 1;
                    if (sub_1f8728(a0 + 24, *(int *)&v4[8], *(int *)&v4[12], *(v11 - 1)))
                    {
                        a1->field_20 = *(long long *)&a1->field_20[24];
                        goto *((void *)(g_e773a0));
                    }
                    else
                    {
                        v22 = &g_e77298;
                        if (*(long long *)&a1->field_20[32])
                        {
                            a1->field_20 = *(long long *)&a1->field_20[32];
                            a1->field_28 = v11;
                            v22 = &g_e773a0;
                        }
                        goto *((void *)(*v22));
                    }
                }
            }
        }
        v12 = *(long long *)&v4[32];
        if (v12)
        {
LABEL_1f13c0:
            a1->field_20 = v12;
        }
        else
        {
            v13 = a1->field_78;
            a1->field_78 = v13 - 1;
            if (v13 == 1)
            {
                return 111;
            }
            else if (a1->field_8 > a1->field_18)
            {
                v14 = a1->field_8 - 16;
                a1->field_8 = v14;
                *(int128_t *)&a1->field_20 = *(int128_t *)((char *)a1->field_0 + v14);
                v10 = a1->field_20 + 32;
            }
            else
            {
                return 0;
            }
LABEL_1f13bc:
            v12 = *v10;
            goto LABEL_1f13c0;
        }
    }
    if (v5 == 6)
        v20 = 920;
    if (v5 == 7)
        v20 = 192;
    if (v5 == 8)
        v20 = 672;
    if (v5 == 9)
        v20 = 552;
    if (v5 == 10)
        v20 = 808;
    if (v5 == 11)
        v20 = 928;
    if (v5 == 12)
        v20 = 0x400;
    if (v5 == 13)
        v20 = 1080;
    if (v5 == 14)
        v20 = 1240;
    if (v5 == 15)
        v20 = 1520;
    if (v5 == 16)
        v20 = 144;
    if (v5 == 0x11)
        v20 = 1144;
    if (v5 == 18)
        v20 = 48;
    if (v5 == 19)
        v20 = 1312;
    if (v5 == 20)
        v20 = 944;
    v21 = 1392;
    if (v5 != 21)
        v21 = v20;
    goto *((void *)(*(long long *)((char *)&g_e770e0 + v21)));
}
