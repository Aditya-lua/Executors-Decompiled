/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaac82c..0xaaca2c (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aac82c(long long a0, unsigned long a1, long long *a2, unsigned long a3)
{
    unsigned long v7;  // x20
    long long v8;  // x0
    unsigned int v9;  // w0
    unsigned long v10;  // x20
    long long v11;  // x1
    long long v12;  // x20
    long long v13;  // x21
    unsigned long v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    unsigned int v3;  // [bp-0x3c]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a1;
    v4 = a1;
    v1 = 0;
    v2 = 0;
    if (sub_a99eac(*a2) != 912)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ameth.c", 551, "ossl_rsa_pss_to_ctx");
        sub_a36abc(4, 155, 0);
        return 0xffffffff;
    }
    v8 = sub_aaefc4(a2);
    *(unsigned int *)&v0 = 0;
    if (!sub_aaf01c(v8, &v1, &v2, &v3, &v0))
    {
LABEL_aac940:
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ameth.c", 558, "ossl_rsa_pss_to_ctx");
        v11 = 149;
        goto LABEL_aac964;
    }
    if ((int)v3 < 0)
    {
        v12 = 150;
        v13 = 596;
        goto LABEL_aac914;
    }
    if ((unsigned int)v0 != 1)
    {
        v12 = 139;
        v13 = 604;
LABEL_aac914:
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ameth.c", v13, "rsa_pss_verify_param");
        sub_a36abc(4, v12, 0);
        goto LABEL_aac940;
    }
    if (a3)
    {
        if (!sub_a56ed8(a0, &v4, v1, 0, a3))
            goto LABEL_aac96c;
        v7 = v4;
LABEL_aac9c0:
        if ((int)sub_ab2224(v7, 6) < 1)
            goto LABEL_aac96c;
        v10 = 0xffffffff;
        if ((int)sub_ab243c(v4, v3) >= 1)
        {
            if ((int)sub_ab229c(v4, v2) < 1)
                v10 = 0xffffffff;
            else
                v10 = 0;
        }
    }
    else
    {
        if ((int)sub_a5e05c(v7, &v0) >= 1)
        {
            v9 = sub_9c7b68(v1);
            if (v9 == sub_9c7b68(v0))
                goto LABEL_aac9c0;
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_ameth.c", 571, "ossl_rsa_pss_to_ctx");
            v11 = 158;
LABEL_aac964:
            sub_a36abc(4, v11, 0);
        }
LABEL_aac96c:
        v10 = 0xffffffff;
    }
    sub_aadf28(v8);
    return v10;
}
