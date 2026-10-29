/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa198d4..0xa198e8 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a198d4_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[20];
    unsigned int field_34;
} st_a198d4_0;


long long sub_a198d4(st_a198d4_0 *a0, unsigned int a1)
{
    a0->field_34 = a1;
    if (!a0->field_18)
        return 0;
}
