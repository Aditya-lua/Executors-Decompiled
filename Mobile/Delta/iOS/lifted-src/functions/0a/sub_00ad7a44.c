/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7a44..0xad7a60 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad7a44_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ad7a44_0;


long long sub_ad7a44(st_ad7a44_0 *a0)
{
    if (a0->field_0 != 5)
        return 0;
    return a0->field_8;
}
