/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41c24..0xb41cfc (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b41c24(unsigned long long a0, unsigned long long a1, long long a2)
{
    unsigned long long v3;  // w0
    unsigned int v4;  // w0
    long long v5;  // x23
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = (unsigned int)sub_a2f9e0();
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
        v4 = sub_ab1cb0(a0, 0xf000);
        if (a1 >> 7 & 1)
        {
            v5 = sub_ab1c98(a0);
            v6 = sub_aae9d0(v5, &v0, a2, sub_c4c40(a0));
            if (!(unsigned int)v6)
            {
                return v6;
            }
            else if (v4 != 0x1000)
            {
                v7 = sub_ab8c18(v5);
                if (!(unsigned int)v7)
                    return v7;
            }
        }
        if (!(a1 & 3))
            return !((unsigned int)a1 & 3);
        return sub_aae01c(a0, a2, (unsigned int)a1 & 1) != 0;
    }
    else
    {
        return 0;
    }
}
