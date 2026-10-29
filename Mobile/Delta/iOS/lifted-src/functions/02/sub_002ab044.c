/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ab044..0x2ab0f8 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ab044_1 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
} st_2ab044_1;

typedef struct st_2ab044_0 {
    char field_0;
} st_2ab044_0;


char * sub_2ab044(st_2ab044_1 *a0)
{
    st_2ab044_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2ab044_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    char v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    std::__1::to_string(a0->field_10 + 1);
    std::__1::to_string(a0->field_8);
    sub_2a9374(" at line ", &v3, ", column ", &v2);
    return &v3;
}
