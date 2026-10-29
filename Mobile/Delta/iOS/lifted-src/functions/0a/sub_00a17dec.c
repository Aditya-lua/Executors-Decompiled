/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa17dec..0xa17ea0 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a17dec(long long a0, long long a1, long long a2)
{
    long long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char v2;  // [bp-0x2c]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = 0;
    if (sub_9ca8cc(0, &v3, &v2, &v0, a0))
    {
        v1 = sub_a17c40(v0, a1, a2);
        if (v1)
        {
            if (sub_a16104(&v1, &v3, v2))
                return v1;
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_backend.c", 825, "ossl_ec_key_from_pkcs8");
            sub_a36abc(16, 142, 0);
        }
        sub_a18c08();
    }
    return 0;
}
