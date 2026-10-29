/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafdd8c..0xafdddc (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f14380;
extern unsigned long long g_f14388;

void sub_afdd8c(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v2;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a2d030();
    v2 = g_f14388;
    if (!g_f14388)
    {
        v2 = g_f14380;
        if (!g_f14380)
            return;
    }
    goto *((void *)(v2));
}
