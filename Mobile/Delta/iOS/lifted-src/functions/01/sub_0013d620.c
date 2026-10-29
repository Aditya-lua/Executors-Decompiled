/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13d620..0x13dabc (1180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13d620_0 {
    char field_0;
} st_13d620_0;

extern unsigned int g_70002f;
extern unsigned int g_7898f5;
extern unsigned int g_78f039;
extern unsigned long long g_e6ed90;

long long sub_13d620(unsigned long a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long v19;  // cc_dep2
    unsigned long long v20;  // 4106
    unsigned long v21;  // 4112
    unsigned long long v22;  // 4106
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4106
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4106
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x8
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // 4112
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    st_13d620_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_13d620_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    v14 = ((a2 == &g_7898f5) * 8 | (char)(a2 == &g_7898f5) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (a2 == &g_78f039)
        v14 = 56;
    if (a2 == &g_70002f)
        v14 = 48;
    v15 = a2;
    if (a2 == 2090513723)
        v14 = 96;
    if (a2 != 1986206186)
    {
        v16 = arm64g_calculate_condition(19, v15, 2090513723, 0);
        v17 = 3;
        v18 = (v16 & 1 ? a2 : 0x40000000);
        v19 = (v16 & 1 ? 999604126 : 0);
        v20 = arm64g_calculate_condition(3, v18, v19, 0);
        if (!(v20 & 1))
            goto LABEL_13d6ae;
LABEL_13d6ad:
        v14 = 104;
    }
    else
    {
        v21 = arm64g_calculate_condition(19, v15, 2090513723, 0);
        v17 = 0;
        v18 = (v21 & 1 ? a2 : 0x40000000);
        v19 = (v21 & 1 ? 999604126 : 0);
        v22 = arm64g_calculate_condition(0, v18, v19, 0);
        if (v22 & 1)
            goto LABEL_13d6ad;
LABEL_13d6ae:
    }
    if (a2 != 2643925856)
    {
        v23 = arm64g_calculate_condition(v17 | 16, v18, v19, 0);
        v24 = arm64g_calculate_condition(3, (v23 & 1 ? a2 : 0x40000000), (v23 & 1 ? 587071903 : 0), 0);
        if (!(v24 & 1))
            goto LABEL_13d6ce;
LABEL_13d6cd:
        v14 = 88;
    }
    else
    {
        v25 = arm64g_calculate_condition(v17 | 16, v18, v19, 0);
        v26 = arm64g_calculate_condition(0, (v25 & 1 ? a2 : 0x40000000), (v25 & 1 ? 587071903 : 0), 0);
        if (v26 & 1)
            goto LABEL_13d6cd;
LABEL_13d6ce:
    }
    if (a2 == 1518222044)
        v14 = 16;
    if (a2 == 556978275)
        v14 = 32;
    goto *((void *)(*(long long *)((char *)&g_e6ed90 + v14)));
}
