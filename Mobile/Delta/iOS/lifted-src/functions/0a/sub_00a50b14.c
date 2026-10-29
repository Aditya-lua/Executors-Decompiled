/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50b14..0xa50b24 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50b14_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a50b14_0;


int sub_a50b14(st_a50b14_0 *a0)
{
    if (a0)
        a0 = __ROL__(a0->field_10, 31) & 0x80000001 & 1;
    return (unsigned int)a0;
}
