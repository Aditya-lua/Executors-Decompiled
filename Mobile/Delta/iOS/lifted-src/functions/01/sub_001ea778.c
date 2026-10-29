/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ea778..0x1ea8d0 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ea778_3 {
    char padding_0[200];
    unsigned long long field_c8;
    unsigned long long field_d0;
    char padding_d8[8];
    unsigned long long field_e0;
    unsigned long long field_e8;
    char field_f0;
} st_1ea778_3;

typedef struct st_1ea778_1 {
    long long field_0;
    long long field_8;
    long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    char field_20;
    char padding_21[199];
    long long field_e8;
    long long field_f0;
    char padding_f8[8];
    long long field_100;
    long long field_108;
    char field_110;
} st_1ea778_1;

typedef struct st_1ea778_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    char field_28;
} st_1ea778_2;

typedef struct st_1ea778_0 {
    char field_0;
} st_1ea778_0;


st_1ea778_1 * sub_1ea778(st_1ea778_1 *a0)
{
    st_1ea778_2 *v6;  // x22
    st_1ea778_3 *v7;  // x20
    unsigned long v8;  // x21
    unsigned long long v9;  // x5
    unsigned long long v10;  // x5
    st_1ea778_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1ea778_0 *v1;  // [bp-0x48]
    st_1ea778_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_1ea778_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = &a0->field_e8;
    if (a0->field_f0 == a0->field_e8)
        return a0;
    v7 = (char *)v6 - 200;
    v8 = *(long long *)(sub_1f8448(v7, 0) + 8);
    if (*(long long *)sub_1f8448(v7, 0) != v8)
    {
        v9 = a0->field_18 | 64;
        a0->field_18 = v9;
        sub_1efb98(a0->field_10, v8, a0->field_8, a0->field_0, v7, v9);
        return a0;
    }
    else if (v8 == a0->field_8)
    {
        v3 = &v2;
        v2 = &v3;
        *(unsigned int *)&a0->padding_21[191] = 0;
        sub_c84c(v6, a0->field_e8);
        *(unsigned long long *)&a0[1].padding_21[38] = 0;
        *(unsigned long long *)&a0[1].padding_21[62] = 0;
        return a0;
    }
    else if (sub_1efb98(a0->field_10, v8) & 1)
    {
        return a0;
    }
    else
    {
        v10 = a0->field_18 | 64;
        a0->field_18 = v10;
        if (sub_1efb98(a0->field_10, v8 + 1, a0->field_8, a0->field_0, v7, v10))
        {
            a0->field_100 = v8;
            a0->field_110 = a0->field_108 != v8;
            return a0;
        }
        return a0;
    }
}
