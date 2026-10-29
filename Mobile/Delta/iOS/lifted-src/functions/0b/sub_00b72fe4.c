/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb72fe4..0xb73064 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b72fe4(unsigned long long *a0)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x20
    unsigned long long v4;  // x20
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    while (1)
    {
        v3 = v2;
        if (v3 == a0[2])
            break;
        v4 = v3 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v2 = v4;
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)(a0[1] + v3 * 16 + 8));
            v2 = v4;
        }
    }
    if (!*a0)
        return;
}
