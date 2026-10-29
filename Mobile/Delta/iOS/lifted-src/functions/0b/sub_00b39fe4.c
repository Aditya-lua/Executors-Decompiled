/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb39fe4..0xb3a138 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b39fe4(unsigned int a0, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v4;  // w0
    unsigned int v5;  // x0
    long long v6;  // x19
    unsigned int v7;  // w0
    unsigned int v8;  // w8
    unsigned int v0;  // [bp-0x50]
    unsigned int v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a2f9e0();
    if (!((unsigned int)a1 & 7))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v4)
    {
        v5 = sub_a6ee78();
        if (!v5)
            return v5;
        v6 = v5;
        if ((unsigned int)a1 & 132)
        {
            v7 = sub_a6116c(sub_12738(a0), v6, 0);
            v8 = v7 != 0;
            if (!((unsigned int)a1 & 3))
                goto LABEL_b3a0dc;
            if (v7)
                goto LABEL_b3a074;
        }
        else if ((unsigned int)a1 & 3)
        {
LABEL_b3a074:
            v0 = 0;
            v1 = 0;
            sub_a02134(a0, &v0, &v1);
            if (!(a1 & 1) || !v1 || sub_a6fa7c(v6, 0, "priv"))
            {
                if (v0 && !sub_a6fa7c(v6, 0, "pub"))
                {
                    v8 = 0;
LABEL_b3a0dc:
                    if (v8)
                        goto LABEL_b3a0e0;
                }
                else if (1)
                {
                    goto LABEL_b3a0e0;
                }
            }
            else
            {
                if (0)
                    goto LABEL_b3a0e0;
            }
        }
        else
        {
LABEL_b3a0e0:
            if (sub_a6f570(v6))
                a2();
        }
        sub_a6eed4(v6);
        return 0;
    }
    else
    {
        return 0;
    }
}
