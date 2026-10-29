/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4645c..0x46608 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4645c_1 {
    long long field_0;
    char padding_8[256];
    char field_108;
    char padding_109[1287];
    char field_610;
    char padding_611[31];
    unsigned long long field_630;
    unsigned long long field_638;
    char padding_640[32];
    unsigned long long field_660;
    unsigned long long field_668;
    char padding_670[8];
    char field_678;
    char padding_679[7];
    unsigned long long field_680;
} st_4645c_1;

typedef struct st_4645c_0 {
    char field_0;
} st_4645c_0;


unsigned long long sub_4645c(st_4645c_1 *a0, long long *a1)
{
    unsigned long long v8;  // x0
    unsigned long long v9;  // x25
    unsigned long long v10;  // x26
    long long v11;  // x0
    long long v12;  // x0
    long long v13;  // x0
    long long v14;  // x24
    long long v15;  // x21
    st_4645c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_4645c_0 *v1;  // [bp-0x78]
    long long v2;  // [bp-0x70], Other Possible Types: unsigned long long
    long long v3;  // [bp-0x68], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0x60]
    unsigned long long *v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = sub_39b14(&a0->field_108, a1[4]);
    if (v8 & 1)
        return v8;
    v9 = a0->field_668;
    v10 = a0->field_660;
    v2 = (long long)(a0->field_638 - a0->field_630) >> 3;
    v3 = v2;
    v4 = 0;
    sub_15798(&a0->field_678, &v2);
    a0->field_610 = 1;
    v11 = sub_2bc4c(a0->field_0);
    v2 = 0;
    v3 = 0;
    v4 = 0;
    sub_38188(a0, a1[4], 0, &v2, 0);
    sub_38924(a0, a1[5]);
    v12 = sub_2bc4c(a0->field_0);
    v13 = sub_2bc4c(a0->field_0);
    sub_395b0(a0, a1[4]);
    sub_2fdb0(a0->field_0, 24, 0, 0);
    v14 = sub_2bc4c(a0->field_0);
    sub_41380(a0, a1, v13, v11);
    sub_3a26c(a0, a1, &v2, v14);
    v15 = (long long)(v9 - v10) >> 4;
    sub_39680(a0, a1, v15, v14, v12);
    sub_39b70(&a0->field_660, v15);
    sub_c84c(&a0->field_678, a0->field_680 - 24);
    v5 = &v2;
    return sub_10344(&v5);
}
