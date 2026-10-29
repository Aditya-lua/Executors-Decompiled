/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20f664..0x20f8a8 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20f664_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_20f664_1;

typedef struct st_20f664_0 {
    char field_0;
} st_20f664_0;

typedef struct st_20f664_5 {
    unsigned long long field_0;
} st_20f664_5;

typedef struct st_20f664_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_20f664_2;

typedef struct st_20f664_4 {
    char padding_0[376];
    struct st_20f664_5 *field_178;
} st_20f664_4;

typedef struct st_20f664_3 {
    char padding_0[96];
    struct st_20f664_2 *field_60;
} st_20f664_3;

extern st_20f664_3 *g_f0d198;
extern st_20f664_4 *g_f0d3d8;

int sub_20f664(st_20f664_1 *a0)
{
    st_20f664_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_20f664_0 *v1;  // [bp-0x68]
    st_20f664_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_20f664_0 *v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    v3 = &v2;
    v2 = &v3;
    g_f0d3d8->field_178();
}
