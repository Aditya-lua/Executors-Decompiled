/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d6f4..0xb5d74c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5d6f4_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    uint128_t field_10;
    char padding_20[8];
    unsigned long long field_28;
    char padding_30[36];
    char field_54;
    char padding_55[147];
    unsigned long long field_e8;
    unsigned long long field_f0;
} st_b5d6f4_0;


double sub_b5d6f4(unsigned long a0, st_b5d6f4_0 *a1, unsigned long long a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a1->field_54 = a1->field_54 | 2;
    a1->field_0 = 6;
    a1->field_28 = 0xffffffffffffffff;
    a1->field_10 = 0xffffffffffffffff000000000000000c;
    a1->field_8 = a2 >> 3;
    a1->field_f0 = a3;
    a1->field_e8 = sub_9f2aec();
    return 12;
}
