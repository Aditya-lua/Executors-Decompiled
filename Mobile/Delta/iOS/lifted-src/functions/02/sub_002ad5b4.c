/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ad5b4..0x2ad710 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ad5b4_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2ad5b4_0;

typedef struct st_2ad5b4_3 {
    struct st_2ad5b4_0 *field_0;
    void* field_8;
    void* field_10;
    char padding_18[8];
    struct st_2ad5b4_0 *field_20;
} st_2ad5b4_3;

typedef struct st_2ad5b4_4 {
    char field_0;
} st_2ad5b4_4;


st_2ad5b4_0 * sub_2ad5b4(st_2ad5b4_3 *a0, double *a1)
{
    st_2ad5b4_0 *v10;  // x9
    char v11;  // x1
    unsigned long v12;  // x8
    st_2ad5b4_0 *v13;  // x9
    char v14;  // x1
    unsigned long v15;  // x8
    unsigned long v0;  // [bp-0x60], Other Possible Types: char
    unsigned long v1;  // [bp-0x58]
    double v2;  // [bp-0x58]
    unsigned long v3;  // [bp-0x50], Other Possible Types: char
    unsigned long v4;  // [bp-0x48]
    double v5;  // [bp-0x48]
    st_2ad5b4_4 **v6;  // [bp-0x40], Other Possible Types: char
    st_2ad5b4_4 *v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    if (a0->field_8 == a0->field_10)
    {
        v3 = 0;
        v4 = 0;
        v7 = &v6;
        v6 = &v7;
        sub_2a6e94(&v4, 0);
        v3 = 7;
        v5 = *a1;
        v13 = a0->field_0;
        v14 = v13->field_0;
        v13->field_0 = 7;
        v3 = v14;
        v15 = v13->field_8;
        *(double *)&v13->field_8 = v5;
        v4 = v15;
        sub_2a6e94(&v4, v3);
        return a0->field_0;
    }
    else if (*(char *)*(long long *)((char *)a0->field_10 - 8) == 2)
    {
        sub_2a5be8(*(long long *)(*(long long *)((char *)a0->field_10 - 8) + 8));
        return *(long long *)(*(long long *)(*(long long *)((char *)a0->field_10 - 8) + 8) + 8) - 16;
    }
    else
    {
        v0 = 0;
        v1 = 0;
        v7 = &v6;
        v6 = &v7;
        sub_2a6e94(&v1, 0);
        v0 = 7;
        v2 = *a1;
        v10 = a0->field_20;
        v11 = v10->field_0;
        v10->field_0 = 7;
        v0 = v11;
        v12 = v10->field_8;
        *(double *)&v10->field_8 = v2;
        v1 = v12;
        sub_2a6e94(&v1, v0);
        return a0->field_20;
    }
}
