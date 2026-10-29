/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3bf08..0xb3bfe8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3bf08(unsigned long long a0, unsigned long long a1, long long a2, unsigned int a3)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // w23
    unsigned long long v4;  // x0
    unsigned long long v5;  // w8
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(a1 >> 2 & 1))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = (unsigned int)sub_a1750c(a0, a2);
        v4 = sub_9ffdd0(a0);
        if (!v4)
        {
            return v4;
        }
        else if (sub_a1abcc() == 1172 == a3)
        {
            if (!v3)
                v5 = 0;
            else
                v5 = !((unsigned int)a1 & 3);
            if (a1 & 3 && v3)
                v5 = sub_a17360(a0, a2, (unsigned int)a1 & 1) != 0;
            v6 = !((unsigned int)a1 & 128) & v5;
            if (!(a1 >> 7 & 1))
            {
                return v6;
            }
            else if (v5)
            {
                return sub_a17584(a0, a2) != 0;
            }
            else
            {
                return v6;
            }
        }
        else
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
}
