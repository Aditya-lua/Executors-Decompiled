/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9dbe4..0xa9dd34 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a9dbe4(void* a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long n;  // x20
    unsigned long v3;  // cc_dep1
    unsigned long long iter;  // x21
    unsigned long long i;  // x22
    unsigned int v14;  // w8
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4102
    unsigned int v21;  // w8
    unsigned long long v4;  // 4112
    unsigned long v22;  // cc_op
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long v25;  // cc_ndep
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    unsigned long long v5;  // 4102
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4102
    unsigned long long v6;  // 4112
    unsigned long long v30;  // x20
    unsigned long long v7;  // 4102
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    n = a1;
    v3 = a1 & 0xffffffff;
    if ((int)a1 < 4 || !a3)
    {
LABEL_a9dc28:
        if (a2 >> 1 & 1)
            goto LABEL_a9dcec;
LABEL_a9dc2c:
        v8 = 3;
        v9 = n & 0xffffffff;
        v10 = 1;
        if (!(a2 >> 2 & 1))
        {
            v11 = arm64g_calculate_condition(179, v9, 1, 0);
            if (v11 & 1)
                goto LABEL_a9dcc0;
            iter = 0;
            i = n & 0xffffffff;
            do
            {
                v14 = *((char *)a0 + iter);
                if (v14 != 10)
                {
                    v15 = arm64g_calculate_condition(v8 | 16, v9, v10, 0);
                    v16 = arm64g_calculate_condition(3, (v15 & 1 ? v14 & 0xff : 0x40000000), (v15 & 1 ? 13 : 0), 0);
                    if (!(v16 & 1))
                        continue;
                }
                else
                {
                    v17 = arm64g_calculate_condition(v8 | 16, v9, v10, 0);
                    v18 = arm64g_calculate_condition(0, (v17 & 1 ? v14 & 0xff : 0x40000000), (v17 & 1 ? 13 : 0), 0);
                    if (v18 & 1)
                        goto LABEL_0xa9dcb8;
                    else
                        goto LABEL_a9dc64;
                }
LABEL_a9dc64:
                if (sub_a6994c((char)v14, 64))
                    *((char *)a0 + iter) = 32;
                iter += 1;
                v8 = 4;
                v9 = i;
                v10 = iter;
            } while (i != iter);
        }
        else
        {
            v19 = arm64g_calculate_condition(179, v9, 1, 0);
            if (!(v19 & 1))
            {
                iter = 0;
                do
                {
                    if (!sub_a6994c(*((char *)a0 + iter), 0x400))
                        goto LABEL_0xa9dcb8;
                    v21 = *((char *)a0 + iter);
                    if (v21 != 10)
                    {
                        v26 = arm64g_calculate_condition(v22 | 16, v23, v24, v25);
                        v27 = arm64g_calculate_condition(3, (v26 & 1 ? v21 & 0xff : 0x40000000), (v26 & 1 ? 13 : 0), 0);
                        if (!(v27 & 1))
                            continue;
                    }
                    else
                    {
                        v28 = arm64g_calculate_condition(v22 | 16, v23, v24, v25);
                        v29 = arm64g_calculate_condition(0, (v28 & 1 ? v21 & 0xff : 0x40000000), (v28 & 1 ? 13 : 0), 0);
                    }
                } while ((iter += 1, (n & 0xffffffff) != iter));
            }
            else
            {
LABEL_a9dcc0:
                n = 0;
                goto LABEL_a9dd14;
            }
        }
    }
    else if (*(short *)a0 == 48111)
    {
        v4 = arm64g_calculate_condition(3, v3, 4, 0);
        v5 = arm64g_calculate_condition(3, (v4 & 1 ? (char)a0[2] : 0), (v4 & 1 ? 191 : 0), 0);
        if (v5 & 1)
            goto LABEL_a9dcc8;
        goto LABEL_a9dc28;
    }
    else
    {
        v6 = arm64g_calculate_condition(3, v3, 4, 0);
        v7 = arm64g_calculate_condition(0, (v6 & 1 ? (char)a0[2] : 0), (v6 & 1 ? 191 : 0), 0);
        if (!(v7 & 1))
            goto LABEL_a9dc28;
LABEL_a9dcc8:
        n = (unsigned int)n - 3;
        _memmove(a0, a0 + 3, n);
        *((char *)a0 + n) = 0;
        if (!(a2 >> 1 & 1))
            goto LABEL_a9dc2c;
LABEL_a9dcec:
        if (!(n >> 31 & 1))
        {
            while (1)
            {
                v30 = n;
                if (32 < *((char *)a0 + (n & 0xffffffff)))
                    break;
                n = (unsigned int)v30 - 1;
                if (0 >= (int)v30)
                {
                    n = 0xffffffff;
                    break;
                }
            }
        }
        n = (unsigned int)n + 1;
    }
LABEL_a9dd14:
    *(unsigned short *)((char *)a0 + n) = 10;
    return (unsigned int)n + 1;
}
