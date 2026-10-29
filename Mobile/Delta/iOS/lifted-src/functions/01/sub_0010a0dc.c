/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10a0dc..0x10a174 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01628;
extern unsigned short g_f0162a;
extern unsigned short g_f0162c;
extern unsigned short g_f0162e;
extern unsigned long long g_f01768;
extern unsigned short g_f0e140;
extern unsigned short g_f0e142;
extern unsigned short g_f0e144;
extern unsigned short g_f0e146;

long long sub_10a0dc(void)
{
    unsigned long v0;  // x0

    g_f0e140 = 56507;
    g_f0e142 = 19923;
    g_f0e144 = 34896;
    g_f0e146 = 50254;
    g_f01628 = g_f0e140 ^ g_f01628;
    g_f0162a = g_f0e142 ^ g_f0162a;
    g_f0162c = g_f0e144 ^ g_f0162c;
    g_f0162e = g_f0e146 ^ g_f0162e;
    g_f01768 = g_f01768 ^ 14145393358101798075;
    return v0;
}
