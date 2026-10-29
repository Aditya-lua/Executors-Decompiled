/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e258..0xa6e2d0 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a6e258(void* a0, char *a1, unsigned long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long long v21;  // x23
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a2)
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = 0;
    while (1)
    {
        v17 = sub_a69994(*((char *)a0 + v16));
        v18 = sub_a69994(a1[v16]);
        v19 = v17 & 0xffffffff;
        v20 = v18 & 0xffffffff;
        if ((unsigned int)v17 != (unsigned int)v18)
            return v17 - v18;
        v21 = v16 + 1;
        if (*((char *)a0 + v16))
        {
            v22 = arm64g_calculate_condition(19, v19, v20, 0);
            v23 = arm64g_calculate_condition(52, (v22 & 1 ? v21 : 0x20000000), (v22 & 1 ? a2 : 0), 0);
            v16 = v21;
            if (!(v23 & 1))
                break;
        }
        else
        {
            v24 = arm64g_calculate_condition(19, v19, v20, 0);
            v25 = arm64g_calculate_condition(48, (v24 & 1 ? v21 : 0x20000000), (v24 & 1 ? a2 : 0), 0);
            v16 = v21;
            if (!(v25 & 1))
                break;
        }
    }
    return 0;
}
