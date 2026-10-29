/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2080..0x1b20f0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1b2080(unsigned long a0, char *a1, char *a2, unsigned long long a3)
{
    char *v0;  // x8
    char *v1;  // x9
    unsigned long long v3;  // x3
    unsigned int v4;  // w9

    v0 = &a2[a0];
    if (a1 > v0)
    {
        v1 = &a1[-1 * a0];
        while (1)
        {
            v0 += 1;
            if (*v0 != 9 && *v0 != 32)
                break;
            a2 += 1;
            if (a1 <= v0)
            {
                a2 = v1;
                break;
            }
        }
    }
    if (!a3)
        return a2;
    while (1)
    {
        v3 = a3;
        v4 = *(char *)(a0 - 1 + v3);
        if (v4 != 9 && v4 != 32)
            return a2;
        a3 = v3 - 1;
        if (v3 == 1)
            return a2;
    }
}
