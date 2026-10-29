/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x438b90..0x438c9c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_98967f;
extern char g_989680;

unsigned long long sub_438b90(unsigned long long a0, void* a1)
{
    unsigned long v0;  // cc_dep1
    unsigned long long v1;  // w8
    unsigned long long v2;  // 4110
    unsigned long long v3;  // 4110
    unsigned long long v4;  // x0

    if (a0 > 0x3b9ac9ff)
    {
        *(unsigned int *)a1 = 1000000000;
        return 10;
    }
    else if (a0 > 0x5f5e0ff)
    {
        *(unsigned int *)a1 = 100000000;
        return 9;
    }
    else if (a0 > &g_98967f)
    {
        *(unsigned int *)a1 = (unsigned int)&g_989680;
        return 8;
    }
    else if (a0 > 999999)
    {
        *(unsigned int *)a1 = 1000000;
        return 7;
    }
    else if (a0 >> 5 > 3124)
    {
        *(unsigned int *)a1 = 100000;
        return 6;
    }
    else if (a0 >> 4 > 624)
    {
        *(unsigned int *)a1 = 10000;
        return 5;
    }
    else if (a0 > 999)
    {
        *(unsigned int *)a1 = 1000;
        return 4;
    }
    else if (a0 > 99)
    {
        *(unsigned int *)a1 = 100;
        return 3;
    }
    else
    {
        v0 = a0;
        if (9 < a0)
        {
            v1 = 10;
            v2 = arm64g_calculate_condition(147, v0, 9, 0);
            if (!(v2 & 1))
                goto LABEL_438c92;
LABEL_438c91:
            v4 = 1;
        }
        else
        {
            v1 = 1;
            v3 = arm64g_calculate_condition(147, v0, 9, 0);
            if (v3 & 1)
                goto LABEL_438c91;
LABEL_438c92:
            v4 = 2;
        }
        *(unsigned int *)a1 = v1;
        return v4;
    }
}
