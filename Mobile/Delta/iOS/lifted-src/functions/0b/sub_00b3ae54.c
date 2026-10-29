/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ae54..0xb3af9c (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3ae54(long long a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v2;  // x0
    unsigned int v3;  // x0
    long long v4;  // x19
    unsigned int v5;  // x8
    unsigned long long v6;  // x0
    unsigned int v7;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if ((unsigned int)a1 & 135)
    {
        v3 = sub_9dddcc(sub_a19700(a0));
        if (!v3)
            return v3;
        v4 = v3;
        if (!(a1 >> 2 & 1))
        {
            v5 = 1;
            if (a1 >> 1 & 1)
                goto LABEL_b3aefc;
        }
        else
        {
            v6 = sub_a198e8(a0);
            sub_9ffdd0(a0);
            if (!(v6 >> 13 & 1))
            {
                v5 = sub_a17f88() != 0;
                if (a1 >> 1 & 1)
                    goto LABEL_b3aefc;
            }
            else
            {
                v5 = (int)sub_a17ea0() > 0;
                if (a1 >> 1 & 1)
                {
LABEL_b3aefc:
                    if (a2 == 1)
                    {
                        if (!v5)
                            goto LABEL_b3af30;
                        v7 = sub_a1916c(a0, v4);
                        goto LABEL_b3af28;
                    }
                    else if (v5)
                    {
                        v7 = sub_a19308(a0, v4);
LABEL_b3af28:
                        v5 = v7 != 0;
                    }
                }
            }
        }
LABEL_b3af30:
        if (a1 & 1)
        {
            if (!v5)
                goto LABEL_b3af78;
            v5 = sub_a1941c(a0) != 0;
        }
        if (!~(a1 & 3))
        {
            if (v5)
            {
                v5 = sub_a194c4(a0, v4) != 0;
            }
            else
            {
LABEL_b3af78:
                v5 = 0;
            }
        }
        sub_9dded4(v4);
        return v5;
    }
    else
    {
        return 1;
    }
}
