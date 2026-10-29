/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x977384..0x977390 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_977384_0 {
    char padding_0[1568];
    unsigned int field_620;
} st_977384_0;


unsigned int sub_977384(st_977384_0 *a0)
{
    return __ROL__(a0->field_620, 23) & 0xff800001 & 1;
}
