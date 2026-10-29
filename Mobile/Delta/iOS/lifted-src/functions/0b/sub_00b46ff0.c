/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb46ff0..0xb47088 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b46ff0(unsigned long a0, unsigned long long *a1, unsigned int *a2)
{
    unsigned long long v2;  // w0
    unsigned long long v3;  // x22
    unsigned long long v4;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "max_request"))
    {
        v2 = (unsigned int)sub_a70efc();
        if (!v2)
            return v2;
        v3 = 1;
    }
    else
    {
        v3 = 0;
    }
    if (sub_a6fbc4(a1, "reseed_counter"))
    {
        v4 = (unsigned int)sub_a70210();
        if (!v4)
            return v4;
        v3 += 1;
    }
    *a2 = !*(long long *)((char *)a1 + (unsigned int)v3 * 40);
    return 1;
}
