/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991508..0x991584 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_991508(unsigned long long a0, char *a1, long long a2)
{
    char v0;  // x9
    char v1;  // x10
    char v2;  // x9
    char v3;  // x10

    v0 = 8;
    if (2 < a2)
    {
        if (a2 != 3)
        {
            if (a2 != 4)
                return 0;
            a1[3] = a0;
            v3 = a0 >> 8;
            v2 = 24;
            v0 = 16;
        }
        else
        {
            v2 = 16;
            v3 = a0;
        }
        a1[2] = v3;
        v1 = a0 >> (v0 & 63);
    }
    else if (a2 != 1)
    {
        v1 = a0;
        v2 = 8;
        if (a2 != 2)
            return 0;
    }
    else
    {
        *a1 = a0;
        return 1;
    }
    a1[1] = v1;
    *a1 = a0 >> (v2 & 63);
    return 1;
}
