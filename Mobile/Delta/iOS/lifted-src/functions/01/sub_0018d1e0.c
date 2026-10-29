/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18d1e0..0x18d278 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02158;
extern unsigned short g_f0215a;
extern unsigned short g_f0215c;
extern unsigned short g_f0215e;
extern unsigned long long g_f02268;
extern unsigned short g_f10090;
extern unsigned short g_f10092;
extern unsigned short g_f10094;
extern unsigned short g_f10096;

long long sub_18d1e0(void)
{
    unsigned long v0;  // x0

    g_f10090 = 37716;
    g_f10092 = 44496;
    g_f10094 = 51204;
    g_f10096 = 9773;
    g_f02158 = g_f10090 ^ g_f02158;
    g_f0215a = g_f10092 ^ g_f0215a;
    g_f0215c = g_f10094 ^ g_f0215c;
    g_f0215e = g_f10096 ^ g_f0215e;
    g_f02268 = g_f02268 ^ 2751074869814793044;
    return v0;
}
