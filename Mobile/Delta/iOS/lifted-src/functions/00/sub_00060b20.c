/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60b20..0x60b58 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e699d8;

long long sub_60b20(unsigned long a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = 24;
    if (a2 == 3)
        v0 = 0;
    v1 = 8;
    if (a2 == 5)
        v0 = v1;
    goto *((void *)(*(long long *)((char *)&g_e699d8 + v0)));
}
