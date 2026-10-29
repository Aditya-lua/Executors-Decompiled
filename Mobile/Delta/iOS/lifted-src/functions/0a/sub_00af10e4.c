/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf10e4..0xaf12a0 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af10e4(int *a0, int a1, unsigned long long *a2, unsigned long a3, long long a4, unsigned long long a5, unsigned long long a6)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long long v17;  // x0
    unsigned long long v18;  // x8
    char v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!*(long long *)&a0[2])
    {
        return 0;
    }
    else if (*a0)
    {
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = v15;
        v7 = &v9;
        v8 = v16;
        if (a1 >= 1)
        {
            if (a0[1] != a1)
            {
                return 0;
            }
            else if (a1 == 22)
            {
                a2();
            }
            else if (*a0 == (unsigned int)a5)
            {
                v17 = !_memcmp(*(long long *)&a0[2], a4, a5);
                if (!a6)
                {
                    return v17;
                }
                else if ((int)v17 >= 1)
                {
                    v18 = sub_a6da14(*(long long *)&a0[2], *a0, "crypto/x509/v3_utl.c", 840);
                    *(unsigned long long *)a6 = v18;
                    if (v18)
                        return v17;
                }
                else
                {
                    return v17;
                }
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (!(sub_9c3fc4(&v0, a0) >> 31 & 1))
                a2();
        }
        return 0xffffffff;
    }
    else
    {
        return 0;
    }
}
