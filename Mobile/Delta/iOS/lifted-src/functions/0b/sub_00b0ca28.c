/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0ca28..0xb0cb54 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b0ca28(void* a0, void* a1)
{
    *(uint128_t *)&a0[208] = 0;
    *(uint128_t *)&a0[224] = 0;
    *(uint128_t *)&a0[176] = 0;
    *(uint128_t *)&a0[192] = 0;
    *(uint128_t *)&a0[144] = 0;
    *(uint128_t *)&a0[160] = 0;
    *(uint128_t *)&a0[112] = 0;
    *(uint128_t *)&a0[128] = 0;
    *(uint128_t *)&a0[80] = 0;
    *(uint128_t *)&a0[96] = 0;
    *(uint128_t *)&a0[48] = 0;
    *(uint128_t *)&a0[64] = 0;
    *(uint128_t *)&a0[16] = 0;
    *(uint128_t *)&a0[32] = 0;
    *(uint128_t *)a0 = 0;
    *(uint128_t *)&a0[32] = 0x9b05688c2b3e6c1f510e527fade682d1;
    *(uint128_t *)&a0[48] = 0x5be0cd19137e21791f83d9abfb41bd6b;
    *(uint128_t *)a0 = 0xbb67ae8584caa73b6a09e667f3bcc908;
    *(uint128_t *)&a0[16] = 0xa54ff53a5f1d36f13c6ef372fe94f82b;
    *(unsigned long long *)&a0[232] = *(char *)a1;
    *(unsigned long long *)a0 = *(long long *)a1 ^ 7640891576956012808;
    *(unsigned long long *)&a0[8] = (long long)a1[8] ^ 13503953896175478587;
    *(unsigned long long *)&a0[16] = (long long)a1[16] ^ 4354685564936845355;
    *(unsigned long long *)&a0[24] = (long long)a1[24] ^ 0xa54ff53a5f1d36f1;
    *(unsigned long long *)&a0[32] = (long long)a1[32] ^ 0x510e527fade682d1;
    *(unsigned long long *)&a0[40] = (long long)a1[40] ^ 11170449401992604703;
    *(unsigned long long *)&a0[48] = (long long)a1[48] ^ 2270897969802886507;
    *(unsigned long long *)&a0[56] = (long long)a1[56] ^ 6620516959819538809;
    return 1;
}
