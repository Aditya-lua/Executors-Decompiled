/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b4988..0x8b4b40 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b4988_2 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_8b4988_2;

typedef struct st_8b4988_1 {
    char padding_0[8];
    struct st_8b4988_2 *field_8;
    struct st_8b4988_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_8b4988_1;

typedef struct st_8b4988_3 {
    struct st_8b4988_0 *field_0;
} st_8b4988_3;

typedef struct st_8b4988_0 {
    char field_0;
} st_8b4988_0;


double sub_8b4988(st_8b4988_1 *a0, long long a1)
{
    unsigned long long *v8;  // x19
    char *v9;  // x24
    unsigned long long v18;  // x27
    unsigned long long *v19;  // x0
    unsigned long long *v20;  // x8
    unsigned long long v21;  // x21
    unsigned long long *v10;  // x23
    unsigned long v11;  // x8
    unsigned long long v12;  // x0
    unsigned long long v13;  // x22
    unsigned long long v14;  // x0
    unsigned long long v15;  // x8
    unsigned long long v16;  // x25
    unsigned long long v17;  // x26
    st_8b4988_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_8b4988_0 *v1;  // [bp-0x88]
    st_8b4988_0 **v2;  // [bp-0x80], Other Possible Types: char
    st_8b4988_0 *v3;  // [bp-0x78]
    st_8b4988_0 *v4;  // [bp-0x70], Other Possible Types: st_8b4988_3 **
    st_8b4988_0 **v5;  // [bp-0x68], Other Possible Types: st_8b4988_3 **, char
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = &a0->field_8->field_0;
    v9 = a0->field_10;
    v10 = &a0->field_20;
    v11 = (a0->field_20 * 2 & 4) + (a0->field_20 ^ 2);
    v4 = &v5;
    v5 = &v4;
    v12 = sub_e24b4();
    if (v12 >= 0xff)
        v12 = 0xff;
    v13 = v12 + ~v11 + v11 * 2;
    v3 = &v2;
    v2 = &v3;
    a0->field_18 = 0;
    *v10 = ~a1 + a1 * 2;
    a0->field_28 = sub_e24b4();
    v4 = &v5;
    v5 = &v4;
    v14 = sub_e24b4(a0, a1);
    if (v14 < 0xff)
        v15 = v14;
    else
        v15 = 0xff;
    v16 = v15 + a1;
    v17 = v16 * 16;
    v18 = ((18 & v16 * 2) + (v16 ^ 9) ^ v17) + ((18 & v16 * 2) + (v16 ^ 9) & v17) * 2;
    v19 = sub_d6520(_malloc());
    v20 = (char *)v19 + v17;
    a0->field_8 = v19;
    a0->field_10 = v20;
    _bzero(v20, (v18 - 1 ^ -v17) + ((-v18 | -v17) + v18) * 2);
    *(char *)&a0->field_10[v16] = 1;
    *(double *)a0[1].padding_0 = 1.6e-322;
    if (v13 < 2)
        return 1.6e-322;
    v21 = 0;
    do
    {
        if (v9[v21])
            sub_8b4b40(a0, &v8[2 * v21]);
    } while ((v21 = ~((v21 * 2 & 4) + (v21 ^ 2)) + ((v21 * 2 & 4) + (v21 ^ 2)) * 2, v13 > v21));
    if (v8 == v10)
        return 1.6e-322;
    _free(v8);
    return 1.6e-322;
}
