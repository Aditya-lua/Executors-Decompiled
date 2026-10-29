/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a38a4..0x2a3b28 (644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a38a4_0 {
    char field_0;
} st_2a38a4_0;

typedef struct st_2a38a4_2 {
    unsigned long long field_0;
} st_2a38a4_2;

typedef struct st_2a38a4_1 {
    char padding_0[376];
    struct st_2a38a4_2 *field_178;
} st_2a38a4_1;

extern st_2a38a4_1 *g_f0d3d8;

void sub_2a38a4(long long a0)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_2a38a4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_2a38a4_0 *v1;  // [bp-0x48]
    st_2a38a4_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_2a38a4_0 *v3;  // [bp-0x38]
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
    sub_3c5e8c();
    sub_3c5de4(a0, 8);
    v3 = &v2;
    v2 = &v3;
    g_f0d3d8->field_178();
}
