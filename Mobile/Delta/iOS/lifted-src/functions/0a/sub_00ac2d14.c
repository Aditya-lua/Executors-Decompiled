/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2d14..0xac2d20 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2d14_0 {
    unsigned long long field_0;
    char field_8[14];
    char field_e;
} st_ac2d14_0;


st_ac2d14_0 * sub_ac2d14(st_ac2d14_0 *a0)
{
    a0->field_0 = 0;
    *(unsigned long long *)&a0->field_8[0] = 0;
    *(unsigned long long *)&a0->field_8[6] = 0;
    return a0;
}
