/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2274cc..0x227554 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f114b8;
extern unsigned long long g_f114c0;
extern unsigned long long g_f114c8;
extern unsigned long long g_f114d0;
extern uint128_t g_f114d8;
extern unsigned long long g_f114e8;

void sub_2274cc(void)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_2279b0(sub_228498());
    g_f114d8 = __double_as_longlong(0) * 0x10000000000000000;
    g_f114b8 = 0xc4ceb9fe1a85ec53;
    g_f114c0 = &g_f114d8;
    g_f114c8 = &g_f114d8;
    g_f114d0 = 0;
    g_f114e8 = 32;
    ___cxa_atexit(0x2192b0, &g_f114b8, 0);
    ___cxa_atexit();
    return;
}
