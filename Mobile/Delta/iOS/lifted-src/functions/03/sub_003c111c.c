/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c111c..0x3c13a4 (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c111c_1 {
    char padding_0[40];
    long long field_28;
    char padding_30[100];
    unsigned int field_94;
} st_3c111c_1;

typedef struct st_3c111c_4 {
    char padding_0[20];
    unsigned int field_14;
} st_3c111c_4;

typedef struct st_3c111c_3 {
    char padding_0[128];
    char field_80;
    char padding_81[39];
    char field_a8;
    char padding_a9[55];
    struct st_3c111c_0 *field_e0;
    char field_e8;
    char padding_e9[255];
    char field_1e8;
} st_3c111c_3;

typedef struct st_3c111c_0 {
    char field_0;
} st_3c111c_0;

extern long long g_cbed28;
extern unsigned long long g_e7d638;
extern unsigned long long g_e7d688;

long long sub_3c111c(st_3c111c_3 *a0, st_3c111c_1 *a1)
{
    unsigned long v14;  // x3
    void* v15;  // x8
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned long long v26;  // w10
    unsigned long long v27;  // w11
    unsigned int v28;  // w12
    unsigned long long *v29;  // x13
    unsigned long long v30;  // x9
    st_3c111c_4 *v31;  // x0
    long long idx;  // x20
    unsigned long v16;  // x9
    unsigned int v17;  // w10
    unsigned int v18;  // w11
    unsigned long v19;  // cc_dep1
    unsigned int v20;  // w11
    unsigned int v21;  // w11
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    st_3c111c_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_3c111c_0 *v1;  // [bp-0xd0]
    unsigned long long v2;  // [bp-0xc4]
    unsigned long long *v3;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0xb0]
    unsigned int v5;  // [bp-0xa0]
    unsigned long long v6;  // [bp-0x90]
    unsigned long long v7;  // [bp-0x88]
    unsigned long long v8;  // [bp-0x80]
    st_3c111c_1 *v9;  // [bp-0x78]
    char v10;  // [bp-0x69]
    unsigned long long *v11;  // [bp-0x68], Other Possible Types: st_3c111c_1 **
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v1 = &v0;
    v0 = &v1;
    v8 = 0;
    v9 = a1;
    v6 = 0;
    v3 = 0;
    v4 = 0;
    v5 = 0x3f800000;
    v14 = a1->field_94;
    if ((int)v14 >= 1)
        sub_3c0d94(&v6, a1->field_28, a1->field_28 + v14 * 4);
    if ((int)a1->field_94 <= 0)
    {
        v11 = &v9;
        idx = sub_3c0ecc(&a0->field_80, &v9, &g_cbed28, &v11, &v2);
        sub_239b0(idx + 24);
        *(uint128_t *)(idx + 24) = v6;
        *(unsigned long long *)(idx + 40) = v8;
        v7 = 0;
        v8 = 0;
        v6 = 0;
        v11 = &v9;
        sub_3be76c(sub_3c1a94(&a0->field_a8, &v9, &g_cbed28, &v11, &v2) + 24, &v3);
        sub_43360(&v3, v4);
        sub_2219c(&v3, 0);
        v3 = &v6;
        return sub_1aedc(&v3);
    }
    v15 = v6;
    v16 = *(char *)v15;
    v17 = *(char *)&a0->field_e0[v16];
    v18 = v17 - 7;
    v19 = v18;
    if (59 >= v18)
    {
        if (!(1 << ((char)v18 & 63) & 588071595158807331))
            goto LABEL_3c1220;
        goto LABEL_3c11fc;
    }
    else
    {
        v20 = v17 - 74;
        v21 = 1 << ((char)v20 & 31) & 228987;
        if (v20 <= 0x11)
        {
            v22 = arm64g_calculate_condition(147, v19, 59, 0);
            v23 = arm64g_calculate_condition(19, (v22 & 1 ? v21 : 0x40000000), 0, 0);
            if (!(v23 & 1))
                goto LABEL_3c1220;
            v26 = 1;
LABEL_3c11fc:
            v27 = 2;
        }
        else
        {
            v24 = arm64g_calculate_condition(147, v19, 59, 0);
            v25 = arm64g_calculate_condition(16, (v24 & 1 ? v21 : 0x40000000), 0, 0);
            if (v25 & 1)
                goto LABEL_3c11fc;
LABEL_3c1220:
            v26 = 0;
            v27 = 1;
        }
    }
    v28 = *(int *)v15;
    *(char *)v15 = (&a0->field_e8)[v16];
    v29 = &g_e7d638;
    if ((int)a1->field_94 >= v27)
    {
        if (a0->field_1e8 == (unsigned int)v16)
            v30 = v26 ^ 1;
        else
            v30 = 1;
        if (!(v30 & 1))
        {
            v2 = (int)(v28) >> 16;
            if (v2 >= 0 && *(int *)&a1[1].padding_0[0] > v2)
            {
                v11 = &v2;
                v31 = sub_3c13a4(&v3, &v2, &g_cbed28, &v11, &v10);
                v31->field_14 = (int)v15[4];
            }
        }
        v29 = &g_e7d688;
    }
    goto *((void *)(*v29));
}
