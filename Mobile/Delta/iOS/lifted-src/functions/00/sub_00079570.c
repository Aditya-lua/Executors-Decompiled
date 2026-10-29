/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79570..0x79590 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_79570_0 {
    char padding_0[1];
    char field_1;
} st_79570_0;


long long sub_79570(st_79570_0 *a0, unsigned int a1)
{
    if (a1 <= a0->field_1)
        return (unsigned long long)a0[4 + 4 * a1].padding_0;
    return 0;
}
