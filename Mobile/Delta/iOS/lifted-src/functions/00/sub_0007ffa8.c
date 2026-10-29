/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ffa8..0x80164 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7ffa8_2 {
    char padding_0[3232];
    long long field_ca0;
    char padding_ca8[304];
    unsigned long long field_dd8;
    unsigned long long field_de0;
} st_7ffa8_2;

typedef struct st_7ffa8_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
    unsigned long long field_18;
    long long field_20;
    long long field_28;
    long long field_30;
} st_7ffa8_0;

typedef struct st_7ffa8_1 {
    char field_0;
} st_7ffa8_1;

extern long long g_cbf144;
extern long long g_cbf18c;
extern long long g_cbf1c6;
extern long long g_cbf258;
extern long long g_cbf27c;

unsigned long long sub_7ffa8(st_7ffa8_0 *a0, st_7ffa8_2 *a1)
{
    st_7ffa8_0 *v10;  // x20
    unsigned long long v11;  // x0
    unsigned long long v20;  // x0
    unsigned long long v21;  // x9
    unsigned long long v22;  // x10
    unsigned long long v12;  // 4106
    long long v13;  // x20
    long long v14;  // x22
    unsigned long v15;  // x24
    unsigned long v16;  // x25
    unsigned long long v17;  // x23
    unsigned long long v18;  // x0
    unsigned long long v19;  // x0
    unsigned long v0;  // [bp-0xa8]
    unsigned long v1;  // [bp-0xa0]
    st_7ffa8_1 **v2;  // [bp-0x90], Other Possible Types: char
    st_7ffa8_1 *v3;  // [bp-0x88]
    st_7ffa8_1 **v4;  // [bp-0x80], Other Possible Types: char
    st_7ffa8_1 *v5;  // [bp-0x78]
    st_7ffa8_1 **v6;  // [bp-0x70], Other Possible Types: char
    st_7ffa8_1 *v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a0;
    v3 = &v2;
    v2 = &v3;
    v11 = sub_7fd6c();
    v12 = arm64g_calculate_condition(130, v11, 120, 0);
    if (v12 & 1)
        return v11;
    v13 = (long long)(a0->field_8 - a0->field_0) >> 3;
    v14 = a1->field_ca0;
    v15 = a1->field_dd8;
    v16 = a1->field_de0;
    v5 = &v4;
    v4 = &v5;
    v17 = sub_82120(a0->field_10, a0->field_18 - a0->field_10, v14, &a1[1].padding_0[1384], v15, v16, *(int *)&a1[1].padding_0[1384] == 2);
    v7 = &v6;
    v6 = &v7;
    v0 = v15;
    v1 = v16;
    v18 = sub_7da2c(*(int *)&a1[1].padding_0[1532], v10->field_30, v13, 31, v14 + 2064, 0, &g_cbf18c, 5);
    v0 = v15;
    v1 = v16;
    v19 = sub_7da2c(*(int *)&a1[1].padding_0[1528], v10->field_20, v13, 35, v14 + 4288, &g_cbf258, &g_cbf144, 6);
    v0 = v15;
    v1 = v16;
    v20 = sub_7da2c(*(int *)&a1[1].padding_0[0x600], v10->field_28, v13, 52, v14 + 2836, &g_cbf27c, &g_cbf1c6, 6);
    v21 = 2;
    if ((unsigned long long)v13 > 127)
        v21 = 3;
    v22 = 3;
    if ((unsigned long long)((unsigned long long)(v13) >> 8) > 126)
        v22 = 4;
    return v22 + v21 + v17 + v18 + v19 + v20 + *(long long *)&a1[1].padding_0[1680];
}
