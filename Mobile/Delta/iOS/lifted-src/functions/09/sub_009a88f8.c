/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a88f8..0x9a8a20 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a88f8_1 {
    int field_0;
    char padding_4[212];
    struct st_9a88f8_0 *field_d8;
} st_9a88f8_1;

typedef struct st_9a88f8_2 {
    char padding_0[24];
    struct st_9a88f8_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[96];
    unsigned int field_ac;
    char padding_b0[2328];
    unsigned int field_9c8;
} st_9a88f8_2;

typedef struct st_9a88f8_0 {
    char padding_0[80];
    char field_50;
} st_9a88f8_0;


unsigned long long sub_9a88f8(st_9a88f8_2 *a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x9
    char v2;  // x10
    unsigned long long v3;  // 4105
    unsigned long long v5;  // 4105

    v0 = a0->field_ac;
    if (9 >= (int)v0)
    {
        if (5 >= (int)v0)
        {
            if (v0 - 4 >= 2)
            {
                v1 = 258;
                v2 = 65607;
                if (v0 != 3)
                    v2 = 0;
                v3 = arm64g_calculate_condition(3, v0, 2, 0);
                if (!(v3 & 1))
                    return v2;
            }
            else
            {
                return *(long long *)&a0->field_9c8;
            }
        }
        else
        {
            if (v0 == 6)
            {
                return 0x4000;
            }
            else if (v0 == 7)
            {
                return 0x19000;
            }
            else if (v0 == 8)
            {
                return *(long long *)&a0->field_9c8;
            }
            else
            {
                return 0;
            }
        }
    }
    else
    {
        if (41 < (int)v0)
        {
            v1 = 20000;
            v2 = 1;
            if (v0 != 49)
                v2 = 0;
            if (v0 == 43)
                v2 = (char)"RL";
            v5 = arm64g_calculate_condition(3, v0, 42, 0);
            if (!(v5 & 1))
                return v2;
        }
        else if (v0 != 10)
        {
            if (v0 != 11)
            {
                if (v0 == 12)
                    return 64;
                return 0;
            }
            else
            {
                if (a0->field_48 == 0x100)
                    return 3;
                return 1;
            }
        }
        else
        {
            if (a0->field_18->field_d8->field_50 >> 3 & 1)
            {
                return "\"";
            }
            else if (a0->field_18->field_0 < 772)
            {
                return "\"";
            }
            else if (a0->field_18->field_0 == 0x10000)
            {
                return "\"";
            }
            else
            {
                return 131338;
            }
        }
    }
    return v1;
}
