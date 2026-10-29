/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982cb8..0x982cf4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982cb8_1 {
    uint128_t field_0;
} st_982cb8_1;

typedef struct st_982cb8_0 {
    struct st_982cb8_1 *field_0;
    char padding_8[80];
    char field_58;
} st_982cb8_0;


double sub_982cb8(st_982cb8_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0
    uint128_t *v1;  // x8

    if (a1)
    {
        v0 = *a1;
        *(uint128_t *)&a0->field_0 = v0;
        v1 = (uint128_t *)(((int)a0->field_0 == 1) * 4);
    }
    else
    {
        v1 = (uint128_t *)0;
        *(unsigned int *)&a0->field_0 = 0;
    }
    a0->field_58 = a0->field_58 & 0xfffffffb | v1;
    return (unsigned long long)v0;
}
