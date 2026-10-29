/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2054..0x1a20ec (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02410;
extern unsigned short g_f02412;
extern unsigned short g_f02414;
extern unsigned short g_f02416;
extern unsigned long long g_f02478;
extern unsigned short g_f105e8;
extern unsigned short g_f105ea;
extern unsigned short g_f105ec;
extern unsigned short g_f105ee;

long long sub_1a2054(void)
{
    unsigned long v0;  // x0

    g_f105e8 = 30790;
    g_f105ea = 48971;
    g_f105ec = 56080;
    g_f105ee = 19523;
    g_f02410 = g_f105e8 ^ g_f02410;
    g_f02412 = g_f105ea ^ g_f02412;
    g_f02414 = g_f105ec ^ g_f02414;
    g_f02416 = g_f105ee ^ g_f02416;
    g_f02478 = g_f02478 ^ 5495476835297491014;
    return v0;
}
