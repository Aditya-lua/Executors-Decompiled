/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa260e0..0xa261dc (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a260e0(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long v9;  // x0
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x70]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = 0;
    v6 = *(long long *)&g_10002b0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if (a1 && a2 && a3)
    {
        if (sub_9e42c8(&v4, a2, 4) && sub_9e42c8(&v2, a3, 4))
        {
            sub_a257a0(&v0, &v4, &v2);
            v9 = sub_9e4320(a1, &v0, 4) != 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecp_sm2p256.c", 600, "ecp_sm2p256_field_mul");
            sub_a36abc(16, 146, 0);
            v9 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail();
}
