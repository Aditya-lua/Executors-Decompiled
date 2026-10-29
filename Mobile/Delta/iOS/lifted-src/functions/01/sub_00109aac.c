/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109aac..0x109b78 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f01210;
extern char g_f01218;
extern unsigned short g_f01290;
extern unsigned short g_f01292;
extern unsigned short g_f01294;
extern unsigned short g_f01296;
extern unsigned short g_f01298;
extern unsigned short g_f0129a;
extern unsigned short g_f0129c;
extern unsigned short g_f0129e;
extern unsigned long long g_f012a0;

long long sub_109aac(void)
{
    unsigned long v0;  // x0

    if (g_f01218 & 1)
        return v0;
    g_f01218 = 1;
    g_f01292 = 24476;
    g_f01294 = 12737;
    g_f01296 = 39000;
    g_f01298 = 14014;
    g_f01290 = g_f01292 ^ g_f01290;
    g_f0129a = g_f01294 ^ g_f0129a;
    g_f0129c = g_f01296 ^ g_f0129c;
    g_f0129e = g_f01298 ^ g_f0129e;
    g_f012a0 = g_f012a0 ^ 3944757828182433692;
    *(unsigned int *)&g_f01210 = 0;
    return v0;
}
