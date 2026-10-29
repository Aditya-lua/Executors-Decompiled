/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x223d4..0x2254c (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_223d4_1 {
    char padding_0[88];
    char field_58;
    char padding_59[7];
    char field_60;
    char padding_61[31];
    long long field_80;
    unsigned long long field_84;
    unsigned long long field_8c;
    char padding_94[68];
    long long field_d8;
} st_223d4_1;

typedef struct st_223d4_2 {
    char padding_0[20];
    unsigned long long field_14;
} st_223d4_2;

typedef struct st_223d4_0 {
    char field_0;
} st_223d4_0;


long long sub_223d4(st_223d4_1 *a0)
{
    st_223d4_2 *v8;  // x21
    unsigned long v9;  // x0
    unsigned long v10;  // x20
    long long v11;  // x0
    st_223d4_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_223d4_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    long long v4;  // [bp-0x50], Other Possible Types: unsigned long
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if ((int)a0->field_80 == 262)
    {
        sub_f8d0(a0);
        v8 = sub_12740(a0, 0);
        v4 = *(long long *)((char *)&a0->field_80 + 4);
        v5 = *(long long *)&(v8->padding_0)[1];
        v9 = sub_404c(*(long long *)&a0->padding_94[64], 40);
        sub_5558(v9, &v4, v8);
        return v9;
    }
    else if ((int)a0->field_80 == 281)
    {
        sub_b1a4(&a0->field_60);
        if ((unsigned int)v4 != 262)
            return 0;
        sub_1f174(a0, "generic name");
        sub_1f3d4(a0, 262, "generic type pack annotation");
        v2 = v5;
        v3 = *(long long *)((char *)&a0->field_84 + 4);
        v10 = sub_404c(*(long long *)&a0->padding_94[64], 40);
        sub_6abc(v10, &v2, v4);
        if (a0->field_58 == 1)
        {
            v11 = sub_404c(*(long long *)&a0->padding_94[64], 12);
            sub_867c(v11, *(long long *)((char *)&a0->field_80 + 4));
            v2 = v10;
            sub_1c9f0(&a0[5].padding_0[24], &v2);
            *(long long *)(sub_12484(&a0[5].padding_0[24], &v2) + 8) = v11;
            return v10;
        }
        return v10;
    }
    else
    {
        return 0;
    }
}
