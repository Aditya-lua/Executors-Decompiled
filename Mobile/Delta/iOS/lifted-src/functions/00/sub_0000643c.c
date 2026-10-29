/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x643c..0x64a0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_643c_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
    char field_41;
    char padding_42[2];
    char field_44;
    char padding_45[15];
    char field_54;
    char padding_55[3];
    uint128_t field_58;
    unsigned int field_68;
} st_643c_0;

typedef struct st_643c_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_643c_1;

extern char g_e60d40;
extern char g_e61360;
extern unsigned int g_f00ca0;

double sub_643c(st_643c_0 *a0, uint128_t *a1, uint128_t *a2, uint128_t *a3, st_643c_1 *a4, char a5)
{
    unsigned int v0;  // w8
    uint128_t v1;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00ca0;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60d40;
    *(uint128_t *)&a0->field_1c = *a2;
    a0->field_20 = *a3;
    *(char *)&a0->field_30 = a5;
    *((char *)&a0->field_30 + 1) = 0;
    *((char *)&a0->field_30 + 4) = 0;
    a0->field_44 = 0;
    v0 = a4->field_10;
    v1 = a4->field_0;
    *(uint128_t *)&a0->padding_45[3] = v1;
    *(unsigned int *)(a0->padding_55)[1] = v0;
    return (unsigned long long)v1;
}
