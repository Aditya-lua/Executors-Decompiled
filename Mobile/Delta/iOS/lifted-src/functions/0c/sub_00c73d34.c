/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73d34..0xc73d64 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_be766c;
extern long long g_cba67f;

void sub_c73d34(unsigned long a0, unsigned long long a1)
{
    unsigned long long v7;  // x30
    unsigned long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v0 = a0;
    v1 = a1;
    v2 = &v0;
    v3 = &g_be766c;
    sub_c73b38(&g_cba67f, &v2);
}
