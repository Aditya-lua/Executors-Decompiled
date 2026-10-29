/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e9a04..0x9e9cf0 (748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e9a04_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[4];
    char field_18;
    char padding_19[23];
    unsigned int field_30;
    unsigned int field_34;
} st_9e9a04_0;


unsigned long long sub_9e9a04(unsigned long long a0, unsigned long a1, void* a2, st_9e9a04_0 *a3, long long a4)
{
    unsigned long idx;  // x22
    unsigned long long index;  // x23
    unsigned int v12;  // w27
    unsigned long long v13;  // 4117
    unsigned long long v14;  // w8
    unsigned long long v15;  // x20
    long long v4;  // x25
    unsigned long long v5;  // x0
    unsigned long long v6;  // x24
    unsigned int v7;  // w0
    unsigned int v8;  // w8
    unsigned long v9;  // x26
    unsigned long long v10;  // 4116
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    idx = a1;
    index = a0;
    sub_9de064(a4);
    if (!index)
    {
        index = sub_9de208(a4);
        if (!idx)
        {
LABEL_9e9ab0:
            idx = sub_9de208(a4);
        }
    }
    else if (!idx)
    {
        goto LABEL_9e9ab0;
    }
    v4 = sub_9de208(a4);
    v5 = sub_9de208(a4);
    if (v5)
    {
        v6 = v5;
        if (sub_9e53a8(a2, a3) >> 31 & 1)
        {
            sub_9e5b4c(index);
            v15 = sub_9e4c34(idx, a2) != 0;
            sub_9de17c(a4);
            return v15;
        }
        v7 = sub_9e46a8(a2);
        v8 = a3->field_30 * 2;
        if ((int)v7 < (int)v8)
            v9 = v8;
        else
            v9 = v7;
        if ((unsigned int)v9 == a3->field_34)
        {
            v10 = arm64g_calculate_condition(0x11, v9 & 0xffffffff, 1, 0);
        }
        else
        {
            sub_9de064(a4);
            v11 = sub_9de208(a4);
            if (v11 && sub_9e55d4())
            {
                if (sub_9de520(&a3->field_18, 0, v11, a3, a4))
                    v12 = v9;
                else
                    v12 = 0xffffffff;
            }
            else
            {
                v12 = 0xffffffff;
            }
            sub_9de17c(a4);
            a3->field_34 = v12;
            v13 = arm64g_calculate_condition(1, v12, 1, 0);
            if (!(v13 & 1) && sub_9ea8ac(v4, a2, a3->field_30) && sub_9e7dc8(v6, v4, &a3->field_18, a4) && sub_9ea8ac(index, v6, v9 - a3->field_30) && (*(unsigned int *)(index + 16) = 0, sub_9e7dc8(v6, a3, index, a4) && sub_9db498(idx, a2, v6)))
            {
                *(unsigned int *)(idx + 16) = 0;
                if (sub_9e53a8(idx, a3) >> 31 & 1)
                {
LABEL_9e9cbc:
                    if (sub_9e4828(idx))
                        v14 = 0;
                    else
                        v14 = (int)a2[16];
                    *(unsigned int *)(idx + 16) = v14;
                    *(unsigned int *)(index + 16) = a3->field_10 ^ (int)a2[16];
                    sub_9de17c(a4);
                    return 1;
                }
                else if (sub_9db498(idx, idx, a3) && sub_9eb9e0(index, 1))
                {
                    if (sub_9e53a8(idx, a3) >> 31 & 1)
                        goto LABEL_9e9cbc;
                    if (sub_9db498(idx, idx, a3) && sub_9eb9e0(index, 1))
                    {
                        if (sub_9e53a8(idx, a3) >> 31 & 1)
                            goto LABEL_9e9cbc;
                        if (sub_9db498(idx, idx, a3) && sub_9eb9e0(index, 1))
                        {
                            if (sub_9e53a8(idx, a3) >> 31 & 1)
                                goto LABEL_9e9cbc;
                            sub_a368c8();
                            sub_a369bc("crypto/bn/bn_recp.c", 147, "BN_div_recp");
                            sub_a36abc(3, 101, 0);
                        }
                    }
                }
            }
        }
    }
    sub_9de17c(a4);
    return 0;
}
