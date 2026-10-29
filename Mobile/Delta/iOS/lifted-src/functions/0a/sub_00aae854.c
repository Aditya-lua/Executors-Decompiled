/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaae854..0xaae9d0 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aae854(long long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x24
    unsigned long v12;  // x22
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v4;  // x22
    long long v5;  // x0
    unsigned int v6;  // w0
    unsigned int v7;  // w0
    unsigned int v8;  // w25
    unsigned long long v9;  // x0
    unsigned long v10;  // x23
    unsigned long v11;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_ab8c18())
        return 1;
    v2 = sub_ab8ca8(a0);
    v3 = sub_ab8cbc(a0);
    v4 = sub_ab8cd0(a0);
    v5 = sub_ab8ce4(a0);
    v6 = sub_ab8ca8(0);
    v7 = sub_ab8cbc(0);
    v8 = sub_ab8cd0(0);
    v9 = v2;
    v10 = 0;
    if ((unsigned int)v9 != v6)
        v10 = sub_ab8f24(v9);
    if ((unsigned int)v3 == v7)
    {
        v11 = 0;
        if ((unsigned int)v4 == v8)
            goto LABEL_aae94c;
LABEL_aae924:
        v12 = sub_ab8f24(v4);
        if (v10)
            goto LABEL_aae954;
    }
    else
    {
        v11 = sub_ab8f24(v3);
        if ((unsigned int)v4 != v8)
            goto LABEL_aae924;
LABEL_aae94c:
        v12 = 0;
        if (v10)
        {
LABEL_aae954:
            v13 = sub_a6f90c(a1, a2, "digest", v10);
            if (!(unsigned int)v13)
                return v13;
        }
    }
    if (v11)
    {
        v14 = sub_a6f90c(a1, a2, "mgf", v11);
        if (!(unsigned int)v14)
            return v14;
    }
    if (v12)
    {
        v15 = sub_a6f90c(a1, a2, "mgf1-digest", v12);
        if (!(unsigned int)v15)
            return v15;
    }
    v16 = sub_a6f85c(a1, a2, "saltlen", v5);
    if (!(unsigned int)v16)
        return v16;
    return 1;
}
