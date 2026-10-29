/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa362f8..0xa3632c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f128c0;
extern long long g_f128c8;
extern unsigned int g_f129e4;

int sub_a362f8(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f128c0 = 1;
    g_f129e4 = sub_a6b7dc(&g_f128c8, 0);
    return g_f129e4;
}
