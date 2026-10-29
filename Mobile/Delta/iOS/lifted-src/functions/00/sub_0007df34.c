/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7df34..0x7df74 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7df34_0 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[8];
    char field_38;
} st_7df34_0;


unsigned long long sub_7df34(st_7df34_0 *a0, unsigned long a1)
{
    unsigned long long v0;  // x0

    v0 = a0->field_28 - a1;
    if (a0->field_18 > v0)
    {
        a0->field_38 = 1;
        return 0;
    }
    if (a0->field_20 > v0)
        a0->field_20 = v0;
    a0->field_28 = v0;
    return v0;
}
