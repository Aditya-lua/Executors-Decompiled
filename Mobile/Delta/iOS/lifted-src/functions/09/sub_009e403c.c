/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e403c..0x9e4290 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e403c_0 {
    unsigned int field_0;
} st_9e403c_0;


unsigned int sub_9e403c(st_9e403c_0 **a0, unsigned int a1, long long *a2)
{
    unsigned int v6;  // x19
    unsigned long long v7;  // 4118
    unsigned int v16;  // x26
    unsigned long v17;  // x24
    unsigned int v18;  // x9
    unsigned long long v19;  // x26
    unsigned int v20;  // w9
    unsigned long v21;  // cc_dep1
    unsigned int v22;  // x10
    unsigned long long v23;  // 4108
    unsigned long long v24;  // 4108
    unsigned long long v25;  // x26
    long long v8;  // x25
    char v26;  // x9
    unsigned int v9;  // w0
    unsigned int v11;  // x24
    unsigned int v12;  // x8
    unsigned int v13;  // w27
    unsigned int i;  // w28
    unsigned int v15;  // w9
    unsigned int v0;  // [bp-0x78]
    unsigned int v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x6c]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (sub_9e4828())
    {
        v6 = sub_a6bf4c(1, "crypto/bn/bn_intern.c", 31);
        if (!v6)
        {
            sub_a6c2e4(v6, "crypto/bn/bn_intern.c", 133);
            return 0;
        }
        *(char *)v6 = 0;
        *a2 = 1;
        return v6;
    }
    else
    {
        v7 = arm64g_calculate_condition(33, a1 - 8, 7, 0);
        if (!(v7 & 1))
        {
            v6 = 0;
            v8 = 41;
        }
        else
        {
            v9 = sub_9e5c94(a0);
            if (*a0 && (int)a0[1])
            {
                v3 = sub_9e46a8(a0);
                v11 = v3 + 1;
                v6 = sub_a6bf4c(v11, "crypto/bn/bn_intern.c", 58);
                if (!v6)
                {
                    sub_a6c2e4(v6, "crypto/bn/bn_intern.c", 133);
                    return 0;
                }
                v0 = v11;
                v12 = 0;
                v13 = 1 << ((char)a1 & 31);
                i = 2 << ((char)a1 & 31);
                v15 = i - 1;
                v16 = v15 & *(int *)*a0;
                v17 = a1 + 1;
                v1 = -v13;
                v2 = v15 >> 1;
                do
                {
                    if (!v16)
                    {
                        if (v3 > v17 + v12)
                        {
                            v16 = 0;
                            goto LABEL_9e4150;
                        }
                        else if (v12 > v0)
                        {
                            v8 = 126;
                            goto LABEL_9e4200;
                        }
                        else
                        {
                            *a2 = v12;
                            return v6;
                        }
                    }
                    else
                    {
                        if (!(v16 & 1))
                        {
LABEL_9e4150:
                            v18 = 0;
                            v19 = v16;
                            continue;
                        }
                        else
                        {
                            if (v17 + v12 < v3)
                                v20 = v16 - i;
                            else
                                v20 = v16 & v2;
                            v21 = v16 & v13;
                            if (!(v16 & v13))
                            {
                                v22 = 0;
                                v23 = arm64g_calculate_condition(9, v21, 0, 0);
                                if (!(v23 & 1))
                                    goto LABEL_9e41ba;
                                goto LABEL_9e41b9;
                            }
                            else
                            {
                                v22 = !(v20 & 1);
                                v24 = arm64g_calculate_condition(9, v21, 0, 0);
                                if (v24 & 1)
                                {
LABEL_9e41b9:
                                    v18 = v16 & 0xffffffff;
                                    goto LABEL_9e41bc;
                                }
                                else
                                {
LABEL_9e41ba:
                                    v18 = v20;
LABEL_9e41bc:
                                    v8 = 97;
                                    if ((int)v18 <= (int)v1 || (int)v13 <= (int)v18 || v22 & 1)
                                        goto LABEL_9e4200;
                                    v25 = v16 - v18;
                                    v19 = v25;
                                    if (v16 != v18 && (v19 = v25, (unsigned int)v19 != i && (v19 = v25, (unsigned int)v19 != v13)))
                                    {
                                        v8 = 109;
                                        goto LABEL_9e4200;
                                    }
                                }
                            }
                        }
                    }
                    if (!v9)
                        v26 = v18;
                    else
                        v26 = -v18;
                    *(char *)(v6 + v12) = v26;
                    v16 = (sub_9e5748() << ((char)a1 & 31)) + ((int)((unsigned int)v19) >> 1);
                    v12 += 1;
                } while ((int)i >= (int)v16);
                v8 = 120;
            }
            else
            {
                v6 = 0;
                v8 = 53;
            }
        }
LABEL_9e4200:
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_intern.c", v8, "bn_compute_wNAF");
        sub_a36abc(3, 0xc0103, 0);
        sub_a6c2e4(v6, "crypto/bn/bn_intern.c", 133);
        return 0;
    }
}
