/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991254..0x991384 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991254_0 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char padding_9[20];
    char field_1d;
    char padding_1e[34];
    unsigned long long field_40;
    unsigned long long field_48;
} st_991254_0;


unsigned long long sub_991254(unsigned long a0, st_991254_0 *a1)
{
    unsigned long v0;  // x8
    unsigned int v1;  // w9
    unsigned long long v10;  // x0
    unsigned long long v11;  // x10
    unsigned long long v12;  // 4133
    unsigned long long v13;  // x9
    unsigned int v14;  // x10
    unsigned long long v15;  // x8
    unsigned int v16;  // x8
    unsigned long v2;  // x10
    unsigned long v3;  // cc_dep1
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4150
    unsigned int v9;  // w11

    v0 = a1->field_0;
    if (v0 >> 14 & 1)
        return 0;
    v1 = (unsigned int)v0 & 0xff;
    v2 = a1->field_8;
    v3 = v1;
    if (v1 == 5)
    {
        if (v2 == a0)
        {
            v4 = arm64g_calculate_condition(3, v3, 5, 0);
            v5 = arm64g_calculate_condition(132, (v4 & 1 ? a0 : 0x20000000), (v4 & 1 ? 20 : 0), 0);
            if (v5 & 1)
                return 0;
        }
        else
        {
            v6 = arm64g_calculate_condition(3, v3, 5, 0);
            v7 = arm64g_calculate_condition(128, (v6 & 1 ? a0 : 0x20000000), (v6 & 1 ? 20 : 0), 0);
            if (v7 & 1)
                return 0;
        }
        v8 = arm64g_calculate_condition(49, (__ROL__((unsigned int)v0, 22) & 0xffc0000f & 15) - 5, 4, 0);
        if (!(v8 & 1))
            return (unsigned int)a0 + (__ROL__((unsigned int)v0, 22) & 0xffc0000f & 15) + 1;
        return 0;
    }
    else if (20 >= (unsigned int)v2)
    {
        v9 = a1->field_1d;
        if (v9 > 20)
            return 0;
        v10 = (unsigned int)v2 + v9 + 7;
        if (((unsigned int)v0 & 253) != 4)
        {
            v11 = (v0 * 0x40000000000000 | v0 >> 10) & 0xffc000000000000f & 15;
            v12 = arm64g_calculate_condition(49, (unsigned int)v11 - 5, 4, 0);
            if (v12 & 1)
                return 0;
            v10 += v11;
            if (v1 != 1)
                goto LABEL_991334;
        }
        else if (v1 != 1)
        {
            return v10;
        }
        v13 = a1->field_40;
        if (64 > v13)
        {
            v14 = 1;
        }
        else if (0x4000 > v13)
        {
            v14 = 2;
        }
        else if (v13 <= 0x3fffffff)
        {
            v14 = 4;
        }
        else
        {
            if (v13 > 0x3fffffffffffffff)
                return 0;
            v14 = 8;
        }
        v10 = v13 + v10 + v14;
LABEL_991334:
        v15 = a1->field_48 + ((v0 * 0x40000000000000 | v0 >> 10) & 0xffc000000000000f & 15);
        if (64 > v15)
        {
            v16 = 1;
        }
        else if (0x4000 > v15)
        {
            v16 = 2;
        }
        else if (v15 <= 0x3fffffff)
        {
            v16 = 4;
        }
        else
        {
            if (v15 > 0x3fffffffffffffff)
                return 0;
            v16 = 8;
        }
        return v16 + v10;
    }
    else
    {
        return 0;
    }
}
