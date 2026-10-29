/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62ef8..0x62f84 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e69a98;
extern char g_e69ac0;
extern char g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

void sub_62ef8(unsigned long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    *a0 = &g_e69a98;
    a0[16] = &g_e69ae8;
    a0[2] = &g_e69ac0;
    a0[3] = &g_e69c70;
    a0[3] = &g_10001c8;
}
