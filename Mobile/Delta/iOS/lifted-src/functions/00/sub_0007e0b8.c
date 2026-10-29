/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7e0b8..0x7e150 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7e0b8_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_7e0b8_1;

typedef struct st_7e0b8_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    char padding_38[4];
    unsigned long long field_3c;
    unsigned long long field_40;
} st_7e0b8_2;

typedef struct st_7e0b8_0 {
    char field_0;
} st_7e0b8_0;


unsigned long long sub_7e0b8(st_7e0b8_2 *a0, long long a1, st_7e0b8_1 *a2)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x8
    st_7e0b8_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_7e0b8_0 *v1;  // [bp-0x48]
    uint128_t v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v2 = a2->field_0;
    v3 = a2->field_10;
    v6 = sub_82350(a1, &v2);
    if (!v6)
        return 0xffffffffffffffc0;
    v7 = v6 + a1;
    a0->field_0 = v6;
    a0->field_8 = v7;
    a0->field_10 = v6;
    a0->field_20 = v6;
    a0->field_30 = v7 & 0xffffffffffffffc0;
    a0->field_3c = 0;
    sub_7fc34(a0);
    *(unsigned int *)(a0->padding_38)[1] = 0;
    return 0;
}
