/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x73bc..0x740c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_73bc_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    char field_48;
    char padding_49[3];
    uint128_t field_4c;
} st_73bc_0;

extern char g_e60d78;
extern char g_e61360;
extern unsigned int g_f00cb0;

double sub_73bc(st_73bc_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, char a7)
{
    uint128_t v1;  // q0
    uint128_t *v0;  // [bp+0x0]

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00cb0;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60d78;
    *(unsigned long *)&a0->field_1c = a2;
    a0->field_20 = a3;
    a0->field_28 = a4;
    a0->field_30 = a5;
    a0->field_38 = a6;
    *(char *)&a0->field_40 = a7;
    v1 = *v0;
    *(uint128_t *)((char *)&a0->field_40 + 4) = v1;
    return (unsigned long long)v1;
}
