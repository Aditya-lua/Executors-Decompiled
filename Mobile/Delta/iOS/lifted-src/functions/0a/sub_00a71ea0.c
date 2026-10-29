/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71ea0..0xa722b0 (1040 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71ea0_0 {
    char field_0;
    char field_1;
    char field_2;
} st_a71ea0_0;


unsigned long long sub_a71ea0(unsigned long long index, unsigned long long a1, st_a71ea0_0 *a2, long long ptr, unsigned long long a4, unsigned long long a5)
{
    unsigned long long n;  // x21
    unsigned int v5;  // w9
    unsigned long long v14;  // x8
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4112
    unsigned long v20;  // x9
    unsigned long long v21;  // 4108
    unsigned long long v6;  // x24
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4108
    unsigned long long v7;  // x9
    unsigned long long v24;  // x0
    void* ptr1;  // x23
    unsigned long long v26;  // w8
    unsigned long long j;  // x8
    unsigned long long idx;  // x20
    void* node;  // x9
    unsigned long long v29;  // x10
    uint128_t *iter;  // x8
    unsigned long long i;  // x9
    unsigned long long v32;  // x9
    uint128_t v33;  // q1
    unsigned long long v35;  // x11
    void* iter1;  // x12
    unsigned long long v37;  // x10
    unsigned long long v9;  // w8
    unsigned long v38;  // d0
    unsigned long long v40;  // 4117
    unsigned long long v41;  // x8
    unsigned long long len;  // x0
    long long v11;  // x1
    unsigned long long v12;  // w8
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    if (!index)
    {
        return 0;
    }
    else if (a1)
    {
        n = a4;
        if (a2->field_0 == 104 && a2->field_1 == 101)
        {
            v5 = a2->field_2;
            v6 = v5 != 120;
            v7 = 3;
            if (v5 != 120)
                v7 = 0;
        }
        else
        {
            v7 = 0;
            v6 = 1;
        }
        idx = sub_a6fbc4(a1, &(&a2->field_0)[v7]);
        if (a5)
            *(unsigned int *)a5 = idx != 0;
        if (idx)
        {
            v9 = *(int *)(idx + 8);
            if (v9 - 1 >= 2)
            {
                if (v9 != 4)
                {
                    if (v9 != 5)
                    {
                        n = 0;
                        goto LABEL_a71ff4;
                    }
                    else if (!(v6 & 1))
                    {
                        len = _strlen(ptr);
                        if (!(len & 1))
                        {
                            n = len >> 1;
                            goto LABEL_a71ff4;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/params_from_text.c", 122, "prepare_from_text");
                            v11 = 103;
                            goto LABEL_a72188;
                        }
                    }
                }
                else
                {
                    if (v6 & 1)
                    {
                        n = _strlen(ptr) + 1;
                        goto LABEL_a71ff4;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/params_from_text.c", 112, "prepare_from_text");
                        v11 = 524550;
                        goto LABEL_a72188;
                    }
                }
            }
            else
            {
                if (!(v6 & 1) && sub_9dd9cc(&v0, ptr) && v0)
                {
                    v12 = *(int *)(idx + 8);
                    if (*(int *)(idx + 8) == 2)
                    {
                        if (sub_9e5c94())
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/params_from_text.c", 60, "prepare_from_text");
                            v11 = 122;
                            goto LABEL_a72188;
                        }
                        else
                        {
                            v12 = *(int *)(idx + 8);
                        }
                    }
                    if (v12 != 1 || !sub_9e5c94())
                    {
LABEL_a72138:
                        v14 = sub_9e46a8();
                        if (!(v14 & 7))
                        {
                            v19 = arm64g_calculate_condition(v15, v16, v17, v18);
                            v20 = v14 + 8;
                            v21 = arm64g_calculate_condition(3, (v19 & 1 ? *(int *)(idx + 8) : 0), v19 & 1, 0);
                            if (!(v21 & 1))
                                goto LABEL_a72152;
LABEL_a72151:
                            v14 = v20;
                        }
                        else
                        {
                            v22 = arm64g_calculate_condition(v15, v16, v17, v18);
                            v20 = v14 + 8;
                            v23 = arm64g_calculate_condition(0, (v22 & 1 ? *(int *)(idx + 8) : 0), v22 & 1, 0);
                            if (v23 & 1)
                                goto LABEL_a72151;
LABEL_a72152:
                        }
                        n = *(long long *)(idx + 24);
                        if (n)
                        {
                            if (v14 <= n * 8)
                                goto LABEL_a71ff4;
                            sub_a368c8();
                            sub_a369bc("crypto/params_from_text.c", 0x66, "prepare_from_text");
                            v11 = 116;
LABEL_a72188:
                            sub_a36abc(15, v11, 0);
                        }
                        else
                        {
                            n = v14 + 7 >> 3;
LABEL_a71ff4:
                            v24 = sub_a6bffc();
                            if (v24)
                            {
                                ptr1 = v24;
                                if (n)
                                {
                                    v26 = *(int *)(idx + 8);
                                    if (v26 - 1 >= 2)
                                    {
                                        if (v26 != 4)
                                        {
                                            if (v26 == 5)
                                            {
                                                if (v6 & 1)
                                                {
                                                    _memcpy(ptr1, ptr, n);
                                                }
                                                else
                                                {
                                                    v1 = 0;
                                                    if (!sub_a6dd34(ptr1, n, &v1, ptr, 58))
                                                    {
                                                        sub_9e48d4(v0);
                                                        sub_a6c2e4(ptr1, "crypto/params_from_text.c", 332);
                                                        return 0;
                                                    }
                                                }
                                            }
                                        }
                                        else
                                        {
                                            _strncpy(ptr1, ptr, n);
                                            n -= 1;
                                        }
                                    }
                                    else
                                    {
                                        sub_9e536c(v0, ptr1, n);
                                        if (*(int *)(idx + 8) == 1 && sub_9e5c94(v0))
                                        {
                                            j = n;
                                            node = ptr1;
                                            if (n >= 8)
                                            {
                                                if (32 > n)
                                                {
                                                    v29 = 0;
LABEL_a7223c:
                                                    v35 = n & 0xfffffffffffffff8;
                                                    j = n & 7;
                                                    node = ptr1 + v35;
                                                    iter1 = ptr1 + v29;
                                                    v37 = v29 - v35;
                                                    do
                                                    {
                                                        v38 = __dirty_unsupported_Iop_ZeroHI64ofV128(~*(unsigned long long *)&*(double *)iter1);
                                                        *(unsigned long *)iter1 = v38;
                                                        iter1 += 8;
                                                        v40 = arm64g_calculate_condition(18, v37, 8, 0);
                                                        v37 += 8;
                                                    } while (v40 & 1);
                                                    if (n == v35)
                                                    {
                                                        *(int128_t *)index = *(int128_t *)idx;
                                                        *(void* *)(index + 16) = ptr1;
                                                        *(unsigned long long *)(index + 24) = n;
                                                        *(unsigned long *)(index + 32) = 0xffffffffffffffff;
                                                        sub_9e48d4(v0);
                                                        return 1;
                                                    }
                                                }
                                                else
                                                {
                                                    v29 = n & 0xffffffffffffffe0;
                                                    iter = ptr1 + 16;
                                                    i = v29;
                                                    do
                                                    {
                                                        v32 = i;
                                                        v33 = *iter;
                                                        *(int128_t *)((char *)iter - 16) = ~*(int128_t *)((char *)iter - 16);
                                                        *iter = ~v33;
                                                        iter += 2;
                                                        i = v32 - 32;
                                                    } while (i);
                                                    if (n == v29)
                                                    {
                                                        *(int128_t *)index = *(int128_t *)idx;
                                                        *(void* *)(index + 16) = ptr1;
                                                        *(unsigned long long *)(index + 24) = n;
                                                        *(unsigned long *)(index + 32) = 0xffffffffffffffff;
                                                        sub_9e48d4(v0);
                                                        return 1;
                                                    }
                                                    if (n & 24)
                                                        goto LABEL_a7223c;
                                                    node = ptr1 + v29;
                                                    j = n & 31;
                                                }
                                            }
                                            do
                                            {
                                                v41 = j;
                                                *(char *)node = ~*(char *)node;
                                                node += 1;
                                                j = v41 - 1;
                                            } while (j);
                                        }
                                    }
                                }
                                *(int128_t *)index = *(int128_t *)idx;
                                *(void* *)(index + 16) = ptr1;
                                *(unsigned long long *)(index + 24) = n;
                                *(unsigned long *)(index + 32) = 0xffffffffffffffff;
                                sub_9e48d4(v0);
                                return 1;
                            }
                        }
                    }
                    else if (sub_9eb9e0(v0, 1))
                    {
                        goto LABEL_a72138;
                    }
                }
            }
        }
        sub_9e48d4(v0);
        return 0;
    }
    else
    {
        return 0;
    }
}
