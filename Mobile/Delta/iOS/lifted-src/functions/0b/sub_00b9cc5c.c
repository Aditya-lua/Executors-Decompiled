/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9cc5c..0xb9cd0c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b9cc5c(unsigned long long *a0)
{
    unsigned long long i;  // x20
    long long *v3;  // x23
    unsigned long long v4;  // 4102
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 0;
    while (i != a0[2])
    {
        v3 = a0[1] + i * 16;
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
            sub_b86a90(v3[1]);
        }
    }
    if (!*a0)
        return;
}
