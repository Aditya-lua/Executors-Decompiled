/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f794..0x7f7bc (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7f794_0 {
    char padding_0[2056];
    unsigned int field_808;
} st_7f794_0;


double sub_7f794(st_7f794_0 *a0)
{
    *(unsigned int *)&a0[2].padding_0[1504] = 8;
    *(unsigned long long *)&a0[2].padding_0[1496] = 17179869185;
    a0->field_808 = 0;
    *(unsigned int *)&a0[2].padding_0[1484] = 0;
    *(unsigned long long *)&a0[2].padding_0[1488] = 0;
    return 0;
}
