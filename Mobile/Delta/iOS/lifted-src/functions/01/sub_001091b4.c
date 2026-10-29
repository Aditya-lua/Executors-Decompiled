/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1091b4..0x10924c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01630;
extern unsigned short g_f01632;
extern unsigned short g_f01634;
extern unsigned short g_f01636;
extern unsigned long long g_f01770;
extern unsigned short g_f0e148;
extern unsigned short g_f0e14a;
extern unsigned short g_f0e14c;
extern unsigned short g_f0e14e;

long long sub_1091b4(void)
{
    unsigned long v0;  // x0

    g_f0e148 = 15582;
    g_f0e14a = 11444;
    g_f0e14c = 1808;
    g_f0e14e = 48860;
    g_f01630 = g_f0e148 ^ g_f01630;
    g_f01632 = g_f0e14a ^ g_f01632;
    g_f01634 = g_f0e14c ^ g_f01634;
    g_f01636 = g_f0e14e ^ g_f01636;
    g_f01770 = g_f01770 ^ 13752875128133532894;
    return v0;
}
