/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60a74..0x60b20 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e699a8;

long long sub_60a74(unsigned long a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x9
    unsigned long long v3;  // x9

    v0 = 40;
    if (a2 - 1 < 2)
        v0 = 0;
    v1 = 8;
    if (a2 == 3)
        v0 = v1;
    v2 = 16;
    if (a2 == 4)
        v0 = v2;
    v3 = 32;
    if (a2 == 5)
        v0 = v3;
    goto *((void *)(*(long long *)((char *)&g_e699a8 + v0)));
}
