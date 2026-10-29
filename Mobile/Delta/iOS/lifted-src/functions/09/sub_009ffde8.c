/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffde8..0x9ffdf8 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffde8_0 {
    char padding_0[128];
    unsigned int field_80;
} st_9ffde8_0;


st_9ffde8_0 * sub_9ffde8(st_9ffde8_0 *a0, unsigned int a1)
{
    a0->field_80 = a0->field_80 & ~a1;
    return a0;
}
