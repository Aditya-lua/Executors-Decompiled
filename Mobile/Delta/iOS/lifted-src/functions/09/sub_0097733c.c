/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97733c..0x977354 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97733c_0 {
    char padding_0[1568];
    unsigned long long field_620;
} st_97733c_0;


st_97733c_0 * sub_97733c(st_97733c_0 *a0)
{
    if (a0)
        a0 = (a0->field_620 & 7) == 1;
    return a0;
}
