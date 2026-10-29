/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad838..0x9ad8b4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ad838_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    unsigned short field_10;
    char padding_12[6];
    unsigned long long field_18;
    unsigned long long field_20;
} st_9ad838_0;

typedef struct st_9ad838_1 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    unsigned short field_4;
    char field_6;
    char field_7;
    char field_8;
    char field_9;
    char field_a;
    char field_b;
} st_9ad838_1;


double sub_9ad838(st_9ad838_1 *a0, st_9ad838_0 *ptr)
{
    unsigned long v0;  // x8

    memset(ptr, 0, 64);
    ptr->field_0 = a0->field_0;
    ptr->field_8 = a0->field_1 * 0x10000 | a0->field_2 * 0x100 | a0->field_3;
    v0 = a0->field_4;
    ptr->field_10 = (((((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
    ptr->field_18 = a0->field_6 * 0x10000 | a0->field_7 * 0x100 | a0->field_8;
    ptr->field_20 = a0->field_9 * 0x10000 | a0->field_a * 0x100 | a0->field_b;
    return 0;
}
