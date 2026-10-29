/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01490..0xa01568 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a01490(long long a0, long long a1, long long a2)
{
    long long v4;  // x0
    long long v5;  // x0
    long long v0;  // [bp-0x40]
    long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (a0)
    {
        if (a2)
            v4 = sub_a6fbc4(a1, "priv");
        else
            v4 = 0;
        v5 = sub_a6fbc4(a1, "pub");
        if (v4 || v5)
        {
            if (v5 && !sub_a70f20())
            {
                v1 = 0;
            }
            else if (!v4)
            {
LABEL_a0151c:
                if (sub_a02150(a0, v0))
                    goto LABEL_a0152c;
            }
            else if (sub_a70f20(v4, &v1))
            {
                goto LABEL_a0151c;
            }
            sub_9e4838(v1);
            sub_9e48d4(v0);
            a0 = 0;
        }
        else
        {
LABEL_a0152c:
            a0 = 1;
        }
    }
    return a0;
}
