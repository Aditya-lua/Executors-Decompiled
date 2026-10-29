/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ad14..0xb3ae54 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b3ad14(long long a0, long long a1, unsigned long long a2)
{
    long long v2;  // x25
    unsigned int v3;  // x24
    unsigned int v12;  // w0
    unsigned int v4;  // x0
    long long v5;  // x19
    unsigned int v6;  // x20
    unsigned int v7;  // x25
    unsigned int v9;  // w8
    unsigned int v10;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd0();
    v3 = sub_9ffdd0(a1);
    if (!sub_a2f9e0(v3))
        return 0;
    v4 = sub_9dddcc(sub_a19700(a0));
    if (v4)
    {
        v5 = v4;
        if (!(a2 >> 2 & 1))
        {
            v6 = 1;
        }
        else
        {
            v6 = 0;
            if (v2 && v3)
                v6 = !sub_a1adc4(v2, v3, v5);
        }
        if (a2 & 3)
        {
            if (!(a2 >> 1 & 1))
            {
LABEL_b3adac:
                if (!(a2 & 1))
                {
                    v9 = 0;
                }
                else
                {
                    v10 = sub_962b90(a0);
                    v9 = 0;
                    if (v10 && sub_962b90(a1))
                    {
                        if (v6)
                        {
                            v12 = sub_9e5528(v10);
LABEL_b3ae20:
                            v6 = !v12;
                        }
LABEL_b3ae28:
                        v9 = 1;
                    }
                }
            }
            else
            {
                v7 = sub_975ff4(a0);
                if (!v7 || !sub_975ff4(a1))
                    goto LABEL_b3adac;
                if (v6)
                {
                    v12 = sub_a1afd8(v3, v7);
                    goto LABEL_b3ae20;
                }
                goto LABEL_b3ae28;
            }
            v6 &= v9;
        }
        sub_9dded4(v5);
        return v6;
    }
    return 0;
}
