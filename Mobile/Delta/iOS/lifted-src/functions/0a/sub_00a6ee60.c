/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ee60..0xa6ee78 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6ee60_0 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    char field_30;
} st_a6ee60_0;


st_a6ee60_0 * sub_a6ee60(st_a6ee60_0 *a0)
{
    unsigned long v0;  // x8

    a0->field_18 = 0;
    a0->field_20 = v0;
    a0->field_30 = a0->field_30 & 254;
    a0->field_10 = 0;
    return a0;
}
