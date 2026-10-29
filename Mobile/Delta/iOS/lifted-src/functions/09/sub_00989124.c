/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989124..0x98913c (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989124_0 {
    char padding_0[80];
    char field_50;
} st_989124_0;


st_989124_0 * sub_989124(st_989124_0 *a0, unsigned int a1)
{
    a0->field_50 = a0->field_50 & 0xfffffff7 | (char)(__ROL__(a1, 3)) & 8 & 15;
    return a0;
}
