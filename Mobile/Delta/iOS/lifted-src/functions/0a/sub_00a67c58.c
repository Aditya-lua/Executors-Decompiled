/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67c58..0xa67cc4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f12a90;
extern long long g_f12a98;
extern long long g_f12b78;
extern long long g_f12be0;

int sub_a67c58(void)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12a90 != 1)
        return v3;
    sub_a6ba70(&g_f12a98);
    sub_a68678(&g_f12a98);
    sub_a6a0ac(&g_f12a98);
    sub_a7c1d0(g_f12a98);
    g_f12a98 = 0;
    sub_a7c240(&g_f12b78);
    v2 = sub_a7c240(&g_f12be0);
    g_f12a90 = 0;
    return v2;
}
