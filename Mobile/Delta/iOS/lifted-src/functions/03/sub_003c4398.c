/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c4398..0x3c4464 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f02340;
extern char g_f02348;
extern unsigned short g_f02368;
extern unsigned short g_f0236a;
extern unsigned short g_f0236c;
extern unsigned short g_f0236e;
extern unsigned short g_f02370;
extern unsigned short g_f02372;
extern unsigned short g_f02374;
extern unsigned short g_f02376;
extern unsigned long long g_f02378;

long long sub_3c4398(void)
{
    unsigned long v0;  // x0

    if (g_f02348 & 1)
        return v0;
    g_f02348 = 1;
    g_f0236a = 37040;
    g_f0236c = 59506;
    g_f0236e = 30042;
    g_f02370 = 48808;
    g_f02368 = g_f0236a ^ g_f02368;
    g_f02372 = g_f0236c ^ g_f02372;
    g_f02374 = g_f0236e ^ g_f02374;
    g_f02376 = g_f02370 ^ g_f02376;
    g_f02378 = g_f02378 ^ 13738359696601026736;
    *(unsigned int *)&g_f02340 = 0;
    return v0;
}
