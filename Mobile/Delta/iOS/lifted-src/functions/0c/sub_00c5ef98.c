/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5ef98..0xc5f0e0 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5ef98_0 {
    char field_0;
} st_c5ef98_0;


unsigned long long sub_c5ef98(st_c5ef98_0 **a0, char a1)
{
    unsigned int v0;  // w9
    char *v1;  // x9
    char *v10;  // x9
    char *v11;  // x9
    unsigned long v2;  // cc_dep1
    unsigned long long v3;  // w10
    char *v4;  // x11
    unsigned long v5;  // x12
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4111
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4111

    v0 = a1;
    if (15 < v0)
        return 1;
    if ((int)v0 > 3)
    {
        if ((int)v0 <= 9)
        {
            if (v0 != 4)
            {
                v2 = v0;
                if (v0 != 9)
                    return 1;
                v3 = 0;
                v4 = *a0;
                do
                {
                    v5 = *v4;
                    v4 += 1;
                    v3 += 7;
                } while (v5 >> 7 & 1);
                *a0 = v4;
                if (64 <= (unsigned int)v5)
                {
                    v6 = arm64g_calculate_condition(35, v2, 9, 0);
                    v7 = arm64g_calculate_condition(131, (v6 & 1 ? v3 : 0x20000000), (v6 & 1 ? 63 : 0), 0);
                    if (!(v7 & 1))
                        return 0;
                }
                else
                {
                    v8 = arm64g_calculate_condition(35, v2, 9, 0);
                    v9 = arm64g_calculate_condition(128, (v8 & 1 ? v3 : 0x20000000), (v8 & 1 ? 63 : 0), 0);
                    if (!(v9 & 1))
                        return 0;
                }
                return 0;
            }
            goto LABEL_c5f098;
        }
        else if (v0 == 10)
        {
            v1 = *a0 + 2;
        }
        else if (v0 != 11)
        {
            if (v0 != 12)
                return 1;
LABEL_c5f098:
            v1 = *a0 + 8;
        }
        else
        {
            v1 = *a0 + 4;
        }
    }
    else
    {
        if (1 >= (int)v0)
        {
            if (!v0)
                goto LABEL_c5f098;
            if (v0 != 1)
                return 1;
            v10 = *a0;
            do
            {
                v11 = v10;
                v1 = v11 + 1;
                v10 = v1;
            } while ((char)*v11 < 0);
        }
        else if (v0 == 2)
        {
            v1 = *a0 + 2;
        }
        else if (v0 == 3)
        {
            v1 = *a0 + 4;
        }
        else
        {
            return 1;
        }
    }
    *a0 = v1;
    return 0;
}
