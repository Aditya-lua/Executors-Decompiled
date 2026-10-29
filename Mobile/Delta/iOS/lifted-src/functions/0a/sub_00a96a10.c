/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96a10..0xa96ab0 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a96a10(void* a0, void* a1, unsigned long long a2, unsigned long long a3)
{
    uint128_t v2;  // q0
    uint128_t v3;  // q2
    uint128_t v4;  // q0
    uint128_t v5;  // q1
    uint128_t v6;  // q3
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    uint128_t v9;  // q3
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(int128_t *)a1;
    v3 = (int128_t)a1[32];
    *(int128_t *)&a0[16] = (int128_t)a1[16];
    *(uint128_t *)&a0[32] = v3;
    *(uint128_t *)a0 = v2;
    v4 = (int128_t)a1[48];
    v5 = (int128_t)a1[64];
    v6 = (int128_t)a1[96];
    *(int128_t *)&a0[80] = (int128_t)a1[80];
    *(uint128_t *)&a0[96] = v6;
    *(uint128_t *)&a0[48] = v4;
    *(uint128_t *)&a0[64] = v5;
    v7 = (int128_t)a1[112];
    v8 = (int128_t)a1[128];
    v9 = (int128_t)a1[160];
    *(int128_t *)&a0[144] = (int128_t)a1[144];
    *(uint128_t *)&a0[160] = v9;
    *(uint128_t *)&a0[112] = v7;
    *(uint128_t *)&a0[128] = v8;
    if (a2)
        *(unsigned long long *)&a0[16] = a2;
    if (a3)
        *(unsigned long long *)&a0[24] = a3;
    if ((long long)a1[88])
    {
        v10 = sub_a6bf4c((long long)a1[48] * 16, "crypto/modes/ocb128.c", 203);
        *(unsigned long long *)&a0[88] = v10;
        if (!v10)
            return v10;
        _memcpy();
    }
    return 1;
}
