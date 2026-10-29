/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b4930..0x8b4988 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b4930_1 {
    unsigned long long *field_0;
    unsigned long long field_8;
} st_8b4930_1;

typedef struct st_8b4930_0 {
    char field_0;
} st_8b4930_0;


st_8b4930_1 * sub_8b4930(st_8b4930_1 *a0)
{
    unsigned long long *v2;  // x8
    unsigned long v3;  // x9
    st_8b4930_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_8b4930_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0;
    v3 = a0->field_8 + 64;
    a0->field_8 = v3;
    if ((-*v2 ^ v3) + (v3 + (-*v2 | ~v3)) * 2 == 0xffe)
    {
        a0->field_0 = v2 + 1;
        a0->field_8 = v2[1];
    }
    return a0;
}
