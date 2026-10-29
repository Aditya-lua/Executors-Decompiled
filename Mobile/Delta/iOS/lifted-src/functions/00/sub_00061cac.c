/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61cac..0x61d40 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e69a98;
extern char g_e69ac0;
extern char g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

void sub_61cac(unsigned long long *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    *(char **)((char *)a0 - 16) = &g_e69a98;
    a0[14] = &g_e69ae8;
    *a0 = &g_e69ac0;
    a0[1] = &g_e69c70;
    a0[1] = &g_10001c8;
}
