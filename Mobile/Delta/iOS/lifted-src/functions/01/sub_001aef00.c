/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aef00..0x1aef6c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aef00_0 {
    char padding_0[8];
    char field_8;
} st_1aef00_0;


st_1aef00_0 * sub_1aef00(st_1aef00_0 *a0, st_1aef00_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 == 1)
        a0 = &a1[3].padding_0[5];
    if (!a1)
        return a0;
}
