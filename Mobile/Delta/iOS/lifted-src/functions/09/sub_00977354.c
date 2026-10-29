/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x977354..0x977368 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_977354_0 {
    char padding_0[1568];
    unsigned long long field_620;
} st_977354_0;


long long sub_977354(st_977354_0 *a0)
{
    return (a0->field_620 & 7) == 4;
}
