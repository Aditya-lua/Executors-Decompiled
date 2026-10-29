/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d0e4..0x3d144 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d0e4_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3d0e4_1;

typedef struct st_3d0e4_0 {
    char field_0;
} st_3d0e4_0;


st_3d0e4_1 * sub_3d0e4(st_3d0e4_1 *a0)
{
    st_3d0e4_1 *v4;  // x0
    st_3d0e4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d0e4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_18)
        return a0;
    v4 = sub_43360();
    a0->field_10 = 0;
    if (a0->field_8)
        v4 = _bzero(a0->field_0, a0->field_8 * 8);
    a0->field_18 = 0;
    return v4;
}
