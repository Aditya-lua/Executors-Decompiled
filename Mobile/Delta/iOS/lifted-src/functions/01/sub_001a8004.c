/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8004..0x1a8068 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e70198;

unsigned long long * sub_1a8004(void)
{
    unsigned long long *v6;  // x0
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    long long v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_12ad0(&v3, 1);
    v2 = 1;
    *v6 = &g_e70198;
    v0 = 0;
    v1 = &v3;
    sub_2217c(&v0, 0);
    return v6;
}
