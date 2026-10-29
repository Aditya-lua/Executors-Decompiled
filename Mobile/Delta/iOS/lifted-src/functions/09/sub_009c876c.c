/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c876c..0x9c87a4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e8a140[4];

long long sub_9c876c(unsigned int a0)
{
    if ((a0 & 0xfffffff7) == 258)
        a0 &= 10;
    if (a0 <= 30)
        return g_e8a140[a0];
    return "(unknown)";
}
