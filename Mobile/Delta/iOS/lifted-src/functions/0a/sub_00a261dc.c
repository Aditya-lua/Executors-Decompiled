/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa261dc..0xa262b4 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a261dc(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long v7;  // x0
    uint128_t v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x70]
    uint128_t v2;  // [bp-0x60]
    uint128_t v3;  // [bp-0x50]
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = 0;
    v4 = *(long long *)&g_10002b0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if (a1 && a2)
    {
        if (sub_9e42c8(&v2, a2, 4))
        {
            sub_a25aa0(&v0, &v2);
            v7 = sub_9e4320(a1, &v0, 4) != 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecp_sm2p256.c", 622, "ecp_sm2p256_field_sqr");
            sub_a36abc(16, 146, 0);
            v7 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
}
