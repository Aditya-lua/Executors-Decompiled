/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ad920..0x2ada64 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ad920_2 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2ad920_2;

typedef struct st_2ad920_4 {
    char padding_0[56];
    char field_38;
    char padding_39[7];
    unsigned long long field_40;
} st_2ad920_4;

typedef struct st_2ad920_3 {
    char padding_0[8];
    unsigned long long field_8;
    void* field_10;
    char padding_18[32];
    char field_38;
    char padding_39[23];
    struct st_2ad920_2 *field_50;
} st_2ad920_3;

typedef struct st_2ad920_0 {
    char field_0;
} st_2ad920_0;

extern long long g_cbed28;

int sub_2ad920(st_2ad920_3 *a0, unsigned long a1)
{
    st_2ad920_4 *v11;  // x0
    char v12;  // x1
    st_2ad920_2 *v13;  // x0
    unsigned long v14;  // x9
    st_2ad920_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_2ad920_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x58]
    unsigned long v3;  // [bp-0x50]
    char v4;  // [bp-0x41]
    char v5;  // [bp-0x40]
    char v6;  // [bp-0x38]
    char v7;  // [bp-0x29]
    unsigned int v8;  // [bp-0x28], Other Possible Types: unsigned long
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    sub_2a9bcc(&v5);
    v8 = a0->field_10 - a0->field_8 >> 3;
    v7 = 4;
    v4 = sub_1b2e04(&a0[1].field_8, &v8, &v7, &v5);
    sub_2a6c24(&a0->field_38, &v4);
    if (v4 == 1 && *(long long *)((char *)a0->field_10 - 8))
    {
        sub_2aff80(&v2, &a0[1].padding_18[24]);
        v8 = a1;
        v11 = sub_2aa758(*(long long *)(*(long long *)((char *)a0->field_10 - 8) + 8), a1, &g_cbed28, &v8, &v7);
        v12 = v11->field_38;
        v13 = &v11->field_38;
        v13->field_0 = v2;
        v2 = v12;
        v14 = v13->field_8;
        v13->field_8 = v3;
        v3 = v14;
        a0->field_50 = v13;
        sub_2a6e94(&v3, v2);
    }
    sub_2a6e94(&v6, v5);
    return 1;
}
