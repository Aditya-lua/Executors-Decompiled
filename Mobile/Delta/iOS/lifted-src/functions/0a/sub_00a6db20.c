/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6db20..0xa6db94 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a6db20(unsigned long long *iter, char *a1, unsigned long long a2)
{
    unsigned long long v2;  // x8
    unsigned long long v4;  // w9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 >= 2)
    {
        v2 = 0;
        while (1)
        {
            v4 = a1[v2];
            if (!v4)
            {
                *((char *)iter + v2) = 0;
                return _strlen(a1) + v2;
            }
            *((char *)iter + v2) = v4;
            v2 += 1;
            if (a2 - 1 == v2)
            {
                *((char *)iter + v2) = 0;
                return _strlen(a1) + a2 - 1;
            }
        }
    }
    else if (a2)
    {
        *(char *)iter = 0;
        return _strlen(a1);
    }
    else
    {
        return _strlen(a1);
    }
}
