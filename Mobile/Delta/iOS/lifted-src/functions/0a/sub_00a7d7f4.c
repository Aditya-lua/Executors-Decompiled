/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7d7f4..0xa7d998 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a7d7f4(unsigned long long a0, unsigned int a1, long long a2, long long a3)
{
    unsigned long long v8;  // x0
    uint128_t v9;  // q0
    uint128_t v10;  // q0
    char v0;  // [bp-0x84]
    char v1;  // [bp-0x70]
    uint128_t v2;  // [bp-0x60]
    uint128_t v3;  // [bp-0x50]
    uint128_t v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (a1 == 29)
    {
        v8 = 0;
        if (a0 && a2 == 48)
        {
            v8 = sub_a7d544(a0, a3, 48);
            if ((unsigned int)v8)
            {
                if ((int)sub_abe350(a0 + 92, a3, 48) >= 1)
                {
                    v9 = CONCAT(0x3636363636363636, 0x3636363636363636);
                    v3 = v9;
                    v4 = v9;
                    v2 = v9;
                    v8 = sub_a7d544(a0, &v2, 48);
                    if ((unsigned int)v8 && (v8 = sub_a7d64c(&v1, a0), (unsigned int)v8 && (v8 = sub_abe350(a0 + 92, &v2, 40), (unsigned int)v8 && (v8 = sub_abe458(&v0, a0 + 92), (unsigned int)v8 && (v8 = sub_a7d710(a0), (unsigned int)v8 && (v8 = sub_aac61c(a0 + 92), (unsigned int)v8))))))
                    {
                        if ((int)sub_a7d768(a0, a3, 48) < 1)
                            goto LABEL_a7d98c;
                        v10 = CONCAT(0x5c5c5c5c5c5c5c5c, 0x5c5c5c5c5c5c5c5c);
                        v3 = v10;
                        v4 = v10;
                        v2 = v10;
                        v8 = sub_a7d544(a0, &v2, 48);
                        if ((unsigned int)v8)
                        {
                            v8 = sub_a7d544(a0, &v1, 16);
                            if ((unsigned int)v8)
                            {
                                v8 = sub_abe350(a0 + 92, &v2, 40);
                                if ((unsigned int)v8)
                                {
                                    v8 = sub_abe350(a0 + 92, &v0, 20);
                                    if ((unsigned int)v8)
                                    {
                                        sub_a66ec0(&v1, 16);
                                        sub_a66ec0(&v0, 20);
                                        v8 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                else
                {
LABEL_a7d98c:
                    v8 = 0;
                }
            }
        }
    }
    else
    {
        v8 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
