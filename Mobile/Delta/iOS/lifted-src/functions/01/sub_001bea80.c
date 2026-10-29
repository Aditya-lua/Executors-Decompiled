/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bea80..0x1beae0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bea80_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_1bea80_1;

typedef struct st_1bea80_0 {
    char field_0;
} st_1bea80_0;


st_1bea80_1 * sub_1bea80(st_1bea80_1 *a0)
{
    st_1bea80_1 *v4;  // x0
    st_1bea80_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1bea80_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_18)
        return a0;
    v4 = sub_1a42cc();
    a0->field_10 = 0;
    if (a0->field_8)
        v4 = _bzero(a0->field_0, a0->field_8 * 8);
    a0->field_18 = 0;
    return v4;
}
