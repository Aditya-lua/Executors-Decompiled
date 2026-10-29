/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc76c78..0xc76cd8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c4108c;
extern long long g_cbae06;
extern long long g_efd650;

void sub_c76c78(unsigned long a0)
{
    unsigned long long v8;  // x20
    unsigned long long v9;  // x19
    unsigned long long v10;  // x30
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v3 = v8;
    v4 = v9;
    v5 = &v7;
    v6 = v10;
    v0 = 2 | a0 * 0x100000000;
    v1 = &v0;
    v2 = &g_c4108c;
    sub_c73b38(&g_cbae06, &v1, &g_efd650);
    __debugbreak();
}
