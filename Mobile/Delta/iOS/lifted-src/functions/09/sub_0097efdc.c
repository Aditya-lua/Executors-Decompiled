/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97efdc..0x97f060 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_97f060;

void sub_97efdc(long long *a0)
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
    sub_ad93e4(a0 + 2);
    sub_a66c58(*a0, &g_97f060);
    sub_a66664(*a0);
}
