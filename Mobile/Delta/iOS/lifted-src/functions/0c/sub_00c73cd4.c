/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73cd4..0xc73d04 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_bead78;
extern long long g_cba67f;

void sub_c73cd4(long long a0)
{
    unsigned long long v6;  // x30
    char *v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    char v2;  // [bp-0x11]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    v3 = &v5;
    v4 = v6;
    v0 = &v2;
    v1 = &g_bead78;
    sub_c73b38(&g_cba67f, &v0, a0);
}
