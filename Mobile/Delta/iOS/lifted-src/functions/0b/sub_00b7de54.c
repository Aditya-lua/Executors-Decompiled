/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7de54..0xb7df84 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b7de54(void* a0, void* a1)
{
    unsigned long v4;  // x8
    unsigned long v5;  // cc_dep1
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long v6;  // cc_dep2
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    uint128_t v9;  // q1
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // x8
    unsigned long long v13;  // 4110
    uint128_t v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x30]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *(long long *)a1;
    if ((long long)v4 > 7)
    {
        if (v4 == 8)
        {
            sub_b80c0c();
        }
        else if (v4 != 9)
        {
            v5 = v4;
            v6 = 10;
            if (v4 != 10)
            {
                v8 = (int128_t)a1[16];
                *(int128_t *)a0 = *(int128_t *)a1;
                *(uint128_t *)&a0[16] = v8;
                v7 = (int128_t)a1[32];
                v9 = (int128_t)a1[48];
                *(uint128_t *)&a0[32] = v7;
                *(uint128_t *)&a0[48] = v9;
                return *(unsigned long long *)&v7;
            }
            *(int128_t *)&a0[8] = (int128_t)a1[8];
            v7 = (int128_t)a1[24];
            *(uint128_t *)&a0[24] = v7;
            v10 = 4;
            v11 = 0;
LABEL_b7dec0:
            *(unsigned long *)a0 = v4;
        }
        else
        {
            v7 = (int128_t)a1[8];
            v0 = v7;
            v1 = (long long)a1[24];
            sub_b96a14();
        }
        v12 = 1 << ((char)*(long long *)a1 & 63) & 1888;
        if ((unsigned long long)*(long long *)a1 <= 10)
        {
            v13 = arm64g_calculate_condition(v10 | 144, v5, v6, v11);
            v14 = arm64g_calculate_condition(4, (v13 & 1 ? v12 : 0x40000000), 0, 0);
            if (v14 & 1)
            {
                sub_b7d588();
                return *(unsigned long long *)&v7;
            }
            return *(unsigned long long *)&v7;
        }
        else
        {
            v15 = arm64g_calculate_condition(v10 | 144, v5, v6, v11);
            v16 = arm64g_calculate_condition(0, (v15 & 1 ? v12 : 0x40000000), 0, 0);
            if (v16 & 1)
            {
                sub_b7d588();
                return *(unsigned long long *)&v7;
            }
            return *(unsigned long long *)&v7;
        }
    }
    v6 = 5;
    v5 = v4;
    if (v5 != 5)
    {
        v6 = 6;
        v5 = v4;
        if (v5 != 6)
        {
            v8 = (int128_t)a1[16];
            *(int128_t *)a0 = *(int128_t *)a1;
            *(uint128_t *)&a0[16] = v8;
            v7 = (int128_t)a1[32];
            v9 = (int128_t)a1[48];
            *(uint128_t *)&a0[32] = v7;
            *(uint128_t *)&a0[48] = v9;
            return *(unsigned long long *)&v7;
        }
    }
    v7 = (int128_t)a1[8];
    *(uint128_t *)&a0[8] = v7;
    *(long long *)&a0[24] = (long long)a1[24];
    goto LABEL_b7dec0;
}
