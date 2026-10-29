/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982cf4..0x982d30 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982cf4_1 {
    uint128_t field_0;
} st_982cf4_1;

typedef struct st_982cf4_0 {
    char padding_0[16];
    struct st_982cf4_1 *field_10;
    char padding_18[64];
    char field_58;
} st_982cf4_0;


double sub_982cf4(st_982cf4_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0
    uint128_t *v1;  // x8

    if (a1)
    {
        v0 = *a1;
        *(uint128_t *)&a0->field_10 = v0;
        v1 = (uint128_t *)(((int)a0->field_10 == 1) * 8);
    }
    else
    {
        v1 = (uint128_t *)0;
        *(unsigned int *)&a0->field_10 = 0;
    }
    a0->field_58 = a0->field_58 & 0xfffffff7 | v1;
    return (unsigned long long)v0;
}
