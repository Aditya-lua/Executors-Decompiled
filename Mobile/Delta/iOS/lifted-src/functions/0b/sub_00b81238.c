/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb81238..0xb812ec (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b81238(void* a0, uint128_t *a1)
{
    uint128_t v11;  // q1
    uint128_t v12;  // q0
    uint128_t v13;  // q1
    uint128_t v0;  // [bp-0xf0]
    unsigned long v1;  // [bp-0xe0]
    char v2;  // [bp-0xd8]
    uint128_t v3;  // [bp-0xa0]
    uint128_t v4;  // [bp-0x90]
    uint128_t v5;  // [bp-0x80]
    uint128_t v6;  // [bp-0x70]
    uint128_t v7;  // [bp-0x60], Other Possible Types: uint128_t
    char v8;  // [bp-0x50], Other Possible Types: unsigned long long
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    if (sub_b811b4(a1) & 1)
    {
        v11 = a1[1];
        *(uint128_t *)a0 = *a1;
        *(uint128_t *)&a0[16] = v11;
        v12 = a1[2];
        v13 = a1[3];
        *(uint128_t *)&a0[32] = v12;
        *(uint128_t *)&a0[48] = v13;
    }
    else
    {
        v3 = *a1;
        v4 = a1[1];
        v5 = a1[2];
        v6 = a1[3];
        v8 = 1;
        v0 = 0x80000000000000010000000000000006;
        v7 = 0x80000000000000010000000000000006;
        sub_b94fac(&v2, &v3, &v7, 13);
        v1 = 9;
        v8 = 0;
        v12 = v0;
        v7 = v12;
        sub_b94fac(a0 + 8, &v1, &v7, 14);
        *(unsigned long long *)a0 = 9;
    }
    return (unsigned long long)v12;
}
