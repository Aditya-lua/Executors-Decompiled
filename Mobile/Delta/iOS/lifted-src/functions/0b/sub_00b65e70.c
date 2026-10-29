/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb65e70..0xb65f80 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b65e70_0 {
    char padding_0[16];
    unsigned long long field_10;
    struct st_b65e70_1 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
} st_b65e70_0;

typedef struct st_b65e70_1 {
    long long field_0;
} st_b65e70_1;


unsigned long long sub_b65e70(st_b65e70_0 *a0)
{
    unsigned long long v2;  // x22
    unsigned long v3;  // x22
    unsigned long v4;  // x22
    unsigned long long v5;  // 4102
    unsigned long long v6;  // x20
    unsigned long v7;  // x23
    long long v8;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_40 >= 1)
        _free(a0->field_48);
    v2 = 0;
    while (1)
    {
        v3 = v2;
        if (v3 == a0->field_20)
            break;
        v4 = v3 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v2 = v4;
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)&a0->field_18[v3]);
            v2 = v4;
        }
    }
    if (a0->field_10)
        _free(a0->field_18);
    v6 = a0->field_30;
    v7 = a0->field_38 + 1;
    while (1)
    {
        v8 = v7 - 1;
        if (v7 == 1)
            break;
        v6 += 264;
        sub_bfe1e8();
        v7 = v8;
    }
    if (!a0->field_28)
        return v6;
    return _free();
}
