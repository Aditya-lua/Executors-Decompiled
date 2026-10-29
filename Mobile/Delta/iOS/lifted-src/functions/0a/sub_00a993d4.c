/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa993d4..0xa993fc (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a993d4_0 {
    struct st_a993d4_0 *field_0;
} st_a993d4_0;

extern st_a993d4_0 *g_f12f18;

void sub_a993d4(st_a993d4_0 **a0)
{
    if (!a0)
    {
        return;
    }
    else if ((int)g_f12f18 >= 0 && (int)g_f12f18 != *(int *)a0)
    {
        return;
    }
}
