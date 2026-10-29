/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96657c..0x9667a0 (548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96657c_0 {
    char padding_0[48];
    long long field_30;
    char padding_38[16];
    long long field_48;
    char padding_50[1];
    char field_51;
    char padding_52[926];
    long long field_3f0;
} st_96657c_0;


char sub_96657c(st_96657c_0 *a0, unsigned long long *a1)
{
    unsigned long long *v2;  // x20
    char idx;  // x0
    long long v12;  // x0
    long long i;  // x0
    char index;  // x8
    char v5;  // x9
    char v6;  // x11
    char v7;  // x10
    unsigned long long v8;  // x8
    unsigned long long v9;  // x8
    unsigned long long v10;  // 4126
    char v11;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((int)/* unsupported instruction */ < 1)
    {
        return 0;
    }
    else if (sub_a7c198(a0->field_3f0))
    {
        idx = sub_a66794(a0->field_30, v2);
        if (idx && idx != v2)
        {
            index = *(long long *)(idx + 912);
            if (index)
            {
                v5 = *(long long *)(idx + 904);
                if (v5)
                {
                    v6 = (char)(struct st_96657c_0 *)&a0->field_48;
                    v7 = (char)(struct st_96657c_0 *)&a0->padding_38[8];
                    if (index != v6)
                    {
                        if (v5 != v7)
                        {
                            *(unsigned long long *)(index + 904) = v5;
                            *(unsigned long long *)(*(long long *)(idx + 904) + 912) = index;
                        }
                        else
                        {
                            *(unsigned long long *)v7 = index;
                            *(unsigned long long *)(index + 904) = v7;
                        }
                    }
                    else
                    {
                        if (v5 != v7)
                        {
                            *(unsigned long long *)v6 = v5;
                            *(unsigned long long *)(v5 + 912) = v6;
                        }
                        else
                        {
                            *(unsigned long long *)v7 = 0;
                            *(unsigned long long *)(v7 + 8) = 0;
                        }
                    }
                    *(unsigned long long *)(idx + 912) = 0;
                    *(uint128_t *)(idx + 896) = 0;
                }
            }
            sub_9662a0();
            idx = 0;
            if (a0->field_51 >> 2 & 1)
                goto LABEL_9666a0;
            goto LABEL_966630;
        }
        else if (idx)
        {
            if (a0->field_51 >> 2 & 1)
                goto LABEL_9666a0;
LABEL_966630:
            if (!idx)
                goto LABEL_9666c8;
LABEL_966634:
            sub_9662a0();
            v11 = 0;
        }
        else
        {
            if (!sub_a66b6c(a0->field_30, v2))
                idx = (char)v2;
            else
                idx = 0;
            if (!(a0->field_51 >> 2 & 1))
                goto LABEL_966630;
LABEL_9666a0:
            v8 = sub_a7c2c0();
            v2[92] = v8;
            v9 = v8 + v2[91];
            v10 = arm64g_calculate_condition(50, v8, v2[91], 0);
            if (!(v10 & 1))
                v9 = 0xffffffffffffffff;
            v2[93] = v9;
            if (idx)
                goto LABEL_966634;
LABEL_9666c8:
            if (sub_960f58(a0, 43, 0, 0) >= 1)
            {
                v12 = sub_960f58(a0, 20, 0, 0);
                if (v12 >= sub_960f58(a0, 43, 0, 0))
                {
                    do
                    {
                        if (!sub_966ac4(a0, a0->field_48, 0))
                            break;
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        i = sub_960f58(a0, 20, 0, 0);
                    } while (sub_960f58(a0, 43, 0, 0) <= i);
                }
            }
            sub_966c04(a0, v2);
            v11 = 1;
        }
        sub_a7c1b4(a0->field_3f0);
        return v11;
    }
    else
    {
        sub_9662a0(v2);
        return 0;
    }
}
