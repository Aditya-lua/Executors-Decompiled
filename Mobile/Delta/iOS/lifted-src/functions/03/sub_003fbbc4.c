/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3fbbc4..0x3fbbe0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3fbbc4_0 {
    char padding_0[24];
    unsigned long long field_18;
    char field_20;
} st_3fbbc4_0;


unsigned long long sub_3fbbc4(st_3fbbc4_0 *a0)
{
    if (a0->field_20 != 1)
        return 0xffffffffffffffff;
    return a0->field_18;
}
