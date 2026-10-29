/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2a8d0..0xc2a9cc (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_c2a8d0(unsigned long long *a0)
{
    unsigned long long v2;  // x21
    unsigned long long *i;  // x0
    long long *v4;  // x26
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    for (i = a0; a0[2] != v2; i = sub_c2636c(v4 + 1))
    {
        v4 = a0[1] + 72 * v2;
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
            sub_b86a90(*v4);
        }
    }
    if (!*a0)
        return i;
    return _free();
}
