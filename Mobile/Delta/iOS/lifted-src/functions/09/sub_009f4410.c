/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4410..0x9f4488 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4410_0 {
    char padding_0[8];
    struct st_9f4410_1 *field_8;
} st_9f4410_0;

typedef struct st_9f4410_1 {
    unsigned short field_0;
} st_9f4410_1;


char * sub_9f4410(st_9f4410_0 *a0, char *a1)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x11
    char *v10;  // x8
    unsigned long long v11;  // x11
    unsigned long v12;  // x12
    unsigned long v2;  // x8
    unsigned long v3;  // cc_dep1
    unsigned int v4;  // w8
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    char *v9;  // x8

    v0 = *a1;
    if (!(v0 >> 31 & 1))
    {
        v1 = v0 & 0xff;
        while (1)
        {
            v2 = *(short *)&a0->field_8[v1];
            if (!(v2 >> 5 & 1))
            {
                v3 = (unsigned int)v2 & 775;
                if (!((unsigned int)v2 & 775))
                {
                    v4 = (unsigned int)v2 & 0x1000;
                    if ((int)a0[1].field_8)
                    {
                        v5 = arm64g_calculate_condition(25, v3, 0, 0);
                        v6 = arm64g_calculate_condition(19, (v5 & 1 ? v4 : 0x40000000), 0, 0);
                        if (!(v6 & 1))
                            break;
                    }
                    else
                    {
                        v7 = arm64g_calculate_condition(25, v3, 0, 0);
                        v8 = arm64g_calculate_condition(16, (v7 & 1 ? v4 : 0x40000000), 0, 0);
                        if (!(v8 & 1))
                            break;
                    }
                }
                v9 = a1 + 1;
            }
            else
            {
                v10 = a1;
                v11 = v10[1];
                v9 = v10 + 1;
                if ((long long)v11 < 0 || !((unsigned short)(*(short *)&a0->field_8[v11]) >> 3 & 1))
                    v9 = a1 + 2;
            }
            v12 = *v9;
            v1 = v12 & 0xff;
            a1 = v9;
            if (v12 >> 31 & 1)
                return v9;
        }
    }
    return a1;
}
