/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2c074..0x2c278 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2c074_0 {
    char field_0;
} st_2c074_0;

extern unsigned long long g_e63ba8;

long long sub_2c074(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4107
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4107
    unsigned long long v11;  // x20
    unsigned long long v23;  // x9
    unsigned long long v12;  // x19
    unsigned long long v24;  // x8
    unsigned long long v13;  // x30
    unsigned long long v14;  // x8
    st_2c074_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2c074_0 *v1;  // [bp-0x38]
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
    v14 = a1 - a0;
    if (v14 != 8)
    {
        v15 = arm64g_calculate_condition(v17 | 16, v18, v19, v20);
        v16 = arm64g_calculate_condition(4, (v15 & 1 ? a1 : 0x40000000), (v15 & 1 ? a0 : 0), 0);
        if (!(v16 & 1))
            goto LABEL_2c0b2;
LABEL_2c0b1:
        v23 = 144;
    }
    else
    {
        v21 = arm64g_calculate_condition(v17 | 16, v18, v19, v20);
        v22 = arm64g_calculate_condition(0, (v21 & 1 ? a1 : 0x40000000), (v21 & 1 ? a0 : 0), 0);
        if (v22 & 1)
            goto LABEL_2c0b1;
        v23 = 48;
LABEL_2c0b2:
    }
    if (v14 == 16)
        v23 = 8;
    if (v14 == 24)
        v23 = 16;
    if (v14 == 32)
        v23 = 80;
    v24 = 104;
    if (v14 == 40)
        v23 = v24;
    goto *((void *)(*(long long *)((char *)&g_e63ba8 + v23)));
}
