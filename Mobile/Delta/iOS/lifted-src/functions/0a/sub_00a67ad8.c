/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67ad8..0xa67b48 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a680ec;
extern long long g_f08ef0;
extern char g_f12a90;
extern unsigned int g_f12a98;
extern long long g_f12be0;
extern char g_f12be8;

unsigned int sub_a67ad8(unsigned int a0)
{
    unsigned long long v3;  // x30
    unsigned int v4;  // x0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0)
        return a0;
    v0 = &v2;
    v1 = v3;
    v4 = 0;
    if (sub_a7c208(&g_f08ef0, &g_a680ec) && *(int *)&g_f12be8)
        v4 = sub_a7bbe0(&g_f12be0);
    if (!(!v4 & g_f12a90))
        return v4;
    return &g_f12a98;
}
