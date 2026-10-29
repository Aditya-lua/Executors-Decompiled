/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x105070..0x105174 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_105070_0 {
    char field_0;
} st_105070_0;

typedef struct st_105070_2 {
    unsigned long long field_0;
} st_105070_2;

typedef struct st_105070_1 {
    char padding_0[376];
    struct st_105070_2 *field_178;
} st_105070_1;

extern st_105070_1 *g_f0d3d8;

void sub_105070(unsigned long a0)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_105070_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_105070_0 *v1;  // [bp-0x48]
    st_105070_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_105070_0 *v3;  // [bp-0x38]
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
    sub_127938();
    v3 = &v2;
    v2 = &v3;
    g_f0d3d8->field_178();
}
