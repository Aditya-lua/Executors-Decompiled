/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aa0a0..0x1aa6cc (1580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aa0a0_0 {
    char field_0;
} st_1aa0a0_0;

typedef struct st_1aa0a0_2 {
    unsigned long long field_0;
} st_1aa0a0_2;

typedef struct st_1aa0a0_1 {
    char padding_0[312];
    struct st_1aa0a0_2 *field_138;
} st_1aa0a0_1;

extern st_1aa0a0_1 *g_f0d3d8;

void sub_1aa0a0(void)
{
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_1aa0a0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1aa0a0_0 *v1;  // [bp-0x38]
    st_1aa0a0_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_1aa0a0_0 *v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v4 = v9;
    v5 = v10;
    v6 = &v8;
    v7 = v11;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    g_f0d3d8->field_138();
}
