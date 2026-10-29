/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4f930..0xc4f9e8 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c4f930(void* a0, unsigned long a1)
{
    unsigned long long v0;  // x8
    void* v1;  // x11
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long v13;  // x14
    unsigned long v14;  // x13
    uint128_t v15;  // q1
    void* v16;  // x16
    unsigned long long v17;  // x15
    unsigned long long v18;  // x15
    void* v19;  // x16
    void* v2;  // x15
    void* v20;  // x17
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long long v23;  // 4114
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4110
    unsigned long long v27;  // 4102
    uint128_t v28;  // q1
    void* v3;  // x10
    unsigned long v4;  // x11
    unsigned long v5;  // x12
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // 4114
    unsigned long long v9;  // 4110

    v0 = 0;
    v1 = a0 + 32;
    v2 = a0;
    do
    {
        v3 = v1;
        v4 = (long long)v2[48];
        v5 = (long long)v2[32];
        v6 = v4;
        v7 = (long long)v2[16];
        if (v4 >= (unsigned long long)(long long)v2[16])
        {
            v8 = arm64g_calculate_condition(148, v6, v7, 0);
            if (v8 & 1)
            {
                v9 = arm64g_calculate_condition(148, v6, v7, 0);
                v10 = arm64g_calculate_condition(36, (v9 & 1 ? v5 : 0x20000000), (v9 & 1 ? *(long long *)v2 : 0), 0);
                if (v10 & 1)
                    continue;
            }
            else
            {
                v11 = arm64g_calculate_condition(148, v6, v7, 0);
                v12 = arm64g_calculate_condition(32, (v11 & 1 ? v5 : 0x20000000), (v11 & 1 ? *(long long *)v2 : 0), 0);
                if (v12 & 1)
                    continue;
            }
        }
        v13 = (long long)v2[40];
        v14 = (long long)v2[56];
        v15 = (int128_t)v2[16];
        *(int128_t *)v3 = *(int128_t *)v2;
        *(uint128_t *)&v3[16] = v15;
        v16 = a0;
        if (v2 != a0)
        {
            v17 = v0;
            do
            {
                v18 = v17;
                v19 = a0 + v18;
                v20 = v19 - 32;
                v21 = v4;
                v22 = *(long long *)((char *)v19 - 16);
                if (v4 < (unsigned long long)*(long long *)((char *)v19 - 16))
                    continue;
                v23 = arm64g_calculate_condition(148, v21, v22, 0);
                if (v23 & 1)
                {
                    v24 = arm64g_calculate_condition(148, v21, v22, 0);
                    v25 = arm64g_calculate_condition(52, (v24 & 1 ? v5 : 0x20000000), (v24 & 1 ? *(long long *)v20 : 0), 0);
                    if (v25 & 1)
                        continue;
                    goto LABEL_c4f9dc;
                }
                else
                {
                    v26 = arm64g_calculate_condition(148, v21, v22, 0);
                    v27 = arm64g_calculate_condition(48, (v26 & 1 ? v5 : 0x20000000), (v26 & 1 ? *(long long *)v20 : 0), 0);
                    if (!(v27 & 1))
                    {
LABEL_c4f9dc:
                        v16 = a0 + v18;
                        goto LABEL_c4f948;
                    }
                }
            } while ((v28 = (int128_t)v20[16], *(int128_t *)v19 = *(int128_t *)v20, *(int128_t *)&v19[16] = (int128_t)v20[16], v17 = v18 - 32, v18 != 32));
            v16 = a0;
        }
LABEL_c4f948:
        *(unsigned long *)v16 = v5;
        *(unsigned long *)&v16[8] = v13;
        *(unsigned long *)&v16[16] = v4;
        *(unsigned long *)&v16[24] = v14;
    } while ((v1 = v3 + 32, v0 += 32, v2 = v3, v1 != a0 + a1 * 32));
    return a0;
}
