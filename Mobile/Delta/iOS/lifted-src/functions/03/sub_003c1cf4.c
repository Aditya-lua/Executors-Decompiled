/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c1cf4..0x3c1fc8 (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c1cf4_5 {
    long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_3c1cf4_5;

typedef struct st_3c1cf4_4 {
    struct st_3c1cf4_0 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_3c1cf4_4;

typedef struct st_3c1cf4_2 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[40];
    unsigned long long field_50;
    char padding_58[32];
    unsigned long long field_78;
    char padding_80[16];
    unsigned int field_90;
    char padding_94[24];
    unsigned int field_ac;
} st_3c1cf4_2;

typedef struct st_3c1cf4_6 {
    char padding_0[24];
    unsigned int field_18;
} st_3c1cf4_6;

typedef struct st_3c1cf4_0 {
    char padding_0[3];
    char field_3;
    char padding_4[20];
    unsigned long long field_18;
} st_3c1cf4_0;

typedef struct st_3c1cf4_1 {
    char field_0;
} st_3c1cf4_1;

extern long long g_cbed28;

unsigned long long * sub_3c1cf4(unsigned long long *a0, st_3c1cf4_2 *a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11, unsigned long a12, unsigned long a13, unsigned long a14, unsigned int a15, unsigned int a16)
{
    unsigned long long *v10;  // x0
    unsigned long long v11;  // x1
    unsigned long long v20;  // x1
    long long v21;  // x0
    st_3c1cf4_2 *v22;  // x8
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long long j;  // w9
    st_3c1cf4_5 *v26;  // x21
    unsigned long v27;  // x9
    unsigned long v28;  // x20
    unsigned long long v29;  // 4112
    unsigned long v12;  // x10
    unsigned long long v30;  // 4102
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4102
    unsigned long long k;  // x22
    unsigned long long l;  // x21
    st_3c1cf4_6 *v35;  // x0
    unsigned long long v13;  // x8
    unsigned long long v14;  // x9
    unsigned long long i;  // x21
    unsigned long long v16;  // x21
    unsigned long long v17;  // x22
    st_3c1cf4_4 *v18;  // x8
    st_3c1cf4_0 *v19;  // x8
    long long v0;  // [bp-0x70]
    st_3c1cf4_1 **v1;  // [bp-0x68], Other Possible Types: char
    st_3c1cf4_1 *v2;  // [bp-0x60]
    st_3c1cf4_2 *v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    st_3c1cf4_2 **iter;  // [bp-0x48], Other Possible Types: long long, unsigned int, unsigned long long
    long long v6;  // [bp-0x40]
    int v7;  // [bp-0x38]
    int v8;  // [bp-0x30]
    char *v9;  // [bp-0x10]

    v9 = &a8;
    v2 = &v1;
    v3 = a1;
    v1 = &v2;
    if (!a1)
        return a0;
    v10 = sub_3c2068(a2, &v3, &v3);
    if (!(&v3 & 0x1))
        return v10;
    v11 = v3;
    if (v11)
    {
        v12 = *(int *)(v11 + 148);
        if (!(v12 >> 31 & 1))
        {
            v13 = *(int *)(v11 + 152);
            if (!(v13 >> 31 & 1))
            {
                v14 = *(int *)(v11 + 156);
                if (!(v14 >> 31 & 1) && *(int *)(v11 + 172) >= 0 && *(int *)(v11 + 144) >= 0 && (!(unsigned int)v12 || *(long long *)(v11 + 40)) && (!(unsigned int)v13 || *(long long *)(v11 + 32)))
                {
                    if ((unsigned int)v14)
                    {
                        if (*(long long *)(v11 + 24))
                        {
                            i = 0;
                            do
                            {
                                sub_3c1cf4(a0, *(long long *)(*(long long *)(v11 + 24) + i * 8), a2, a3, a4, a5, a6, a7, v0, v1, v2, v3, v4, iter, v6, v7, v8);
                                i += 1;
                                v11 = v3;
                            } while ((long long)i < *(int *)(v11 + 156));
                            v13 = *(int *)(v11 + 152);
                        }
                        else
                        {
                            *(char *)&a0[26] = 1;
                            return v10;
                        }
                    }
                    if ((int)v13 >= 1)
                    {
                        v16 = 0;
                        v17 = 0;
                        do
                        {
                            v18 = *(long long *)(v11 + 32) + v16;
                            if (v18->field_c == 8)
                            {
                                v19 = v18->field_0;
                                if (!v19 || v19->field_3 & 1)
                                    v20 = 0;
                                else
                                    v20 = v19->field_18;
                                sub_3c1cf4(a0, v20, a2, a3, a4, a5, a6, a7, v0, v1, v2, v3, v4, iter, v6, v7, v8);
                                v11 = v3;
                            }
                        } while ((v17 += 1, v16 += 16, *(int *)(v11 + 152) > (long long)v17));
                    }
                    sub_3c111c(a0);
                    sub_3c25f8(a0, v3->field_10);
                    iter = &v3;
                    v21 = sub_3c1a94(a0 + 21, &v3, &g_cbed28, &iter, (char *)&v4 + 7);
                    iter = 0;
                    v22 = v3;
                    v23 = *(int *)&v22->padding_94[4];
                    v24 = 1;
                    if (*(int *)&v22->padding_94[4] >= 1)
                    {
                        j = 0;
                        do
                        {
                            v26 = v22->field_20 + j * 16;
                            if (v26->field_c == 6 && !sub_3c0a7c(v21 + 24, &iter))
                                sub_3c25f8(a0, v26->field_0);
                            iter += 1;
                            v22 = v3;
                            v23 = iter;
                            v24 = *(int *)&v22->padding_94[4];
                            j = iter;
                        } while (*(int *)&v22->padding_94[4] > j);
                    }
                    v27 = v22->field_ac;
                    v28 = v22->field_90;
                    if (v22->field_50)
                    {
                        v29 = arm64g_calculate_condition(19, v23, v24, 0);
                        v30 = arm64g_calculate_condition(179, (v29 & 1 ? v27 & 0xffffffff : 0x80000000), v29 & 1, 0);
                        if (!(v30 & 1))
                            goto LABEL_3c1f10;
                    }
                    else
                    {
                        v31 = arm64g_calculate_condition(19, v23, v24, 0);
                        v32 = arm64g_calculate_condition(176, (v31 & 1 ? v27 & 0xffffffff : 0x80000000), v31 & 1, 0);
                        if (!(v32 & 1))
                        {
LABEL_3c1f10:
                            k = 0;
                            do
                            {
                                sub_3c25f8(a0, *(long long *)(v3->field_50 + k));
                                k += 24;
                            } while (v27 * 24 != k);
                        }
                    }
                    if (v22->field_78 && (int)v28 >= 1)
                    {
                        l = 0;
                        do
                        {
                            sub_3c25f8(a0, *(long long *)(v3->field_78 + l));
                            l += 8;
                        } while (v28 * 8 != l);
                    }
                    iter = &v3;
                    v35 = sub_3c0b44(a0 + 3, &v3, &g_cbed28, &iter, (char *)&v4 + 7);
                    v35->field_18 = a0[1] - *a0 >> 3;
                    return sub_103a8(a0, &v3);
                }
            }
        }
    }
    *(char *)&a0[26] = 1;
    return v10;
}
