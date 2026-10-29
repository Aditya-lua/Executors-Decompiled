/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63590..0x63610 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e69c70;
extern char g_e69f28;
extern char g_e69f50;
extern char g_10001c8;

unsigned long long * sub_63590(unsigned long long *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0[14] = &g_e69f50;
    *a0 = &g_e69f28;
    a0[1] = &g_e69c70;
    a0[1] = &g_10001c8;
    return a0;
}
