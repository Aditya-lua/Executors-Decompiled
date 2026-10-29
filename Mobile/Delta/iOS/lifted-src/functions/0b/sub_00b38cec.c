/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38cec..0xb38d74 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b38cec(unsigned int a0, unsigned int a1, long long a2)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    unsigned int v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(a1 & 7))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_9fd724(a0, a2);
        if (!v3)
            v4 = 0;
        else
            v4 = !(a1 & 3);
        if (!(a1 & 3))
        {
            return v4;
        }
        else if (v3)
        {
            return sub_9fd798(a0, a2, a1 & 1) != 0;
        }
        else
        {
            return v4;
        }
    }
    else
    {
        return 0;
    }
}
