/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a6b8..0x98a6cc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a6b8_0 {
    char padding_0[168];
    char field_a8;
} st_98a6b8_0;


st_98a6b8_0 * sub_98a6b8(st_98a6b8_0 *a0)
{
    if (a0)
        a0->field_a8 = a0->field_a8 & 0xfffffff7;
    return a0;
}
