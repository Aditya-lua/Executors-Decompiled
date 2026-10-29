/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9bfb0..0xa9c07c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a9bfb0(unsigned long a0, unsigned long long a1, unsigned int a2, char *a3)
{
    unsigned long long len;  // x0
    long long v4;  // x20
    unsigned long long v5;  // x23
    unsigned long long v6;  // x0
    unsigned long long v7;  // x22
    unsigned short *iter;  // x20
    unsigned long v9;  // x23
    unsigned long v10;  // x23
    char *v11;  // x19
    unsigned long v0;  // [bp-0x50], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    len = _strlen();
    v4 = a0 + len;
    v5 = 0x400 - len;
    v0 = a1;
    v6 = sub_9d5b44(v4, (int)v5, "DEK-Info: %s,");
    if ((int)v6 < 1)
        return v6;
    v7 = v5 - v6;
    iter = v4 + (v6 & 0xffffffff);
    if ((int)a2 >= 1)
    {
        v9 = a2;
        do
        {
            v10 = v9;
            v11 = a3 + 1;
            v0 = *a3;
            v6 = sub_9d5b44(iter, (int)v7, "%02X");
            if ((int)v6 < 1)
                return v6;
        } while ((v7 -= v6, iter = (char *)iter + (v6 & 0xffffffff), v9 = v10 - 1, a3 = v11, v10 != 1));
    }
    if ((int)v7 <= 1)
        return v6;
    *iter = 10;
    return v6;
}
