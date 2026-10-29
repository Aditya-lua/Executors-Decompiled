/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd664..0xafd6ac (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f14320;

unsigned int sub_afd664(unsigned long a0, unsigned long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_975ffc();
    if (!g_f14320)
        return 0xffffffff;
    goto *((void *)(g_f14320));
}
