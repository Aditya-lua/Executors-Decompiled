/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd2720..0xbd2788 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd2720_0 {
    char padding_0[272];
    long long field_110;
} st_bd2720_0;


unsigned long long sub_bd2720(long long a0)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4102
    st_bd2720_0 *v0;  // [bp-0x38], Other Possible Types: char
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    while (1)
    {
        v4 = sub_bd04ac(&v0, a0);
        if (!v0)
            break;
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
            sub_b86a90((&v0->field_110)[v1]);
        }
    }
    return v4;
}
