/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae75e0..0xae7744 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ae75e0(char *a0, char *a1)
{
    char *v2;  // w9
    unsigned long long v3;  // x0
    char *v4;  // x19
    char *v5;  // x20
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0xffffffff;
    }
    else if (a1)
    {
        v2 = (char *)*(int *)a0;
        if (v2 != *(int *)a1)
        {
            return 0xffffffff;
        }
        else if (4 >= v2)
        {
            if (2 >= v2)
            {
                if (v2 - 1 >= 2)
                {
                    if (v2)
                    {
                        return 0xffffffff;
                    }
                    else if (!*(long long *)&a0[8])
                    {
                        return 0xffffffff;
                    }
                    else if (*(long long *)&a1[8])
                    {
                        v3 = sub_a9ae30(*(long long *)*(long long *)&a0[8], *(long long *)*(long long *)&a1[8]);
                        if ((unsigned int)v3)
                            return v3;
                    }
                    else
                    {
                        return 0xffffffff;
                    }
                }
            }
            else
            {
                if (v2 != 3 && v2 != 4)
                    return 0xffffffff;
            }
            goto LABEL_ae76c4;
        }
        else
        {
            if (6 < v2 && v2 != 7)
            {
                if (v2 == 8)
                    return sub_a9ae30();
                return 0xffffffff;
            }
            if (v2 != 5)
            {
                if (v2 != 6)
                    return 0xffffffff;
LABEL_ae76c4:
            }
            else
            {
                v4 = *(long long *)&a0[8];
                if (!v4)
                    return 0xffffffff;
                v5 = *(long long *)&a1[8];
                if (!v5)
                    return 0xffffffff;
                if (*(long long *)v4)
                {
                    if (*(long long *)v5)
                    {
                        v6 = sub_9c7af8();
                        if ((unsigned int)v6)
                            return v6;
                    }
                    else
                    {
                        return 1;
                    }
                }
                else
                {
                    if (*(long long *)v5)
                        return 0xffffffff;
                }
                if (!*(long long *)&v4[8])
                {
                    return 0xffffffff;
                }
                else if (!*(long long *)&v5[8])
                {
                    return 0xffffffff;
                }
            }
            return sub_9c7af8();
        }
    }
    else
    {
        return 0xffffffff;
    }
}
