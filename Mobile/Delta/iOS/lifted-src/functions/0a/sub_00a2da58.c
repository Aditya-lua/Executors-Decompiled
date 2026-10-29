/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2da58..0xa2db38 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a2da58(long long a0, unsigned long a1, long long *a2)
{
    long long v3;  // x21
    long long v4;  // x22
    long long v5;  // x0
    long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if ((int)a2[1])
    {
LABEL_a2da84:
        if (!a0)
        {
            v5 = sub_a6820c(*a2, 11);
            if (!v5)
                return v5;
        }
        if (!sub_aa57f0())
            v0 = 0;
        return v0;
    }
    if (a2[2])
    {
        v3 = sub_a68f38(*a2);
        v4 = a2[2];
        if (!_strchr(v4, 58))
        {
            _strlen(v4);
            if (v3)
            {
LABEL_a2db04:
                if (sub_a69060(v3, v4))
                    goto LABEL_a2da84;
            }
        }
        else if (v3)
        {
            goto LABEL_a2db04;
        }
    }
    return 0;
}
