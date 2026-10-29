/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8f54..0x9d8f78 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_d2daf8[4];

long long sub_9d8f54(unsigned long a0, unsigned int a1)
{
    if (11 < a1 - 1)
        return 0;
    return *(long long *)((char *)&g_d2daf8[a1] - 8);
}
