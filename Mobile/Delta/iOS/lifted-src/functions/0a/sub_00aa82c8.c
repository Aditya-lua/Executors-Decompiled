/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa82c8..0xaa8344 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f12f60;
extern long long g_f12f68;
extern unsigned long long g_f12f70;
extern unsigned int g_f12f78;

long long sub_aa82c8(void)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7c11c();
    g_f12f68 = v2;
    if (!v2)
    {
        g_f12f78 = 0;
        return v2;
    }
    g_f12f70 = sub_a7c11c();
    if (g_f12f70)
    {
        v2 = sub_b4b228();
        if ((unsigned int)v2)
        {
            g_f12f60 = 1;
            g_f12f78 = 1;
            return v2;
        }
    }
    sub_a7c1d0();
    g_f12f70 = 0;
    v2 = sub_a7c1d0(g_f12f68);
    g_f12f68 = 0;
    g_f12f78 = 0;
    return v2;
}
