/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc692a4..0xc6943c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c692a4_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
    char padding_10[64];
    long long field_50;
    char padding_58[120];
    char field_d0;
} st_c692a4_0;

typedef struct st_c692a4_1 {
    char padding_0[16];
    struct st_c692a4_2 *field_10;
} st_c692a4_1;

typedef struct st_c692a4_2 {
    unsigned long long field_0;
} st_c692a4_2;


unsigned long long sub_c692a4(st_c692a4_0 *a0, unsigned int a1, unsigned long long a2)
{
    unsigned long long v3;  // x20
    long long v4;  // x0
    unsigned long v5;  // cc_dep1
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4105
    unsigned long long v8;  // x22
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4105
    st_c692a4_1 *v11;  // x0
    unsigned long long v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0 || *(long long *)&a0->padding_58[64] && !sub_aa91bc(a0->field_50, a0))
        return 0xffffffff;
    v3 = sub_a6820c(a0->field_50, 1);
    if (!v3)
    {
        sub_a368c8();
        v4 = sub_a7acfc(sub_a369bc("crypto/provider_core.c", 335, "get_provider_store"), 335, "get_provider_store");
        if (!sub_a7acec(sub_a36abc(v4)))
            return 0xffffffff;
LABEL_c69368:
        v5 = v0;
        if (v0 >= 1)
        {
            if (a0->field_d0 & 1)
            {
                v6 = arm64g_calculate_condition(19, v5, 1, 0);
                v7 = arm64g_calculate_condition(19, (v6 & 1 ? a1 : 0x40000000), 0, 0);
                v8 = !(v7 & 1);
            }
            else
            {
                v9 = arm64g_calculate_condition(19, v5, 1, 0);
                v10 = arm64g_calculate_condition(16, (v9 & 1 ? a1 : 0x40000000), 0, 0);
                v8 = !(v10 & 1);
            }
LABEL_c69384:
            if (!v3)
                goto LABEL_c693ac;
        }
        else
        {
            a0->field_0 = a0->field_0 & 0xfffffffd;
            v8 = 1;
            if (!a2 || !v3)
                goto LABEL_c69384;
            if ((int)sub_ad69e4(*(long long *)(v3 + 16)) >= 1)
            {
                v11 = sub_ad69f8(*(long long *)(v3 + 16), 0);
                v11->field_10();
            }
        }
        sub_a7c1b4(a0->field_8);
        sub_a7c1b4(*(long long *)(v3 + 32));
        if (0 >= v0)
            sub_a2e1e4(a0->field_50);
LABEL_c693ac:
        if (v8 & 1)
            return v0;
        sub_a77a58(a0, 1);
        return v0;
    }
    else if (sub_a7c17c(*(long long *)(v3 + 32)))
    {
        if (sub_a7c198(a0->field_8))
        {
            if (sub_a7acec())
                goto LABEL_c69368;
            sub_a7c1b4(a0->field_8);
        }
        sub_a7c1b4(*(long long *)(v3 + 32));
    }
    return 0xffffffff;
}
