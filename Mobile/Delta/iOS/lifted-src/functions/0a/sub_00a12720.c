/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12720..0xa12824 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12720_0 {
    char padding_0[64];
    long long field_40;
    unsigned int field_48;
    char padding_4c[20];
    long long field_60;
    long long field_68;
} st_a12720_0;


unsigned long long sub_a12720(st_a12720_0 *a0, unsigned long a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned int v4;  // w8
    unsigned long long v5;  // 4135
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned int v8;  // w8
    unsigned long long v9;  // 4135
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4c34(a0->field_40);
    if (!v2)
    {
        return v2;
    }
    else if ((sub_9e219c(a0->field_40, &a0->field_48, 6) | 2) == 6)
    {
        v3 = sub_9e1d7c(a0->field_60, a2, &a0->field_48);
        if (!(unsigned int)v3)
            return v3;
        v4 = a0->field_48;
        v5 = arm64g_calculate_condition(177, v4, 63, 0);
        v6 = sub_9e4cdc(a0->field_60, (int)((v5 & 1 ? v4 + 126 : v4 + 63)) >> 6);
        if (!v6)
            return v6;
        sub_9e4298(a0->field_60);
        v7 = sub_9e1d7c(a0->field_68, a3, &a0->field_48);
        if (!(unsigned int)v7)
            return v7;
        v8 = a0->field_48;
        v9 = arm64g_calculate_condition(177, v8, 63, 0);
        v10 = sub_9e4cdc(a0->field_68, (int)((v9 & 1 ? v8 + 126 : v8 + 63)) >> 6);
        if (!v10)
            return v10;
        sub_9e4298(a0->field_68);
        return 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec2_smpl.c", 110, "ossl_ec_GF2m_simple_group_set_curve");
        sub_a36abc(16, 131, 0);
        return 0;
    }
}
