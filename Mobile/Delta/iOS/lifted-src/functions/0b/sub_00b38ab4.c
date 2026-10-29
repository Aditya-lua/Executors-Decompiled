/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38ab4..0xb38ba0 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b38ab4(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x0
    unsigned int v3;  // x22
    unsigned int v5;  // x0
    long long v7;  // x0
    long long v8;  // x0
    unsigned long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    if (a2 & 3)
    {
        if (a2 >> 1 & 1)
        {
            v3 = sub_9ffde0(a0);
            if (v3 && sub_9ffde0(a1))
                goto LABEL_b38b40;
        }
        if (!(a2 & 1))
        {
            v5 = 0;
        }
        else
        {
            v3 = sub_9ffdd8(a0);
            v5 = 0;
            if (v3 && sub_9ffdd8(a1))
            {
LABEL_b38b40:
                v5 = !sub_9e5528(v3);
            }
        }
    }
    else
    {
        v5 = 1;
    }
    if (!(a2 >> 2 & 1))
        return v5;
    v7 = sub_12738(a0);
    v8 = sub_12738(a1);
    if (!v5)
        return 0;
    v9 = sub_a610f8(v7, v8, 1) != 0;
    return v9;
}
