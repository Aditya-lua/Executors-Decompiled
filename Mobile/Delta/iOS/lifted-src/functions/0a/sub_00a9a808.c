/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9a808..0xa9a834 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f12f28;
extern char g_f12f30;

void sub_a9a808(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f12f28 = sub_a7c11c();
    *(unsigned int *)&g_f12f30 = g_f12f28 != 0;
    return;
}
