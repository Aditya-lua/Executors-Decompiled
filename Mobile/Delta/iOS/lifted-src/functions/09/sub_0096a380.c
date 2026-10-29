/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96a380..0x96a3a4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96a380_0 {
    char padding_0[2481];
    char field_9b1;
} st_96a380_0;


char sub_96a380(st_96a380_0 *a0)
{
    if (a0->field_9b1 >> 6 & 1)
        return 0;
}
