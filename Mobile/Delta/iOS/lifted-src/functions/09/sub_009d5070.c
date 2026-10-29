/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5070..0x9d50a0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f0d550;

unsigned long long sub_9d5070(void)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_c044();
    v2 = sub_a7c1d0(g_f0d550);
    g_f0d550 = 0;
    return v2;
}
