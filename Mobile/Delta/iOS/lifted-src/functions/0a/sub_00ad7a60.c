/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7a60..0xad7a7c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad7a60_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ad7a60_0;


long long sub_ad7a60(st_ad7a60_0 *a0)
{
    if (a0->field_0 != 6)
        return 0;
    return a0->field_8;
}
