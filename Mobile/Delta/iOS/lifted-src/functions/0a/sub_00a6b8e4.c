/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b8e4..0xa6ba70 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6b8e4_1 {
    struct st_a6b8e4_1 *field_0;
    char padding_8[16];
    struct st_a6b8e4_1 *field_18;
} st_a6b8e4_1;

typedef struct st_a6b8e4_0 {
    long long field_0;
    long long field_8;
} st_a6b8e4_0;

extern long long g_a6be70;
extern long long g_f08ff8;
extern st_a6b8e4_0 *g_f12e78;

st_a6b8e4_1 * sub_a6b8e4(unsigned long a0, st_a6b8e4_1 *a1)
{
    st_a6b8e4_1 *v2;  // w0
    long long *v3;  // x19
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long v12;  // 4112
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    st_a6b8e4_1 *v18;  // x0
    st_a6b8e4_1 *v19;  // x22
    st_a6b8e4_1 *v20;  // x0
    st_a6b8e4_1 **v21;  // x24
    st_a6b8e4_1 *v22;  // x8
    st_a6b8e4_1 *v23;  // x0
    st_a6b8e4_1 **v24;  // x25
    unsigned long v25;  // x26
    unsigned long v4;  // 4112
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long long v7;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_a6b8e4_1 *)(unsigned int)sub_a7c208(&g_f08ff8, &g_a6be70);
    v3 = &g_f12e78->field_0;
    if (v2)
    {
        v4 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
        v5 = 3;
        v6 = (v4 & 1 ? *(int *)15806068 : 0x40000000);
        v7 = arm64g_calculate_condition(19, v6, 0, 0);
        if (!(v7 & 1))
            goto LABEL_a6b932;
LABEL_a6b931:
        v14 = arm64g_calculate_condition(v5 | 16, v6, 0, 0);
        v15 = arm64g_calculate_condition(20, (v14 & 1 ? g_f12e78 : 0x40000000), 0, 0);
        if (!(v15 & 1))
            return 0;
    }
    else
    {
        v12 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
        v5 = 0;
        v6 = (v12 & 1 ? *(int *)15806068 : 0x40000000);
        v13 = arm64g_calculate_condition(16, v6, 0, 0);
        if (v13 & 1)
            goto LABEL_a6b931;
LABEL_a6b932:
        v16 = arm64g_calculate_condition(v5 | 16, v6, 0, 0);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? g_f12e78 : 0x40000000), 0, 0);
        if (!(v17 & 1))
            return 0;
    }
    if (a1)
    {
        g_f12e78 = 0;
    }
    else
    {
        v18 = sub_a7c198(v3[1]);
        if (!(unsigned int)v18)
            return v18;
    }
    if ((int)sub_ad69e4(*v3) >= 1)
    {
        v19 = 0;
        do
        {
            v20 = sub_ad69f8(*v3, v19);
            if (!v20)
            {
                if (a1)
                    return 0;
                sub_a7c1b4(v3[1]);
                return 0;
            }
            v21 = v20;
            v22 = v20->field_0;
            if (v22)
            {
                v23 = 0;
                while (1)
                {
                    if (!v23)
                        v24 = v21;
                    else
                        v24 = &v23->field_18;
                    v23 = v22;
                    while (a1 || v23->field_0 == a0)
                    {
                        v25 = v23->field_18;
                        *v24 = v25;
                        sub_a6c2e4();
                        if (!v25)
                            goto LABEL_a6b9f8;
                    }
                    v22 = v23->field_18;
                }
            }
            else
            {
LABEL_a6b9f8:
                if (a1)
                    sub_a6c2e4(v21, "crypto/initthread.c", 482);
            }
        } while ((v19 = (unsigned int)v19 + 1, (int)sub_ad69e4(*v3) > (int)(unsigned int)v19));
    }
    if (a1)
    {
        sub_a7c1d0(v3[1]);
        sub_ad6020(*v3);
        sub_a6c2e4(v3, "crypto/initthread.c", 487);
    }
    else
    {
        sub_a7c1b4(v3[1]);
    }
    return 1;
}
