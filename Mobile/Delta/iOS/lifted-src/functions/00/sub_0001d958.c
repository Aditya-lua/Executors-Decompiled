/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d958..0x1d974 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d958_0 {
    char padding_0[128];
    unsigned int field_80;
} st_1d958_0;


long long sub_1d958(st_1d958_0 *a0)
{
    unsigned int v0;  // w9

    if (a0->field_80 == 59)
        v0 = 1;
    else
        v0 = 2;
    if (a0->field_80 != 44)
        return v0;
    return 0;
}
