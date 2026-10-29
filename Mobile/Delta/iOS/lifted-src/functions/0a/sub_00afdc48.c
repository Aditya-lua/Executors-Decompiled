/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafdc48..0xafdcb8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f14350;
extern unsigned long long g_f14358;

unsigned long long sub_afdc48(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v2;  // x5
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a2d030();
    v2 = g_f14358;
    if (!g_f14358)
    {
        v2 = g_f14350;
        if (!g_f14350)
            return 0;
    }
    goto *((void *)(v2));
}
