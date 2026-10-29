/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf0034..0xf01d4 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f0034_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_f0034_1;

typedef struct st_f0034_0 {
    char field_0;
} st_f0034_0;

typedef struct st_f0034_5 {
    unsigned long long field_0;
} st_f0034_5;

typedef struct st_f0034_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_f0034_2;

typedef struct st_f0034_4 {
    char padding_0[376];
    struct st_f0034_5 *field_178;
} st_f0034_4;

typedef struct st_f0034_3 {
    char padding_0[96];
    struct st_f0034_2 *field_60;
} st_f0034_3;

extern st_f0034_3 *g_f0d198;
extern st_f0034_4 *g_f0d3d8;

int sub_f0034(st_f0034_1 *a0)
{
    st_f0034_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_f0034_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    g_f0d3d8->field_178();
}
