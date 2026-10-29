/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x623b8..0x62444 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e69a98;
extern char g_e69ac0;
extern char g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

unsigned long long * sub_623b8(unsigned long long *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a0 = &g_e69a98;
    a0[16] = &g_e69ae8;
    a0[2] = &g_e69ac0;
    a0[3] = &g_e69c70;
    a0[3] = &g_10001c8;
    return a0;
}
