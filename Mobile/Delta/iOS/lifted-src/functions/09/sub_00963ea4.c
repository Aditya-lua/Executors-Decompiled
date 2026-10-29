/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x963ea4..0x963f58 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_963ea4(unsigned int *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x20
    unsigned long v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0;
    v9 = *a0;
    if ((unsigned int)v9)
    {
        if (v9 >> 7 & 1)
        {
            v8 = sub_980dc8(v8);
            if (!v8)
                return v8;
        }
        else
        {
            return 0;
        }
    }
    if (!sub_959e54(v8, 0x40007, sub_a59d18(a1), 0, a1))
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 0x1d95, "SSL_set0_tmp_dh_pkey");
        sub_a36abc(20, 394, 0);
        return 0;
    }
    sub_a5a4c8(*(long long *)(*(long long *)(v8 + 2176) + 8));
    *(long long *)(*(long long *)(v8 + 2176) + 8) = a1;
    return 1;
}
