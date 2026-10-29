/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfcd8c..0xbfcde4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_bfcd8c(unsigned long long *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // 4116
    unsigned long long v3;  // 4102

    v0 = *a0;
    v1 = v0 ^ 0x8000000000000000;
    v2 = arm64g_calculate_condition(0x44, v0, 0, 0);
    if (!(v2 & 1))
        v1 = 1;
    if (!v1)
    {
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
    }
    else if (v1 == 1 && !v0)
    {
        return;
    }
}
