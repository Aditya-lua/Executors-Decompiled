/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d474..0x95d544 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95d474_1 {
    char padding_0[120];
    unsigned long long field_78;
} st_95d474_1;

typedef struct st_95d474_0 {
    unsigned int field_0;
    char padding_4[2172];
    struct st_95d474_1 *field_880;
} st_95d474_0;

typedef struct st_95d474_2 {
    char padding_0[344];
    struct st_95d474_1 *field_158;
} st_95d474_2;

typedef struct st_95d474_3 {
    char padding_0[24];
    struct st_95d474_2 *field_18;
    struct st_95d474_0 *field_20;
} st_95d474_3;


unsigned long long sub_95d474(st_95d474_3 *a0, unsigned long long a1)
{
    st_95d474_1 *v2;  // x21
    st_95d474_0 *v3;  // x0
    unsigned long v4;  // x9
    st_95d474_0 *v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18)
    {
        v2 = a0->field_18->field_158;
LABEL_95d490:
        v6 = v2->field_78;
        if (!v2->field_78)
            goto LABEL_95d4a0;
    }
    else
    {
        v3 = a0->field_20;
        if (!v3)
            return 1;
        v4 = v3->field_0;
        if ((unsigned int)v4)
        {
            if (!(v4 >> 7 & 1))
                return 0;
            v3 = sub_980dc8();
            if (!v3)
                return v3;
            v5 = a0->field_20;
        }
        else
        {
            v5 = v3;
        }
        v2 = v3->field_880;
        if (*(long long *)&v5->padding_4[4])
            goto LABEL_95d490;
        v6 = v2->field_78;
        if (!v2->field_78)
        {
LABEL_95d4a0:
            v7 = sub_af27d8(v6);
            v2->field_78 = v7;
            if (!v7)
                return v7;
        }
    }
    if (!a1)
        return 1;
    v8 = sub_af252c();
    if (!(unsigned int)v8)
        return v8;
    return 1;
}
