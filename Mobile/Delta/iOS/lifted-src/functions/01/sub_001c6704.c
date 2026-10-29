/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6704..0x1c672c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c6704_0 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_1c6704_0;

typedef struct st_1c6704_1 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_1c6704_1;

extern char g_e70848;

double sub_1c6704(st_1c6704_1 *a0, st_1c6704_0 *a1)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q1

    a1->field_0 = &g_e70848;
    v0 = *(int128_t *)(a0->padding_0)[1];
    v1 = *(int128_t *)((char *)&a0->field_8 + 8);
    *(long long *)((char *)&a1->field_18 + 8) = *(long long *)((char *)&a0->field_18 + 8);
    *(uint128_t *)((char *)&a1->field_8 + 8) = v1;
    *(uint128_t *)&(&a1->field_0)[1] = v0;
    return (unsigned long long)v0;
}
