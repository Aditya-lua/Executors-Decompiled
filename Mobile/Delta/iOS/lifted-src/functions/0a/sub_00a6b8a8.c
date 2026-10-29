/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b8a8..0xa6b8e4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f08ff0;

int sub_a6b8a8(void)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6b8e4(0, 1);
    v2 = sub_a7c240(&g_f08ff0);
    g_f08ff0 = 0xffffffffffffffff;
    return v2;
}
