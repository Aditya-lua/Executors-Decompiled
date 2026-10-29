/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991384..0x991444 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991384_0 {
    char field_0;
    char field_1;
    char padding_2[3];
    char field_5;
} st_991384_0;


unsigned long long sub_991384(st_991384_0 *a0, unsigned long long a1, unsigned long long a2, char *a3)
{
    unsigned long v3;  // x9
    unsigned long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long long v10;  // x8
    unsigned long long v11;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a1 < 7)
    {
        return 0;
    }
    else if (20 >= a2)
    {
        v3 = a0->field_0;
        v4 = (unsigned int)v3 & 0xff;
        if (!(v3 >> 31 & 1))
        {
            v5 = a2 + 21;
            if (64 <= (unsigned int)v4)
            {
                v6 = arm64g_calculate_condition(36, a2, 20, 0);
                v7 = arm64g_calculate_condition(148, (v6 & 1 ? v5 : 0x20000000), (v6 & 1 ? a1 : 0), 0);
                if (!(v7 & 1))
                    return 0;
            }
            else
            {
                v8 = arm64g_calculate_condition(36, a2, 20, 0);
                v9 = arm64g_calculate_condition(144, (v8 & 1 ? v5 : 0x20000000), (v8 & 1 ? a1 : 0), 0);
                if (!(v9 & 1))
                    return 0;
            }
            v10 = 1;
        }
        else
        {
            if (a0->field_1 || a0->padding_2[0] || a0->padding_2[1])
            {
                if (!(v4 >> 6 & 1))
                    return 0;
            }
            else
            {
                if (!(v4 >> 6 & 1) && a0->padding_2[2])
                    return 0;
            }
            a2 = a0->field_5;
            if (20 < a2)
            {
                return 0;
            }
            else if (a1 >= a2 + 7)
            {
                v10 = 6;
            }
            else
            {
                return 0;
            }
        }
        v0 = &v2;
        v1 = v11;
        *a3 = a2;
        _memcpy(a3 + 1, &(&a0->field_0)[v10]);
        return 1;
    }
    else
    {
        return 0;
    }
}
