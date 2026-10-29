/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3b728..0xc3b814 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_c3b728(void* a0, unsigned int a1)
{
    unsigned long v6;  // d0
    unsigned long v7;  // d0
    unsigned long long v8;  // w10
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // 4107
    unsigned long long v11;  // 4107
    unsigned long v12;  // d0
    unsigned long v13;  // d0
    unsigned long v14;  // d0
    unsigned long v15;  // d0
    uint128_t v0;  // [bp-0x60]
    uint128_t v1;  // [bp-0x50]
    uint128_t v2;  // [bp-0x40]
    uint128_t v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (*(long long *)a0)
    {
        sub_c3df38(&v0, a0);
        if (*(unsigned long long *)&v0)
        {
            if ((long long)a0[32])
            {
                v2 = *(int128_t *)a0;
                v3 = (int128_t)a0[16];
                *(uint128_t *)a0 = v0;
                *(uint128_t *)&a0[16] = v1;
                sub_c3b0e8(a0, a1 & 1);
                *(uint128_t *)a0 = v2;
                *(uint128_t *)&a0[16] = v3;
                return v6;
            }
            return v7;
        }
        else
        {
            if ((long long)a0[32])
            {
                v8 = *(char *)((void*)&v0 + 8);
                v9 = v8 & 0xff;
                if (v8)
                {
                    v10 = arm64g_calculate_condition(19, v9, 0, 0);
                    if (!(v10 & 1))
                        goto LABEL_c3b7de;
LABEL_c3b7dd:
                }
                else
                {
                    v11 = arm64g_calculate_condition(19, v9, 0, 0);
                    if (v11 & 1)
                        goto LABEL_c3b7dd;
LABEL_c3b7de:
                }
                if (sub_be7850() & 1)
                    return v12;
            }
            *(uint128_t *)a0 = v0;
            *(uint128_t *)&a0[16] = v1;
            return v13;
        }
    }
    else if ((long long)a0[32])
    {
        sub_be7850();
        return v14;
    }
    else
    {
        return v15;
    }
}
