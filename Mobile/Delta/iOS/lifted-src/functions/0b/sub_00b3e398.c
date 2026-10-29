/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e398..0xb3e53c (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3e398(long long a0, long long a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v12;  // x0
    long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    long long v4;  // x0
    unsigned long long v5;  // x0
    long long v6;  // x0
    unsigned long long v7;  // x0
    long long v8;  // x21
    long long v9;  // x22
    unsigned long long v10;  // x0
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "bits");
    if (v2)
    {
        v3 = sub_a6fe3c(v2, sub_a80940(a0) * 8);
        if (!(unsigned int)v3)
            return v3;
    }
    v4 = sub_a6fbc4(a1, "security-bits");
    if (v4)
    {
        v5 = sub_a6fe3c(v4, sub_a8094c(a0));
        if (!(unsigned int)v5)
            return v5;
    }
    v6 = sub_a6fbc4(a1, "max-size");
    if (v6)
    {
        v7 = sub_a6fe3c(v6, sub_a80964(a0));
        if (!(unsigned int)v7)
            return v7;
    }
    v8 = sub_a01e1c(a0);
    v9 = sub_a8002c(a0);
    if (sub_a7f878(a0) && sub_a6fbc4(a1, "seed"))
    {
        v10 = sub_a715c0();
        if (!(unsigned int)v10)
            return v10;
    }
    if (v9)
    {
        v11 = sub_a6fbc4(a1, "priv");
        if (v11)
        {
            v12 = sub_a715c0(v11, v9, sub_a80958(a0));
            if (!(unsigned int)v12)
                return v12;
        }
    }
    if (v8)
    {
        v13 = sub_a6fbc4(a1, "pub");
        if (v13)
        {
            v14 = sub_a715c0(v13, v8, sub_a80940(a0));
            if (!(unsigned int)v14)
                return v14;
        }
    }
    if (sub_a6fbc4(a1, "mandatory-digest"))
    {
        v15 = sub_a71468();
        if (!(unsigned int)v15)
            return v15;
    }
    return 1;
}
