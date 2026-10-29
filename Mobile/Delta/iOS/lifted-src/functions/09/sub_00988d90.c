/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988d90..0x988db0 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988d90_0 {
    char padding_0[80];
    char field_50;
} st_988d90_0;


unsigned long long sub_988d90(st_988d90_0 *a0)
{
    unsigned long v0;  // x8

    v0 = a0->field_50;
    if (v0 >> 2 & 1)
        return 0;
    a0->field_50 = (char)v0 & 249;
    return 1;
}
