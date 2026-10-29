/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96ca2c..0x96cb2c (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_96ca2c(long long a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af1e94(a2);
    if (a3)
    {
        if (v2)
        {
            sub_a59d18();
            if (!a0)
                goto LABEL_96cac8;
LABEL_96ca74:
            if (!sub_959e54(a0, 0x60010))
                return 399;
        }
        else
        {
            if (a0)
                goto LABEL_96ca74;
LABEL_96cac8:
            if (!sub_959e7c(a1, 0x60010))
                return 399;
        }
    }
    else
    {
        if (v2)
        {
            sub_a59d18();
            if (!a0)
                goto LABEL_96caf8;
LABEL_96caa8:
            if (!sub_959e54(a0))
                return 397;
        }
        else
        {
            if (a0)
                goto LABEL_96caa8;
LABEL_96caf8:
            if (!sub_959e7c(a1))
                return 397;
        }
    }
    return 1;
}
