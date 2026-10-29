/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0e8d8..0xb0ea30 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

int sub_b0e8d8(void* a0, void* a1, long long a2)
{
    unsigned long v7;  // x9
    uint128_t v0;  // [bp-0x70]
    uint128_t v1;  // [bp-0x60]
    uint128_t v2;  // [bp-0x50]
    uint128_t v3;  // [bp-0x40]
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    *(uint128_t *)&a0[96] = 0;
    *(uint128_t *)&a0[112] = 0;
    *(uint128_t *)&a0[64] = 0;
    *(uint128_t *)&a0[80] = 0;
    *(uint128_t *)&a0[32] = 0;
    *(uint128_t *)&a0[48] = 0;
    *(uint128_t *)a0 = 0xa54ff53a3c6ef372bb67ae856a09e667;
    *(uint128_t *)&a0[16] = 0x5be0cd191f83d9ab9b05688c510e527f;
    *(unsigned long long *)&a0[120] = *(char *)a1;
    v7 = *(int *)a1;
    *(unsigned int *)a0 = (unsigned int)v7 ^ 1779033703;
    *(unsigned int *)&a0[4] = (int)a1[4] ^ 3144134277;
    *(unsigned int *)&a0[8] = (int)a1[8] ^ 1013904242;
    *(unsigned int *)&a0[12] = (int)a1[12] ^ 0xa54ff53a;
    *(unsigned int *)&a0[16] = (int)a1[16] ^ 1359893119;
    *(unsigned int *)&a0[20] = (int)a1[20] ^ 2600822924;
    *(unsigned int *)&a0[24] = (int)a1[24] ^ 528734635;
    *(unsigned int *)&a0[28] = (int)a1[28] ^ 1541459225;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    ___memcpy_chk(&v0, a2, (v7 * 0x100000000000000 | v7 >> 8) & 0xff000000000000ff & 0xff, 64);
    sub_b0ea30(a0, &v0, 64);
    sub_a66ec0(&v0, 64);
    if (*(long long *)&g_10002b0 == v4)
        return 1;
    ___stack_chk_fail();
}
