/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e4dc..0xb5e530 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5e4dc_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[52];
    char field_54;
} st_b5e4dc_0;


char sub_b5e4dc(st_b5e4dc_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_54 & 1)
    {
        sub_a95e44(&a0[2].padding_20[46]);
        a0->field_18 = 16;
    }
    else if (sub_a95d28(&a0[2].padding_20[46]))
    {
        return 0;
    }
    return 1;
}
