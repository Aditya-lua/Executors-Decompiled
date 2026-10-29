/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6bc24..0xa6bce8 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6bc24_0 {
    long long field_0;
    long long field_8;
} st_a6bc24_0;

extern long long g_a6be70;
extern long long g_f08ff8;
extern st_a6bc24_0 *g_f12e78;

unsigned long long sub_a6bc24(unsigned long a0)
{
    unsigned long long v2;  // x0
    unsigned long v3;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long v11;  // 4112
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // x0
    unsigned long v18;  // x20
    unsigned long v4;  // 4112
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long long v7;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7c208(&g_f08ff8, &g_a6be70);
    if ((unsigned int)v2)
    {
        v4 = arm64g_calculate_condition(v3 | 16, v8, v9, v10);
        v5 = 3;
        v6 = (v4 & 1 ? *(int *)15806068 : 0x40000000);
        v7 = arm64g_calculate_condition(19, v6, 0, 0);
        if (!(v7 & 1))
            goto LABEL_a6bc66;
LABEL_a6bc65:
        v13 = arm64g_calculate_condition(v5 | 16, v6, 0, 0);
        v14 = arm64g_calculate_condition(4, (v13 & 1 ? g_f12e78 : 0x40000000), 0, 0);
        if (v14 & 1)
            return v2;
    }
    else
    {
        v11 = arm64g_calculate_condition(v3 | 16, v8, v9, v10);
        v5 = 0;
        v6 = (v11 & 1 ? *(int *)15806068 : 0x40000000);
        v12 = arm64g_calculate_condition(16, v6, 0, 0);
        if (v12 & 1)
            goto LABEL_a6bc65;
LABEL_a6bc66:
        v15 = arm64g_calculate_condition(v5 | 16, v6, 0, 0);
        v16 = arm64g_calculate_condition(0, (v15 & 1 ? g_f12e78 : 0x40000000), 0, 0);
        if (v16 & 1)
            return v2;
    }
    v17 = sub_a7c198(g_f12e78->field_8);
    if (!(unsigned int)v17)
    {
        return v17;
    }
    else if ((int)sub_ad69e4(g_f12e78->field_0) >= 1)
    {
        v18 = 0;
        do
        {
            if (sub_ad69f8(g_f12e78->field_0, v18) == a0)
            {
                sub_ad664c(g_f12e78->field_0, v18);
                break;
            }
        } while ((v18 = (unsigned int)v18 + 1, (int)v18 < (int)sub_ad69e4(g_f12e78->field_0)));
    }
}
