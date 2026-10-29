/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6984..0x69e4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6984_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    unsigned long long field_28;
    uint128_t field_30;
    unsigned int field_40;
    char padding_44[4];
    unsigned long long field_48;
    unsigned long long field_50;
    uint128_t field_58;
    uint128_t field_68;
} st_6984_0;

typedef struct st_6984_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_6984_1;

extern char g_e61050;
extern char g_e61360;
extern unsigned int g_f00d70;

double sub_6984(st_6984_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3, unsigned long a4, st_6984_1 *a5, uint128_t *a6, char a7, uint128_t *a8, unsigned long a9)
{
    unsigned int v0;  // w10
    uint128_t v1;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00d70;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e61050;
    *((char *)&a0->field_c + 12) = a7;
    *(unsigned long *)&a0->field_1c = a2;
    a0->field_20 = a3;
    v0 = a5->field_10;
    *(uint128_t *)&a0->field_28 = a5->field_0;
    *(unsigned int *)&a0->field_30 = v0;
    *(unsigned long *)((char *)&a0->field_30 + 8) = a9;
    *(unsigned long *)&a0->field_40 = a4;
    *(uint128_t *)&a0->field_48 = *a6;
    v1 = *a8;
    *(uint128_t *)&(&a0->field_50)[1] = v1;
    return (unsigned long long)v1;
}
