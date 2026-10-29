/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1990c..0xa19928 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1990c_0 {
    char padding_0[24];
    struct st_a1990c_0 *field_18;
    char padding_20[8];
    unsigned int field_28;
} st_a1990c_0;


unsigned int sub_a1990c(st_a1990c_0 *a0)
{
    if (!a0)
    {
        return 0xffffffff;
    }
    else if (a0->field_18)
    {
        return a0->field_18->field_28;
    }
    else
    {
        return 0xffffffff;
    }
}
