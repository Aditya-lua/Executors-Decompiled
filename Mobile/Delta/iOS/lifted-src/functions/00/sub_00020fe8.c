/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20fe8..0x2104c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20fe8_1 {
    char padding_0[128];
    unsigned int field_80;
} st_20fe8_1;

typedef struct st_20fe8_0 {
    char field_0;
} st_20fe8_0;


long long sub_20fe8(st_20fe8_1 *a0)
{
    st_20fe8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_20fe8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_80 != 58)
        return 0;
    sub_f8d0();
    return sub_12740(a0, 0);
}
