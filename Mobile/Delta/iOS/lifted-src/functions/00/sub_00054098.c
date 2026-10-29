/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54098..0x54100 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e68738;

unsigned long long * sub_54098(unsigned long long *a0)
{
    unsigned long long *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    *a0 = &g_e68738;
    sub_a070(a0 + 29);
    sub_a070(a0 + 24);
    sub_a070(a0 + 19);
    v0 = a0 + 16;
    sub_14fdc(&v0);
    sub_a070(a0 + 11);
    return a0;
}
