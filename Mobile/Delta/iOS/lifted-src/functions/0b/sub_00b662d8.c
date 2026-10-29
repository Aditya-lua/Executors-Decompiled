/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb662d8..0xb663b4 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b662d8(unsigned long long *a0)
{
    unsigned long long i;  // x21
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 0;
    while (i != a0[2])
    {
        i += 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v3 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v3 & 1))
        {
            /* unsupported instruction */;
            sub_b86ac8();
        }
    }
    if (!*a0)
        return;
    _free();
    return;
}
