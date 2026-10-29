/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4c6d8..0xc4c7a4 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4c6d8_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_c4c6d8_0;


unsigned long long sub_c4c6d8(st_c4c6d8_0 **a0)
{
    st_c4c6d8_0 *v2;  // x19
    unsigned long long v3;  // 4102
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4106
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (v2->field_100)
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v3 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v3 & 1))
        {
            /* unsupported instruction */;
            sub_c4c6d8(&v2->field_100);
        }
    }
    v4 = sub_c53720(v2 + 1);
    v5 = arm64g_calculate_condition(2, v2, 1, 0);
    if (v5 & 1)
        return v4;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v6 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v6 & 1)
        return v4;
    /* unsupported instruction */;
    return _free();
}
