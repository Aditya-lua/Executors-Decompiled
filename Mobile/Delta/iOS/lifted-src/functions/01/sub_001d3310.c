/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3310..0x1d3354 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d3310_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_1d3310_0;


st_1d3310_0 * sub_1d3310(st_1d3310_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_1bf2fc();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, (long long)(a0->field_18 - v2) >> 1, 1);
    return a0;
}
