/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38ba0..0xb38cec (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b38ba0(long long a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v4;  // x0
    unsigned int v5;  // w8
    unsigned int v6;  // w0
    unsigned int v7;  // x0
    unsigned int v8;  // w0
    unsigned int v0;  // [bp-0x40]
    unsigned int v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a2f9e0();
    if (!(unsigned int)v4)
    {
        return v4;
    }
    else if ((unsigned int)a1 & 7)
    {
        if (!(a1 >> 2 & 1))
        {
            v5 = 1;
        }
        else
        {
            if (a2 == 1)
                v6 = sub_9fdc64(a0);
            else
                v6 = sub_9fdec4(a0);
            v5 = v6 != 0;
        }
        v7 = !((unsigned int)a1 & 2) & v5;
        if (a1 >> 1 & 1 && v5)
        {
            v0 = 0;
            v1 = 0;
            sub_9ffd58(a0, &v0, 0);
            if (!v0)
            {
                v8 = 0;
            }
            else if (sub_9febfc(a0))
            {
                v8 = sub_9fe4e4(a0);
            }
            else
            {
                v8 = sub_9fe338(a0);
            }
            v7 = v8 != 0;
        }
        if (a1 & 1)
        {
            if (v7)
            {
                v1 = 0;
                v0 = 0;
                sub_9ffd58(a0, 0, &v0);
                if (v0)
                    v7 = sub_9fe518(a0) != 0;
                else
                    v7 = 0;
            }
            else
            {
                return v7;
            }
        }
        if (~((unsigned int)a1 & 3))
        {
            return v7;
        }
        else if (v7)
        {
            return sub_9fe628(a0, 0) != 0;
        }
        else
        {
            return v7;
        }
    }
    else
    {
        return 1;
    }
}
