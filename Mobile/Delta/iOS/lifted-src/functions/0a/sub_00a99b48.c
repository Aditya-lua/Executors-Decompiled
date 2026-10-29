/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa99b48..0xa99eac (868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a99b48(unsigned long long a0, unsigned long long a1, unsigned long long idx, unsigned long long a3)
{
    unsigned long long v5;  // x20
    unsigned long long iter;  // x19
    unsigned long long len;  // x21
    unsigned long long node;  // x23
    unsigned long v17;  // x8
    unsigned int v18;  // w28
    unsigned long long v19;  // x25
    unsigned long long v20;  // w26
    unsigned long long v21;  // x24
    unsigned long long v22;  // x8
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // 4114
    unsigned long long v7;  // x23
    unsigned long long v25;  // 4114
    unsigned long long v26;  // x0
    unsigned long long v27;  // x25
    unsigned long long len1;  // x26
    unsigned long v29;  // x27
    unsigned long long len2;  // x25
    unsigned long long v31;  // x26
    unsigned long long v32;  // x20
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x21
    unsigned long long v11;  // x0
    unsigned long long v12;  // w28
    unsigned long long v13;  // x22
    unsigned long long v14;  // x27
    unsigned long long v0;  // [bp-0xa0]
    char v1;  // [bp-0x8d]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    iter = a0;
    v2 = *(long long *)&g_10002b0;
    if (a0 && (int)v5 >= 1)
        *(char *)iter = 0;
    if (!idx || !*(long long *)(idx + 24))
    {
        len = 0;
    }
    else if (a3 || (v7 = idx, v8 = sub_a9a1a8(idx, 1), idx = v7, !(unsigned int)v8 || (v9 = sub_a99624(), (!v9 || (v10 = *(long long *)(v9 + 8), !v10)) && !(v11 = sub_a99624(v8), idx = v7, v11 && !(v10 = *(long long *)v11, idx = v7, !v10)))))
    {
        v12 = *(int *)(idx + 20);
        if (v12 > 586)
        {
            v13 = 0;
LABEL_a99bb0:
            sub_9e48d4(v13);
            len = 0xffffffff;
        }
        else
        {
            if (v12 >= 1)
            {
                v13 = 0;
                v14 = 0;
                len = 0;
                node = *(long long *)(idx + 24);
                do
                {
                    v17 = *(char *)node;
                    v18 = v12 - 1;
                    if (v12 == 1 && v17 >> 31 & 1)
                        goto LABEL_a99bb0;
                    v19 = 0;
                    v20 = 0;
                    v21 = ~(unsigned int)v17 >> 31;
                    node += 1;
                    while (1)
                    {
                        v12 = v18;
                        if (v20)
                        {
                            if (!sub_9eb9e0(v13))
                                goto LABEL_a99bb0;
                            if (v21 & 1)
                                break;
                            goto LABEL_a99c60;
                        }
                        v19 |= v17 & 127;
                        if (v21 & 1)
                            break;
LABEL_a99c60:
                        if (!v20 && v19 > 0x1ffffffffffffff)
                        {
                            if (!v13 && !(v13 = sub_9e4958(), v13))
                                goto LABEL_a99bb0;
                            if (!sub_9e4d58(v13, v19))
                                goto LABEL_a99bb0;
                            v20 = 1;
                            goto LABEL_a99c98;
                        }
                        else if (v20)
                        {
LABEL_a99c98:
                            if (!sub_9ea668(v13, v13, 7))
                                goto LABEL_a99bb0;
                            goto LABEL_a99cac;
                        }
                        else
                        {
                            v19 *= 128;
LABEL_a99cac:
                            v17 = *(char *)node;
                            node += 1;
                            v21 = ~(unsigned int)v17 >> 31;
                            v18 = v12 - 1;
                            if (v12 == 1 && v17 >> 31 & 1)
                                goto LABEL_a99bb0;
                        }
                    }
                    if (!(v14 & 1))
                    {
                        if (v19 >= 80)
                        {
                            if (v20)
                            {
                                if (!sub_9ebaf8(v13, 80))
                                    goto LABEL_a99bb0;
                                v22 = 50;
                                goto LABEL_a99d1c;
                            }
                            else
                            {
                                v22 = 50;
                                v19 -= 80;
                                goto LABEL_a99d1c;
                            }
                        }
                        v23 = v19;
                        if (39 < v19)
                        {
                            v19 += 0xffffffffffffffd8;
                            v24 = arm64g_calculate_condition(148, v23, 39, 0);
                            if (!(v24 & 1))
                                goto LABEL_a99d0e;
                        }
                        else
                        {
                            v19 += 0;
                            v25 = arm64g_calculate_condition(148, v23, 39, 0);
                            if (!(v25 & 1))
                            {
LABEL_a99d0e:
                                v22 = 49;
LABEL_a99d10:
LABEL_a99d1c:
                                if (iter && (int)v5 >= 2)
                                {
                                    *(char *)iter = v22;
                                    *(char *)(iter + 1) = 0;
                                    iter += 1;
                                    v5 = (unsigned int)v5 - 1;
                                }
                                len = (unsigned int)len + 1;
                                goto LABEL_a99d38;
                            }
                        }
                        v22 = 48;
                        goto LABEL_a99d10;
                    }
                    else
                    {
LABEL_a99d38:
                        if (v20)
                        {
                            v26 = sub_9dd790(v13);
                            if (!v26)
                                goto LABEL_a99bb0;
                            v27 = v26;
                            len1 = _strlen();
                            if (iter)
                            {
                                if ((int)v5 >= 2)
                                {
                                    *(unsigned short *)iter = 46;
                                    iter += 1;
                                    v5 = (unsigned int)v5 - 1;
                                }
                                v29 = (int)v5;
                                sub_a6db20(iter, v27, v29);
                                if ((int)len1 > (int)v5)
                                {
                                    v5 = 0;
                                    iter += v29;
                                }
                                else
                                {
                                    iter += (int)len1;
                                    v5 = v29 - len1;
                                }
                            }
                            len = (unsigned int)len + (unsigned int)len1 + 1;
                            sub_a6c2e4(v27, "crypto/objects/obj_dat.c", 594);
                        }
                        else
                        {
                            v0 = v19;
                            sub_9d5b44(&v1, 37, ".%lu");
                            len2 = _strlen(&v1);
                            if (iter && (int)v5 >= 1)
                            {
                                v31 = v5 & 0xffffffff;
                                sub_a6db20(iter, &v1, v31);
                                v32 = v5 - len2;
                                if ((int)len2 > (int)v5)
                                {
                                    v5 = 0;
                                    iter += v31;
                                }
                                else
                                {
                                    iter += (int)len2;
                                    v5 = v32;
                                }
                            }
                            len += len2;
                        }
                    }
                } while ((v14 = 1, 0 < v12));
            }
            else
            {
                len = 0;
                v13 = 0;
            }
            sub_9e48d4(v13);
        }
    }
    else
    {
        if (iter)
            sub_a6db20(iter, v10, (int)v5);
        len = _strlen(v10);
    }
    if (*(long long *)&g_10002b0 == v2)
        return len;
    ___stack_chk_fail();
}
