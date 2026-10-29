/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb46e6c..0xb46ff0 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b46e6c(unsigned long a0, long long a1)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    unsigned int v12;  // w0
    unsigned int v4;  // w0
    unsigned int v5;  // w0
    unsigned int v6;  // w0
    unsigned int v7;  // w0
    unsigned int v8;  // w0
    unsigned int v9;  // w0
    unsigned int v10;  // w0
    unsigned int v11;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "state"))
    {
        v2 = sub_a6fe3c();
        if (!v2)
            return v2;
    }
    if (sub_a6fbc4(a1, "strength"))
    {
        v3 = sub_a6fe3c();
        if (!v3)
            return v3;
    }
    if (sub_a6fbc4(a1, "min_entropylen"))
    {
        v4 = sub_a70efc();
        if (!v4)
            return v4;
    }
    if (sub_a6fbc4(a1, "max_entropylen"))
    {
        v5 = sub_a70efc();
        if (!v5)
            return v5;
    }
    if (sub_a6fbc4(a1, "min_noncelen"))
    {
        v6 = sub_a70efc();
        if (!v6)
            return v6;
    }
    if (sub_a6fbc4(a1, "max_noncelen"))
    {
        v7 = sub_a70efc();
        if (!v7)
            return v7;
    }
    if (sub_a6fbc4(a1, "max_perslen"))
    {
        v8 = sub_a70efc();
        if (!v8)
            return v8;
    }
    if (sub_a6fbc4(a1, "max_adinlen"))
    {
        v9 = sub_a70efc();
        if (!v9)
            return v9;
    }
    if (sub_a6fbc4(a1, "reseed_requests"))
    {
        v10 = sub_a70210();
        if (!v10)
            return v10;
    }
    if (sub_a6fbc4(a1, "reseed_time"))
    {
        v11 = sub_a705f4();
        if (!v11)
            return v11;
    }
    if (sub_a6fbc4(a1, "reseed_time_interval"))
    {
        v12 = sub_a705f4();
        if (!v12)
            return v12;
    }
    return 1;
}
