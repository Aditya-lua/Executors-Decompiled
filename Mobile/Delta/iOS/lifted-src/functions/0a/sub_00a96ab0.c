/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96ab0..0xa96bfc (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a96ab0_0 {
    unsigned long long field_0;
} st_a96ab0_0;

extern char g_10002b0;

unsigned long long sub_a96ab0(st_a96ab0_0 **a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v6;  // 4153
    unsigned long long v7;  // 4109
    char *v8;  // x20
    char v0[16];  // [bp-0x90], Other Possible Types: uint128_t
    uint128_t v1;  // [bp-0x60]
    char v2;  // [bp-0x51]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = arm64g_calculate_condition(50, a2 - 16, 15, 0);
    if (!(v6 & 1))
    {
        v7 = arm64g_calculate_condition(50, a3 - 0x11, 16, 0);
        if (!(v7 & 1))
        {
            memset(a0 + 12, 0, 80);
            *v0 = (char)a3 * 16;
            *(unsigned long long *)&v0[1] = 0;
            v8 = &v0[-1 * a2];
            *(unsigned long long *)((char *)&v0 + 8) = 0;
            _memcpy(v8 + 16);
            v8[15] = v8[15] | 1;
            v1 = v0;
            v2 = *(char *)((void*)&v1 + 15) & 192;
            (*a0)();
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return 0xffffffff;
    ___stack_chk_fail();
}
