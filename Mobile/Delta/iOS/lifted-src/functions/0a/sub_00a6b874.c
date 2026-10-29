/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b874..0xa6b8a8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a6be30;
extern long long g_f08ff0;
extern char g_f12e70;

int sub_a6b874(void)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7c224(&g_f08ff0, &g_a6be30);
    *(unsigned int *)&g_f12e70 = v2 != 0;
    return v2;
}
