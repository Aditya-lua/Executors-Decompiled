/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c1b38..0x1c1c94 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c1b38_4 {
    uint128_t field_0;
    char field_10;
} st_1c1b38_4;

typedef struct st_1c1b38_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[32];
    unsigned int field_50;
    char field_54;
} st_1c1b38_1;

typedef struct st_1c1b38_2 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    long long field_10;
    long long field_18;
    unsigned long long field_20;
    char padding_28[40];
    unsigned long long field_50;
} st_1c1b38_2;

typedef struct st_1c1b38_0 {
    char field_0;
} st_1c1b38_0;


long long sub_1c1b38(st_1c1b38_1 *a0, st_1c1b38_2 *a1)
{
    unsigned int v16;  // w0
    unsigned long long v17;  // x9
    unsigned int v18;  // w10
    unsigned long long v19;  // w12
    unsigned long long i;  // x14
    st_1c1b38_4 *v21;  // x14
    st_1c1b38_4 *v22;  // x15
    st_1c1b38_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_1c1b38_0 *v1;  // [bp-0xa8]
    uint128_t v2;  // [bp-0xa0]
    uint128_t v3;  // [bp-0x90]
    uint128_t v4;  // [bp-0x87]
    unsigned long v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x68]
    char v7;  // [bp-0x60]
    unsigned long v8;  // [bp-0x58]
    unsigned long v9;  // [bp-0x50]
    char v10;  // [bp-0x48]
    char v11;  // [bp-0x40]
    unsigned long v12;  // [bp-0x38]
    char *v13;  // [bp-0x28]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v1 = &v0;
    v0 = &v1;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v2 = 0;
    v3 = 0;
    v4 = 0;
    sub_1b0298(&v2, a0->field_2c + 1, a1->field_10, a1->field_18, 0);
    v16 = sub_1bb564();
    if (a0->field_54 == v16)
    {
        a1->field_0 = 0xfffffc1f;
        a1->field_50 = 0;
    }
    else
    {
        a1->field_0 = 0xfffffc1e;
        a1->field_50 = a0->field_8;
        v17 = 12297829382473034411 * ((long long)(*(unsigned long long *)((void*)&v2 + 8) - *(unsigned long long *)&v2) >> 3);
        if (v17 >= 2)
        {
            v18 = a0->field_50;
            v19 = 2;
            i = 1;
            do
            {
                v21 = *(unsigned long long *)&v2 + 24 * i;
                v22 = a1->field_20 + v18 * 24;
                v22->field_0 = v21->field_0;
                v22->field_10 = v21->field_10;
                i = v19;
                v18 += 1;
                v19 += 1;
            } while (i < v17);
        }
    }
    v13 = &v2;
    return sub_127c0(&v13);
}
