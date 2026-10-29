/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80554..0xa80680 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a80554(void* a0)
{
    unsigned long v3;  // x0
    unsigned long v4;  // x20
    unsigned long v5;  // x0
    unsigned long v7;  // x21
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!(long long)a0[176])
    {
        v3 = sub_a6bf4c(32, "crypto/ml_dsa/ml_dsa_key.c", 476);
        *(unsigned long *)&a0[176] = v3;
        if (!v3)
        {
            return v3;
        }
        else if (0 >= (int)sub_aa845c(*(long long *)a0, v3, 32, 0))
        {
            sub_a6c2e4((long long)a0[176], "crypto/ml_dsa/ml_dsa_key.c", 479);
            *(unsigned long long *)&a0[176] = 0;
            return 0;
        }
    }
    v4 = (long long)a0[168];
    *(unsigned long long *)&a0[168] = 0;
    v5 = sub_a80680(a0);
    if (!v4)
        return v5;
    if (!(unsigned int)v5)
    {
LABEL_a805e8:
        v7 = 0;
    }
    else if (_memcmp((long long)a0[168], v4, *(long long *)((long long)a0[8] + 64)))
    {
        sub_a368c8(sub_a7fbd8(a0));
        sub_a369bc("crypto/ml_dsa/ml_dsa_key.c", 494, "ossl_ml_dsa_generate_key");
        v0 = *(long long *)(long long)a0[8];
        sub_a36abc(57, 158, "explicit %s private key does not match seed");
        goto LABEL_a805e8;
    }
    else
    {
        v7 = 1;
    }
    sub_a6c4e8(v4, *(long long *)((long long)a0[8] + 64), "crypto/ml_dsa/ml_dsa_key.c", 498);
    return v7;
}
