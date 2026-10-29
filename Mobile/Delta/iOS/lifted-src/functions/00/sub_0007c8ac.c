/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7c8ac..0x7cc28 (892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7c8ac_3 {
    char padding_0[772];
    char field_304;
    char padding_305[1451];
    char field_8b0;
    char padding_8b1[1315];
    unsigned int field_dd4;
    unsigned int field_dd8;
    unsigned int field_ddc;
} st_7c8ac_3;

typedef struct st_7c8ac_2 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned int field_20;
} st_7c8ac_2;

typedef struct st_7c8ac_1 {
    char padding_0[32];
    long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_7c8ac_1;

typedef struct st_7c8ac_0 {
    char field_0;
} st_7c8ac_0;

extern long long g_cbf144;
extern long long g_cbf18c;
extern long long g_cbf1c6;

unsigned long long sub_7c8ac(st_7c8ac_1 *a0, long long a1, st_7c8ac_3 *a2, st_7c8ac_3 *a3, long long a4, unsigned long a5, unsigned int a6, long long a7, unsigned long a8, long long a9)
{
    long long v9;  // x25
    st_7c8ac_2 *v10;  // x8
    long long v19;  // x23
    unsigned long v20;  // x21
    long long v21;  // x26
    long long v22;  // x0
    unsigned long v23;  // x2
    st_7c8ac_3 *v24;  // x20
    st_7c8ac_3 *v25;  // x24
    unsigned long long v26;  // x28
    unsigned long long v27;  // x0
    unsigned long long v28;  // 4106
    long long v11;  // x0
    long long v29;  // x25
    long long v30;  // x22
    unsigned long v31;  // x28
    long long v32;  // x23
    unsigned long v33;  // x21
    long long v34;  // x26
    long long v35;  // x0
    st_7c8ac_3 *v36;  // x9
    st_7c8ac_3 *v37;  // x20
    unsigned int *v38;  // x19
    unsigned int *v12;  // x19
    unsigned long long v39;  // x24
    unsigned long long v40;  // 4106
    unsigned long long v13;  // x28
    unsigned long long v14;  // x0
    unsigned long long v15;  // 4106
    long long v16;  // x25
    unsigned long v17;  // x19
    long long v18;  // x22
    unsigned long v0;  // [bp-0x110], Other Possible Types: long long
    long long v1;  // [bp-0x108]
    unsigned long v2;  // [bp-0xd8]
    unsigned long v3;  // [bp-0xd0]
    long long v4;  // [bp-0xb8]
    st_7c8ac_0 **v5;  // [bp-0x80], Other Possible Types: char
    st_7c8ac_0 *v6;  // [bp-0x78]
    unsigned int v7;  // [bp-0x6c]
    char *v8;  // [bp-0x10]

    v8 = &a8;
    v6 = &v5;
    v5 = &v6;
    v2 = a0->field_28;
    v3 = a0->field_30;
    v9 = a0->field_20;
    v10->field_18 = 0;
    v10->field_20 = sub_82ad0();
    v7 = 35;
    v11 = sub_79174(a7, &v7, v9, a1, a8, a9);
    a3->field_ddc = a2->field_ddc;
    v12 = &a2->field_8b0;
    *(unsigned int *)&v1 = a6;
    v13 = sub_83010(&a3->field_ddc, a7, v7, v11, a1, 9, v12, &g_cbf144, 4294967302, v1);
    v10->field_0 = v13;
    v0 = a1;
    v1 = &g_cbf144;
    v4 = a1;
    v14 = sub_831e8(a4, a5 - a4, &a3->field_8b0, 9, v13, a7, v7, v9, v0, v1, 150323855366, v12, 1316, a8, a9);
    v15 = arm64g_calculate_condition(0x22, v14, 0x77, 0);
    if (v15 & 1)
    {
        v10->field_10 = v14;
        return v14;
    }
    if ((unsigned int)v13 == 2)
        v10->field_18 = v14;
    v16 = a4 + v14;
    v7 = 31;
    v17 = v3;
    v18 = a7;
    v19 = v4;
    v20 = a8;
    v21 = a9;
    v22 = sub_79174(v18, &v7, v17, v19, v20, v21);
    v23 = v7;
    v24 = a2;
    v25 = a3;
    v25->field_dd4 = v24->field_dd4;
    *(unsigned int *)((char *)&v0 + 4) = 29 > (unsigned int)v23;
    *(unsigned int *)&v1 = a6;
    *(unsigned int *)&v0 = 5;
    v26 = sub_83010(&v25->field_dd4, v18, v23, v22, v19, 8, v24, &g_cbf18c, v0, v1);
    v10->field_4 = v26;
    v1 = &g_cbf18c;
    v27 = sub_831e8(v16, a5 - v16, v25, 8, v26, v18, v7, v17, v19, v1, 120259084293, v24, 772, v20, v21);
    v28 = arm64g_calculate_condition(0x22, v27, 0x77, 0);
    if (!(v28 & 1))
    {
        if ((unsigned int)v26 == 2)
            v10->field_18 = v27;
        v29 = v16 + v27;
        v7 = 52;
        v30 = a7;
        v31 = v2;
        v32 = v4;
        v33 = a8;
        v34 = a9;
        v35 = sub_79174(v30, &v7, v31, v32, v33, v34);
        v36 = a2;
        v37 = a3;
        v37->field_dd8 = v36->field_dd8;
        v38 = &v36->field_304;
        *(unsigned int *)&v1 = a6;
        v39 = sub_83010(&v37->field_dd8, v30, v7, v35, v32, 9, v38, &g_cbf1c6, 4294967302, v1);
        v10->field_8 = v39;
        v27 = sub_831e8(v29, a5 - v29, &v37->field_304, 9, v39, v30, v7, v31, v32, &g_cbf1c6, 223338299398, v38, 1452, v33, v34);
        v40 = arm64g_calculate_condition(0x22, v27, 0x77, 0);
        if (!(v40 & 1))
        {
            if ((unsigned int)v39 == 2)
                v10->field_18 = v27;
            v10->field_10 = v29 + v27 - a4;
            return v27;
        }
    }
    v10->field_10 = v27;
    return v27;
}
