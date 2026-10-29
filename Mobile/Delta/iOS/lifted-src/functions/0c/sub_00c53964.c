/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc53964..0xc539d8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c53964_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
} st_c53964_0;


unsigned long long sub_c53964(long long a0)
{
    unsigned long long v4;  // x0
    st_c53964_0 *v5;  // x8
    unsigned long long v6;  // 4102
    unsigned long v0;  // [bp-0x38]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    while (1)
    {
        v4 = sub_c537dc(&v0, a0);
        if (!v0)
            break;
        v5 = v0 + v1 * 16;
        if (v5->field_0 == 82)
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v6 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v6 & 1))
            {
                /* unsupported instruction */;
                sub_c53420(v5->field_8);
            }
        }
    }
    return v4;
}
