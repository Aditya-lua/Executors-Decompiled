/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0bc58..0xb0bcb8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0bc58_0 {
    char padding_0[192];
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    uint128_t field_130;
    char field_140;
    char padding_141[127];
    uint128_t field_1c0;
    uint128_t field_1d0;
    uint128_t field_1e0;
    uint128_t field_1f0;
    uint128_t field_200;
    uint128_t field_210;
    uint128_t field_220;
    uint128_t field_230;
    unsigned long long field_240;
} st_b0bc58_0;


int sub_b0bc58(st_b0bc58_0 *a0, long long a1)
{
    uint128_t v2;  // q1
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_240 = 0;
    sub_9fc26c(a1, &a0->field_c0);
    sub_9fc26c(a1 + 8, &a0->field_140);
    v2 = a0->field_110;
    a0->field_200 = a0->field_100;
    a0->field_210 = v2;
    v3 = a0->field_130;
    a0->field_220 = a0->field_120;
    a0->field_230 = v3;
    v4 = a0->field_d0;
    a0->field_1c0 = a0->field_c0;
    a0->field_1d0 = v4;
    v5 = a0->field_f0;
    a0->field_1e0 = a0->field_e0;
    a0->field_1f0 = v5;
    return 1;
}
