/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x113168..0x113200 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01890;
extern unsigned short g_f01892;
extern unsigned short g_f01894;
extern unsigned short g_f01896;
extern unsigned long long g_f01928;
extern unsigned short g_f0e768;
extern unsigned short g_f0e76a;
extern unsigned short g_f0e76c;
extern unsigned short g_f0e76e;

long long sub_113168(void)
{
    unsigned long v0;  // x0

    g_f0e768 = 21532;
    g_f0e76a = 33647;
    g_f0e76c = 42984;
    g_f0e76e = 8413;
    g_f01890 = g_f0e768 ^ g_f01890;
    g_f01892 = g_f0e76a ^ g_f01892;
    g_f01894 = g_f0e76c ^ g_f01894;
    g_f01896 = g_f0e76e ^ g_f01896;
    g_f01928 = g_f01928 ^ 2368233596146111516;
    return v0;
}
