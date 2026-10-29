/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9218..0x2a9374 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a9218_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2a9218_0;

typedef struct st_2a9218_3 {
    struct st_2a9218_0 *field_0;
    void* field_8;
    void* field_10;
    char padding_18[8];
    struct st_2a9218_0 *field_20;
} st_2a9218_3;

typedef struct st_2a9218_4 {
    char field_0;
} st_2a9218_4;


st_2a9218_0 * sub_2a9218(st_2a9218_3 *a0, unsigned long long *a1)
{
    st_2a9218_0 *v8;  // x9
    char v9;  // x1
    unsigned long v10;  // x8
    st_2a9218_0 *v11;  // x9
    char v12;  // x1
    unsigned long v13;  // x8
    unsigned long v0;  // [bp-0x60], Other Possible Types: char
    unsigned long v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50], Other Possible Types: char
    unsigned long v3;  // [bp-0x48]
    st_2a9218_4 **v4;  // [bp-0x40], Other Possible Types: char
    st_2a9218_4 *v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a0->field_8 == a0->field_10)
    {
        v2 = 0;
        v3 = 0;
        v5 = &v4;
        v4 = &v5;
        sub_2a6e94(&v3, 0);
        v2 = 5;
        v3 = *a1;
        v11 = a0->field_0;
        v12 = v11->field_0;
        v11->field_0 = 5;
        v2 = v12;
        v13 = v11->field_8;
        v11->field_8 = v3;
        v3 = v13;
        sub_2a6e94(&v3, v2);
        return a0->field_0;
    }
    else if (*(char *)*(long long *)((char *)a0->field_10 - 8) == 2)
    {
        sub_2ab5b8(*(long long *)(*(long long *)((char *)a0->field_10 - 8) + 8));
        return *(long long *)(*(long long *)(*(long long *)((char *)a0->field_10 - 8) + 8) + 8) - 16;
    }
    else
    {
        v0 = 0;
        v1 = 0;
        v5 = &v4;
        v4 = &v5;
        sub_2a6e94(&v1, 0);
        v0 = 5;
        v1 = *a1;
        v8 = a0->field_20;
        v9 = v8->field_0;
        v8->field_0 = 5;
        v0 = v9;
        v10 = v8->field_8;
        v8->field_8 = v1;
        v1 = v10;
        sub_2a6e94(&v1, v0);
        return a0->field_20;
    }
}
