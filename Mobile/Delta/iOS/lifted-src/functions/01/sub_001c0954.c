/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c0954..0x1c0994 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c0954_1 {
    unsigned long long *field_0;
    unsigned long long field_8;
} st_1c0954_1;

typedef struct st_1c0954_0 {
    char field_0;
} st_1c0954_0;


st_1c0954_1 * sub_1c0954(st_1c0954_1 *a0)
{
    unsigned long long *v2;  // x8
    unsigned long v3;  // x9
    unsigned long long v4;  // x9
    st_1c0954_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1c0954_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0;
    v3 = a0->field_8 + 96;
    a0->field_8 = v3;
    if (v3 - *v2 == 4032)
    {
        v4 = v2[1];
        a0->field_0 = v2 + 1;
        a0->field_8 = v4;
    }
    return a0;
}
