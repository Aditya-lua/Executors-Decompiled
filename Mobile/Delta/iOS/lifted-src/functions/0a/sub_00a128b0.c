/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa128b0..0xa12978 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a128b0(unsigned long a0, long long a1)
{
    long long v2;  // x20
    long long v3;  // x0
    long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = 0;
LABEL_a128e4:
        sub_9de064(a1);
        v3 = sub_9de208(a1);
        if (!v3 || !sub_9e1d7c())
            goto LABEL_a12950;
        v4 = !sub_9e4828(v3);
    }
    else
    {
        a1 = sub_9dde10();
        v2 = a1;
        if (a1)
            goto LABEL_a128e4;
        sub_a368c8();
        sub_a369bc("crypto/ec/ec2_smpl.c", 189, "ossl_ec_GF2m_simple_group_check_discriminant");
        sub_a36abc(16, 0x80003, 0);
LABEL_a12950:
        v4 = 0;
    }
    sub_9de17c(a1);
    sub_9dded4(v2);
    return v4;
}
