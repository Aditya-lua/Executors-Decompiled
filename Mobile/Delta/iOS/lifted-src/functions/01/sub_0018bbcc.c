/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18bbcc..0x18bc64 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021b0;
extern unsigned short g_f021b2;
extern unsigned short g_f021b4;
extern unsigned short g_f021b6;
extern unsigned long long g_f022c0;
extern unsigned short g_f100e8;
extern unsigned short g_f100ea;
extern unsigned short g_f100ec;
extern unsigned short g_f100ee;

long long sub_18bbcc(void)
{
    unsigned long v0;  // x0

    g_f100e8 = 59401;
    g_f100ea = 24630;
    g_f100ec = 14904;
    g_f100ee = 59970;
    g_f021b0 = g_f100e8 ^ g_f021b0;
    g_f021b2 = g_f100ea ^ g_f021b2;
    g_f021b4 = g_f100ec ^ g_f021b4;
    g_f021b6 = g_f100ee ^ g_f021b6;
    g_f022c0 = g_f022c0 ^ 16880118367144830985;
    return v0;
}
