/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d397c..0x9d3adc (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

unsigned long long sub_9d397c(long long a0, unsigned long long a1, unsigned long long a2, char *a3, unsigned long long a4)
{
    unsigned long v4;  // x26
    unsigned long long v5;  // 4110
    unsigned long long v6;  // w27
    char *v7;  // x28
    unsigned long long i;  // x23
    unsigned long long v9;  // x23
    unsigned long long v0;  // [bp-0x70], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a4 - 1;
    if (a4 < 1)
        return 1;
    v5 = arm64g_calculate_condition(3, a4, 1, 0);
    if (!(v5 & 1))
    {
        v0 = *a3;
        sub_9d524c(a0, "%02X:");
        if (a2 > 1)
        {
            v6 = 1;
            if ((unsigned int)v4 != 1)
                goto LABEL_9d3a60;
        }
        else
        {
            sub_9d524c(a0, "\n");
            v6 = 0;
            if ((unsigned int)v4 != 1)
            {
LABEL_9d3a60:
                v7 = a3 + 1;
                i = v4 - 1;
                do
                {
                    v9 = i;
                    if (!v6)
                    {
                        v0 = a1;
                        v1 = &g_c7c2eb;
                        sub_9d524c(a0, "%*s");
                    }
                    v0 = *v7;
                    sub_9d524c(a0, "%02X:");
                    v6 += 1;
                    if (v6 >= a2)
                    {
                        sub_9d524c(a0, "\n");
                        v6 = 0;
                    }
                    v7 += 1;
                    i = v9 - 1;
                } while (i);
            }
        }
        if (!v6)
        {
            v0 = a1;
            v1 = &g_c7c2eb;
            sub_9d524c(a0, "%*s");
        }
    }
    v0 = a3[v4 & 0xffffffff];
    sub_9d524c(a0, "%02X");
    return 1;
}
