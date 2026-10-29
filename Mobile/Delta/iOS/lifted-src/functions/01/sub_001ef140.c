/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ef140..0x1ef16c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ef140_0 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[24];
    unsigned long long field_20;
} st_1ef140_0;


long long sub_1ef140(st_1ef140_0 *a0)
{
    if (a0->field_0 != 3)
    {
        return 0;
    }
    else if (a0->field_20)
    {
        return a0->field_4 == 124;
    }
    else
    {
        return 0;
    }
}
