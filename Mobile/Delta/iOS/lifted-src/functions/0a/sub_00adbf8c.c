/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadbf8c..0xadc09c (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adbf8c_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
    char padding_41[31];
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned int field_80;
    char padding_84[4];
    unsigned long long field_88;
    unsigned long long field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
} st_adbf8c_0;


long long sub_adbf8c(unsigned int idx, st_adbf8c_0 *a1)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // x8
    unsigned long v4;  // x10
    unsigned long long v5;  // x8
    unsigned long long v6;  // x8
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    uint128_t v9;  // q3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_80;
    v3 = v2 >> 3;
    if (v2 & 7)
        (&a1->field_40)[v3] = (&a1->field_40)[v3] | (char)(128 >> ((char)v2 & 7 & 31));
    else
        (&a1->field_40)[v3] = 128;
    v4 = (unsigned int)v3 + 1;
    if ((unsigned int)v2 >= 0x100)
    {
        if (503 >= (unsigned int)v2)
            _bzero(&(&a1->field_40)[v4 & 0xffffffff], 63 - v3);
        sub_adb158(a1, &a1->field_40, 1);
        v4 = 0;
    }
    else if (247 < (unsigned int)v2)
    {
        goto LABEL_adc034;
    }
    _bzero(&(&a1->field_40)[v4 & 0xffffffff], 32 - v4);
LABEL_adc034:
    v5 = __builtin_bswap64(a1->field_88);
    a1->field_70 = __builtin_bswap64(a1->field_90);
    a1->field_78 = v5;
    v6 = __builtin_bswap64(a1->field_98);
    a1->field_60 = __builtin_bswap64(a1->field_a0);
    a1->field_68 = v6;
    sub_adb158(a1, &a1->field_40, 1);
    if (!idx)
        return 0;
    v7 = a1->field_0;
    v8 = a1->field_10;
    v9 = a1->field_30;
    *(uint128_t *)(idx + 32) = a1->field_20;
    *(uint128_t *)(idx + 48) = v9;
    *(uint128_t *)idx = v7;
    *(uint128_t *)(idx + 16) = v8;
    sub_a66ec0(a1, 168);
    return 1;
}
