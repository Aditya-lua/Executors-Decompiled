/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc76cd8..0xc76d10 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e0edf0;
extern long long g_efcfb0;

void sub_c76cd8(unsigned long a0, long long a1, long long a2)
{
    unsigned long long v5;  // x30
    unsigned long v0;  // [bp-0x20]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v0 = a0;
    v1 = &g_e0edf0;
    sub_c73a88(&v0, &g_efcfb0, &v1, &g_efcfb0, a1, a2);
}
