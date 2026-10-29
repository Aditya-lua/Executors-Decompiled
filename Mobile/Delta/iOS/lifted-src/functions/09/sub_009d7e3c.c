/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d7e3c..0x9d7f24 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d7e3c_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_9d7e3c_0;


unsigned long long sub_9d7e3c(st_9d7e3c_0 *a0, long long a1)
{
    long long v2;  // x8
    unsigned long v3;  // cc_dep1
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // x0
    unsigned long long v9;  // x8
    unsigned long long v10;  // x22
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        v2 = a0->field_8;
        v3 = v2;
        if (v2 == a1)
            return 1;
        if ((unsigned long long)a1 < (unsigned long long)v2)
        {
            v4 = arm64g_calculate_condition(132, v3, a1, 0);
            v5 = arm64g_calculate_condition(20, (v4 & 1 ? a0->field_10 : 0x40000000), 0, 0);
            if (v5 & 1)
                return 0;
        }
        else
        {
            v6 = arm64g_calculate_condition(132, v3, a1, 0);
            v7 = arm64g_calculate_condition(16, (v6 & 1 ? a0->field_10 : 0x40000000), 0, 0);
            if (v7 & 1)
                return 0;
        }
        v8 = sub_a6c1b4();
        if (!v8)
            return v8;
        if (a0->field_10)
        {
            v9 = a0->field_20;
            if (v9 >= a0->field_18)
            {
                v10 = a1 - a0->field_8;
                _memmove(v8 + v9 + v10, v8 + v9, a0->field_8 - v9);
                a0->field_20 = a0->field_20 + v10;
            }
        }
        else
        {
            a0->field_18 = 0;
            a0->field_20 = 0;
        }
        a0->field_0 = v8;
        a0->field_8 = a1;
        return 1;
    }
    else
    {
        v11 = sub_a6bf4c(a1, "crypto/bio/bss_dgram_pair.c", 37);
        a0->field_0 = v11;
        if (!v11)
            return v11;
        a0->field_8 = a1;
        a0->field_10 = 0;
        a0->field_18 = 0;
        a0->field_20 = 0;
        return 1;
    }
}
