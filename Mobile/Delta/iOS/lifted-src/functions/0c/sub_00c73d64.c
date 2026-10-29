/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73d64..0xc73dac (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_be766c;
extern unsigned long long g_be768c;
extern long long g_cb936d;

void sub_c73d64(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long long a3, long long a4)
{
    unsigned long long v11;  // x30
    unsigned long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    char *v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    char *v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v8 = &v10;
    v9 = v11;
    v0 = a0;
    v1 = a1;
    v2 = a2;
    v3 = a3;
    v4 = &v0;
    v5 = &g_be766c;
    v6 = &v2;
    v7 = &g_be768c;
    sub_c73b38(&g_cb936d, &v4, a4);
}
