/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa52760..0xa527e4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a52760(long long *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(19, v2, 1, 0);
    if (!(v3 & 1))
    {
        /* unsupported instruction */;
    }
    else if ((int)v2 > 1)
    {
        return;
    }
    sub_a6c2e4(a0[1], "crypto/evp/exchange.c", 162);
    sub_a78ccc(a0[3]);
    sub_a6c2e4();
    return;
}
