/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa32f08..0xa32f34 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f0d558;
extern unsigned long long g_f0d560;

void sub_a32f08(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f0d560 = sub_a7c11c();
    *(unsigned int *)&g_f0d558 = g_f0d560 != 0;
    return;
}
