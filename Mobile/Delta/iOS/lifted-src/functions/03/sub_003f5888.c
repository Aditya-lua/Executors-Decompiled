/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f5888..0x3f8c48 (13248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f5888_0 {
    char field_0;
} st_3f5888_0;

typedef struct st_3f5888_2 {
    unsigned long long field_0;
} st_3f5888_2;

typedef struct st_3f5888_1 {
    char padding_0[376];
    struct st_3f5888_2 *field_178;
} st_3f5888_1;

extern st_3f5888_1 *g_f0d3d8;
extern char g_10002b0;

void sub_3f5888(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v18;  // x28
    unsigned long long v19;  // x27
    unsigned long long v28;  // x30
    unsigned long long v20;  // x26
    unsigned long long v21;  // x25
    unsigned long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    st_3f5888_0 **v0;  // [bp-0x650], Other Possible Types: char
    st_3f5888_0 *v1;  // [bp-0x648]
    st_3f5888_0 *v2;  // [bp-0x580]
    st_3f5888_0 **v3;  // [bp-0x180], Other Possible Types: char
    unsigned long v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = &v17;
    v16 = v28;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    g_f0d3d8->field_178();
}
