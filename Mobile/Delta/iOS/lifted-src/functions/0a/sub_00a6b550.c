/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b550..0xa6b57c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a6aeac;
extern char g_f12e34;

int sub_a6b550(void)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = _atexit(&g_a6aeac);
    *(unsigned int *)&g_f12e34 = !v2;
    return v2;
}
