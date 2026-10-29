/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be7cc..0x1be858 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e70890;

unsigned long long * sub_1be7cc(long long a0)
{
    unsigned long long *v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x50]
    char *v2;  // [bp-0x48]
    long long v3;  // [bp-0x40]
    char v4;  // [bp-0x31]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v0 = sub_166ec(&v4, 1);
    v2 = &v4;
    v3 = 1;
    *v0 = &g_e70890;
    sub_1e524(v0 + 1, a0 + 8);
    v1 = 0;
    sub_2217c(&v1, 0);
    return v0;
}
