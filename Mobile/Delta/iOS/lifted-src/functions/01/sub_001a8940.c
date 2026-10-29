/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8940..0x1a8984 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a8940_0 {
    char padding_0[912];
    unsigned long long field_390;
} st_1a8940_0;

typedef struct st_1a8940_1 {
    char field_0;
} st_1a8940_1;


int sub_1a8940(st_1a8940_0 *a0)
{
    st_1a8940_1 **v0;  // [bp-0x20], Other Possible Types: char
    st_1a8940_1 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_390)
        return 0;
    return sub_1ad99c();
}
