/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x228368..0x228400 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02bc8;
extern unsigned short g_f02bca;
extern unsigned short g_f02bcc;
extern unsigned short g_f02bce;
extern unsigned long long g_f02c58;
extern unsigned short g_f11528;
extern unsigned short g_f1152a;
extern unsigned short g_f1152c;
extern unsigned short g_f1152e;

long long sub_228368(void)
{
    unsigned long v0;  // x0

    g_f11528 = 16702;
    g_f1152a = 0x9fe5;
    g_f1152c = 9666;
    g_f1152e = 2761;
    g_f02bc8 = g_f11528 ^ g_f02bc8;
    g_f02bca = g_f1152a ^ g_f02bca;
    g_f02bcc = g_f1152c ^ g_f02bcc;
    g_f02bce = g_f1152e ^ g_f02bce;
    g_f02c58 = g_f02c58 ^ 0xac925c29fe5413e;
    return v0;
}
