/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20908..0xa20a94 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a20908(long long *a0, long long a1, long long a2, long long a3, unsigned long long a4)
{
    unsigned long long v2;  // x25
    unsigned long long v3;  // x19
    unsigned long long v4;  // x20
    unsigned long long v5;  // x0
    unsigned long long v6;  // x26
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a4;
    sub_9e6c64(a0[15]);
    a0[15] = 0;
    sub_9e48d4(a0[16]);
    v3 = 0;
    a0[16] = 0;
    if (!v2)
    {
        v2 = sub_9dddcc(a0[21]);
        v3 = v2;
        if (!v2)
            return 0;
    }
    v4 = sub_9e6c04();
    if (!v4)
    {
LABEL_a209e8:
        v7 = 0;
    }
    else if (sub_9e6cc0(v4, a1, v2))
    {
        v5 = sub_9e4958();
        if (!v5)
            goto LABEL_a209e8;
        v6 = v5;
        if (sub_9e5ca4(v6, sub_9e4624(), v4, v2))
        {
            a0[15] = v4;
            a0[16] = v6;
            v7 = sub_a271e4(a0, a1, a2, a3, v2);
            if ((unsigned int)v7)
            {
                v4 = 0;
            }
            else
            {
                sub_9e6c64(a0[15]);
                a0[15] = 0;
                sub_9e48d4(a0[16]);
                v4 = 0;
                a0[16] = 0;
            }
        }
        else
        {
            v7 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_mont.c", 166, "ossl_ec_GFp_mont_group_set_curve");
        sub_a36abc(16, 0x80003, 0);
        v7 = 0;
    }
    sub_9e48d4();
    sub_9dded4(v3);
    sub_9e6c64(v4);
    return v7;
}
