/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6820c..0xa68354 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a680ec;
extern char g_def3a0;
extern long long g_f08ef0;
extern char g_f12a90;
extern long long g_f12be0;
extern char g_f12be8;

unsigned int sub_a6820c(unsigned long a0, unsigned int a1)
{
    unsigned int v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        v2 = 0;
        if (sub_a7c208(&g_f08ef0, &g_a680ec) && *(int *)&g_f12be8)
            v2 = sub_a7bbe0(&g_f12be0);
        if (!v2 && !(g_f12a90 & 1))
            return 0;
    }
    if (22 < a1)
        return 0;
    goto *((void *)(sub_a6824c + (&g_def3a0)[a1] * 4));
}
