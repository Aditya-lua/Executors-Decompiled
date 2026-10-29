/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffdf8..0x9ffe04 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffdf8_0 {
    char padding_0[128];
    unsigned int field_80;
} st_9ffdf8_0;


unsigned int sub_9ffdf8(st_9ffdf8_0 *a0, unsigned int a1)
{
    return a0->field_80 & a1;
}
