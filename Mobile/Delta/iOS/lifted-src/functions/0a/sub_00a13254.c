/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa13254..0xa133e4 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a13254(long long a0, long long *a1, long long *a2, long long a3)
{
    long long v2;  // x19
    long long v3;  // w0
    unsigned long long v12;  // x21
    long long v4;  // w0
    long long v6;  // x20
    long long v7;  // x25
    long long v8;  // x24
    long long v9;  // x27
    long long v10;  // x0
    long long v11;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = (unsigned int)sub_a1b4f4();
    v4 = (unsigned int)sub_a1b4f4(a0, a2);
    if (v3)
        return !v4;
    if (v4)
        return 1;
    if (!(int)a1[5] || !(int)a2[5])
    {
        if (v2)
        {
            v6 = 0;
        }
        else
        {
            v2 = sub_9dde10();
            v6 = v2;
            if (!v6)
                return 0xffffffff;
        }
        sub_9de064(v2);
        v7 = sub_9de208(v2);
        v8 = sub_9de208(v2);
        v9 = sub_9de208(v2);
        v10 = sub_9de208(v2);
        if (v10 && !(v11 = v10, !sub_a1b3cc(a0, a1, v7, v8, v2) || !sub_a1b3cc(a0, a2, v9, v11, v2)))
        {
            if (sub_9e5528(v7, v9))
                v12 = 1;
            else
                v12 = sub_9e5528(v8, v11) != 0;
        }
        else
        {
            v12 = 0xffffffff;
        }
        sub_9de17c(v2);
        sub_9dded4(v6);
        return v12;
    }
    else if (!sub_9e5528(a1[2], a2[2]))
    {
        return sub_9e5528(a1[3], a2[3]) != 0;
    }
    return 1;
}
