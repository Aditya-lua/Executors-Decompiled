/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x219758..0x21a05c (2308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_219758_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_219758_1;

typedef struct st_219758_0 {
    char field_0;
} st_219758_0;

typedef struct st_219758_5 {
    unsigned long long field_0;
} st_219758_5;

typedef struct st_219758_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_219758_2;

typedef struct st_219758_4 {
    char padding_0[376];
    struct st_219758_5 *field_178;
} st_219758_4;

typedef struct st_219758_3 {
    char padding_0[96];
    struct st_219758_2 *field_60;
} st_219758_3;

extern st_219758_3 *g_f0d198;
extern st_219758_4 *g_f0d3d8;

int sub_219758(st_219758_1 *a0)
{
    st_219758_0 **v0;  // [bp-0x100], Other Possible Types: char
    st_219758_0 *v1;  // [bp-0xf8]
    st_219758_0 *v2;  // [bp-0xf0]
    st_219758_0 **v3;  // [bp-0xc0], Other Possible Types: char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    v2 = &v3;
    v3 = &v2;
    g_f0d3d8->field_178();
}
