/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe71b0..0xbe7278 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_be71b0(unsigned long long *a0)
{
    unsigned long v2;  // x20
    unsigned long long i;  // x21
    long long *v4;  // x23
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    if (a0[3] != v2)
    {
        i = 0;
        do
        {
            v4 = v2 + i * 16;
            i += 1;
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
            if (v4[1])
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v6 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v6 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90(v4[1]);
                }
            }
        } while (i != a0[3] - v2 >> 4);
    }
    if (!a0[2])
        return;
}
