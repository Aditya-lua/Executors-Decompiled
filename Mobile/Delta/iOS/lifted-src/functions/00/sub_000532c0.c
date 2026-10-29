/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x532c0..0x533b4 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_532c0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    uint128_t field_40;
    unsigned long long field_50;
    char field_58;
    char padding_59[39];
    long long field_80;
    long long field_88;
    long long field_90;
} st_532c0_0;

extern char g_e68738;

st_532c0_0 * sub_532c0(st_532c0_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, uint128_t a8, unsigned long a9, unsigned long a10)
{
    unsigned long long *v2;  // x21
    long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]

    v1 = &a8;
    a0->field_0 = &g_e68738;
    a0->field_8 = a1;
    a0->field_10 = a2;
    a0->field_18 = a3;
    a0->field_20 = a4;
    a0->field_28 = a5;
    a0->field_30 = a6;
    a0->field_38 = a7;
    a0->field_40 = a8;
    a0->field_50 = a10;
    v0 = 0;
    sub_17ef4(&a0->field_58, &v0, 0);
    a0->field_80 = 0;
    a0->field_88 = 0;
    v2 = &a0->field_80;
    v2[2] = 0;
    v0 = 0;
    sub_17ef4(v2 + 3, &v0, 0);
    v0 = 0;
    sub_17ef4(&a0[1].field_28, &v0, 0);
    v0 = 0;
    sub_17ef4(&a0[1].field_50, &v0, 0);
    return a0;
}
