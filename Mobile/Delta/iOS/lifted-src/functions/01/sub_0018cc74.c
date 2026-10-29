/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18cc74..0x18cd0c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021f8;
extern unsigned short g_f021fa;
extern unsigned short g_f021fc;
extern unsigned short g_f021fe;
extern unsigned long long g_f02308;
extern unsigned short g_f10130;
extern unsigned short g_f10132;
extern unsigned short g_f10134;
extern unsigned short g_f10136;

long long sub_18cc74(void)
{
    unsigned long v0;  // x0

    g_f10130 = 42071;
    g_f10132 = 15339;
    g_f10134 = 44796;
    g_f10136 = 47419;
    g_f021f8 = g_f10130 ^ g_f021f8;
    g_f021fa = g_f10132 ^ g_f021fa;
    g_f021fc = g_f10134 ^ g_f021fc;
    g_f021fe = g_f10136 ^ g_f021fe;
    g_f02308 = g_f02308 ^ 13347454319002887255;
    return v0;
}
