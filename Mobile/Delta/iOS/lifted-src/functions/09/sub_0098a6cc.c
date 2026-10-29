/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a6cc..0x98a6e8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a6cc_0 {
    char padding_0[128];
    unsigned long long field_80;
    unsigned long long field_88;
    char padding_90[24];
    char field_a8;
} st_98a6cc_0;


char sub_98a6cc(st_98a6cc_0 *a0, unsigned long a1, unsigned long a2)
{
    if (a0->field_a8 >> 3 & 1)
        return 0;
    a0->field_80 = a1;
    a0->field_88 = a2;
    return 1;
}
