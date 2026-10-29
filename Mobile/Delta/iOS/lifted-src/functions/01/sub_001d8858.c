/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d8858..0x1d8938 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d8858_1 {
    unsigned long long field_0;
    char padding_8[136];
    char field_90;
} st_1d8858_1;

typedef struct st_1d8858_2 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1d8858_2;

typedef struct st_1d8858_3 {
    char padding_0[88];
    struct st_1d8858_2 *field_58;
} st_1d8858_3;

typedef struct st_1d8858_0 {
    char field_0;
} st_1d8858_0;

typedef struct st_1d8858_5 {
    unsigned long long field_0;
} st_1d8858_5;

typedef struct st_1d8858_4 {
    char padding_0[280];
    struct st_1d8858_5 *field_118;
} st_1d8858_4;

extern st_1d8858_4 *g_f0d3d8;

void sub_1d8858(st_1d8858_3 *a0, st_1d8858_1 *a1)
{
    st_1d8858_2 *v4;  // x9
    st_1d8858_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1d8858_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1->field_90)
        return;
    v4 = a0->field_58;
    v4->field_0 = a1->field_0;
    v4->field_c = 8;
    a0->field_58 = a0->field_58 + 1;
    g_f0d3d8->field_118();
}
