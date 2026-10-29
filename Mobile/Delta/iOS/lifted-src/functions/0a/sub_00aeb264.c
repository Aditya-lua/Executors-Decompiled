/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb264..0xaeb2f8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeb264_0 {
    char padding_0[32];
    long long field_20;
} st_aeb264_0;


long long sub_aeb264(long long a0, st_aeb264_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4107
    unsigned long long v8;  // x30
    unsigned int v9;  // w0
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4107
    unsigned int v0;  // [bp-0x24]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a0)
        return 24;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    if (!sub_a9ae64(sub_a99eac(a1->field_20), 0, &v0))
    {
        return 76;
    }
    else if (sub_a5b3bc(a0, sub_a9976c(v0)))
    {
        return 0;
    }
    else
    {
        v9 = sub_a5b3bc(a0, "RSA");
        if (v0 == 912)
        {
            v10 = arm64g_calculate_condition(v12, v13, v14, v15);
            v11 = arm64g_calculate_condition(19, (v10 & 1 ? v9 : 0x40000000), 0, 0);
            if (!(v11 & 1))
                return 77;
        }
        else
        {
            v16 = arm64g_calculate_condition(v12, v13, v14, v15);
            v17 = arm64g_calculate_condition(16, (v16 & 1 ? v9 : 0x40000000), 0, 0);
            if (!(v17 & 1))
                return 77;
        }
        return 0;
    }
}
