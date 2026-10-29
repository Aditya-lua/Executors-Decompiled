/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9613ec..0x961418 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9613ec_0 {
    char padding_0[8];
    struct st_9613ec_0 *field_8;
    char padding_10[8];
    struct st_9613ec_0 *field_18;
    char padding_20[1352];
    struct st_9613ec_0 *field_568;
} st_9613ec_0;


st_9613ec_0 * sub_9613ec(st_9613ec_0 *a0)
{
    st_9613ec_0 *v0;  // x8

    if (!a0)
    {
        return 0;
    }
    else if (a0->field_568)
    {
        return a0->field_568;
    }
    else
    {
        v0 = a0->field_8;
        if (!v0)
        {
            return 0;
        }
        else if (v0->field_18)
        {
            return v0->field_18;
        }
        else
        {
            return 0;
        }
    }
}
