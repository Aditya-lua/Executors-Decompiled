/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2d508..0x2d54c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2d508_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_2d508_0;


st_2d508_0 * sub_2d508(st_2d508_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_2dc1c();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, (long long)(a0->field_18 - v2) >> 5, 8);
    return a0;
}
