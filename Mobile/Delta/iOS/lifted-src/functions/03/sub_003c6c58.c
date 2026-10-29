/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6c58..0x3c6c98 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c6c58_1 {
    unsigned long long *field_0;
    unsigned long long field_8;
} st_3c6c58_1;

typedef struct st_3c6c58_0 {
    char field_0;
} st_3c6c58_0;


st_3c6c58_1 * sub_3c6c58(st_3c6c58_1 *a0)
{
    unsigned long long *v2;  // x8
    unsigned long v3;  // x9
    unsigned long long v4;  // x9
    st_3c6c58_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3c6c58_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0;
    v3 = a0->field_8 + 8;
    a0->field_8 = v3;
    if (v3 - *v2 == 0x1000)
    {
        v4 = v2[1];
        a0->field_0 = v2 + 1;
        a0->field_8 = v4;
    }
    return a0;
}
