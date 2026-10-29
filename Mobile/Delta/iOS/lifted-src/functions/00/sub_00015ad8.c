/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15ad8..0x15c70 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15ad8_2 {
    char padding_0[4];
    unsigned long long field_4;
} st_15ad8_2;

typedef struct st_15ad8_1 {
    char padding_0[96];
    char field_60;
    char padding_61[31];
    long long field_80;
    char field_84;
    char padding_85[35];
    unsigned long long field_a8;
    char padding_b0[40];
    long long field_d8;
    char padding_e0[80];
    long long field_130;
} st_15ad8_1;

typedef struct st_15ad8_3 {
    char padding_0[20];
    unsigned long long field_14;
} st_15ad8_3;

typedef struct st_15ad8_0 {
    char field_0;
} st_15ad8_0;


long long sub_15ad8(st_15ad8_1 *a0, st_15ad8_2 *a1, long long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, unsigned long a8, unsigned long a9, unsigned long a10, unsigned long long a11, unsigned long long a12)
{
    long long v16;  // x0
    st_15ad8_3 *v17;  // x22
    st_15ad8_0 **v0;  // [bp-0xc8], Other Possible Types: char
    st_15ad8_0 *v1;  // [bp-0xc0]
    char v2;  // [bp-0xb8], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0xb0]
    char v4;  // [bp-0xa8], Other Possible Types: unsigned long long
    unsigned long v5;  // [bp-0xa0]
    unsigned long long v6;  // [bp-0x98]
    unsigned long v7;  // [bp-0x90]
    unsigned long v8;  // [bp-0x88]
    unsigned long v9;  // [bp-0x80]
    unsigned long v10;  // [bp-0x78]
    st_15ad8_0 **v11;  // [bp-0x70], Other Possible Types: char
    st_15ad8_0 *v12;  // [bp-0x68]
    unsigned long v13;  // [bp-0x60]
    unsigned long v14;  // [bp-0x58]
    char *v15;  // [bp-0x10]

    v15 = &a8;
    v1 = &v0;
    v0 = &v1;
    v9 = a3;
    v10 = a4;
    v7 = a5;
    v8 = a6;
    v5 = a10;
    v6 = a11;
    sub_16844();
    if ((int)a0->field_80 == 58)
    {
        sub_1db64(a0, (char *)&a0->field_80 + 4, "Return types in function type annotations are written after '->' instead of ':'");
        sub_c048(&a0->field_60);
    }
    else
    {
        if ((int)a0->field_80 != 263 && !a4 && !a6 && !a9)
        {
            v2 = *(long long *)(a1->padding_0)[1];
            v3 = *(long long *)&a0->padding_85[31];
            sub_1db64(a0, &v2, "Expected '->' after '()' when parsing function type; did you mean 'nil'?");
            v12 = &v11;
            v11 = &v12;
            v16 = sub_404c(*(long long *)&a0->padding_b0[32], 120);
            v2 = 0;
            v4 = 0;
            v13 = 0;
            v14 = 0;
            return sub_6984(v16, (a1->padding_0)[1], 0, 0, *(long long *)&a0->padding_e0[72], &v2, (a1->padding_0)[1], 0, &v13, 0);
        }
        sub_1f3d4(a0, 263, "function type");
    }
    v17 = sub_2295c(a0);
    v2 = a8;
    v3 = a9;
    v4 = a12;
    v13 = *(long long *)(a1->padding_0)[1];
    v14 = *(long long *)&(v17->padding_0)[1];
    return sub_63d8(sub_404c(*(long long *)&a0->padding_b0[32], 128), &v13, a2, &v9, &v7, &v2, &v5, v17);
}
