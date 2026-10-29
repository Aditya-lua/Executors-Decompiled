/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2c5dc..0xa2c604 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2c5dc_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a2c5dc_0;


st_a2c5dc_0 * sub_a2c5dc(st_a2c5dc_0 *a0, unsigned int a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c669c0();
        return 0;
    }
    a0->field_10 = a1;
    return 1;
}
