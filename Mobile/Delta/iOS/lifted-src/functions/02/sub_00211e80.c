/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x211e80..0x213c2c (7596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_211e80_2 {
    char padding_0[2];
    char field_2;
    char padding_3[77];
    struct st_211e80_1 *field_50;
    char padding_58[32];
    unsigned long long field_78;
} st_211e80_2;

typedef struct st_211e80_1 {
    char padding_0[32];
    struct st_211e80_2 *field_20;
} st_211e80_1;

typedef struct st_211e80_0 {
    char field_0;
} st_211e80_0;

typedef struct st_211e80_4 {
    unsigned long long field_0;
} st_211e80_4;

typedef struct st_211e80_3 {
    char padding_0[376];
    struct st_211e80_4 *field_178;
} st_211e80_3;

extern st_211e80_3 *g_f0d3d8;

void sub_211e80(st_211e80_2 *a0)
{
    unsigned long long v17;  // d9
    unsigned long long v18;  // d8
    unsigned long long v27;  // x20
    unsigned long long v28;  // x19
    unsigned long long v29;  // x30
    st_211e80_1 *v30;  // x8
    unsigned long v31;  // x9
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v21;  // x26
    unsigned long long v22;  // x25
    unsigned long long v23;  // x24
    unsigned long long v24;  // x23
    unsigned long long v25;  // x22
    unsigned long long v26;  // x21
    st_211e80_0 **v0;  // [bp-0x120], Other Possible Types: char
    st_211e80_0 *v1;  // [bp-0x118]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v2 = v17;
    v3 = v18;
    v4 = v19;
    v5 = v20;
    v6 = v21;
    v7 = v22;
    v8 = v23;
    v9 = v24;
    v10 = v25;
    v11 = v26;
    v12 = v27;
    v13 = v28;
    v14 = &v16;
    v15 = v29;
    v1 = &v0;
    v0 = &v1;
    v30 = a0->field_50;
    v31 = a0->field_2;
    if (v31 >> 2 & 1)
    {
        a0->field_2 = (char)v31 & 251;
        a0->field_78 = v30->field_20;
        v30->field_20 = a0;
    }
    g_f0d3d8->field_178();
}
