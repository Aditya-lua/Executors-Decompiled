/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84d4..0x84f8 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_84d4_0 {
    unsigned int field_0;
    char padding_4[4];
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
} st_84d4_0;

extern unsigned int g_f00f50;

double sub_84d4(st_84d4_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q1

    a0->field_0 = g_f00f50;
    v0 = *a1;
    v1 = a1[1];
    *(uint128_t *)((char *)&a0->field_18 + 8) = a1[2];
    *(uint128_t *)((char *)&a0->field_8 + 8) = v1;
    *(uint128_t *)(a0->padding_4)[1] = v0;
    return (unsigned long long)v0;
}
