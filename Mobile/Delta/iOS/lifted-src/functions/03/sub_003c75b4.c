/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c75b4..0x3c7654 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f03840;
extern long long g_f03880;
extern long long g_f0d450;
extern long long g_f0d468;
extern long long g_f11d30;
extern char g_1000158;

void sub_3c75b4(void)
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
    ___cxa_atexit(&g_1000158, &g_f03840, 0);
    ___cxa_atexit(0x3c6790, &g_f11d30, 0);
    ___cxa_atexit(&g_1000158, &g_f03880, 0);
    ___cxa_atexit(0x3c640c, &g_f0d450, 0);
    std::__1::__shared_mutex_base::__shared_mutex_base(&g_f0d468);
    ___cxa_atexit();
    return;
}
