/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa13f5c..0xa14034 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a13f5c(long long a0, long long a1)
{
    unsigned long v8;  // x0
    unsigned long v9;  // x0
    unsigned long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    long long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    char v4;  // [bp-0x2c]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = 0;
    v0 = 0;
    v1 = 0;
    v8 = sub_afbf48(&v1, &v0, a1);
    if (!(unsigned int)v8)
        return v8;
    v9 = sub_afbf08(0, &v5, &v4, &v2, a1);
    if (!(unsigned int)v9)
        return v9;
    v3 = sub_a17c40(v2, v1, v0);
    if (!v3)
    {
        return v3;
    }
    else if (sub_a16778(&v3, &v5, v4))
    {
        sub_a5ab14(a0, 408, v3);
        return 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_ameth.c", 0x77, "eckey_pub_decode");
        sub_a36abc(16, 142, 0);
        sub_a18c08(v3);
        return 0;
    }
}
