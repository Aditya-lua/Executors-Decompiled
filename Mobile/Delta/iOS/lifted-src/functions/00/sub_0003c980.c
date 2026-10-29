/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c980..0x3c9bc (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c980_1 {
    char padding_0[40];
    char field_28;
} st_3c980_1;

typedef struct st_3c980_0 {
    char field_0;
} st_3c980_0;


char sub_3c980(unsigned long a0, st_3c980_1 *a1)
{
    st_3c980_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_3c980_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(a1->field_28 & 1))
        sub_394b8();
    return 0;
}
