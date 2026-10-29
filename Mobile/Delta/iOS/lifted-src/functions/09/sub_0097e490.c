/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97e490..0x97e578 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_97e490(char *a0, unsigned int *a1)
{
    char *v2;  // x9
    char *v3;  // w10
    unsigned int v4;  // w8
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && !(v2 = *(long long *)&a0[128], !v2))
    {
        v3 = (char *)v2[0x101];
        v4 = 366;
        if (3 >= v3)
        {
            if (v3 - 2 < 2)
            {
LABEL_97e500:
                if (!sub_988ecc(*(long long *)&v2[112], 0))
                    return 1;
                v4 = 365;
                goto LABEL_97e518;
            }
            else if (v3 == 1)
            {
                v5 = sub_97724c(*(long long *)(*(long long *)&a0[120] + 160));
                if (sub_9898b8(v5, *(long long *)&a0[128]))
                {
                    v2 = *(long long *)&a0[128];
                    goto LABEL_97e500;
                }
                else
                {
                    v4 = 786691;
LABEL_97e518:
                }
            }
        }
        else
        {
            if (2 > v3 - 5)
            {
                v4 = 375;
            }
            else if (v3 == 4)
            {
                v4 = 365;
            }
        }
    }
    else
    {
        v4 = 786691;
    }
    *a1 = v4;
    return 0;
}
