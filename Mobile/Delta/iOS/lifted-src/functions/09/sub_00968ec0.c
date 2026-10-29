/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x968ec0..0x96908c (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_968ec0_2 {
    char padding_0[664];
    unsigned int field_298;
    char padding_29c[980];
    struct st_968ec0_1 *field_670;
    unsigned long long field_678;
} st_968ec0_2;

typedef struct st_968ec0_5 {
    unsigned short field_0;
} st_968ec0_5;

typedef struct st_968ec0_4 {
    char padding_0[8];
    struct st_968ec0_2 *field_8;
    char padding_10[752];
    struct st_968ec0_0 *field_300;
    char padding_308[1400];
    struct st_968ec0_3 *field_880;
    char padding_888[512];
    unsigned long long field_a88;
    struct st_968ec0_5 *field_a90;
    unsigned long long field_a98;
    struct st_968ec0_5 *field_aa0;
} st_968ec0_4;

typedef struct st_968ec0_0 {
    char padding_0[24];
    unsigned int field_18;
} st_968ec0_0;

typedef struct st_968ec0_1 {
    char padding_0[28];
    unsigned short field_1c;
} st_968ec0_1;

typedef struct st_968ec0_3 {
    char padding_0[28];
    unsigned int field_1c;
} st_968ec0_3;

extern unsigned short g_d280f4;
extern unsigned int g_d28258;
extern unsigned int g_d2825a;

unsigned int sub_968ec0(st_968ec0_4 *a0, unsigned int a1, unsigned int a2)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long v17;  // x9
    unsigned short *v18;  // x8
    unsigned long v19;  // x9
    unsigned short *v20;  // x8
    unsigned long long v21;  // x9
    unsigned int v22;  // x9
    unsigned int v23;  // w0
    unsigned long v24;  // x8
    unsigned short *v25;  // x9
    unsigned long v26;  // x8
    unsigned long long v9;  // x30
    unsigned int v10;  // w9
    st_968ec0_2 *v11;  // x8
    unsigned int v12;  // w9
    unsigned short *v13;  // x9
    unsigned long v14;  // x10
    unsigned long v15;  // x10
    char v0;  // [bp-0x22]
    char v1;  // [bp-0x21]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1)
        return 0;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v10 = a0->field_880->field_1c;
    if (v10 & 0x30000 && a0->field_300)
    {
        if (a0->field_300->field_18 != 50380844)
        {
            if (a0->field_300->field_18 != 50380843)
            {
                return 0;
            }
            else if (a1 != 23)
            {
                return 0;
            }
        }
        else
        {
            if (a1 != 24)
                return 0;
        }
    }
    v11 = a0->field_8;
    if (!a2)
    {
LABEL_968fa4:
        v17 = v11->field_678;
        if (v11->field_678)
        {
            v18 = &v11->field_670->field_1c;
            do
            {
                v19 = v17;
                if (*v18 == a1)
                {
                    v0 = a1 >> 8;
                    v1 = a1;
                    v20 = &g_d280f4;
                    v21 = 45;
                    do
                    {
                        v22 = v21;
                        if (*v20 == a1)
                            goto LABEL_969028;
                    } while ((v20 += 4, v21 = v22 - 1, v22 != 1));
LABEL_969028:
                    v23 = sub_959e54();
                    if (!v23)
                        return v23;
                    if (!*(int *)&a0->padding_10[104])
                        return 1;
                    v24 = a0->field_a98;
                    if (a0->field_a98)
                    {
                        v25 = a0->field_aa0;
                        while (1)
                        {
                            v26 = v24;
                            if (*v25 == a1)
                                break;
                            v24 = v26 - 1;
                            v25 += 1;
                            if (v26 == 1)
                                return 0;
                        }
                    }
                    return 1;
                }
            } while ((v18 += 28, v17 = v19 - 1, v19 != 1));
        }
LABEL_968fcc:
        return 0;
    }
    v12 = (v10 * 0x10000 | v10 >> 16) & 0xffff0003 & 3;
    if (1 >= (int)v12)
    {
        if (!v12)
        {
            v13 = a0->field_a90;
            if (a0->field_a90)
            {
                v14 = a0->field_a88;
                if (!a0->field_a88)
                    return 0;
            }
            else
            {
                v13 = *(long long *)&v11->field_298;
                v14 = *(long long *)&v11->padding_0[656];
                if (!*(long long *)&v11->padding_0[656])
                    return 0;
            }
        }
        else
        {
            v13 = &g_d28258;
LABEL_968f78:
            v14 = 1;
        }
    }
    else
    {
        if (v12 == 2)
        {
            v13 = &g_d2825a;
            goto LABEL_968f78;
        }
        else
        {
            v13 = &g_d28258;
            v14 = 2;
        }
    }
    do
    {
        v15 = v14;
        if (*v13 == a1)
            goto LABEL_968fa4;
    } while ((v14 = v15 - 1, v13 += 1, v15 != 1));
    goto LABEL_968fcc;
}
