/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8788..0x87a0 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8788_0 {
    unsigned int field_0;
    char padding_4[4];
    uint128_t field_8;
} st_8788_0;

extern unsigned int g_f00eb0;

double sub_8788(st_8788_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0

    a0->field_0 = g_f00eb0;
    v0 = *a1;
    *(uint128_t *)(a0->padding_4)[1] = v0;
    return (unsigned long long)v0;
}
