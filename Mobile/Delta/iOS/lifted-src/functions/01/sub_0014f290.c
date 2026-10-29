/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f290..0x14f328 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e18;
extern unsigned short g_f01e1a;
extern unsigned short g_f01e1c;
extern unsigned short g_f01e1e;
extern unsigned long long g_f01e68;
extern unsigned short g_f0f7d8;
extern unsigned short g_f0f7da;
extern unsigned short g_f0f7dc;
extern unsigned short g_f0f7de;

long long sub_14f290(void)
{
    unsigned long v0;  // x0

    g_f0f7d8 = 27434;
    g_f0f7da = 41767;
    g_f0f7dc = 19008;
    g_f0f7de = 23730;
    g_f01e18 = g_f0f7d8 ^ g_f01e18;
    g_f01e1a = g_f0f7da ^ g_f01e1a;
    g_f01e1c = g_f0f7dc ^ g_f01e1c;
    g_f01e1e = g_f0f7de ^ g_f01e1e;
    g_f01e68 = g_f01e68 ^ 6679482838819498794;
    return v0;
}
