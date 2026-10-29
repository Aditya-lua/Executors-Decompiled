/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada474..0xada490 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada474_0 {
    unsigned int field_0;
    char padding_4[44];
    unsigned long long field_30;
} st_ada474_0;


long long sub_ada474(st_ada474_0 *a0)
{
    if (a0->field_0 != 2)
        return 0;
    return a0->field_30;
}
