/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x767b8..0x76814 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_767b8(void)
{
    unsigned long long v0;  // [bp-0x3a0]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v0 = 876;
    sub_76818();
    if (*(long long *)&g_10002b0 == v1)
        return;
    ___stack_chk_fail();
}
