/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf7ec0..0xaf8188 (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af7ec0_1 {
    char padding_0[32];
    struct st_af7ec0_0 *field_20;
    char padding_28[16];
    struct st_af7ec0_2 *field_38;
    char padding_40[56];
    struct st_af7ec0_2 *field_78;
    char padding_80[20];
    unsigned int field_94;
    long long field_98;
    char padding_a0[12];
    unsigned int field_ac;
    unsigned int field_b0;
    char padding_b4[4];
    unsigned long long field_b8;
    char padding_c0[48];
    void* field_f0;
} st_af7ec0_1;

typedef struct st_af7ec0_0 {
    char padding_0[24];
    char field_18[8];
    char field_1a;
    char padding_1b[9];
    unsigned int field_24;
} st_af7ec0_0;

typedef struct st_af7ec0_3 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[4];
    unsigned long long field_c;
    char padding_14[48];
    void* field_44;
} st_af7ec0_3;

typedef struct st_af7ec0_2 {
    unsigned long long field_0;
} st_af7ec0_2;


unsigned long long sub_af7ec0(st_af7ec0_1 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x20
    void* v3;  // x25
    unsigned long long v12;  // x23
    unsigned long long v13;  // x21
    unsigned long long v14;  // w0
    unsigned long long v15;  // x0
    st_af7ec0_3 *v16;  // x8
    unsigned long long v17;  // x0
    unsigned long long v18;  // 4102
    long long v19;  // x0
    unsigned long long v4;  // w22
    unsigned long v5;  // cc_dep1
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = a0->field_f0;
    v4 = (unsigned int)sub_ad69e4(a0->field_98);
    if (v3 && (v5 = v2 & 0xffffffff, (int)v2 >= 1))
    {
        if ((int)v3[40] & 5)
        {
            v6 = arm64g_calculate_condition(19, v5, 1, 0);
            v7 = arm64g_calculate_condition(211, (v6 & 1 ? v4 : 0x40000000), (v6 & 1 ? v2 & 0xffffffff : 0), 0);
            if (!(v7 & 1))
                goto LABEL_af7f14;
        }
        else
        {
            v8 = arm64g_calculate_condition(19, v5, 1, 0);
            v9 = arm64g_calculate_condition(208, (v8 & 1 ? v4 : 0x40000000), (v8 & 1 ? v2 & 0xffffffff : 0), 0);
            if (!(v9 & 1))
            {
LABEL_af7f14:
                if (a0->field_f0 && (char)a0->field_f0[40] & 5)
                {
                    v10 = sub_ad69f8(a0->field_98, v2);
                    if (v10)
                    {
                        v11 = sub_af71a4(a0, v10, v2);
                        if (v11 >> 31 & 1)
                        {
                            return 0xffffffff;
                        }
                        else if ((unsigned int)v11)
                        {
                            a0->field_94 = (unsigned int)v2 - 1;
                            return 1;
                        }
                    }
                }
            }
        }
    }
    if (v4 > (int)v2)
    {
        v12 = v2;
        while (1)
        {
            v13 = sub_ad69f8(a0->field_98, v12);
            v14 = (unsigned int)sub_af3da0(v13, *(int *)&a0->field_20->padding_1b[3], 0);
            if (v14 == 1)
            {
                if (!v3)
                    return 1;
LABEL_af813c:
                if ((int)sub_ad69e4((long long)v3[8]) < 1)
                {
                    return 1;
                }
                else if ((int)v3[48] < 0)
                {
                    *(unsigned int *)&v3[48] = v2;
                    break;
                }
            }
            if (v14 != 2)
            {
                v12 = (unsigned int)v12 + 1;
                if (v4 == (unsigned int)v12)
                {
                    if (!(a0->field_20->field_18 & 0x80000))
                        v15 = 3;
                    else
                        v15 = 1;
                    if (!v3 || !(a0->field_20->field_18 & 0x80000))
                        return v15;
                    goto LABEL_af813c;
                }
            }
            else
            {
                v16 = &a0->field_ac;
                if (!(v12 >> 31 & 1))
                {
                    v16->field_0 = v12;
                    if (!v13)
                        goto LABEL_af7fe8;
                }
                else
                {
                    v12 = v16->field_0;
                    if (!v13)
                    {
LABEL_af7fe8:
                        v13 = sub_ad69f8(a0->field_98, v12);
                    }
                }
                a0->field_b8 = v13;
                a0->field_b0 = 28;
                a0->field_38();
            }
        }
        if ((int)v3[44] < 0)
            v17 = 3;
        else
            v17 = 1;
        return v17;
    }
    else
    {
        v18 = arm64g_calculate_condition(19, v4, v2 & 0xffffffff, 0);
        if (v18 & 1 || !(a0->field_20->field_18[2] >> 3 & 1))
            return 3;
        v19 = sub_ad69f8(a0->field_98, 0);
        sub_a36c8c(v19, 0);
        sub_ab1c50(v19);
        a0->field_78();
        return 3;
    }
}
