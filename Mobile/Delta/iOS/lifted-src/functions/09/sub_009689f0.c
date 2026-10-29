/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9689f0..0x968d10 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_968d10;
extern char g_1000280;

unsigned long long sub_9689f0(unsigned long a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, char *a7)
{
    char *v11;  // x25
    unsigned long long v12;  // x0
    unsigned long long idx;  // x9
    unsigned long long *v22;  // x11
    unsigned long long v23;  // x8
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // 4112
    unsigned long long v18;  // x26
    unsigned long long v19;  // x10
    unsigned long long index;  // x8
    char *v0;  // [bp-0xc0]
    unsigned long long v1;  // [bp-0xb8]
    unsigned long v2;  // [bp-0xa8]
    unsigned long long v3;  // [bp-0xa0]
    uint128_t v4;  // [bp-0x98], Other Possible Types: unsigned long long
    uint128_t v5;  // [bp-0x88], Other Possible Types: unsigned long long
    uint128_t v6;  // [bp-0x78], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("ssl/t1_lib.c", 1638, "tls1_set_groups_list");
        sub_a36abc(20, 0xc0102, 0);
        return 0;
    }
    v11 = a7;
    v6 = 0;
    v7 = 0;
    v5 = 0;
    v4 = 0;
    *(unsigned long long *)&v5 = 32;
    v8 = 0;
    *(unsigned long long *)((char *)&v6 + 8) = 32;
    v2 = a0;
    v3 = 32;
    v12 = sub_a6bf4c(64, "ssl/t1_lib.c", 1649);
    *(unsigned long long *)((char *)&v4 + 8) = v12;
    if (v12 && !(v13 = sub_a6bf4c(0x100, "ssl/t1_lib.c", 1652), *(unsigned long long *)&v6 = v13, !v13 || (*(unsigned long long *)v13 = 0, v14 = sub_a6bf4c(64, "ssl/t1_lib.c", 1656), (&v7)[1] = v14, !v14)))
    {
        v15 = *v11;
        if ((unsigned int)v15)
        {
            while (1)
            {
                if (!(v15 >> 7 & 1))
                {
                    if (!(*(int *)&(&g_1000280)[60 + 4 * (v15 & 0xffffffff)] & 0x4000))
                        break;
                    goto LABEL_968ae0;
                }
                if (!___maskrune())
                    break;
LABEL_968ae0:
                v15 = v11[1];
                v11 += 1;
                if (!(unsigned int)v15)
                    goto LABEL_968c94;
            }
            if (!*v11)
                goto LABEL_968c94;
            v16 = sub_9f5c88(v11, 47, 1, &g_968d10, &v2);
            v17 = arm64g_calculate_condition(1, v16 & 0xffffffff, 1, 0);
            if (!(v17 & 1))
            {
                v18 = v16;
                if (!(unsigned int)v16)
                    goto LABEL_968c20;
                v19 = *(unsigned long long *)((void*)&v5 + 8);
                if (v19)
                {
                    index = 0;
                    idx = 0;
                    v22 = (unsigned long long)v6;
                    do
                    {
                        if (v22[index])
                        {
                            if (index != idx)
                            {
                                v22[idx] = v22[index];
                                idx += 1;
                                v19 = *(unsigned long long *)((void*)&v5 + 8);
                            }
                            else
                            {
                                idx = index + 1;
                            }
                        }
                    } while ((index += 1, v19 > index));
                }
                else
                {
                    idx = 0;
                }
                *(unsigned long long *)((char *)&v5 + 8) = idx;
                v23 = v7;
                if (v23 >= 5)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/t1_lib.c", 1695, "tls1_set_groups_list");
                    v0 = v11;
                    v1 = 4;
                }
                else if (!v23 && *(unsigned long long *)&v4)
                {
                    v7 = 1;
                    *(unsigned short *)*&(&v7)[1] = 0;
                    goto LABEL_968c94;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/t1_lib.c", 1674, "tls1_set_groups_list");
                v0 = v11;
            }
            sub_a36abc(20, 0x80106);
        }
        else
        {
LABEL_968c94:
            v18 = 1;
            if (a6 && a4 && a2 && a1 && a3 && a5)
            {
                sub_a6c2e4(*(long long *)a1, "ssl/t1_lib.c", 1728);
                *(unsigned long long *)a1 = *(unsigned long long *)((void*)&v4 + 8);
                *(unsigned long long *)a2 = *(unsigned long long *)&v4;
                sub_a6c2e4(*(long long *)a3, "ssl/t1_lib.c", 1731);
                *(unsigned long long *)a3 = *&(&v7)[1];
                *(unsigned long long *)a4 = v7;
                sub_a6c2e4(*(long long *)a5, "ssl/t1_lib.c", 1734);
                *(unsigned long long *)a5 = v6;
                *(unsigned long long *)a6 = *(unsigned long long *)((void*)&v5 + 8);
                return 1;
            }
LABEL_968c20:
            sub_a6c2e4(*(unsigned long long *)((void*)&v4 + 8), "ssl/t1_lib.c", 1741);
            sub_a6c2e4(v6, "ssl/t1_lib.c", 1742);
            sub_a6c2e4(*&(&v7)[1], "ssl/t1_lib.c", 1743);
            return v18;
        }
    }
    v18 = 0;
    goto LABEL_968c20;
}
