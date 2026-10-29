/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e93e0..0x9e953c (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e93e0(long long a0, unsigned long a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x23
    unsigned int v4;  // w24
    unsigned long long v5;  // w0
    unsigned int v6;  // w24
    unsigned long long v7;  // 4113
    long long v8;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_rand.c", 248, "ossl_bn_priv_rand_range_fixed_top");
        v8 = 786690;
    }
    else if (*(int *)(a1 + 16) || sub_9e4828(a1))
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_rand.c", 253, "ossl_bn_priv_rand_range_fixed_top");
        v8 = 115;
    }
    else
    {
        v2 = sub_9e46a8(a1);
        if ((unsigned int)v2 == 1)
        {
            sub_9e5b4c(a0);
            return 1;
        }
        v3 = v2;
        sub_9e5d14(a0, 4);
        v4 = 0xffffff9c;
        while (1)
        {
            v5 = (unsigned int)sub_9e8eec(2, a0, (unsigned int)v3 + 1, 0, 0, a2, a3);
            if (!v5)
                return v5;
            v6 = v4 + 1;
            v7 = arm64g_calculate_condition(33, v4, 1, 0);
            if (v7 & 1)
                break;
            sub_9e5778(a0, v3);
            v4 = v6;
            if (sub_9e53a8(a0, a1) >> 31 & 1)
                return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_rand.c", 271, "ossl_bn_priv_rand_range_fixed_top");
        v8 = 113;
    }
    sub_a36abc(3, v8, 0);
    return 0;
}
