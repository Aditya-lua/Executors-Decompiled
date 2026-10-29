/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73c94..0xc73cc8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_bef1c8;
extern long long g_cb93c1;

void sub_c73c94(unsigned long a0, unsigned long a1)
{
    unsigned long long v9;  // x30
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v6 = &v8;
    v7 = v9;
    v0 = a0;
    v1 = a1;
    v2 = &v1;
    v3 = &g_bef1c8;
    v4 = &v0;
    v5 = &g_bef1c8;
    sub_c60250(&g_cb93c1);
}
