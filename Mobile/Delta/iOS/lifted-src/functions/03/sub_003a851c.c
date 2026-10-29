/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a851c..0x3a85e8 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f03550;
extern char g_f03558;
extern unsigned short g_f03578;
extern unsigned short g_f0357a;
extern unsigned short g_f0357c;
extern unsigned short g_f0357e;
extern unsigned short g_f03580;
extern unsigned short g_f03582;
extern unsigned short g_f03584;
extern unsigned short g_f03586;
extern unsigned long long g_f03588;

long long sub_3a851c(void)
{
    unsigned long v0;  // x0

    if (g_f03558 & 1)
        return v0;
    g_f03558 = 1;
    g_f0357a = 32119;
    g_f0357c = 26485;
    g_f0357e = 41358;
    g_f03580 = 29216;
    g_f03578 = g_f0357a ^ g_f03578;
    g_f03582 = g_f0357c ^ g_f03582;
    g_f03584 = g_f0357e ^ g_f03584;
    g_f03586 = g_f03580 ^ g_f03586;
    g_f03588 = g_f03588 ^ 8223750552571706743;
    *(unsigned int *)&g_f03550 = 0;
    return v0;
}
