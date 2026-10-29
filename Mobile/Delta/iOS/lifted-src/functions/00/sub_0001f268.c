/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f268..0x1f2b8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f268_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_1f268_0;


st_1f268_0 * sub_1f268(st_1f268_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_19398();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, 12297829382473034411 * ((long long)(a0->field_18 - v2) >> 3), 8);
    return a0;
}
