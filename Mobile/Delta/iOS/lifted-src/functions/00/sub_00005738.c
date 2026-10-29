/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5738..0x5770 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5738_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
} st_5738_0;

extern char g_e60d08;
extern char g_e61360;
extern unsigned int g_f00c90;

double sub_5738(st_5738_0 *a0, uint128_t *a1, unsigned long a2)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00c90;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60d08;
    *(unsigned long *)&a0->field_1c = a2;
    return (unsigned long long)v0;
}
