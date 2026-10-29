/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97670..0xa97708 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97670_0 {
    struct st_a97670_1 *field_0;
    char padding_8[64];
    uint128_t field_48;
    char padding_58[56];
    uint128_t field_90;
    uint128_t field_a0;
} st_a97670_0;

typedef struct st_a97670_1 {
    unsigned long long field_0;
} st_a97670_1;


unsigned int sub_a97670(st_a97670_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v8;  // 4109
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    uint128_t v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v8 = arm64g_calculate_condition(0x22, a2 - 0x11, 16, 0);
    if (!(v8 & 1))
        return 0xffffffff;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = v12;
    v5 = &v7;
    v6 = v13;
    v0 = *(int128_t *)&(a0->padding_8)[1] ^ a0->field_90 ^ *(int128_t *)&a0->padding_58[48];
    a0->field_0();
}
