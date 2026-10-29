/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x590c..0x599c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_590c_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    uint128_t field_20;
    unsigned long long field_30;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    uint128_t field_68;
    unsigned long long field_78;
    uint128_t field_80;
    char field_90;
    char padding_91[3];
    uint128_t field_94;
    char padding_a4[4];
    unsigned long long field_a8;
} st_590c_0;

typedef struct st_590c_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_590c_1;

extern char g_e60f70;
extern char g_e61360;
extern unsigned int g_f00d40;

double sub_590c(st_590c_0 *a0, uint128_t *a1, uint128_t *a2, unsigned long long *a3, uint128_t *a4, uint128_t *a5, uint128_t *a6, st_590c_1 *a7, uint128_t *a8, char a9, uint128_t *a10, unsigned long a11)
{
    unsigned long long v0;  // x12
    uint128_t v1;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00d40;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60f70;
    *(uint128_t *)&a0->field_1c = *a2;
    *(unsigned long long *)&a0->field_20 = *a3;
    *(uint128_t *)((char *)&a0->field_20 + 8) = *a4;
    *(uint128_t *)&(&a0->field_30)[1] = *a5;
    *(uint128_t *)((char *)&a0->field_38 + 8) = *a6;
    v0 = a7->field_10;
    *(uint128_t *)((char *)&a0->field_48 + 8) = a7->field_0;
    *(unsigned long long *)((char *)&a0->field_58 + 8) = v0;
    a0->field_68 = *a8;
    *(char *)&a0->field_78 = a9;
    v1 = *a10;
    *(uint128_t *)((char *)&a0->field_78 + 4) = v1;
    *(unsigned long *)((char *)&a0->field_80 + 8) = a11;
    return (unsigned long long)v1;
}
