/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18be2c..0x18bec4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02198;
extern unsigned short g_f0219a;
extern unsigned short g_f0219c;
extern unsigned short g_f0219e;
extern unsigned long long g_f022a8;
extern unsigned short g_f100d0;
extern unsigned short g_f100d2;
extern unsigned short g_f100d4;
extern unsigned short g_f100d6;

long long sub_18be2c(void)
{
    unsigned long v0;  // x0

    g_f100d0 = 63167;
    g_f100d2 = 9967;
    g_f100d4 = 48647;
    g_f100d6 = 64153;
    g_f02198 = g_f100d0 ^ g_f02198;
    g_f0219a = g_f100d2 ^ g_f0219a;
    g_f0219c = g_f100d4 ^ g_f0219c;
    g_f0219e = g_f100d6 ^ g_f0219e;
    g_f022a8 = g_f022a8 ^ 0xfa99be0726eff6bf;
    return v0;
}
