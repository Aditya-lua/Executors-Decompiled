/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123ffc..0x124094 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01988;
extern unsigned short g_f0198a;
extern unsigned short g_f0198c;
extern unsigned short g_f0198e;
extern unsigned long long g_f01a70;
extern unsigned short g_f0ea28;
extern unsigned short g_f0ea2a;
extern unsigned short g_f0ea2c;
extern unsigned short g_f0ea2e;

long long sub_123ffc(void)
{
    unsigned long v0;  // x0

    g_f0ea28 = 55635;
    g_f0ea2a = 45154;
    g_f0ea2c = 276;
    g_f0ea2e = 0x7800;
    g_f01988 = g_f0ea28 ^ g_f01988;
    g_f0198a = g_f0ea2a ^ g_f0198a;
    g_f0198c = g_f0ea2c ^ g_f0198c;
    g_f0198e = g_f0ea2e ^ g_f0198e;
    g_f01a70 = g_f01a70 ^ 8646912472921594195;
    return v0;
}
