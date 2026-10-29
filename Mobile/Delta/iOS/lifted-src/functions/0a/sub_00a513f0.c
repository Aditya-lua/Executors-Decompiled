/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa513f0..0xa51420 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a51420;
extern long long g_f12a38;

unsigned long long sub_a513f0(void)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad6958(g_f12a38, &g_a51420);
    g_f12a38 = 0;
    return v2;
}
