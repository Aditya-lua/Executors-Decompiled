/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174b9c..0x174c34 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02068;
extern unsigned short g_f0206a;
extern unsigned short g_f0206c;
extern unsigned short g_f0206e;
extern unsigned long long g_f020f0;
extern unsigned short g_f0fdb8;
extern unsigned short g_f0fdba;
extern unsigned short g_f0fdbc;
extern unsigned short g_f0fdbe;

long long sub_174b9c(void)
{
    unsigned long v0;  // x0

    g_f0fdb8 = 0xbff0;
    g_f0fdba = 20557;
    g_f0fdbc = 60817;
    g_f0fdbe = 51608;
    g_f02068 = g_f0fdb8 ^ g_f02068;
    g_f0206a = g_f0fdba ^ g_f0206a;
    g_f0206c = g_f0fdbc ^ g_f0206c;
    g_f0206e = g_f0fdbe ^ g_f0206e;
    g_f020f0 = g_f020f0 ^ 0xc998ed91504dbff0;
    return v0;
}
