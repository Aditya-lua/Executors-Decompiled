/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x978500..0x978518 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_978500_0 {
    char padding_0[1568];
    unsigned long long field_620;
} st_978500_0;


st_978500_0 * sub_978500(st_978500_0 *a0)
{
    a0->field_620 = a0->field_620 & 0xfffff7ffefffffff;
    return a0;
}
