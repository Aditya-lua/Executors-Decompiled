/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2d7a4..0x2dae0 (828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2d7a4_0 {
    char field_0;
} st_2d7a4_0;

extern unsigned long long g_e63a98;

long long sub_2d7a4(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    unsigned long long v26;  // x8
    unsigned long v27;  // cc_op
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned long v30;  // cc_ndep
    unsigned long long v31;  // 4110
    unsigned long long v32;  // 4105
    unsigned long long v17;  // x26
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4105
    unsigned long long v35;  // x9
    unsigned long long v18;  // x25
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    st_2d7a4_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_2d7a4_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    v26 = a1 - a0;
    if (v26 != 8)
    {
        v31 = arm64g_calculate_condition(v27 | 16, v28, v29, v30);
        v32 = arm64g_calculate_condition(4, (v31 & 1 ? a1 : 0x40000000), (v31 & 1 ? a0 : 0), 0);
        if (!(v32 & 1))
            goto LABEL_2d82e;
LABEL_2d82d:
        v35 = 168;
    }
    else
    {
        v33 = arm64g_calculate_condition(v27 | 16, v28, v29, v30);
        v34 = arm64g_calculate_condition(0, (v33 & 1 ? a1 : 0x40000000), (v33 & 1 ? a0 : 0), 0);
        if (v34 & 1)
            goto LABEL_2d82d;
LABEL_2d82e:
        v35 = 48;
    }
    if (v26 == 16)
        v35 = 8;
    if (v26 == 24)
        v35 = 32;
    if (v26 == 32)
        v35 = 176;
    if (v26 == 40)
        v35 = 152;
    goto *((void *)(*(long long *)((char *)&g_e63a98 + v35)));
}
