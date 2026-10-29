/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb51788..0xb517ac (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b51788_0 {
    char padding_0[28];
    char field_1c;
} st_b51788_0;

extern char g_ef2880;
extern char g_ef2948;

int sub_b51788(st_b51788_0 *a0)
{
    if (!a0)
    {
        return &g_ef2948;
    }
    else if (!(a0->field_1c >> 1 & 1))
    {
        return &g_ef2880;
    }
    else
    {
        return &g_ef2948;
    }
}
