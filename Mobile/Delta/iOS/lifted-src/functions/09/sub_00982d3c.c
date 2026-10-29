/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982d3c..0x982d48 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982d3c_0 {
    char padding_0[88];
    char field_58;
} st_982d3c_0;


unsigned int sub_982d3c(st_982d3c_0 *a0)
{
    return __ROL__(a0->field_58, 29) & 3758096385 & 1;
}
