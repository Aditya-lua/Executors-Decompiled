/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa70ed8..0xa70ef8 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a70ed8_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    uint128_t field_18;
} st_a70ed8_0;


double sub_a70ed8(unsigned long a0, unsigned long a1)
{
    st_a70ed8_0 *v0;  // x8

    v0->field_0 = a0;
    v0->field_8 = 2;
    v0->field_10 = a1;
    *(uint128_t *)&(&v0->field_10)[1] = 0xffffffffffffffff0000000000000008;
    return 8;
}
