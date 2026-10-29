/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2420..0xac2460 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2420_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_ac2420_0;


int sub_ac2420(st_ac2420_0 *a0)
{
    a0->field_0 = 0xbb67ae8584caa73b6a09e667f3bcc908;
    a0->field_10 = 0xa54ff53a5f1d36f13c6ef372fe94f82b;
    a0->field_20 = 0x9b05688c2b3e6c1f510e527fade682d1;
    a0->field_30 = 0x5be0cd19137e21791f83d9abfb41bd6b;
    a0->field_40 = 0;
    a0->field_48 = 0;
    *(double *)&a0[2].field_30 = 1.35807730622e-312;
    return 1;
}
