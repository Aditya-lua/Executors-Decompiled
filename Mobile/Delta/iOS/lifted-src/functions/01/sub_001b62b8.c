/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b62b8..0x1b6354 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e6fcd8;

int sub_1b62b8(unsigned long long *a0)
{
    unsigned long long *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    *a0 = &g_e6fcd8;
    v0 = a0 + 0x11;
    sub_271a8(&v0);
    v0 = a0 + 14;
    sub_1d3498(&v0);
    v0 = a0 + 11;
    sub_1b7824(&v0);
    v0 = a0 + 8;
    sub_d18e4(&v0);
    v0 = a0 + 5;
    sub_d18e4(&v0);
    return operatordelete(sub_1b08a4(a0));
}
