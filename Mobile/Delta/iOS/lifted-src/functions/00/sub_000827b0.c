/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x827b0..0x827e0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_827b0_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    unsigned long long field_28;
    char padding_30[12];
    int field_3c;
} st_827b0_0;


long long sub_827b0(st_827b0_0 *a0, unsigned long a1)
{
    if (a1 * 3 <= a0->field_28 - a0->field_18)
        return a0->field_3c > 128;
    return 0;
}
