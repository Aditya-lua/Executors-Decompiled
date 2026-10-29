/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5018..0x9d5054 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d5018_0 {
    char padding_0[72];
    struct st_9d5018_0 *field_48;
    char padding_50[8];
    int field_58;
} st_9d5018_0;


st_9d5018_0 * sub_9d5018(st_9d5018_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4106
    unsigned long long v7;  // x30
    st_9d5018_0 *v8;  // x20
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4106
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    while (1)
    {
        /* unsupported instruction */;
        v8 = a0->field_48;
        sub_9d3c28();
        if (a0->field_58 <= 1)
        {
            v9 = arm64g_calculate_condition(v11 | 208, v12, v13, v14);
            a0 = v8;
            v10 = arm64g_calculate_condition(20, (v9 & 1 ? v8 : 0x40000000), 0, 0);
            if (!(v10 & 1))
                break;
        }
        else
        {
            v15 = arm64g_calculate_condition(v11 | 208, v12, v13, v14);
            a0 = v8;
            v16 = arm64g_calculate_condition(16, (v15 & 1 ? v8 : 0x40000000), 0, 0);
            if (!(v16 & 1))
                break;
        }
    }
    return a0;
}
