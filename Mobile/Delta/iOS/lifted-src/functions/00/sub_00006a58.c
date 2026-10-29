/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6a58..0x6abc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6a58_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    char field_48;
    char padding_49[3];
    uint128_t field_4c;
    char field_5c;
    char padding_5d[3];
    uint128_t field_60;
} st_6a58_0;

extern char g_e60db0;
extern char g_e61360;
extern unsigned int g_f00cc0;

double sub_6a58(st_6a58_0 *a0, uint128_t *a1, uint128_t *a2, uint128_t *a3, unsigned long a4, char a5, uint128_t *a6, char a7)
{
    uint128_t v1;  // q0
    uint128_t *v0;  // [bp+0x0]

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00cc0;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60db0;
    *(uint128_t *)&a0->field_1c = *a2;
    a0->field_20 = *a3;
    *(unsigned long *)&a0->field_30 = a4;
    *((char *)&a0->field_30 + 8) = a5;
    *(uint128_t *)((char *)&a0->field_30 + 12) = *a6;
    (a0->padding_49)[1] = a7;
    v1 = *v0;
    a0->field_4c = v1;
    return (unsigned long long)v1;
}
