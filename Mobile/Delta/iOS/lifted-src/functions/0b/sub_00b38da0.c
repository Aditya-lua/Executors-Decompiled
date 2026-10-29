/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38da0..0xb38e84 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b38da0(unsigned int a0, unsigned int a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v2;  // w0
    unsigned int v3;  // x0
    long long v4;  // x19
    unsigned int v5;  // w0
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
        v3 = sub_a6ee78();
        if (!v3)
            return v3;
        v4 = v3;
        if (a1 & 132)
        {
            v5 = sub_9fd864(a0, v4, 0);
            if (!(a1 & 3))
                goto LABEL_b38e34;
            if (!v5)
            {
                sub_a6eed4(v4);
                return 0;
            }
        }
        else if (!(a1 & 3))
        {
            goto LABEL_b38e38;
        }
        v5 = sub_9fd8d8(a0, v4, 0, a1 & 1);
LABEL_b38e34:
        if (!v5)
        {
            sub_a6eed4(v4);
            return 0;
        }
LABEL_b38e38:
        if (!sub_a6f570(v4))
        {
            sub_a6eed4(v4);
            return 0;
        }
        a2();
    }
    else
    {
        return 0;
    }
}
