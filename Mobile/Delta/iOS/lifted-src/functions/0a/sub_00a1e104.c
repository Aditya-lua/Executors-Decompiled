/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1e104..0xa1e538 (1076 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1e104_2 {
    char padding_0[136];
    struct st_a1e104_1 *field_88;
    char padding_90[8];
    void* field_98;
} st_a1e104_2;

typedef struct st_a1e104_0 {
    char padding_0[24];
    long long field_18;
} st_a1e104_0;

typedef struct st_a1e104_3 {
    char padding_0[24];
    struct st_a1e104_0 *field_18;
} st_a1e104_3;

typedef struct st_a1e104_1 {
    char padding_0[96];
    unsigned long long field_60;
} st_a1e104_1;


unsigned long long sub_a1e104(st_a1e104_2 *a0, unsigned int a1, unsigned long long a2, unsigned int a3)
{
    void* v2;  // x21
    unsigned long long v12;  // 4118
    unsigned long long v13;  // 4117
    st_a1e104_3 *v14;  // x0
    unsigned int v15;  // x0
    unsigned int v5;  // x0
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4118
    unsigned long long v8;  // 4116
    unsigned long long v9;  // x0
    unsigned long long v10;  // 4117
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_98;
    if (4098 >= (int)a1)
    {
        if (13 >= a1)
        {
            if (1 << ((char)a1 & 31) & 2212)
                return 1;
            switch (a1)
            {
            case 1:
                if (sub_9c7b68(a3) != 64 && sub_9c7b68(a3) != 416 && sub_9c7b68(a3) != 675 && sub_9c7b68(a3) != 672 && sub_9c7b68(a3) != 673 && sub_9c7b68(a3) != 674 && sub_9c7b68(a3) != 1096 && sub_9c7b68(a3) != 1097 && sub_9c7b68(a3) != 1098 && sub_9c7b68(a3) != 1099 && sub_9c7b68(a3) != 1143)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_pmeth.c", 355, "pkey_ec_ctrl");
                    sub_a36abc(16, 138, 0);
                    return 0;
                }
                *(unsigned long long *)&v2[8] = a3;
                return 1;
            case 13:
                *(long long *)a3 = (long long)v2[8];
                return 1;
            default:
                goto LABEL_a1e1d8;
            }
        }
        else
        {
LABEL_a1e1d8:
            if (a1 == 4097)
            {
                v5 = sub_a186a4(a2);
                if (!v5)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_pmeth.c", 0xff, "pkey_ec_ctrl");
                    sub_a36abc(16, 141, 0);
                    return 0;
                }
                sub_a1a174(*(long long *)v2);
                *(unsigned long long *)v2 = v5;
                return 1;
            }
            else if (a1 == 4098)
            {
                if (*(long long *)v2)
                {
                    sub_319f0(*(long long *)v2, a2);
                    return 1;
                }
                sub_a368c8(0);
                sub_a369bc("crypto/ec/ec_pmeth.c", 264, "pkey_ec_ctrl");
                sub_a36abc(16, 139, 0);
                return 0;
            }
        }
    }
    else
    {
        if (4102 >= (int)a1)
        {
            if (4100 >= (int)a1)
            {
                if (a1 == 4099)
                {
                    v8 = arm64g_calculate_condition(0x11, a2 & 0xffffffff, 2, 0);
                    if (!(v8 & 1))
                    {
                        v9 = (char)v2[24];
                        v10 = arm64g_calculate_condition(0x11, v9 & 0xffffffff, 1, 0);
                        if (v10 & 1)
                            return v9;
                        return __ROL__(sub_a198e8(sub_a59bc4(a0->field_88)), 20) & 0xfff00001 & 1;
                    }
                    else
                    {
                        v12 = arm64g_calculate_condition(33, (unsigned int)a2 - 2, 3, 0);
                        if (v12 & 1)
                        {
                            *(char *)&v2[24] = a2;
                            v13 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
                            if (v13 & 1)
                            {
                                sub_a18c08((long long)v2[16]);
                                *(unsigned long long *)&v2[16] = 0;
                                return 1;
                            }
                            v14 = sub_a59bc4(a0->field_88);
                            if (a0->field_88->field_60)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/ec/ec_pmeth.c", 290, "pkey_ec_ctrl");
                                sub_a36abc(16, 0x8010c, 0);
                                return 0;
                            }
                            if (v14->field_18)
                            {
                                if (sub_9e5b90(v14->field_18->field_18))
                                    return 1;
                                if (!(long long)v2[16])
                                {
                                    v15 = sub_a18ce8(v14);
                                    *(unsigned long long *)&v2[16] = v15;
                                    if (!v15)
                                        return v15;
                                }
                                if (!(unsigned int)a2)
                                {
                                    sub_a198f0();
                                    return 1;
                                }
                                sub_a197a8();
                                return 1;
                            }
                        }
                    }
                }
                else if (a1 == 4100)
                {
                    v6 = arm64g_calculate_condition(0x11, a2 & 0xffffffff, 2, 0);
                    if (!(v6 & 1))
                        return (char)v2[25];
                    v7 = arm64g_calculate_condition(49, (unsigned int)a2 - 3, 2, 0);
                    if (!(v7 & 1))
                    {
                        *(char *)&v2[25] = a2;
                        return 1;
                    }
                }
            }
            else
            {
                if (a1 == 4101)
                {
                    *(unsigned long long *)&v2[32] = a3;
                    return 1;
                }
                else if (a1 == 4102)
                {
                    *(long long *)a3 = (long long)v2[32];
                    return 1;
                }
            }
        }
        else
        {
            if (4104 >= (int)a1)
            {
                if (a1 != 4103)
                {
                    if (a1 == 4104)
                    {
                        *(int *)a3 = (long long)v2[56];
                        return 1;
                    }
                }
                else
                {
                    if ((int)a2 >= 1)
                    {
                        *(unsigned long long *)&v2[56] = a2 & 0xffffffff;
                        return 1;
                    }
                }
            }
            else
            {
                if (a1 == 4105)
                {
                    sub_a6c2e4((long long)v2[40], "crypto/ec/ec_pmeth.c", 341);
                    *(unsigned long long *)&v2[40] = a3;
                    if (!a3)
                    {
                        *(unsigned long long *)&v2[48] = 0;
                        return 1;
                    }
                    *(long long *)&v2[48] = (int)a2;
                    return 1;
                }
                else if (a1 == 4106)
                {
                    *(long long *)a3 = (long long)v2[40];
                    return (int)v2[48];
                }
            }
        }
    }
    return 0xfffffffe;
}
