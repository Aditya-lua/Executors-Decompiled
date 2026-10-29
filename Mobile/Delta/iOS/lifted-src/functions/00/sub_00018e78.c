/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18e78..0x18ec8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18e78_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_18e78_0;


st_18e78_0 * sub_18e78(st_18e78_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_18da0();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, 14757395258967641293 * ((long long)(a0->field_18 - v2) >> 3), 8);
    return a0;
}
