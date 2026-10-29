/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafdcb8..0xafdd08 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f14360;
extern unsigned long long g_f14368;

void sub_afdcb8(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v2;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a2d030();
    v2 = g_f14368;
    if (!g_f14368)
    {
        v2 = g_f14360;
        if (!g_f14360)
            return;
    }
    goto *((void *)(v2));
}
