/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5ab0..0x9e5b4c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9e5ab0(int a0, unsigned int a1)
{
    unsigned int v0;  // w0
    unsigned long long v1;  // 4113
    unsigned long long v2;  // 4113
    unsigned long long v3;  // 4113
    unsigned long long v4;  // 4113
    unsigned long long v5;  // 4113

    if (a0 > 0x3bff)
    {
        v0 = 0x100;
        v1 = arm64g_calculate_condition(1, a1, 1, 0);
        if (v1 & 1)
            return 0x100;
    }
    else if (a0 > 0x1dff)
    {
        v0 = 192;
        v2 = arm64g_calculate_condition(0x11, a1, 1, 0);
        if (!(v2 & 1))
            return 192;
    }
    else if (a0 > 0xbff)
    {
        v0 = 128;
        v3 = arm64g_calculate_condition(0x11, a1, 1, 0);
        if (!(v3 & 1))
            return 128;
    }
    else if (a0 > 0x7ff)
    {
        v0 = 112;
        v4 = arm64g_calculate_condition(0x11, a1, 1, 0);
        if (!(v4 & 1))
            return 112;
    }
    else if (a0 < 0x400)
    {
        return 0;
    }
    else
    {
        v0 = 80;
        v5 = arm64g_calculate_condition(0x11, a1, 1, 0);
        if (!(v5 & 1))
            return 80;
    }
    if (160 > (int)a1)
    {
        return 0;
    }
    else if (a1 >> 1 < v0)
    {
        return a1 >> 1;
    }
    else
    {
        return v0;
    }
}
