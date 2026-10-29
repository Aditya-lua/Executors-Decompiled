/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d628..0x1d730 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d628_1 {
    char padding_0[88];
    char field_58;
    char padding_59[127];
    long long field_d8;
} st_1d628_1;

typedef struct st_1d628_0 {
    char field_0;
} st_1d628_0;


long long sub_1d628(st_1d628_1 *a0, unsigned long a1, long long a2)
{
    long long v12;  // x0
    long long v13;  // x1
    long long v14;  // x0
    unsigned long v15;  // x0
    st_1d628_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_1d628_0 *v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x80]
    long long v3;  // [bp-0x78]
    long long v4;  // [bp-0x70], Other Possible Types: unsigned long
    long long v5;  // [bp-0x68], Other Possible Types: unsigned long long
    long long v6;  // [bp-0x60]
    long long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_58 == 1)
    {
        v12 = sub_404c(a0->field_d8, 56);
        v4 = 0xffffffffffffffff;
        v5 = 0xffffffffffffffff;
        v6 = 0;
        v7 = 0;
        v8 = 0xffffffffffffffff;
        v9 = 0xffffffffffffffff;
        sub_84d4(v12, &v4);
    }
    else
    {
        v12 = 0;
    }
    v4 = 0;
    v5 = 0;
    if (!v12)
        v13 = 0;
    else
        v13 = v12 + 8;
    v14 = sub_23cd0();
    v2 = a1;
    v3 = v5;
    v15 = sub_404c(a0->field_d8, 56);
    sub_5520(v15, &v2, a2, v14, v13);
    if (a0->field_58 != 1)
        return v15;
    v2 = v15;
    sub_1c9f0(&a0[5].padding_0[64], &v2);
    *(long long *)(sub_12484(&a0[5].padding_0[64], &v2) + 8) = v12;
    return v15;
}
