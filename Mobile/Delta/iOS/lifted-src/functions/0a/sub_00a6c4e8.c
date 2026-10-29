/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6c4e8..0xa6c564 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_a6c2e4;
extern unsigned long long g_f09018;

void sub_a6c4e8(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    if (a1)
        sub_a66ec0();
    if (g_f09018 != &g_a6c2e4)
        goto *((void *)(g_f09018));
}
