/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb6d0..0xaeb76c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aeb6d0(unsigned long a0, void* a1, unsigned long long a2)
{
    unsigned long v0;  // x8
    unsigned int v1;  // w9
    unsigned long long v10;  // 4102
    unsigned long v11;  // x9
    unsigned long long v12;  // x9
    unsigned long long v13;  // x0
    unsigned int v2;  // w11
    unsigned long v3;  // cc_dep1
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112

    v0 = (int)a1[232];
    if (v0 >> 2 & 1 && !((char)((char)a1[240]) >> 2 & 1))
        return 0;
    if (a2)
    {
        if (v0 >> 1 & 1 && !((char)((char)a1[236]) >> 2 & 1))
            return 0;
        if (!(v0 & 1))
        {
            v1 = (unsigned int)v0 & 2;
            v2 = (unsigned int)v0 & 8256;
            v3 = v2;
            if (v2 == 8256)
            {
                v4 = 3;
                v5 = arm64g_calculate_condition(19, v3, 8256, 0);
                if (!(v5 & 1))
                    goto LABEL_aeb70e;
LABEL_aeb70d:
                v7 = arm64g_calculate_condition(19, v3, 8256, 0);
                v8 = arm64g_calculate_condition(19, (v7 & 1 ? v1 : 0), 0, 0);
                if (v8 & 1)
                    return v4;
            }
            else
            {
                v4 = 4;
                v6 = arm64g_calculate_condition(19, v3, 8256, 0);
                if (v6 & 1)
                    goto LABEL_aeb70d;
LABEL_aeb70e:
                v9 = arm64g_calculate_condition(19, v3, 8256, 0);
                v10 = arm64g_calculate_condition(16, (v9 & 1 ? v1 : 0), 0, 0);
                if (v10 & 1)
                    return v4;
            }
            if (!(v0 >> 3 & 1))
                return 0;
            if ((char)((char)a1[244]) >> 1 & 1)
                return 5;
            return 0;
        }
        else if (!(v0 >> 4 & 1))
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    else
    {
        if (v0 >> 3 & 1 && !(v11 = (int)a1[244], v11 >> 5 & 1))
        {
            v12 = (unsigned int)v11 >> 6;
            if (!(v12 >> 1 & 1))
                return 0;
            v13 = (unsigned int)v12 & 2;
        }
        else
        {
            v13 = 1;
        }
        if (!(v0 >> 1 & 1))
        {
            return v13;
        }
        else if ((char)((char)a1[236]) >> 5 & 1)
        {
            return v13;
        }
        else
        {
            return 0;
        }
    }
}
