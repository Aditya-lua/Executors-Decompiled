/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ae384..0x2ae3b0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ae384_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_2ae384_0;


st_2ae384_0 * sub_2ae384(st_2ae384_0 *a0)
{
    if (a0->field_8 != 63)
    {
        a0->field_8 = a0->field_8 + 1;
        return a0;
    }
    a0->field_0 = a0->field_0 + 8;
    a0->field_8 = 0;
    return a0;
}
