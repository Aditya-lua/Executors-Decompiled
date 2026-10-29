/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x970bf0..0x970c24 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_970bf0_0 {
    char padding_0[944];
    unsigned int field_3b0;
} st_970bf0_0;


st_970bf0_0 * sub_970bf0(st_970bf0_0 *a0)
{
    if (!a0)
        return 0;
    memset(&a0->padding_0[832], 0, 128);
    a0->field_3b0 = 0x400;
    return 1;
}
