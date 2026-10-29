/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b2270..0x9b2334 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b2270_0 {
    char padding_0[360];
    uint128_t field_168;
    uint128_t field_178;
    uint128_t field_188;
    uint128_t field_198;
} st_9b2270_0;


uint128_t * sub_9b2270(st_9b2270_0 *a0, uint128_t **a1, long long a2, uint128_t *n)
{
    uint128_t *v2;  // x0
    uint128_t *v3;  // x8
    uint128_t v4;  // q1
    uint128_t *v5;  // x8
    uint128_t v6;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(n + 4, "ssl/statem/statem_lib.c", 0xb0b);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 2830, "construct_key_exchange_tbs");
        sub_9a58a4(a0, 80, 0x8000f, 0);
        return 0;
    }
    v3 = (char *)&a0->field_178 + 8;
    v4 = v3[1];
    *v2 = *v3;
    v2[1] = v4;
    v5 = (a0->padding_0)[1];
    v6 = v5[1];
    v2[2] = *v5;
    v2[3] = v6;
    _memcpy(v2 + 4, a2, n);
    *a1 = v2;
    return n + 4;
}
