/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b7b00..0x1b7b20 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b7b00_0 {
    unsigned long long field_0;
    uint128_t field_8;
    struct st_1b7b00_0 *field_18;
} st_1b7b00_0;

extern char g_e70608;

double sub_1b7b00(st_1b7b00_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0

    *(unsigned long long *)((char *)&a0->field_8 + 8) = 0;
    a0->field_0 = &g_e70608;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_0)[1] = v0;
    *(st_1b7b00_0 **)((char *)&a0->field_8 + 8) = a0;
    return (unsigned long long)v0;
}
