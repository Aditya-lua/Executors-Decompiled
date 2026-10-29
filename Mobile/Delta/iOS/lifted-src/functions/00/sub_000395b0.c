/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x395b0..0x395f4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_395b0_2 {
    char padding_0[12];
    unsigned int field_c;
} st_395b0_2;

typedef struct st_395b0_1 {
    long long field_0;
    char padding_8[4];
    int field_c;
} st_395b0_1;

typedef struct st_395b0_0 {
    char field_0;
} st_395b0_0;


st_395b0_1 * sub_395b0(st_395b0_1 *a0, st_395b0_2 *a1)
{
    st_395b0_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_395b0_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_c >= 1)
        a0 = sub_2bea8(a0->field_0, a1->field_c + 1);
    return a0;
}
