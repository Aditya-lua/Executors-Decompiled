/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa357a0..0xa357f4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f128c0;
extern long long g_f128c8;
extern long long g_f128d0;
extern long long g_f128d8;

unsigned long long sub_a357a0(void)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f128c0 == 1)
        sub_a7c240(&g_f128c8);
    sub_a7c1d0(g_f128d0);
    g_f128d0 = 0;
    v2 = sub_a66664(g_f128d8);
    g_f128d8 = 0;
    return v2;
}
