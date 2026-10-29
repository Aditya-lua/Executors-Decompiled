/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18d278..0x18d310 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02168;
extern unsigned short g_f0216a;
extern unsigned short g_f0216c;
extern unsigned short g_f0216e;
extern unsigned long long g_f02278;
extern unsigned short g_f100a0;
extern unsigned short g_f100a2;
extern unsigned short g_f100a4;
extern unsigned short g_f100a6;

long long sub_18d278(void)
{
    unsigned long v0;  // x0

    g_f100a0 = 35947;
    g_f100a2 = 43089;
    g_f100a4 = 50564;
    g_f100a6 = 6984;
    g_f02168 = g_f100a0 ^ g_f02168;
    g_f0216a = g_f100a2 ^ g_f0216a;
    g_f0216c = g_f100a4 ^ g_f0216c;
    g_f0216e = g_f100a6 ^ g_f0216e;
    g_f02278 = g_f02278 ^ 1966038410897493099;
    return v0;
}
