/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c8b0..0x18c948 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02190;
extern unsigned short g_f02192;
extern unsigned short g_f02194;
extern unsigned short g_f02196;
extern unsigned long long g_f022a0;
extern unsigned short g_f100c8;
extern unsigned short g_f100ca;
extern unsigned short g_f100cc;
extern unsigned short g_f100ce;

long long sub_18c8b0(void)
{
    unsigned long v0;  // x0

    g_f100c8 = 23132;
    g_f100ca = 34580;
    g_f100cc = 16193;
    g_f100ce = 12;
    g_f02190 = g_f100c8 ^ g_f02190;
    g_f02192 = g_f100ca ^ g_f02192;
    g_f02194 = g_f100cc ^ g_f02194;
    g_f02196 = g_f100ce ^ g_f02196;
    g_f022a0 = g_f022a0 ^ 3447250392210012;
    return v0;
}
