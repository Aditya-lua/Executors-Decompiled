/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa17ea0..0xa17f88 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a17ea0(long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x20
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a2)
        {
            v2 = 0;
LABEL_a17f18:
            v3 = sub_a186bc();
            if (a1 && (int)v3 >= 1)
            {
                if (!sub_a186b4(v3))
                    v3 = 0;
                else
                    v3 &= 0xffffffff;
            }
            sub_9dded4(v2);
            return v3;
        }
        v2 = sub_9dddcc(0);
        if (v2)
            goto LABEL_a17f18;
        sub_a368c8(a0);
        sub_a369bc("crypto/ec/ec_check.c", 33, "EC_GROUP_check_named_curve");
        v4 = 524291;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_check.c", 26, "EC_GROUP_check_named_curve");
        v4 = 786690;
    }
    sub_a36abc(16, v4, 0);
    return 0;
}
