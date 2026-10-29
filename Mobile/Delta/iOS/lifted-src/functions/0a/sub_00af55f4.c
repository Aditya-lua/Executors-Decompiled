/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf55f4..0xaf5844 (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af55f4_0 {
    char padding_0[32];
    struct st_af55f4_1 *field_20;
    char padding_28[16];
    struct st_af55f4_2 *field_38;
    char padding_40[88];
    long long field_98;
    char padding_a0[16];
    char field_b0;
    char padding_b1[7];
    char field_b8;
    char padding_b9[7];
    char field_c0;
    char padding_c1[55];
    unsigned int field_f8;
} st_af55f4_0;

typedef struct st_af55f4_1 {
    char padding_0[25];
    char field_19;
    char field_1a;
} st_af55f4_1;

typedef struct st_af55f4_2 {
    unsigned long long field_0;
} st_af55f4_2;


unsigned long long sub_af55f4(st_af55f4_0 *a0)
{
    unsigned long long v2;  // w23
    unsigned long v3;  // x21
    char v12;  // w0
    char v13;  // x0
    unsigned long long *v14;  // x8
    unsigned long long v15;  // x0
    char v4;  // x20
    char v5;  // x22
    unsigned long v6;  // x24
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned int v9;  // w23
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)&a0[1].padding_0[4])
        a0->field_38();
    v2 = (unsigned int)sub_ad69e4(a0->field_98);
    v3 = v2 - 1;
    v4 = sub_ad69f8(a0->field_98, v3);
    *(unsigned int *)&a0->padding_a0[12] = v3;
    if (a0->field_f8)
    {
        v5 = 0;
LABEL_af566c:
        if (v2 < 1)
            return 1;
    }
    else
    {
        v5 = v4;
        if (!sub_aeb374(v4, v4) || (v5 = v4, a0->field_20->field_1a >> 3 & 1))
            goto LABEL_af566c;
        v6 = v2 - 2;
        if (v2 >= 2)
        {
            *(unsigned int *)&a0->padding_a0[12] = v6;
            v5 = v4;
            v3 = v6;
            v4 = sub_ad69f8(a0->field_98, v6);
        }
        else
        {
            *(unsigned int *)&a0->padding_a0[12] = 0;
            if (!v4)
                v4 = sub_ad69f8(a0->field_98, 0);
            *(unsigned long long *)&a0->field_b8 = v4;
            *(unsigned int *)&a0->field_b0 = 21;
            a0->field_38();
        }
    }
    if (v5 && (v4 != v5 || a0->field_20->field_19 >> 6 & 1 && (char)(*(char *)(v5 + 233)) >> 5 & 1))
    {
        v7 = v4;
        v8 = v5;
        if (v4 == v5)
        {
            v9 = v3;
            v10 = arm64g_calculate_condition(20, v7, v8, 0);
            if (!(v10 & 1))
                goto LABEL_af5694;
        }
        else
        {
            v9 = (unsigned int)v3 + 1;
            v11 = arm64g_calculate_condition(20, v7, v8, 0);
            if (!(v11 & 1))
            {
LABEL_af5694:
                if (!((char)(*(char *)(v5 + 232)) >> 4 & 1))
                    goto LABEL_af56c8;
            }
        }
        v12 = sub_aeb40c(v5, v4);
        if (v12)
        {
            *(unsigned long long *)&a0->field_b8 = v5;
            *(unsigned int *)&a0->padding_a0[12] = v9;
            *(unsigned int *)&a0->field_b0 = v12;
            a0->field_38();
        }
LABEL_af56c8:
        v13 = sub_af1e94(v5);
        if (!v13)
        {
            *(unsigned long long *)&a0->field_b8 = v5;
            *(unsigned int *)&a0->padding_a0[12] = v9;
            *(unsigned int *)&a0->field_b0 = 6;
            v14 = a0->field_38;
        }
        else if (0 >= (int)sub_af9264(v4, v13))
        {
            *(unsigned int *)&a0->padding_a0[12] = v3;
            if (!v4)
                v4 = sub_ad69f8(a0->field_98, v3);
            *(unsigned long long *)&a0->field_b8 = v4;
            *(unsigned int *)&a0->field_b0 = 7;
            v14 = a0->field_38;
        }
        else
        {
            v15 = sub_af4988(a0, v4, v3);
            if (!(unsigned int)v15)
                return v15;
            *(unsigned long long *)&a0->field_b8 = v4;
            *(unsigned long long *)&a0->field_c0 = v5;
            *(unsigned int *)&a0->padding_a0[12] = v3;
            a0->field_38();
        }
        v14();
    }
    v15 = sub_af4988(a0, v4, v3);
    if (!(unsigned int)v15)
        return v15;
    *(unsigned long long *)&a0->field_b8 = v4;
    *(unsigned long long *)&a0->field_c0 = v5;
    *(unsigned int *)&a0->padding_a0[12] = v3;
    a0->field_38();
}
