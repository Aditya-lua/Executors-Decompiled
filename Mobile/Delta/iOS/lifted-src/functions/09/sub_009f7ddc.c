/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7ddc..0x9f7f3c (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9f7ddc(long long a0, long long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned int v19;  // w8
    unsigned long long v20;  // 4113
    unsigned long v21;  // cc_dep1
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4113
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    unsigned long long v28;  // 4112
    unsigned long long v11;  // x22
    unsigned int v29;  // w0
    unsigned int v30;  // x0
    unsigned long long v31;  // 4148
    unsigned int v32;  // x20
    unsigned int v33;  // x19
    unsigned int v34;  // x0
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x21
    unsigned int v17;  // w23
    unsigned long long v18;  // x22
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a1)
        return 1;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = sub_af26f0(a1, 90, 0xffffffff);
    if (!(v16 >> 31 & 1))
        v17 = ~(unsigned int)sub_af26f0(a1, 90, v16) >> 31;
    else
        v17 = 0;
    v18 = sub_af26f0(a0, 90, 0xffffffff);
    if (!(v18 >> 31 & 1))
        v19 = ~(unsigned int)sub_af26f0(a0, 90, v18) >> 31;
    else
        v19 = 0;
    v20 = arm64g_calculate_condition(177, v16 & 0xffffffff, 1, 0);
    if (v20 & 1)
        return 0;
    v21 = v18 & 0xffffffff;
    v22 = arm64g_calculate_condition(177, v18 & 0xffffffff, 1, 0);
    if (v22 & 1)
        return 0;
    v23 = arm64g_calculate_condition(1, v21, 1, 0);
    if (v23 & 1)
    {
        v24 = arm64g_calculate_condition(1, v21, 1, 0);
        v25 = arm64g_calculate_condition(193, (v24 & 1 ? v16 & 0xffffffff : 0x40000000), v24 & 1, 0);
        if (v25 & 1)
            return 0;
    }
    else
    {
        v26 = arm64g_calculate_condition(1, v21, 1, 0);
        v27 = arm64g_calculate_condition(192, (v26 & 1 ? v16 & 0xffffffff : 0x40000000), v26 & 1, 0);
        if (v27 & 1)
            return 0;
    }
    if (v17 & 1 || v19 & 1)
        return 0;
    v28 = arm64g_calculate_condition(0x11, v16 & 0xffffffff, 1, 0);
    if (!(v28 & 1) && !(v18 >> 31 & 1))
        return 0;
    v29 = sub_af3ae8(a0, sub_97725c(a1));
    v30 = v29 != 0;
    v31 = arm64g_calculate_condition(1, v16 & 0xffffffff, 1, 0);
    if (v31 & 1)
    {
        return v30;
    }
    else if (!v29)
    {
        return v30;
    }
    else
    {
        v32 = sub_af26f8(a1, v16);
        v33 = sub_af26f8(a0, v18);
        if (!v32)
        {
            return 0;
        }
        else if (!v33)
        {
            return 0;
        }
        else
        {
            v34 = sub_af4144(v32);
            if (v34)
                return sub_af4114(v33, v34) != 0;
            return v34;
        }
    }
}
