/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x163c48..0x163ce0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f38;
extern unsigned short g_f01f3a;
extern unsigned short g_f01f3c;
extern unsigned short g_f01f3e;
extern unsigned long long g_f01f90;
extern unsigned short g_f0fb40;
extern unsigned short g_f0fb42;
extern unsigned short g_f0fb44;
extern unsigned short g_f0fb46;

long long sub_163c48(void)
{
    unsigned long v0;  // x0

    g_f0fb40 = 30386;
    g_f0fb42 = 33331;
    g_f0fb44 = 7465;
    g_f0fb46 = 0x9898;
    g_f01f38 = g_f0fb40 ^ g_f01f38;
    g_f01f3a = g_f0fb42 ^ g_f01f3a;
    g_f01f3c = g_f0fb44 ^ g_f01f3c;
    g_f01f3e = g_f0fb46 ^ g_f01f3e;
    g_f01f90 = g_f01f90 ^ 10995570554340341426;
    return v0;
}
