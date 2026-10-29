/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62368..0x623b8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62368_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[16];
    unsigned long long field_28;
    unsigned long long field_30;
    char padding_38[32];
    unsigned long long field_58;
    unsigned int field_60;
} st_62368_0;


unsigned long long sub_62368(st_62368_0 *a0)
{
    unsigned long v0;  // x8

    v0 = a0->field_60;
    if (v0 >> 4 & 1)
    {
        if (a0->field_30 <= a0->field_58)
            return a0->field_28;
        a0->field_58 = a0->field_30;
        return a0->field_28;
    }
    else if (!(v0 >> 3 & 1))
    {
        return 0;
    }
    else
    {
        return a0->field_10;
    }
}
