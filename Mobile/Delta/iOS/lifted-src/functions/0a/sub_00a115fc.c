/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa115fc..0xa11760 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a115fc_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    char padding_28[40];
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_a115fc_0;

typedef struct st_a115fc_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    unsigned int field_2c;
    unsigned int field_30;
    unsigned int field_34;
    unsigned int field_38;
    unsigned int field_3c;
    unsigned int field_40;
    unsigned int field_44;
    unsigned int field_48;
    unsigned int field_4c;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_a115fc_1;


long long sub_a115fc(st_a115fc_0 *a0, st_a115fc_1 *a1)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q1

    a0->field_0 = a1->field_0 + a1->field_28;
    a0->field_4 = a1->field_4 + a1->field_2c;
    a0->field_8 = a1->field_8 + a1->field_30;
    a0->field_c = a1->field_c + a1->field_34;
    a0->field_10 = a1->field_10 + a1->field_38;
    a0->field_14 = a1->field_14 + a1->field_3c;
    a0->field_18 = a1->field_18 + a1->field_40;
    a0->field_1c = a1->field_1c + a1->field_44;
    a0->field_20 = a1->field_20 + a1->field_48;
    a0->field_24 = a1->field_24 + a1->field_4c;
    *(unsigned int *)&a0->padding_28[0] = a1->field_28 - a1->field_0;
    *(unsigned int *)&a0->padding_28[4] = a1->field_2c - a1->field_4;
    *(unsigned int *)&a0->padding_28[8] = a1->field_30 - a1->field_8;
    *(unsigned int *)&a0->padding_28[12] = a1->field_34 - a1->field_c;
    *(unsigned int *)&a0->padding_28[16] = a1->field_38 - a1->field_10;
    *(unsigned int *)&a0->padding_28[20] = a1->field_3c - a1->field_14;
    *(unsigned int *)&a0->padding_28[24] = a1->field_40 - a1->field_18;
    *(unsigned int *)&a0->padding_28[28] = a1->field_44 - a1->field_1c;
    *(unsigned int *)&a0->padding_28[32] = a1->field_48 - a1->field_20;
    *(unsigned int *)&a0->padding_28[36] = a1->field_4c - a1->field_24;
    v0 = a1->field_50;
    v1 = a1->field_60;
    a0->field_70 = a1->field_70;
    a0->field_50 = v0;
    a0->field_60 = v1;
}
