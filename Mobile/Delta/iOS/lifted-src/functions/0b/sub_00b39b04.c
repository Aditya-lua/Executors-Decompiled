/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb39b04..0xb39c64 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b39b04(unsigned long a0, long long a1)
{
    unsigned long v4;  // x0
    unsigned long v5;  // x0
    unsigned long v6;  // x0
    unsigned long v7;  // x0
    unsigned long v8;  // x0
    unsigned long v9;  // x0
    unsigned long v10;  // x0
    unsigned long v11;  // x0
    unsigned long v12;  // x0
    unsigned long v13;  // x0
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a6fbc4(a1, "bits");
    if (v4)
    {
        v5 = sub_a6fe3c(v4, sub_9ffc20(a0));
        if (!(unsigned int)v5)
            return v5;
    }
    v6 = sub_a6fbc4(a1, "security-bits");
    if (v6)
    {
        v7 = sub_a6fe3c(v6, sub_a021ac(a0));
        if (!(unsigned int)v7)
            return v7;
    }
    v8 = sub_a6fbc4(a1, "max-size");
    if (v8)
    {
        v9 = sub_a6fe3c(v8, sub_a03744(a0));
        if (!(unsigned int)v9)
            return v9;
    }
    if (sub_a6fbc4(a1, "default-digest"))
    {
        v10 = sub_a71468();
        if (!(unsigned int)v10)
            return v10;
    }
    v11 = sub_a6116c(sub_12738(a0), 0, a1);
    if (!(unsigned int)v11)
        return v11;
    v0 = 0;
    v1 = 0;
    if (!a0)
        return 0;
    sub_a02134(a0, &v0, &v1);
    if (v1)
    {
        v12 = sub_a6fa7c(0, a1, "priv");
        if (!(unsigned int)v12)
            return v12;
    }
    if (!v0)
        return 1;
    v13 = sub_a6fa7c(0, a1, "pub");
    if (!(unsigned int)v13)
        return v13;
    return 1;
}
