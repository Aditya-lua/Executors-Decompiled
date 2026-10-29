/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f8c..0x9fa4 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f8c_0 {
    unsigned int field_0;
    uint128_t field_4;
    unsigned int field_14;
    unsigned long long field_18;
} st_9f8c_0;


double sub_9f8c(st_9f8c_0 *a0, uint128_t *a1, unsigned int a2)
{
    uint128_t v0;  // q0

    a0->field_0 = a2;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_0)[1] = v0;
    *(unsigned int *)((char *)&a0->field_4 + 4) = 0;
    *(unsigned long long *)((char *)&a0->field_4 + 8) = 0;
    return (unsigned long long)v0;
}
