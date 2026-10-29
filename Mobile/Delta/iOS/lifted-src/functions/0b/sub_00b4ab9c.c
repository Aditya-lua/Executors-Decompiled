/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ab9c..0xb4ac20 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b4ab9c(unsigned long a0, long long a1)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    unsigned int v4;  // w0
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
    if (sub_a6fbc4(a1, "max_request"))
    {
        v4 = sub_a70efc();
        if (!v4)
            return v4;
    }
    return 1;
}
