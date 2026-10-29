/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfed0..0xbfef4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfed0_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
} st_bfed0_0;


long long sub_bfed0(st_bfed0_0 *a0)
{
    if (a0->field_10 == a0->field_18)
        return a0->field_8 == 64;
    return 0;
}
