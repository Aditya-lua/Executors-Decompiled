/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6acdc..0xa6ade0 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a6ade0;
extern char g_def584;
extern long long g_f08f00;
extern char g_f0d574;
extern char g_f0d57d;
extern unsigned long long g_f12bf0;

long long sub_a6acdc(int a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a7c208(&g_f08f00, &g_a6ade0);
    if (a0 > 1004)
    {
        if (a0 > 1006)
        {
            if (a0 == 1007)
            {
                return g_f12bf0;
            }
            else if (a0 == 1008 && g_f0d574)
            {
                return &g_f0d57d;
            }
        }
        else
        {
            if (a0 == 1005)
            {
                return "/";
            }
            else if (a0 == 1006)
            {
                return &g_def584;
            }
        }
    }
    else
    {
        if (1002 < a0 && a0 != 1003 && a0 == 1004)
            return ".dylib";
    }
    return 0;
}
