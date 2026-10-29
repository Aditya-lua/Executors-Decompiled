/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aff7c..0x1b01e8 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aff7c_1 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    char field_20;
    char padding_21[47];
    long long field_50;
    long long field_58;
    char field_60;
    char padding_61[7];
    char field_68;
    char padding_69[23];
    uint128_t field_80;
} st_1aff7c_1;

typedef struct st_1aff7c_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_1aff7c_2;

typedef struct st_1aff7c_3 {
    struct st_1aff7c_0 *field_0;
} st_1aff7c_3;

typedef struct st_1aff7c_0 {
    char field_0;
} st_1aff7c_0;


st_1aff7c_1 * sub_1aff7c(st_1aff7c_1 *a0)
{
    long long v21;  // x20
    unsigned long long *v22;  // x0
    st_1aff7c_2 *v23;  // x0
    long long v24;  // x21
    long long v25;  // x21
    unsigned long long v26;  // x0
    unsigned int v27;  // w24
    unsigned long long v28;  // x4
    unsigned long long v29;  // x0
    st_1aff7c_0 **v0;  // [bp-0xf0], Other Possible Types: char
    st_1aff7c_0 *v1;  // [bp-0xe8]
    st_1aff7c_0 **v2;  // [bp-0xe0], Other Possible Types: st_1aff7c_3 **, char
    st_1aff7c_0 *v3;  // [bp-0xd8], Other Possible Types: st_1aff7c_3 **
    unsigned long long v4;  // [bp-0xd0]
    unsigned long long v5;  // [bp-0xc0]
    unsigned long long v6;  // [bp-0xb8]
    unsigned long long v7;  // [bp-0xb7]
    unsigned long long v8;  // [bp-0xb0]
    unsigned long long v9;  // [bp-0xa8]
    unsigned long long v10;  // [bp-0xa0]
    unsigned long long v11;  // [bp-0x98]
    unsigned long long v12;  // [bp-0x90]
    unsigned long long v13;  // [bp-0x88]
    unsigned long long v14;  // [bp-0x80]
    unsigned long long v15;  // [bp-0x78]
    uint128_t v16;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v17;  // [bp-0x68]
    char *v18;  // [bp-0x58], Other Possible Types: unsigned long long *
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v1 = &v0;
    v0 = &v1;
    a0->field_18 = a0->field_18 | 0x800;
    v21 = *(long long *)(sub_1bc4cc(&a0->field_20, 0) + 8);
    v22 = sub_1bc4cc(&a0->field_20, 0);
    v23 = sub_1bc4cc(&a0->field_20, 0);
    v24 = v21;
    if (*v22 == v23->field_8)
    {
        v25 = a0->field_8;
        if (v25 == v21)
            goto LABEL_1b0130;
        v3 = &v2;
        v2 = &v3;
        v10 = 0;
        v11 = 0;
        v12 = 0;
        v13 = 0;
        v14 = 0;
        v15 = 0;
        v16 = 0;
        v17 = 0;
        v4 = 0;
        v5 = 0;
        v7 = 0;
        v26 = sub_1ac850(a0->field_10, v21, v25, &v4, a0->field_18 | 96);
        sub_1b44f8(&a0->field_20, v21, v25, &v4, __ROL__(a0->field_18, 21) & 0xffe00001 & 1);
        v18 = &v4;
        sub_127c0(&v18);
        if (v26 & 1)
            return a0;
        v24 = v21 + 1;
    }
    v27 = a0->field_18;
    v28 = v27 | 128;
    a0->field_18 = v28;
    v3 = &v2;
    v2 = &v3;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v16 = 0;
    v17 = 0;
    v4 = 0;
    v5 = 0;
    v7 = 0;
    v29 = sub_1ac850(a0->field_10, v24, a0->field_8, &v4, v28);
    sub_1b44f8(&a0->field_20, v24, a0->field_8, &v4, __ROL__(v27, 21) & 0xffe00001 & 1);
    v18 = &v4;
    sub_127c0(&v18);
    if (v29 & 1)
    {
        a0->field_50 = v21;
        a0->field_60 = a0->field_58 != v21;
        return a0;
    }
LABEL_1b0130:
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v16 = _INSERT(CONCAT(v16, 0), 0, 0);
    *(unsigned long long *)((char *)&v16 + 8) = 0;
    v6 = 0;
    v8 = 0;
    v9 = 0;
    sub_1b1b2c(&a0->field_20);
    memset(&a0->field_20, 0, 16);
    *(unsigned long long *)&a0->padding_21[23] = 0;
    *(unsigned long long *)&a0->padding_21[31] = 0;
    *(unsigned long long *)&a0->padding_21[15] = 0;
    a0->padding_21[39] = 0;
    memset(&a0->field_50, 0, 0x11);
    memset(&a0->field_68, 0, 0x11);
    a0->field_80 = v16;
    v18 = &v4;
    sub_127c0(&v18);
    return a0;
}
