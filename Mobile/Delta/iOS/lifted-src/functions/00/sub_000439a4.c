/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x439a4..0x439e8 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_439a4_1 {
    long long field_0;
    char padding_8[4];
    int field_c;
} st_439a4_1;

typedef struct st_439a4_2 {
    char padding_0[20];
    unsigned int field_14;
} st_439a4_2;

typedef struct st_439a4_0 {
    char field_0;
} st_439a4_0;


st_439a4_1 * sub_439a4(st_439a4_1 *a0, st_439a4_2 *a1)
{
    st_439a4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_439a4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_c >= 1)
        a0 = sub_2bea8(a0->field_0, a1->field_14 + 1);
    return a0;
}
