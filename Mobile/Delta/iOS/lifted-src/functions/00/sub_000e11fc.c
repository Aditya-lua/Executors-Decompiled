/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe11fc..0xe12a8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e11fc_1 {
    char padding_0[16];
    unsigned long long field_10;
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
} st_e11fc_1;

typedef struct st_e11fc_0 {
    char field_0;
} st_e11fc_0;


double sub_e11fc(st_e11fc_1 *a0)
{
    unsigned long v6;  // x20
    unsigned long long v7;  // x0
    unsigned long long v8;  // x8
    double v9;  // d0
    st_e11fc_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_e11fc_0 *v1;  // [bp-0x48]
    st_e11fc_0 *v2;  // [bp-0x40]
    st_e11fc_0 **v3;  // [bp-0x38], Other Possible Types: char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!*(long long *)&a0->field_18)
        return v9;
    sub_d2c48(&v3, a0);
    v6 = a0->field_20 + 1;
    v2 = &v3;
    v3 = &v2;
    v7 = sub_e24b4(a0, v6);
    v8 = 0xff;
    if (v7 >= 0xff)
        v7 = v8;
    v3 = 0;
    sub_d6cf4();
    *(char *)(a0->field_10 + v7 + v6) = 1;
    *(double *)&a0[1].padding_0[8] = 1.6e-322;
    return 1.6e-322;
}
