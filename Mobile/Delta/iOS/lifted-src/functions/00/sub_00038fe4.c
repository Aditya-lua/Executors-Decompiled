/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x38fe4..0x39028 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_38fe4_1 {
    long long field_0;
    char padding_8[4];
    int field_c;
} st_38fe4_1;

typedef struct st_38fe4_0 {
    char field_0;
} st_38fe4_0;


st_38fe4_1 * sub_38fe4(st_38fe4_1 *a0, unsigned int *a1)
{
    st_38fe4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_38fe4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_c >= 1)
        a0 = sub_2bea8(a0->field_0, *a1 + 1);
    return a0;
}
