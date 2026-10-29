/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3810c..0x38188 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3810c_1 {
    char padding_0[32];
    long long field_20;
} st_3810c_1;

typedef struct st_3810c_2 {
    char padding_0[8];
    long long field_8;
    char field_10;
    char padding_11[31];
    unsigned long long field_30;
} st_3810c_2;

typedef struct st_3810c_0 {
    char field_0;
} st_3810c_0;


long long sub_3810c(st_3810c_2 *a0, st_3810c_1 *a1)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x9
    st_3810c_2 *v8;  // x8
    unsigned long long v9;  // x9
    st_3810c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3810c_0 *v1;  // [bp-0x38]
    st_3810c_1 *v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_46ddc(a0->field_8, a1->field_20);
    if (v6 >> 31 & 1)
        return 1;
    v7 = v6 & 0xffffffff;
    v8 = &(a0->padding_0)[v7 >> 6];
    v9 = 1 << ((char)v7 & 63);
    if (!(v8->field_30 & v9))
        return 1;
    v2 = &v8->field_10;
    v3 = v9;
    sub_3b720(&v2, 1);
    return 1;
}
