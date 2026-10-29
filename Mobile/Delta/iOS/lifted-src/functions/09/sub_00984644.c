/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x984644..0x984670 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_d28570[4];

unsigned int sub_984644(unsigned long a0, unsigned int a1)
{
    unsigned long v0;  // x8

    v0 = *(char *)(a0 + a1 * 208 + 104);
    if (3 < v0)
        return 0xffffffff;
    return g_d28570[v0];
}
