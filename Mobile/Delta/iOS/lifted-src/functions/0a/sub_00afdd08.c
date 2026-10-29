/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafdd08..0xafdd8c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f14370;
extern unsigned long long g_f14378;

unsigned long long sub_afdd08(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v2;  // x6
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a2d030();
    v2 = g_f14378;
    if (!g_f14378)
    {
        v2 = g_f14370;
        if (!g_f14370)
            return 0;
    }
    goto *((void *)(v2));
}
