/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae9748..0xae97a8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ae9748(char *a0, char *a1, unsigned long long a2)
{
    unsigned long long v0;  // x2
    unsigned int v1;  // w9
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w8
    unsigned long long v5;  // 4110

    if (!a2)
        return 0;
    while (1)
    {
        v0 = a2;
        v1 = *a0;
        v2 = *a1;
        if (v1 != v2)
        {
            if (v1 - 65 < 26)
                v3 = v1 | 32;
            else
                v3 = v1 & 0xff;
            if (v2 - 65 < 26)
                v4 = v2 | 32;
            else
                v4 = v2 & 0xff;
            if (v3 != v4)
                break;
        }
        a0 += 1;
        a1 += 1;
        a2 = v0 - 1;
        if (v0 == 1)
            return 0;
    }
    v5 = arm64g_calculate_condition(0x33, v3, v4, 0);
    if (!(v5 & 1))
        return 0;
    return 0xffffffff;
}
