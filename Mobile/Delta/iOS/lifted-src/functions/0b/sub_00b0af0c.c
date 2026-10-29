/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0af0c..0xb0b128 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0af0c_0 {
    char padding_0[136];
    struct st_b0af0c_1 *field_88;
    struct st_b0af0c_0 *field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
} st_b0af0c_0;

typedef struct st_b0af0c_1 {
    char padding_0[264];
    struct st_b0af0c_1 *field_108;
    struct st_b0af0c_0 *field_110;
    unsigned long long field_118;
    unsigned long long field_120;
} st_b0af0c_1;

typedef struct st_b0af0c_2 {
    char padding_0[108];
    char field_6c;
    char padding_6d[83];
    char field_c0;
    char padding_c1[127];
    char field_140;
    char padding_141[135];
    struct st_b0af0c_1 *field_1c8;
    struct st_b0af0c_0 *field_1d0;
    unsigned long long field_1d8;
    unsigned long long field_1e0;
} st_b0af0c_2;

extern unsigned long long g_acbd00;
extern unsigned long long g_acbd60;
extern unsigned long long g_acca24;
extern unsigned long long g_acd334;
extern unsigned long long g_ace320;
extern unsigned long long g_ace540;
extern unsigned long long g_acfe20;
extern unsigned int g_ad0c20;
extern unsigned long long g_ad2260;
extern unsigned long long g_ad2440;
extern unsigned long long g_ad3b40;
extern unsigned int g_ad4800;
extern unsigned int g_f0d568;
extern unsigned int g_f0d56c;

int sub_b0af0c(st_b0af0c_2 *a0, long long a1, unsigned long long a2)
{
    unsigned int v2;  // w9
    unsigned long v3;  // cc_op
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    long long v17;  // x0
    st_b0af0c_1 *v18;  // x1
    unsigned long long v19;  // x8
    st_b0af0c_0 *v20;  // x22
    st_b0af0c_1 *v21;  // x21
    unsigned long v4;  // cc_dep1
    unsigned long long v22;  // x8
    long long v23;  // x0
    st_b0af0c_1 *v24;  // x1
    unsigned long long v25;  // x8
    st_b0af0c_0 *v26;  // x22
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // cc_ndep
    long long v8;  // x0
    st_b0af0c_1 *v9;  // x1
    unsigned long long v10;  // x8
    st_b0af0c_0 *v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(g_f0d568 >> 10 & 1))
    {
        v2 = g_f0d56c & 0xfffffff0 & 0xff0fffff;
        if (g_f0d568 >> 7 & 1)
        {
            v3 = 3;
            v4 = v2;
            v5 = 1208995856;
            v6 = 0;
            if (v2 == 1208995856)
            {
                v8 = a1;
                v9 = &a0->field_c0;
                if (!(a0->field_6c >> 1 & 1))
                {
                    sub_ad2240(v8, v9);
                    v10 = &g_ad2440;
                }
                else
                {
                    sub_ad2220(v8, v9);
                    v10 = &g_ad2260;
                }
                a0->field_1d8 = v10;
                v11 = &a0->field_140;
                sub_ad2220(a1 + (a2 >> 1), v11);
                a0->field_1c8 = v9;
                a0->field_1d0 = v11;
                *(unsigned int **)&a0[1].padding_0[8] = &g_ad4800;
                a0->field_1e0 = &g_ad2260;
                *(unsigned long long **)&a0[1].padding_0[0] = &g_ad3b40;
                return 1;
            }
        }
        if (g_f0d568 >> 7 & 1)
        {
            if (v2 != 0x410fd400)
            {
                v13 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
                v14 = arm64g_calculate_condition(19, (v13 & 1 ? v2 : 0x40000000), (v13 & 1 ? 1091555520 : 0), 0);
                if (!(v14 & 1))
                    goto LABEL_b0afe0;
            }
            else
            {
                v15 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
                v16 = arm64g_calculate_condition(16, (v15 & 1 ? v2 : 0x40000000), (v15 & 1 ? 1091555520 : 0), 0);
                if (!(v16 & 1))
                {
LABEL_b0afe0:
                    v17 = a1;
                    v18 = &a0->field_c0;
                    if (!(a0->field_6c >> 1 & 1))
                    {
                        sub_ace300(v17, v18);
                        v19 = &g_ace540;
                    }
                    else
                    {
                        sub_ace2e0(v17, v18);
                        v19 = &g_ace320;
                    }
                    a0->field_1d8 = v19;
                    v20 = &a0->field_140;
                    sub_ace2e0(a1 + (a2 >> 1), v20);
                    a0->field_1c8 = v18;
                    a0->field_1d0 = v20;
                    *(unsigned int **)&a0[1].padding_0[8] = &g_ad0c20;
                    a0->field_1e0 = &g_ace320;
                    *(unsigned long long **)&a0[1].padding_0[0] = &g_acfe20;
                    return 1;
                }
            }
        }
        v21 = &a0->field_c0;
        sub_acc878(a1, v21);
        v22 = &g_acd334;
        if (a0->field_6c & 2)
            v22 = &g_acca24;
        a0->field_1d8 = v22;
        sub_acc878();
        a0->field_1c8 = v21;
        a0->field_1d0 = &a0->field_140;
        *(unsigned long long *)&a0[1].padding_0[8] = 0;
        a0->field_1e0 = &g_acca24;
        *(unsigned long long *)&a0[1].padding_0[0] = 0;
        return 1;
    }
    else
    {
        v23 = a1;
        v24 = &a0->field_c0;
        if (!(a0->field_6c >> 1 & 1))
        {
            sub_acbc60(v23, v24);
            v25 = &g_acbd60;
        }
        else
        {
            sub_acbc00(v23, v24);
            v25 = &g_acbd00;
        }
        a0->field_1d8 = v25;
        v26 = &a0->field_140;
        sub_acbc00(a1 + (a2 >> 1), v26);
        a0->field_1c8 = v24;
        a0->field_1d0 = v26;
        *(unsigned long long *)&a0[1].padding_0[8] = 0;
        a0->field_1e0 = &g_acbd00;
        *(unsigned long long *)&a0[1].padding_0[0] = 0;
        return 1;
    }
}
