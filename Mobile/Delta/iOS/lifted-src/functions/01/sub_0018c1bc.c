/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c1bc..0x18c254 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02178;
extern unsigned short g_f0217a;
extern unsigned short g_f0217c;
extern unsigned short g_f0217e;
extern unsigned long long g_f02288;
extern unsigned short g_f100b0;
extern unsigned short g_f100b2;
extern unsigned short g_f100b4;
extern unsigned short g_f100b6;

long long sub_18c1bc(void)
{
    unsigned long v0;  // x0

    g_f100b0 = 29954;
    g_f100b2 = 50286;
    g_f100b4 = 49923;
    g_f100b6 = 4195;
    g_f02178 = g_f100b0 ^ g_f02178;
    g_f0217a = g_f100b2 ^ g_f0217a;
    g_f0217c = g_f100b4 ^ g_f0217c;
    g_f0217e = g_f100b6 ^ g_f0217e;
    g_f02288 = g_f02288 ^ 1181001948249093378;
    return v0;
}
