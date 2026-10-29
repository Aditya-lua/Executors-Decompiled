/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ffac..0xa6ffcc (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6ffac_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    uint128_t field_18;
} st_a6ffac_0;


double sub_a6ffac(unsigned long a0, unsigned long a1)
{
    st_a6ffac_0 *v0;  // x8

    v0->field_0 = a0;
    v0->field_8 = 1;
    v0->field_10 = a1;
    *(uint128_t *)&(&v0->field_10)[1] = 0xffffffffffffffff0000000000000004;
    return 4;
}
