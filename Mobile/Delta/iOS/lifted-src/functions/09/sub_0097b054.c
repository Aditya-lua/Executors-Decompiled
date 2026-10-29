/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b054..0x97b070 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b054_0 {
    char padding_0[256];
    char field_100;
} st_97b054_0;


st_97b054_0 * sub_97b054(st_97b054_0 *a0, unsigned long a1)
{
    if (a0->field_100 & 3)
        return a0;
}
