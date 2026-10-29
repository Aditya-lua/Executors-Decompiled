/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b7694..0x1b76ac (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b7694_1 {
    char padding_0[8];
    uint128_t field_8;
} st_1b7694_1;

typedef struct st_1b7694_0 {
    unsigned long long field_0;
    uint128_t field_8;
} st_1b7694_0;

extern char g_e70608;

double sub_1b7694(st_1b7694_1 *a0, st_1b7694_0 *a1)
{
    uint128_t v0;  // q0

    a1->field_0 = &g_e70608;
    v0 = *(int128_t *)(a0->padding_0)[1];
    *(uint128_t *)&(&a1->field_0)[1] = v0;
    return (unsigned long long)v0;
}
