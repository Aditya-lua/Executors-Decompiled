/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa809e8..0xa80a2c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7e6c7f;
extern char g_800000;

long long sub_a809e8(unsigned int a0, unsigned int a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v2;  // w8

    v0 = a0 + 127;
    v1 = v0 >> 7;
    if (&g_7e6c7f < v0)
        v2 = 0;
    else
        v2 = &(&g_800000)[11275 * v1] >> 24;
    if (a1 == 0x3ff00)
        return ((v1 * 1025 + 0x200000) * 0x400 | v1 * 1025 + 0x200000 >> 22) & 0xfffffc0f & 15;
    return v2;
}
