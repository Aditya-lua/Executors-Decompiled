/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b0244..0x2b052c (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2b0244_1 {
    char padding_0[16];
    unsigned int field_10;
    unsigned int field_14;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[64];
    unsigned long long field_68;
} st_2b0244_1;

typedef struct st_2b0244_0 {
    char field_0;
} st_2b0244_0;

extern unsigned long long g_e7bc00;

int sub_2b0244(st_2b0244_1 *a0)
{
    unsigned int v4;  // w8
    unsigned long long v5;  // x9
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4107
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4107
    unsigned int v18;  // w10
    unsigned long long v19;  // x8
    unsigned long v6;  // cc_dep1
    unsigned int v7;  // w10
    unsigned long v8;  // 4112
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // 4112
    unsigned long long v13;  // 4169
    st_2b0244_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_2b0244_0 *v1;  // [bp-0x30]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_20 && !(sub_2ab324(a0) & 1))
    {
        a0->field_68 = "invalid BOM; must be 0xEF 0xBB 0xBF if given";
        return 14;
    }
    sub_2a8260(a0);
    if ((char)a0->field_10 == 1)
    {
        do
        {
            if (a0->field_14 != 47)
                break;
            if (!sub_2a9488(a0))
                return 14;
            sub_2a8260(a0);
        } while ((char)a0->field_10 == 1);
    }
    v4 = a0->field_14;
    v5 = 176;
    if (v4 == 91)
        v5 = 40;
    if (v4 == 93)
        v5 = 160;
    if (v4 == 123)
        v5 = 24;
    if (v4 == 125)
        v5 = 88;
    if (v4 == 58)
        v5 = 96;
    if (v4 == 44)
        v5 = 120;
    if (v4 == 116)
        v5 = 0;
    if (v4 == 0x66)
        v5 = 0x88;
    if (v4 == 110)
        v5 = 32;
    v6 = v4;
    if (v4 == 0x22)
        v5 = 152;
    v7 = v4 & 0xfffffffe;
    if (v4 != 52)
    {
        v8 = arm64g_calculate_condition(19, v6, 0x22, 0);
        v9 = 3;
        v10 = (v8 & 1 ? v7 : 0x40000000);
        v11 = (v8 & 1 ? 50 : 0);
    }
    else
    {
        v12 = arm64g_calculate_condition(19, v6, 0x22, 0);
        v9 = 0;
        v10 = (v12 & 1 ? v7 : 0x40000000);
        v11 = (v12 & 1 ? 50 : 0);
    }
    v13 = arm64g_calculate_condition(v9 | 16, v10, v11, 0);
    if (v4 != 45)
    {
        v14 = arm64g_calculate_condition(v9 | 16, v10, v11, 0);
        v15 = arm64g_calculate_condition(19, (v14 & 1 ? v7 : 0x40000000), (v14 & 1 ? 48 : 0), 0);
        if (!(v15 & 1))
            goto LABEL_2b0366;
LABEL_2b0365:
        v18 = !(v13 & 1);
    }
    else
    {
        v16 = arm64g_calculate_condition(v9 | 16, v10, v11, 0);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? v7 : 0x40000000), (v16 & 1 ? 48 : 0), 0);
        if (v17 & 1)
            goto LABEL_2b0365;
LABEL_2b0366:
        v18 = 1;
    }
    if (5 > v4 - 53 || v18 & 1)
        v5 = 112;
    v19 = 128;
    if (v4 + 1 < 2)
        v5 = v19;
    goto *((void *)(*(long long *)((char *)&g_e7bc00 + v5)));
}
