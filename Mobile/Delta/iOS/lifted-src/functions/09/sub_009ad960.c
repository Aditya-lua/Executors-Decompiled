/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad960..0x9ada10 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ad960_0 {
    char padding_0[264];
    unsigned long long field_108;
    unsigned long long field_110;
    char padding_118[984];
    struct st_9ad960_1 *field_4f0;
} st_9ad960_0;

typedef struct st_9ad960_1 {
    char padding_0[320];
    unsigned long long field_140;
    char padding_148[16];
    unsigned long long field_158;
} st_9ad960_1;


unsigned long long sub_9ad960(st_9ad960_0 *a0, long long a1, unsigned int a2)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x9
    unsigned long long *v5;  // x10
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a2 != 0x101)
    {
        v3 = sub_a6e970(a1);
        if (!(unsigned int)v3)
            return v3;
    }
    if (!sub_c68ecc(a1, &v0))
    {
        return 0;
    }
    else if (v0 <= 0x7fffffff)
    {
        if (a2 != 0x101)
        {
            v4 = v0 - 12;
            v5 = a0->field_4f0;
            v5[40] = v4;
            v5[43] = v4;
            a0->field_108 = v0;
            a0->field_110 = 0;
            if (a2 == 3)
                return 1;
        }
        else
        {
            a0->field_108 = v0;
            a0->field_110 = 0;
        }
        v6 = sub_c65a2c(a0, a2 == 0x101);
        if (!(unsigned int)v6)
            return v6;
        return 1;
    }
    else
    {
        return 0;
    }
}
