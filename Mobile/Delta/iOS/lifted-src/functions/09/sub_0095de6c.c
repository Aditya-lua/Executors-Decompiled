/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95de6c..0x95dec0 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_95dec0;
extern long long g_f08380;
extern char g_f12790;

unsigned long long sub_95de6c(unsigned long a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6afb8();
    if (!(unsigned int)v2)
        return v2;
    v3 = (unsigned int)sub_a7c208(&g_f08380, &g_95dec0);
    return v3 != 0 & g_f12790;
}
