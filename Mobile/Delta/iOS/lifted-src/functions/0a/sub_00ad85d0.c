/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad85d0..0xad8608 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f12fb8;
extern long long g_f12fc0;

unsigned long long sub_ad85d0(void)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a66664(g_f12fc0);
    g_f12fc0 = 0;
    v2 = sub_a7c1d0(g_f12fb8);
    g_f12fb8 = 0;
    return v2;
}
