/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5926c..0xb59398 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_b5926c(long long a0, long long a1, long long a2)
{
    uint128_t v7;  // q2
    uint128_t v8;  // q2
    unsigned long long v9;  // x0
    uint128_t v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x70], Other Possible Types: uint128_t
    uint128_t v2;  // [bp-0x60], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x50], Other Possible Types: uint128_t
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if ((unsigned long long)a2 >= 65)
    {
        sub_a7d710(a0 + 456);
        sub_a7d544(a0 + 456, a1, a2);
        sub_a7d64c(&v0, a0 + 456);
    }
    else
    {
        ___memcpy_chk(&v0);
    }
    v7 = CONCAT(0x3636363636363636, 0x3636363636363636);
    v0 ^= v7;
    v1 ^= v7;
    v2 ^= v7;
    v3 ^= v7;
    sub_a7d710(a0 + 456);
    sub_a7d544(a0 + 456, &v0, 64);
    v8 = CONCAT(0x6a6a6a6a6a6a6a6a, 0x6a6a6a6a6a6a6a6a);
    v0 ^= v8;
    v1 ^= v8;
    v2 ^= v8;
    v3 ^= v8;
    sub_a7d710(a0 + 548);
    sub_a7d544(a0 + 548, &v0, 64);
    v9 = sub_a66ec0(&v0, 64);
    if (*(long long *)&g_10002b0 == v4)
        return v9;
    ___stack_chk_fail();
}
