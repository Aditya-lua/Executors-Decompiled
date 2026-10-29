/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe7ba0..0xe7c10 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e7ba0_0 {
    char field_0;
} st_e7ba0_0;

extern long long g_f01360;
extern char g_f013a0;
extern char g_1000158;

char sub_e7ba0(void)
{
    char v4;  // w0
    char v5;  // w0
    st_e7ba0_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_e7ba0_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    /* unsupported instruction */;
    if (g_f013a0 & 1)
        return v5;
    v4 = ___cxa_guard_acquire(&g_f013a0);
    if (!v4)
        return v4;
    ___cxa_atexit(&g_1000158, &g_f01360, 0);
    return ___cxa_guard_release(&g_f013a0);
}
