/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x17ce4..0x17de0 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_17ce4_0 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    unsigned int field_80;
    unsigned long long field_84;
    unsigned long long field_8c;
    char padding_94[68];
    long long field_d8;
    char padding_e0[176];
    unsigned long long field_190;
    unsigned long long field_198;
} st_17ce4_0;

typedef struct st_17ce4_1 {
    char padding_0[12];
    unsigned long long field_c;
    unsigned long long field_14;
    char padding_1c[20];
    char field_30;
} st_17ce4_1;


st_17ce4_1 * sub_17ce4(st_17ce4_0 *a0)
{
    unsigned long long v4;  // x24
    unsigned int v5;  // w25
    unsigned long long v6;  // x21
    st_17ce4_1 *v7;  // x20
    unsigned long long v8;  // x22
    unsigned long long v9;  // x23
    unsigned int v10;  // w0
    long long v11;  // x0
    st_17ce4_1 *v0;  // [bp-0x60], Other Possible Types: unsigned int
    unsigned long long v1;  // [bp-0x5c]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *(long long *)&(&a0->field_80)[1];
    v5 = a0->field_80;
    sub_f8d0();
    v6 = *(long long *)&(&a0->field_80)[1];
    v7 = sub_10a78(a0);
    sub_16df8(a0, a0->field_190 - *(long long *)&a0->padding_e0[168] >> 3);
    *(unsigned long long *)&(v7->padding_0)[1] = v4;
    v8 = *(long long *)&(&a0->field_80)[1];
    v9 = *(long long *)((char *)&a0->field_84 + 4);
    v0 = v5;
    v1 = v4;
    v10 = sub_1e5c4(a0, 296, &v0);
    v7->padding_1c[16] = v10;
    if (v10)
    {
        *(unsigned long long *)((char *)&v7->field_c + 4) = v9;
        if (!(a0->field_58 & 1))
            return v7;
    }
    else if (a0->field_58 == 1)
    {
        v8 = 0xffffffffffffffff;
    }
    else
    {
        return v7;
    }
    v11 = sub_404c(*(long long *)&a0->padding_94[64], 20);
    sub_85b0(v11, v6, v8);
    v0 = v7;
    sub_1c9f0(&a0[2].padding_e0[104], &v0);
    *(long long *)(sub_12484(&a0[2].padding_e0[104], &v0) + 8) = v11;
    return v7;
}
