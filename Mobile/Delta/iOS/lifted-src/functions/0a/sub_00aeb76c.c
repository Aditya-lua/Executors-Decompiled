/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb76c..0xaeb7e4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aeb76c(unsigned long a0, void* a1, unsigned int a2)
{
    unsigned long v0;  // x8
    unsigned int v1;  // w9
    unsigned long long v10;  // 4102
    unsigned int v2;  // w11
    unsigned long v3;  // cc_dep1
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112

    v0 = (int)a1[232];
    if (a2)
    {
        if (v0 >> 1 & 1 && !((char)((char)a1[236]) >> 2 & 1))
            return 0;
        if (v0 & 1)
            return __ROL__((unsigned int)v0, 28) & 4026531841 & 1;
        v1 = (unsigned int)v0 & 2;
        v2 = (unsigned int)v0 & 8256;
        v3 = v2;
        if (v2 == 8256)
        {
            v4 = 3;
            v5 = arm64g_calculate_condition(19, v3, 8256, 0);
            if (!(v5 & 1))
                goto LABEL_aeb79e;
LABEL_aeb79d:
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
                goto LABEL_aeb79d;
LABEL_aeb79e:
            v9 = arm64g_calculate_condition(19, v3, 8256, 0);
            v10 = arm64g_calculate_condition(16, (v9 & 1 ? v1 : 0), 0, 0);
            if (v10 & 1)
                return v4;
        }
        if (!(v0 >> 3 & 1))
            return 0;
        if ((char)a1[244] & 7)
            return 5;
        return 0;
    }
    else if (!(v0 >> 1 & 1))
    {
        return 1;
    }
    else
    {
        return __ROL__((int)a1[236], 31) & 0x80000001 & 1;
    }
}
