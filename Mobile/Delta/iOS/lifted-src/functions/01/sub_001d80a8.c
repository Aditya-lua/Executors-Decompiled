/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d80a8..0x1d82c8 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d80a8_0 {
    char field_0;
} st_1d80a8_0;

typedef struct st_1d80a8_2 {
    unsigned long long field_0;
} st_1d80a8_2;

typedef struct st_1d80a8_1 {
    char padding_0[376];
    struct st_1d80a8_2 *field_178;
} st_1d80a8_1;

extern st_1d80a8_1 *g_f0d3d8;

void sub_1d80a8(unsigned long a0)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_1d80a8_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1d80a8_0 *v1;  // [bp-0x50]
    st_1d80a8_0 *v2;  // [bp-0x48]
    st_1d80a8_0 **v3;  // [bp-0x38], Other Possible Types: char
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = &v10;
    v9 = v15;
    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    g_f0d3d8->field_178();
}
