/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18cda4..0x18ce3c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02170;
extern unsigned short g_f02172;
extern unsigned short g_f02174;
extern unsigned short g_f02176;
extern unsigned long long g_f02280;
extern unsigned short g_f100a8;
extern unsigned short g_f100aa;
extern unsigned short g_f100ac;
extern unsigned short g_f100ae;

long long sub_18cda4(void)
{
    unsigned long v0;  // x0

    g_f100a8 = 9390;
    g_f100aa = 29302;
    g_f100ac = 17475;
    g_f100ae = 5590;
    g_f02170 = g_f100a8 ^ g_f02170;
    g_f02172 = g_f100aa ^ g_f02172;
    g_f02174 = g_f100ac ^ g_f02174;
    g_f02176 = g_f100ae ^ g_f02176;
    g_f02280 = g_f02280 ^ 1573520176286409902;
    return v0;
}
