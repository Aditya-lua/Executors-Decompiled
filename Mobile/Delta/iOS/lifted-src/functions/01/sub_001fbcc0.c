/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fbcc0..0x1fbcf0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fbcc0_0 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[24];
    unsigned long long field_20;
} st_1fbcc0_0;


long long sub_1fbcc0(st_1fbcc0_0 *a0)
{
    if (a0->field_0 != 3)
    {
        return 0;
    }
    else if (a0->field_20)
    {
        return 0;
    }
    else
    {
        return (a0->field_4 & 0xfffffffe) == 58;
    }
}
