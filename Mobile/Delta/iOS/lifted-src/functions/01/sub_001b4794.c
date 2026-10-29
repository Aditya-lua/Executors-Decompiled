/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b4794..0x1b4ae8 (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b4794_0 {
    char field_0;
} st_1b4794_0;

extern unsigned long long g_e717e0;

void sub_1b4794(unsigned long a0, char *a1, char *a2)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v17;  // 4113
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4107
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4107
    unsigned long long v22;  // x8
    unsigned long long v9;  // x30
    unsigned int v10;  // w1
    unsigned long v11;  // 4112
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // 4113
    unsigned long v16;  // 4112
    st_1b4794_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b4794_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        sub_1a8ad4();
    v10 = *a1;
    if (v10 != 92)
    {
        v11 = arm64g_calculate_condition(20, a1, a2, 0);
        v12 = 3;
        v13 = (v11 & 1 ? v10 : 0x40000000);
        v14 = (v11 & 1 ? 0x22 : 0);
        v15 = arm64g_calculate_condition(19, v13, v14, 0);
        if (!(v15 & 1))
            goto LABEL_1b47d6;
LABEL_1b47d5:
        v18 = arm64g_calculate_condition(v12 | 16, v13, v14, 0);
        v19 = arm64g_calculate_condition(3, (v18 & 1 ? v10 : 0x40000000), (v18 & 1 ? 47 : 0), 0);
        if (!(v19 & 1))
            goto LABEL_1b47e2;
LABEL_1b47e1:
        v22 = 176;
    }
    else
    {
        v16 = arm64g_calculate_condition(20, a1, a2, 0);
        v12 = 0;
        v13 = (v16 & 1 ? v10 : 0x40000000);
        v14 = (v16 & 1 ? 0x22 : 0);
        v17 = arm64g_calculate_condition(16, v13, v14, 0);
        if (v17 & 1)
            goto LABEL_1b47d5;
LABEL_1b47d6:
        v20 = arm64g_calculate_condition(v12 | 16, v13, v14, 0);
        v21 = arm64g_calculate_condition(0, (v20 & 1 ? v10 : 0x40000000), (v20 & 1 ? 47 : 0), 0);
        if (v21 & 1)
            goto LABEL_1b47e1;
        v22 = 8;
LABEL_1b47e2:
    }
    if (v10 == 97)
        v22 = 0x100;
    if (v10 == 98)
        v22 = 208;
    if (v10 == 0x66)
        v22 = 0;
    if (v10 == 110)
        v22 = 80;
    if (v10 == 114)
        v22 = 96;
    if (v10 == 116)
        v22 = 184;
    if (v10 == 118)
        v22 = 168;
    goto *((void *)(*(long long *)((char *)&g_e717e0 + v22)));
}
