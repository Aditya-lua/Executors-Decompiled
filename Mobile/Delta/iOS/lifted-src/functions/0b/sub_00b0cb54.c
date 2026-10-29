/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0cb54..0xb0cd10 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

int sub_b0cb54(void* a0, void* a1, long long a2)
{
    unsigned long v11;  // x9
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    uint128_t v2;  // [bp-0x90]
    uint128_t v3;  // [bp-0x80]
    uint128_t v4;  // [bp-0x70]
    uint128_t v5;  // [bp-0x60]
    uint128_t v6;  // [bp-0x50]
    uint128_t v7;  // [bp-0x40]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
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
    v11 = *(long long *)a1;
    *(unsigned long long *)a0 = v11 ^ 7640891576956012808;
    *(unsigned long long *)&a0[8] = (long long)a1[8] ^ 13503953896175478587;
    *(unsigned long long *)&a0[16] = (long long)a1[16] ^ 4354685564936845355;
    *(unsigned long long *)&a0[24] = (long long)a1[24] ^ 0xa54ff53a5f1d36f1;
    *(unsigned long long *)&a0[32] = (long long)a1[32] ^ 0x510e527fade682d1;
    *(unsigned long long *)&a0[40] = (long long)a1[40] ^ 11170449401992604703;
    *(unsigned long long *)&a0[48] = (long long)a1[48] ^ 2270897969802886507;
    *(unsigned long long *)&a0[56] = (long long)a1[56] ^ 6620516959819538809;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    ___memcpy_chk(&v0, a2, (v11 * 0x100000000000000 | v11 >> 8) & 0xff000000000000ff & 0xff, 128);
    sub_b0cd10(a0, &v0, 128);
    sub_a66ec0(&v0, 128);
    if (*(long long *)&g_10002b0 == v8)
        return 1;
    ___stack_chk_fail();
}
