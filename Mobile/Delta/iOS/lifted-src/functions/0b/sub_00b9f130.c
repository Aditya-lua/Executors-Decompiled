/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9f130..0xb9f1a4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9f130_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_b9f130_0;


unsigned long long sub_b9f130(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x21
    unsigned long long i;  // x0
    st_b9f130_0 *v4;  // x22
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    for (i = a0; v2 != a1; i = _free(v4->field_10))
    {
        v4 = a0 + v2 * 32;
        v2 += 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
            i = sub_b86a90(v4->field_0);
        }
    }
    return i;
}
