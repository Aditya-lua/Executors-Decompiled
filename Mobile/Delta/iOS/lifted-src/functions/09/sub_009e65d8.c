/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e65d8..0x9e66ec (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e65d8(long long a0, long long a1, unsigned long long a2, long long a3)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x0
    unsigned int v4;  // w23
    unsigned int v5;  // w0
    unsigned long long v6;  // w8
    unsigned long long v7;  // 4116
    unsigned long v8;  // x22
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    if (a0 != a1)
    {
        v3 = sub_9e4c34(a0);
        if (!v3)
            return v3;
    }
    if (1 > (int)v2)
        return 1;
    do
    {
        v4 = sub_9e46a8(a3);
        v5 = sub_9e46a8(a0);
        v6 = v4 - v5;
        v7 = arm64g_calculate_condition(67, v4, v5, 0);
        if (v7 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/bn/bn_mod.c", 307, "BN_mod_lshift_quick");
            sub_a36abc(3, 110, 0);
            return 0;
        }
        if (v6 < (unsigned int)v2)
            v8 = v6;
        else
            v8 = v2 & 0xffffffff;
        if (v4 == v5)
        {
            v9 = sub_9ea45c(a0, a0);
            if (!(unsigned int)v9)
                return v9;
            v2 = (unsigned int)v2 - 1;
        }
        else
        {
            v10 = sub_9ea668(a0, a0, v8);
            if (!(unsigned int)v10)
                return v10;
            v2 -= v8;
        }
        if (!(sub_9e5528(a0, a3) >> 31 & 1))
        {
            v11 = sub_9db58c(a0, a0, a3);
            if (!(unsigned int)v11)
                return v11;
        }
    } while ((int)v2 > 0);
    return 1;
}
