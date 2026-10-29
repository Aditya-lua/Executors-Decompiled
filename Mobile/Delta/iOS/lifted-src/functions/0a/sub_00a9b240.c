/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b240..0xa9b26c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f12f38;
extern char g_f12f50;

void sub_a9b240(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f12f38 = sub_a7c11c();
    *(unsigned int *)&g_f12f50 = g_f12f38 != 0;
    return;
}
