/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf0158..0xaf02d8 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_af12a0;
extern char g_10002b0;

unsigned long long sub_af0158(uint128_t *ptr, long long a1)
{
    unsigned long n;  // x20
    unsigned long v7;  // x21
    unsigned long long v8;  // 4125
    uint128_t *v9;  // x19
    unsigned long long v10;  // x0
    char v0;  // [bp-0x54]
    unsigned long long v1;  // [bp-0x44]
    unsigned long long v2;  // [bp-0x3c]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (_strchr(a1, 58))
    {
        v1 = 0xffffffff00000000;
        v2 = 0;
        if (sub_9f5c88(a1, 58, 0, &g_af12a0, &v0))
        {
            n = *(unsigned int *)((void*)&v1 + 4);
            v7 = (int)v1;
            v8 = arm64g_calculate_condition(1, n & 0xffffffff, 1, 0);
            if (!(v8 & 1))
            {
                if ((unsigned int)v7 != 16 && 3 >= v2)
                {
                    if (v2 != 2)
                    {
                        if (v2 == 3)
                        {
                            if (0 >= (int)v7)
                                goto LABEL_af0250;
                        }
                        else
                        {
                            if ((unsigned int)n && (unsigned int)v7 != (unsigned int)n)
                                goto LABEL_af0250;
                        }
                    }
                    else
                    {
                        if (!(unsigned int)n || (unsigned int)v7 == (unsigned int)n)
                        {
LABEL_af0250:
                            if (n >> 31 & 1)
                            {
                                *ptr = v0;
                                if (*(long long *)&g_10002b0 == v3)
                                    return 16;
                                ___stack_chk_fail();
                            }
                            else
                            {
                                _memcpy(ptr, &v0, n);
                                v9 = (char *)ptr + n;
                                _bzero(v9, 16 - v7);
                                if ((unsigned int)v7 != (unsigned int)n)
                                    _memcpy((char *)v9 - v7 + 16, &(&v0)[n], (int)(v7 - n));
                                if (*(long long *)&g_10002b0 == v3)
                                    return 16;
                                ___stack_chk_fail();
                            }
                        }
                    }
                }
            }
            else
            {
                if ((unsigned int)v7 == 16)
                {
                    *ptr = v0;
                    if (*(long long *)&g_10002b0 == v3)
                        return 16;
                    ___stack_chk_fail();
                }
            }
        }
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        v10 = (sub_af06a4(ptr, a1) != 0) * 4;
        if (*(long long *)&g_10002b0 == v3)
            return v10;
        ___stack_chk_fail();
    }
}
