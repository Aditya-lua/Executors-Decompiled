/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20b48..0xa20c60 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a20b48(long long *a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x20
    long long v3;  // x0
    long long v4;  // x24
    long long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0[15])
        return 0;
    if (a3)
    {
        v2 = 0;
    }
    else
    {
        a3 = sub_9dde48(a0[21]);
        v2 = a3;
        if (!v2)
            return 0;
    }
    sub_9de064(a3);
    v3 = sub_9de208(a3);
    if (!v3 || (v4 = v3, !sub_9e4d58() || !sub_9db58c(v4, a0[8], v4) || !sub_9defb0(a1, a2, v4, a0[8], a3, a0[15])))
    {
LABEL_a20c24:
        v5 = 0;
    }
    else if (sub_9e4828(a1))
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_mont.c", 0xff, "ossl_ec_GFp_mont_field_inv");
        sub_a36abc(16, 165, 0);
        goto LABEL_a20c24;
    }
    else
    {
        v5 = 1;
    }
    sub_9de17c(a3);
    sub_9dded4(v2);
    return v5;
}
