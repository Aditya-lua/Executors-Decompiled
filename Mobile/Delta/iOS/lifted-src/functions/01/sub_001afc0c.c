/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1afc0c..0x1afc2c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1afc0c_0 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
} st_1afc0c_0;

typedef struct st_1afc0c_1 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
} st_1afc0c_1;

extern char g_e70728;

double sub_1afc0c(st_1afc0c_1 *a0, st_1afc0c_0 *a1)
{
    uint128_t v0;  // q0

    a1->field_0 = &g_e70728;
    v0 = *(int128_t *)(a0->padding_0)[1];
    *(int128_t *)((char *)&a1->field_8 + 8) = *(int128_t *)((char *)&a0->field_8 + 8);
    *(uint128_t *)&(&a1->field_0)[1] = v0;
    return (unsigned long long)v0;
}
