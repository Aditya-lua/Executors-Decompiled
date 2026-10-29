/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffe04..0x9ffe14 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffe04_0 {
    char padding_0[128];
    unsigned int field_80;
} st_9ffe04_0;


st_9ffe04_0 * sub_9ffe04(st_9ffe04_0 *a0, unsigned int a1)
{
    a0->field_80 = a0->field_80 | a1;
    return a0;
}
