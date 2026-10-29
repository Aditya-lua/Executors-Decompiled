/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1537b4..0x15390c (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1537b4_1 {
    char padding_0[8];
    unsigned long long *field_8;
    struct st_1537b4_0 *field_10;
    unsigned long long field_18;
    long long field_20;
    unsigned long long field_28;
} st_1537b4_1;

typedef struct st_1537b4_2 {
    struct st_1537b4_0 *field_0;
} st_1537b4_2;

typedef struct st_1537b4_0 {
    char field_0;
} st_1537b4_0;


double sub_1537b4(st_1537b4_1 *a0, long long a1)
{
    long long *v8;  // x23
    unsigned long long *v9;  // x20
    unsigned long long *v18;  // x21
    unsigned long long v19;  // x22
    char *v20;  // x24
    char *v10;  // x24
    unsigned long long v11;  // x0
    unsigned long long v12;  // x22
    unsigned long long v13;  // x0
    unsigned long long v14;  // x8
    long long v15;  // x25
    long long *v16;  // x0
    char *v17;  // x8
    st_1537b4_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_1537b4_0 *v1;  // [bp-0x88]
    st_1537b4_0 **v2;  // [bp-0x80], Other Possible Types: char
    st_1537b4_0 *v3;  // [bp-0x78]
    st_1537b4_0 *v4;  // [bp-0x70], Other Possible Types: st_1537b4_2 **
    st_1537b4_0 **v5;  // [bp-0x68], Other Possible Types: st_1537b4_2 **, char
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = &a0->field_20;
    v9 = a0->field_8;
    v10 = a0->field_10;
    v4 = &v5;
    v5 = &v4;
    v11 = sub_e24b4();
    if (v11 >= 0xff)
        v11 = 0xff;
    v12 = v11 + a0->field_20 + 1;
    v3 = &v2;
    v2 = &v3;
    a0->field_18 = 0;
    *v8 = a1 - 1;
    a0->field_28 = sub_e24b4();
    v4 = &v5;
    v5 = &v4;
    v13 = sub_e24b4(a0, a1);
    if (v13 < 0xff)
        v14 = v13;
    else
        v14 = 0xff;
    v15 = v14 + a1;
    v16 = sub_d6520(_malloc());
    v17 = &v16[v15];
    a0->field_8 = v16;
    a0->field_10 = v17;
    _bzero(v17, v15 + 8);
    *(char *)&a0->field_10[v15] = 1;
    *(double *)a0[1].padding_0 = 1.6e-322;
    if (v12 < 2)
        return 1.6e-322;
    v18 = v9;
    do
    {
        v19 = v12;
        v20 = v10 + 1;
        if (*v10)
            sub_14fa18(a0, v18);
    } while ((v18 += 1, v12 = v19 - 1, v10 = v20, v19 != 1));
    if (v9 == v8)
        return 1.6e-322;
    _free(v9);
    return 1.6e-322;
}
