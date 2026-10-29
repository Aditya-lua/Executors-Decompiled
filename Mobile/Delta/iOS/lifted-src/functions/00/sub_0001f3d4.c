/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f3d4..0x1f440 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f3d4_1 {
    char padding_0[128];
    unsigned int field_80;
} st_1f3d4_1;

typedef struct st_1f3d4_0 {
    char field_0;
} st_1f3d4_0;


long long sub_1f3d4(st_1f3d4_1 *a0, unsigned int a1)
{
    unsigned int v4;  // w20
    st_1f3d4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1f3d4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_80;
    if (v4 != a1)
    {
        sub_1b310();
        return v4 == a1;
    }
    sub_f8d0();
    return v4 == a1;
}
