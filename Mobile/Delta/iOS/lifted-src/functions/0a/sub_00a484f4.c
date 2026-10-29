/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa484f4..0xa48558 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a484f4_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    char field_80;
    char padding_81[127];
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    uint128_t field_130;
    uint128_t field_140;
    uint128_t field_150;
    uint128_t field_160;
    uint128_t field_170;
    unsigned long long field_180;
} st_a484f4_0;


int sub_a484f4(unsigned long a0, long long a1)
{
    st_a484f4_0 *v2;  // x20
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q1
    uint128_t v6;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    v2->field_180 = 0;
    sub_9fc26c(a1, v2);
    sub_9fc26c(a1 + 8, &v2->field_80);
    v3 = v2->field_50;
    v2->field_140 = v2->field_40;
    v2->field_150 = v3;
    v4 = v2->field_70;
    v2->field_160 = v2->field_60;
    v2->field_170 = v4;
    v5 = v2->field_10;
    v2->field_100 = v2->field_0;
    v2->field_110 = v5;
    v6 = v2->field_30;
    v2->field_120 = v2->field_20;
    v2->field_130 = v6;
    return 1;
}
