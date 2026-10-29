/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3bc78..0x3bf74 (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3bc78_1 {
    long long field_0;
    char padding_8[256];
    char field_108;
    char padding_109[1267];
    unsigned int field_5fc;
    char padding_600[48];
    unsigned long long field_630;
    unsigned long long field_638;
    char padding_640[32];
    unsigned long long field_660;
    unsigned long long field_668;
    char padding_670[8];
    char field_678;
    char padding_679[7];
    unsigned long long field_680;
} st_3bc78_1;

typedef struct st_3bc78_2 {
    char padding_0[32];
    struct st_3bc78_3 *field_20;
} st_3bc78_2;

typedef struct st_3bc78_4 {
    char padding_0[32];
    long long field_20;
    struct st_3bc78_2 *field_28;
} st_3bc78_4;

typedef struct st_3bc78_3 {
    long long field_0;
} st_3bc78_3;

typedef struct st_3bc78_0 {
    char field_0;
} st_3bc78_0;


unsigned long long sub_3bc78(st_3bc78_1 *a0, st_3bc78_4 *a1)
{
    unsigned long long v9;  // x28
    unsigned long long v10;  // x27
    long long v19;  // x0
    long long v20;  // x0
    long long v21;  // x21
    unsigned long long v22;  // x0
    long long v11;  // x0
    st_3bc78_2 *v12;  // x23
    unsigned int v13;  // x25
    unsigned int v14;  // x24
    unsigned int v15;  // x26
    unsigned long v16;  // x9
    long long v17;  // x0
    long long v18;  // x24
    unsigned int v0;  // [bp-0x94]
    st_3bc78_0 **v1;  // [bp-0x90], Other Possible Types: char
    st_3bc78_0 *v2;  // [bp-0x88]
    long long v3;  // [bp-0x80], Other Possible Types: unsigned int
    long long v4;  // [bp-0x78], Other Possible Types: unsigned int
    unsigned int v5;  // [bp-0x70]
    unsigned int *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v2 = &v1;
    v1 = &v2;
    v9 = a0->field_668;
    v10 = a0->field_660;
    v3 = (long long)(a0->field_638 - a0->field_630) >> 3;
    v4 = v3;
    v5 = 0;
    sub_15798(&a0->field_678, &v3);
    a0->padding_600[16] = 1;
    v11 = sub_2bc4c(a0->field_0);
    v12 = a1->field_28;
    v0 = a0->field_5fc;
    if (*(long long *)&v12[1].padding_0[0])
    {
        v13 = 0;
        v14 = 0;
        v15 = 0;
        do
        {
            sub_38924(a0, *(long long *)&v12->field_20[v13]);
            v16 = a0->field_680;
            *(unsigned long long *)(v16 - 16) = (long long)(a0->field_638 - a0->field_630) >> 3;
            if (*(long long *)(v16 - 8) && !(v15 & 1))
            {
                sub_46a88(a0);
                v14 = (long long)(a0->field_638 - a0->field_630) >> 3;
                v15 = 1;
            }
        } while ((v13 += 1, (unsigned long long)*(long long *)&v12[1].padding_0[0] > v13));
        if (v15 & 1)
        {
            sub_439a4(a0, *(long long *)((char *)&v12->field_20[*(long long *)&v12[1].padding_0[0]].field_0 - 8));
            sub_3b76c(a0, v14);
            sub_46278(a0, v14);
        }
    }
    v17 = sub_2bc4c(a0->field_0);
    sub_395b0(a0, a1->field_20);
    if (sub_46a30(&a0->field_108, a1->field_20))
    {
        sub_3b76c(a0, v3);
        v18 = sub_2bc4c(a0->field_0);
    }
    else
    {
        v3 = 0;
        v4 = 0;
        v5 = 0;
        sub_38188(a0, a1->field_20, 0, &v3, 1);
        sub_3b76c(a0, v3);
        v19 = sub_2bc4c(a0->field_0);
        sub_2fdb0(a0->field_0, 24, 0, 0);
        v20 = sub_2bc4c(a0->field_0);
        sub_3b76c(a0, v3);
        v18 = sub_2bc4c(a0->field_0);
        sub_41380(a0, a1, v19, v11);
        sub_3a26c(a0, a1, &v3, v20);
        v6 = &v3;
        sub_10344(&v6);
    }
    sub_46278(a0, v3);
    v21 = (long long)(v9 - v10) >> 4;
    sub_39680(a0, a1, v21, v18, v17);
    sub_39b70(&a0->field_660, v21);
    v22 = sub_c84c(&a0->field_678, a0->field_680 - 24);
    a0->field_5fc = v0;
    return v22;
}
