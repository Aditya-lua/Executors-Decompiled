/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a628..0x4a68c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a628_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_4a628_1;

typedef struct st_4a628_0 {
    char field_0;
} st_4a628_0;


st_4a628_1 * sub_4a628(st_4a628_1 *a0)
{
    st_4a628_1 *v4;  // x0
    st_4a628_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_4a628_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0[1].padding_0 < a0->field_8 * 3 >> 2)
        return a0;
    v4 = sub_158b8();
    if (!v4)
        return sub_4a3e8(a0);
    return v4;
}
