/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79738..0x797d8 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_79738_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    struct st_79738_1 *field_28;
    struct st_79738_1 *field_30;
} st_79738_0;

typedef struct st_79738_1 {
    unsigned long long field_0;
} st_79738_1;


unsigned long long sub_79738(st_79738_0 *a0)
{
    unsigned long v3;  // x8
    unsigned long long v4;  // x9
    unsigned long v5;  // x8
    unsigned long long v6;  // x10
    unsigned long long *v7;  // x11
    unsigned long long *v8;  // x12
    unsigned long long *v9;  // x9
    unsigned long long v10;  // x8
    unsigned long long *v11;  // x8
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 1;
    sub_79590(&v0, 1);
    v3 = v0;
    v4 = a0->field_0 >> ((char)v3 & 63) | v3 & 0xffffffffffffff00;
    a0->field_0 = v4;
    v5 = a0->field_10 + v3;
    v6 = v5 & 0xff;
    v7 = a0->field_28;
    v8 = a0->field_30;
    *v7 = v4 >> ((char)-v6 & 63);
    v9 = (char *)v7 + (v6 >> 3);
    v10 = v5 & 7;
    a0->field_10 = v10;
    if (v8 < v9)
        v9 = v8;
    a0->field_28 = v9;
    if (v8 <= v9)
        return 0;
    if (!v10)
        v11 = v9;
    else
        v11 = (char *)v9 + 1;
    return (char *)v11 - a0->field_20;
}
