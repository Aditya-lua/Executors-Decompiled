/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe904c..0xe90cc (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f0dca8;
extern unsigned long long g_f0dcb0;
extern unsigned long long g_f0dcb8;
extern unsigned long long g_f0dcc0;
extern uint128_t g_f0dcc8;
extern unsigned long long g_f0dcd8;

void sub_e904c(void)
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
    g_f0dcc8 = __double_as_longlong(0) * 0x10000000000000000;
    g_f0dca8 = 0xc4ceb9fe1a85ec53;
    g_f0dcb0 = &g_f0dcc8;
    g_f0dcb8 = &g_f0dcc8;
    g_f0dcc0 = 0;
    g_f0dcd8 = 32;
    ___cxa_atexit(0xe2510, &g_f0dca8, 0);
    ___cxa_atexit();
    return;
}
