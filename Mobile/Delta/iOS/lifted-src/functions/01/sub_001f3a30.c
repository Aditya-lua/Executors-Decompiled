/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f3a30..0x1f3dd4 (932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f3a30_1 {
    unsigned int field_0;
} st_1f3a30_1;

typedef struct st_1f3a30_0 {
    char field_0;
} st_1f3a30_0;

extern unsigned long long g_e78eb0;

unsigned int sub_1f3a30(unsigned long long a0, st_1f3a30_1 **a1, unsigned int idx, unsigned int a3, unsigned int a4)
{
    unsigned int v6;  // w9
    unsigned long long v7;  // x10
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4106
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4106
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // 4112
    unsigned long v22;  // cc_op
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long long v25;  // 4112
    unsigned long v8;  // cc_dep1
    unsigned long v26;  // 4112
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4105
    unsigned long long v30;  // 4112
    unsigned long long v31;  // 4105
    unsigned long v9;  // 4112
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long long v13;  // 4112
    unsigned long v14;  // 4112
    unsigned long long v15;  // 4112
    unsigned long long v0;  // [bp-0x88]
    unsigned int v1;  // [bp-0x74]
    st_1f3a30_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_1f3a30_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = a4;
    v0 = a0;
    v3 = &v2;
    v2 = &v3;
    if (a3 <= idx)
        return 0;
    v6 = *(int *)&(*a1)[10 * idx];
    v7 = 8;
    if (!(v6 & 0xfffffffd))
        v7 = 504;
    if (v6 == 3)
        v7 = 160;
    if (v6 == 7)
        v7 = 312;
    v8 = v6;
    if (v6 == 4)
        v7 = 32;
    if ((v6 & 0xfffffffe) != 18)
    {
        v9 = arm64g_calculate_condition(19, v8, 4, 0);
        v10 = 3;
        v11 = (v9 & 1 ? v6 : 0x40000000);
        v12 = (v9 & 1 ? 20 : 0);
        v13 = arm64g_calculate_condition(19, v11, v12, 0);
        if (!(v13 & 1))
            goto LABEL_1f3afe;
LABEL_1f3afd:
        v16 = arm64g_calculate_condition(v10 | 16, v11, v12, 0);
        v17 = arm64g_calculate_condition(3, (v16 & 1 ? v6 : 0x40000000), (v16 & 1 ? 15 : 0), 0);
        if (!(v17 & 1))
            goto LABEL_1f3b06;
LABEL_1f3b05:
        v7 = 336;
    }
    else
    {
        v14 = arm64g_calculate_condition(19, v8, 4, 0);
        v10 = 0;
        v11 = (v14 & 1 ? v6 : 0x40000000);
        v12 = (v14 & 1 ? 20 : 0);
        v15 = arm64g_calculate_condition(16, v11, v12, 0);
        if (v15 & 1)
            goto LABEL_1f3afd;
LABEL_1f3afe:
        v18 = arm64g_calculate_condition(v10 | 16, v11, v12, 0);
        v19 = arm64g_calculate_condition(0, (v18 & 1 ? v6 : 0x40000000), (v18 & 1 ? 15 : 0), 0);
        if (v19 & 1)
            goto LABEL_1f3b05;
LABEL_1f3b06:
    }
    if (v6 == 9)
        v7 = 384;
    if (v6 == 12)
        v7 = 128;
    v20 = v6;
    if (v6 == 16)
        v7 = 592;
    if (v6 != 11)
    {
        v21 = arm64g_calculate_condition(19, v20, 16, 0);
        v22 = 3;
        v23 = (v21 & 1 ? v6 : 0x40000000);
        v24 = (v21 & 1 ? 14 : 0);
        v25 = arm64g_calculate_condition(19, v23, v24, 0);
        if (!(v25 & 1))
            goto LABEL_1f3b36;
LABEL_1f3b35:
        v28 = arm64g_calculate_condition(v22 | 16, v23, v24, 0);
        v29 = arm64g_calculate_condition(3, (v28 & 1 ? v6 : 0x40000000), (v28 & 1 ? 21 : 0), 0);
        if (!(v29 & 1))
            goto LABEL_1f3b3a;
LABEL_1f3b39:
        v7 = 368;
    }
    else
    {
        v26 = arm64g_calculate_condition(19, v20, 16, 0);
        v22 = 0;
        v23 = (v26 & 1 ? v6 : 0x40000000);
        v24 = (v26 & 1 ? 14 : 0);
        v27 = arm64g_calculate_condition(16, v23, v24, 0);
        if (v27 & 1)
            goto LABEL_1f3b35;
LABEL_1f3b36:
        v30 = arm64g_calculate_condition(v22 | 16, v23, v24, 0);
        v31 = arm64g_calculate_condition(0, (v30 & 1 ? v6 : 0x40000000), (v30 & 1 ? 21 : 0), 0);
        if (v31 & 1)
            goto LABEL_1f3b39;
LABEL_1f3b3a:
    }
    goto *((void *)(*(long long *)((char *)&g_e78eb0 + v7)));
}
