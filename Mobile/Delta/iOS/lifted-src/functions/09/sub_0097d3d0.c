/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97d3d0..0x97d424 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97d3d0_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_97d3d0_0;


unsigned short sub_97d3d0(st_97d3d0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_977368(a0->field_a0))
        return 1;
    sub_97724c(a0->field_a0);
    if (a0->field_150 >> 5 & 1)
        return sub_989df8() != 0;
    return 0;
}
