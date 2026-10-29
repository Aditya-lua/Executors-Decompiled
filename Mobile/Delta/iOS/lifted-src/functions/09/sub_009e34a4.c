/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e34a4..0x9e35f4 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e34a4(long long a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long v3;  // x0
    long long v4;  // x24
    unsigned int v5;  // w0
    unsigned long v6;  // x25
    unsigned long v7;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_9e4828(a2))
    {
        if (sub_9e5b58(a2, 1))
            return sub_9e4c34(a0, a1) != 0;
        sub_9de064(a4);
        v3 = sub_9de208(a4);
        if (v3 && !(v4 = v3, !sub_9e1d7c()))
        {
            v5 = sub_9e46a8(a2);
            if ((int)v5 >= 2)
            {
                v6 = v5 - 1;
                do
                {
                    if (!sub_9e253c(v4, v4, a3, a4) || !(v6 = (unsigned int)v6 - 1, !sub_9e5748(a2, v6) || sub_9e227c(v4, v4, a1, a3, a4)))
                        goto LABEL_9e35b4;
                } while ((int)v6 > 0);
            }
            v7 = sub_9e4c34(a0, v4) != 0;
        }
        else
        {
LABEL_9e35b4:
            v7 = 0;
        }
        sub_9de17c(a4);
        return v7;
    }
}
