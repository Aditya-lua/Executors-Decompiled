/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x214340..0x214e78 (2872 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_214340_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_214340_1;

typedef struct st_214340_0 {
    char field_0;
} st_214340_0;

typedef struct st_214340_5 {
    unsigned long long field_0;
} st_214340_5;

typedef struct st_214340_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_214340_2;

typedef struct st_214340_4 {
    char padding_0[376];
    struct st_214340_5 *field_178;
} st_214340_4;

typedef struct st_214340_3 {
    char padding_0[96];
    struct st_214340_2 *field_60;
} st_214340_3;

extern st_214340_3 *g_f0d198;
extern st_214340_4 *g_f0d3d8;

int sub_214340(st_214340_1 *a0)
{
    st_214340_0 **v0;  // [bp-0x100], Other Possible Types: char
    st_214340_0 *v1;  // [bp-0xf8]
    st_214340_0 *v2;  // [bp-0xc0]
    st_214340_0 **v3;  // [bp-0x80], Other Possible Types: char
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
