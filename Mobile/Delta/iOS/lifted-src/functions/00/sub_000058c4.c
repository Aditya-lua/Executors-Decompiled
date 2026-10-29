/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58c4..0x590c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_58c4_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    uint128_t field_28;
    unsigned long long field_38;
} st_58c4_0;

extern char g_e60f38;
extern char g_e61360;
extern unsigned int g_f00d30;

double sub_58c4(st_58c4_0 *a0, uint128_t *a1, unsigned long long *a2, uint128_t *a3, unsigned long a4)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00d30;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60f38;
    *(unsigned long long *)&a0->field_1c = *a2;
    v0 = *a3;
    *(uint128_t *)&a0->field_20 = v0;
    *(unsigned long *)((char *)&a0->field_28 + 8) = a4;
    return (unsigned long long)v0;
}
