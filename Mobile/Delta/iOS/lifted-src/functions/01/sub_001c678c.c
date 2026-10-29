/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c678c..0x1c67ac (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c678c_1 {
    char padding_0[8];
    uint128_t field_8;
    unsigned long long field_18;
} st_1c678c_1;

typedef struct st_1c678c_0 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
} st_1c678c_0;

extern char g_e701e0;

double sub_1c678c(st_1c678c_1 *a0, st_1c678c_0 *a1)
{
    uint128_t v0;  // q0

    a1->field_0 = &g_e701e0;
    v0 = *(int128_t *)(a0->padding_0)[1];
    *(long long *)((char *)&a1->field_8 + 8) = *(long long *)((char *)&a0->field_8 + 8);
    *(uint128_t *)&(&a1->field_0)[1] = v0;
    return (unsigned long long)v0;
}
