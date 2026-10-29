/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb78eac..0xb78f10 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_b78eac(long long *a0, unsigned long long a1)
{
    unsigned long long v2;  // x21
    long long *v3;  // x0
    unsigned long long v4;  // x21
    unsigned long long v5;  // x21
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = a0;
    while (1)
    {
        v4 = v2;
        if (v4 == a1)
            break;
        v5 = v4 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v6 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v2 = v5;
        if (!(v6 & 1))
        {
            /* unsupported instruction */;
            v3 = sub_b86a90(a0[v4]);
            v2 = v5;
        }
    }
    return v3;
}
