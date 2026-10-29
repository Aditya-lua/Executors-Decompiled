/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa49ba8..0xa49da0 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a49ba8_0 {
    char padding_0[352];
    uint128_t field_160;
    uint128_t field_170;
    uint128_t field_180;
    uint128_t field_190;
    char field_1a0[28];
    char field_1ac;
    char padding_1ad[15];
    uint128_t field_1bc;
    uint128_t field_1cc;
    uint128_t field_1dc;
    uint128_t field_1ec;
    char field_1fc[28];
    char field_208;
    char padding_209[15];
    long long field_218;
} st_a49ba8_0;

typedef struct st_a49ba8_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[15];
    unsigned long long field_5c;
} st_a49ba8_1;

extern char g_10002b0;

int sub_a49ba8(long long a0, long long a1, long long a2, long long a3)
{
    long long v4;  // x21
    long long v5;  // x20
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    st_a49ba8_0 *v6;  // x0
    st_a49ba8_0 *v18;  // x19
    unsigned long long v19;  // 4109
    st_a49ba8_1 *v20;  // x23
    st_a49ba8_0 *v21;  // x0
    long long v22;  // x2
    uint128_t v23;  // q1
    uint128_t v24;  // q1
    st_a49ba8_1 *v25;  // x23
    long long n;  // x22
    unsigned long long v26;  // 4109
    uint128_t v27;  // q1
    uint128_t v28;  // q1
    unsigned int v29;  // w0
    unsigned long v8;  // x8
    unsigned long long v9;  // 4121
    char v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    v5 = a1;
    v1 = *(long long *)&g_10002b0;
    v6 = sub_9ffdd8();
    n = *(long long *)&v6->field_1fc[8];
    v8 = n + 16;
    v9 = arm64g_calculate_condition(18, n, 1, 0);
    if (v9 & 1)
    {
        v10 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
        v11 = arm64g_calculate_condition(20, (v10 & 1 ? v8 : 0x40000000), (v10 & 1 ? v4 : 0), 0);
        if (!(v11 & 1))
            goto LABEL_a49bf8;
LABEL_a49ccc:
        v29 = 0;
    }
    else
    {
        v16 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? v8 : 0x40000000), (v16 & 1 ? v4 : 0), 0);
        if (v17 & 1)
            goto LABEL_a49ccc;
LABEL_a49bf8:
        v18 = v6;
        if (sub_a50720(a0))
        {
            v19 = arm64g_calculate_condition(2, n, 1, 0);
            if (v19 & 1)
                n = v4;
            v20 = &v18->field_1ac;
            sub_a7d544();
            if (n == v4)
            {
                v21 = v18;
                v22 = a2;
            }
            else
            {
                if (a2 != v5)
                    _memcpy(v5, a2, n);
                sub_a7d64c(v5 + n, v20);
                v23 = v18->field_190;
                v20->field_20 = v18->field_180;
                v20->field_30 = v23;
                *(int128_t *)&v20->field_40[0] = *(int128_t *)&v18->field_1a0[0];
                *(int128_t *)&v20->field_40[12] = *(int128_t *)&v18->field_1a0[12];
                v24 = v18->field_170;
                v20->field_0 = v18->field_160;
                v20->field_10 = v24;
                sub_a7d544(v20, v5 + n, 16);
                sub_a7d64c(v5 + n, v20);
                v22 = v5;
                v21 = v18;
            }
            sub_aaa838(v21, v4, v22, v5);
        }
        else
        {
            sub_aaa838(v18, v4, a2, v5);
            v25 = &v18->field_1ac;
            v26 = arm64g_calculate_condition(2, n, 1, 0);
            if (!(v26 & 1))
            {
                sub_a7d544(v25, v5, n);
                sub_a7d64c(&v0, v25);
                v27 = v18->field_190;
                v25->field_20 = v18->field_180;
                v25->field_30 = v27;
                *(int128_t *)&v25->field_40[0] = *(int128_t *)&v18->field_1a0[0];
                *(int128_t *)&v25->field_40[12] = *(int128_t *)&v18->field_1a0[12];
                v28 = v18->field_170;
                v25->field_0 = v18->field_160;
                v25->field_10 = v28;
                sub_a7d544(v25, &v0, 16);
                sub_a7d64c(&v0, v25);
                if (sub_a66f20(v5 + n, &v0, 16))
                    goto LABEL_a49ccc;
            }
            else
            {
                sub_a7d544(v25, v5, v4);
            }
        }
        *(long long *)&v18->field_1fc[8] = -0x1;
        v29 = 1;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v29;
    ___stack_chk_fail();
}
