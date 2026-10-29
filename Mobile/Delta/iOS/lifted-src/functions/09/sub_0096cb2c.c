/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96cb2c..0x96cc84 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_96cb2c(unsigned long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2)
    {
        v2 = 0;
    }
    else
    {
        a2 = sub_ad69f8(a1, 0);
        if (!a2)
            return 786691;
        v2 = 1;
    }
    if (sub_af1e94(a2))
        sub_a59d18();
    if (a0)
    {
        if (!sub_959e54(a0, 0x60010))
            return 399;
    }
    else
    {
        if (!sub_959e7c(0, 0x60010))
            return 399;
    }
    if ((int)v2 < (int)sub_ad69e4(a1))
    {
        do
        {
            if (!sub_af1e94(sub_ad69f8(a1, v2), v2))
            {
                if (!a0)
                    goto LABEL_96cc28;
                goto LABEL_96cbd8;
            }
            else
            {
                sub_a59d18();
                if (a0)
                {
LABEL_96cbd8:
                    if (!sub_959e54(a0))
                        return 397;
                }
                else
                {
LABEL_96cc28:
                    if (!sub_959e7c(0))
                        return 397;
                }
            }
        } while ((v2 = (unsigned int)v2 + 1, (int)sub_ad69e4(a1) > (int)v2));
    }
    return 1;
}
