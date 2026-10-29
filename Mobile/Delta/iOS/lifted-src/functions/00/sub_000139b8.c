/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x139b8..0x13a08 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_139b8_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_139b8_0;


st_139b8_0 * sub_139b8(st_139b8_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_1f440();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, 12297829382473034411 * ((long long)(a0->field_18 - v2) >> 4), 8);
    return a0;
}
