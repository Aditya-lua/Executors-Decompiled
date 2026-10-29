/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5d14..0x9e5d24 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5d14_0 {
    char padding_0[20];
    unsigned int field_14;
} st_9e5d14_0;


st_9e5d14_0 * sub_9e5d14(st_9e5d14_0 *a0, unsigned int a1)
{
    a0->field_14 = a0->field_14 | a1;
    return a0;
}
