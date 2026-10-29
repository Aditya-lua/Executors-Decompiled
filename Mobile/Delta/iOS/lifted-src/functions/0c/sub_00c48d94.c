/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc48d94..0xc48e44 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c48d94_0 {
    char padding_0[16];
    unsigned long long field_10;
    long long field_18;
    char padding_20[8];
    long long field_28;
} st_c48d94_0;


unsigned long long sub_c48d94(st_c48d94_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // 4106
    unsigned long long v4;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c54460(a0->field_28);
    if (a0->field_10)
        v2 = _free(a0->field_18);
    v3 = arm64g_calculate_condition(2, a0, 1, 0);
    if (v3 & 1)
        return v2;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v4 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v4 & 1)
        return v2;
    /* unsupported instruction */;
    return _free();
}
