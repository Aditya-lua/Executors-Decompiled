/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0e808..0xb0e8d8 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b0e808(void* a0, void* a1)
{
    *(uint128_t *)&a0[96] = 0;
    *(uint128_t *)&a0[112] = 0;
    *(uint128_t *)&a0[64] = 0;
    *(uint128_t *)&a0[80] = 0;
    *(uint128_t *)&a0[32] = 0;
    *(uint128_t *)&a0[48] = 0;
    *(uint128_t *)a0 = 0xa54ff53a3c6ef372bb67ae856a09e667;
    *(uint128_t *)&a0[16] = 0x5be0cd191f83d9ab9b05688c510e527f;
    *(unsigned long long *)&a0[120] = *(char *)a1;
    *(unsigned int *)a0 = *(int *)a1 ^ 1779033703;
    *(unsigned int *)&a0[4] = (int)a1[4] ^ 3144134277;
    *(unsigned int *)&a0[8] = (int)a1[8] ^ 1013904242;
    *(unsigned int *)&a0[12] = (int)a1[12] ^ 0xa54ff53a;
    *(unsigned int *)&a0[16] = (int)a1[16] ^ 1359893119;
    *(unsigned int *)&a0[20] = (int)a1[20] ^ 2600822924;
    *(unsigned int *)&a0[24] = (int)a1[24] ^ 528734635;
    *(unsigned int *)&a0[28] = (int)a1[28] ^ 1541459225;
    return 1;
}
