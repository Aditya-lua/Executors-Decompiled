/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985ac0..0x985cc0 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_d285b1;
extern char g_10002b0;

int sub_985ac0(long long a0, long long a1, unsigned long a2, long long a3, long long a4, long long a5)
{
    long long v8;  // x20
    long long v9;  // x22
    long long v18;  // x8
    long long v10;  // x0
    long long v11;  // x19
    unsigned long v12;  // cc_dep1
    char *v13;  // x23
    unsigned long long v14;  // 4105
    unsigned long long v15;  // 4105
    char *v16;  // x21
    long long v17;  // x8
    long long v0;  // [bp-0xe0]
    long long v1;  // [bp-0xd0]
    char v2;  // [bp-0xc8]
    char v3;  // [bp-0xa8]
    char v4;  // [bp-0x88]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (!a4 && !a5)
    {
        if (*(long long *)&g_10002b0 == v5)
            return 1;
        ___stack_chk_fail();
    }
    else
    {
        v8 = a5;
        v9 = a4;
        v10 = sub_a40ca8();
        if (v10)
        {
            v11 = v10;
            v12 = a3;
            if (!a3)
            {
                v13 = &v2;
                v14 = arm64g_calculate_condition(3, v12, 0, 0);
                if (!(v14 & 1))
                    goto LABEL_985b42;
LABEL_985b41:
                v16 = &v3;
            }
            else
            {
                v13 = &v3;
                v15 = arm64g_calculate_condition(3, v12, 0, 0);
                if (v15 & 1)
                    goto LABEL_985b41;
LABEL_985b42:
                v16 = &v2;
            }
            v0 = 32;
            if (sub_9858dc())
            {
                if (!a3)
                    v17 = v8;
                else
                    v17 = v9;
                if (!v17 || (*(unsigned int *)&v1 = 1, sub_96eae0(a0, a1, v11, &v4, "client in", 9, 0, 0, &v3, 32, v1)))
                {
                    if (!a3)
                        v18 = v9;
                    else
                        v18 = v8;
                    if (!v18 || !(*(unsigned int *)&v1 = 1, !sub_96eae0(a0, a1, v11, &v4, &g_d285b1, 9, 0, 0, &v2, 32, v1)))
                    {
                        if (!v9)
                        {
                            if (!v8)
                            {
                                if (*(long long *)&g_10002b0 == v5)
                                    return 1;
                                ___stack_chk_fail();
                            }
LABEL_985c50:
                            if (sub_9853a4(v8, 0, 1, v11, v16, 32))
                            {
                                if (*(long long *)&g_10002b0 == v5)
                                    return 1;
                                ___stack_chk_fail();
                            }
                        }
                        else if (sub_9837fc(v9, 0, 1, v11, v13, 32))
                        {
                            if (!v8)
                            {
                                if (*(long long *)&g_10002b0 == v5)
                                    return 1;
                                ___stack_chk_fail();
                            }
                            if (sub_a40a98(v11))
                                goto LABEL_985c50;
                            v11 = 0;
                        }
                    }
                }
            }
            sub_a3f52c(v11);
            if (*(long long *)&g_10002b0 == v5)
                return 0;
            ___stack_chk_fail();
        }
        else
        {
            if (*(long long *)&g_10002b0 == v5)
                return v10;
            ___stack_chk_fail();
        }
    }
}
