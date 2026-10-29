/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13af48..0x13afc8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f0ee60;
extern unsigned long long g_f0ee68;
extern unsigned long long g_f0ee70;
extern unsigned long long g_f0ee78;
extern uint128_t g_f0ee80;
extern unsigned long long g_f0ee90;

void sub_13af48(void)
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
    g_f0ee80 = __double_as_longlong(0) * 0x10000000000000000;
    g_f0ee60 = 0xc4ceb9fe1a85ec53;
    g_f0ee68 = &g_f0ee80;
    g_f0ee70 = &g_f0ee80;
    g_f0ee78 = 0;
    g_f0ee90 = 32;
    ___cxa_atexit(0x137a44, &g_f0ee60, 0);
    ___cxa_atexit();
    return;
}
