/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa83618..0xa83784 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a83618_3 {
    uint128_t field_0;
    uint128_t field_10;
} st_a83618_3;

typedef struct st_a83618_2 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_a83618_2;

typedef struct st_a83618_4 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    uint128_t field_20;
    uint128_t field_30;
} st_a83618_4;

typedef struct st_a83618_0 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    char padding_38[16];
    int field_48;
} st_a83618_0;

typedef struct st_a83618_1 {
    struct st_a83618_0 *field_0;
    char padding_8[48];
    struct st_a83618_2 *field_38;
    char padding_40[16];
    unsigned long long field_50;
    struct st_a83618_3 *field_58;
} st_a83618_1;


double sub_a83618(char *a0, unsigned long a1, st_a83618_1 *a2)
{
    st_a83618_0 *v3;  // x20
    int v4;  // w8
    unsigned int v13;  // w16
    unsigned int v14;  // w14
    long long v15;  // x19
    st_a83618_4 *v17;  // x8
    unsigned long long *v18;  // x10
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long v22;  // cc_ndep
    unsigned long long v5;  // x9
    unsigned long v23;  // 4110
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long long v27;  // 4110
    unsigned long v28;  // 4110
    char *v6;  // x10
    unsigned long long v29;  // 4110
    unsigned long v30;  // 4110
    unsigned long v31;  // cc_op
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long long v34;  // 4110
    int i;  // w8
    unsigned long v35;  // 4110
    unsigned long long v36;  // 4110
    unsigned long long v8;  // x12
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    char *iter;  // x13
    uint128_t *v41;  // x9
    uint128_t v42;  // q0
    uint128_t v43;  // q1
    unsigned short *v10;  // x15
    unsigned int v11;  // w14
    unsigned int v12;  // w17
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a2->field_0;
    v4 = v3->field_48;
    if (v4 >= 1)
    {
        v5 = a2->field_50;
        v6 = a0;
        do
        {
            i = v4;
            v8 = 0;
            iter = v6;
            do
            {
                v10 = v5 + v8;
                v11 = iter[1];
                v12 = iter[2];
                v13 = (*iter | (v11 * 0x100 | v11 >> 24) & 0xf00) & 0xfff;
                *v10 = v13;
                v14 = v11 >> 4 | v12 * 16;
                v10[1] = v14;
                if (0xd00 < v13 || 0xd00 < v14)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ml_kem/ml_kem.c", 1665, "parse_prvkey");
                    v0 = v3->field_0;
                    goto LABEL_a8374c;
                }
            } while ((iter += 3, v8 += 4, (unsigned int)v8 != 0x200));
            v5 += 0x200;
            v6 += 384;
            v4 = i - 1;
        } while (1 < i);
    }
    v15 = &a0[v3->field_30];
    if (sub_a833b0(v15))
    {
        v17 = v15 + v3->field_18;
        v18 = &a2->field_38->field_0;
        if (*v18 == v17->field_0)
        {
            v23 = arm64g_calculate_condition(v19, v20, v21, v22);
            v24 = 4;
            v25 = (v23 & 1 ? v18[1] : 0);
            v26 = (v23 & 1 ? *(long long *)&v17->padding_8[0] : 0);
            v27 = arm64g_calculate_condition(4, v25, v26, 0);
            if (!(v27 & 1))
                goto LABEL_a836e6;
LABEL_a836e5:
            v30 = arm64g_calculate_condition(v24, v25, v26, 0);
            v31 = 4;
            v32 = (v30 & 1 ? v18[2] : 0);
            v33 = (v30 & 1 ? *(long long *)&v17->padding_8[8] : 0);
            v34 = arm64g_calculate_condition(4, v32, v33, 0);
            if (!(v34 & 1))
                goto LABEL_a836ea;
LABEL_a836e9:
            v37 = arm64g_calculate_condition(v31, v32, v33, 0);
            v38 = arm64g_calculate_condition(4, (v37 & 1 ? v18[3] : 0), (v37 & 1 ? v17->field_18 : 0), 0);
            if (v38 & 1)
                goto LABEL_a83770;
            goto LABEL_a836f0;
        }
        else
        {
            v28 = arm64g_calculate_condition(v19, v20, v21, v22);
            v24 = 0;
            v25 = (v28 & 1 ? v18[1] : 0);
            v26 = (v28 & 1 ? *(long long *)&v17->padding_8[0] : 0);
            v29 = arm64g_calculate_condition(0, v25, v26, 0);
            if (v29 & 1)
                goto LABEL_a836e5;
LABEL_a836e6:
            v35 = arm64g_calculate_condition(v24, v25, v26, 0);
            v31 = 0;
            v32 = (v35 & 1 ? v18[2] : 0);
            v33 = (v35 & 1 ? *(long long *)&v17->padding_8[8] : 0);
            v36 = arm64g_calculate_condition(0, v32, v33, 0);
            if (v36 & 1)
                goto LABEL_a836e9;
LABEL_a836ea:
            v39 = arm64g_calculate_condition(v31, v32, v33, 0);
            v40 = arm64g_calculate_condition(0, (v39 & 1 ? v18[3] : 0), (v39 & 1 ? v17->field_18 : 0), 0);
            if (!(v40 & 1))
            {
LABEL_a836f0:
                sub_a368c8();
                sub_a369bc("crypto/ml_kem/ml_kem.c", 1678, "parse_prvkey");
                v0 = v3->field_0;
LABEL_a8374c:
                sub_a36abc(57, 158);
            }
            else
            {
LABEL_a83770:
                v41 = &a2->field_58->field_0;
                v42 = v17->field_20;
                v43 = v17->field_30;
                *v41 = v42;
                v41[1] = v43;
            }
        }
    }
    return (unsigned long long)v42;
}
