/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd20f0..0xd2188 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f012d6;
extern unsigned short g_f012d8;
extern unsigned short g_f012da;
extern unsigned short g_f012dc;
extern unsigned long long g_f01308;
extern unsigned short g_f0dc9a;
extern unsigned short g_f0dc9c;
extern unsigned short g_f0dc9e;
extern unsigned short g_f0dca0;

long long sub_d20f0(void)
{
    unsigned long v0;  // x0

    g_f0dc9a = 30333;
    g_f0dc9c = 20799;
    g_f0dc9e = 44388;
    g_f0dca0 = 1812;
    g_f012d6 = g_f0dc9a ^ g_f012d6;
    g_f012d8 = g_f0dc9c ^ g_f012d8;
    g_f012da = g_f0dc9e ^ g_f012da;
    g_f012dc = g_f0dca0 ^ g_f012dc;
    g_f01308 = g_f01308 ^ 510223304171157117;
    return v0;
}
