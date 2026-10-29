/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d5de0..0x1d60c8 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d5de0_0 {
    char field_0;
} st_1d5de0_0;

typedef struct st_1d5de0_2 {
    unsigned long long field_0;
} st_1d5de0_2;

typedef struct st_1d5de0_1 {
    char padding_0[376];
    struct st_1d5de0_2 *field_178;
} st_1d5de0_1;

extern st_1d5de0_1 *g_f0d3d8;

void sub_1d5de0(unsigned long a0)
{
    unsigned long long v17;  // d9
    unsigned long long v18;  // d8
    unsigned long long v27;  // x20
    unsigned long long v28;  // x19
    unsigned long long v29;  // x30
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v21;  // x26
    unsigned long long v22;  // x25
    unsigned long long v23;  // x24
    unsigned long long v24;  // x23
    unsigned long long v25;  // x22
    unsigned long long v26;  // x21
    st_1d5de0_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_1d5de0_0 *v1;  // [bp-0x98]
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
    g_f0d3d8->field_178();
}
