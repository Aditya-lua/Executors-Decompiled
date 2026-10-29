/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x215e2c..0x215ec4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02a00;
extern unsigned short g_f02a02;
extern unsigned short g_f02a04;
extern unsigned short g_f02a06;
extern unsigned long long g_f02b10;
extern unsigned short g_f11018;
extern unsigned short g_f1101a;
extern unsigned short g_f1101c;
extern unsigned short g_f1101e;

long long sub_215e2c(void)
{
    unsigned long v0;  // x0

    g_f11018 = 52000;
    g_f1101a = 886;
    g_f1101c = 60710;
    g_f1101e = 16711;
    g_f02a00 = g_f11018 ^ g_f02a00;
    g_f02a02 = g_f1101a ^ g_f02a02;
    g_f02a04 = g_f1101c ^ g_f02a04;
    g_f02a06 = g_f1101e ^ g_f02a06;
    g_f02b10 = g_f02b10 ^ 4703989083334429472;
    return v0;
}
