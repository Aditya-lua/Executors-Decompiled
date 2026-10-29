/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9862fc..0x986440 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9862fc_0 {
    char padding_0[44];
    unsigned int field_2c;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
} st_9862fc_0;


unsigned long long sub_9862fc(st_9862fc_0 *a0, unsigned long a1)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x19
    unsigned long long v13;  // x0
    unsigned long long v5;  // 4106
    unsigned long long v6;  // x0
    unsigned long long v7;  // x22
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long long v10;  // x23
    unsigned long long v11;  // x10
    unsigned long long v12;  // x21
    char v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9880e0();
    if (!(unsigned int)v3)
        return v3;
    v4 = a0->field_48;
    if (a1 > a0->field_48 - a0->field_40)
    {
        v5 = arm64g_calculate_condition(2, a1, 1, 0);
        if (!(v5 & 1))
            return 0;
    }
    else
    {
        v4 = a0->field_40 + a1;
    }
    v6 = sub_c63580(a0, v4);
    if (!(unsigned int)v6)
        return v6;
    if (v4)
    {
        v7 = v4 - 1;
        if (v7 <= 0x3fffffffffffffff)
        {
            if (a0->field_2c)
            {
                v8 = a0->field_58;
                if (v8)
                {
                    v9 = a0->field_68;
                    if (v7 > v9)
                    {
                        v10 = v9 - v8 * v9 / v8;
                        v11 = a0->field_60;
                        if (v7 < a0->field_60)
                            v11 = v4;
                        v12 = v11 - v9;
                        if (v12 > v8 - v10)
                        {
                            sub_a66ec0(a0->field_50 + v10);
                            v12 = v12 + v10 - a0->field_58;
                            v10 = 0;
                        }
                        if (v12)
                            sub_a66ec0(a0->field_50 + v10, v12);
                    }
                }
            }
            a0->field_68 = v4;
            if (v7 >= a0->field_60)
                a0->field_60 = v4;
        }
    }
    if (!a0->field_30)
        return 1;
    if (a0->field_38)
        sub_989228(a0->field_38, &v0);
    v13 = sub_97bc6c();
    if (!(unsigned int)v13)
        return v13;
    return 1;
}
