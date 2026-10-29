/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x458e4..0x45bb8 (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_458e4_4 {
    char padding_0[400];
    unsigned long long field_190;
    char padding_198[16];
    unsigned long long field_1a8;
    char padding_1b0[736];
    unsigned long long field_490;
    char padding_498[64];
    unsigned long long field_4d8;
    unsigned long long field_4e0;
    char padding_4e8[32];
    struct st_458e4_3 *field_508;
    unsigned long long field_510;
    char padding_518[16];
    unsigned long long field_528;
} st_458e4_4;

typedef struct st_458e4_2 {
    long long field_0;
    char padding_8[216];
    char field_e0;
    char padding_e1[39];
    char field_108;
    char padding_109[39];
    char field_130;
    char padding_131[39];
    char field_158;
    char padding_159[399];
    long long field_2e8;
    char padding_2f0[16];
    long long field_300;
    char padding_308[736];
    unsigned long long field_5e8;
    char padding_5f0[64];
    unsigned long long field_630;
    unsigned long long field_638;
    char padding_640[32];
    struct st_458e4_3 *field_660;
    unsigned long long field_668;
    char padding_670[8];
    char field_678;
    char padding_679[7];
    unsigned long long field_680;
} st_458e4_2;

typedef struct st_458e4_3 {
    unsigned int field_0;
} st_458e4_3;

typedef struct st_458e4_1 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[24];
    long long field_40;
} st_458e4_1;

typedef struct st_458e4_6 {
    unsigned long long field_0;
    char padding_8[736];
    unsigned long long field_2e8;
    char padding_2f0[64];
    unsigned long long field_330;
    unsigned long long field_338;
    char padding_340[32];
    struct st_458e4_3 *field_360;
    unsigned long long field_368;
    char padding_370[16];
    unsigned long long field_380;
} st_458e4_6;

typedef struct st_458e4_5 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char padding_20[736];
    unsigned long long field_300;
    char padding_308[64];
    unsigned long long field_348;
    unsigned long long field_350;
    char padding_358[32];
    struct st_458e4_3 *field_378;
    unsigned long long field_380;
    char padding_388[16];
    unsigned long long field_398;
} st_458e4_5;

typedef struct st_458e4_0 {
    char field_0;
} st_458e4_0;


long long sub_458e4(st_458e4_2 *a0, st_458e4_1 *a1, unsigned int a2, double a3, double a4)
{
    st_458e4_6 *v15;  // x21
    unsigned int i;  // w27
    unsigned int *v25;  // x9
    long long v26;  // x25
    unsigned long long v27;  // x20
    long long v28;  // x23
    double v17;  // d10
    long long v18;  // x26
    long long v19;  // x0
    unsigned long v20;  // x8
    unsigned int *v21;  // x9
    long long v22;  // x20
    long long v23;  // x0
    unsigned long v24;  // x8
    unsigned long v0;  // [bp-0x100]
    st_458e4_4 *v1;  // [bp-0xf8]
    st_458e4_5 *v2;  // [bp-0xf0], Other Possible Types: unsigned long
    st_458e4_6 *v3;  // [bp-0xe8], Other Possible Types: unsigned long
    long long v4;  // [bp-0xe0]
    long long v5;  // [bp-0xd8]
    st_458e4_5 *v6;  // [bp-0xd0]
    st_458e4_0 **v7;  // [bp-0xc8], Other Possible Types: char
    st_458e4_0 *v8;  // [bp-0xc0]
    long long v9;  // [bp-0xb8]
    long long v10;  // [bp-0xb0]
    unsigned long v11;  // [bp-0xa8]
    unsigned long v12;  // [bp-0xa0]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v8 = &v7;
    v7 = &v8;
    v11 = 0;
    v12 = a1->field_20;
    v4 = a0->field_668 - (char *)a0->field_660;
    v5 = v4 >> 4;
    v9 = (long long)(a0->field_638 - a0->field_630) >> 3;
    v10 = v9;
    sub_15798(&a0->field_678, &v9);
    v6 = &a0->field_2e8;
    sub_c84c(v6, a0->field_2e8);
    v15 = &a0->field_300;
    sub_c84c(v15, a0->field_300);
    if ((int)a2 >= 1)
    {
        i = 0;
        v17 = 0.0;
        do
        {
            sub_460d4(&a0->field_130, &v12);
            *(unsigned int *)(sub_436f8(&a0->field_130, &v12) + 8) = 3;
            sub_460d4(&a0->field_130, &v12);
            *(double *)(sub_436f8(&a0->field_130, &v12) + 16) = v17 * a4 + a3;
            if (i)
            {
                v2 = 0;
                v3 = 0;
            }
            else
            {
                v2 = v6;
                v3 = v15;
            }
            v0 = a0->field_5e8;
            v1 = &a0->field_158;
            sub_4c624(&a0->field_108, &a0->field_e0, &a0->field_130);
            v18 = a0->field_668 - (char *)a0->field_660;
            sub_38924(a0, a1->field_40);
            v19 = sub_2bc4c(a0->field_0);
            v20 = a0->field_668;
            v21 = a0->field_660;
            if (a0->field_668 - (char *)a0->field_660 > (unsigned long long)v18)
            {
                v22 = v18 >> 4;
                do
                {
                    if (*(int *)((char *)v21 + v18) == 1)
                    {
                        sub_41380(a0, a1, *(long long *)((char *)v21 + v18 + 8), v19);
                        v20 = a0->field_668;
                        v21 = a0->field_660;
                    }
                } while ((v22 += 1, v18 += 16, v20 - (char *)v21 >> 4 > (unsigned long long)v22));
            }
            v17 += 1.0;
            i += 1;
        } while (i != a2);
    }
    v23 = sub_2bc4c(a0->field_0);
    v24 = a0->field_668;
    v25 = a0->field_660;
    v26 = v5;
    if (a0->field_668 - (char *)a0->field_660 > (unsigned long long)v4)
    {
        v27 = v26 * 16;
        v28 = v26;
        do
        {
            if (!*(int *)((char *)v25 + v27))
            {
                sub_41380(a0, a1, *(long long *)((char *)v25 + v27 + 8), v23);
                v24 = a0->field_668;
                v25 = a0->field_660;
            }
        } while ((v28 += 1, v27 += 16, v24 - (char *)v25 >> 4 > (unsigned long long)v28));
    }
    sub_39b70(&a0->field_660, v26);
    sub_c84c(&a0->field_678, a0->field_680 - 24);
    sub_460d4(&a0->field_130, &v12);
    *(unsigned int *)(sub_436f8(&a0->field_130, &v12) + 8) = 0;
    sub_4db50(&a0->field_108, v6);
    return sub_4dc7c(&a0->field_130, v15);
}
