/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb59000..0xb591e8 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b59000_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[15];
    uint128_t field_5c;
    uint128_t field_6c;
    uint128_t field_7c;
    uint128_t field_8c;
    char field_9c[28];
    char field_a8;
    char padding_a9[19];
    unsigned long long field_bc;
} st_b59000_1;

typedef struct st_b59000_3 {
    char padding_0[356];
    uint128_t field_164;
    uint128_t field_174;
    uint128_t field_184;
    uint128_t field_194;
    char field_1a4[28];
    char field_1b0;
    char padding_1b1[15];
    uint128_t field_1c0;
    uint128_t field_1d0;
    uint128_t field_1e0;
    uint128_t field_1f0;
    char field_200[28];
    char field_20c;
    char padding_20d[19];
    unsigned long long field_220;
} st_b59000_3;

typedef struct st_b59000_0 {
    char padding_0[108];
    char field_6c;
    char padding_6d[83];
    char field_c0;
    char padding_c1[355];
    uint128_t field_224;
    uint128_t field_234;
    uint128_t field_244;
    uint128_t field_254;
    char field_264[28];
    char field_270;
    char padding_271[15];
    uint128_t field_280;
    uint128_t field_290;
    uint128_t field_2a0;
    uint128_t field_2b0;
    char field_2c0[28];
    char field_2cc;
    char padding_2cd[19];
    long long field_2e0;
} st_b59000_0;

typedef struct st_b59000_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[19];
    unsigned long long field_60;
} st_b59000_2;

extern char g_10002b0;

unsigned int sub_b59000(st_b59000_0 *a0, long long a1, long long a2, unsigned long a3)
{
    long long n;  // x22
    unsigned long v5;  // x8
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long v14;  // cc_op
    long long v15;  // x21
    unsigned long long v6;  // 4171
    long long v16;  // x20
    st_b59000_2 *v17;  // x23
    unsigned long long v18;  // 4109
    st_b59000_1 *v19;  // x8
    uint128_t v20;  // q1
    uint128_t v21;  // q1
    unsigned long long v22;  // 4109
    st_b59000_2 *v23;  // x23
    st_b59000_3 *v24;  // x0
    long long v25;  // x2
    st_b59000_1 *v26;  // x8
    uint128_t v27;  // q1
    uint128_t v28;  // q1
    unsigned int v29;  // w0
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    char v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    n = *(long long *)&a0->field_2c0[0];
    v5 = n + 16;
    v6 = arm64g_calculate_condition(18, n, 1, 0);
    if (v6 & 1)
    {
        v7 = arm64g_calculate_condition(v14 | 16, v9, v10, v11);
        v8 = arm64g_calculate_condition(20, (v7 & 1 ? v5 : 0x40000000), (v7 & 1 ? a3 : 0), 0);
        if (!(v8 & 1))
            goto LABEL_b5903c;
LABEL_b590dc:
        v29 = 0;
    }
    else
    {
        v12 = arm64g_calculate_condition(v14 | 16, v9, v10, v11);
        v13 = arm64g_calculate_condition(16, (v12 & 1 ? v5 : 0x40000000), (v12 & 1 ? a3 : 0), 0);
        if (v13 & 1)
            goto LABEL_b590dc;
LABEL_b5903c:
        v15 = a3;
        v16 = a1;
        if (!(a0->field_6c >> 1 & 1))
        {
            sub_aaa838(&a0->field_c0, v15);
            v17 = &a0->field_264[16];
            v18 = arm64g_calculate_condition(2, n, 1, 0);
            if (!(v18 & 1))
            {
                sub_a7d544(v17, v16, n);
                sub_a7d64c(&v0, v17);
                v19 = (a0->padding_c1)[1];
                v20 = v19->field_30;
                v17->field_20 = v19->field_20;
                v17->field_30 = v20;
                *(int128_t *)&v17->field_40[0] = *(int128_t *)&v19->field_40[0];
                *(int128_t *)&v17->field_40[12] = *(int128_t *)&a0->field_264[0];
                v21 = v19->field_10;
                v17->field_0 = v19->field_0;
                v17->field_10 = v21;
                sub_a7d544(v17, &v0, 16);
                sub_a7d64c(&v0, v17);
                if (sub_a66f20(v16 + n, &v0, 16))
                    goto LABEL_b590dc;
            }
            else
            {
                sub_a7d544(v17, v16, v15);
            }
        }
        else
        {
            v22 = arm64g_calculate_condition(2, n, 1, 0);
            if (v22 & 1)
                n = v15;
            v23 = &a0->field_264[16];
            sub_a7d544();
            if (n == v15)
            {
                v24 = &a0->field_c0;
                v25 = a2;
            }
            else
            {
                if (a2 != v16)
                    _memcpy(v16, a2, n);
                sub_a7d64c(v16 + n, v23);
                v26 = (a0->padding_c1)[1];
                v27 = v26->field_30;
                v23->field_20 = v26->field_20;
                v23->field_30 = v27;
                *(int128_t *)&v23->field_40[0] = *(int128_t *)&v26->field_40[0];
                *(int128_t *)&v23->field_40[12] = *(int128_t *)&a0->field_264[0];
                v28 = v26->field_10;
                v23->field_0 = v26->field_0;
                v23->field_10 = v28;
                sub_a7d544(v23, v16 + n, 16);
                sub_a7d64c(v16 + n, v23);
                v24 = &a0->field_c0;
                v25 = v16;
            }
            sub_aaa838(v24, v15, v25, v16);
        }
        *(long long *)&a0->field_2c0[0] = -0x1;
        v29 = 1;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v29;
    ___stack_chk_fail();
}
