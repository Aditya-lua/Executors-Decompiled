/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b0e10..0x9b0e34 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b0e10_0 {
    char padding_0[2482];
    char field_9b2;
} st_9b0e10_0;


char sub_9b0e10(st_9b0e10_0 *a0)
{
    if (a0->field_9b2 >> 1 & 1)
        return 0;
}
