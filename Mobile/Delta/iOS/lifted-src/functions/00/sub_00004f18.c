/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f18..0x4fa8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4f18_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_4f18_1;

typedef struct st_4f18_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
    uint128_t field_58;
    unsigned long long field_68;
    char field_70;
    char padding_71[3];
    uint128_t field_74;
    char padding_84[4];
    unsigned long long field_88;
    unsigned long long field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
    uint128_t field_a8;
    unsigned int field_b8;
} st_4f18_0;

extern char g_e60988;
extern char g_e61360;
extern unsigned int g_f00ba0;

double sub_4f18(st_4f18_0 *a0, uint128_t *a1, uint128_t *a2, uint128_t *a3, uint128_t *a4, unsigned long a5, uint128_t *a6, char a7, uint128_t *a8, unsigned long a9, unsigned long a10, unsigned long long *a11, unsigned long a12, unsigned long a13, st_4f18_1 *a14)
{
    unsigned long long v0;  // x9
    unsigned int v1;  // w9
    uint128_t v2;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00ba0;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e60988;
    *(uint128_t *)a0->padding_1c = *a2;
    a0->field_20 = *a3;
    a0->field_30 = *a4;
    *(unsigned long *)&a0->field_40 = a5;
    *(uint128_t *)((char *)&a0->field_40 + 8) = *a6;
    (&a0->field_50)[1] = a12;
    *(char *)&a0->field_58 = a7;
    *(uint128_t *)((char *)&a0->field_58 + 4) = *a8;
    *(unsigned long *)&a0->field_70 = a13;
    *(unsigned long *)&a0->field_74 = a9;
    v0 = *a11;
    *(unsigned long *)((char *)&a0->field_74 + 8) = a10;
    *(unsigned long long *)a0->padding_84 = v0;
    v1 = a14->field_10;
    v2 = a14->field_0;
    *(uint128_t *)&a0->field_88 = v2;
    *(unsigned int *)&a0->field_98 = v1;
    return (unsigned long long)v2;
}
