/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1db8c..0x1dbc8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1db8c_1 {
    char padding_0[32];
    char field_20;
} st_1db8c_1;

typedef struct st_1db8c_0 {
    char field_0;
} st_1db8c_0;


void sub_1db8c(st_1db8c_1 *a0)
{
    st_1db8c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1db8c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_20 != 1)
        return;
    *(char *)(sub_181a8() + 32) = 0;
    return;
}
