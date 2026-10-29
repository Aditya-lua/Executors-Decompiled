/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x17518c..0x175224 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02028;
extern unsigned short g_f0202a;
extern unsigned short g_f0202c;
extern unsigned short g_f0202e;
extern unsigned long long g_f020b0;
extern unsigned short g_f0fd78;
extern unsigned short g_f0fd7a;
extern unsigned short g_f0fd7c;
extern unsigned short g_f0fd7e;

long long sub_17518c(void)
{
    unsigned long v0;  // x0

    g_f0fd78 = 7382;
    g_f0fd7a = 28224;
    g_f0fd7c = 63388;
    g_f0fd7e = 62764;
    g_f02028 = g_f0fd78 ^ g_f02028;
    g_f0202a = g_f0fd7a ^ g_f0202a;
    g_f0202c = g_f0fd7c ^ g_f0202c;
    g_f0202e = g_f0fd7e ^ g_f0202e;
    g_f020b0 = g_f020b0 ^ 17666767689504267478;
    return v0;
}
