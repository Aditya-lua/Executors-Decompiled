/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18cd0c..0x18cda4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02188;
extern unsigned short g_f0218a;
extern unsigned short g_f0218c;
extern unsigned short g_f0218e;
extern unsigned long long g_f02298;
extern unsigned short g_f100c0;
extern unsigned short g_f100c2;
extern unsigned short g_f100c4;
extern unsigned short g_f100c6;

long long sub_18cd0c(void)
{
    unsigned long v0;  // x0

    g_f100c0 = 15864;
    g_f100c2 = 14143;
    g_f100c4 = 49282;
    g_f100c6 = 1406;
    g_f02188 = g_f100c0 ^ g_f02188;
    g_f0218a = g_f100c2 ^ g_f0218a;
    g_f0218c = g_f100c4 ^ g_f0218c;
    g_f0218e = g_f100c6 ^ g_f0218e;
    g_f02298 = g_f02298 ^ 395965482760355320;
    return v0;
}
