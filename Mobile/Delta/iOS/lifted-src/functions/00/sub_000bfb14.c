/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfb14..0xbfb58 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfb14_1 {
    char padding_0[1];
    char field_1;
} st_bfb14_1;

typedef struct st_bfb14_0 {
    char field_0;
} st_bfb14_0;


void sub_bfb14(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, st_bfb14_1 *a4)
{
    st_bfb14_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_bfb14_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a4->field_1)
    {
        sub_c0a60();
        return;
    }
    sub_c189c();
    return;
}
