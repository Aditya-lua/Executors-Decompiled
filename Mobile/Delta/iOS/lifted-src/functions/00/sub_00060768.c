/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60768..0x607ac (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e69988;

long long sub_60768(unsigned long a0, unsigned int a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = 24;
    if (a1 - 1 < 2)
        v0 = 0;
    v1 = 8;
    if (a1 == 5)
        v0 = v1;
    goto *((void *)(*(long long *)((char *)&g_e69988 + v0)));
}
