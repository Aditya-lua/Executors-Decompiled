/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfb15c..0xbfb22c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_bfb15c(unsigned long a0)
{
    unsigned long long v2;  // 4102
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_bf9d34();
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (!(v2 & 1))
    {
        /* unsupported instruction */;
        sub_b869ec();
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v3 & 1)
        return;
    /* unsupported instruction */;
    sub_b869ec();
    return;
}
