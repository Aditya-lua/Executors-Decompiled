/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96e8d4..0x96e9a4 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_96e8d4(unsigned int *a0, unsigned int *a1, long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned int v5;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6e200(a2, "RSA");
    if ((unsigned int)v2)
    {
        v2 = sub_a6e200(a2, "RSA-PSS");
        if ((unsigned int)v2 && !(v2 = sub_a6e200(a2, "PSS"), !(unsigned int)v2))
        {
            v2 = sub_a6e200(a2, "DSA");
            if ((unsigned int)v2)
            {
                v2 = sub_a6e200(a2, "ECDSA");
                if ((unsigned int)v2)
                {
                    v3 = sub_a998f4(a2);
                    *a1 = v3;
                    if ((unsigned int)v3)
                        return v3;
                    v4 = sub_a99a1c(a2);
                    *a1 = v4;
                    return v4;
                }
                v5 = 408;
            }
            else
            {
                v5 = 116;
            }
        }
        else
        {
            v5 = 912;
        }
    }
    else
    {
        v5 = 6;
    }
    *a0 = v5;
    return v2;
}
