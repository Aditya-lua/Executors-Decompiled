/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d3e8..0x95d474 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95d3e8_0 {
    char padding_0[120];
    unsigned long long field_78;
} st_95d3e8_0;

typedef struct st_95d3e8_1 {
    char padding_0[344];
    struct st_95d3e8_0 *field_158;
} st_95d3e8_1;

typedef struct st_95d3e8_2 {
    char padding_0[24];
    struct st_95d3e8_1 *field_18;
    struct st_95d3e8_3 *field_20;
} st_95d3e8_2;

typedef struct st_95d3e8_3 {
    unsigned int field_0;
} st_95d3e8_3;


unsigned long long sub_95d3e8(st_95d3e8_2 *a0, unsigned long long a1)
{
    unsigned long v2;  // x8
    unsigned int *v3;  // x0
    unsigned long v4;  // x8
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18)
    {
        v2 = &a0->field_18->field_158;
    }
    else
    {
        v3 = a0->field_20;
        if (!v3)
            return 1;
        v4 = *v3;
        if ((unsigned int)v4)
        {
            if (!(v4 >> 7 & 1))
                return 0;
            v3 = sub_980dc8();
            if (!v3)
                return v3;
        }
        v2 = v3 + 544;
    }
    if (!*(long long *)(*(long long *)v2 + 120))
    {
        v5 = sub_af27d8(0);
        *(unsigned long long *)(*(long long *)v2 + 120) = v5;
        if (!v5)
            return v5;
    }
    if (!a1)
        return 1;
    v6 = sub_af25a0();
    if (!(unsigned int)v6)
        return v6;
    return 1;
}
