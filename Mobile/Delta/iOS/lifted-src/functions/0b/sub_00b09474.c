/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb09474..0xb095a8 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b09474_0 {
    char padding_0[108];
    char field_6c;
} st_b09474_0;


unsigned long long sub_b09474(st_b09474_0 *a0, unsigned long a1, unsigned long long *a2, unsigned long long a3, unsigned long a4, unsigned long long a5)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // w8
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // 4102
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a5 < 16)
    {
        return 0;
    }
    else if (a3 < a5)
    {
        return 0;
    }
    else if (a1)
    {
        v2 = a0->field_6c;
        if (v2 >> 4 & 1)
            return 0;
        v3 = *(int *)&a0->padding_0[104];
        v4 = v3;
        if (!(v2 >> 1 & 1))
        {
            v5 = arm64g_calculate_condition(3, v4, 2, 0);
            if (v5 & 1)
            {
                v6 = sub_b09a34();
            }
            else if (v3 == 1)
            {
                v6 = sub_b099ec();
            }
            else if (!v3)
            {
                v6 = sub_b097f4();
            }
            else
            {
                return 0;
            }
        }
        else
        {
            v7 = arm64g_calculate_condition(3, v4, 2, 0);
            if (v7 & 1)
            {
                v6 = sub_b096d4();
            }
            else if (v3 == 1)
            {
                v6 = sub_b0968c();
            }
            else if (!v3)
            {
                v6 = sub_b095a8();
            }
            else
            {
                return 0;
            }
        }
        if (!v6)
            return 0;
        a0->field_6c = a0->field_6c | 16;
        *a2 = v6;
        return 1;
    }
    else
    {
        *a2 = a5;
        return 1;
    }
}
