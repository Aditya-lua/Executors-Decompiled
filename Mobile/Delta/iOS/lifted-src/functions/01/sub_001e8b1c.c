/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e8b1c..0x1e8bb4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f027d8;
extern unsigned short g_f027da;
extern unsigned short g_f027dc;
extern unsigned short g_f027de;
extern unsigned long long g_f02800;
extern unsigned short g_f10de8;
extern unsigned short g_f10dea;
extern unsigned short g_f10dec;
extern unsigned short g_f10dee;

long long sub_1e8b1c(void)
{
    unsigned long v0;  // x0

    g_f10de8 = 7066;
    g_f10dea = 33268;
    g_f10dec = 50057;
    g_f10dee = 47396;
    g_f027d8 = g_f10de8 ^ g_f027d8;
    g_f027da = g_f10dea ^ g_f027da;
    g_f027dc = g_f10dec ^ g_f027dc;
    g_f027de = g_f10dee ^ g_f027de;
    g_f02800 = g_f02800 ^ 13341002991536446362;
    return v0;
}
