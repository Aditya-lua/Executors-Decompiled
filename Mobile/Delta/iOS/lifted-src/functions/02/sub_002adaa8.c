/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2adaa8..0x2adbac (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2adaa8_1 {
    unsigned long long field_0;
    int field_8;
    char padding_c[12];
    char field_18;
    char padding_19[7];
    char field_20;
    char padding_21[63];
    char field_60;
    char padding_61[31];
    char field_80;
    char padding_81[7];
    long long field_88;
    char field_90;
    char padding_91[7];
    unsigned long long field_98;
} st_2adaa8_1;

typedef struct st_2adaa8_2 {
    char field_0;
    char padding_1[15];
    unsigned long long field_10;
} st_2adaa8_2;

typedef struct st_2adaa8_0 {
    char field_0;
} st_2adaa8_0;


st_2adaa8_1 * sub_2adaa8(st_2adaa8_1 *a0, unsigned long a1, long long a2, char a3, unsigned long a4)
{
    st_2adaa8_2 *v5;  // x22
    st_2adaa8_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_2adaa8_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    *(uint128_t *)&a0->field_8 = 0;
    a0->field_0 = a1;
    memset(&a0->field_18, 0, 65);
    sub_2aeb18(&a0->field_60, a2);
    *(char *)&a0->field_88 = 9;
    v5 = &a0->field_88;
    *(&v5->field_0 - 8) = a3;
    sub_2ae53c(&v5->padding_1[7], 9);
    a0->field_98 = a4;
    v2 = 1;
    sub_2a6c24((char *)v5 - 104, &v2);
    return a0;
}
