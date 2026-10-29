/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa680ec..0xa68148 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f12a90;
extern long long g_f12a98;
extern long long g_f12be0;
extern unsigned int g_f12be8;

long long sub_a680ec(void)
{
    long long v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_a6b7dc(&g_f12be0, 0);
    if (v2)
    {
        v2 = (unsigned int)sub_a67cc4(&g_f12a98);
        if (v2)
        {
            g_f12a90 = 1;
            g_f12be8 = 1;
            return v2;
        }
        v2 = (unsigned int)sub_a7c240(&g_f12be0);
    }
    g_f12be8 = 0;
    return v2;
}
