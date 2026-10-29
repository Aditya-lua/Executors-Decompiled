/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc25730..0xc258a8 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c25730_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    struct st_c25730_1 *field_20;
    unsigned long long field_28;
} st_c25730_0;

typedef struct st_c25730_1 {
    unsigned long long field_0;
} st_c25730_1;


long long sub_c25730(st_c25730_0 *a0)
{
    long long v2;  // x21
    unsigned long v3;  // x23
    unsigned long long v4;  // x23
    unsigned long long *v5;  // x21
    unsigned long v6;  // x23
    unsigned long long v7;  // 4115
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0->field_10 + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 32;
        sub_c2aa10();
        v3 = v4;
    }
    if (a0->field_0)
        v2 = _free(a0->field_8);
    v5 = a0->field_20;
    if (a0->field_28)
    {
        v6 = a0->field_28 - 1;
        do
        {
            if (*v5 != 0x8000000000000000)
                v2 = sub_c2a8d0(v5);
        } while ((v6 -= 1, v5 += 6, v7 = arm64g_calculate_condition(2, v6, 1, 0), !(v7 & 1)));
    }
    if (!a0->field_18)
        return v2;
    return _free();
}
