/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd5c8..0xafd624 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f14310;

int sub_afd5c8(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_975ffc();
    if (!g_f14310)
        return 0;
    goto *((void *)(g_f14310));
}
