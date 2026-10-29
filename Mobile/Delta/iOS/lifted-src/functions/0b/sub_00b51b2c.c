/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb51b2c..0xb51b50 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b51b2c_0 {
    char padding_0[24];
    unsigned int field_18;
} st_b51b2c_0;

extern st_b51b2c_0 g_ef2a60;

st_b51b2c_0 * sub_b51b2c(st_b51b2c_0 *a0)
{
    if (!a0)
    {
        return 0;
    }
    else if (a0->field_18 == 0x8000)
    {
        return &g_ef2a60.padding_0[0];
    }
    else
    {
        return 0;
    }
}
