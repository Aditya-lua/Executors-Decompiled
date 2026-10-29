/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18d0b0..0x18d148 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021c0;
extern unsigned short g_f021c2;
extern unsigned short g_f021c4;
extern unsigned short g_f021c6;
extern unsigned long long g_f022d0;
extern unsigned short g_f100f8;
extern unsigned short g_f100fa;
extern unsigned short g_f100fc;
extern unsigned short g_f100fe;

long long sub_18d0b0(void)
{
    unsigned long v0;  // x0

    g_f100f8 = 47920;
    g_f100fa = 64873;
    g_f100fc = 14264;
    g_f100fe = 57181;
    g_f021c0 = g_f100f8 ^ g_f021c0;
    g_f021c2 = g_f100fa ^ g_f021c2;
    g_f021c4 = g_f100fc ^ g_f021c4;
    g_f021c6 = g_f100fe ^ g_f021c6;
    g_f022d0 = g_f022d0 ^ 16095081910957095728;
    return v0;
}
