/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d514..0xb5d540 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5d514_0 {
    char field_0;
    char padding_1[7];
    uint128_t field_8;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[104];
    unsigned long long field_90;
} st_b5d514_0;


double sub_b5d514(st_b5d514_0 *a0, unsigned long long a1, unsigned long a2)
{
    a0->field_0 = a0->field_0 & 225;
    *(uint128_t *)(a0->padding_1)[1] = 0xc0000000000000008;
    *(unsigned long long *)((char *)&a0->field_8 + 8) = a1 >> 3;
    a0->field_18 = 0xffffffffffffffff;
    *(unsigned long *)&a0->padding_28[96] = a2;
    return 8;
}
