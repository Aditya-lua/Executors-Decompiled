/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaf27c..0xaaf370 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aaf27c(long long a0)
{
    long long v5;  // x19
    long long v7;  // x1
    long long v8;  // x0
    long long *v0;  // [bp-0x38]
    int v1;  // [bp-0x2c]
    char v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!sub_9ca8cc(0, &v2, &v1, &v0, a0))
        return 0;
    v5 = sub_aadf44(0, &v2, v1);
    if (!v5)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_backend.c", 690, "ossl_rsa_key_from_pkcs8");
        sub_a36abc(4, 0x80004, 0);
        return v5;
    }
    else if (sub_aaf0d0(v5, v0))
    {
        sub_ab1ca0(v5, 0xf000);
        switch ((unsigned int)sub_a99eac(*v0))
        {
        case 912:
            v7 = 0x1000;
            v8 = v5;
            break;
        case 6:
            v7 = 0;
            v8 = v5;
            break;
        default:
            return v5;
        }
        sub_ab1cbc(v8, v7);
        return v5;
    }
    else
    {
        sub_ab1360(v5);
        return 0;
    }
}
