/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18bd94..0x18be2c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021a0;
extern unsigned short g_f021a2;
extern unsigned short g_f021a4;
extern unsigned short g_f021a6;
extern unsigned long long g_f022b0;
extern unsigned short g_f100d8;
extern unsigned short g_f100da;
extern unsigned short g_f100dc;
extern unsigned short g_f100de;

long long sub_18bd94(void)
{
    unsigned long v0;  // x0

    g_f100d8 = 35618;
    g_f100da = 62967;
    g_f100dc = 15559;
    g_f100de = 62759;
    g_f021a0 = g_f100d8 ^ g_f021a0;
    g_f021a2 = g_f100da ^ g_f021a2;
    g_f021a4 = g_f100dc ^ g_f021a4;
    g_f021a6 = g_f100de ^ g_f021a6;
    g_f022b0 = g_f022b0 ^ 17665154892906859298;
    return v0;
}
