/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaba29c..0xaba388 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aba29c(long long *a0, long long a1)
{
    long long v2;  // x20
    long long v3;  // x0
    long long v4;  // x22
    long long v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9de064(a1);
    v2 = sub_9de208(a1);
    v3 = sub_9de208(a1);
    if (v3)
    {
        v4 = v3;
        sub_9e5d14();
        if (!sub_9e4d58(v4, 2) || !sub_9dea6c(v2, v4, a0[6], a0[5], a1) || !sub_9dea6c(v2, v2, a0[7], a0[5], a1) || sub_9e5528(v4, v2))
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_sp800_56b_gen.c", 454, "ossl_rsa_sp800_56b_pairwise_test");
            sub_a36abc(4, 177, 0);
            goto LABEL_aba360;
        }
        else
        {
            v5 = 1;
        }
    }
    else
    {
LABEL_aba360:
        v5 = 0;
    }
    sub_9de17c(a1);
    return v5;
}
