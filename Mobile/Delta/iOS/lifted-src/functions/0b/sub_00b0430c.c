/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0430c..0xb0438c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0430c_0 {
    char padding_0[4];
    char field_4;
} st_b0430c_0;


long long sub_b0430c(st_b0430c_0 *a0, char a1, long long a2, unsigned long a3)
{
    char v2;  // w0
    unsigned long v3;  // cc_dep1
    unsigned long v4;  // cc_dep2
    unsigned long long v5;  // 4109
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2)
    {
        if (a1)
        {
            if (!(a0->field_4 & 1))
                v2 = sub_a97e54(&a0[4].field_4, a2, a1);
            else
                v2 = sub_a97c40(&a0[4].field_4, a2, a1);
            return v2 > 0;
        }
        v3 = sub_a97b68(&a0[4].field_4, a2, /* unsupported instruction */) & 0xffffffff;
        v4 = 1;
    }
    else
    {
        v3 = sub_a97f60(&a0[4].field_4) & 0xffffffff;
        v4 = 0;
    }
    v5 = arm64g_calculate_condition(19, v3, v4, 0);
    return !(v5 & 1);
}
