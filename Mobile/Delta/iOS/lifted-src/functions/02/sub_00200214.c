/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x200214..0x200644 (1072 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_200214_0 {
    char field_0;
} st_200214_0;

typedef struct st_200214_2 {
    unsigned long long field_0;
} st_200214_2;

typedef struct st_200214_1 {
    char padding_0[376];
    struct st_200214_2 *field_178;
} st_200214_1;

extern st_200214_1 *g_f0d3d8;

void sub_200214(unsigned long a0)
{
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_200214_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_200214_0 *v1;  // [bp-0x70]
    st_200214_0 *v2;  // [bp-0x68]
    st_200214_0 **v3;  // [bp-0x48], Other Possible Types: char
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = &v12;
    v11 = v19;
    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    g_f0d3d8->field_178();
}
