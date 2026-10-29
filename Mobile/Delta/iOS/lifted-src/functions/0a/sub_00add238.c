/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadd238..0xadd398 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_add238(long long a0, unsigned long long a1, long long a2, long long a3)
{
    long long v2;  // x23
    long long v3;  // x24
    unsigned long long v4;  // x25
    unsigned long long v5;  // w0
    unsigned long v6;  // x26
    long long v7;  // x0
    long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x21
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad7a7c(a2);
    v3 = sub_c4ba8(a0);
    if ((int)sub_ad69e4(v3) >= 1)
    {
        v4 = 0;
        do
        {
            v5 = (unsigned int)sub_add5a8(a0, sub_ad69f8(v3, v4), v2, 1);
            v6 = !v5;
        } while (!v5 && (v4 = (unsigned int)v4 + 1, (int)v4 < (int)sub_ad69e4(v3)));
    }
    else
    {
        v6 = 1;
    }
    v7 = sub_c4c40(sub_9ffdd0(a0));
    sub_ad7abc(v2);
    if (v6 & 1)
        return 0;
    v8 = sub_9ffdd0(a0);
    v9 = sub_af2760(v8);
    if (!(unsigned int)v9)
        return v9;
    v10 = sub_af2ebc(v7, a1, a2);
    sub_af2768(v8);
    if (v10)
    {
        if ((unsigned int)a1 == 2)
        {
            v11 = sub_af31e0(a3, *(long long *)(v10 + 8));
            if (!(unsigned int)v11)
                return v11;
            sub_af99a8(*(long long *)(v10 + 8));
            return v11;
        }
        else if ((unsigned int)a1 == 1)
        {
            v11 = sub_af317c(a3, *(long long *)(v10 + 8));
            if (!(unsigned int)v11)
                return v11;
            sub_afc404(*(long long *)(v10 + 8));
            return v11;
        }
    }
    return 0;
}
