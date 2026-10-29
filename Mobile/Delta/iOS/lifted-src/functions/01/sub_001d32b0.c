/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d32b0..0x1d3310 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d32b0_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_1d32b0_2;

typedef struct st_1d32b0_1 {
    unsigned int field_0;
    char padding_4[12];
    struct st_1d32b0_0 *field_10;
    struct st_1d32b0_0 *field_18;
    char padding_20[48];
    unsigned long long field_50;
} st_1d32b0_1;

typedef struct st_1d32b0_0 {
    char field_0;
} st_1d32b0_0;


st_1d32b0_2 * sub_1d32b0(st_1d32b0_2 *a0, st_1d32b0_1 *a1)
{
    char *v2;  // x8
    st_1d32b0_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1d32b0_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a1->field_10;
    if (v2 != a1->field_18 && *v2)
    {
        a1->field_0 = 0xfffffc1d;
        a1->field_10 = v2 + 1;
        a1->field_50 = a0->field_8;
        return a0;
    }
    a1->field_0 = 0xfffffc1f;
    a1->field_50 = 0;
    return a0;
}
