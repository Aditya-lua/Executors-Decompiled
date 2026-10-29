/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e94..0x4ed8 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4e94_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    uint128_t field_20;
    uint128_t field_30;
} st_4e94_0;

extern char g_e60de8;
extern char g_e61360;
extern unsigned int g_f00cd0;

double sub_4e94(st_4e94_0 *a0, uint128_t *a1, uint128_t *a2, uint128_t *a3)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00cd0;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60de8;
    *(uint128_t *)&a0->field_1c = *a2;
    v0 = *a3;
    a0->field_20 = v0;
    return (unsigned long long)v0;
}
