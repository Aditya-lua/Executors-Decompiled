/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4d88c..0xb4d8b0 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4d88c_0 {
    char padding_0[24];
    unsigned int field_18;
} st_b4d88c_0;

extern st_b4d88c_0 g_ef06b8;

st_b4d88c_0 * sub_b4d88c(st_b4d88c_0 *a0)
{
    if (!a0)
    {
        return 0;
    }
    else if (a0->field_18 == 0x8000)
    {
        return &g_ef06b8.padding_0[0];
    }
    else
    {
        return 0;
    }
}
