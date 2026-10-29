/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5b0c..0x5b48 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5b0c_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
    unsigned long long field_30;
} st_5b0c_0;

extern char g_e60e20;
extern char g_e61360;
extern unsigned int g_f00ce0;

double sub_5b0c(st_5b0c_0 *a0, uint128_t *a1, unsigned int a2, unsigned long a3, unsigned long a4)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00ce0;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60e20;
    *(unsigned int *)&a0->field_1c = a2;
    *(unsigned long *)a0->padding_24 = a3;
    a0->field_28 = a4;
    return (unsigned long long)v0;
}
