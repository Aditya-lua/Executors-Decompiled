/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc40714..0xc40784 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c40714_1 {
    char padding_0[24];
    struct st_c40714_0 *field_18;
    struct st_c40714_0 *field_20;
    long long field_28;
} st_c40714_1;

typedef struct st_c40714_0 {
    struct st_c40714_0 *field_0;
} st_c40714_0;


unsigned long long sub_c40714(st_c40714_1 *a0)
{
    st_c40714_0 **v2;  // x8
    unsigned long long v3;  // x0
    unsigned long long v4;  // 4106
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18)
    {
        v2 = a0->field_20;
        *(char *)&a0->field_18->field_0 = 0;
        if (v2)
            _free();
    }
    v3 = _dispatch_release(a0->field_28);
    v4 = arm64g_calculate_condition(2, a0, 1, 0);
    if (v4 & 1)
        return v3;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v5 & 1)
        return v3;
    /* unsupported instruction */;
    return _free();
}
