/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5c38..0x9f5c88 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f127c0;
extern long long g_f127c8;
extern long long g_f127d8;

unsigned long long sub_9f5c38(void)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9f57b4(1);
    sub_a7c0a8(g_f127c0);
    g_f127c0 = 0;
    sub_ad6020(g_f127c8);
    g_f127c8 = 0;
    v2 = sub_ad6020(g_f127d8);
    g_f127d8 = 0;
    return v2;
}
