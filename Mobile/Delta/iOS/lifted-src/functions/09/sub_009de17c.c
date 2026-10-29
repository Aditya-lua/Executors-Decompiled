/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9de17c..0x9de208 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_9de17c(char *a0)
{
    unsigned int *v0;  // x8
    unsigned int v1;  // w9
    unsigned long long v10;  // 4126
    unsigned int v2;  // w8
    unsigned int v3;  // w10
    unsigned int v4;  // w9
    unsigned int v5;  // w11
    char *v6;  // w10
    char *v7;  // w10
    unsigned int v8;  // w9
    unsigned long long v9;  // 4119

    if (!a0)
    {
        return a0;
    }
    else if (*(int *)&a0[52])
    {
        *(int *)&a0[52] = *(int *)&a0[52] - 1;
        return a0;
    }
    else
    {
        v0 = *(long long *)&a0[32];
        v1 = *(int *)&a0[40] - 1;
        *(unsigned int *)&a0[40] = v1;
        v2 = v0[v1];
        v3 = *(int *)&a0[48];
        v4 = v2 - v3;
        if (v3 > v2)
        {
            v5 = *(int *)&a0[24];
            v6 = (char *)(v3 - v2);
            *(unsigned int *)&a0[24] = (unsigned int)(v5 - v6);
            if (v6)
            {
                v7 = (char *)(v5 - 1 & 15);
                while (1)
                {
                    v8 = v4;
                    if (v7)
                    {
                        v7 -= 1;
                        v4 = v8 + 1;
                        v9 = arm64g_calculate_condition(33, v8, 1, 0);
                        if (v9 & 1)
                            break;
                    }
                    else
                    {
                        *(long long *)&a0[8] = *(long long *)(*(long long *)&a0[8] + 384);
                        v7 = (char *)15;
                        v4 = v8 + 1;
                        v10 = arm64g_calculate_condition(49, v8, 1, 0);
                        if (!(v10 & 1))
                            break;
                    }
                }
            }
        }
        *(unsigned int *)&a0[48] = v2;
        *(unsigned int *)&a0[56] = 0;
        return a0;
    }
}
