/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18bc64..0x18bcfc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02180;
extern unsigned short g_f02182;
extern unsigned short g_f02184;
extern unsigned short g_f02186;
extern unsigned long long g_f02290;
extern unsigned short g_f100b8;
extern unsigned short g_f100ba;
extern unsigned short g_f100bc;
extern unsigned short g_f100be;

long long sub_18bc64(void)
{
    unsigned long v0;  // x0

    g_f100b8 = 56725;
    g_f100ba = 58774;
    g_f100bc = 16834;
    g_f100be = 2801;
    g_f02180 = g_f100b8 ^ g_f02180;
    g_f02182 = g_f100ba ^ g_f02182;
    g_f02184 = g_f100bc ^ g_f02184;
    g_f02186 = g_f100be ^ g_f02186;
    g_f02290 = g_f02290 ^ 788483715097877909;
    return v0;
}
