/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a2fc..0xb4a44c (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b4a2fc(long long *a0, char a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    long long v3;  // x20
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    char v0;  // [bp-0x51]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    v3 = *a0;
    v4 = sub_a58104(v3, a0 + 5, a0[4], 0);
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_a58164(v3, a0 + 13, a0[4]);
    if (!(unsigned int)v5)
        return v5;
    v6 = sub_a58164(v3, &v0, 1);
    if (!(unsigned int)v6)
        return v6;
    if (a2 && a3)
    {
        v7 = sub_a58164(v3, a2, a3);
        if (!(unsigned int)v7)
            return v7;
    }
    if (a4 && a5)
    {
        v8 = sub_a58164(v3, a4, a5);
        if (!(unsigned int)v8)
            return v8;
    }
    if (a6 && a7)
    {
        v9 = sub_a58164(v3, a6, a7);
        if (!(unsigned int)v9)
            return v9;
    }
    v10 = sub_a58170(v3, a0 + 5, 0, 64);
    if (!(unsigned int)v10)
        return v10;
    v11 = sub_a58104(v3, a0 + 5, a0[4], 0);
    if (!(unsigned int)v11)
        return v11;
    v12 = sub_a58164(v3, a0 + 13, a0[4]);
    if (!(unsigned int)v12)
        return v12;
    return sub_a58170(v3, a0 + 13, 0, 64) != 0;
}
