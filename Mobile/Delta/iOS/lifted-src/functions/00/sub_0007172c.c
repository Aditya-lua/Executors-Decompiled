/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7172c..0x71798 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7172c_1 {
    unsigned int field_0;
    char field_4;
} st_7172c_1;

typedef struct st_7172c_0 {
    char field_0;
} st_7172c_0;


st_7172c_1 * sub_7172c(st_7172c_1 *a0, long long a1)
{
    st_7172c_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_7172c_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    sub_715e8(a1);
    sub_5ccc(a1, &v2);
    a0->field_0 = 0xf000000;
    a0->field_4 = 15;
    return a0;
}
