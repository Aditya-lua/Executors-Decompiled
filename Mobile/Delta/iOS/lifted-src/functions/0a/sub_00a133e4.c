/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa133e4..0xa134e8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a133e4(long long a0, long long *a1, long long a2)
{
    long long v2;  // x19
    long long v3;  // x20
    long long v4;  // x24
    long long v5;  // x0
    long long v6;  // x23
    long long v7;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a1[5])
        return 1;
    v2 = a2;
    if (!sub_a1b4f4())
    {
        if (v2)
        {
            v3 = 0;
        }
        else
        {
            v2 = sub_9dde10();
            v3 = v2;
            if (!v3)
                return 0;
        }
        sub_9de064(v2);
        v4 = sub_9de208(v2);
        v5 = sub_9de208(v2);
        if (v5 && !(v6 = v5, !sub_a1b3cc(a0, a1, v4, v6, v2) || !sub_9e4c34(a1[2], v4) || !sub_9e4c34(a1[3], v6) || (v7 = 1, !sub_9e4d58(a1[4], 1))))
            *(unsigned int *)&a1[5] = 1;
        else
            v7 = 0;
        sub_9de17c(v2);
        sub_9dded4(v3);
        return v7;
    }
    return 1;
}
