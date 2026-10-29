/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21641c..0x2164b4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029e8;
extern unsigned short g_f029ea;
extern unsigned short g_f029ec;
extern unsigned short g_f029ee;
extern unsigned long long g_f02af8;
extern unsigned short g_f11000;
extern unsigned short g_f11002;
extern unsigned short g_f11004;
extern unsigned short g_f11006;

long long sub_21641c(void)
{
    unsigned long v0;  // x0

    g_f11000 = 59878;
    g_f11002 = 17855;
    g_f11004 = 28903;
    g_f11006 = 20895;
    g_f029e8 = g_f11000 ^ g_f029e8;
    g_f029ea = g_f11002 ^ g_f029ea;
    g_f029ec = g_f11004 ^ g_f029ec;
    g_f029ee = g_f11006 ^ g_f029ee;
    g_f02af8 = g_f02af8 ^ 0x519f70e745bfe9e6;
    return v0;
}
