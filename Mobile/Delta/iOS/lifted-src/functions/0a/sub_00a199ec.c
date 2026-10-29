/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa199ec..0xa19a8c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a199ec(long long *a0, long long a1, unsigned long long a2)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // 4125
    unsigned long v4;  // x8
    unsigned long long v5;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a1ab64(a0[3]);
    v3 = arm64g_calculate_condition(177, v2, 7, 0);
    if (v3 & 1)
        v4 = v2 + 14;
    else
        v4 = v2 + 7;
    if (a0[5])
    {
        if (!a1)
        {
            return (long long)(v4 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v4, 61) & 0xe00000001fffffff & 0x1fffffff;
        }
        else if (a2 >= ((long long)(v4 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v4, 61) & 0x1fffffff))
        {
            v5 = arm64g_calculate_condition(0x11, sub_9e5174() & 0xffffffff, 1, 0);
            if (v5 & 1)
                return (long long)(v4 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v4, 61) & 0xe00000001fffffff & 0x1fffffff;
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_key.c", 967, "ossl_ec_key_simple_priv2oct");
            sub_a36abc(16, 100, 0);
        }
    }
    return 0;
}
