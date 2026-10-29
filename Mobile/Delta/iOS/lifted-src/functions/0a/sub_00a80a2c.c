/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80a2c..0xa80a88 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7e6c7f;
extern char g_800000;

long long sub_a80a2c(unsigned int a0, unsigned int a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned long long v2;  // w8
    unsigned long long v3;  // x9

    v0 = a0 + 127;
    v1 = v0 >> 7;
    if (&g_7e6c7f < v0)
        v2 = 0;
    else
        v2 = &(&g_800000)[11275 * v1] >> 24;
    if (a1 == 0x3ff00)
        v2 = ((v1 * 1025 + 0x200000) * 0x400 | v1 * 1025 + 0x200000 >> 22) & 0xfffffc0f & 15;
    if (0x3ff000 < a0 - v2 * a1 * 2)
        v3 = 0xff801fff;
    else
        v3 = 0;
    return v3 + a0 - v2 * a1 * 2;
}
