/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bb98..0x97bc6c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97bb98_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[72];
    char field_58;
} st_97bb98_0;

typedef struct st_97bb98_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[16];
    unsigned long long field_20;
    char padding_28[40];
    struct st_97bb98_0 *field_50;
    char field_58;
} st_97bb98_1;


unsigned long long sub_97bb98(st_97bb98_1 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v0;  // 4102
    unsigned long long v1;  // 4102
    unsigned long long v10;  // x11
    unsigned long long v11;  // 4112
    unsigned long long v12;  // x8
    unsigned long long v2;  // w9
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x10
    unsigned long long v7;  // x11
    st_97bb98_0 *v8;  // x9
    unsigned long long v9;  // x10

    if (!*((char *)&a0[1].field_0 + 2) && !a0->field_50)
        return 0;
    if (*((char *)&a0[1].field_0 + 1))
    {
        if (a2)
        {
            v0 = arm64g_calculate_condition(4, a0->field_20, a1, 0);
            if (v0 & 1)
                goto LABEL_97bbc8;
        }
        else
        {
            v1 = arm64g_calculate_condition(52, a0->field_20, a1, 0);
            if (!(v1 & 1))
            {
LABEL_97bbd8:
                v2 = 0;
LABEL_97bbdc:
                v3 = a0->field_20;
                v4 = a1 - v3;
                if (a1 > v3)
                {
                    a0->field_20 = a1;
                    v5 = a0->field_8;
                    v6 = a0->field_0 - v5;
                    v7 = v4;
                    if (v4 > v6)
                    {
                        a0->field_58 = 3;
                        v7 = v6;
                    }
                    a0->field_8 = v7 + v5;
                    v8 = a0->field_50;
                    if (!v8)
                        return 1;
                    v9 = v8->field_8;
                    v10 = v8->field_0 - v9;
                    if (v4 > v10)
                    {
                        v8->field_58 = 3;
                        v4 = v10;
                    }
                    v8->field_8 = v4 + v9;
                    return 1;
                }
                else
                {
                    v11 = arm64g_calculate_condition(52, a1, v3, 0);
                    if (v11 & 1)
                        v12 = v2 ^ 1;
                    else
                        v12 = 1;
                    if (v12 & 1)
                        return 1;
                }
            }
        }
        a0->field_58 = 6;
        return 1;
    }
    if (!a2)
        goto LABEL_97bbd8;
LABEL_97bbc8:
    v2 = 1;
    *((char *)&a0[1].field_0 + 1) = 1;
    goto LABEL_97bbdc;
}
