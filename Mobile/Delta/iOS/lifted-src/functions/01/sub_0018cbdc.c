/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18cbdc..0x18cc74 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021b8;
extern unsigned short g_f021ba;
extern unsigned short g_f021bc;
extern unsigned short g_f021be;
extern unsigned long long g_f022c8;
extern unsigned short g_f100f0;
extern unsigned short g_f100f2;
extern unsigned short g_f100f4;
extern unsigned short g_f100f6;

long long sub_18cbdc(void)
{
    unsigned long v0;  // x0

    g_f100f0 = 26540;
    g_f100f2 = 47790;
    g_f100f4 = 47353;
    g_f100f6 = 58575;
    g_f021b8 = g_f100f0 ^ g_f021b8;
    g_f021ba = g_f100f2 ^ g_f021ba;
    g_f021bc = g_f100f4 ^ g_f021bc;
    g_f021be = g_f100f6 ^ g_f021be;
    g_f022c8 = g_f022c8 ^ 16487600143545034668;
    return v0;
}
