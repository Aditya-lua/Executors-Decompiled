/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x87cc..0x87e4 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_87cc_0 {
    unsigned int field_0;
    char padding_4[4];
    uint128_t field_8;
} st_87cc_0;

extern unsigned int g_f00f00;

double sub_87cc(st_87cc_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0

    a0->field_0 = g_f00f00;
    v0 = *a1;
    *(uint128_t *)(a0->padding_4)[1] = v0;
    return (unsigned long long)v0;
}
