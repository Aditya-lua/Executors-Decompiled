/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dd790..0x9dd9cc (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9dd790(long long a0)
{
    unsigned int v3;  // w8
    long long v4;  // w8
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long v5;  // x24
    unsigned long long v18;  // x21
    char *v19;  // x23
    char *v20;  // x23
    unsigned long long *v6;  // x20
    unsigned long long *v21;  // x25
    unsigned long long v22;  // x25
    unsigned long long v23;  // x0
    unsigned long long v24;  // 4111
    unsigned long long *v25;  // x25
    unsigned long long v26;  // x24
    unsigned long long v27;  // x0
    long long v28;  // x22
    unsigned long long v30;  // x0
    unsigned long v7;  // x22
    unsigned long long v9;  // x19
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9e46a8() * 3;
    v4 = ((int)(v3 * 1717986919) >> 0x22) + (v3 * 1717986919 >> 63) + ((int)(v3 * 274877907) >> 38) + (v3 * 274877907 >> 63);
    v5 = (int)((v4 + 2) * 1808407283 >> 35) + (int)((unsigned long long)((v4 + 2) * 1808407283) >> 63) + 1;
    v6 = sub_a6bf4c((long long)(v5 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v5, 3) & 0x7fffffff8 & 0x7ffffffff, "crypto/bn/bn_conv.c", 66);
    v7 = v4 + 5;
    v9 = sub_a6bf4c(v7, "crypto/bn/bn_conv.c", 67);
    if (v9)
    {
        v11 = arm64g_calculate_condition(v13 | 16, v14, v15, v10);
        v12 = arm64g_calculate_condition(20, (v11 & 1 ? v6 : 0x40000000), 0, 0);
        if (v12 & 1)
            goto LABEL_9dd858;
LABEL_9dd850:
        v18 = 0;
    }
    else
    {
        v16 = arm64g_calculate_condition(v13 | 16, v14, v15, v10);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? v6 : 0x40000000), 0, 0);
        if (!(v17 & 1))
            goto LABEL_9dd850;
LABEL_9dd858:
        v18 = sub_9e4b00(a0);
        if (v18)
        {
            if (sub_9e4828(v18))
            {
                *(unsigned short *)v9 = 48;
                sub_a6c2e4(v6, "crypto/bn/bn_conv.c", 110);
                sub_9e48d4(v18);
                return v9;
            }
            v19 = v9;
            if (sub_9e5c94(v18))
            {
                v20 = v9;
                *v20 = 45;
                v19 = v20 + 1;
            }
            v21 = v6;
            if (sub_9e4828(v18))
            {
LABEL_9dd8c8:
                v25 = (char *)v21 - 8;
                v26 = v7 + v9;
                v0 = *(long long *)((char *)v21 - 8);
                v27 = sub_9d5b44(v19, v26 - v19, "%lu");
                if (!(v27 >> 31 & 1))
                {
                    if (v25 == v6)
                    {
                        sub_a6c2e4(v6, "crypto/bn/bn_conv.c", 110);
                        sub_9e48d4(v18);
                        return v9;
                    }
                    v28 = &v19[v27 & 0xffffffff];
                    while (1)
                    {
                        v0 = *(long long *)((char *)v25 - 8);
                        v30 = sub_9d5b44(v28, v26 - v28, "%019lu");
                        if (v30 >> 31 & 1)
                            break;
                        v28 += v30 & 0xffffffff;
                        v25 = (char *)v25 - 8;
                        if (v25 == v6)
                        {
                            sub_a6c2e4(v6, "crypto/bn/bn_conv.c", 110);
                            sub_9e48d4(v18);
                            return v9;
                        }
                    }
                }
            }
            else
            {
                v22 = 0;
                while ((int)v5 > (long long)((long long)(v22) >> 3) && (v23 = sub_9eb8c0(v18, -8446744073709551616), *(unsigned long long *)((char *)v6 + v22) = v23, v24 = arm64g_calculate_condition(2, v23, 1, 0), !(v24 & 1)))
                {
                    v22 += 8;
                    if (sub_9e4828(v18))
                    {
                        v21 = (char *)v6 + v22;
                        goto LABEL_9dd8c8;
                    }
                }
            }
        }
    }
    sub_a6c2e4(v6, "crypto/bn/bn_conv.c", 110);
    sub_9e48d4(v18);
    sub_a6c2e4(v9, "crypto/bn/bn_conv.c", 114);
    return 0;
}
