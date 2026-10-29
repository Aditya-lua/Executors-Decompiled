/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18d310..0x18d3a8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021a8;
extern unsigned short g_f021aa;
extern unsigned short g_f021ac;
extern unsigned short g_f021ae;
extern unsigned long long g_f022b8;
extern unsigned short g_f100e0;
extern unsigned short g_f100e2;
extern unsigned short g_f100e4;
extern unsigned short g_f100e6;

long long sub_18d310(void)
{
    unsigned long v0;  // x0

    g_f100e0 = 2166;
    g_f100e2 = 47839;
    g_f100e4 = 47992;
    g_f100e6 = 61364;
    g_f021a8 = g_f100e0 ^ g_f021a8;
    g_f021aa = g_f100e2 ^ g_f021aa;
    g_f021ac = g_f100e4 ^ g_f021ac;
    g_f021ae = g_f100e6 ^ g_f021ae;
    g_f022b8 = g_f022b8 ^ 17272636598078343286;
    return v0;
}
