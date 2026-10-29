/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41d10..0xb41e18 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b41d10(unsigned long long a0, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    long long v2;  // x24
    unsigned int v3;  // w0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x21
    unsigned long long v6;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ab1c98();
    v3 = sub_a2f9e0(v2);
    if (!((unsigned int)a1 & 131))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v3)
    {
        v4 = sub_a6ee78();
        if (!v4)
            return v4;
        v5 = v4;
        if (!(a1 >> 7 & 1) || sub_ab8c18(v2))
        {
            v6 = 1;
            if ((unsigned int)a1 & 3)
                goto LABEL_b41d84;
        }
        else
        {
            v6 = sub_aae854(v2, v5, 0) != 0;
            if (a1 & 3)
            {
LABEL_b41d84:
                if (!v6)
                {
                    sub_a6eed4(v5);
                    return 0;
                }
                v6 = sub_aae6d8(a0, v5, 0, (unsigned int)a1 & 1) != 0;
            }
        }
        if (!v6)
        {
            sub_a6eed4(v5);
            return 0;
        }
        else if (sub_a6f570(v5))
        {
            a2();
        }
        else
        {
            sub_a6eed4(v5);
            return 0;
        }
    }
    else
    {
        return 0;
    }
}
