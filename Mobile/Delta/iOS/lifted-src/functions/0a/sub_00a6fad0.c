/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6fad0..0xa6fbc4 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a6fad0(unsigned long a0, long long a1, long long *a2, long long a3)
{
    unsigned int v2;  // w0
    unsigned long v3;  // cc_dep1
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long long v4;  // 4102
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v20;  // x0
    unsigned long i;  // x21
    unsigned long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // 4102
    unsigned long v9;  // x22
    unsigned long long v10;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4(a3);
    v3 = v2;
    if (a0)
    {
        v4 = arm64g_calculate_condition(179, v3, 1, 0);
        if (!(v4 & 1))
        {
            i = 0;
            do
            {
                if (!a2[i])
                    break;
                v6 = sub_ad69f8(a3, i);
                if (v6)
                {
                    v7 = sub_a6f188(a0, a2[i], v6);
                    if (!(unsigned int)v7)
                        return v7;
                }
                i += 1;
            } while (v2 != i);
        }
    }
    else
    {
        v8 = arm64g_calculate_condition(179, v3, 1, 0);
        if (!(v8 & 1))
        {
            v9 = 0;
            do
            {
                if (!a2[v9])
                    break;
                v10 = sub_ad69f8(a3, v9);
                if (sub_a6fbc4(a1, a2[v9]))
                {
                    v16 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
                    v17 = arm64g_calculate_condition(4, (v16 & 1 ? v10 : 0x40000000), 0, 0);
                    if (v17 & 1)
                        continue;
                }
                else
                {
                    v18 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
                    v19 = arm64g_calculate_condition(0, (v18 & 1 ? v10 : 0x40000000), 0, 0);
                    if (v19 & 1)
                        continue;
                }
                v20 = sub_a71030();
                if (!(unsigned int)v20)
                    return v20;
            } while ((v9 += 1, v2 != v9));
        }
    }
    return 1;
}
