/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a15c..0xb4a268 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b4a15c(void* a0, long long a1)
{
    void* v3;  // x22
    unsigned long v4;  // x0
    unsigned long v5;  // x0
    unsigned long v6;  // x0
    unsigned long v7;  // x0
    unsigned long v8;  // x8
    unsigned long v9;  // x0
    unsigned int v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (long long)a0[240];
    v0 = 0;
    v4 = sub_b46ff0();
    if (!(unsigned int)v4)
        return v4;
    if (v0)
        return 1;
    if (*(long long *)a0)
    {
        v5 = sub_a7c17c(*(long long *)a0);
        if (!(unsigned int)v5)
            return v5;
    }
    v6 = sub_a6fbc4(a1, "mac");
    if (v6)
    {
        if (*(long long *)v3)
        {
            v7 = sub_a71468(v6, sub_c4ba8(sub_954340(*(long long *)v3)));
            if (!(unsigned int)v7)
                goto LABEL_b4a22c;
        }
        else
        {
            v7 = 0;
            v8 = *(long long *)a0;
            if (!*(long long *)a0)
                return 0;
LABEL_b4a234:
            sub_a7c1b4(v8);
            return v7;
        }
    }
    v9 = sub_a6fbc4(a1, "digest");
    if (v9)
    {
        v7 = sub_954340(v3 + 8);
        if (v7)
        {
            v7 = sub_a71468(v9, sub_a50a58());
            if ((unsigned int)v7)
                goto LABEL_b4a220;
        }
    }
    else
    {
LABEL_b4a220:
        v7 = sub_b46e6c(a0, a1);
    }
LABEL_b4a22c:
    v8 = *(long long *)a0;
    if (!*(long long *)a0)
        return v7;
    goto LABEL_b4a234;
}
