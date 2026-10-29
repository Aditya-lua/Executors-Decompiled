/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c08c..0x18c124 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02148;
extern unsigned short g_f0214a;
extern unsigned short g_f0214c;
extern unsigned short g_f0214e;
extern unsigned long long g_f02258;
extern unsigned short g_f10080;
extern unsigned short g_f10082;
extern unsigned short g_f10084;
extern unsigned short g_f10086;

long long sub_18c08c(void)
{
    unsigned long v0;  // x0

    g_f10080 = 21150;
    g_f10082 = 0x4ff0;
    g_f10084 = 51847;
    g_f10086 = 12562;
    g_f02148 = g_f10080 ^ g_f02148;
    g_f0214a = g_f10082 ^ g_f0214a;
    g_f0214c = g_f10084 ^ g_f0214c;
    g_f0214e = g_f10086 ^ g_f0214e;
    g_f02258 = g_f02258 ^ 0x3112ca874ff0529e;
    return v0;
}
