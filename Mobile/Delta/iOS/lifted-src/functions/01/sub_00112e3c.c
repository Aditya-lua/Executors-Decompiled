/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x112e3c..0x112ed4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01898;
extern unsigned short g_f0189a;
extern unsigned short g_f0189c;
extern unsigned short g_f0189e;
extern unsigned long long g_f01930;
extern unsigned short g_f0e770;
extern unsigned short g_f0e772;
extern unsigned short g_f0e774;
extern unsigned short g_f0e776;

long long sub_112e3c(void)
{
    unsigned long v0;  // x0

    g_f0e770 = 0xe4ff;
    g_f0e772 = 11127;
    g_f0e774 = 9896;
    g_f0e776 = 7019;
    g_f01898 = g_f0e770 ^ g_f01898;
    g_f0189a = g_f0e772 ^ g_f0189a;
    g_f0189c = g_f0e774 ^ g_f0189c;
    g_f0189e = g_f0e776 ^ g_f0189e;
    g_f01930 = g_f01930 ^ 0x1b6b26a82b77e4ff;
    return v0;
}
