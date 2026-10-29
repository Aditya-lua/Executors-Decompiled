/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5b3b4..0x5b62c (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5b3b4_2 {
    struct st_5b3b4_1 *field_0;
    unsigned long long field_8;
} st_5b3b4_2;

typedef struct st_5b3b4_1 {
    struct st_5b3b4_1 *field_0;
    struct st_5b3b4_1 *field_8;
} st_5b3b4_1;

typedef struct st_5b3b4_0 {
    char field_0;
} st_5b3b4_0;

extern st_5b3b4_1 g_f011d0;
extern char g_1000000;

st_5b3b4_1 * sub_5b3b4(long long a0, st_5b3b4_1 *a1, long long a2, st_5b3b4_1 *a3)
{
    st_5b3b4_1 *v4;  // cc_dep1
    long long v5;  // x22
    unsigned int v14;  // w15
    unsigned int v15;  // w11
    unsigned int v16;  // w14
    unsigned int v17;  // w0
    unsigned int v18;  // w11
    unsigned int v19;  // w14
    unsigned int v20;  // w11
    unsigned int v21;  // w14
    unsigned int v22;  // w10
    unsigned int v23;  // w9
    st_5b3b4_1 *v6;  // x20
    unsigned int v24;  // w10
    unsigned int v25;  // w11
    unsigned int v26;  // w9
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4102
    unsigned long long v30;  // 4112
    unsigned long long v31;  // 4102
    long long v32;  // x0
    st_5b3b4_2 *v33;  // x0
    unsigned int v7;  // w8
    st_5b3b4_1 *v34;  // x0
    st_5b3b4_1 *v35;  // x23
    st_5b3b4_2 *v36;  // x0
    st_5b3b4_1 *v37;  // x0
    unsigned int v8;  // w9
    unsigned int v9;  // w10
    unsigned int v10;  // w11
    unsigned int v11;  // w12
    unsigned int v12;  // w13
    unsigned int v13;  // w14
    st_5b3b4_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_5b3b4_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1;
    if (a1 == &g_f011d0.field_0)
        return a3;
    v5 = a2;
    v6 = a1;
    while (1)
    {
        v7 = (char)v6->field_0;
        v8 = (char)v7;
        v9 = v8 - 1 | 1;
        v10 = ((-v8 | 1) + v8 + v9 ^ -v8) + ((-v8 | 1) + v8 + v9 & -v8) * 2 - 1;
        v11 = ~v8;
        v12 = (long long)(v7 * &g_1000000) >> 31 & 0xfffffe00 | __ROL__(v7, 1) & 0x1fe & 0x1ff;
        v13 = v8 + v12 + v11 * 4 + 4;
        v14 = v10 ^ v13;
        v15 = ((~(v14 + (v10 & v13) * 2) + (v14 + (v10 & v13) * 2) * 2) * 2 & 4) + (~(v14 + (v10 & v13) * 2) + (v14 + (v10 & v13) * 2) * 2 ^ 2);
        v16 = v15 - 1;
        v17 = -v15;
        v18 = v15 - (v16 | 0xfffffffe) - 2 + (v17 | 1) + v15 + (0x80000001 - (v15 - (v16 | 0xfffffffe)) & -((v17 | 1) + v15)) * 2 + (unsigned int)(v15 - (v16 | 0xfffffffe) - 2 - ((v17 | 1) + v15) - (v15 - (v16 | 0xfffffffe) - 2 | -((v17 | 1) + v15))) * 2;
        v19 = (unsigned int)((v16 ^ 0xfffffffe) + ((v14 * 2 | v14 >> 31) & 2 & 3) - ((v17 & 0xfffffffe) + ((v16 * 2 | v16 >> 31) & 2 & 3))) + 1;
        v20 = (v18 ^ v19) + (v18 + (v19 | ~v18)) * 2;
        v21 = v20 + 3;
        v22 = v8 + (v8 | 0xfffffffe) + v8 - v9 + 1;
        v23 = ((v12 & 2) + (v8 ^ 1) + v11 * 2 & v22) - (((v12 & 2) + (v8 ^ 1) + v11 * 2 | ~v22) + ((v12 & 2) + (v8 ^ 1) + v11 * 2 + v22) * 2);
        v24 = ~(v23 - 2) + (v23 - 2) * 2;
        v25 = 0xfffffffe - v20;
        v26 = v24 + v21 + (v25 | (unsigned int)(2 - v23));
        if (((v25 | v24) + v21 + v26 - 1 + (v26 - 1 | -((v25 | v24) + v21)) + ((v25 | v24) + v21 - 1 & -v26) & 1) + ((v25 | v24) + v21 + v26 - 1 + (v26 - 1 | -((v25 | v24) + v21)) + ((v25 | v24) + v21 - 1 & -v26) | 1))
        {
            v28 = arm64g_calculate_condition(20, v4, &g_f011d0.field_0, 0);
            v29 = arm64g_calculate_condition(35, (v28 & 1 ? v7 & 0xff : 0), (v28 & 1 ? 4 : 0), 0);
            if (v29 & 1)
                break;
        }
        else
        {
            v30 = arm64g_calculate_condition(20, v4, &g_f011d0.field_0, 0);
            v31 = arm64g_calculate_condition(32, (v30 & 1 ? v7 & 0xff : 0), (v30 & 1 ? 4 : 0), 0);
            if (v31 & 1)
                break;
        }
        v32 = sub_5afb4(a0, v5);
        v33 = sub_60194(a0);
        v33->field_0 = v6->field_0;
        v33->field_8 = v32;
        v34 = sub_60194(a0);
        v35 = v34;
        v34->field_0 = v33;
        v35->field_8 = a3;
        v4 = v6->field_8;
        v5 = sub_5a954(a0, v5);
        a3 = v35;
        v6 = v4;
        if (v6 == &g_f011d0.field_0)
            return v35;
    }
    v36 = sub_60194(a0);
    v36->field_0 = v6;
    v36->field_8 = v5;
    v37 = sub_60194(a0);
    v37->field_0 = v36;
    v37->field_8 = a3;
    return v37;
}
