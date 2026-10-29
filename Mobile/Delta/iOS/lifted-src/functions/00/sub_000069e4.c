/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x69e4..0x6a40 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_69e4_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_69e4_1;

typedef struct st_69e4_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    uint128_t field_38;
    unsigned int field_48;
    uint128_t field_4c;
    unsigned int field_5c;
} st_69e4_0;

extern char g_e60bb8;
extern char g_e61360;
extern unsigned int g_f00c30;

double sub_69e4(st_69e4_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3, unsigned long a4, st_69e4_1 *a5, st_69e4_1 *a6)
{
    uint128_t v0;  // q0
    unsigned int v1;  // w8
    uint128_t v2;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00c30;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60bb8;
    *(unsigned long *)&a0->field_1c = a2;
    a0->field_20 = a3;
    a0->field_28 = a4;
    v0 = a5->field_0;
    *(unsigned int *)((char *)&a0->field_38 + 8) = a5->field_10;
    *(uint128_t *)&a0->field_30 = v0;
    v1 = a6->field_10;
    v2 = a6->field_0;
    *(uint128_t *)((char *)&a0->field_38 + 12) = v2;
    (&a0->field_48)[3] = v1;
    return (unsigned long long)v2;
}
