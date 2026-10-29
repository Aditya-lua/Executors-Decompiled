/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4c090..0xb4c0b4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4c090_0 {
    char padding_0[28];
    char field_1c;
} st_b4c090_0;

extern char g_dfe660;
extern char g_eef7d8;

int sub_b4c090(st_b4c090_0 *a0)
{
    if (!a0)
    {
        return &g_eef7d8;
    }
    else if (!(a0->field_1c >> 1 & 1))
    {
        return &g_dfe660;
    }
    else
    {
        return &g_eef7d8;
    }
}
