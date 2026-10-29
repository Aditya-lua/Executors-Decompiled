/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad8428..0xad8454 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f12fb0;
extern unsigned long long g_f12fb8;

void sub_ad8428(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f12fb8 = sub_a7c11c();
    *(unsigned int *)&g_f12fb0 = g_f12fb8 != 0;
    return;
}
