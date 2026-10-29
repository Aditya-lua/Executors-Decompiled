/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x44590..0x445e8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_44590_2 {
    char padding_0[32];
    long long field_20;
} st_44590_2;

typedef struct st_44590_0 {
    char field_0;
} st_44590_0;

typedef struct st_44590_1 {
    char padding_0[8];
    int field_8;
} st_44590_1;


long long sub_44590(st_44590_1 *a0, st_44590_2 *a1)
{
    st_44590_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_44590_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8 < 1)
        return 0;
    return sub_37060(&a0[15].padding_0[4], a1->field_20) != 2;
}
