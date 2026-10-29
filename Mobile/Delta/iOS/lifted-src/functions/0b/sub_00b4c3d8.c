/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4c3d8..0xb4c3fc (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4c3d8_0 {
    char padding_0[24];
    unsigned int field_18;
} st_b4c3d8_0;

extern st_b4c3d8_0 g_eef878;

st_b4c3d8_0 * sub_b4c3d8(st_b4c3d8_0 *a0)
{
    if (!a0)
    {
        return 0;
    }
    else if (a0->field_18 == 0x8000)
    {
        return &g_eef878.padding_0[0];
    }
    else
    {
        return 0;
    }
}
