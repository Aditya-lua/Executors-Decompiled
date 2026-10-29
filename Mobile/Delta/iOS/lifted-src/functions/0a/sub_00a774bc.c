/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa774bc..0xa77554 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern uint128_t g_ea00b8;
extern uint128_t g_ea00c8;
extern uint128_t g_ea00d8;
extern uint128_t g_ea00e8;
extern uint128_t g_ea00f8;
extern char g_10002b0;

long long sub_a774bc(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long v9;  // x0
    unsigned long long v0;  // [bp-0x78]
    uint128_t v1;  // [bp-0x70]
    uint128_t v2;  // [bp-0x60], Other Possible Types: unsigned long long
    uint128_t v3;  // [bp-0x50]
    uint128_t v4;  // [bp-0x40]
    uint128_t v5;  // [bp-0x30]
    unsigned long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v0 = 0;
    v3 = g_ea00d8;
    v4 = g_ea00e8;
    v5 = g_ea00f8;
    v1 = g_ea00b8;
    v2 = g_ea00c8;
    v2 = "PEM";
    if (sub_a76f7c())
        v9 = (unsigned int)v0;
    else
        v9 = 0xffffffff;
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail(v9);
}
