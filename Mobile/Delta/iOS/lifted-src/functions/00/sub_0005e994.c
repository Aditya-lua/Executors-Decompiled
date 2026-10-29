/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5e994..0x5e9d8 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5e994_1 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_5e994_1;

typedef struct st_5e994_0 {
    char field_0;
} st_5e994_0;


void sub_5e994(unsigned long a0, unsigned long a1)
{
    st_5e994_1 *v4;  // x0
    st_5e994_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_5e994_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_60194();
    v4->field_0 = 37;
    v4->field_8 = a1;
    return;
}
