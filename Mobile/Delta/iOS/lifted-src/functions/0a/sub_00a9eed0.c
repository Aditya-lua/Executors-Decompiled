/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9eed0..0xa9f0a0 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a9eed0(void* *a0, unsigned int a1, unsigned int a2, void* a3, unsigned int *a4, unsigned int *a5)
{
    void* v2;  // x8
    void* v3;  // x8
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    long long v4;  // x1
    long long v5;  // x1
    unsigned int v6;  // w9
    unsigned int v7;  // w9
    unsigned int v8;  // w10
    unsigned int v9;  // w10
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (a2)
    {
        v3 = v2;
        if (19 < a1)
            goto LABEL_a9ef48;
        sub_a368c8();
        v4 = 769;
        goto LABEL_a9ef24;
    }
    else
    {
        if (23 >= a1)
        {
            sub_a368c8();
            v4 = 774;
LABEL_a9ef24:
            sub_a369bc("crypto/pem/pvkfmt.c", v4, "ossl_do_PVK_header");
            v5 = 125;
        }
        else
        {
            v3 = v2 + 4;
            if (*(int *)v2 == 2964713758)
            {
LABEL_a9ef48:
                if ((int)v3[4] != 2)
                {
                    if ((int)v3[4] != 1)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pvkfmt.c", 802, "ossl_do_PVK_header");
                        v5 = 133;
                    }
                    else if (*(int *)a3 == 1)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pvkfmt.c", 789, "ossl_do_PVK_header");
                        v5 = 132;
                    }
                    else
                    {
                        v6 = 0;
LABEL_a9eff4:
                        *(unsigned int *)a3 = v6;
                        v7 = (int)v3[8];
                        *a4 = (int)v3[12];
                        v8 = (int)v3[16];
                        *a5 = v8;
                        if (0x19000 < v8)
                            return 0;
                        v9 = *a4;
                        v10 = v9;
                        if (0x2800 < v9)
                            return 0;
                        if (v7)
                        {
                            v11 = arm64g_calculate_condition(19, v10, 0x2800, 0);
                            v12 = arm64g_calculate_condition(3, (v11 & 1 ? v9 : 0), 0, 0);
                            if (!(v12 & 1))
                            {
                                *a0 = v3 + 20;
                                return 1;
                            }
                        }
                        else
                        {
                            v13 = arm64g_calculate_condition(19, v10, 0x2800, 0);
                            v14 = arm64g_calculate_condition(0, (v13 & 1 ? v9 : 0), 0, 0);
                            if (!(v14 & 1))
                            {
                                *a0 = v3 + 20;
                                return 1;
                            }
                        }
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pvkfmt.c", 813, "ossl_do_PVK_header");
                        v5 = 121;
                    }
                }
                else
                {
                    if (*(int *)a3)
                    {
                        v6 = 1;
                        goto LABEL_a9eff4;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pvkfmt.c", 796, "ossl_do_PVK_header");
                        v5 = 131;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/pem/pvkfmt.c", 779, "ossl_do_PVK_header");
                v5 = 116;
            }
        }
        sub_a36abc(9, v5, 0);
        return 0;
    }
}
