/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b070..0x97b090 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b070_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_97b070_0;


st_97b070_0 * sub_97b070(st_97b070_0 *a0, unsigned long a1)
{
    if ((a0->field_100 & 3) != 2)
        return a0;
}
