/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7c884..0x7c8ac (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7c884_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_7c884_0;


long long sub_7c884(st_7c884_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = 0;
    a0->field_10 = 0;
    a0->field_20 = a1;
    a0->field_28 = a1;
    a0->field_30 = a1 + a2 - 8;
    if (a2 >= 9)
        return 0;
    return 0xffffffffffffffba;
}
