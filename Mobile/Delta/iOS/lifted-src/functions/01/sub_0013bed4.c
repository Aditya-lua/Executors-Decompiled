/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13bed4..0x13bf6c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01bc8;
extern unsigned short g_f01bca;
extern unsigned short g_f01bcc;
extern unsigned short g_f01bce;
extern unsigned long long g_f01cc8;
extern unsigned short g_f0ef00;
extern unsigned short g_f0ef02;
extern unsigned short g_f0ef04;
extern unsigned short g_f0ef06;

long long sub_13bed4(void)
{
    unsigned long v0;  // x0

    g_f0ef00 = 43075;
    g_f0ef02 = 3714;
    g_f0ef04 = 42730;
    g_f0ef06 = 61387;
    g_f01bc8 = g_f0ef00 ^ g_f01bc8;
    g_f01bca = g_f0ef02 ^ g_f01bca;
    g_f01bcc = g_f0ef04 ^ g_f01bcc;
    g_f01bce = g_f0ef06 ^ g_f01bce;
    g_f01cc8 = g_f01cc8 ^ 17279087919533041731;
    return v0;
}
