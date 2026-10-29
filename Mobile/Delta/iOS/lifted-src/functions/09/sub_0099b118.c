/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99b118..0x99b1e4 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99b118_1 {
    unsigned int field_0;
    char padding_4[212];
    struct st_99b118_0 *field_d8;
} st_99b118_1;

typedef struct st_99b118_2 {
    char padding_0[24];
    struct st_99b118_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
} st_99b118_2;

typedef struct st_99b118_0 {
    char padding_0[80];
    unsigned int field_50;
} st_99b118_0;


unsigned int sub_99b118(st_99b118_2 *a0, unsigned long long a1, unsigned long long a2, int a3)
{
    unsigned long v0;  // cc_dep1
    unsigned long v1;  // x8
    unsigned int v2;  // w9
    unsigned int v3;  // w9
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4105
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4105
    unsigned int v8;  // w10

    v0 = (unsigned int)a2 & (unsigned int)a1;
    if (!((unsigned int)a2 & (unsigned int)a1))
        return 0;
    v1 = a0->field_18->field_d8->field_50;
    if ((unsigned int)a2 & 0x800 || (unsigned int)v1 & 8)
    {
        v2 = ((unsigned int)a2 * 0x200000 | (unsigned int)a2 >> 11) & 0xffe00001 & 1;
        if (!(a1 >> 2 & 1) || !((unsigned int)v1 & 8) & (unsigned int)a2 >> 11)
            goto LABEL_99b16c;
    }
    else
    {
        v3 = a0->field_18->field_0;
        if (0x303 < (int)v3)
        {
            v4 = arm64g_calculate_condition(201, v0, 0, 0);
            v5 = arm64g_calculate_condition(3, (v4 & 1 ? v3 : 0x40000000), (v4 & 1 ? 0x10000 : 0), 0);
            v2 = !(v5 & 1);
        }
        else
        {
            v6 = arm64g_calculate_condition(201, v0, 0, 0);
            v7 = arm64g_calculate_condition(0, (v6 & 1 ? v3 : 0x40000000), (v6 & 1 ? 0x10000 : 0), 0);
            v2 = !(v7 & 1);
        }
LABEL_99b16c:
        if ((a1 >> 3 & 1 || a0->field_48 != 0x300) && !(v2 & 1 & (unsigned int)a1 >> 4 & 1))
        {
            if ((unsigned int)a1 & 32)
                v8 = ((unsigned int)a2 * 0x2000000 | (unsigned int)a2 >> 7) & 4261412865 & 1;
            else
                v8 = 1;
            if ((v8 | v2) == 1)
            {
                if (!*(int *)&a0[1].padding_20[12])
                    v2 = 1;
                if ((!(a1 >> 5 & 1) || v2) && (!(a1 >> 6 & 1) || !a0[16].field_48))
                {
                    if (!(a1 >> 5 & 1))
                    {
                        return 1;
                    }
                    else if (!(a2 >> 7 & 1))
                    {
                        return 1;
                    }
                    else if (a3 < 772)
                    {
                        return 0;
                    }
                    else if (v1 >> 3 & 1)
                    {
                        return 0;
                    }
                    else
                    {
                        return 1;
                    }
                }
            }
        }
    }
    return 0;
}
