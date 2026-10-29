/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ade0..0xa6aeac (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f0d568;
extern long long g_f0d574;
extern unsigned long long g_f12bf0;
extern unsigned long long g_f12bf8;

unsigned long long sub_a6ade0(void)
{
    unsigned long long v3;  // x0
    unsigned long long len;  // x0
    unsigned long long v5;  // x0
    unsigned long v0;  // [bp-0x30], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = g_f0d568;
    sub_9d5b44(&g_f0d574, 128, "CPUINFO: OPENSSL_armcap=0x%x");
    v3 = _getenv("OPENSSL_armcap");
    if (v3)
    {
        len = _strlen(&g_f0d574);
        v0 = v3;
        sub_9d5b44((char *)&g_f0d574 + len, 128 - len, " env:%s");
    }
    if ((char)g_f12bf8)
        sub_a6db94(&g_f12bf8, " ", 0x200);
    v5 = sub_a6db94(&g_f12bf8, "os-specific", 0x200);
    g_f12bf0 = &g_f12bf8;
    return v5;
}
