/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe7514..0xbe75e0 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_be7514(unsigned long long *a0)
{
    unsigned long long i;  // x20
    long long *v3;  // x24
    unsigned long long v4;  // 4102
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 0;
    while (i != (a0[3] - a0[1] >> 3) * 12297829382473034411)
    {
        v3 = a0[1] + 24 * i;
        i += 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v4 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v4 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*v3);
        }
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
            sub_b86a90(v3[2]);
        }
    }
    if (!a0[2])
        return;
}
