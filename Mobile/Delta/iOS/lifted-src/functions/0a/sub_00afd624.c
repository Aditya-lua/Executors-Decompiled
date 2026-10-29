/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd624..0xafd664 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f14328;

unsigned int sub_afd624(unsigned long a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_975ffc();
    if (!g_f14328)
        return 0xffffffff;
    goto *((void *)(g_f14328));
}
