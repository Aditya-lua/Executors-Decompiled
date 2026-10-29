/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20a78..0x20ac4 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20a78_0 {
    char padding_0[8];
    char field_8;
} st_20a78_0;


st_20a78_0 * sub_20a78(st_20a78_0 *a0, st_20a78_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 == 1)
        a0 = &a1[1].padding_0[7];
    if (!a1)
        return a0;
}
