/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9f40..0xad9f60 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9f40_0 {
    unsigned int field_0;
    char padding_4[20];
    unsigned long long field_18;
} st_ad9f40_0;


long long sub_ad9f40(st_ad9f40_0 *a0)
{
    if (1 < a0->field_0 - 1)
        return 0;
    return a0->field_18;
}
