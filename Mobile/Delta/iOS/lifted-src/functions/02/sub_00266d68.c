/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x266d68..0x266e5c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f0d1f0;
extern unsigned long long g_f0d1f8;
extern unsigned long long g_f0d200;
extern unsigned long long g_f0d208;
extern uint128_t g_f0d210;
extern unsigned long long g_f0d220;
extern unsigned long long g_f11980;
extern unsigned long long g_f11988;
extern unsigned long long g_f11990;
extern unsigned long long g_f11998;
extern uint128_t g_f119a0;
extern unsigned long long g_f119b0;
extern unsigned long long g_f119b8;
extern unsigned long long g_f119c0;
extern unsigned long long g_f119c8;
extern unsigned long long g_f119d0;
extern uint128_t g_f119d8;
extern unsigned long long g_f119e8;

void sub_266d68(void)
{
    unsigned long long v10;  // d9
    unsigned long long v11;  // d8
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    uint128_t v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    sub_267948(sub_268d0c());
    v0 = __double_as_longlong(0) * 0x10000000000000000;
    g_f0d210 = v0;
    g_f0d1f0 = 0xc4ceb9fe1a85ec53;
    g_f0d1f8 = &g_f0d210;
    g_f0d200 = &g_f0d210;
    g_f0d208 = 0;
    g_f0d220 = 32;
    sub_268354(sub_266e90(___cxa_atexit(0x24f240, &g_f0d1f0, 0), &g_f0d1f0, 0));
    g_f119a0 = v0;
    g_f11980 = 0xc4ceb9fe1a85ec53;
    g_f11988 = &g_f119a0;
    g_f11990 = &g_f119a0;
    g_f11998 = 0;
    g_f119b0 = 32;
    ___cxa_atexit(0x26172c, &g_f11980, 0);
    g_f119d8 = v0;
    g_f119b8 = 0xc4ceb9fe1a85ec53;
    g_f119c0 = &g_f119d8;
    g_f119c8 = &g_f119d8;
    g_f119d0 = 0;
    g_f119e8 = 32;
    ___cxa_atexit();
    return;
}
