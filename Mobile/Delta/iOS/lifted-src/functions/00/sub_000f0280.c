/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf0280..0xf0330 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f0280_0 {
    char field_0;
} st_f0280_0;

typedef struct st_f0280_2 {
    unsigned long long field_0;
} st_f0280_2;

typedef struct st_f0280_1 {
    char padding_0[376];
    struct st_f0280_2 *field_178;
} st_f0280_1;

extern st_f0280_1 *g_f0d3d8;

void sub_f0280(unsigned long a0)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_f0280_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_f0280_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    g_f0d3d8->field_178();
}
