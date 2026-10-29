/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a767c..0x2a7718 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a767c_1 {
    char padding_0[16];
    unsigned long long field_10;
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
} st_2a767c_1;

typedef struct st_2a767c_0 {
    char field_0;
} st_2a767c_0;


double sub_2a767c(st_2a767c_1 *a0)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x8
    double v8;  // d0
    st_2a767c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2a767c_0 *v1;  // [bp-0x38]
    st_2a767c_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_2a767c_0 *v3;  // [bp-0x28], Other Possible Types: char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!*(long long *)&a0->field_18)
        return v8;
    *(unsigned long long *)&a0->field_18 = 0;
    v3 = &v2;
    v2 = &v3;
    v6 = sub_e24b4();
    v7 = 0xff;
    if (v6 < 0xff)
        v7 = v6;
    v3 = 0;
    sub_d6cf4();
    *(char *)(a0->field_10 + v7 + a0->field_20 + 1) = 1;
    *(double *)&a0[1].padding_0[8] = 1.6e-322;
    return 1.6e-322;
}
