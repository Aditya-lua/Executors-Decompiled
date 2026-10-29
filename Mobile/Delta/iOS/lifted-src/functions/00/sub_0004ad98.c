/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ad98..0x4adf4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e677f0;

unsigned long long * sub_4ad98(unsigned long long *a0)
{
    unsigned long long *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    *a0 = &g_e677f0;
    sub_a070(a0 + 16);
    v0 = a0 + 12;
    sub_2a764(&v0);
    v0 = a0 + 8;
    sub_49f80(&v0);
    return a0;
}
