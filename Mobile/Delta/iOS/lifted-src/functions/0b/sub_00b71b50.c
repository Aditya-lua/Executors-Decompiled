/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb71b50..0xb71bb0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b71b50(void* a0, unsigned long a1)
{
    unsigned long long v0;  // 4117
    unsigned long long v1;  // 4102
    unsigned long long v2;  // 4117

    if (!a1)
    {
        return 0;
    }
    else if (*(char *)a0 == 92)
    {
        return 1;
    }
    else if (a1 != 1)
    {
        v0 = arm64g_calculate_condition(177, (char)a0[1], 64, 0);
        if (v0 & 1)
            return 0;
        if (3 >= a1)
        {
            v1 = arm64g_calculate_condition(4, a1, 3, 0);
            if (!(v1 & 1))
                return 0;
        }
        else
        {
            v2 = arm64g_calculate_condition(177, (char)a0[3], 64, 0);
            if (v2 & 1)
                return 0;
        }
        return (short)a0[1] == 23610;
    }
    else
    {
        return 0;
    }
}
