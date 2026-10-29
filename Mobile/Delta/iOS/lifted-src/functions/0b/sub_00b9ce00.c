/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9ce00..0xb9ce70 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9ce00_0 {
    long long field_0;
    unsigned long long field_8;
} st_b9ce00_0;


st_b9ce00_0 * sub_b9ce00(st_b9ce00_0 *a0)
{
    unsigned long long v2;  // 4102
    st_b9ce00_0 *v3;  // x0
    unsigned long long v4;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    v3 = a0;
    if (!(v2 & 1))
    {
        /* unsupported instruction */;
        v3 = sub_b86a90(a0->field_0);
    }
    if (!a0->field_8)
        return v3;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v4 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v4 & 1)
        return v3;
    /* unsupported instruction */;
    return sub_b86a90();
}
