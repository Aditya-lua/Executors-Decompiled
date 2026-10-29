/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998548..0x998680 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_998548_0 {
    char padding_0[80];
    char field_50;
    char padding_51[7];
    char field_58;
    char padding_59[1607];
    long long field_6a0;
    char padding_6a8[8];
    long long field_6b0;
    char padding_6b8[8];
    unsigned long long field_6c0;
    char padding_6c8[2320];
    unsigned long long field_fd8;
    unsigned long long field_fe0;
} st_998548_0;


unsigned int sub_998548(st_998548_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long *v2;  // x20
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // x8
    unsigned long long v12;  // x8
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->padding_0[72 * a0->field_fe0 + 1744];
    if (a0->field_fe0 < a0->field_fd8)
    {
        v4 = arm64g_calculate_condition(v3 | 48, v9, v10, v6);
        v5 = arm64g_calculate_condition(20, (v4 & 1 ? v2 : 0), (v4 & 1 ? a1 : 0), 0);
        if (v5 & 1)
        {
            sub_c64fa0(a0);
            return 0xfffffffe;
        }
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 48, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? v2 : 0), (v7 & 1 ? a1 : 0), 0);
        if (v8 & 1)
        {
            sub_c64fa0(a0);
            return 0xfffffffe;
        }
    }
    v11 = v2[1];
    if (a2 > v2[1])
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1179, "tls_release_record");
        sub_996e84(a0, 80, 0xc0103, 0);
        return 0xfffffffe;
    }
    if (a0->field_50 >> 1 & 1)
    {
        sub_a66ec0(v2[4] + v2[3], a2);
        v11 = v2[1];
    }
    v2[3] = v2[3] + a2;
    v2[1] = v11 - a2;
    if (v11 != a2)
        return 1;
    v12 = a0->field_fe0 + 1;
    a0->field_fe0 = v12;
    if (a0->field_fd8 == v12 && a0->field_58 >> 4 & 1 && !a0->field_6c0)
    {
        if (a0->field_50 >> 1 & 1)
            sub_a66ec0(a0->field_6a0, a0->field_6b0);
        sub_a6c2e4(a0->field_6a0, "ssl/record/methods/tls_common.c", 284);
        a0->field_6a0 = 0;
        *(uint128_t *)&a0[1].padding_0[8] = 0;
    }
    return 1;
}
