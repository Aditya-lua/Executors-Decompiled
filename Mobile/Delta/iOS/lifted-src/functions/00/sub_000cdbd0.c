/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcdbd0..0xcdc18 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_cdbd0(unsigned long a0, uint128_t *a1)
{
    unsigned long long v10;  // x30
    unsigned long v11;  // d0
    uint128_t v0;  // [bp-0x70]
    uint128_t v1;  // [bp-0x60]
    uint128_t v2;  // [bp-0x50]
    uint128_t v3;  // [bp-0x40]
    uint128_t *v4;  // [bp-0x30]
    uint128_t *v5;  // [bp-0x28]
    uint128_t *v6;  // [bp-0x20]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!a1)
    {
        sub_ce8b0();
        return v11;
    }
    v7 = &v9;
    v8 = v10;
    v0 = *a1;
    v1 = a1[1];
    v2 = a1[2];
    v3 = a1[3];
    v5 = 0;
    v6 = 0;
    v4 = 0;
    sub_ce8b0();
    return (unsigned long long)a1[2];
}
