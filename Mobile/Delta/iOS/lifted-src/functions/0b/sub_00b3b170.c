/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3b170..0xb3b18c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_ee70c0[4];

long long sub_b3b170(unsigned int a0)
{
    return g_ee70c0[a0 & 7 | (__ROL__(a0, 25) & 4261412865 & 1) * 8];
}
